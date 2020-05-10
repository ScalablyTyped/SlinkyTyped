package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBackgroundImage extends js.Object {
  var backgroundImage: String = js.native
}

object AnonBackgroundImage {
  @scala.inline
  def apply(backgroundImage: String): AnonBackgroundImage = {
    val __obj = js.Dynamic.literal(backgroundImage = backgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundImage]
  }
  @scala.inline
  implicit class AnonBackgroundImageOps[Self <: AnonBackgroundImage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundImage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

