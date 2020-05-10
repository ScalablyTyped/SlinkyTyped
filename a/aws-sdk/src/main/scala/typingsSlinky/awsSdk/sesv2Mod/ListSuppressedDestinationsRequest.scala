package typingsSlinky.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSuppressedDestinationsRequest extends js.Object {
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list before a specific date. The date that you specify should be in Unix time format.
    */
  var EndDate: js.UndefOr[js.Date] = js.native
  /**
    * A token returned from a previous call to ListSuppressedDestinations to indicate the position in the list of suppressed email addresses.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListSuppressedDestinations. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The factors that caused the email address to be added to .
    */
  var Reasons: js.UndefOr[SuppressionListReasons] = js.native
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list after a specific date. The date that you specify should be in Unix time format.
    */
  var StartDate: js.UndefOr[js.Date] = js.native
}

object ListSuppressedDestinationsRequest {
  @scala.inline
  def apply(): ListSuppressedDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuppressedDestinationsRequest]
  }
  @scala.inline
  implicit class ListSuppressedDestinationsRequestOps[Self <: ListSuppressedDestinationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withPageSize(value: MaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReasons(value: SuppressionListReasons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reasons")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDate")(js.undefined)
        ret
    }
  }
  
}

