package typingsSlinky.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  var crop: js.UndefOr[js.Any] = js.native
  var image: js.Any = js.native
}

object ImageConfig {
  @scala.inline
  def apply(image: js.Any): ImageConfig = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageConfig]
  }
  @scala.inline
  implicit class ImageConfigOps[Self <: ImageConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCrop(value: js.Any): Self = {
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

