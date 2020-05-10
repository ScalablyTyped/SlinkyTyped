package typingsSlinky.paypalRestSdk.mod.invoice

import typingsSlinky.paypalRestSdk.mod.Phone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Participant extends Person {
  var additional_info: js.UndefOr[String] = js.native
  @JSName("email")
  var email_Participant: String = js.native
  var fax: js.UndefOr[Phone] = js.native
}

object Participant {
  @scala.inline
  def apply(email: String): Participant = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Participant]
  }
  @scala.inline
  implicit class ParticipantOps[Self <: Participant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditional_info(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditional_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additional_info")(js.undefined)
        ret
    }
    @scala.inline
    def withFax(value: Phone): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fax")(js.undefined)
        ret
    }
  }
  
}

