package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsSnsTopicSubscription extends js.Object {
  /**
    * The subscription's endpoint (format depends on the protocol).
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.native
  /**
    * The subscription's protocol.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.native
}

object AwsSnsTopicSubscription {
  @scala.inline
  def apply(): AwsSnsTopicSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSnsTopicSubscription]
  }
  @scala.inline
  implicit class AwsSnsTopicSubscriptionOps[Self <: AwsSnsTopicSubscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
  }
  
}

