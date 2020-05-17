package typingsSlinky.jimpPluginResize.anon

import typingsSlinky.jimpPluginResize.jimpPluginResizeStrings.bezierInterpolation
import typingsSlinky.jimpPluginResize.jimpPluginResizeStrings.bicubicInterpolation
import typingsSlinky.jimpPluginResize.jimpPluginResizeStrings.bilinearInterpolation
import typingsSlinky.jimpPluginResize.jimpPluginResizeStrings.hermiteInterpolation
import typingsSlinky.jimpPluginResize.jimpPluginResizeStrings.nearestNeighbor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESIZEBEZIER extends js.Object {
  var RESIZE_BEZIER: bezierInterpolation = js.native
  var RESIZE_BICUBIC: bicubicInterpolation = js.native
  var RESIZE_BILINEAR: bilinearInterpolation = js.native
  var RESIZE_HERMITE: hermiteInterpolation = js.native
  // resize methods
  var RESIZE_NEAREST_NEIGHBOR: nearestNeighbor = js.native
}

object RESIZEBEZIER {
  @scala.inline
  def apply(
    RESIZE_BEZIER: bezierInterpolation,
    RESIZE_BICUBIC: bicubicInterpolation,
    RESIZE_BILINEAR: bilinearInterpolation,
    RESIZE_HERMITE: hermiteInterpolation,
    RESIZE_NEAREST_NEIGHBOR: nearestNeighbor
  ): RESIZEBEZIER = {
    val __obj = js.Dynamic.literal(RESIZE_BEZIER = RESIZE_BEZIER.asInstanceOf[js.Any], RESIZE_BICUBIC = RESIZE_BICUBIC.asInstanceOf[js.Any], RESIZE_BILINEAR = RESIZE_BILINEAR.asInstanceOf[js.Any], RESIZE_HERMITE = RESIZE_HERMITE.asInstanceOf[js.Any], RESIZE_NEAREST_NEIGHBOR = RESIZE_NEAREST_NEIGHBOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[RESIZEBEZIER]
  }
  @scala.inline
  implicit class RESIZEBEZIEROps[Self <: RESIZEBEZIER] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRESIZE_BEZIER(value: bezierInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_BEZIER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESIZE_BICUBIC(value: bicubicInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_BICUBIC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESIZE_BILINEAR(value: bilinearInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_BILINEAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESIZE_HERMITE(value: hermiteInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_HERMITE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESIZE_NEAREST_NEIGHBOR(value: nearestNeighbor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESIZE_NEAREST_NEIGHBOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

