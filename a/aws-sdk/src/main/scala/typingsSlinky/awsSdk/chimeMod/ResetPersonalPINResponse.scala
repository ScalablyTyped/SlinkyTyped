package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetPersonalPINResponse extends js.Object {
  /**
    * The user details and new personal meeting PIN.
    */
  var User: js.UndefOr[typingsSlinky.awsSdk.chimeMod.User] = js.native
}

object ResetPersonalPINResponse {
  @scala.inline
  def apply(): ResetPersonalPINResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPersonalPINResponse]
  }
  @scala.inline
  implicit class ResetPersonalPINResponseOps[Self <: ResetPersonalPINResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

