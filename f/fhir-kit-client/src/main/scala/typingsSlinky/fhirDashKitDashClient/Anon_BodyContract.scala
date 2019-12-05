package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Contract
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyContract extends js.Object {
  var body: Contract
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Contract
}

object Anon_BodyContract {
  @scala.inline
  def apply(
    body: Contract,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Contract,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyContract = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyContract]
  }
}

