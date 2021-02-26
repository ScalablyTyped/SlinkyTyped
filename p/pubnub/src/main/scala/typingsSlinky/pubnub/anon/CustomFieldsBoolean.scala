package typingsSlinky.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFieldsBoolean extends StObject {
  
  var customFields: Boolean = js.native
}
object CustomFieldsBoolean {
  
  @scala.inline
  def apply(customFields: Boolean): CustomFieldsBoolean = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFieldsBoolean]
  }
  
  @scala.inline
  implicit class CustomFieldsBooleanMutableBuilder[Self <: CustomFieldsBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
  }
}
