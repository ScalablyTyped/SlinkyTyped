package typingsSlinky.amapJsApi.AMap.LabelMarker

import typingsSlinky.amapJsApi.AMap.Pixel
import typingsSlinky.amapJsApi.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconOptions extends js.Object {
  var anchor: js.UndefOr[Anchor] = js.native
  // internal
  var angel: js.UndefOr[Double] = js.native
  // unsupport Pixel in v1.4.14
  var clipOrigin: js.UndefOr[js.Array[Double] | Pixel] = js.native
  var clipSize: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var image: js.UndefOr[String] = js.native
  var retina: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[js.Array[Double] | Size] = js.native
  var `type`: js.UndefOr[String] = js.native
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object IconOptions {
  @scala.inline
  def apply(): IconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconOptions]
  }
  @scala.inline
  implicit class IconOptionsOps[Self <: IconOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withAngel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angel")(js.undefined)
        ret
    }
    @scala.inline
    def withClipOrigin(value: js.Array[Double] | Pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipOrigin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipOrigin")(js.undefined)
        ret
    }
    @scala.inline
    def withClipSize(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipSize")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withRetina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retina")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: js.Array[Double] | Size): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withZooms(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(js.undefined)
        ret
    }
  }
  
}

