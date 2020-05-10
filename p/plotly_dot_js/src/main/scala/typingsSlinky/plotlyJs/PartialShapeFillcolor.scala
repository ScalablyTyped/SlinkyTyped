package typingsSlinky.plotlyJs

import typingsSlinky.plotlyJs.mod.Datum
import typingsSlinky.plotlyJs.mod.ShapeLine
import typingsSlinky.plotlyJs.plotlyJsStrings.above
import typingsSlinky.plotlyJs.plotlyJsStrings.below
import typingsSlinky.plotlyJs.plotlyJsStrings.circle
import typingsSlinky.plotlyJs.plotlyJsStrings.line
import typingsSlinky.plotlyJs.plotlyJsStrings.paper
import typingsSlinky.plotlyJs.plotlyJsStrings.path
import typingsSlinky.plotlyJs.plotlyJsStrings.pixel
import typingsSlinky.plotlyJs.plotlyJsStrings.rect
import typingsSlinky.plotlyJs.plotlyJsStrings.scaled
import typingsSlinky.plotlyJs.plotlyJsStrings.x
import typingsSlinky.plotlyJs.plotlyJsStrings.y
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Shape> */
@js.native
trait PartialShapeFillcolor extends js.Object {
  var fillcolor: js.UndefOr[String] = js.native
  var layer: js.UndefOr[below | above] = js.native
  var line: js.UndefOr[Partial[ShapeLine]] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var templateitemname: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[rect | circle | line | path] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var x0: js.UndefOr[Datum] = js.native
  var x1: js.UndefOr[Datum] = js.native
  var xanchor: js.UndefOr[Double | String] = js.native
  var xref: js.UndefOr[x | paper] = js.native
  var xsizemode: js.UndefOr[scaled | pixel] = js.native
  var y0: js.UndefOr[Datum] = js.native
  var y1: js.UndefOr[Datum] = js.native
  var yanchor: js.UndefOr[Double | String] = js.native
  var yref: js.UndefOr[paper | y] = js.native
  var ysizemode: js.UndefOr[scaled | pixel] = js.native
}

object PartialShapeFillcolor {
  @scala.inline
  def apply(): PartialShapeFillcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShapeFillcolor]
  }
  @scala.inline
  implicit class PartialShapeFillcolorOps[Self <: PartialShapeFillcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillcolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillcolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillcolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillcolor")(js.undefined)
        ret
    }
    @scala.inline
    def withLayer(value: below | above): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: Partial[ShapeLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateitemname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateitemname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateitemname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateitemname")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: rect | circle | line | path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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
    def withX0Date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX0(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(js.undefined)
        ret
    }
    @scala.inline
    def withX0Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(null)
        ret
    }
    @scala.inline
    def withX1Date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(js.undefined)
        ret
    }
    @scala.inline
    def withX1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(null)
        ret
    }
    @scala.inline
    def withXanchor(value: Double | String): Self = {
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
    def withXref(value: x | paper): Self = {
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
    def withXsizemode(value: scaled | pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsizemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsizemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsizemode")(js.undefined)
        ret
    }
    @scala.inline
    def withY0Date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY0(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(js.undefined)
        ret
    }
    @scala.inline
    def withY0Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(null)
        ret
    }
    @scala.inline
    def withY1Date(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: Datum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(js.undefined)
        ret
    }
    @scala.inline
    def withY1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(null)
        ret
    }
    @scala.inline
    def withYanchor(value: Double | String): Self = {
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
    def withYsizemode(value: scaled | pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ysizemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYsizemode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ysizemode")(js.undefined)
        ret
    }
  }
  
}

