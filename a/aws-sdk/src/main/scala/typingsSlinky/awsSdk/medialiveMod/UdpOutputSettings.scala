package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpOutputSettings extends js.Object {
  /**
    * UDP output buffering in milliseconds. Larger values increase latency through the transcoder but simultaneously assist the transcoder in maintaining a constant, low-jitter UDP/RTP output while accommodating clock recovery, input switching, input disruptions, picture reordering, etc.
    */
  var BufferMsec: js.UndefOr[integerMin0Max10000] = js.native
  var ContainerSettings: UdpContainerSettings = js.native
  /**
    * Destination address and port number for RTP or UDP packets. Can be unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
    */
  var Destination: OutputLocationRef = js.native
  /**
    * Settings for enabling and adjusting Forward Error Correction on UDP outputs.
    */
  var FecOutputSettings: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.FecOutputSettings] = js.native
}

object UdpOutputSettings {
  @scala.inline
  def apply(ContainerSettings: UdpContainerSettings, Destination: OutputLocationRef): UdpOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdpOutputSettings]
  }
  @scala.inline
  implicit class UdpOutputSettingsOps[Self <: UdpOutputSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerSettings(value: UdpContainerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestination(value: OutputLocationRef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBufferMsec(value: integerMin0Max10000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferMsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferMsec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BufferMsec")(js.undefined)
        ret
    }
    @scala.inline
    def withFecOutputSettings(value: FecOutputSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FecOutputSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFecOutputSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FecOutputSettings")(js.undefined)
        ret
    }
  }
  
}

