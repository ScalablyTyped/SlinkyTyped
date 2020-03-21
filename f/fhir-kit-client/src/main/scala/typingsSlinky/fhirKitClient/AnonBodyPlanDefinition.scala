package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.PlanDefinition
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyPlanDefinition extends js.Object {
  var body: PlanDefinition
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.PlanDefinition
}

object AnonBodyPlanDefinition {
  @scala.inline
  def apply(
    body: PlanDefinition,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.PlanDefinition,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyPlanDefinition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyPlanDefinition]
  }
}

