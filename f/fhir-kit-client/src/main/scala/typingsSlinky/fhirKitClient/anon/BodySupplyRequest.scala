package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.SupplyRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySupplyRequest extends js.Object {
  var body: SupplyRequest
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.SupplyRequest
}

object BodySupplyRequest {
  @scala.inline
  def apply(
    body: SupplyRequest,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.SupplyRequest,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodySupplyRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySupplyRequest]
  }
}

