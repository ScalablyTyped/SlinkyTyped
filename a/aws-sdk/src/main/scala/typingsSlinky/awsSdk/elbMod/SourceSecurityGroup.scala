package typingsSlinky.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSecurityGroup extends js.Object {
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[SecurityGroupName] = js.native
  /**
    * The owner of the security group.
    */
  var OwnerAlias: js.UndefOr[SecurityGroupOwnerAlias] = js.native
}

object SourceSecurityGroup {
  @scala.inline
  def apply(): SourceSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSecurityGroup]
  }
  @scala.inline
  implicit class SourceSecurityGroupOps[Self <: SourceSecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupName(value: SecurityGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerAlias(value: SecurityGroupOwnerAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerAlias")(js.undefined)
        ret
    }
  }
  
}

