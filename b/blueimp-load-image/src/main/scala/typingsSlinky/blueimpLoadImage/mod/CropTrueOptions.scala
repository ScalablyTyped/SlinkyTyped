package typingsSlinky.blueimpLoadImage.mod

import typingsSlinky.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropTrueOptions extends CropOptions {
  var aspectRatio: js.UndefOr[AspectRatio] = js.native
  var crop: js.UndefOr[`true`] = js.native
}

object CropTrueOptions {
  @scala.inline
  def apply(): CropTrueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropTrueOptions]
  }
  @scala.inline
  implicit class CropTrueOptionsOps[Self <: CropTrueOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: AspectRatio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withCrop(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crop")(js.undefined)
        ret
    }
  }
  
}

