package typingsSlinky.cssMediaquery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<css-mediaquery.css-mediaquery.MediaValues> */
@js.native
trait PartialMediaValues extends js.Object {
  var `aspect-ratio`: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[js.Any] = js.native
  var `color-index`: js.UndefOr[js.Any] = js.native
  var `device-aspect-ratio`: js.UndefOr[js.Any] = js.native
  var `device-height`: js.UndefOr[js.Any] = js.native
  var `device-width`: js.UndefOr[js.Any] = js.native
  var grid: js.UndefOr[js.Any] = js.native
  var height: js.UndefOr[js.Any] = js.native
  var monochrome: js.UndefOr[js.Any] = js.native
  var orientation: js.UndefOr[js.Any] = js.native
  var resolution: js.UndefOr[js.Any] = js.native
  var scan: js.UndefOr[js.Any] = js.native
  var width: js.UndefOr[js.Any] = js.native
}

object PartialMediaValues {
  @scala.inline
  def apply(): PartialMediaValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaValues]
  }
  @scala.inline
  implicit class PartialMediaValuesOps[Self <: PartialMediaValues] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAspect-ratio`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect-ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAspect-ratio`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspect-ratio")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def `withColor-index`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutColor-index`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-index")(js.undefined)
        ret
    }
    @scala.inline
    def `withDevice-aspect-ratio`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-aspect-ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDevice-aspect-ratio`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-aspect-ratio")(js.undefined)
        ret
    }
    @scala.inline
    def `withDevice-height`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDevice-height`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-height")(js.undefined)
        ret
    }
    @scala.inline
    def `withDevice-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutDevice-width`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-width")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMonochrome(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withScan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

