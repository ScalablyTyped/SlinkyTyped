package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.ImplementationGuide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyImplementationGuide extends js.Object {
  var body: ImplementationGuide
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide
}

object BodyImplementationGuide {
  @scala.inline
  def apply(
    body: ImplementationGuide,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.ImplementationGuide,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyImplementationGuide = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyImplementationGuide]
  }
}

