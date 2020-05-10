package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperChatEventSnippet extends js.Object {
  var amountMicros: js.UndefOr[String] = js.native
  var channelId: js.UndefOr[String] = js.native
  var commentText: js.UndefOr[String] = js.native
  var createdAt: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var displayString: js.UndefOr[String] = js.native
  var isSuperChatForGood: js.UndefOr[Boolean] = js.native
  var isSuperStickerEvent: js.UndefOr[Boolean] = js.native
  var messageType: js.UndefOr[Double] = js.native
  var nonprofit: js.UndefOr[Nonprofit] = js.native
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.native
  var supporterDetails: js.UndefOr[ChannelProfileDetails] = js.native
}

object SuperChatEventSnippet {
  @scala.inline
  def apply(): SuperChatEventSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuperChatEventSnippet]
  }
  @scala.inline
  implicit class SuperChatEventSnippetOps[Self <: SuperChatEventSnippet] (val x: Self) extends AnyVal {
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
    def withIsSuperChatForGood(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuperChatForGood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSuperChatForGood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuperChatForGood")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSuperStickerEvent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuperStickerEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSuperStickerEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSuperStickerEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageType")(js.undefined)
        ret
    }
    @scala.inline
    def withNonprofit(value: Nonprofit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonprofit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonprofit")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperStickerMetadata(value: SuperStickerMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superStickerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperStickerMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superStickerMetadata")(js.undefined)
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

