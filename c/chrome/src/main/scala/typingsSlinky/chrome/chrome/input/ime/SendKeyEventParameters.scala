package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendKeyEventParameters extends js.Object {
  /** ID of the context where the key events will be sent, or zero to send key events to non-input field. */
  var contextID: Double = js.native
  /** Data on the key event. */
  var keyData: js.Array[KeyboardEvent] = js.native
}

object SendKeyEventParameters {
  @scala.inline
  def apply(contextID: Double, keyData: js.Array[KeyboardEvent]): SendKeyEventParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendKeyEventParameters]
  }
  @scala.inline
  implicit class SendKeyEventParametersOps[Self <: SendKeyEventParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyData(value: js.Array[KeyboardEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

