package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.StructureMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyStructureMapHeadersHeaders extends js.Object {
  var body: StructureMap
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.StructureMap
}

object BodyStructureMapHeadersHeaders {
  @scala.inline
  def apply(
    body: StructureMap,
    id: String,
    resourceType: typingsSlinky.fhirKitClient.fhirKitClientStrings.StructureMap,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyStructureMapHeadersHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyStructureMapHeadersHeaders]
  }
}

