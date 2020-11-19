package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access via name to the scenarios in a collection and inserting and removing scenarios.
  * @see com.sun.star.sheet.Scenarios
  * @see com.sun.star.sheet.Spreadsheet
  */
@js.native
trait XScenarios extends XNameAccess {
  
  /**
    * creates a new scenario and adds it to the collection.
    * @param aName the name of the scenario (used i.e. for collection access).
    * @param aRanges the cell ranges contained in the scenario.
    * @param aComment the user defined comment for the scenario.
    */
  def addNewByName(aName: String, aRanges: SeqEquiv[CellRangeAddress], aComment: String): Unit = js.native
  
  /** removes a scenario from the collection. */
  def removeByName(aName: String): Unit = js.native
}
object XScenarios {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addNewByName: (String, SeqEquiv[CellRangeAddress], String) => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit
  ): XScenarios = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNewByName = js.Any.fromFunction3(addNewByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName))
    __obj.asInstanceOf[XScenarios]
  }
  
  @scala.inline
  implicit class XScenariosOps[Self <: XScenarios] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddNewByName(value: (String, SeqEquiv[CellRangeAddress], String) => Unit): Self = this.set("addNewByName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoveByName(value: String => Unit): Self = this.set("removeByName", js.Any.fromFunction1(value))
  }
}
