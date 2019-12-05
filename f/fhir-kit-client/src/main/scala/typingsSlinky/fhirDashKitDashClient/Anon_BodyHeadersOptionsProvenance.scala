package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Provenance
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsProvenance extends js.Object {
  var body: Provenance
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Provenance
}

object Anon_BodyHeadersOptionsProvenance {
  @scala.inline
  def apply(
    body: Provenance,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Provenance,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsProvenance = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsProvenance]
  }
}

