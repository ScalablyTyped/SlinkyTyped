package typingsSlinky.oracleOraclejet.ojchartMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.diamond
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.human
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.plus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.square
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.star
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSparkChartItemSettableProperties extends JetSettableProperties {
  var borderColor: String
  var color: String
  var date: String
  var high: Double | Null
  var low: Double | Null
  var markerDisplayed: off | on
  var markerShape: js.UndefOr[
    auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String
  ] = js.undefined
  var markerSize: Double
  var svgClassName: String
  var svgStyle: js.Object
  var value: Double | Null
}

object ojSparkChartItemSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    color: String,
    date: String,
    markerDisplayed: off | on,
    markerSize: Double,
    svgClassName: String,
    svgStyle: js.Object,
    high: Double = null.asInstanceOf[Double],
    low: Double = null.asInstanceOf[Double],
    markerShape: auto | circle | diamond | human | plus | square | star | triangleDown | triangleUp | String = null,
    value: Double = null.asInstanceOf[Double]
  ): ojSparkChartItemSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], markerDisplayed = markerDisplayed.asInstanceOf[js.Any], markerSize = markerSize.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (markerShape != null) __obj.updateDynamic("markerShape")(markerShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojSparkChartItemSettableProperties]
  }
}

