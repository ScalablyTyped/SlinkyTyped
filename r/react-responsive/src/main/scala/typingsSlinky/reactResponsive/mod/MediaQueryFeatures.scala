package typingsSlinky.reactResponsive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryFeatures extends MediaQueryMatchers {
  var maxAspectRatio: js.UndefOr[String] = js.native
  var maxColor: js.UndefOr[Double] = js.native
  var maxColorIndex: js.UndefOr[Double] = js.native
  var maxDeviceAspectRatio: js.UndefOr[String] = js.native
  var maxDeviceHeight: js.UndefOr[Double | String] = js.native
  var maxDeviceWidth: js.UndefOr[Double | String] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxMonochrome: js.UndefOr[Double] = js.native
  var maxResolution: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minAspectRatio: js.UndefOr[String] = js.native
  var minColor: js.UndefOr[Double] = js.native
  var minColorIndex: js.UndefOr[Double] = js.native
  var minDeviceAspectRatio: js.UndefOr[String] = js.native
  var minDeviceHeight: js.UndefOr[Double | String] = js.native
  var minDeviceWidth: js.UndefOr[Double | String] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minMonochrome: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
}

object MediaQueryFeatures {
  @scala.inline
  def apply(): MediaQueryFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryFeatures]
  }
  @scala.inline
  implicit class MediaQueryFeaturesOps[Self <: MediaQueryFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxColorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeviceAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeviceAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeviceHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeviceHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDeviceWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDeviceWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDeviceWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMonochrome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMonochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResolution(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColorIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeviceAspectRatio(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeviceAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceAspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeviceHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeviceHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDeviceWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDeviceWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDeviceWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMonochrome(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonochrome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMonochrome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMonochrome")(js.undefined)
        ret
    }
    @scala.inline
    def withMinResolution(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
  }
  
}

