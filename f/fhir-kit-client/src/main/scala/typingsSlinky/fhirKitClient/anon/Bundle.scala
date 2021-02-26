package typingsSlinky.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle[T /* <: String */] extends StObject {
  
  var bundle: typingsSlinky.fhir.fhir.Bundle with Type[T] = js.native
  
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
}
object Bundle {
  
  @scala.inline
  def apply[T /* <: String */](bundle: typingsSlinky.fhir.fhir.Bundle with Type[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  
  @scala.inline
  implicit class BundleMutableBuilder[Self <: Bundle[_], T /* <: String */] (val x: Self with Bundle[T]) extends AnyVal {
    
    @scala.inline
    def setBundle(value: typingsSlinky.fhir.fhir.Bundle with Type[T]): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typingsSlinky.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
