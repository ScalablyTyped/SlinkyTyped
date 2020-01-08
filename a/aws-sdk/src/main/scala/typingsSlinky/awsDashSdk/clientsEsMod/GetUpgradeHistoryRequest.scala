package typingsSlinky.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeHistoryRequest extends js.Object {
  var DomainName: typingsSlinky.awsDashSdk.clientsEsMod.DomainName = js.native
  var MaxResults: js.UndefOr[typingsSlinky.awsDashSdk.clientsEsMod.MaxResults] = js.native
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsEsMod.NextToken] = js.native
}

object GetUpgradeHistoryRequest {
  @scala.inline
  def apply(DomainName: DomainName, MaxResults: Int | scala.Double = null, NextToken: NextToken = null): GetUpgradeHistoryRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeHistoryRequest]
  }
}

