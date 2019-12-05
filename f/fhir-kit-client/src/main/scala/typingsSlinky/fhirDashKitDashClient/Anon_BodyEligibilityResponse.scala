package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.EligibilityResponse
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyEligibilityResponse extends js.Object {
  var body: EligibilityResponse
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.EligibilityResponse
}

object Anon_BodyEligibilityResponse {
  @scala.inline
  def apply(
    body: EligibilityResponse,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.EligibilityResponse,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyEligibilityResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyEligibilityResponse]
  }
}

