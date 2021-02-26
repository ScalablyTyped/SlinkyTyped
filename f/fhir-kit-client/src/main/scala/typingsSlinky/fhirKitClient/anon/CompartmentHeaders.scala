package typingsSlinky.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompartmentHeaders extends StObject {
  
  var compartment: typingsSlinky.fhirKitClient.mod.Compartment = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.mod.ResourceType = js.native
  
  var searchParams: js.UndefOr[typingsSlinky.fhirKitClient.mod.SearchParams] = js.native
}
object CompartmentHeaders {
  
  @scala.inline
  def apply(
    compartment: typingsSlinky.fhirKitClient.mod.Compartment,
    resourceType: typingsSlinky.fhirKitClient.mod.ResourceType
  ): CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentHeaders]
  }
  
  @scala.inline
  implicit class CompartmentHeadersMutableBuilder[Self <: CompartmentHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompartment(value: typingsSlinky.fhirKitClient.mod.Compartment): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParams(value: typingsSlinky.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
  }
}
