package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2TagSet extends js.Object {
  /**
    * A list that contains other lists of EC2 instance tag groups. For an instance to be included in the deployment group, it must be identified by all of the tag groups in the list.
    */
  var ec2TagSetList: js.UndefOr[EC2TagSetList] = js.native
}

object EC2TagSet {
  @scala.inline
  def apply(): EC2TagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2TagSet]
  }
  @scala.inline
  implicit class EC2TagSetOps[Self <: EC2TagSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEc2TagSetList(value: EC2TagSetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSetList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEc2TagSetList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ec2TagSetList")(js.undefined)
        ret
    }
  }
  
}

