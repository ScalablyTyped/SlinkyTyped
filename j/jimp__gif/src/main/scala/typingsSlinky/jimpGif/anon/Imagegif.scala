package typingsSlinky.jimpGif.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imagegif extends js.Object {
  @JSName("image/gif")
  var imageSlashgif: js.Array[String] = js.native
}

object Imagegif {
  @scala.inline
  def apply(imageSlashgif: js.Array[String]): Imagegif = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/gif")(imageSlashgif.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagegif]
  }
  @scala.inline
  implicit class ImagegifOps[Self <: Imagegif] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlashgif(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image/gif")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

