package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Account
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountBody extends js.Object {
  var body: Account
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Account
}

object Anon_AccountBody {
  @scala.inline
  def apply(
    body: Account,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Account,
    headers: Headers = null,
    options: Options = null
  ): Anon_AccountBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountBody]
  }
}

