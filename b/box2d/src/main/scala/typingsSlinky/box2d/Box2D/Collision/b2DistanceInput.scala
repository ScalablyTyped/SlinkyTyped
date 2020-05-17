package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2DistanceInput extends js.Object {
  /**
  		* Proxy A
  		**/
  var proxyA: b2DistanceProxy = js.native
  /**
  		* Proxy B
  		**/
  var proxyB: b2DistanceProxy = js.native
  /**
  		* Transform A
  		**/
  var transformA: b2Transform = js.native
  /**
  		* Transform B
  		**/
  var transformB: b2Transform = js.native
  /**
  		* Use shape radii in computation?
  		**/
  var useRadii: Boolean = js.native
}

object b2DistanceInput {
  @scala.inline
  def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    transformA: b2Transform,
    transformB: b2Transform,
    useRadii: Boolean
  ): b2DistanceInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], transformA = transformA.asInstanceOf[js.Any], transformB = transformB.asInstanceOf[js.Any], useRadii = useRadii.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceInput]
  }
  @scala.inline
  implicit class b2DistanceInputOps[Self <: b2DistanceInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxyA(value: b2DistanceProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProxyB(value: b2DistanceProxy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformA(value: b2Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformB(value: b2Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseRadii(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useRadii")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

