package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialShapeLine
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shape extends js.Object {
  var fillcolor: String = js.native
  var layer: below | above = js.native
  var line: PartialShapeLine = js.native
  var name: String = js.native
  var opacity: Double = js.native
  var path: String = js.native
  var templateitemname: String = js.native
  var `type`: rect | circle | line | path = js.native
  var visible: Boolean = js.native
  var x0: Datum = js.native
  var x1: Datum = js.native
  var xanchor: Double | String = js.native
  // x-reference is assigned to the x-values
  var xref: x | paper = js.native
  var xsizemode: scaled | pixel = js.native
  var y0: Datum = js.native
  var y1: Datum = js.native
  var yanchor: Double | String = js.native
  // y-reference is assigned to the plot paper [0,1]
  var yref: paper | y = js.native
  var ysizemode: scaled | pixel = js.native
}

object Shape {
  @scala.inline
  def apply(
    fillcolor: String,
    layer: below | above,
    line: PartialShapeLine,
    name: String,
    opacity: Double,
    path: String,
    templateitemname: String,
    `type`: rect | circle | line | path,
    visible: Boolean,
    xanchor: Double | String,
    xref: x | paper,
    xsizemode: scaled | pixel,
    yanchor: Double | String,
    yref: paper | y,
    ysizemode: scaled | pixel
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], templateitemname = templateitemname.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], xsizemode = xsizemode.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any], ysizemode = ysizemode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  implicit class ShapeOps[Self <: Shape] (val x: Self) extends AnyVal {
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
    def withLayer(value: below | above): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: PartialShapeLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateitemname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateitemname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: rect | circle | line | path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXanchor(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXref(value: typingsSlinky.plotlyJs.plotlyJsStrings.x | paper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXsizemode(value: scaled | pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsizemode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYanchor(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yanchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYref(value: paper | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYsizemode(value: scaled | pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ysizemode")(value.asInstanceOf[js.Any])
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
    def withX1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(null)
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
    def withY1Null: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(null)
        ret
    }
  }
  
}

