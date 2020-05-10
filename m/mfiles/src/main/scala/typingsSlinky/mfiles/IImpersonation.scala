package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFImpersonationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImpersonation extends js.Object {
  var Account: String = js.native
  var ImpersonationType: MFImpersonationType = js.native
  var Password: String = js.native
  def Clone(): IImpersonation = js.native
}

object IImpersonation {
  @scala.inline
  def apply(
    Account: String,
    Clone: () => IImpersonation,
    ImpersonationType: MFImpersonationType,
    Password: String
  ): IImpersonation = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), ImpersonationType = ImpersonationType.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImpersonation]
  }
  @scala.inline
  implicit class IImpersonationOps[Self <: IImpersonation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImpersonationType(value: MFImpersonationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImpersonationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

