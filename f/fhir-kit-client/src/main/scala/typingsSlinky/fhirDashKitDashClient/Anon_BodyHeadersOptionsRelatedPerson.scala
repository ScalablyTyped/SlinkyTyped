package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.RelatedPerson
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersOptionsRelatedPerson extends js.Object {
  var body: RelatedPerson
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.RelatedPerson
}

object Anon_BodyHeadersOptionsRelatedPerson {
  @scala.inline
  def apply(
    body: RelatedPerson,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.RelatedPerson,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersOptionsRelatedPerson = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersOptionsRelatedPerson]
  }
}

