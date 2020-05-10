package typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessageRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesDirectMessageConfigurationMod.UnmarshalledDirectMessageConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointSendConfigurationMod.UnmarshalledEndpointSendConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSendUsersMessageRequest extends SendUsersMessageRequest {
  /**
    * A map of custom attribute-value pairs. Amazon Pinpoint adds these attributes to the data.pinpoint object in the body of the push notification payload. Amazon Pinpoint also provides these attributes in the events that it generates for users-messages deliveries.
    */
  @JSName("Context")
  var Context_UnmarshalledSendUsersMessageRequest: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Message definitions for the default message and any messages that are tailored for specific channels.
    */
  @JSName("MessageConfiguration")
  var MessageConfiguration_UnmarshalledSendUsersMessageRequest: js.UndefOr[UnmarshalledDirectMessageConfiguration] = js.native
  /**
    * A map that associates user IDs with EndpointSendConfiguration objects. Within an EndpointSendConfiguration object, you can tailor the message for a user by specifying message overrides or substitutions.
    */
  @JSName("Users")
  var Users_UnmarshalledSendUsersMessageRequest: js.UndefOr[StringDictionary[UnmarshalledEndpointSendConfiguration]] = js.native
}

object UnmarshalledSendUsersMessageRequest {
  @scala.inline
  def apply(): UnmarshalledSendUsersMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSendUsersMessageRequest]
  }
  @scala.inline
  implicit class UnmarshalledSendUsersMessageRequestOps[Self <: UnmarshalledSendUsersMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: StringDictionary[String]): Self = {
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
    def withMessageConfiguration(value: UnmarshalledDirectMessageConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: StringDictionary[UnmarshalledEndpointSendConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

