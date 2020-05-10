package typingsSlinky.keycloakConnect.mod

import typingsSlinky.keycloakConnect.AnonRoles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenContent extends js.Object {
  var exp: Double = js.native
  var realm_access: js.UndefOr[AnonRoles] = js.native
  var resource_access: js.UndefOr[js.Any] = js.native
}

object TokenContent {
  @scala.inline
  def apply(exp: Double): TokenContent = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenContent]
  }
  @scala.inline
  implicit class TokenContentOps[Self <: TokenContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealm_access(value: AnonRoles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm_access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealm_access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realm_access")(js.undefined)
        ret
    }
    @scala.inline
    def withResource_access(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource_access: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource_access")(js.undefined)
        ret
    }
  }
  
}

