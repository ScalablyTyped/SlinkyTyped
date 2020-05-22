package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.OperationOutcome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOperationOutcome extends js.Object {
  var body: OperationOutcome
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.OperationOutcome
}

object BodyOperationOutcome {
  @scala.inline
  def apply(
    body: OperationOutcome,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.OperationOutcome,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyOperationOutcome = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOperationOutcome]
  }
}

