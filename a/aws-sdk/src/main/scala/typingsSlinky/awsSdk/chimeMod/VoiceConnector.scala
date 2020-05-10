package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceConnector extends js.Object {
  /**
    * The AWS Region in which the Amazon Chime Voice Connector is created. Default: us-east-1.
    */
  var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.native
  /**
    * The Amazon Chime Voice Connector creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The name of the Amazon Chime Voice Connector.
    */
  var Name: js.UndefOr[VoiceConnectorName] = js.native
  /**
    * The outbound host name for the Amazon Chime Voice Connector.
    */
  var OutboundHostName: js.UndefOr[String] = js.native
  /**
    * Designates whether encryption is required for the Amazon Chime Voice Connector.
    */
  var RequireEncryption: js.UndefOr[Boolean] = js.native
  /**
    * The updated Amazon Chime Voice Connector timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: js.UndefOr[NonEmptyString] = js.native
}

object VoiceConnector {
  @scala.inline
  def apply(): VoiceConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnector]
  }
  @scala.inline
  implicit class VoiceConnectorOps[Self <: VoiceConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withCreatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: VoiceConnectorName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withOutboundHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundHostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutboundHostName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutboundHostName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireEncryption(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireEncryption")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceConnectorId(value: NonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceConnectorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorId")(js.undefined)
        ret
    }
  }
  
}

