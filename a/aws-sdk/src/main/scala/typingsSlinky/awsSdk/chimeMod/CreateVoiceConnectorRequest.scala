package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVoiceConnectorRequest extends js.Object {
  /**
    * The AWS Region in which the Amazon Chime Voice Connector is created. Default value: us-east-1.
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.native
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: VoiceConnectorName = js.native
  /**
    * When enabled, requires encryption for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: Boolean = js.native
}

object CreateVoiceConnectorRequest {
  @scala.inline
  def apply(Name: VoiceConnectorName, RequireEncryption: Boolean): CreateVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RequireEncryption = RequireEncryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceConnectorRequest]
  }
  @scala.inline
  implicit class CreateVoiceConnectorRequestOps[Self <: CreateVoiceConnectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: VoiceConnectorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequireEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAwsRegion(value: VoiceConnectorAwsRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AwsRegion")(js.undefined)
        ret
    }
  }
  
}

