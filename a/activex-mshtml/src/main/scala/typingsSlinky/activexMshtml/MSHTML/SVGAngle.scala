package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAngle extends js.Object {
  @JSName("MSHTML.SVGAngle_typekey")
  var MSHTMLDotSVGAngle_typekey: SVGAngle = js.native
  var unitType: Double = js.native
  var value: Double = js.native
  var valueAsString: String = js.native
  var valueInSpecifiedUnits: Double = js.native
  def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
}

object SVGAngle {
  @scala.inline
  def apply(
    MSHTMLDotSVGAngle_typekey: SVGAngle,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: String,
    valueInSpecifiedUnits: Double
  ): SVGAngle = {
    val __obj = js.Dynamic.literal(convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAngle_typekey")(MSHTMLDotSVGAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAngle]
  }
  @scala.inline
  implicit class SVGAngleOps[Self <: SVGAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotSVGAngle_typekey(value: SVGAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.SVGAngle_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConvertToSpecifiedUnits(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertToSpecifiedUnits")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValueSpecifiedUnits")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnitType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueAsString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueAsString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueInSpecifiedUnits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueInSpecifiedUnits")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

