package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventFeedbackType extends js.Object {
  /**
    * The event feedback date.
    */
  var FeedbackDate: js.UndefOr[js.Date] = js.native
  /**
    * The event feedback value.
    */
  var FeedbackValue: FeedbackValueType = js.native
  /**
    * The provider.
    */
  var Provider: StringType = js.native
}

object EventFeedbackType {
  @scala.inline
  def apply(FeedbackValue: FeedbackValueType, Provider: StringType): EventFeedbackType = {
    val __obj = js.Dynamic.literal(FeedbackValue = FeedbackValue.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFeedbackType]
  }
  @scala.inline
  implicit class EventFeedbackTypeOps[Self <: EventFeedbackType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeedbackValue(value: FeedbackValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: StringType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedbackDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeedbackDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackDate")(js.undefined)
        ret
    }
  }
  
}

