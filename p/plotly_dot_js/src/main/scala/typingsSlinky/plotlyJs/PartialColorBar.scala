package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Color
import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.Font
import typingsSlinky.plotlyJs.mod.TypedArray
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

/* Inlined std.Partial<plotly.js.plotly.js.ColorBar> */
@js.native
trait PartialColorBar extends js.Object {
  var bgcolor: js.UndefOr[Color] = js.native
  var bordercolor: js.UndefOr[Color] = js.native
  var borderwidth: js.UndefOr[Color] = js.native
  var dtick: js.UndefOr[Double | String] = js.native
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.native
  var len: js.UndefOr[Double] = js.native
  var lenmode: js.UndefOr[fraction | pixels] = js.native
  var nticks: js.UndefOr[Double] = js.native
  var outlinecolor: js.UndefOr[Color] = js.native
  var outlinewidth: js.UndefOr[Double] = js.native
  var separatethousands: js.UndefOr[Boolean] = js.native
  var showexponent: js.UndefOr[all | first | last | none] = js.native
  var showticklabels: js.UndefOr[Boolean] = js.native
  var showtickprefix: js.UndefOr[all | first | last | none] = js.native
  var showticksuffix: js.UndefOr[all | first | last | none] = js.native
  var thickness: js.UndefOr[Double] = js.native
  var thicknessmode: js.UndefOr[fraction | pixels] = js.native
  var tick0: js.UndefOr[Double | String] = js.native
  var tickangle: js.UndefOr[Double] = js.native
  var tickcolor: js.UndefOr[Color] = js.native
  var tickfont: js.UndefOr[Font] = js.native
  var tickformat: js.UndefOr[String] = js.native
  var tickformatstops: js.UndefOr[AnonDtickrange] = js.native
  var ticklen: js.UndefOr[Double] = js.native
  var tickmode: js.UndefOr[auto | linear | array] = js.native
  var tickprefix: js.UndefOr[String] = js.native
  var ticks: js.UndefOr[outside | inside | _empty] = js.native
  var ticksuffix: js.UndefOr[String] = js.native
  var ticktext: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.native
  var ticktextsrc: js.UndefOr[js.Any] = js.native
  var tickvals: js.UndefOr[(js.Array[(js.Array[js.Array[Datum] | Datum]) | Datum]) | TypedArray] = js.native
  var tickvalssrc: js.UndefOr[js.Any] = js.native
  var tickwidth: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var titlefont: js.UndefOr[Font] = js.native
  var titleside: js.UndefOr[right | top | bottom] = js.native
  var x: js.UndefOr[Double] = js.native
  var xanchor: js.UndefOr[left | center | right] = js.native
  var xpad: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  var yanchor: js.UndefOr[top | middle | bottom] = js.native
  var ypad: js.UndefOr[Double] = js.native
}

object PartialColorBar {
  @scala.inline
  def apply(): PartialColorBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColorBar]
  }
  @scala.inline
  implicit class PartialColorBarOps[Self <: PartialColorBar] (val x: Self) extends AnyVal {
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
    def withoutBgcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withBordercolor(value: Color): Self = {
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
    def withBorderwidth(value: Color): Self = {
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
    def withDtick(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDtick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dtick")(js.undefined)
        ret
    }
    @scala.inline
    def withExponentformat(value: none | e_ | E | power | SI | B): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExponentformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponentformat")(js.undefined)
        ret
    }
    @scala.inline
    def withLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("len")(js.undefined)
        ret
    }
    @scala.inline
    def withLenmode(value: fraction | pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLenmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lenmode")(js.undefined)
        ret
    }
    @scala.inline
    def withNticks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNticks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nticks")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlinecolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinecolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlinecolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinecolor")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlinewidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinewidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlinewidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlinewidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparatethousands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatethousands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparatethousands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separatethousands")(js.undefined)
        ret
    }
    @scala.inline
    def withShowexponent(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showexponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowexponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showexponent")(js.undefined)
        ret
    }
    @scala.inline
    def withShowticklabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticklabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowticklabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticklabels")(js.undefined)
        ret
    }
    @scala.inline
    def withShowtickprefix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showtickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowtickprefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showtickprefix")(js.undefined)
        ret
    }
    @scala.inline
    def withShowticksuffix(value: all | first | last | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowticksuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showticksuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withThicknessmode(value: fraction | pixels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thicknessmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThicknessmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thicknessmode")(js.undefined)
        ret
    }
    @scala.inline
    def withTick0(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTick0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tick0")(js.undefined)
        ret
    }
    @scala.inline
    def withTickangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickangle")(js.undefined)
        ret
    }
    @scala.inline
    def withTickcolor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withTickfont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickfont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickfont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickfont")(js.undefined)
        ret
    }
    @scala.inline
    def withTickformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformat")(js.undefined)
        ret
    }
    @scala.inline
    def withTickformatstops(value: AnonDtickrange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformatstops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickformatstops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickformatstops")(js.undefined)
        ret
    }
    @scala.inline
    def withTicklen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicklen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticklen")(js.undefined)
        ret
    }
    @scala.inline
    def withTickmode(value: auto | linear | array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickmode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickmode")(js.undefined)
        ret
    }
    @scala.inline
    def withTickprefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickprefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickprefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickprefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTicks(value: outside | inside | _empty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticks")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksuffix")(js.undefined)
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
    def withoutTicktext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktext")(js.undefined)
        ret
    }
    @scala.inline
    def withTicktextsrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktextsrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicktextsrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticktextsrc")(js.undefined)
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
    def withoutTickvals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvals")(js.undefined)
        ret
    }
    @scala.inline
    def withTickvalssrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvalssrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickvalssrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickvalssrc")(js.undefined)
        ret
    }
    @scala.inline
    def withTickwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitlefont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlefont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlefont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlefont")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleside(value: right | top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleside")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withXanchor(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXanchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(js.undefined)
        ret
    }
    @scala.inline
    def withXpad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpad")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withYanchor(value: top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYanchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(js.undefined)
        ret
    }
    @scala.inline
    def withYpad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ypad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYpad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ypad")(js.undefined)
        ret
    }
  }
  
}

