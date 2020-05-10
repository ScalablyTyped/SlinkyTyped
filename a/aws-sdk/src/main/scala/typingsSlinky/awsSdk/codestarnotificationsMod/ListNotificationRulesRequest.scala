package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotificationRulesRequest extends js.Object {
  /**
    * The filters to use to return information by service or resource type. For valid values, see ListNotificationRulesFilter.  A filter with the same name can appear more than once when used with OR statements. Filters with different names should be applied with AND statements. 
    */
  var Filters: js.UndefOr[ListNotificationRulesFilters] = js.native
  /**
    * A non-negative integer used to limit the number of returned results. The maximum number of results that can be returned is 100.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.MaxResults] = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.NextToken] = js.native
}

object ListNotificationRulesRequest {
  @scala.inline
  def apply(): ListNotificationRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotificationRulesRequest]
  }
  @scala.inline
  implicit class ListNotificationRulesRequestOps[Self <: ListNotificationRulesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: ListNotificationRulesFilters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
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
  }
  
}

