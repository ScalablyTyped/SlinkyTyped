package typingsSlinky.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateRangeSelection extends DatePicker {
  
  /**
    * Gets current value of property <code>delimiter</code>.Delimiter between start and end date. Default
    * value is "-".If no delimiter is given, the one defined for the used locale is used.Default value is
    * <code>-</code>.
    * @returns Value of property <code>delimiter</code>
    */
  def getDelimiter(): String = js.native
  
  /**
    * Gets current value of property <code>from</code>.Start date of the range.
    * @returns Value of property <code>from</code>
    */
  def getFrom(): js.Any = js.native
  
  /**
    * Gets current value of property <code>secondDateValue</code>.The end date of the range as JavaScript
    * Date object. This is independent from any formatter.<b>Note:</b> If this property is used, the
    * <code>value</code> property should not be changed from the caller.
    * @returns Value of property <code>secondDateValue</code>
    */
  def getSecondDateValue(): js.Any = js.native
  
  /**
    * Gets current value of property <code>to</code>.End date of the range.
    * @returns Value of property <code>to</code>
    */
  def getTo(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>delimiter</code>.Delimiter between start and end date. Default
    * value is "-".If no delimiter is given, the one defined for the used locale is used.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>-</code>.
    * @param sDelimiter New value for property <code>delimiter</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDelimiter(sDelimiter: String): DateRangeSelection = js.native
  
  /**
    * Sets a new value for property <code>from</code>.Start date of the range.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oFrom New value for property <code>from</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFrom(oFrom: js.Any): DateRangeSelection = js.native
  
  /**
    * Sets a new value for property <code>secondDateValue</code>.The end date of the range as JavaScript
    * Date object. This is independent from any formatter.<b>Note:</b> If this property is used, the
    * <code>value</code> property should not be changed from the caller.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oSecondDateValue New value for property <code>secondDateValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSecondDateValue(oSecondDateValue: js.Any): DateRangeSelection = js.native
  
  /**
    * Sets a new value for property <code>to</code>.End date of the range.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param oTo New value for property <code>to</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTo(oTo: js.Any): DateRangeSelection = js.native
}
