package typingsSlinky.pdfImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedImageCombinedImage[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: CombinedImage = js.native
}

object CombinedImageCombinedImage {
  @scala.inline
  def apply[CombinedImage](combinedImage: CombinedImage): CombinedImageCombinedImage[CombinedImage] = {
    val __obj = js.Dynamic.literal(combinedImage = combinedImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedImageCombinedImage[CombinedImage]]
  }
  @scala.inline
  implicit class CombinedImageCombinedImageOps[Self[combinedimage] <: CombinedImageCombinedImage[combinedimage], CombinedImage] (val x: Self[CombinedImage]) extends AnyVal {
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
  }
  
}

