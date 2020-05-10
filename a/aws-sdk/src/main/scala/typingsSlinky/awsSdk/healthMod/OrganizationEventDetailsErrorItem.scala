package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationEventDetailsErrorItem extends js.Object {
  /**
    * Error information returned when a DescribeEventDetailsForOrganization operation cannot find a specified event.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  /**
    * A message that describes the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The name of the error.
    */
  var errorName: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typingsSlinky.awsSdk.healthMod.eventArn] = js.native
}

object OrganizationEventDetailsErrorItem {
  @scala.inline
  def apply(): OrganizationEventDetailsErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventDetailsErrorItem]
  }
  @scala.inline
  implicit class OrganizationEventDetailsErrorItemOps[Self <: OrganizationEventDetailsErrorItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsAccountId(value: accountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorName")(js.undefined)
        ret
    }
    @scala.inline
    def withEventArn(value: eventArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArn")(js.undefined)
        ret
    }
  }
  
}

