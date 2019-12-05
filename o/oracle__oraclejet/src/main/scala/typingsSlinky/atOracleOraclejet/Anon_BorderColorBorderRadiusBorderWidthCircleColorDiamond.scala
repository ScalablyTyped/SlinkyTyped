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
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.plus
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.rectangle
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.smallChecker
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

trait Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond extends js.Object {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderRadius: js.UndefOr[String] = js.undefined
  var borderWidth: Double
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | Null] = js.undefined
  var opacity: Double
  var pattern: js.UndefOr[
    largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none | smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle
  ] = js.undefined
  var shape: js.UndefOr[
    circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var source: js.UndefOr[String | Null] = js.undefined
  var svgClassName: String
  var svgStyle: js.UndefOr[js.Object | Null] = js.undefined
  var width: js.UndefOr[Double | Null] = js.undefined
}

object Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond {
  @scala.inline
  def apply(
    borderWidth: Double,
    opacity: Double,
    svgClassName: String,
    borderColor: String = null,
    borderRadius: String = null,
    color: String = null,
    height: Int | Double = null,
    pattern: largeChecker | largeCrosshatch | largeDiagonalLeft | largeDiagonalRight | largeDiamond | largeTriangle | none | smallChecker | smallCrosshatch | smallDiagonalLeft | smallDiagonalRight | smallDiamond | smallTriangle = null,
    shape: circle | diamond | ellipse | human | plus | rectangle | square | star | triangleDown | triangleUp | String = null,
    source: String = null,
    svgStyle: js.Object = null,
    width: Int | Double = null
  ): Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond]
  }
}

