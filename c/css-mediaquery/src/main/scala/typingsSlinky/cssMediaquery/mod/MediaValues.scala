package typingsSlinky.cssMediaquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'orientation' | 'scan' | 'width' | 'height' | 'device-width' | 'device-height' | 'resolution' | 'aspect-ratio' | 'device-aspect-ratio' | 'grid' | 'color' | 'color-index' | 'monochrome', unknown> */
@js.native
trait MediaValues extends js.Object {
  var `aspect-ratio`: js.Any = js.native
  var color: js.Any = js.native
  var `color-index`: js.Any = js.native
  var `device-aspect-ratio`: js.Any = js.native
  var `device-height`: js.Any = js.native
  var `device-width`: js.Any = js.native
  var grid: js.Any = js.native
  var height: js.Any = js.native
  var monochrome: js.Any = js.native
  var orientation: js.Any = js.native
  var resolution: js.Any = js.native
  var scan: js.Any = js.native
  var width: js.Any = js.native
}

object MediaValues {
  @scala.inline
  def apply(
    `aspect-ratio`: js.Any,
    color: js.Any,
    `color-index`: js.Any,
    `device-aspect-ratio`: js.Any,
    `device-height`: js.Any,
    `device-width`: js.Any,
    grid: js.Any,
    height: js.Any,
    monochrome: js.Any,
    orientation: js.Any,
    resolution: js.Any,
    scan: js.Any,
    width: js.Any
  ): MediaValues = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], scan = scan.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("aspect-ratio")(`aspect-ratio`.asInstanceOf[js.Any])
    __obj.updateDynamic("color-index")(`color-index`.asInstanceOf[js.Any])
    __obj.updateDynamic("device-aspect-ratio")(`device-aspect-ratio`.asInstanceOf[js.Any])
    __obj.updateDynamic("device-height")(`device-height`.asInstanceOf[js.Any])
    __obj.updateDynamic("device-width")(`device-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaValues]
  }
  @scala.inline
  implicit class MediaValuesOps[Self <: MediaValues] (val x: Self) extends AnyVal {
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
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withColor-index`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDevice-aspect-ratio`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-aspect-ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDevice-height`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDevice-width`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("device-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonochrome(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolution(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

