package typingsSlinky.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountLimitsInput extends js.Object {
  /**
    * A string that identifies the next page of limits that you want to retrieve.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsCloudformationMod.NextToken] = js.native
}

object DescribeAccountLimitsInput {
  @scala.inline
  def apply(NextToken: NextToken = null): DescribeAccountLimitsInput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountLimitsInput]
  }
}

