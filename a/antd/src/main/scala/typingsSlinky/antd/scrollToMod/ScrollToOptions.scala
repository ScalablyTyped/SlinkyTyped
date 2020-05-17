package typingsSlinky.antd.scrollToMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollToOptions extends js.Object {
  /** Scroll end callback */
  var callback: js.UndefOr[js.Function0[_]] = js.native
  /** Animation duration, default as 450 */
  var duration: js.UndefOr[Double] = js.native
  /** Scroll container, default as window */
  var getContainer: js.UndefOr[js.Function0[HTMLElement | Window]] = js.native
}

object ScrollToOptions {
  @scala.inline
  def apply(): ScrollToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollToOptions]
  }
  @scala.inline
  implicit class ScrollToOptionsOps[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContainer(value: () => HTMLElement | Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.undefined)
        ret
    }
  }
  
}

