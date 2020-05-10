package typingsSlinky.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFRenderTextLayer extends js.Object {
  def appendText(): Unit = js.native
  def beginLayout(): Unit = js.native
  def endLayout(): Unit = js.native
}

object PDFRenderTextLayer {
  @scala.inline
  def apply(appendText: () => Unit, beginLayout: () => Unit, endLayout: () => Unit): PDFRenderTextLayer = {
    val __obj = js.Dynamic.literal(appendText = js.Any.fromFunction0(appendText), beginLayout = js.Any.fromFunction0(beginLayout), endLayout = js.Any.fromFunction0(endLayout))
    __obj.asInstanceOf[PDFRenderTextLayer]
  }
  @scala.inline
  implicit class PDFRenderTextLayerOps[Self <: PDFRenderTextLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendText(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withBeginLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLayout")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

