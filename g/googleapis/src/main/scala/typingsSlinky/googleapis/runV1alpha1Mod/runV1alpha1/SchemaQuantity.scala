package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The view model of a single quantity, e.g. &quot;800 MiB&quot;. Corresponds
  * to
  * https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/generated.proto
  */
@js.native
trait SchemaQuantity extends js.Object {
  /**
    * Stringified version of the quantity, e.g., &quot;800 MiB&quot;.
    */
  var string: js.UndefOr[String] = js.native
}

object SchemaQuantity {
  @scala.inline
  def apply(): SchemaQuantity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuantity]
  }
  @scala.inline
  implicit class SchemaQuantityOps[Self <: SchemaQuantity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
  }
  
}

