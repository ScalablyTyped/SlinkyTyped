package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupNameAndArn extends js.Object {
  /**
    * The group ARN.
    */
  var groupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The group name.
    */
  var groupName: js.UndefOr[ThingGroupName] = js.native
}

object GroupNameAndArn {
  @scala.inline
  def apply(): GroupNameAndArn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupNameAndArn]
  }
  @scala.inline
  implicit class GroupNameAndArnOps[Self <: GroupNameAndArn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupArn(value: ThingGroupArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: ThingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupName")(js.undefined)
        ret
    }
  }
  
}

