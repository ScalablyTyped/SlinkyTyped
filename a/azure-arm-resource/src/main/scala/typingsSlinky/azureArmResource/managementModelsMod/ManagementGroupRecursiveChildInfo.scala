package typingsSlinky.azureArmResource.managementModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagementGroupRecursiveChildInfo extends js.Object {
  var childId: js.UndefOr[String] = js.native
  var childType: js.UndefOr[String] = js.native
  var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var tenantId: js.UndefOr[String] = js.native
}

object ManagementGroupRecursiveChildInfo {
  @scala.inline
  def apply(): ManagementGroupRecursiveChildInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagementGroupRecursiveChildInfo]
  }
  @scala.inline
  implicit class ManagementGroupRecursiveChildInfoOps[Self <: ManagementGroupRecursiveChildInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childId")(js.undefined)
        ret
    }
    @scala.inline
    def withChildType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childType")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(js.undefined)
        ret
    }
  }
  
}

