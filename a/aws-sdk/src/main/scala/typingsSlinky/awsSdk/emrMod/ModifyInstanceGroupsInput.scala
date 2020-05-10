package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceGroupsInput extends js.Object {
  /**
    * The ID of the cluster to which the instance group belongs.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.emrMod.ClusterId] = js.native
  /**
    * Instance groups to change.
    */
  var InstanceGroups: js.UndefOr[InstanceGroupModifyConfigList] = js.native
}

object ModifyInstanceGroupsInput {
  @scala.inline
  def apply(): ModifyInstanceGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceGroupsInput]
  }
  @scala.inline
  implicit class ModifyInstanceGroupsInputOps[Self <: ModifyInstanceGroupsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceGroups(value: InstanceGroupModifyConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceGroups")(js.undefined)
        ret
    }
  }
  
}

