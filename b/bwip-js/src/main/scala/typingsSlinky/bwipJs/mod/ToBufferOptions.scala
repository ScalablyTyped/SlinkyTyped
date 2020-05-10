package typingsSlinky.bwipJs.mod

import typingsSlinky.bwipJs.bwipJsStrings.I
import typingsSlinky.bwipJs.bwipJsStrings.L
import typingsSlinky.bwipJs.bwipJsStrings.N
import typingsSlinky.bwipJs.bwipJsStrings.R
import typingsSlinky.bwipJs.bwipJsStrings.above
import typingsSlinky.bwipJs.bwipJsStrings.below
import typingsSlinky.bwipJs.bwipJsStrings.center
import typingsSlinky.bwipJs.bwipJsStrings.justify
import typingsSlinky.bwipJs.bwipJsStrings.left
import typingsSlinky.bwipJs.bwipJsStrings.offleft
import typingsSlinky.bwipJs.bwipJsStrings.offright
import typingsSlinky.bwipJs.bwipJsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToBufferOptions extends js.Object {
  var addontextfont: js.UndefOr[String] = js.native
  var addontextsize: js.UndefOr[Double] = js.native
  var addontextxoffset: js.UndefOr[Double] = js.native
  var addontextyoffset: js.UndefOr[Double] = js.native
  var alttext: js.UndefOr[Boolean] = js.native
  var backgroundcolor: js.UndefOr[String] = js.native
  var barcolor: js.UndefOr[String] = js.native
  var bcid: String = js.native
  var boraderbottom: js.UndefOr[Double] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderleft: js.UndefOr[Double] = js.native
  var borderright: js.UndefOr[Double] = js.native
  var bordertop: js.UndefOr[Double] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var guardheight: js.UndefOr[Double] = js.native
  var guardleftpos: js.UndefOr[Double] = js.native
  var guardleftypos: js.UndefOr[Double] = js.native
  var guardrightpos: js.UndefOr[Double] = js.native
  var guardrightypos: js.UndefOr[Double] = js.native
  var guardwhitespace: js.UndefOr[Boolean] = js.native
  var guardwidth: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var includecheck: js.UndefOr[Boolean] = js.native
  var includecheckintext: js.UndefOr[Boolean] = js.native
  var includetext: js.UndefOr[Boolean] = js.native
  var inkspread: js.UndefOr[Double] = js.native
  var inkspreadh: js.UndefOr[Double] = js.native
  var inkspreadv: js.UndefOr[Double] = js.native
  var monochrome: js.UndefOr[Boolean] = js.native
  var paddingheight: js.UndefOr[Double] = js.native
  var paddingwidth: js.UndefOr[Double] = js.native
  var parse: js.UndefOr[Boolean] = js.native
  var parsefunc: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[N | R | L | I] = js.native
  var scale: js.UndefOr[Double] = js.native
  var scaleX: js.UndefOr[Double] = js.native
  var scaleY: js.UndefOr[Double] = js.native
  var showborder: js.UndefOr[Boolean] = js.native
  var sizelimit: js.UndefOr[Double] = js.native
  var text: String = js.native
  var textcolor: js.UndefOr[String] = js.native
  var textfont: js.UndefOr[String] = js.native
  var textgaps: js.UndefOr[Double] = js.native
  var textsize: js.UndefOr[Double] = js.native
  var textxalign: js.UndefOr[offleft | left | center | right | offright | justify] = js.native
  var textxoffset: js.UndefOr[Double] = js.native
  var textyalign: js.UndefOr[below | center | above] = js.native
  var textyoffset: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ToBufferOptions {
  @scala.inline
  def apply(bcid: String, text: String): ToBufferOptions = {
    val __obj = js.Dynamic.literal(bcid = bcid.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToBufferOptions]
  }
  @scala.inline
  implicit class ToBufferOptionsOps[Self <: ToBufferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBcid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddontextfont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddontextfont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextfont")(js.undefined)
        ret
    }
    @scala.inline
    def withAddontextsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddontextsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextsize")(js.undefined)
        ret
    }
    @scala.inline
    def withAddontextxoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextxoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddontextxoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextxoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withAddontextyoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextyoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddontextyoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addontextyoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withAlttext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alttext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlttext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alttext")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBarcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBoraderbottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boraderbottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoraderbottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boraderbottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBordercolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordercolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderleft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderleft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderleft")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderright(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderright")(js.undefined)
        ret
    }
    @scala.inline
    def withBordertop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordertop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBordertop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordertop")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardheight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardheight")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardleftpos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardleftpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardleftpos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardleftpos")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardleftypos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardleftypos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardleftypos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardleftypos")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardrightpos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardrightpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardrightpos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardrightpos")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardrightypos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardrightypos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardrightypos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardrightypos")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardwhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardwhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardwhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardwhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withGuardwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludecheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includecheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludecheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includecheck")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludecheckintext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includecheckintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludecheckintext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includecheckintext")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludetext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includetext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludetext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includetext")(js.undefined)
        ret
    }
    @scala.inline
    def withInkspread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkspread")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkspread: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkspread")(js.undefined)
        ret
    }
    @scala.inline
    def withInkspreadh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkspreadh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkspreadh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkspreadh")(js.undefined)
        ret
    }
    @scala.inline
    def withInkspreadv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkspreadv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkspreadv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkspreadv")(js.undefined)
        ret
    }
    @scala.inline
    def withMonochrome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingheight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingheight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingheight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingheight")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withParsefunc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsefunc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsefunc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsefunc")(js.undefined)
        ret
    }
    @scala.inline
    def withRotate(value: N | R | L | I): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleX")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleY")(js.undefined)
        ret
    }
    @scala.inline
    def withShowborder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showborder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowborder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showborder")(js.undefined)
        ret
    }
    @scala.inline
    def withSizelimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizelimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizelimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizelimit")(js.undefined)
        ret
    }
    @scala.inline
    def withTextcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextfont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextfont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textfont")(js.undefined)
        ret
    }
    @scala.inline
    def withTextgaps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textgaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextgaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textgaps")(js.undefined)
        ret
    }
    @scala.inline
    def withTextsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textsize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextxalign(value: offleft | left | center | right | offright | justify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textxalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextxalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textxalign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextxoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textxoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextxoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textxoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withTextyalign(value: below | center | above): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textyalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextyalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textyalign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextyoffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textyoffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextyoffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textyoffset")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

