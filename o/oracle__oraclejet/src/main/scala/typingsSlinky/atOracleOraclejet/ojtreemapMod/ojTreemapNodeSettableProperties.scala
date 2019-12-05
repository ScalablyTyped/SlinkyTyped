package typingsSlinky.atOracleOraclejet.ojtreemapMod

import typingsSlinky.atOracleOraclejet.Anon_CenterEndIsolate
import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.center
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.end
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.header
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.node
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.start
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTreemapNodeSettableProperties extends JetSettableProperties {
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var groupLabelDisplay: js.UndefOr[node | off | header] = js.undefined
  var header: js.UndefOr[Anon_CenterEndIsolate] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelDisplay: js.UndefOr[off | node] = js.undefined
  var labelHalign: js.UndefOr[start | end | center] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var labelValign: js.UndefOr[top | bottom | center] = js.undefined
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.undefined
  var selectable: js.UndefOr[off | auto] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var value: Double
}

object ojTreemapNodeSettableProperties {
  @scala.inline
  def apply(
    value: Double,
    categories: js.Array[String] = null,
    color: String = null,
    drilling: on | off | inherit = null,
    groupLabelDisplay: node | off | header = null,
    header: Anon_CenterEndIsolate = null,
    label: String = null,
    labelDisplay: off | node = null,
    labelHalign: start | end | center = null,
    labelStyle: js.Object = null,
    labelValign: top | bottom | center = null,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none = null,
    selectable: off | auto = null,
    shortDesc: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): ojTreemapNodeSettableProperties = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (groupLabelDisplay != null) __obj.updateDynamic("groupLabelDisplay")(groupLabelDisplay.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelDisplay != null) __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (labelValign != null) __obj.updateDynamic("labelValign")(labelValign.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapNodeSettableProperties]
  }
}

