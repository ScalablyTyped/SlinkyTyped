package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.AuditEvent
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuditEventBody extends js.Object {
  var body: AuditEvent
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.AuditEvent
}

object Anon_AuditEventBody {
  @scala.inline
  def apply(
    body: AuditEvent,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.AuditEvent,
    headers: Headers = null,
    options: Options = null
  ): Anon_AuditEventBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuditEventBody]
  }
}

