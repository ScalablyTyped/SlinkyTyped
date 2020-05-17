package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLRect extends js.Object {
  @JSName("MSHTML.IHTMLRect_typekey")
  var MSHTMLDotIHTMLRect_typekey: IHTMLRect = js.native
  var bottom: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
}

object IHTMLRect {
  @scala.inline
  def apply(MSHTMLDotIHTMLRect_typekey: IHTMLRect, bottom: Double, left: Double, right: Double, top: Double): IHTMLRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRect_typekey")(MSHTMLDotIHTMLRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRect]
  }
  @scala.inline
  implicit class IHTMLRectOps[Self <: IHTMLRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLRect_typekey(value: IHTMLRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLRect_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

