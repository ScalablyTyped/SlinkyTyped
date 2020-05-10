package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetMetadataResponse extends js.Object {
  /**
    * The identifier used by users to sign in to the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.CompanyCode] = js.native
  /**
    * The time that the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.FleetName] = js.native
  /**
    * The current state of the fleet.
    */
  var FleetStatus: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.FleetStatus] = js.native
  /**
    * The time that the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region.
    */
  var OptimizeForEndUserLocation: js.UndefOr[Boolean] = js.native
}

object DescribeFleetMetadataResponse {
  @scala.inline
  def apply(): DescribeFleetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetMetadataResponse]
  }
  @scala.inline
  implicit class DescribeFleetMetadataResponseOps[Self <: DescribeFleetMetadataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanyCode(value: CompanyCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompanyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetName(value: FleetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetName")(js.undefined)
        ret
    }
    @scala.inline
    def withFleetStatus(value: FleetStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFleetStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FleetStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizeForEndUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeForEndUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizeForEndUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptimizeForEndUserLocation")(js.undefined)
        ret
    }
  }
  
}

