package typingsSlinky.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var image: js.typedarray.Uint8Array = js.native
  var mimType: String = js.native
}

object Image {
  @scala.inline
  def apply(image: js.typedarray.Uint8Array, mimType: String): Image = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mimType = mimType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

