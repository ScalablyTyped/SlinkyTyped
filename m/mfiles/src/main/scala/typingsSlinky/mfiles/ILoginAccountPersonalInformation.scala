package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoginAccountPersonalInformation extends js.Object {
  val AccountName: String = js.native
  val Email: String = js.native
  val FullName: String = js.native
}

object ILoginAccountPersonalInformation {
  @scala.inline
  def apply(AccountName: String, Email: String, FullName: String): ILoginAccountPersonalInformation = {
    val __obj = js.Dynamic.literal(AccountName = AccountName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FullName = FullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginAccountPersonalInformation]
  }
  @scala.inline
  implicit class ILoginAccountPersonalInformationOps[Self <: ILoginAccountPersonalInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FullName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

