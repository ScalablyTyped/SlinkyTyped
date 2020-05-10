package typingsSlinky.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAngleAndHeight extends js.Object {
  var angleAndHeight: AnonEndPosition = js.native
  var distance: AnonEndPosition = js.native
}

object AnonAngleAndHeight {
  @scala.inline
  def apply(angleAndHeight: AnonEndPosition, distance: AnonEndPosition): AnonAngleAndHeight = {
    val __obj = js.Dynamic.literal(angleAndHeight = angleAndHeight.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngleAndHeight]
  }
  @scala.inline
  implicit class AnonAngleAndHeightOps[Self <: AnonAngleAndHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngleAndHeight(value: AnonEndPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angleAndHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistance(value: AnonEndPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

