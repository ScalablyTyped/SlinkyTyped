package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveChatSuperStickerDetails extends js.Object {
  var amountDisplayString: js.UndefOr[String] = js.native
  var amountMicros: js.UndefOr[String] = js.native
  var currency: js.UndefOr[String] = js.native
  var superStickerMetadata: js.UndefOr[SuperStickerMetadata] = js.native
  var tier: js.UndefOr[Double] = js.native
}

object LiveChatSuperStickerDetails {
  @scala.inline
  def apply(): LiveChatSuperStickerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatSuperStickerDetails]
  }
  @scala.inline
  implicit class LiveChatSuperStickerDetailsOps[Self <: LiveChatSuperStickerDetails] (val x: Self) extends AnyVal {
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
  }
  
}

