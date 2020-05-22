package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compartment extends js.Object {
  var compartment: js.UndefOr[typingsSlinky.fhirKitClient.mod.Compartment] = js.undefined
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.mod.ResourceType
  var searchParams: js.UndefOr[typingsSlinky.fhirKitClient.mod.SearchParams] = js.undefined
}

object Compartment {
  @scala.inline
  def apply(
    resourceType: typingsSlinky.fhirKitClient.mod.ResourceType,
    compartment: typingsSlinky.fhirKitClient.mod.Compartment = null,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null,
    searchParams: typingsSlinky.fhirKitClient.mod.SearchParams = null
  ): Compartment = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    if (compartment != null) __obj.updateDynamic("compartment")(compartment.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compartment]
  }
}

