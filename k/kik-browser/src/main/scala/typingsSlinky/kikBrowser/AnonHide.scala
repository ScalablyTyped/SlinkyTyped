package typingsSlinky.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHide extends js.Object {
  def hide(): Unit = js.native
  def isEnabled(): Boolean = js.native
  def show(): Unit = js.native
}

object AnonHide {
  @scala.inline
  def apply(hide: () => Unit, isEnabled: () => Boolean, show: () => Unit): AnonHide = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isEnabled = js.Any.fromFunction0(isEnabled), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[AnonHide]
  }
  @scala.inline
  implicit class AnonHideOps[Self <: AnonHide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

