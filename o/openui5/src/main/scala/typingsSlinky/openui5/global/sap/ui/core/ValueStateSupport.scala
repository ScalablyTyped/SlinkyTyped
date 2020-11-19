package typingsSlinky.openui5.global.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.core.ValueStateSupport")
@js.native
object ValueStateSupport extends js.Object {
  
  /**
    * Appends a generic success, warning or error message to the given tooltip text if the given
    * Elementhas a property "valueState" with one of these three states.
    * @param oElement the Element of which the tooltip needs to be modified
    * @param sTooltipText the original tooltip text (may be null)
    * @returns the given text, with appended success/warning/error text, if appropriate
    */
  def enrichTooltip(oElement: typingsSlinky.openui5.sap.ui.core.Element, sTooltipText: String): String = js.native
  
  /**
    * Returns a ValueState object based on the given integer value 0 : ValueState.None 1 :
    * ValueState.Warning 2 : ValueState.Success 3 : ValueState.Error
    * @since 1.25.0
    * @param iState the state as an integer
    * @returns the corresponding ValueState object
    */
  def formatValueState(iState: Double): typingsSlinky.openui5.sap.ui.core.ValueState = js.native
  
  /**
    * Returns a generic success, warning or error message if the given Elementhas a property "valueState"
    * with one of these three states or the given ValueStaterepresents one of these states.
    * @param vValue the Element of which the valueState needs to be checked, or the ValueState explicitly
    * @returns the success/warning/error text, if appropriate; otherwise null
    */
  def getAdditionalText(vValue: typingsSlinky.openui5.sap.ui.core.Element): String = js.native
  def getAdditionalText(vValue: typingsSlinky.openui5.sap.ui.core.ValueState): String = js.native
}
