package typingsSlinky.restIo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofauthorizedResource extends js.Object {
  val ROLES: ADMIN = js.native
  var default: Typeofdefault = js.native
}

object TypeofauthorizedResource {
  @scala.inline
  def apply(ROLES: ADMIN, default: Typeofdefault): TypeofauthorizedResource = {
    val __obj = js.Dynamic.literal(ROLES = ROLES.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofauthorizedResource]
  }
  @scala.inline
  implicit class TypeofauthorizedResourceOps[Self <: TypeofauthorizedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withROLES(value: ADMIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ROLES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: Typeofdefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

