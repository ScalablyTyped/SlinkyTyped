package typingsSlinky.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Patient in context
  */
@js.native
trait Patient extends js.Object {
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
  implicit class PatientOps[Self <: Patient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: Api): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRead(value: () => js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

