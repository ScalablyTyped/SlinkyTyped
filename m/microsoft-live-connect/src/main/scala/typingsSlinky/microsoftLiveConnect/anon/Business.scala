package typingsSlinky.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Business extends js.Object {
  /**
    * The contact's business email address.
    */
  var business: js.UndefOr[String] = js.native
  /**
    * The contact's "alternate" email address.
    */
  var other: js.UndefOr[String] = js.native
  /**
    * The contact's personal email address.
    */
  var personal: js.UndefOr[String] = js.native
  /**
    * The contact's preferred email address.
    */
  var preferred: js.UndefOr[String] = js.native
}

object Business {
  @scala.inline
  def apply(): Business = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Business]
  }
  @scala.inline
  implicit class BusinessOps[Self <: Business] (val x: Self) extends AnyVal {
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
    def withoutBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personal")(js.undefined)
        ret
    }
    @scala.inline
    def withPreferred(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred")(js.undefined)
        ret
    }
  }
  
}

