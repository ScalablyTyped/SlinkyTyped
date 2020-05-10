package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryAudit extends Entity {
  /**
    * Indicates the date and time the activity was performed. The Timestamp type is always in UTC time. For example, midnight
    * UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var activityDateTime: js.UndefOr[String] = js.native
  /**
    * Indicates the activity name or the operation name (examples: 'Create User' and 'Add member to group'). For full list,
    * see Azure AD activity list.
    */
  var activityDisplayName: js.UndefOr[String] = js.native
  // Indicates additional details on the activity.
  var additionalDetails: js.UndefOr[js.Array[KeyValue]] = js.native
  /**
    * Indicates which resource category that's targeted by the activity. (For example: User Management, Group Management
    * etc..)
    */
  var category: js.UndefOr[String] = js.native
  /**
    * Indicates a unique ID that helps correlate activities that span across various services. Can be used to trace logs
    * across services.
    */
  var correlationId: js.UndefOr[String] = js.native
  // Indicates information about the user or app initiated the activity.
  var initiatedBy: js.UndefOr[AuditActivityInitiator] = js.native
  /**
    * Indicates information on which service initiated the activity (For example: Self-service Password Management, Core
    * Directory, B2C, Invited Users, Microsoft Identity Manager, Privileged Identity Management.
    */
  var loggedByService: js.UndefOr[String] = js.native
  var operationType: js.UndefOr[String] = js.native
  // Indicates the result of the activity.Possible values are: success, failure, timeout, unknownFutureValue.
  var result: js.UndefOr[OperationResult] = js.native
  // Describes cause of 'failure' or 'timeout' results.
  var resultReason: js.UndefOr[String] = js.native
  /**
    * Indicates information on which resource was changed due to the activity. Target Resource Type can be User, Device,
    * Directory, App, Role, Group, Policy or Other.
    */
  var targetResources: js.UndefOr[js.Array[TargetResource]] = js.native
}

object DirectoryAudit {
  @scala.inline
  def apply(): DirectoryAudit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryAudit]
  }
  @scala.inline
  implicit class DirectoryAuditOps[Self <: DirectoryAudit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalDetails(value: js.Array[KeyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withCorrelationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorrelationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationId")(js.undefined)
        ret
    }
    @scala.inline
    def withInitiatedBy(value: AuditActivityInitiator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitiatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initiatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLoggedByService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggedByService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoggedByService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggedByService")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: OperationResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withResultReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultReason")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResources(value: js.Array[TargetResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResources")(js.undefined)
        ret
    }
  }
  
}

