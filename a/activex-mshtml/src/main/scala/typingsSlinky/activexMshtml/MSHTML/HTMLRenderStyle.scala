package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLRenderStyle extends js.Object {
  @JSName("MSHTML.HTMLRenderStyle_typekey")
  var MSHTMLDotHTMLRenderStyle_typekey: HTMLRenderStyle = js.native
  var defaultTextSelection: String = js.native
  var renderingPriority: Double = js.native
  var textBackgroundColor: js.Any = js.native
  var textColor: js.Any = js.native
  var textDecoration: String = js.native
  var textDecorationColor: js.Any = js.native
  var textEffect: String = js.native
  var textLineThroughStyle: String = js.native
  var textUnderlineStyle: String = js.native
}

object HTMLRenderStyle {
  @scala.inline
  def apply(
    MSHTMLDotHTMLRenderStyle_typekey: HTMLRenderStyle,
    defaultTextSelection: String,
    renderingPriority: Double,
    textBackgroundColor: js.Any,
    textColor: js.Any,
    textDecoration: String,
    textDecorationColor: js.Any,
    textEffect: String,
    textLineThroughStyle: String,
    textUnderlineStyle: String
  ): HTMLRenderStyle = {
    val __obj = js.Dynamic.literal(defaultTextSelection = defaultTextSelection.asInstanceOf[js.Any], renderingPriority = renderingPriority.asInstanceOf[js.Any], textBackgroundColor = textBackgroundColor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any], textDecorationColor = textDecorationColor.asInstanceOf[js.Any], textEffect = textEffect.asInstanceOf[js.Any], textLineThroughStyle = textLineThroughStyle.asInstanceOf[js.Any], textUnderlineStyle = textUnderlineStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLRenderStyle_typekey")(MSHTMLDotHTMLRenderStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRenderStyle]
  }
  @scala.inline
  implicit class HTMLRenderStyleOps[Self <: HTMLRenderStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotHTMLRenderStyle_typekey(value: HTMLRenderStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.HTMLRenderStyle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTextSelection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTextSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderingPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBackgroundColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDecoration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextDecorationColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDecorationColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextEffect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLineThroughStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textLineThroughStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextUnderlineStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textUnderlineStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

