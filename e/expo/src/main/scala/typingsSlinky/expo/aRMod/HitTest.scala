package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitTest extends js.Object {
  var anchor: Anchor = js.native
  var distance: Double = js.native
  var localTransform: js.Array[Double] = js.native
  var `type`: Double = js.native
  var worldTransform: js.Array[Double] = js.native
}

object HitTest {
  @scala.inline
  def apply(
    anchor: Anchor,
    distance: Double,
    localTransform: js.Array[Double],
    `type`: Double,
    worldTransform: js.Array[Double]
  ): HitTest = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], localTransform = localTransform.asInstanceOf[js.Any], worldTransform = worldTransform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTest]
  }
  @scala.inline
  implicit class HitTestOps[Self <: HitTest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalTransform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorldTransform(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldTransform")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

