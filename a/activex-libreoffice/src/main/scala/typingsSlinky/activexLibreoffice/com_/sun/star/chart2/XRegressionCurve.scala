package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRegressionCurve extends XInterface {
  val Calculator: XRegressionCurveCalculator = js.native
  var EquationProperties: XPropertySet = js.native
  def getCalculator(): XRegressionCurveCalculator = js.native
  def getEquationProperties(): XPropertySet = js.native
  def setEquationProperties(xEquationProperties: XPropertySet): Unit = js.native
}

object XRegressionCurve {
  @scala.inline
  def apply(
    Calculator: XRegressionCurveCalculator,
    EquationProperties: XPropertySet,
    acquire: () => Unit,
    getCalculator: () => XRegressionCurveCalculator,
    getEquationProperties: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEquationProperties: XPropertySet => Unit
  ): XRegressionCurve = {
    val __obj = js.Dynamic.literal(Calculator = Calculator.asInstanceOf[js.Any], EquationProperties = EquationProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCalculator = js.Any.fromFunction0(getCalculator), getEquationProperties = js.Any.fromFunction0(getEquationProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEquationProperties = js.Any.fromFunction1(setEquationProperties))
    __obj.asInstanceOf[XRegressionCurve]
  }
  @scala.inline
  implicit class XRegressionCurveOps[Self <: XRegressionCurve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculator(value: XRegressionCurveCalculator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Calculator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquationProperties(value: XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EquationProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCalculator(value: () => XRegressionCurveCalculator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCalculator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEquationProperties(value: () => XPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEquationProperties")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEquationProperties(value: XPropertySet => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEquationProperties")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

