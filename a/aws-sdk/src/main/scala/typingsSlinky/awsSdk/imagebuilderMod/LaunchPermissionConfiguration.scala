package typingsSlinky.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPermissionConfiguration extends js.Object {
  /**
    * The name of the group. 
    */
  var userGroups: js.UndefOr[StringList] = js.native
  /**
    *  The AWS account ID. 
    */
  var userIds: js.UndefOr[AccountList] = js.native
}

object LaunchPermissionConfiguration {
  @scala.inline
  def apply(): LaunchPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionConfiguration]
  }
  @scala.inline
  implicit class LaunchPermissionConfigurationOps[Self <: LaunchPermissionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUserGroups(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withUserIds(value: AccountList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userIds")(js.undefined)
        ret
    }
  }
  
}

