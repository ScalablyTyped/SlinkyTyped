package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionValue extends StObject {
  
  /**
    * A relative date (based on the current date). Valid only if the type is DATE_BEFORE, DATE_AFTER, DATE_ON_OR_BEFORE or DATE_ON_OR_AFTER. Relative dates are not supported in data
    * validation. They are supported only in conditional formatting and conditional filters.
    */
  var relativeDate: js.UndefOr[String] = js.native
  
  /** A value the condition is based on. The value is parsed as if the user typed into a cell. Formulas are supported (and must begin with an `=` or a '+'). */
  var userEnteredValue: js.UndefOr[String] = js.native
}
object ConditionValue {
  
  @scala.inline
  def apply(): ConditionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionValue]
  }
  
  @scala.inline
  implicit class ConditionValueMutableBuilder[Self <: ConditionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelativeDate(value: String): Self = StObject.set(x, "relativeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeDateUndefined: Self = StObject.set(x, "relativeDate", js.undefined)
    
    @scala.inline
    def setUserEnteredValue(value: String): Self = StObject.set(x, "userEnteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEnteredValueUndefined: Self = StObject.set(x, "userEnteredValue", js.undefined)
  }
}
