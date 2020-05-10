package typingsSlinky.feathersjsAuthentication.mod.AuthHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestrictOptions extends js.Object {
  var idField: String = js.native
  var ownerField: String = js.native
}

object RestrictOptions {
  @scala.inline
  def apply(idField: String, ownerField: String): RestrictOptions = {
    val __obj = js.Dynamic.literal(idField = idField.asInstanceOf[js.Any], ownerField = ownerField.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictOptions]
  }
  @scala.inline
  implicit class RestrictOptionsOps[Self <: RestrictOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerField")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

