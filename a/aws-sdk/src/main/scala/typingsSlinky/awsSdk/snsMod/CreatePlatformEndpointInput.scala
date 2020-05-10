package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlatformEndpointInput extends js.Object {
  /**
    * For a list of attributes, see SetEndpointAttributes.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.native
  /**
    * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.
    */
  var CustomUserData: js.UndefOr[String] = js.native
  /**
    * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
    */
  var PlatformApplicationArn: String = js.native
  /**
    * Unique identifier created by the notification service for an app on a device. The specific name for Token will vary, depending on which notification service is being used. For example, when using APNS as the notification service, you need the device token. Alternatively, when using FCM or ADM, the device token equivalent is called the registration ID.
    */
  var Token: String = js.native
}

object CreatePlatformEndpointInput {
  @scala.inline
  def apply(PlatformApplicationArn: String, Token: String): CreatePlatformEndpointInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformEndpointInput]
  }
  @scala.inline
  implicit class CreatePlatformEndpointInputOps[Self <: CreatePlatformEndpointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatformApplicationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: MapStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomUserData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomUserData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomUserData")(js.undefined)
        ret
    }
  }
  
}

