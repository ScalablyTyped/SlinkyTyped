package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ac3Settings extends js.Object {
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * Specifies the bitstream mode (bsmod) for the emitted AC-3 stream. See ATSC A/52-2012 for background on these values.
    */
  var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.native
  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Ac3CodingMode] = js.native
  /**
    * Sets the dialnorm for the output. If excluded and input audio is Dolby Digital, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  /**
    * If set to filmStandard, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  var DrcProfile: js.UndefOr[Ac3DrcProfile] = js.native
  /**
    * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid in codingMode32Lfe mode.
    */
  var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.native
  /**
    * When set to "followInput", encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.native
}

object Ac3Settings {
  @scala.inline
  def apply(): Ac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ac3Settings]
  }
  @scala.inline
  implicit class Ac3SettingsOps[Self <: Ac3Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitrate(value: double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bitrate")(js.undefined)
        ret
    }
    @scala.inline
    def withBitstreamMode(value: Ac3BitstreamMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitstreamMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitstreamMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitstreamMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCodingMode(value: Ac3CodingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDialnorm(value: integerMin1Max31): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dialnorm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialnorm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dialnorm")(js.undefined)
        ret
    }
    @scala.inline
    def withDrcProfile(value: Ac3DrcProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrcProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrcProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrcProfile")(js.undefined)
        ret
    }
    @scala.inline
    def withLfeFilter(value: Ac3LfeFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LfeFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLfeFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LfeFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadataControl(value: Ac3MetadataControl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadataControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetadataControl")(js.undefined)
        ret
    }
  }
  
}

