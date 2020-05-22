package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhirKitClient.mod.CustomResource
import typingsSlinky.fhirKitClient.mod.CustomResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyT[T /* <: CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[typingsSlinky.request.mod.Headers] = js.undefined
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
  var resourceType: CustomResourceType
}

object BodyT {
  @scala.inline
  def apply[T](
    body: T,
    resourceType: CustomResourceType,
    headers: typingsSlinky.request.mod.Headers = null,
    options: typingsSlinky.request.mod.Options = null
  ): BodyT[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyT[T]]
  }
}

