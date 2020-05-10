package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedWarpOutputOptions extends js.Object {
  var maxError: js.UndefOr[Double] = js.native
  var s_srs: SpatialReference = js.native
  var src: Dataset = js.native
  var t_srs: SpatialReference = js.native
}

object SuggestedWarpOutputOptions {
  @scala.inline
  def apply(s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): SuggestedWarpOutputOptions = {
    val __obj = js.Dynamic.literal(s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestedWarpOutputOptions]
  }
  @scala.inline
  implicit class SuggestedWarpOutputOptionsOps[Self <: SuggestedWarpOutputOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS_srs(value: SpatialReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_srs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: Dataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withT_srs(value: SpatialReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t_srs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxError")(js.undefined)
        ret
    }
  }
  
}

