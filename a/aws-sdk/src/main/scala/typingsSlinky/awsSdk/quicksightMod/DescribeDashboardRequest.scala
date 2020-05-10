package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDashboardRequest extends js.Object {
  /**
    * The alias name.
    */
  var AliasName: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The ID of the AWS account that contains the dashboard that you're describing.
    */
  var AwsAccountId: typingsSlinky.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The version number for the dashboard. If a version number isn't passed, the latest published dashboard version is described. 
    */
  var VersionNumber: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DescribeDashboardRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId): DescribeDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardRequest]
  }
  @scala.inline
  implicit class DescribeDashboardRequestOps[Self <: DescribeDashboardRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashboardId(value: RestrictiveResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasName(value: AliasName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AliasName")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionNumber(value: VersionNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(js.undefined)
        ret
    }
  }
  
}

