package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectResourceConfigResponse extends js.Object {
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * Returns the QueryInfo object.
    */
  var QueryInfo: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.QueryInfo] = js.native
  /**
    * Returns the results for the SQL query.
    */
  var Results: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Results] = js.native
}

object SelectResourceConfigResponse {
  @scala.inline
  def apply(): SelectResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectResourceConfigResponse]
  }
  @scala.inline
  implicit class SelectResourceConfigResponseOps[Self <: SelectResourceConfigResponse] (val x: Self) extends AnyVal {
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
    def withQueryInfo(value: QueryInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withResults(value: Results): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(js.undefined)
        ret
    }
  }
  
}

