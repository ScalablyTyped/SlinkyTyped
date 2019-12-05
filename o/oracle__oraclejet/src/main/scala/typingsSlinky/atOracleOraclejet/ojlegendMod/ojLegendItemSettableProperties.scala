package typingsSlinky.atOracleOraclejet.ojlegendMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dashed
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.dotted
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ellipse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.hidden
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.human
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.image
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.inherit
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.line
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.lineWithMarker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.marker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.off
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.on
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.solid
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.square
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.star
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendItemSettableProperties extends JetSettableProperties {
  var borderColor: js.UndefOr[String] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var categoryVisibility: js.UndefOr[hidden | visible] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var drilling: js.UndefOr[on | off | inherit] = js.undefined
  var lineStyle: js.UndefOr[dotted | dashed | solid] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var markerColor: js.UndefOr[String] = js.undefined
  var markerShape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  var markerSvgClassName: js.UndefOr[String] = js.undefined
  var markerSvgStyle: js.UndefOr[js.Object] = js.undefined
  var pattern: js.UndefOr[
    smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none
  ] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var symbolType: js.UndefOr[line | lineWithMarker | image | marker] = js.undefined
  var text: String
}

object ojLegendItemSettableProperties {
  @scala.inline
  def apply(
    markerShape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String,
    text: String,
    borderColor: String = null,
    categories: js.Array[String] = null,
    categoryVisibility: hidden | visible = null,
    color: String = null,
    drilling: on | off | inherit = null,
    lineStyle: dotted | dashed | solid = null,
    lineWidth: Int | Double = null,
    markerColor: String = null,
    markerSvgClassName: String = null,
    markerSvgStyle: js.Object = null,
    pattern: smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle | largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none = null,
    shortDesc: String = null,
    source: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    symbolType: line | lineWithMarker | image | marker = null
  ): ojLegendItemSettableProperties = {
    val __obj = js.Dynamic.literal(markerShape = markerShape.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (categoryVisibility != null) __obj.updateDynamic("categoryVisibility")(categoryVisibility.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (lineStyle != null) __obj.updateDynamic("lineStyle")(lineStyle.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (markerSvgClassName != null) __obj.updateDynamic("markerSvgClassName")(markerSvgClassName.asInstanceOf[js.Any])
    if (markerSvgStyle != null) __obj.updateDynamic("markerSvgStyle")(markerSvgStyle.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendItemSettableProperties]
  }
}

