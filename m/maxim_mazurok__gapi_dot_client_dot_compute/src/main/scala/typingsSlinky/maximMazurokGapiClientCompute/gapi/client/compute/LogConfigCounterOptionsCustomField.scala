package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfigCounterOptionsCustomField extends StObject {
  
  /** Name is the field name. */
  var name: js.UndefOr[String] = js.native
  
  /** Value is the field value. It is important that in contrast to the CounterOptions.field, the value here is a constant that is not derived from the IAMContext. */
  var value: js.UndefOr[String] = js.native
}
object LogConfigCounterOptionsCustomField {
  
  @scala.inline
  def apply(): LogConfigCounterOptionsCustomField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCounterOptionsCustomField]
  }
  
  @scala.inline
  implicit class LogConfigCounterOptionsCustomFieldMutableBuilder[Self <: LogConfigCounterOptionsCustomField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
