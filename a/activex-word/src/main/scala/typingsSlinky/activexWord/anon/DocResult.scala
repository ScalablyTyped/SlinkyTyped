package typingsSlinky.activexWord.anon

import typingsSlinky.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocResult extends js.Object {
  val Doc: Document = js.native
  val DocResult: Document = js.native
}

object DocResult {
  @scala.inline
  def apply(Doc: Document, DocResult: Document): DocResult = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], DocResult = DocResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocResult]
  }
  @scala.inline
  implicit class DocResultOps[Self <: DocResult] (val x: Self) extends AnyVal {
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
    def withDocResult(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

