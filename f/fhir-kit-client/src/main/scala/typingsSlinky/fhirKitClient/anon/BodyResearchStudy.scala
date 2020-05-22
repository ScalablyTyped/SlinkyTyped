package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ResearchStudy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyResearchStudy extends js.Object {
  var body: ResearchStudy
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ResearchStudy
}

object BodyResearchStudy {
  @scala.inline
  def apply(
    body: ResearchStudy,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ResearchStudy,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyResearchStudy = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyResearchStudy]
  }
}

