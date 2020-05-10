package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOpsItemRequest extends js.Object {
  /**
    * Specify a new category for an OpsItem.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.native
  /**
    * Update the information about the OpsItem. Provide enough information so that users reading this OpsItem for the first time understand the issue. 
    */
  var Description: js.UndefOr[OpsItemDescription] = js.native
  /**
    * The Amazon Resource Name (ARN) of an SNS topic where notifications are sent when this OpsItem is edited or changed.
    */
  var Notifications: js.UndefOr[OpsItemNotifications] = js.native
  /**
    * Add new keys or edit existing key-value pairs of the OperationalData map in the OpsItem object. Operational data is custom data that provides useful reference details about the OpsItem. For example, you can specify log files, error strings, license keys, troubleshooting tips, or other relevant data. You enter operational data as key-value pairs. The key has a maximum length of 128 characters. The value has a maximum size of 20 KB.  Operational data keys can't begin with the following: amazon, aws, amzn, ssm, /amazon, /aws, /amzn, /ssm.  You can choose to make the data searchable by other users in the account or you can restrict search access. Searchable data means that all users with access to the OpsItem Overview page (as provided by the DescribeOpsItems API action) can view and search on the specified data. Operational data that is not searchable is only viewable by users who have access to the OpsItem (as provided by the GetOpsItem API action). Use the /aws/resources key in OperationalData to specify a related resource in the request. Use the /aws/automations key in OperationalData to associate an Automation runbook with the OpsItem. To view AWS CLI example commands that use these keys, see Creating OpsItems Manually in the AWS Systems Manager User Guide.
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.native
  /**
    * Keys that you want to remove from the OperationalData map.
    */
  var OperationalDataToDelete: js.UndefOr[OpsItemOpsDataKeysList] = js.native
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: typingsSlinky.awsSdk.ssmMod.OpsItemId = js.native
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.native
  /**
    * One or more OpsItems that share something in common with the current OpsItems. For example, related OpsItems can include OpsItems with similar error messages, impacted resources, or statuses for the impacted resource.
    */
  var RelatedOpsItems: js.UndefOr[typingsSlinky.awsSdk.ssmMod.RelatedOpsItems] = js.native
  /**
    * Specify a new severity for an OpsItem.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.native
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved. For more information, see Editing OpsItem Details in the AWS Systems Manager User Guide.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.native
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.native
}

object UpdateOpsItemRequest {
  @scala.inline
  def apply(OpsItemId: OpsItemId): UpdateOpsItemRequest = {
    val __obj = js.Dynamic.literal(OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOpsItemRequest]
  }
  @scala.inline
  implicit class UpdateOpsItemRequestOps[Self <: UpdateOpsItemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpsItemId(value: OpsItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OpsItemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategory(value: OpsItemCategory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Category")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: OpsItemDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: OpsItemNotifications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationalData(value: OpsItemOperationalData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationalData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationalData")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationalDataToDelete(value: OpsItemOpsDataKeysList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationalDataToDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalDataToDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperationalDataToDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: OpsItemPriority): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRelatedOpsItems(value: RelatedOpsItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedOpsItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedOpsItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelatedOpsItems")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: OpsItemSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Severity")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: OpsItemStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: OpsItemTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
  }
  
}

