package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhirKitClient.fhirKitClientStrings.BodySite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersHeaders extends js.Object {
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var id: String
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: BodySite
}

object HeadersHeaders {
  @scala.inline
  def apply(
    id: String,
    resourceType: BodySite,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): HeadersHeaders = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersHeaders]
  }
}

