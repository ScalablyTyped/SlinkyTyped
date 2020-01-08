package typingsSlinky.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceAssociationsStatusResult extends js.Object {
  /**
    * Status information about the association.
    */
  var InstanceAssociationStatusInfos: js.UndefOr[typingsSlinky.awsDashSdk.clientsSsmMod.InstanceAssociationStatusInfos] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeInstanceAssociationsStatusResult {
  @scala.inline
  def apply(InstanceAssociationStatusInfos: InstanceAssociationStatusInfos = null, NextToken: NextToken = null): DescribeInstanceAssociationsStatusResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceAssociationStatusInfos != null) __obj.updateDynamic("InstanceAssociationStatusInfos")(InstanceAssociationStatusInfos.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceAssociationsStatusResult]
  }
}

