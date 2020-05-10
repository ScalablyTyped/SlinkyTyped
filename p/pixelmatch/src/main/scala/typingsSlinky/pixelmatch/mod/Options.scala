package typingsSlinky.pixelmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The color of anti-aliased pixels in the diff output.
    * @default [255, 255, 0]
    */
  var aaColor: js.UndefOr[RGBTuple] = js.native
  /**
    * Blending factor of unchanged pixels in the diff output.
    * Ranges from 0 for pure white to 1 for original brightness
    * @default 0.1
    */
  var alpha: js.UndefOr[Double] = js.native
  /**
    * The color of differing pixels in the diff output.
    * @default [255, 0, 0]
    */
  var diffColor: js.UndefOr[RGBTuple] = js.native
  /**
    * An alternative color to use for dark on light differences to differentiate between "added" and "removed" parts.
    * If not provided, all differing pixels use the color specified by `diffColor`.
    * @default null
    */
  var diffColorAlt: js.UndefOr[RGBTuple] = js.native
  /**
    * Draw the diff over a transparent background (a mask), rather than over the original image.
    * Will not draw anti-aliased pixels (if detected)
    * @default false
    */
  var diffMask: js.UndefOr[Boolean] = js.native
  /**
    * If true, disables detecting and ignoring anti-aliased pixels.
    * @default false
    */
  val includeAA: js.UndefOr[Boolean] = js.native
  /**
    * Matching threshold, ranges from 0 to 1. Smaller values make the comparison more sensitive.
    * @default 0.1
    */
  val threshold: js.UndefOr[Double] = js.native
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
    def withAaColor(value: RGBTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aaColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAaColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aaColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffColor(value: RGBTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffColorAlt(value: RGBTuple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffColorAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffColorAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffColorAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withDiffMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiffMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffMask")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeAA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeAA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeAA")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

