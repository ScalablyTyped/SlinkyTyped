package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.Dtickrange
import typingsSlinky.plotlyJs.plotlyJsStrings.B
import typingsSlinky.plotlyJs.plotlyJsStrings.E
import typingsSlinky.plotlyJs.plotlyJsStrings.SI
import typingsSlinky.plotlyJs.plotlyJsStrings._empty
import typingsSlinky.plotlyJs.plotlyJsStrings.all
import typingsSlinky.plotlyJs.plotlyJsStrings.array
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.e_
import typingsSlinky.plotlyJs.plotlyJsStrings.first
import typingsSlinky.plotlyJs.plotlyJsStrings.fraction
import typingsSlinky.plotlyJs.plotlyJsStrings.inside
import typingsSlinky.plotlyJs.plotlyJsStrings.last
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.none
import typingsSlinky.plotlyJs.plotlyJsStrings.outside
import typingsSlinky.plotlyJs.plotlyJsStrings.pixels
import typingsSlinky.plotlyJs.plotlyJsStrings.power
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorBar extends js.Object {
  var bgcolor: Color = js.native
  var bordercolor: Color = js.native
  var borderwidth: Color = js.native
  var dtick: Double | String = js.native
  var exponentformat: none | e_ | E | power | SI | B = js.native
  var len: Double = js.native
  var lenmode: fraction | pixels = js.native
  var nticks: Double = js.native
  var outlinecolor: Color = js.native
  var outlinewidth: Double = js.native
  var separatethousands: Boolean = js.native
  var showexponent: all | first | last | none = js.native
  var showticklabels: Boolean = js.native
  var showtickprefix: all | first | last | none = js.native
  var showticksuffix: all | first | last | none = js.native
  var thickness: Double = js.native
  var thicknessmode: fraction | pixels = js.native
  var tick0: Double | String = js.native
  var tickangle: Double = js.native
  var tickcolor: Color = js.native
  var tickfont: Font = js.native
  var tickformat: String = js.native
  var tickformatstops: Dtickrange = js.native
  var ticklen: Double = js.native
  var tickmode: auto | linear | array = js.native
  var tickprefix: String = js.native
  var ticks: outside | inside | _empty = js.native
  var ticksuffix: String = js.native
  var ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = js.native
  var ticktextsrc: js.Any = js.native
  var tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray = js.native
  var tickvalssrc: js.Any = js.native
  var tickwidth: Double = js.native
  var title: String = js.native
  var titlefont: Font = js.native
  var titleside: right | top | bottom = js.native
  var x: Double = js.native
  var xanchor: left | center | right = js.native
  var xpad: Double = js.native
  var y: Double = js.native
  var yanchor: top | middle | bottom = js.native
  var ypad: Double = js.native
}

object ColorBar {
  @scala.inline
  def apply(
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Color,
    dtick: Double | String,
    exponentformat: none | e_ | E | power | SI | B,
    len: Double,
    lenmode: fraction | pixels,
    nticks: Double,
    outlinecolor: Color,
    outlinewidth: Double,
    separatethousands: Boolean,
    showexponent: all | first | last | none,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    thickness: Double,
    thicknessmode: fraction | pixels,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: Font,
    tickformat: String,
    tickformatstops: Dtickrange,
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
    ticksuffix: String,
    ticktext: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    ticktextsrc: js.Any,
    tickvals: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray,
    tickvalssrc: js.Any,
    tickwidth: Double,
    title: String,
    titlefont: Font,
    titleside: right | top | bottom,
    x: Double,
    xanchor: left | center | right,
    xpad: Double,
    y: Double,
    yanchor: top | middle | bottom,
    ypad: Double
  ): ColorBar = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], lenmode = lenmode.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], outlinecolor = outlinecolor.asInstanceOf[js.Any], outlinewidth = outlinewidth.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], thicknessmode = thicknessmode.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], tickformatstops = tickformatstops.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], ticktextsrc = ticktextsrc.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickvalssrc = tickvalssrc.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], titleside = titleside.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xpad = xpad.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], ypad = ypad.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorBar]
  }
  @scala.inline
  implicit class ColorBarOps[Self <: ColorBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBgcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBordercolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bordercolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderwidth(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDtick(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponentformat(value: none | e_ | E | power | SI | B): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLenmode(value: fraction | pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNticks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlinecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparatethousands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatethousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowexponent(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showexponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowticklabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticklabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowtickprefix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showtickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowticksuffix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThicknessmode(value: fraction | pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thicknessmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTick0(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickfont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickformatstops(value: Dtickrange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformatstops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickmode(value: auto | linear | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickprefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicks(value: outside | inside | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicktextsrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktextsrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsInt32Array(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsUint16Array(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsFloat64Array(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsInt16Array(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalsFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickvalssrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvalssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTickwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitlefont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlefont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleside(value: right | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXanchor(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYanchor(value: top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYpad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ypad")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

