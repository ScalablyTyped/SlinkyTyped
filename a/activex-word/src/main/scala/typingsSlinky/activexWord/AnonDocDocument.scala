package typingsSlinky.activexWord

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDocDocument extends js.Object {
  val Doc: Document = js.native
}

object AnonDocDocument {
  @scala.inline
  def apply(Doc: Document): AnonDocDocument = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocDocument]
  }
  @scala.inline
  implicit class AnonDocDocumentOps[Self <: AnonDocDocument] (val x: Self) extends AnyVal {
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
  }
  
}

