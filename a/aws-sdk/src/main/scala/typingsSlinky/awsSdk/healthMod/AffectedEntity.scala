package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AffectedEntity extends js.Object {
  /**
    * The 12-digit AWS account number that contains the affected entity.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  /**
    * The unique identifier for the entity. Format: arn:aws:health:entity-region:aws-account:entity/entity-id . Example: arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K 
    */
  var entityArn: js.UndefOr[typingsSlinky.awsSdk.healthMod.entityArn] = js.native
  /**
    * The URL of the affected entity.
    */
  var entityUrl: js.UndefOr[typingsSlinky.awsSdk.healthMod.entityUrl] = js.native
  /**
    * The ID of the affected entity.
    */
  var entityValue: js.UndefOr[typingsSlinky.awsSdk.healthMod.entityValue] = js.native
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typingsSlinky.awsSdk.healthMod.eventArn] = js.native
  /**
    * The most recent time that the entity was updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The most recent status of the entity affected by the event. The possible values are IMPAIRED, UNIMPAIRED, and UNKNOWN.
    */
  var statusCode: js.UndefOr[entityStatusCode] = js.native
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagSet] = js.native
}

object AffectedEntity {
  @scala.inline
  def apply(): AffectedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffectedEntity]
  }
  @scala.inline
  implicit class AffectedEntityOps[Self <: AffectedEntity] (val x: Self) extends AnyVal {
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
    def withEntityArn(value: entityArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityArn")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityUrl(value: entityUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityValue(value: entityValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValue")(js.undefined)
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
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: entityStatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: tagSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

