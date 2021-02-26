package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultDisplayField extends StObject {
  
  /** The display label for the property. */
  var label: js.UndefOr[String] = js.native
  
  /** The operator name of the property. */
  var operatorName: js.UndefOr[String] = js.native
  
  /** The name value pair for the property. */
  var property: js.UndefOr[NamedProperty] = js.native
}
object ResultDisplayField {
  
  @scala.inline
  def apply(): ResultDisplayField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultDisplayField]
  }
  
  @scala.inline
  implicit class ResultDisplayFieldMutableBuilder[Self <: ResultDisplayField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    @scala.inline
    def setProperty(value: NamedProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
