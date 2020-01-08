package typingsSlinky.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPreprocessor extends js.Object {
  /**
    * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ColorCorrector: js.UndefOr[typingsSlinky.awsDashSdk.clientsMediaconvertMod.ColorCorrector] = js.native
  /**
    * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
    */
  var Deinterlacer: js.UndefOr[typingsSlinky.awsDashSdk.clientsMediaconvertMod.Deinterlacer] = js.native
  /**
    * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
    */
  var DolbyVision: js.UndefOr[typingsSlinky.awsDashSdk.clientsMediaconvertMod.DolbyVision] = js.native
  /**
    * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typingsSlinky.awsDashSdk.clientsMediaconvertMod.ImageInserter] = js.native
  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var NoiseReducer: js.UndefOr[typingsSlinky.awsDashSdk.clientsMediaconvertMod.NoiseReducer] = js.native
  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  var TimecodeBurnin: js.UndefOr[typingsSlinky.awsDashSdk.clientsMediaconvertMod.TimecodeBurnin] = js.native
}

object VideoPreprocessor {
  @scala.inline
  def apply(
    ColorCorrector: ColorCorrector = null,
    Deinterlacer: Deinterlacer = null,
    DolbyVision: DolbyVision = null,
    ImageInserter: ImageInserter = null,
    NoiseReducer: NoiseReducer = null,
    TimecodeBurnin: TimecodeBurnin = null
  ): VideoPreprocessor = {
    val __obj = js.Dynamic.literal()
    if (ColorCorrector != null) __obj.updateDynamic("ColorCorrector")(ColorCorrector.asInstanceOf[js.Any])
    if (Deinterlacer != null) __obj.updateDynamic("Deinterlacer")(Deinterlacer.asInstanceOf[js.Any])
    if (DolbyVision != null) __obj.updateDynamic("DolbyVision")(DolbyVision.asInstanceOf[js.Any])
    if (ImageInserter != null) __obj.updateDynamic("ImageInserter")(ImageInserter.asInstanceOf[js.Any])
    if (NoiseReducer != null) __obj.updateDynamic("NoiseReducer")(NoiseReducer.asInstanceOf[js.Any])
    if (TimecodeBurnin != null) __obj.updateDynamic("TimecodeBurnin")(TimecodeBurnin.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPreprocessor]
  }
}

