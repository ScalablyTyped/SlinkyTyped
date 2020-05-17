package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasImageData extends js.Object {
  @JSName("MSHTML.CanvasImageData_typekey")
  var MSHTMLDotCanvasImageData_typekey: CanvasImageData = js.native
  val data: js.Any = js.native
  val height: Double = js.native
  val width: Double = js.native
}

object CanvasImageData {
  @scala.inline
  def apply(MSHTMLDotCanvasImageData_typekey: CanvasImageData, data: js.Any, height: Double, width: Double): CanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CanvasImageData_typekey")(MSHTMLDotCanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageData]
  }
  @scala.inline
  implicit class CanvasImageDataOps[Self <: CanvasImageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotCanvasImageData_typekey(value: CanvasImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.CanvasImageData_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

