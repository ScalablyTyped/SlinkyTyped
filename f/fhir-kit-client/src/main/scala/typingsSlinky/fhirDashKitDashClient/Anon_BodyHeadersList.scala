package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.List
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersList extends js.Object {
  var body: List
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.List
}

object Anon_BodyHeadersList {
  @scala.inline
  def apply(
    body: List,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.List,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersList = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersList]
  }
}

