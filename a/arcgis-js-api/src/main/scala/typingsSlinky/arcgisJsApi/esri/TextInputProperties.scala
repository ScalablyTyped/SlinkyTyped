package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputProperties extends InputProperties {
  
  /**
    * When set, defines the input's maximum length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#maxLength)
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * When set, defines the input's minimum length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#minLength)
    */
  var minLength: js.UndefOr[Double] = js.native
}
object TextInputProperties {
  
  @scala.inline
  def apply(): TextInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProperties]
  }
  
  @scala.inline
  implicit class TextInputPropertiesMutableBuilder[Self <: TextInputProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
  }
}
