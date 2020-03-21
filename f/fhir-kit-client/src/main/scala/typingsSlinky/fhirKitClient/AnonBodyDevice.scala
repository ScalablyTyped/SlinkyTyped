package typingsSlinky.fhirKitClient

import typingsSlinky.fhir.fhir.Device
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDevice extends js.Object {
  var body: Device
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Device
}

object AnonBodyDevice {
  @scala.inline
  def apply(
    body: Device,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.Device,
    headers: Headers = null,
    options: Options = null
  ): AnonBodyDevice = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyDevice]
  }
}

