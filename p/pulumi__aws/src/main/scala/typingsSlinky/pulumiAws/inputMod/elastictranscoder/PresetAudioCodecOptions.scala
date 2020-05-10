package typingsSlinky.pulumiAws.inputMod.elastictranscoder

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresetAudioCodecOptions extends js.Object {
  /**
    * The bit depth of a sample is how many bits of information are included in the audio samples. Valid values are `16` and `24`. (FLAC/PCM Only)
    */
  var bitDepth: js.UndefOr[Input[String]] = js.native
  /**
    * The order the bits of a PCM sample are stored in. The supported value is LittleEndian. (PCM Only)
    */
  var bitOrder: js.UndefOr[Input[String]] = js.native
  /**
    * If you specified AAC for Audio:Codec, choose the AAC profile for the output file.
    */
  var profile: js.UndefOr[Input[String]] = js.native
  /**
    * Whether audio samples are represented with negative and positive numbers (signed) or only positive numbers (unsigned). The supported value is Signed. (PCM Only)
    */
  var signed: js.UndefOr[Input[String]] = js.native
}

object PresetAudioCodecOptions {
  @scala.inline
  def apply(): PresetAudioCodecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetAudioCodecOptions]
  }
  @scala.inline
  implicit class PresetAudioCodecOptionsOps[Self <: PresetAudioCodecOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBitDepth(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitDepth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitDepth")(js.undefined)
        ret
    }
    @scala.inline
    def withBitOrder(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBitOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withSigned(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signed")(js.undefined)
        ret
    }
  }
  
}

