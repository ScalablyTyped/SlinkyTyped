package typingsSlinky.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Images extends js.Object {
  var hiResImageSrc: IVImage = js.native
  var imageSrc: IVImage = js.native
}

object Images {
  @scala.inline
  def apply(): Images = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Images]
  }
  @scala.inline
  implicit class ImagesOps[Self <: Images] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHiResImageSrc(value: IVImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiResImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiResImageSrcNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiResImageSrc")(null)
        ret
    }
    @scala.inline
    def withImageSrc(value: IVImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageSrcNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSrc")(null)
        ret
    }
  }
  
}

