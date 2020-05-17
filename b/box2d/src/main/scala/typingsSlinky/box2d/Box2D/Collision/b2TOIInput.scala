package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Sweep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2TOIInput extends js.Object {
  /**
  		* Proxy A
  		**/
  var proxyA: b2DistanceProxy = js.native
  /**
  		* Proxy B
  		**/
  var proxyB: b2DistanceProxy = js.native
  /**
  		* Sweep A
  		**/
  var sweepA: b2Sweep = js.native
  /**
  		* Sweep B
  		**/
  var sweepB: b2Sweep = js.native
  /**
  		* Tolerance
  		**/
  var tolerance: Double = js.native
}

object b2TOIInput {
  @scala.inline
  def apply(
    proxyA: b2DistanceProxy,
    proxyB: b2DistanceProxy,
    sweepA: b2Sweep,
    sweepB: b2Sweep,
    tolerance: Double
  ): b2TOIInput = {
    val __obj = js.Dynamic.literal(proxyA = proxyA.asInstanceOf[js.Any], proxyB = proxyB.asInstanceOf[js.Any], sweepA = sweepA.asInstanceOf[js.Any], sweepB = sweepB.asInstanceOf[js.Any], tolerance = tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2TOIInput]
  }
  @scala.inline
  implicit class b2TOIInputOps[Self <: b2TOIInput] (val x: Self) extends AnyVal {
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
    def withSweepA(value: b2Sweep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSweepB(value: b2Sweep): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweepB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

