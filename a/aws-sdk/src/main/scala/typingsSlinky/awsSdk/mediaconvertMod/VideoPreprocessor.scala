package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPreprocessor extends js.Object {
  /**
    * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ColorCorrector: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ColorCorrector] = js.native
  /**
    * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
    */
  var Deinterlacer: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.Deinterlacer] = js.native
  /**
    * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
    */
  var DolbyVision: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.DolbyVision] = js.native
  /**
    * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.ImageInserter] = js.native
  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var NoiseReducer: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.NoiseReducer] = js.native
  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  var TimecodeBurnin: js.UndefOr[typingsSlinky.awsSdk.mediaconvertMod.TimecodeBurnin] = js.native
}

object VideoPreprocessor {
  @scala.inline
  def apply(): VideoPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPreprocessor]
  }
  @scala.inline
  implicit class VideoPreprocessorOps[Self <: VideoPreprocessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorCorrector(value: ColorCorrector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorCorrector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorCorrector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColorCorrector")(js.undefined)
        ret
    }
    @scala.inline
    def withDeinterlacer(value: Deinterlacer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deinterlacer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeinterlacer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deinterlacer")(js.undefined)
        ret
    }
    @scala.inline
    def withDolbyVision(value: DolbyVision): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DolbyVision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDolbyVision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DolbyVision")(js.undefined)
        ret
    }
    @scala.inline
    def withImageInserter(value: ImageInserter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageInserter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageInserter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageInserter")(js.undefined)
        ret
    }
    @scala.inline
    def withNoiseReducer(value: NoiseReducer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoiseReducer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoiseReducer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NoiseReducer")(js.undefined)
        ret
    }
    @scala.inline
    def withTimecodeBurnin(value: TimecodeBurnin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeBurnin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimecodeBurnin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimecodeBurnin")(js.undefined)
        ret
    }
  }
  
}

