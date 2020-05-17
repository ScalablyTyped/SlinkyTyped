package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.BusinessUserRole
import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessName extends js.Object {
  var businessId: js.UndefOr[Double] = js.native
  var businessName: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var role: js.UndefOr[BusinessUserRole] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

object BusinessName {
  @scala.inline
  def apply(): BusinessName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessName]
  }
  @scala.inline
  implicit class BusinessNameOps[Self <: BusinessName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessId")(js.undefined)
        ret
    }
    @scala.inline
    def withBusinessName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessName")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withRole(value: BusinessUserRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

