package typingsSlinky.paypalRestSdk.mod

import typingsSlinky.paypalRestSdk.AnonCancelurl
import typingsSlinky.paypalRestSdk.AnonPaymentmethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Payment_ extends js.Object {
  val create_time: js.UndefOr[String] = js.native
  var experience_profile_id: js.UndefOr[String] = js.native
  val failure_reason: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  var intent: String = js.native
  val links: js.UndefOr[js.Array[Link]] = js.native
  var note_to_payer: js.UndefOr[String] = js.native
  var payer: AnonPaymentmethod = js.native
  var redirect_urls: js.UndefOr[AnonCancelurl] = js.native
  val state: js.UndefOr[String] = js.native
  var transactions: js.Array[Transaction] = js.native
  val update_time: js.UndefOr[String] = js.native
}

object Payment_ {
  @scala.inline
  def apply(intent: String, payer: AnonPaymentmethod, transactions: js.Array[Transaction]): Payment_ = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], payer = payer.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment_]
  }
  @scala.inline
  implicit class Payment_Ops[Self <: Payment_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayer(value: AnonPaymentmethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactions(value: js.Array[Transaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(js.undefined)
        ret
    }
    @scala.inline
    def withExperience_profile_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experience_profile_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperience_profile_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experience_profile_id")(js.undefined)
        ret
    }
    @scala.inline
    def withFailure_reason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailure_reason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure_reason")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[Link]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withNote_to_payer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_to_payer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote_to_payer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note_to_payer")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect_urls(value: AnonCancelurl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect_urls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect_urls")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_time")(js.undefined)
        ret
    }
  }
  
}

