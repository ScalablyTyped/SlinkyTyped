package typingsSlinky.fhirDashKitDashClient

import typingsSlinky.fhir.fhir.Medication
import typingsSlinky.request.requestMod.Headers
import typingsSlinky.request.requestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyHeadersMedication extends js.Object {
  var body: Medication
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Medication
}

object Anon_BodyHeadersMedication {
  @scala.inline
  def apply(
    body: Medication,
    resourceType: typingsSlinky.fhirDashKitDashClient.fhirDashKitDashClientStrings.Medication,
    headers: Headers = null,
    options: Options = null
  ): Anon_BodyHeadersMedication = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyHeadersMedication]
  }
}

