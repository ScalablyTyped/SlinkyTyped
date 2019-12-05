package typingsSlinky.atOracleOraclejet

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.circle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.diamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.ellipse
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.human
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.largeTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.mallChecker
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallCrosshatch
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalLeft
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiagonalRight
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallDiamond
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallTriangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.square
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.star
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleDown
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderColorBorderRadiusBorderWidth extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[
    largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none | mallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle
  ] = js.undefined
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourceHover: js.UndefOr[String] = js.undefined
  var sourceHoverSelected: js.UndefOr[String] = js.undefined
  var sourceSelected: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_BorderColorBorderRadiusBorderWidth {
  @scala.inline
  def apply(
    borderColor: String = null,
    borderRadius: String = null,
    borderWidth: Int | Double = null,
    color: String = null,
    height: Int | Double = null,
    opacity: Int | Double = null,
    pattern: largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none | mallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle = null,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    source: String = null,
    sourceHover: String = null,
    sourceHoverSelected: String = null,
    sourceSelected: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    width: Int | Double = null
  ): Anon_BorderColorBorderRadiusBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHover != null) __obj.updateDynamic("sourceHover")(sourceHover.asInstanceOf[js.Any])
    if (sourceHoverSelected != null) __obj.updateDynamic("sourceHoverSelected")(sourceHoverSelected.asInstanceOf[js.Any])
    if (sourceSelected != null) __obj.updateDynamic("sourceSelected")(sourceSelected.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorBorderRadiusBorderWidth]
  }
}

