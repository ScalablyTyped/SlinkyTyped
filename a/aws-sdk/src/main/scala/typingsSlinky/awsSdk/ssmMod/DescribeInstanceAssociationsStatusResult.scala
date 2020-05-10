package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceAssociationsStatusResult extends js.Object {
  /**
    * Status information about the association.
    */
  var InstanceAssociationStatusInfos: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceAssociationStatusInfos] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceAssociationsStatusResult {
  @scala.inline
  def apply(): DescribeInstanceAssociationsStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAssociationsStatusResult]
  }
  @scala.inline
  implicit class DescribeInstanceAssociationsStatusResultOps[Self <: DescribeInstanceAssociationsStatusResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceAssociationStatusInfos(value: InstanceAssociationStatusInfos): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceAssociationStatusInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceAssociationStatusInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceAssociationStatusInfos")(js.undefined)
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

