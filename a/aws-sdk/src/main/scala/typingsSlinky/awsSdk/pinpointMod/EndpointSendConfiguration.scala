package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointSendConfiguration extends js.Object {
  /**
    * The body of the message. If specified, this value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[string] = js.native
  /**
    * A map of custom attributes to attach to the message for the address. Attribute names are case sensitive. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all other values for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  /**
    * A map of the message variables to merge with the variables specified for the default message (DefaultMessage.Substitutions). The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The title or subject line of the message. If specified, this value overrides the default message title or subject line.
    */
  var TitleOverride: js.UndefOr[string] = js.native
}

object EndpointSendConfiguration {
  @scala.inline
  def apply(): EndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSendConfiguration]
  }
  @scala.inline
  implicit class EndpointSendConfigurationOps[Self <: EndpointSendConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyOverride(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BodyOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: MapOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(js.undefined)
        ret
    }
    @scala.inline
    def withRawContent(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RawContent")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitutions(value: MapOfListOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Substitutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleOverride(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitleOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitleOverride")(js.undefined)
        ret
    }
  }
  
}

