package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.ProcessRequest
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyProcessRequest extends js.Object {
  var body: ProcessRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ProcessRequest
}

object AnonBodyProcessRequest {
  @scala.inline
  def apply(
    body: ProcessRequest,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ProcessRequest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyProcessRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyProcessRequest]
  }
}

