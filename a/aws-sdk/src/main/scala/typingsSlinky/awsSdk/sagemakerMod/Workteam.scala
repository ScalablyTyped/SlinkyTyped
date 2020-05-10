package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Workteam extends js.Object {
  /**
    * The date and time that the work team was created (timestamp).
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the work team.
    */
  var Description: String200 = js.native
  /**
    * The date and time that the work team was last updated (timestamp).
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Cognito user groups that make up the work team.
    */
  var MemberDefinitions: typingsSlinky.awsSdk.sagemakerMod.MemberDefinitions = js.native
  /**
    * Configures SNS notifications of available or expiring work items for work teams.
    */
  var NotificationConfiguration: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NotificationConfiguration] = js.native
  /**
    * The Amazon Marketplace identifier for a vendor's work team.
    */
  var ProductListingIds: js.UndefOr[ProductListings] = js.native
  /**
    * The URI of the labeling job's user interface. Workers open this URI to start labeling your data objects.
    */
  var SubDomain: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the work team.
    */
  var WorkteamArn: typingsSlinky.awsSdk.sagemakerMod.WorkteamArn = js.native
  /**
    * The name of the work team.
    */
  var WorkteamName: typingsSlinky.awsSdk.sagemakerMod.WorkteamName = js.native
}

object Workteam {
  @scala.inline
  def apply(
    Description: String200,
    MemberDefinitions: MemberDefinitions,
    WorkteamArn: WorkteamArn,
    WorkteamName: WorkteamName
  ): Workteam = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], MemberDefinitions = MemberDefinitions.asInstanceOf[js.Any], WorkteamArn = WorkteamArn.asInstanceOf[js.Any], WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Workteam]
  }
  @scala.inline
  implicit class WorkteamOps[Self <: Workteam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String200): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberDefinitions(value: MemberDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkteamArn(value: WorkteamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkteamName(value: WorkteamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationConfiguration(value: NotificationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotificationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withProductListingIds(value: ProductListings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductListingIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductListingIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductListingIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSubDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubDomain")(js.undefined)
        ret
    }
  }
  
}

