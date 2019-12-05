package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Practitioner
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsPractitioner extends js.Object {
  var body: Practitioner
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Practitioner
}

object Anon_BodyHeadersOptionsPractitioner {
  @scala.inline
  def apply(
    body: Practitioner,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Practitioner,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsPractitioner = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsPractitioner]
  }
}

