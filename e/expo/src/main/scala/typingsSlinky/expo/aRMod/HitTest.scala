package typingsSlinky.expo.aRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitTest extends js.Object {
  var anchor: Anchor
  var distance: Double
  var localTransform: js.Array[Double]
  var `type`: Double
  var worldTransform: js.Array[Double]
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnchor(value: Anchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalTransform(value: js.Array[Double]): Self = this.set("localTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorldTransform(value: js.Array[Double]): Self = this.set("worldTransform", value.asInstanceOf[js.Any])
  }
  
}

