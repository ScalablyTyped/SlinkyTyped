package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationHistoryResponse extends js.Object {
  /**
    *  The list of configuration events and their corresponding details. 
    */
  var EventList: js.UndefOr[ConfigurationEventList] = js.native
  /**
    * The NextToken value to include in a future ListConfigurationHistory request. When the results of a ListConfigurationHistory request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListConfigurationHistoryResponse {
  @scala.inline
  def apply(): ListConfigurationHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationHistoryResponse]
  }
  @scala.inline
  implicit class ListConfigurationHistoryResponseOps[Self <: ListConfigurationHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventList(value: ConfigurationEventList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventList")(js.undefined)
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
  }
  
}

