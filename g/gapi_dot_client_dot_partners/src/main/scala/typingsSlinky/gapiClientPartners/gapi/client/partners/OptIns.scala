package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptIns extends js.Object {
  /**
    * An opt-in about receiving email from Partners marketing teams. Includes
    * member-only events and special promotional offers for Google products.
    */
  var marketComm: js.UndefOr[Boolean] = js.native
  /**
    * An opt-in about receiving email with customized AdWords campaign management
    * tips.
    */
  var performanceSuggestions: js.UndefOr[Boolean] = js.native
  /** An opt-in to allow recieivng phone calls about their Partners account. */
  var phoneContact: js.UndefOr[Boolean] = js.native
  /** An opt-in to receive special promotional gifts and material in the mail. */
  var physicalMail: js.UndefOr[Boolean] = js.native
  /** An opt-in about receiving email regarding new features and products. */
  var specialOffers: js.UndefOr[Boolean] = js.native
}

object OptIns {
  @scala.inline
  def apply(): OptIns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptIns]
  }
  @scala.inline
  implicit class OptInsOps[Self <: OptIns] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarketComm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketComm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketComm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketComm")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoneContact(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneContact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoneContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneContact")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalMail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalMail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalMail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("physicalMail")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecialOffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialOffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecialOffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialOffers")(js.undefined)
        ret
    }
  }
  
}

