package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
@js.native
trait XScenario extends XInterface {
  
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: Boolean = js.native
  
  /** returns the comment for the scenario. */
  var ScenarioComment: String = js.native
  
  /** adds more ranges to the scenario. */
  def addRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit = js.native
  
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): Unit = js.native
  
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): Boolean = js.native
  
  /** returns the comment for the scenario. */
  def getScenarioComment(): String = js.native
  
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: String): Unit = js.native
}
object XScenario {
  
  @scala.inline
  def apply(
    IsScenario: Boolean,
    ScenarioComment: String,
    acquire: () => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getScenarioComment: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScenarioComment: String => Unit
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRanges = js.Any.fromFunction1(addRanges), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
    __obj.asInstanceOf[XScenario]
  }
  
  @scala.inline
  implicit class XScenarioMutableBuilder[Self <: XScenario] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddRanges(value: SeqEquiv[CellRangeAddress] => Unit): Self = StObject.set(x, "addRanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApply(value: () => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsScenario(value: () => Boolean): Self = StObject.set(x, "getIsScenario", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScenarioComment(value: () => String): Self = StObject.set(x, "getScenarioComment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsScenario(value: Boolean): Self = StObject.set(x, "IsScenario", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioComment(value: String): Self = StObject.set(x, "ScenarioComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetScenarioComment(value: String => Unit): Self = StObject.set(x, "setScenarioComment", js.Any.fromFunction1(value))
  }
}
