package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocHandled extends js.Object {
  val Doc: Document = js.native
  var Handled: Boolean = js.native
}

object DocHandled {
  @scala.inline
  def apply(Doc: Document, Handled: Boolean): DocHandled = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocHandled]
  }
  @scala.inline
  implicit class DocHandledOps[Self <: DocHandled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Handled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

