package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceConfigHistoryResponse extends js.Object {
  /**
    * A list that contains the configuration history of one or more resources.
    */
  var configurationItems: js.UndefOr[ConfigurationItemList] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetResourceConfigHistoryResponse {
  @scala.inline
  def apply(): GetResourceConfigHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceConfigHistoryResponse]
  }
  @scala.inline
  implicit class GetResourceConfigHistoryResponseOps[Self <: GetResourceConfigHistoryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationItems(value: ConfigurationItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationItems")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
  }
  
}

