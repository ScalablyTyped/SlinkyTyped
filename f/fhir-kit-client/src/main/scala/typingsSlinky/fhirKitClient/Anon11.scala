package typingsSlinky.fhirKitClient

import typingsSlinky.fhirKitClient.fhirKitClientStrings.EligibilityRequest
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon11 extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: EligibilityRequest
  var version: String
}

object Anon11 {
  @scala.inline
  def apply(
    id: String,
    resourceType: EligibilityRequest,
    version: String,
    headers: Headers = null,
    options: Options = null
  ): Anon11 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon11]
  }
}

