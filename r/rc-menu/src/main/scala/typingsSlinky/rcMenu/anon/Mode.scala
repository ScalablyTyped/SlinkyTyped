package typingsSlinky.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var manualRef: js.Function0[Unit] = js.native
  var mode: String = js.native
  var onMouseEnter: js.Function0[Unit] = js.native
  var onMouseLeave: js.Function0[Unit] = js.native
  var onTitleClick: js.Function0[Unit] = js.native
  var onTitleMouseEnter: js.Function0[Unit] = js.native
  var onTitleMouseLeave: js.Function0[Unit] = js.native
  var title: String = js.native
}

object Mode {
  @scala.inline
  def apply(
    manualRef: () => Unit,
    mode: String,
    onMouseEnter: () => Unit,
    onMouseLeave: () => Unit,
    onTitleClick: () => Unit,
    onTitleMouseEnter: () => Unit,
    onTitleMouseLeave: () => Unit,
    title: String
  ): Mode = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), mode = mode.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onTitleClick = js.Any.fromFunction0(onTitleClick), onTitleMouseEnter = js.Any.fromFunction0(onTitleMouseEnter), onTitleMouseLeave = js.Any.fromFunction0(onTitleMouseLeave), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManualRef(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualRef")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTitleClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTitleMouseEnter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleMouseEnter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTitleMouseLeave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTitleMouseLeave")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

