package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ResearchSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyResearchSubjectHeadersHeaders extends js.Object {
  var body: ResearchSubject
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ResearchSubject
}

object BodyResearchSubjectHeadersHeaders {
  @scala.inline
  def apply(
    body: ResearchSubject,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ResearchSubject,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyResearchSubjectHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyResearchSubjectHeadersHeaders]
  }
}

