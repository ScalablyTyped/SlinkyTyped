package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingPromotionsResult extends js.Object {
  /**
    * An identifier to be used in the next call to this operation, to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the offering promotions.
    */
  var offeringPromotions: js.UndefOr[OfferingPromotions] = js.native
}

object ListOfferingPromotionsResult {
  @scala.inline
  def apply(): ListOfferingPromotionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingPromotionsResult]
  }
  @scala.inline
  implicit class ListOfferingPromotionsResultOps[Self <: ListOfferingPromotionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferingPromotions(value: OfferingPromotions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringPromotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferingPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offeringPromotions")(js.undefined)
        ret
    }
  }
  
}

