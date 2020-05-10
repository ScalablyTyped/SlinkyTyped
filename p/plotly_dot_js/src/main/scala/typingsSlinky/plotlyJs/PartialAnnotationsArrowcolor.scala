package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Font
import typingsSlinky.plotlyJs.mod.HoverLabel
import typingsSlinky.plotlyJs.plotlyJsBooleans.`false`
import typingsSlinky.plotlyJs.plotlyJsStrings.auto
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.center
import typingsSlinky.plotlyJs.plotlyJsStrings.end
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.middle
import typingsSlinky.plotlyJs.plotlyJsStrings.onoff
import typingsSlinky.plotlyJs.plotlyJsStrings.onout
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.pixel
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.start
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.plotlyJs.plotlyJsStrings.x
import typingsSlinky.plotlyJs.plotlyJsStrings.y
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Annotations> */
@js.native
trait PartialAnnotationsArrowcolor extends js.Object {
  var align: js.UndefOr[left | center | right] = js.native
  var arrowcolor: js.UndefOr[String] = js.native
  var arrowhead: js.UndefOr[Double] = js.native
  var arrowside: js.UndefOr[end | start] = js.native
  var arrowsize: js.UndefOr[Double] = js.native
  var arrowwidth: js.UndefOr[Double] = js.native
  var ax: js.UndefOr[Double] = js.native
  var axref: js.UndefOr[pixel] = js.native
  var ay: js.UndefOr[Double] = js.native
  var ayref: js.UndefOr[pixel] = js.native
  var bgcolor: js.UndefOr[String] = js.native
  var bordercolor: js.UndefOr[String] = js.native
  var borderpad: js.UndefOr[Double] = js.native
  var borderwidth: js.UndefOr[Double] = js.native
  var captureevents: js.UndefOr[Boolean] = js.native
  var clicktoshow: js.UndefOr[`false` | onoff | onout] = js.native
  var font: js.UndefOr[Partial[Font]] = js.native
  var height: js.UndefOr[Double] = js.native
  var hoverlabel: js.UndefOr[Partial[HoverLabel]] = js.native
  var hovertext: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var showarrow: js.UndefOr[Boolean] = js.native
  var standoff: js.UndefOr[Double] = js.native
  var startarrowhead: js.UndefOr[Double] = js.native
  var startarrowsize: js.UndefOr[Double] = js.native
  var startstandoff: js.UndefOr[Double] = js.native
  var text: js.UndefOr[String] = js.native
  var textangle: js.UndefOr[String] = js.native
  var valign: js.UndefOr[top | middle | bottom] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double | String] = js.native
  var xanchor: js.UndefOr[auto | left | center | right] = js.native
  var xclick: js.UndefOr[js.Any] = js.native
  var xref: js.UndefOr[paper | x] = js.native
  var xshift: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double | String] = js.native
  var yanchor: js.UndefOr[auto | top | middle | bottom] = js.native
  var yclick: js.UndefOr[js.Any] = js.native
  var yref: js.UndefOr[paper | y] = js.native
  var yshift: js.UndefOr[Double] = js.native
}

object PartialAnnotationsArrowcolor {
  @scala.inline
  def apply(): PartialAnnotationsArrowcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAnnotationsArrowcolor]
  }
  @scala.inline
  implicit class PartialAnnotationsArrowcolorOps[Self <: PartialAnnotationsArrowcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: left | center | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowhead")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowside(value: end | start): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowside")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowsize")(js.undefined)
        ret
    }
    @scala.inline
    def withArrowwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withAx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ax")(js.undefined)
        ret
    }
    @scala.inline
    def withAxref(value: pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axref")(js.undefined)
        ret
    }
    @scala.inline
    def withAy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ay")(js.undefined)
        ret
    }
    @scala.inline
    def withAyref(value: pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ayref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAyref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ayref")(js.undefined)
        ret
    }
    @scala.inline
    def withBgcolor(value: String): Self = {
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
    def withBorderpad(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderpad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderpad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderpad")(js.undefined)
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
    def withCaptureevents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureevents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureevents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureevents")(js.undefined)
        ret
    }
    @scala.inline
    def withClicktoshow(value: `false` | onoff | onout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicktoshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClicktoshow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clicktoshow")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Partial[Font]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
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
    def withHoverlabel(value: Partial[HoverLabel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverlabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverlabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverlabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHovertext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovertext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHovertext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hovertext")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withShowarrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showarrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowarrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showarrow")(js.undefined)
        ret
    }
    @scala.inline
    def withStandoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standoff")(js.undefined)
        ret
    }
    @scala.inline
    def withStartarrowhead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startarrowhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartarrowhead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startarrowhead")(js.undefined)
        ret
    }
    @scala.inline
    def withStartarrowsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startarrowsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartarrowsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startarrowsize")(js.undefined)
        ret
    }
    @scala.inline
    def withStartstandoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startstandoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartstandoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startstandoff")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextangle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textangle")(js.undefined)
        ret
    }
    @scala.inline
    def withValign(value: top | middle | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valign")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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
    @scala.inline
    def withX(value: Double | String): Self = {
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
    def withXanchor(value: auto | left | center | right): Self = {
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
    def withXclick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xclick")(js.undefined)
        ret
    }
    @scala.inline
    def withXref(value: paper | x): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xref")(js.undefined)
        ret
    }
    @scala.inline
    def withXshift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xshift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xshift")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double | String): Self = {
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
    def withYanchor(value: auto | top | middle | bottom): Self = {
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
    def withYclick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yclick")(js.undefined)
        ret
    }
    @scala.inline
    def withYref(value: paper | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yref")(js.undefined)
        ret
    }
    @scala.inline
    def withYshift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yshift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yshift")(js.undefined)
        ret
    }
  }
  
}

