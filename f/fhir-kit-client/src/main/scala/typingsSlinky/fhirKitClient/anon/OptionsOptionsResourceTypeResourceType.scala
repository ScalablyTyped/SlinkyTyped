package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsOptionsResourceTypeResourceType extends js.Object {
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: js.UndefOr[typingsSlinky.fhirKitClient.mod.ResourceType] = js.undefined
}

object OptionsOptionsResourceTypeResourceType {
  @scala.inline
  def apply(
    headers: typingsSlinky.request.mod.Headers = null,
    id: String = null,
    options: typingsSlinky.request.mod.Options = null,
    resourceType: typingsSlinky.fhirKitClient.mod.ResourceType = null
  ): OptionsOptionsResourceTypeResourceType = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsOptionsResourceTypeResourceType]
  }
}

