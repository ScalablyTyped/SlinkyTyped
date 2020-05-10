package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsConfiguration extends js.Object {
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.native
  /**
    * Lambda function ARN that allows a bot to receive outgoing events.
    */
  var LambdaFunctionArn: js.UndefOr[SensitiveString] = js.native
  /**
    * HTTPS endpoint that allows a bot to receive outgoing events.
    */
  var OutboundEventsHTTPSEndpoint: js.UndefOr[SensitiveString] = js.native
}

object EventsConfiguration {
  @scala.inline
  def apply(): EventsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsConfiguration]
  }
  @scala.inline
  implicit class EventsConfigurationOps[Self <: EventsConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BotId")(js.undefined)
        ret
    }
    @scala.inline
    def withLambdaFunctionArn(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLambdaFunctionArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionArn")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundEventsHTTPSEndpoint(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundEventsHTTPSEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundEventsHTTPSEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundEventsHTTPSEndpoint")(js.undefined)
        ret
    }
  }
  
}

