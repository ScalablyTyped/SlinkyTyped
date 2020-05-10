package typingsSlinky.pdfjsDist.mod

import org.scalajs.dom.raw.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFRenderParams extends js.Object {
  var canvasContext: CanvasRenderingContext2D = js.native
  var continueCallback: js.UndefOr[js.Function1[/* _continue */ js.Function0[Unit], Unit]] = js.native
  var imageLayer: js.UndefOr[PDFRenderImageLayer] = js.native
  var textLayer: js.UndefOr[PDFRenderTextLayer] = js.native
  var viewport: js.UndefOr[PDFPageViewport] = js.native
}

object PDFRenderParams {
  @scala.inline
  def apply(canvasContext: CanvasRenderingContext2D): PDFRenderParams = {
    val __obj = js.Dynamic.literal(canvasContext = canvasContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRenderParams]
  }
  @scala.inline
  implicit class PDFRenderParamsOps[Self <: PDFRenderParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasContext(value: CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueCallback(value: /* _continue */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutContinueCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLayer(value: PDFRenderImageLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withTextLayer(value: PDFRenderTextLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withViewport(value: PDFPageViewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(js.undefined)
        ret
    }
  }
  
}

