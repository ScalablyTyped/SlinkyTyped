package typingsSlinky.makerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScaleConversion extends js.Object {
  var scaleConversion: Double = js.native
  var svgUnitType: String = js.native
}

object AnonScaleConversion {
  @scala.inline
  def apply(scaleConversion: Double, svgUnitType: String): AnonScaleConversion = {
    val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScaleConversion]
  }
  @scala.inline
  implicit class AnonScaleConversionOps[Self <: AnonScaleConversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScaleConversion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleConversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSvgUnitType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgUnitType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

