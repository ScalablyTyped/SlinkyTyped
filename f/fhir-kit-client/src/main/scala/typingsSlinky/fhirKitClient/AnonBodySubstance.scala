package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.Substance
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodySubstance extends js.Object {
  var body: Substance
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Substance
}

object AnonBodySubstance {
  @scala.inline
  def apply(
    body: Substance,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Substance,
    headers: Headers = null,
    options: Options = null
  ): AnonBodySubstance = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodySubstance]
  }
}

