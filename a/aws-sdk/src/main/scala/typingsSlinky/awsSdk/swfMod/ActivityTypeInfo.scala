package typingsSlinky.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityTypeInfo extends js.Object {
  /**
    * The ActivityType type structure representing the activity type.
    */
  var activityType: ActivityType = js.native
  /**
    * The date and time this activity type was created through RegisterActivityType.
    */
  var creationDate: js.Date = js.native
  /**
    * If DEPRECATED, the date and time DeprecateActivityType was called.
    */
  var deprecationDate: js.UndefOr[js.Date] = js.native
  /**
    * The description of the activity type provided in RegisterActivityType.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The current status of the activity type.
    */
  var status: RegistrationStatus = js.native
}

object ActivityTypeInfo {
  @scala.inline
  def apply(activityType: ActivityType, creationDate: js.Date, status: RegistrationStatus): ActivityTypeInfo = {
    val __obj = js.Dynamic.literal(activityType = activityType.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityTypeInfo]
  }
  @scala.inline
  implicit class ActivityTypeInfoOps[Self <: ActivityTypeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityType(value: ActivityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: RegistrationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

