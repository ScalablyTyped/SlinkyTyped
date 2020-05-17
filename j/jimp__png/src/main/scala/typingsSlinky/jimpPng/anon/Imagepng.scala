package typingsSlinky.jimpPng.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imagepng extends js.Object {
  @JSName("image/png")
  var imageSlashpng: js.Array[String] = js.native
}

object Imagepng {
  @scala.inline
  def apply(imageSlashpng: js.Array[String]): Imagepng = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagepng]
  }
  @scala.inline
  implicit class ImagepngOps[Self <: Imagepng] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlashpng(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image/png")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

