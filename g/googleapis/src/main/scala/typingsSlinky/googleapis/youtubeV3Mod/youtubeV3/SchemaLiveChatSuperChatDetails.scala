package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveChatSuperChatDetails extends js.Object {
  /**
    * A rendered string that displays the fund amount and currency to the user.
    */
  var amountDisplayString: js.UndefOr[String] = js.native
  /**
    * The amount purchased by the user, in micros (1,750,000 micros = 1.75).
    */
  var amountMicros: js.UndefOr[String] = js.native
  /**
    * The currency in which the purchase was made.
    */
  var currency: js.UndefOr[String] = js.native
  /**
    * The tier in which the amount belongs. Lower amounts belong to lower
    * tiers. The lowest tier is 1.
    */
  var tier: js.UndefOr[Double] = js.native
  /**
    * The comment added by the user to this Super Chat event.
    */
  var userComment: js.UndefOr[String] = js.native
}

object SchemaLiveChatSuperChatDetails {
  @scala.inline
  def apply(): SchemaLiveChatSuperChatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatSuperChatDetails]
  }
  @scala.inline
  implicit class SchemaLiveChatSuperChatDetailsOps[Self <: SchemaLiveChatSuperChatDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmountDisplayString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountDisplayString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmountDisplayString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amountDisplayString")(js.undefined)
        ret
    }
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
    def withTier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tier")(js.undefined)
        ret
    }
    @scala.inline
    def withUserComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userComment")(js.undefined)
        ret
    }
  }
  
}

