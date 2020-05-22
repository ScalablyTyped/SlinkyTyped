package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Substance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodySubstanceHeadersHeaders extends js.Object {
  var body: Substance
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Substance
}

object BodySubstanceHeadersHeaders {
  @scala.inline
  def apply(
    body: Substance,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Substance,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodySubstanceHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySubstanceHeadersHeaders]
  }
}

