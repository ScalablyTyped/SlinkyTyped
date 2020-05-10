package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDoc extends js.Object {
  var Cancel: Boolean = js.native
  val Doc: Document = js.native
  val SaveAsUI: Boolean = js.native
}

object AnonDoc {
  @scala.inline
  def apply(Cancel: Boolean, Doc: Document, SaveAsUI: Boolean): AnonDoc = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Doc = Doc.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoc]
  }
  @scala.inline
  implicit class AnonDocOps[Self <: AnonDoc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveAsUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SaveAsUI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

