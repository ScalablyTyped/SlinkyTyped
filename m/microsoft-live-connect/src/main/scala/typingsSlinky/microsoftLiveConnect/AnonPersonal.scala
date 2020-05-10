package typingsSlinky.microsoftLiveConnect

import typingsSlinky.microsoftLiveConnect.Microsoft.Live.IPostalAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPersonal extends js.Object {
  /**
    * The user's business postal address.
    */
  var business: IPostalAddress = js.native
  /**
    * The user's personal postal address.
    */
  var personal: IPostalAddress = js.native
}

object AnonPersonal {
  @scala.inline
  def apply(business: IPostalAddress, personal: IPostalAddress): AnonPersonal = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPersonal]
  }
  @scala.inline
  implicit class AnonPersonalOps[Self <: AnonPersonal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness(value: IPostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonal(value: IPostalAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

