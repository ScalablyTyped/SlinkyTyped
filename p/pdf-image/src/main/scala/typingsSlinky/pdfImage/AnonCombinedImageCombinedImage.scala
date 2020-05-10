package typingsSlinky.pdfImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCombinedImageCombinedImage[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: js.UndefOr[CombinedImage] = js.native
}

object AnonCombinedImageCombinedImage {
  @scala.inline
  def apply[CombinedImage](): AnonCombinedImageCombinedImage[CombinedImage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCombinedImageCombinedImage[CombinedImage]]
  }
  @scala.inline
  implicit class AnonCombinedImageCombinedImageOps[Self[combinedimage] <: AnonCombinedImageCombinedImage[combinedimage], CombinedImage] (val x: Self[CombinedImage]) extends AnyVal {
    @scala.inline
    def duplicate: Self[CombinedImage] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[CombinedImage]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[CombinedImage] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[CombinedImage] with Other]
    @scala.inline
    def withCombinedImage(value: CombinedImage): Self[CombinedImage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombinedImage: Self[CombinedImage] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedImage")(js.undefined)
        ret
    }
  }
  
}

