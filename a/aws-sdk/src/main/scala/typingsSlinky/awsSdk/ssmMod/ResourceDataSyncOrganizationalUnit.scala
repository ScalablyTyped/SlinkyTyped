package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncOrganizationalUnit extends js.Object {
  /**
    * The AWS Organization unit ID data source for the sync.
    */
  var OrganizationalUnitId: js.UndefOr[ResourceDataSyncOrganizationalUnitId] = js.native
}

object ResourceDataSyncOrganizationalUnit {
  @scala.inline
  def apply(): ResourceDataSyncOrganizationalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataSyncOrganizationalUnit]
  }
  @scala.inline
  implicit class ResourceDataSyncOrganizationalUnitOps[Self <: ResourceDataSyncOrganizationalUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationalUnitId(value: ResourceDataSyncOrganizationalUnitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnitId")(js.undefined)
        ret
    }
  }
  
}

