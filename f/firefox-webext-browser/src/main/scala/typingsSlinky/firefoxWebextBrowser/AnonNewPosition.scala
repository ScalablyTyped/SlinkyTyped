package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewPosition extends js.Object {
  var newPosition: Double = js.native
  var newWindowId: Double = js.native
}

object AnonNewPosition {
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): AnonNewPosition = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewPosition]
  }
  @scala.inline
  implicit class AnonNewPositionOps[Self <: AnonNewPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewWindowId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindowId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

