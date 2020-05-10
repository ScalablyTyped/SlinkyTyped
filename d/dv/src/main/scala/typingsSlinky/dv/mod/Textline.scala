package typingsSlinky.dv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Textline extends js.Object {
  var box: Box = js.native
}

object Textline {
  @scala.inline
  def apply(box: Box): Textline = {
    val __obj = js.Dynamic.literal(box = box.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textline]
  }
  @scala.inline
  implicit class TextlineOps[Self <: Textline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBox(value: Box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

