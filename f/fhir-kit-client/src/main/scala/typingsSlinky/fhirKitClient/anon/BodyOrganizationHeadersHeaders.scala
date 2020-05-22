package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Organization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyOrganizationHeadersHeaders extends js.Object {
  var body: Organization
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Organization
}

object BodyOrganizationHeadersHeaders {
  @scala.inline
  def apply(
    body: Organization,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Organization,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyOrganizationHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyOrganizationHeadersHeaders]
  }
}

