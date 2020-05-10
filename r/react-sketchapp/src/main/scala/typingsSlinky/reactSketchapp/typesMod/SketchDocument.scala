package typingsSlinky.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchDocument extends js.Object {
  def documentData(): SketchDocumentData = js.native
  def showMessage(message: String): Unit = js.native
}

object SketchDocument {
  @scala.inline
  def apply(documentData: () => SketchDocumentData, showMessage: String => Unit): SketchDocument = {
    val __obj = js.Dynamic.literal(documentData = js.Any.fromFunction0(documentData), showMessage = js.Any.fromFunction1(showMessage))
    __obj.asInstanceOf[SketchDocument]
  }
  @scala.inline
  implicit class SketchDocumentOps[Self <: SketchDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentData(value: () => SketchDocumentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShowMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMessage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

