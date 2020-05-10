package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncAwsOrganizationsSource extends js.Object {
  /**
    * If an AWS Organization is present, this is either OrganizationalUnits or EntireOrganization. For OrganizationalUnits, the data is aggregated from a set of organization units. For EntireOrganization, the data is aggregated from the entire AWS Organization. 
    */
  var OrganizationSourceType: ResourceDataSyncOrganizationSourceType = js.native
  /**
    * The AWS Organizations organization units included in the sync.
    */
  var OrganizationalUnits: js.UndefOr[ResourceDataSyncOrganizationalUnitList] = js.native
}

object ResourceDataSyncAwsOrganizationsSource {
  @scala.inline
  def apply(OrganizationSourceType: ResourceDataSyncOrganizationSourceType): ResourceDataSyncAwsOrganizationsSource = {
    val __obj = js.Dynamic.literal(OrganizationSourceType = OrganizationSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncAwsOrganizationsSource]
  }
  @scala.inline
  implicit class ResourceDataSyncAwsOrganizationsSourceOps[Self <: ResourceDataSyncAwsOrganizationsSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrganizationSourceType(value: ResourceDataSyncOrganizationSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizationalUnits(value: ResourceDataSyncOrganizationalUnitList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationalUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OrganizationalUnits")(js.undefined)
        ret
    }
  }
  
}

