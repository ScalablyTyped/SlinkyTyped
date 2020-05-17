package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to a collection of scenarios. */
@js.native
trait XScenariosSupplier extends XInterface {
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  val Scenarios: XScenarios = js.native
  /**
    * returns the collection of scenarios.
    * @see com.sun.star.sheet.Scenarios
    */
  def getScenarios(): XScenarios = js.native
}

object XScenariosSupplier {
  @scala.inline
  def apply(
    Scenarios: XScenarios,
    acquire: () => Unit,
    getScenarios: () => XScenarios,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScenariosSupplier = {
    val __obj = js.Dynamic.literal(Scenarios = Scenarios.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getScenarios = js.Any.fromFunction0(getScenarios), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScenariosSupplier]
  }
  @scala.inline
  implicit class XScenariosSupplierOps[Self <: XScenariosSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScenarios(value: XScenarios): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scenarios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetScenarios(value: () => XScenarios): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScenarios")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

