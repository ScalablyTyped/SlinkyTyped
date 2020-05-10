package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsSubscription extends js.Object {
  /**
    * The ARN of a standard.
    */
  var StandardsArn: NonEmptyString = js.native
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: StandardsInputParameterMap = js.native
  /**
    * The status of the standards subscription.
    */
  var StandardsStatus: typingsSlinky.awsSdk.securityhubMod.StandardsStatus = js.native
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString = js.native
}

object StandardsSubscription {
  @scala.inline
  def apply(
    StandardsArn: NonEmptyString,
    StandardsInput: StandardsInputParameterMap,
    StandardsStatus: StandardsStatus,
    StandardsSubscriptionArn: NonEmptyString
  ): StandardsSubscription = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any], StandardsInput = StandardsInput.asInstanceOf[js.Any], StandardsStatus = StandardsStatus.asInstanceOf[js.Any], StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscription]
  }
  @scala.inline
  implicit class StandardsSubscriptionOps[Self <: StandardsSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandardsArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardsInput(value: StandardsInputParameterMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardsStatus(value: StandardsStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardsSubscriptionArn(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptionArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

