package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.RelatedPerson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyRelatedPerson extends js.Object {
  var body: RelatedPerson
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.RelatedPerson
}

object BodyRelatedPerson {
  @scala.inline
  def apply(
    body: RelatedPerson,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.RelatedPerson,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyRelatedPerson = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRelatedPerson]
  }
}

