package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsamSettings extends js.Object {
  /**
    * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
    */
  var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification] = js.native
  /**
    * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
    */
  var ResponseSignalPreroll: js.UndefOr[integerMin0Max30000] = js.native
  /**
    * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing instructions that you provide in the setting SCC XML (sccXml).
    */
  var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification] = js.native
}

object EsamSettings {
  @scala.inline
  def apply(): EsamSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsamSettings]
  }
  @scala.inline
  implicit class EsamSettingsOps[Self <: EsamSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManifestConfirmConditionNotification(value: EsamManifestConfirmConditionNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestConfirmConditionNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManifestConfirmConditionNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ManifestConfirmConditionNotification")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseSignalPreroll(value: integerMin0Max30000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseSignalPreroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseSignalPreroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseSignalPreroll")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalProcessingNotification(value: EsamSignalProcessingNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalProcessingNotification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalProcessingNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalProcessingNotification")(js.undefined)
        ret
    }
  }
  
}

