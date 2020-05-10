package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.native
  var brightness: js.UndefOr[Double] = js.native
  var contentUri: js.UndefOr[String] = js.native
  var contrast: js.UndefOr[Double] = js.native
  var cropProperties: js.UndefOr[CropProperties] = js.native
  var sourceUri: js.UndefOr[String] = js.native
  var transparency: js.UndefOr[Double] = js.native
}

object ImageProperties {
  @scala.inline
  def apply(): ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageProperties]
  }
  @scala.inline
  implicit class ImagePropertiesOps[Self <: ImageProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUri")(js.undefined)
        ret
    }
    @scala.inline
    def withContrast(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContrast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contrast")(js.undefined)
        ret
    }
    @scala.inline
    def withCropProperties(value: CropProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCropProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cropProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
  }
  
}

