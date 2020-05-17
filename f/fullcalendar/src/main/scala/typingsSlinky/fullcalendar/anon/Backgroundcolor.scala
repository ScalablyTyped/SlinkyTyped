package typingsSlinky.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backgroundcolor extends js.Object {
  var `background-color`: js.Any = js.native
  var `border-color`: js.Any = js.native
  var color: js.Any = js.native
}

object Backgroundcolor {
  @scala.inline
  def apply(`background-color`: js.Any, `border-color`: js.Any, color: js.Any): Backgroundcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("border-color")(`border-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backgroundcolor]
  }
  @scala.inline
  implicit class BackgroundcolorOps[Self <: Backgroundcolor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBackground-color`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBorder-color`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

