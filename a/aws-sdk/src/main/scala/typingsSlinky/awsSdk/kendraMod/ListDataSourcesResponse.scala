package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Kendra returns this token that you can use in the subsequent request to retrieve the next set of data sources. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.kendraMod.NextToken] = js.native
  /**
    * An array of summary information for one or more data sources.
    */
  var SummaryItems: js.UndefOr[DataSourceSummaryList] = js.native
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
  @scala.inline
  implicit class ListDataSourcesResponseOps[Self <: ListDataSourcesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSummaryItems(value: DataSourceSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryItems")(js.undefined)
        ret
    }
  }
  
}

