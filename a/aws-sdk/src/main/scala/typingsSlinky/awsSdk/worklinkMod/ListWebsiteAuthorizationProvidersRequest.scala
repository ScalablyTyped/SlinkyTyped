package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebsiteAuthorizationProvidersRequest extends js.Object {
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typingsSlinky.awsSdk.worklinkMod.FleetArn = js.native
  /**
    * The maximum number of results to be included in the next page.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.MaxResults] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.NextToken] = js.native
}

object ListWebsiteAuthorizationProvidersRequest {
  @scala.inline
  def apply(FleetArn: FleetArn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListWebsiteAuthorizationProvidersRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersRequest]
  }
}

