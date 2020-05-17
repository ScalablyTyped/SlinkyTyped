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

@js.native
trait Scale extends js.Object {
  var converter: js.UndefOr[Converters | typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years = js.native
  var zoomOrder: js.UndefOr[js.Array[String]] = js.native
}

object Scale {
  @scala.inline
  def apply(scale: seconds | minutes | hours | days | weeks | months | quarters | years): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConverter(value: Converters | typingsSlinky.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converter")(js.undefined)
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
    def withZoomOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOrder")(js.undefined)
        ret
    }
  }
  
}

