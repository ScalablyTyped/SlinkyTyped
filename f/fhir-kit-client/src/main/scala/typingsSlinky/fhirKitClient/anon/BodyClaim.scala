package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Claim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyClaim extends js.Object {
  
  var body: Claim = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Claim = js.native
}
object BodyClaim {
  
  @scala.inline
  def apply(body: Claim, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Claim): BodyClaim = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyClaim]
  }
  
  @scala.inline
  implicit class BodyClaimOps[Self <: BodyClaim] (val x: Self) extends AnyVal {
    
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
    def setBody(value: Claim): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Claim): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
