package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a message box. */
@js.native
trait XMessageBox extends js.Object {
  /** the caption text. */
  var CaptionText: String = js.native
  /** the message text. */
  var MessageText: String = js.native
  /**
    * shows the message box.
    * @returns one of {@link MessageBoxResults} .
    */
  def execute(): Double = js.native
}

object XMessageBox {
  @scala.inline
  def apply(CaptionText: String, MessageText: String, execute: () => Double): XMessageBox = {
    val __obj = js.Dynamic.literal(CaptionText = CaptionText.asInstanceOf[js.Any], MessageText = MessageText.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XMessageBox]
  }
  @scala.inline
  implicit class XMessageBoxOps[Self <: XMessageBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CaptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

