package typingsSlinky.fancybox

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxFullScreen extends js.Object {
  def enabled(): Boolean = js.native
  def exit(): Unit = js.native
  def isFullscreen(): Boolean = js.native
  def request(elem: HTMLElement): Unit = js.native
  def toggle(elem: HTMLElement): Unit = js.native
}

object FancyBoxFullScreen {
  @scala.inline
  def apply(
    enabled: () => Boolean,
    exit: () => Unit,
    isFullscreen: () => Boolean,
    request: HTMLElement => Unit,
    toggle: HTMLElement => Unit
  ): FancyBoxFullScreen = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), exit = js.Any.fromFunction0(exit), isFullscreen = js.Any.fromFunction0(isFullscreen), request = js.Any.fromFunction1(request), toggle = js.Any.fromFunction1(toggle))
    __obj.asInstanceOf[FancyBoxFullScreen]
  }
  @scala.inline
  implicit class FancyBoxFullScreenOps[Self <: FancyBoxFullScreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFullscreen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullscreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequest(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggle(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

