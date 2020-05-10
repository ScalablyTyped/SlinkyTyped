package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalOffer extends js.Object {
  /** Client's AdWords page URL. */
  var adwordsUrl: js.UndefOr[String] = js.native
  /** Email address for client. */
  var clientEmail: js.UndefOr[String] = js.native
  /** ID of client. */
  var clientId: js.UndefOr[String] = js.native
  /** Name of the client. */
  var clientName: js.UndefOr[String] = js.native
  /** Time offer was first created. */
  var creationTime: js.UndefOr[String] = js.native
  /** Time this offer expires. */
  var expirationTime: js.UndefOr[String] = js.native
  /** Time last action was taken. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /** Offer code. */
  var offerCode: js.UndefOr[String] = js.native
  /** Country Code for the offer country. */
  var offerCountryCode: js.UndefOr[String] = js.native
  /** Type of offer. */
  var offerType: js.UndefOr[String] = js.native
  /** Name (First + Last) of the partners user to whom the incentive is allocated. */
  var senderName: js.UndefOr[String] = js.native
  /** Status of the offer. */
  var status: js.UndefOr[String] = js.native
}

object HistoricalOffer {
  @scala.inline
  def apply(): HistoricalOffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoricalOffer]
  }
  @scala.inline
  implicit class HistoricalOfferOps[Self <: HistoricalOffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdwordsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdwordsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adwordsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClientEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerCountryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerType")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

