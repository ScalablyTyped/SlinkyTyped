package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAggregateDiscoveredResourcesResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.NextToken] = js.native
  /**
    * Returns a list of ResourceIdentifiers objects.
    */
  var ResourceIdentifiers: js.UndefOr[DiscoveredResourceIdentifierList] = js.native
}

object ListAggregateDiscoveredResourcesResponse {
  @scala.inline
  def apply(): ListAggregateDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAggregateDiscoveredResourcesResponse]
  }
  @scala.inline
  implicit class ListAggregateDiscoveredResourcesResponseOps[Self <: ListAggregateDiscoveredResourcesResponse] (val x: Self) extends AnyVal {
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
    def withResourceIdentifiers(value: DiscoveredResourceIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(js.undefined)
        ret
    }
  }
  
}

