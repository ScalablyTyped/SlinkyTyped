package typingsSlinky.fhirKitClient

import typingsSlinky.fhirKitClient.fhirKitClientStrings.AuditEvent
import typingsSlinky.jsonPatch.mod.OpPatch
import typingsSlinky.request.mod.Headers
import typingsSlinky.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersIdJSONPatchOptions extends js.Object {
  var JSONPatch: js.Array[OpPatch]
  var headers: js.UndefOr[Headers] = js.undefined
  var id: String
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: AuditEvent
}

object AnonHeadersIdJSONPatchOptions {
  @scala.inline
  def apply(
    JSONPatch: js.Array[OpPatch],
    id: String,
    resourceType: AuditEvent,
    headers: Headers = null,
    options: Options = null
  ): AnonHeadersIdJSONPatchOptions = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeadersIdJSONPatchOptions]
  }
}

