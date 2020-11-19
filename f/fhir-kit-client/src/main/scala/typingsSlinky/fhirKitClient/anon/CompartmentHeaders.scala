package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompartmentHeaders extends js.Object {
  
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
  implicit class CompartmentHeadersOps[Self <: CompartmentHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompartment(value: typingsSlinky.fhirKitClient.mod.Compartment): Self = this.set("compartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.mod.ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSearchParams(value: typingsSlinky.fhirKitClient.mod.SearchParams): Self = this.set("searchParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchParams: Self = this.set("searchParams", js.undefined)
  }
}
