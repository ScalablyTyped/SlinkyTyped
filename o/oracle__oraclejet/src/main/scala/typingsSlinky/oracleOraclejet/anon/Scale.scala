package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.days
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.hours
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.months
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  var converter: js.UndefOr[Converters | typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  var zoomOrder: js.UndefOr[js.Array[String]] = js.undefined
}

object Scale {
  @scala.inline
  def apply(
    scale: seconds | minutes | hours | days | weeks | months | quarters | years,
    converter: Converters | typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String] = null,
    height: js.UndefOr[Double] = js.undefined,
    zoomOrder: js.Array[String] = null
  ): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (converter != null) __obj.updateDynamic("converter")(converter.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (zoomOrder != null) __obj.updateDynamic("zoomOrder")(zoomOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

