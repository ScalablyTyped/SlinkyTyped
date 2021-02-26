package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inherited
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainProperties extends StObject {
  
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The domain type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: js.UndefOr[range | `coded-value` | inherited] = js.native
}
object DomainProperties {
  
  @scala.inline
  def apply(): DomainProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainProperties]
  }
  
  @scala.inline
  implicit class DomainPropertiesMutableBuilder[Self <: DomainProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: range | `coded-value` | inherited): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
