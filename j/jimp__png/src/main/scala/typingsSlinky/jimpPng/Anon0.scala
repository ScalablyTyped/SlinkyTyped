package typingsSlinky.jimpPng

import typingsSlinky.jimpPng.jimpPngBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon0 extends js.Object {
  @JSName("image/png")
  var imageSlashpng: `true` = js.native
}

object Anon0 {
  @scala.inline
  def apply(imageSlashpng: `true`): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("image/png")(imageSlashpng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
  @scala.inline
  implicit class Anon0Ops[Self <: Anon0] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlashpng(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image/png")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

