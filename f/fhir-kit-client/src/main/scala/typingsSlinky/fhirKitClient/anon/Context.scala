package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.DomainResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var context: js.UndefOr[typingsSlinky.fhir.fhir.Bundle | DomainResource] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
  
  var reference: String = js.native
}
object Context {
  
  @scala.inline
  def apply(reference: String): Context = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: typingsSlinky.fhir.fhir.Bundle | DomainResource): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
