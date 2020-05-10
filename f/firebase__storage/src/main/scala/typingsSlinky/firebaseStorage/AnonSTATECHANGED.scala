package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorageTypes.mod.TaskEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSTATECHANGED extends js.Object {
  var STATE_CHANGED: TaskEvent = js.native
}

object AnonSTATECHANGED {
  @scala.inline
  def apply(STATE_CHANGED: TaskEvent): AnonSTATECHANGED = {
    val __obj = js.Dynamic.literal(STATE_CHANGED = STATE_CHANGED.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSTATECHANGED]
  }
  @scala.inline
  implicit class AnonSTATECHANGEDOps[Self <: AnonSTATECHANGED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSTATE_CHANGED(value: TaskEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATE_CHANGED")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

