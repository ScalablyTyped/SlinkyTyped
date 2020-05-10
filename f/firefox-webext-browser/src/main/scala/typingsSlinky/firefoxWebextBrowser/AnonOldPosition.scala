package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOldPosition extends js.Object {
  var oldPosition: Double = js.native
  var oldWindowId: Double = js.native
}

object AnonOldPosition {
  @scala.inline
  def apply(oldPosition: Double, oldWindowId: Double): AnonOldPosition = {
    val __obj = js.Dynamic.literal(oldPosition = oldPosition.asInstanceOf[js.Any], oldWindowId = oldWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldPosition]
  }
  @scala.inline
  implicit class AnonOldPositionOps[Self <: AnonOldPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOldPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldWindowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

