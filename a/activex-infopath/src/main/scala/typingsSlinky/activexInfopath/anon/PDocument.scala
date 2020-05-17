package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath._XDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDocument extends js.Object {
  val pDocument: _XDocument = js.native
}

object PDocument {
  @scala.inline
  def apply(pDocument: _XDocument): PDocument = {
    val __obj = js.Dynamic.literal(pDocument = pDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDocument]
  }
  @scala.inline
  implicit class PDocumentOps[Self <: PDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPDocument(value: _XDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pDocument")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

