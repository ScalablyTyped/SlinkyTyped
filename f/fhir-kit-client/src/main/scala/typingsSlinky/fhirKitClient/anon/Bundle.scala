package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bundle[T /* <: String */] extends js.Object {
  var bundle: typingsSlinky.fhir.fhir.Bundle with Type[T]
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.undefined
}

object Bundle {
  @scala.inline
  def apply[T](
    bundle: typingsSlinky.fhir.fhir.Bundle with Type[T],
    options: typingsSlinky.request.mod.Options = null
  ): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
}

