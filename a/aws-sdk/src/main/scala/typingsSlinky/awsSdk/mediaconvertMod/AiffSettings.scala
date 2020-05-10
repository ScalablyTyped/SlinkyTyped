package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AiffSettings extends js.Object {
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[integerMin16Max24] = js.native
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[integerMin1Max64] = js.native
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin8000Max192000] = js.native
}

object AiffSettings {
  @scala.inline
  def apply(): AiffSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AiffSettings]
  }
  @scala.inline
  implicit class AiffSettingsOps[Self <: AiffSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitDepth(value: integerMin16Max24): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BitDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withChannels(value: integerMin1Max64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Channels")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: integerMin8000Max192000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SampleRate")(js.undefined)
        ret
    }
  }
  
}

