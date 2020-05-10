package typingsSlinky.perfectScrollbar

import typingsSlinky.perfectScrollbar.perfectScrollbarStrings.end
import typingsSlinky.perfectScrollbar.perfectScrollbarStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonX extends js.Object {
  var x: start | end | Null = js.native
  var y: start | end | Null = js.native
}

object AnonX {
  @scala.inline
  def apply(): AnonX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonX]
  }
  @scala.inline
  implicit class AnonXOps[Self <: AnonX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(null)
        ret
    }
    @scala.inline
    def withY(value: start | end): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(null)
        ret
    }
  }
  
}

