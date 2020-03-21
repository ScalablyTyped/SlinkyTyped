package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.ExpansionProfile
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyExpansionProfileHeadersHeaders extends js.Object {
  var body: ExpansionProfile
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ExpansionProfile
}

object AnonBodyExpansionProfileHeadersHeaders {
  @scala.inline
  def apply(
    body: ExpansionProfile,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ExpansionProfile,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyExpansionProfileHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyExpansionProfileHeadersHeaders]
  }
}

