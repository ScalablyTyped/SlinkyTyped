package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPromotion extends js.Object {
  /**
    * [required] Amount of the promotion. The values here are the promotion
    * applied to the unit price pretax and to the total of the tax amounts.
    */
  var promotionAmount: js.UndefOr[SchemaAmount] = js.native
  /**
    * [required] ID of the promotion.
    */
  var promotionId: js.UndefOr[String] = js.native
}

object SchemaPromotion {
  @scala.inline
  def apply(): SchemaPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotion]
  }
  @scala.inline
  implicit class SchemaPromotionOps[Self <: SchemaPromotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromotionAmount(value: SchemaAmount): Self = {
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

