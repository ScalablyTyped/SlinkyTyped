package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.MessageDefinition
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMessageDefinition extends js.Object {
  var body: MessageDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageDefinition
}

object Anon_BodyHeadersMessageDefinition {
  @scala.inline
  def apply(
    body: MessageDefinition,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.MessageDefinition,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMessageDefinition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMessageDefinition]
  }
}

