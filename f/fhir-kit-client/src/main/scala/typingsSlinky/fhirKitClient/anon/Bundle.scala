package typingsSlinky.fhirKitClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle[T /* <: String */] extends js.Object {
  var bundle: typingsSlinky.fhir.fhir.Bundle with Type[T] = js.native
  var options: js.UndefOr[typingsSlinky.request.mod.Options] = js.native
}

object Bundle {
  @scala.inline
  def apply[T](bundle: typingsSlinky.fhir.fhir.Bundle with Type[T]): Bundle[T] = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[T]]
  }
  @scala.inline
  implicit class BundleOps[Self[t] <: Bundle[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBundle(value: typingsSlinky.fhir.fhir.Bundle with Type[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: typingsSlinky.request.mod.Options): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

