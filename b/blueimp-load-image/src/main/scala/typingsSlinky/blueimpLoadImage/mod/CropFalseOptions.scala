package typingsSlinky.blueimpLoadImage.mod

import typingsSlinky.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropFalseOptions extends CropOptions {
  var crop: js.UndefOr[`false`] = js.native
}

object CropFalseOptions {
  @scala.inline
  def apply(): CropFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropFalseOptions]
  }
  @scala.inline
  implicit class CropFalseOptionsOps[Self <: CropFalseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrop(value: `false`): Self = {
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

