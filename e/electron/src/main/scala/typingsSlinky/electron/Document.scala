package typingsSlinky.electron

import typingsSlinky.electron.Electron.WebviewTag
import typingsSlinky.electron.electronStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  @JSName("createElement")
  def createElement_webview(tagName: webview): WebviewTag = js.native
}

object Document {
  @scala.inline
  def apply(createElement: webview => WebviewTag): Document = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement))
    __obj.asInstanceOf[Document]
  }
  @scala.inline
  implicit class DocumentOps[Self <: Document] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateElement(value: webview => WebviewTag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

