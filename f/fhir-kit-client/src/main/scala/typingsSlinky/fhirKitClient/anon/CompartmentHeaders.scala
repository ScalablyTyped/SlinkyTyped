package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompartmentHeaders extends js.Object {
  var compartment: typingsSlinky.fhirKitClient.mod.Compartment
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.mod.ResourceType
  var searchParams: js.UndefOr[typingsSlinky.fhirKitClient.mod.SearchParams] = js.undefined
}

object CompartmentHeaders {
  @scala.inline
  def apply(
    compartment: typingsSlinky.fhirKitClient.mod.Compartment,
    resourceType: typingsSlinky.fhirKitClient.mod.ResourceType,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null,
    searchParams: typingsSlinky.fhirKitClient.mod.SearchParams = null
  ): CompartmentHeaders = {
    val __obj = js.Dynamic.literal(compartment = compartment.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompartmentHeaders]
  }
}

