package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrows extends js.Object {
  var arrows: Boolean = js.native
  var dots: Boolean = js.native
  var draggable: Boolean = js.native
}

object Arrows {
  @scala.inline
  def apply(arrows: Boolean, dots: Boolean, draggable: Boolean): Arrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrows]
  }
  @scala.inline
  implicit class ArrowsOps[Self <: Arrows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

