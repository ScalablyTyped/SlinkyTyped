package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promotion extends js.Object {
  var promotionAmount: js.UndefOr[Amount] = js.native
  var promotionId: js.UndefOr[String] = js.native
}

object Promotion {
  @scala.inline
  def apply(): Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotion]
  }
  @scala.inline
  implicit class PromotionOps[Self <: Promotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromotionAmount(value: Amount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionId")(js.undefined)
        ret
    }
  }
  
}

