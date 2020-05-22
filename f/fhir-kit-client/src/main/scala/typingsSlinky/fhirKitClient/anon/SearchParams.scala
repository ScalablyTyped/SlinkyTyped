package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchParams extends js.Object {
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.mod.ResourceType
  var searchParams: typingsSlinky.fhirKitClient.mod.SearchParams
}

object SearchParams {
  @scala.inline
  def apply(
    resourceType: typingsSlinky.fhirKitClient.mod.ResourceType,
    searchParams: typingsSlinky.fhirKitClient.mod.SearchParams,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): SearchParams = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
}

