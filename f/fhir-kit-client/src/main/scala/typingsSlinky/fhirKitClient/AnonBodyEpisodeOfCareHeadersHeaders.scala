package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.EpisodeOfCare
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyEpisodeOfCareHeadersHeaders extends js.Object {
  var body: EpisodeOfCare
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.EpisodeOfCare
}

object AnonBodyEpisodeOfCareHeadersHeaders {
  @scala.inline
  def apply(
    body: EpisodeOfCare,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.EpisodeOfCare,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyEpisodeOfCareHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyEpisodeOfCareHeadersHeaders]
  }
}

