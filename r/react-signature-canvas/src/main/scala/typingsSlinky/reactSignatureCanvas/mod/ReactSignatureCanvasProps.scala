package typingsSlinky.reactSignatureCanvas.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsSlinky.react.mod.CanvasHTMLAttributes
import typingsSlinky.signaturePad.mod.SignaturePad.SignaturePadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSignatureCanvasProps extends SignaturePadOptions {
  var canvasProps: js.UndefOr[CanvasHTMLAttributes[HTMLCanvasElement]] = js.native
  var clearOnResize: js.UndefOr[Boolean] = js.native
}

object ReactSignatureCanvasProps {
  @scala.inline
  def apply(): ReactSignatureCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSignatureCanvasProps]
  }
  @scala.inline
  implicit class ReactSignatureCanvasPropsOps[Self <: ReactSignatureCanvasProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanvasProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasProps")(js.undefined)
        ret
    }
    @scala.inline
    def withClearOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnResize")(js.undefined)
        ret
    }
  }
  
}

