package typingsSlinky.fhirKitClient

import typingsSlinky.fhirKitClient.fhirKitClientStrings.Basic
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResourceTypeVersion extends js.Object {
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: Basic
  var version: String
}

object AnonResourceTypeVersion {
  @scala.inline
  def apply(id: String, resourceType: Basic, version: String, headers: Headers = null, options: Options = null): AnonResourceTypeVersion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResourceTypeVersion]
  }
}

