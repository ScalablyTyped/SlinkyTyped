package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLCanvasElement extends js.Object {
  @JSName("MSHTML.IHTMLCanvasElement_typekey")
  var MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement = js.native
  var height: Double = js.native
  var width: Double = js.native
  def getContext(contextId: String): ICanvasRenderingContext2D = js.native
  def toDataURL(`type`: String, jpegquality: js.Any): String = js.native
}

object IHTMLCanvasElement {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLCanvasElement_typekey: IHTMLCanvasElement,
    getContext: String => ICanvasRenderingContext2D,
    height: Double,
    toDataURL: (String, js.Any) => String,
    width: Double
  ): IHTMLCanvasElement = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction1(getContext), height = height.asInstanceOf[js.Any], toDataURL = js.Any.fromFunction2(toDataURL), width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLCanvasElement_typekey")(MSHTMLDotIHTMLCanvasElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLCanvasElement]
  }
  @scala.inline
  implicit class IHTMLCanvasElementOps[Self <: IHTMLCanvasElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLCanvasElement_typekey(value: IHTMLCanvasElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLCanvasElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetContext(value: String => ICanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToDataURL(value: (String, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDataURL")(js.Any.fromFunction2(value))
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

