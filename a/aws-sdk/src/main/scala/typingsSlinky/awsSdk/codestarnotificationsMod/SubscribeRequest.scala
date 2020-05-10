package typingsSlinky.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you want to create the association.
    */
  var Arn: NotificationRuleArn = js.native
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.codestarnotificationsMod.ClientRequestToken] = js.native
  var Target: typingsSlinky.awsSdk.codestarnotificationsMod.Target = js.native
}

object SubscribeRequest {
  @scala.inline
  def apply(Arn: NotificationRuleArn, Target: Target): SubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeRequest]
  }
  @scala.inline
  implicit class SubscribeRequestOps[Self <: SubscribeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: NotificationRuleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientRequestToken(value: ClientRequestToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientRequestToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientRequestToken")(js.undefined)
        ret
    }
  }
  
}

