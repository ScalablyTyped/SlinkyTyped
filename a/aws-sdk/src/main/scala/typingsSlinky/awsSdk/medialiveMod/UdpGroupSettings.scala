package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UdpGroupSettings extends js.Object {
  /**
    * Specifies behavior of last resort when input video is lost, and no more backup inputs are available. When dropTs is selected the entire transport stream will stop being emitted.  When dropProgram is selected the program can be dropped from the transport stream (and replaced with null packets to meet the TS bitrate requirement).  Or, when emitProgram is chosen the transport stream will continue to be produced normally with repeat frames, black frames, or slate frames substituted for the absent input video.
    */
  var InputLossAction: js.UndefOr[InputLossActionForUdpOut] = js.native
  /**
    * Indicates ID3 frame that has the timecode.
    */
  var TimedMetadataId3Frame: js.UndefOr[UdpTimedMetadataId3Frame] = js.native
  /**
    * Timed Metadata interval in seconds.
    */
  var TimedMetadataId3Period: js.UndefOr[integerMin0] = js.native
}

object UdpGroupSettings {
  @scala.inline
  def apply(): UdpGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpGroupSettings]
  }
  @scala.inline
  implicit class UdpGroupSettingsOps[Self <: UdpGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputLossAction(value: InputLossActionForUdpOut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLossAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputLossAction")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataId3Frame(value: UdpTimedMetadataId3Frame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataId3Frame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Frame")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedMetadataId3Period(value: integerMin0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedMetadataId3Period: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimedMetadataId3Period")(js.undefined)
        ret
    }
  }
  
}

