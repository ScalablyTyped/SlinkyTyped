package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManagedschema extends js.Object {
  var managed_schema: String = js.native
}

object AnonManagedschema {
  @scala.inline
  def apply(managed_schema: String): AnonManagedschema = {
    val __obj = js.Dynamic.literal(managed_schema = managed_schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManagedschema]
  }
  @scala.inline
  implicit class AnonManagedschemaOps[Self <: AnonManagedschema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManaged_schema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managed_schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

