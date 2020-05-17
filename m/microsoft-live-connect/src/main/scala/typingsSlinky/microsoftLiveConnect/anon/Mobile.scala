package typingsSlinky.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mobile extends js.Object {
  /**
    * The user's business phone number, or null if one is not
    * specified.
    */
  var business: String = js.native
  /**
    * The user's mobile phone number, or null if one is not specified.
    */
  var mobile: String = js.native
  /**
    * The user's personal phone number, or null if one is not
    * specified.
    */
  var personal: String = js.native
}

object Mobile {
  @scala.inline
  def apply(business: String, mobile: String, personal: String): Mobile = {
    val __obj = js.Dynamic.literal(business = business.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], personal = personal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  @scala.inline
  implicit class MobileOps[Self <: Mobile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusiness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

