package typingsSlinky.cordovaPluginDialogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object, passed to promptCallback */
@js.native
trait NotificationPromptResult extends js.Object {
  /**
    * The index of the pressed button. Note that the index uses one-based indexing, so the value is 1, 2, 3, etc.
    * 0 is the result when the dialog is dismissed without a button press.
    */
  var buttonIndex: Double = js.native
  /** The text entered in the prompt dialog box. */
  var input1: String = js.native
}

object NotificationPromptResult {
  @scala.inline
  def apply(buttonIndex: Double, input1: String): NotificationPromptResult = {
    val __obj = js.Dynamic.literal(buttonIndex = buttonIndex.asInstanceOf[js.Any], input1 = input1.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationPromptResult]
  }
  @scala.inline
  implicit class NotificationPromptResultOps[Self <: NotificationPromptResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

