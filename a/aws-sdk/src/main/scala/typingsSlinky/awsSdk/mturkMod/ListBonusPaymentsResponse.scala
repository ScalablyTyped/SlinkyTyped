package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBonusPaymentsResponse extends js.Object {
  /**
    * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects. 
    */
  var BonusPayments: js.UndefOr[BonusPaymentList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus payments being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListBonusPaymentsResponse {
  @scala.inline
  def apply(): ListBonusPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBonusPaymentsResponse]
  }
  @scala.inline
  implicit class ListBonusPaymentsResponseOps[Self <: ListBonusPaymentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBonusPayments(value: BonusPaymentList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BonusPayments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBonusPayments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BonusPayments")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withNumResults(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumResults")(js.undefined)
        ret
    }
  }
  
}

