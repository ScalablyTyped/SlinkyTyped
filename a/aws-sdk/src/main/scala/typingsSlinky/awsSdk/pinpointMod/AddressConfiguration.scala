package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressConfiguration extends js.Object {
  /**
    * The message body to use instead of the default message body. This value overrides the default message body.
    */
  var BodyOverride: js.UndefOr[string] = js.native
  /**
    * The channel to use when sending the message.
    */
  var ChannelType: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.ChannelType] = js.native
  /**
    * An object that maps custom attributes to attributes for the address and is attached to the message. Attribute names are case sensitive. For a push notification, this payload is added to the data.pinpoint object. For an email or text message, this payload is added to email/SMS delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOfString] = js.native
  /**
    * The raw, JSON-formatted string to use as the payload for the message. If specified, this value overrides all other values for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  /**
    * A map of the message variables to merge with the variables specified by properties of the DefaultMessage object. The variables specified in this map take precedence over all other variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The message title to use instead of the default message title. This value overrides the default message title.
    */
  var TitleOverride: js.UndefOr[string] = js.native
}

object AddressConfiguration {
  @scala.inline
  def apply(): AddressConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressConfiguration]
  }
  @scala.inline
  implicit class AddressConfigurationOps[Self <: AddressConfiguration] (val x: Self) extends AnyVal {
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
    def withChannelType(value: ChannelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChannelType")(js.undefined)
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

