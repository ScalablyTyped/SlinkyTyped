package typingsSlinky.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReprojectImageOptions extends js.Object {
  var cutline: js.UndefOr[Geometry] = js.native
  var dst: Dataset = js.native
  var dstAlphaBand: js.UndefOr[Double] = js.native
  var dstBands: js.UndefOr[js.Array[Double]] = js.native
  var dstNodata: js.UndefOr[Double] = js.native
  var maxError: js.UndefOr[Double] = js.native
  var memoryLimit: js.UndefOr[Double] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[js.Array[String] | js.Object] = js.native
  var resampling: js.UndefOr[String] = js.native
  var s_srs: SpatialReference = js.native
  var src: Dataset = js.native
  var srcAlphaBand: js.UndefOr[Double] = js.native
  var srcBands: js.UndefOr[js.Array[Double]] = js.native
  var srcNodata: js.UndefOr[Double] = js.native
  var t_srs: SpatialReference = js.native
}

object ReprojectImageOptions {
  @scala.inline
  def apply(dst: Dataset, s_srs: SpatialReference, src: Dataset, t_srs: SpatialReference): ReprojectImageOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], s_srs = s_srs.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], t_srs = t_srs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReprojectImageOptions]
  }
  @scala.inline
  implicit class ReprojectImageOptionsOps[Self <: ReprojectImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDst(value: Dataset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withCutline(value: Geometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutline")(js.undefined)
        ret
    }
    @scala.inline
    def withDstAlphaBand(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstAlphaBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstAlphaBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstAlphaBand")(js.undefined)
        ret
    }
    @scala.inline
    def withDstBands(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstBands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstBands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstBands")(js.undefined)
        ret
    }
    @scala.inline
    def withDstNodata(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstNodata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDstNodata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dstNodata")(js.undefined)
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
    @scala.inline
    def withMemoryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMemoryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memoryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[String] | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withResampling(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resampling")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcAlphaBand(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcAlphaBand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcAlphaBand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcAlphaBand")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcBands(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcBands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcBands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcBands")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcNodata(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcNodata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcNodata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcNodata")(js.undefined)
        ret
    }
  }
  
}

