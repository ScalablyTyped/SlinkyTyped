package typingsSlinky.pdfImage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[CombinedImage /* <: Boolean */] extends js.Object {
  var combinedImage: js.UndefOr[CombinedImage] = js.native
}

object `0` {
  @scala.inline
  def apply[CombinedImage](): `0`[CombinedImage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[CombinedImage]]
  }
  @scala.inline
  implicit class `0Ops`[Self[combinedimage] <: `0`[combinedimage], CombinedImage] (val x: Self[CombinedImage]) extends AnyVal {
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

