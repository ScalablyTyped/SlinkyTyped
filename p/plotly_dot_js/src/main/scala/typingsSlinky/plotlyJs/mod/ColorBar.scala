package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialTickFormatStop
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorBar extends js.Object {
  
  var bgcolor: Color = js.native
  
  var bordercolor: Color = js.native
  
  var borderwidth: Color = js.native
  
  var dtick: DTickValue = js.native
  
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
  
  var tickformatstops: js.Array[PartialTickFormatStop] = js.native
  
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
    dtick: DTickValue,
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
    tickformatstops: js.Array[PartialTickFormatStop],
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bordercolor", js.Array(value :_*))
    
    @scala.inline
    def setBordercolor(value: Color): Self = this.set("bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidthVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("borderwidth", js.Array(value :_*))
    
    @scala.inline
    def setBorderwidth(value: Color): Self = this.set("borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtick(value: DTickValue): Self = this.set("dtick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = this.set("exponentformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLen(value: Double): Self = this.set("len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLenmode(value: fraction | pixels): Self = this.set("lenmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNticks(value: Double): Self = this.set("nticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("outlinecolor", js.Array(value :_*))
    
    @scala.inline
    def setOutlinecolor(value: Color): Self = this.set("outlinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinewidth(value: Double): Self = this.set("outlinewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = this.set("separatethousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = this.set("showexponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticklabels(value: Boolean): Self = this.set("showticklabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = this.set("showtickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = this.set("showticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessmode(value: fraction | pixels): Self = this.set("thicknessmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick0(value: Double | String): Self = this.set("tick0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickangle(value: Double): Self = this.set("tickangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: Color): Self = this.set("tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickfont(value: Font): Self = this.set("tickfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformat(value: String): Self = this.set("tickformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = this.set("tickformatstops", js.Array(value :_*))
    
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = this.set("tickformatstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicklen(value: Double): Self = this.set("ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = this.set("tickmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickprefix(value: String): Self = this.set("tickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksuffix(value: String): Self = this.set("ticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = this.set("ticktext", js.Array(value :_*))
    
    @scala.inline
    def setTicktextInt32Array(value: js.typedarray.Int32Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextInt16Array(value: js.typedarray.Int16Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextUint8Array(value: js.typedarray.Uint8Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextFloat64Array(value: js.typedarray.Float64Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextUint16Array(value: js.typedarray.Uint16Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextUint32Array(value: js.typedarray.Uint32Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextInt8Array(value: js.typedarray.Int8Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktext(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextFloat32Array(value: js.typedarray.Float32Array): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextsrc(value: js.Any): Self = this.set("ticktextsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsInt8Array(value: js.typedarray.Int8Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsUint32Array(value: js.typedarray.Uint32Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsFloat32Array(value: js.typedarray.Float32Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsUint16Array(value: js.typedarray.Uint16Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsVarargs(value: ((js.Array[js.Array[Datum] | Datum]) | Datum)*): Self = this.set("tickvals", js.Array(value :_*))
    
    @scala.inline
    def setTickvals(value: (js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsInt16Array(value: js.typedarray.Int16Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsUint8Array(value: js.typedarray.Uint8Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsInt32Array(value: js.typedarray.Int32Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsFloat64Array(value: js.typedarray.Float64Array): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalssrc(value: js.Any): Self = this.set("tickvalssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefont(value: Font): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleside(value: right | top | bottom): Self = this.set("titleside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXanchor(value: left | center | right): Self = this.set("xanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXpad(value: Double): Self = this.set("xpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYanchor(value: top | middle | bottom): Self = this.set("yanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYpad(value: Double): Self = this.set("ypad", value.asInstanceOf[js.Any])
  }
}
