package typingsSlinky.imageminWebp.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Set transparency-compression quality between 0 and 100.
    * @default 100
    */
  var alphaQuality: js.UndefOr[Double] = js.native
  /**
    * Adjust filter strength automatically.
    * @default false
    */
  var autoFilter: js.UndefOr[Boolean] = js.native
  /**
    * Buffer to optimize.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
    * Crop the image.
    */
  var crop: js.UndefOr[Crop] = js.native
  /**
    * Set deblocking filter strength between 0 (off) and 100.
    */
  var filter: js.UndefOr[Double] = js.native
  /**
    * Encode images losslessly.
    * @default false
    */
  var lossless: js.UndefOr[Boolean] = js.native
  /**
    * A list of metadata to copy from the input to the output if present.
    */
  var metadata: js.UndefOr[Metadata | js.Array[Metadata]] = js.native
  /**
    * Specify the compression method to use,
    * between 0 (fastest) and 6 (slowest).
    * This parameter controls the trade off between encoding speed
    * and the compressed file size and quality.
    * @default 4
    */
  var method: js.UndefOr[Double] = js.native
  /**
    * Encode losslessly with an additional lossy pre-processing step,
    * with a quality factor between
    * 0 (maximum pre-processing) and 100 (same as lossless).
    * @default 100
    */
  var nearLossless: js.UndefOr[Double] = js.native
  /**
    * Preset setting.
    * @default default
    */
  var preset: js.UndefOr[Preset] = js.native
  /**
    * Set quality factor between 0 and 100.
    * @default 75
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * Resize the image. Happens after crop.
    */
  var resize: js.UndefOr[Resize] = js.native
  /**
    * Set filter sharpness between 0 (sharpest) and 7 (least sharp).
    * @default 0
    */
  var sharpness: js.UndefOr[Double] = js.native
  /**
    * Set target size in bytes.
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * Set the amplitude of spatial noise shaping between 0 and 100.
    * @default 80
    */
  var sns: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlphaQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlphaQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaQuality")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: Crop): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLossless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLossless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lossless")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata | js.Array[Metadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNearLossless(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearLossless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNearLossless: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nearLossless")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: Preset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: Resize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withSharpness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharpness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharpness")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sns")(js.undefined)
        ret
    }
  }
  
}

