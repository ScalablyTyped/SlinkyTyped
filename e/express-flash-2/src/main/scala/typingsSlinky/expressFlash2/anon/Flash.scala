package typingsSlinky.expressFlash2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flash extends js.Object {
  var flash: typingsSlinky.expressFlash2.mod.global.Express.Flash = js.native
}

object Flash {
  @scala.inline
  def apply(flash: typingsSlinky.expressFlash2.mod.global.Express.Flash): Flash = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flash]
  }
  @scala.inline
  implicit class FlashOps[Self <: Flash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlash(value: typingsSlinky.expressFlash2.mod.global.Express.Flash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

