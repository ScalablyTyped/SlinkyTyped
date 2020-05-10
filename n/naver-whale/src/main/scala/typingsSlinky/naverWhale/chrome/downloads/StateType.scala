package typingsSlinky.naverWhale.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateType extends js.Object {
  val COMPLETE: String = js.native
  val INTERRUPTED: String = js.native
  val IN_PROGRESS: String = js.native
}

object StateType {
  @scala.inline
  def apply(COMPLETE: String, INTERRUPTED: String, IN_PROGRESS: String): StateType = {
    val __obj = js.Dynamic.literal(COMPLETE = COMPLETE.asInstanceOf[js.Any], INTERRUPTED = INTERRUPTED.asInstanceOf[js.Any], IN_PROGRESS = IN_PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOMPLETE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERRUPTED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIN_PROGRESS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN_PROGRESS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

