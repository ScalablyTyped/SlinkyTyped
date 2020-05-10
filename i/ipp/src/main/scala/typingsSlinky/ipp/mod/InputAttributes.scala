package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputAttributes extends js.Object {
  var `input-auto-scaling`: js.UndefOr[Boolean] = js.native
  var `input-auto-skew-correction`: js.UndefOr[Boolean] = js.native
  var `input-brightness`: js.UndefOr[Double] = js.native
  var `input-color-mode`: js.UndefOr[InputColorMode] = js.native
  var `input-content-type`: js.UndefOr[InputContentType] = js.native
  var `input-contrast`: js.UndefOr[Double] = js.native
  var `input-film-scan-mode`: js.UndefOr[InputFilmScanMode] = js.native
  var `input-images-to-transfer`: js.UndefOr[Double] = js.native
  var `input-media`: js.UndefOr[MediaName | MediaSizeName] = js.native
  var `input-orientation-requested`: js.UndefOr[OrientationRequested] = js.native
  var `input-quality`: js.UndefOr[PrintQuality] = js.native
  var `input-resolution`: js.UndefOr[Resolution] = js.native
  var `input-scaling-height`: js.UndefOr[Double] = js.native
  var `input-scaling-width`: js.UndefOr[Double] = js.native
  var `input-scan-regions`: js.UndefOr[js.Array[PPScanRegions]] = js.native
  var `input-sharpness`: js.UndefOr[Double] = js.native
  var `input-sides`: js.UndefOr[Sides] = js.native
  var `input-source`: js.UndefOr[InputSource] = js.native
}

object InputAttributes {
  @scala.inline
  def apply(): InputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttributes]
  }
  @scala.inline
  implicit class InputAttributesOps[Self <: InputAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withInput-auto-scaling`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-auto-scaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-auto-scaling`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-auto-scaling")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-auto-skew-correction`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-auto-skew-correction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-auto-skew-correction`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-auto-skew-correction")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-brightness`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-brightness`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-brightness")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-color-mode`(value: InputColorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-color-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-color-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-color-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-content-type`(value: InputContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-content-type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-content-type`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-content-type")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-contrast`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-contrast`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-contrast")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-film-scan-mode`(value: InputFilmScanMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-film-scan-mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-film-scan-mode`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-film-scan-mode")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-images-to-transfer`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-images-to-transfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-images-to-transfer`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-images-to-transfer")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-media`(value: MediaName | MediaSizeName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-media`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-media")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-orientation-requested`(value: OrientationRequested): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-orientation-requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-orientation-requested`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-orientation-requested")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-quality`(value: PrintQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-quality`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-quality")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-resolution`(value: Resolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-resolution`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-resolution")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-scaling-height`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-scaling-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-scaling-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-scaling-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-scaling-width`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-scaling-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-scaling-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-scaling-width")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-scan-regions`(value: js.Array[PPScanRegions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-scan-regions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-scan-regions`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-scan-regions")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-sharpness`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-sharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-sharpness`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-sharpness")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-sides`(value: Sides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-sides`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-sides")(js.undefined)
        ret
    }
    @scala.inline
    def `withInput-source`(value: InputSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutInput-source`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input-source")(js.undefined)
        ret
    }
  }
  
}

