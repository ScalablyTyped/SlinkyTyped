package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityFilter extends js.Object {
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  /**
    * A list of IDs for affected entities.
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: eventArnList = js.native
  /**
    * A list of the most recent dates and times that the entity was updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A list of entity status codes (IMPAIRED, UNIMPAIRED, or UNKNOWN).
    */
  var statusCodes: js.UndefOr[entityStatusCodeList] = js.native
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagFilter] = js.native
}

object EntityFilter {
  @scala.inline
  def apply(eventArns: eventArnList): EntityFilter = {
    val __obj = js.Dynamic.literal(eventArns = eventArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFilter]
  }
  @scala.inline
  implicit class EntityFilterOps[Self <: EntityFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventArns(value: eventArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityArns(value: entityArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityArns")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityValues(value: entityValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTimes(value: dateTimeRangeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedTimes")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodes(value: entityStatusCodeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: tagFilter): Self = {
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

