package typingsSlinky.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCroporiginalsize extends js.Object {
  var crop_center: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var crop_original_size: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var crop_zoom: js.UndefOr[Double | String] = js.native
}

object AnonCroporiginalsize {
  @scala.inline
  def apply(): AnonCroporiginalsize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCroporiginalsize]
  }
  @scala.inline
  implicit class AnonCroporiginalsizeOps[Self <: AnonCroporiginalsize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop_center(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop_center: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_center")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop_original_size(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_original_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop_original_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_original_size")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop_zoom(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop_zoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop_zoom")(js.undefined)
        ret
    }
  }
  
}

