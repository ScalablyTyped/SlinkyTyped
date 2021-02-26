package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormViewModelSubmitEvent extends StObject {
  
  var invalid: js.Array[String] = js.native
  
  var valid: js.Array[String] = js.native
  
  var values: js.Any = js.native
}
object FeatureFormViewModelSubmitEvent {
  
  @scala.inline
  def apply(invalid: js.Array[String], valid: js.Array[String], values: js.Any): FeatureFormViewModelSubmitEvent = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormViewModelSubmitEvent]
  }
  
  @scala.inline
  implicit class FeatureFormViewModelSubmitEventMutableBuilder[Self <: FeatureFormViewModelSubmitEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvalid(value: js.Array[String]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidVarargs(value: String*): Self = StObject.set(x, "invalid", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: js.Array[String]): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidVarargs(value: String*): Self = StObject.set(x, "valid", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
