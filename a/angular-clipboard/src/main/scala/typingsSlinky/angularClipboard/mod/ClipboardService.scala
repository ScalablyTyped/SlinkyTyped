package typingsSlinky.angularClipboard.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClipboardService extends js.Object {
  /**
    * tells us whether or not angular-clipboard is supported
    */
  var supported: Boolean = js.native
  /**
    * copies text to a clipboard
    * @param text the text to be copied to the clipboard
    */
  def copyText(text: String): Unit = js.native
}

object ClipboardService {
  @scala.inline
  def apply(copyText: String => Unit, supported: Boolean): ClipboardService = {
    val __obj = js.Dynamic.literal(copyText = js.Any.fromFunction1(copyText), supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardService]
  }
  @scala.inline
  implicit class ClipboardServiceOps[Self <: ClipboardService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supported")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

