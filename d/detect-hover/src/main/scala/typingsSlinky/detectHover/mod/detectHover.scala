package typingsSlinky.detectHover.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectHover extends js.Object {
  var anyHover: Boolean = js.native
  var anyNone: Boolean = js.native
  var hover: Boolean = js.native
  var none: Boolean = js.native
  def update(): Unit = js.native
}

object detectHover {
  @scala.inline
  def apply(anyHover: Boolean, anyNone: Boolean, hover: Boolean, none: Boolean, update: () => Unit): detectHover = {
    val __obj = js.Dynamic.literal(anyHover = anyHover.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectHover]
  }
  @scala.inline
  implicit class detectHoverOps[Self <: detectHover] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

