package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.AppointmentResponse
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyAppointmentResponse extends js.Object {
  var body: AppointmentResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.AppointmentResponse
}

object AnonBodyAppointmentResponse {
  @scala.inline
  def apply(
    body: AppointmentResponse,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.AppointmentResponse,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyAppointmentResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyAppointmentResponse]
  }
}

