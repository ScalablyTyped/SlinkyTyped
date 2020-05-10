package typingsSlinky.micromodal.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MicroModalConfig extends js.Object {
  /**
    * Set this to true if using css animations to hide the modal. This allows it to wait for the animation to
    * finish before removing it from the DOM. Default is false
    */
  var awaitCloseAnimation: js.UndefOr[Boolean] = js.native
  /** Custom data attribute to close modal. Default is data-micromodal-close. */
  var closeTrigger: js.UndefOr[String] = js.native
  /** This option suppresses the console warnings if passed as true. The default value is false. */
  var debugMode: js.UndefOr[Boolean] = js.native
  /** Disable auto focus on first focusable element. Default is false */
  var disableFocus: js.UndefOr[Boolean] = js.native
  /** This disables scrolling on the page while the modal is open. The default value is false. */
  var disableScroll: js.UndefOr[Boolean] = js.native
  /** This is fired when the modal is closing. */
  var onClose: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.native
  /** This is fired when the modal is opening. */
  var onShow: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.native
  /** Custom data attribute to open modal. Default is data-micromodal-trigger. */
  var openTrigger: js.UndefOr[String] = js.native
}

object MicroModalConfig {
  @scala.inline
  def apply(): MicroModalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MicroModalConfig]
  }
  @scala.inline
  implicit class MicroModalConfigOps[Self <: MicroModalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwaitCloseAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitCloseAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwaitCloseAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awaitCloseAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openTrigger")(js.undefined)
        ret
    }
  }
  
}

