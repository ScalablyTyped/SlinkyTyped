package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FanFundingEventSnippet extends js.Object {
  /** The amount of funding in micros of fund_currency. e.g., 1 is represented */
  var amountMicros: js.UndefOr[String] = js.native
  /** Channel id where the funding event occurred. */
  var channelId: js.UndefOr[String] = js.native
  /** The text contents of the comment left by the user. */
  var commentText: js.UndefOr[String] = js.native
  /** The date and time when the funding occurred. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var createdAt: js.UndefOr[String] = js.native
  /** The currency in which the fund was made. ISO 4217. */
  var currency: js.UndefOr[String] = js.native
  /** A rendered string that displays the fund amount and currency (e.g., "$1.00"). The string is rendered for the given language. */
  var displayString: js.UndefOr[String] = js.native
  /** Details about the supporter. Only filled if the event was made public by the user. */
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.native
}

object FanFundingEventSnippet {
  @scala.inline
  def apply(): FanFundingEventSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FanFundingEventSnippet]
  }
  @scala.inline
  implicit class FanFundingEventSnippetOps[Self <: FanFundingEventSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountMicros(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(js.undefined)
        ret
    }
    @scala.inline
    def withCommentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commentText")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayString")(js.undefined)
        ret
    }
    @scala.inline
    def withSupporterDetails(value: ChannelProfileDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supporterDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupporterDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supporterDetails")(js.undefined)
        ret
    }
  }
  
}

