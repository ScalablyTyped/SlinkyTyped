package typingsSlinky.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Patient in context
  */
@js.native
trait Patient extends StObject {
  
  /**
    * Patient scoped fhir.js FHIR API interface. This will ensure that the 'patient' query parameter is passed
    * along with all the API calls which needs a patient context.
    */
  var api: Api = js.native
  
  /**
    * Patient ID
    */
  var id: String = js.native
  
  /**
    * Get the Patient resource in context
    * GET BASEURL/Patient/{id}
    */
  def read(): js.Promise[Response] = js.native
}
object Patient {
  
  @scala.inline
  def apply(api: Api, id: String, read: () => js.Promise[Response]): Patient = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[Patient]
  }
  
  @scala.inline
  implicit class PatientMutableBuilder[Self <: Patient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: Api): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: () => js.Promise[Response]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}
