package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  /**
    * The settings for a yes/no split activity. This type of activity sends participants down one of two paths in a journey, based on conditions that you specify.
    */
  var ConditionalSplit: js.UndefOr[ConditionalSplitActivity] = js.native
  /**
    * The custom description of the activity.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The settings for an email activity. This type of activity sends an email message to participants.
    */
  var EMAIL: js.UndefOr[EmailMessageActivity] = js.native
  /**
    * The settings for a holdout activity. This type of activity stops a journey for a specified percentage of participants.
    */
  var Holdout: js.UndefOr[HoldoutActivity] = js.native
  /**
    * The settings for a multivariate split activity. This type of activity sends participants down one of as many as five paths (including a default Else path) in a journey, based on conditions that you specify.
    */
  var MultiCondition: js.UndefOr[MultiConditionalSplitActivity] = js.native
  /**
    * The settings for a random split activity. This type of activity randomly sends specified percentages of participants down one of as many as five paths in a journey, based on conditions that you specify.
    */
  var RandomSplit: js.UndefOr[RandomSplitActivity] = js.native
  /**
    * The settings for a wait activity. This type of activity waits for a certain amount of time or until a specific date and time before moving participants to the next activity in a journey.
    */
  var Wait: js.UndefOr[WaitActivity] = js.native
}

object Activity {
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionalSplit(value: ConditionalSplitActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConditionalSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
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
    def withEMAIL(value: EmailMessageActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EMAIL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEMAIL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EMAIL")(js.undefined)
        ret
    }
    @scala.inline
    def withHoldout(value: HoldoutActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Holdout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoldout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Holdout")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiCondition(value: MultiConditionalSplitActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withRandomSplit(value: RandomSplitActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RandomSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRandomSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RandomSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: WaitActivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wait")(js.undefined)
        ret
    }
  }
  
}

