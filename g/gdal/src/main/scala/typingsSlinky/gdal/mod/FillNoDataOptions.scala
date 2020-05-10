package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillNoDataOptions extends js.Object {
  var mask: js.UndefOr[RasterBand] = js.native
  var searchDist: Double = js.native
  var smoothingIterations: js.UndefOr[Double] = js.native
  var src: RasterBand = js.native
}

object FillNoDataOptions {
  @scala.inline
  def apply(searchDist: Double, src: RasterBand): FillNoDataOptions = {
    val __obj = js.Dynamic.literal(searchDist = searchDist.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillNoDataOptions]
  }
  @scala.inline
  implicit class FillNoDataOptionsOps[Self <: FillNoDataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchDist(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchDist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: RasterBand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withSmoothingIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmoothingIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smoothingIterations")(js.undefined)
        ret
    }
  }
  
}

