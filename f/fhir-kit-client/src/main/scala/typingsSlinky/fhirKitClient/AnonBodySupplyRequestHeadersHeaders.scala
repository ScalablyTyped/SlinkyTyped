package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.SupplyRequest
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodySupplyRequestHeadersHeaders extends js.Object {
  var body: SupplyRequest
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.SupplyRequest
}

object AnonBodySupplyRequestHeadersHeaders {
  @scala.inline
  def apply(
    body: SupplyRequest,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.SupplyRequest,
    headers: Headers = null,
    options: Options = null
  ): AnonBodySupplyRequestHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodySupplyRequestHeadersHeaders]
  }
}

