package typingsSlinky.pulumiAws.smsChannelMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmsChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.native
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[Input[String]] = js.native
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[Input[String]] = js.native
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.native
}

object SmsChannelState {
  @scala.inline
  def apply(): SmsChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsChannelState]
  }
  @scala.inline
  implicit class SmsChannelStateOps[Self <: SmsChannelState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotionalMessagesPerSecond(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionalMessagesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotionalMessagesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotionalMessagesPerSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderId")(js.undefined)
        ret
    }
    @scala.inline
    def withShortCode(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionalMessagesPerSecond(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionalMessagesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionalMessagesPerSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionalMessagesPerSecond")(js.undefined)
        ret
    }
  }
  
}

