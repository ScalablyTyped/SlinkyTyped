package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Procedure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyProcedure extends StObject {
  
  var body: Procedure = js.native
  
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Procedure = js.native
}
object BodyProcedure {
  
  @scala.inline
  def apply(body: Procedure, resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Procedure): BodyProcedure = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProcedure]
  }
  
  @scala.inline
  implicit class BodyProcedureMutableBuilder[Self <: BodyProcedure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Procedure): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typingsSlinky.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typingsSlinky.fhirKitClient.fhirKitClientStrings.Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
