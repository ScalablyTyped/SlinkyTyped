package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParametersHeadersHeaders extends js.Object {
  var body: Parameters
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Parameters
}

object BodyParametersHeadersHeaders {
  @scala.inline
  def apply(
    body: Parameters,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Parameters,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyParametersHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyParametersHeadersHeaders]
  }
}

