package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Provenance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyProvenanceHeadersHeaders extends js.Object {
  var body: Provenance
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Provenance
}

object BodyProvenanceHeadersHeaders {
  @scala.inline
  def apply(
    body: Provenance,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Provenance,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyProvenanceHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProvenanceHeadersHeaders]
  }
}

