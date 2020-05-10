package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceInformationResult extends js.Object {
  /**
    * The instance information list.
    */
  var InstanceInformationList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.InstanceInformationList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeInstanceInformationResult {
  @scala.inline
  def apply(): DescribeInstanceInformationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationResult]
  }
  @scala.inline
  implicit class DescribeInstanceInformationResultOps[Self <: DescribeInstanceInformationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceInformationList(value: InstanceInformationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInformationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceInformationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceInformationList")(js.undefined)
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

