package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLFrameBase extends js.Object {
  @JSName("MSHTML.IHTMLFrameBase_typekey")
  var MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase = js.native
  var border: js.Any = js.native
  var frameBorder: String = js.native
  var frameSpacing: js.Any = js.native
  var marginHeight: js.Any = js.native
  var marginWidth: js.Any = js.native
  var name: String = js.native
  var noResize: Boolean = js.native
  var scrolling: String = js.native
  var src: String = js.native
}

object IHTMLFrameBase {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLFrameBase_typekey: IHTMLFrameBase,
    border: js.Any,
    frameBorder: String,
    frameSpacing: js.Any,
    marginHeight: js.Any,
    marginWidth: js.Any,
    name: String,
    noResize: Boolean,
    scrolling: String,
    src: String
  ): IHTMLFrameBase = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], frameBorder = frameBorder.asInstanceOf[js.Any], frameSpacing = frameSpacing.asInstanceOf[js.Any], marginHeight = marginHeight.asInstanceOf[js.Any], marginWidth = marginWidth.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noResize = noResize.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLFrameBase_typekey")(MSHTMLDotIHTMLFrameBase_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLFrameBase]
  }
  @scala.inline
  implicit class IHTMLFrameBaseOps[Self <: IHTMLFrameBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLFrameBase_typekey(value: IHTMLFrameBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLFrameBase_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameSpacing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMarginWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marginWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

