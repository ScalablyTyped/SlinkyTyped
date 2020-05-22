package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.TestReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyTestReport extends js.Object {
  var body: TestReport
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.TestReport
}

object BodyTestReport {
  @scala.inline
  def apply(
    body: TestReport,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.TestReport,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyTestReport = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyTestReport]
  }
}

