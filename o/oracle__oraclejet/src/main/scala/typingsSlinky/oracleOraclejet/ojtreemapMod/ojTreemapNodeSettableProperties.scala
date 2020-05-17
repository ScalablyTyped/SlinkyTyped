package typingsSlinky.oracleOraclejet.ojtreemapMod

import typingsSlinky.oracleOraclejet.anon.Isolate
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.header
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.inherit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.largeTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.node
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallChecker
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallCrosshatch
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallDiamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.smallTriangle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojTreemapNodeSettableProperties extends JetSettableProperties {
  var categories: js.UndefOr[js.Array[String]] = js.native
  var color: js.UndefOr[String] = js.native
  var drilling: js.UndefOr[on | off | inherit] = js.native
  var groupLabelDisplay: js.UndefOr[node | off | header] = js.native
  var header: js.UndefOr[Isolate] = js.native
  var label: js.UndefOr[String] = js.native
  var labelDisplay: js.UndefOr[off | node] = js.native
  var labelHalign: js.UndefOr[start | end | center] = js.native
  var labelStyle: js.UndefOr[js.Object] = js.native
  var labelValign: js.UndefOr[top | bottom | center] = js.native
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.native
  var selectable: js.UndefOr[off | auto] = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var value: Double = js.native
}

object ojTreemapNodeSettableProperties {
  @scala.inline
  def apply(value: Double): ojTreemapNodeSettableProperties = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapNodeSettableProperties]
  }
  @scala.inline
  implicit class ojTreemapNodeSettablePropertiesOps[Self <: ojTreemapNodeSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDrilling(value: on | off | inherit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drilling")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupLabelDisplay(value: node | off | header): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLabelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupLabelDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupLabelDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Isolate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelDisplay(value: off | node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelDisplay")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelHalign(value: start | end | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHalign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelHalign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelHalign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelValign(value: top | bottom | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelValign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelValign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelValign")(js.undefined)
        ret
    }
    @scala.inline
    def withPattern(
      value: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: off | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgStyle")(js.undefined)
        ret
    }
  }
  
}

