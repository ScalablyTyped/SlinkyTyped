package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasImageData extends js.Object {
  @JSName("MSHTML.ICanvasImageData_typekey")
  var MSHTMLDotICanvasImageData_typekey: ICanvasImageData = js.native
  val data: js.Any = js.native
  val height: Double = js.native
  val width: Double = js.native
}

object ICanvasImageData {
  @scala.inline
  def apply(MSHTMLDotICanvasImageData_typekey: ICanvasImageData, data: js.Any, height: Double, width: Double): ICanvasImageData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasImageData_typekey")(MSHTMLDotICanvasImageData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasImageData]
  }
  @scala.inline
  implicit class ICanvasImageDataOps[Self <: ICanvasImageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotICanvasImageData_typekey(value: ICanvasImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.ICanvasImageData_typekey")(value.asInstanceOf[js.Any])
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

