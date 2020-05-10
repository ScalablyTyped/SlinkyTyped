package typingsSlinky.expressFlash2

import typingsSlinky.expressFlash2.mod._Global_.Express.Flash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlash extends js.Object {
  var flash: Flash = js.native
}

object AnonFlash {
  @scala.inline
  def apply(flash: Flash): AnonFlash = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlash]
  }
  @scala.inline
  implicit class AnonFlashOps[Self <: AnonFlash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlash(value: Flash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

