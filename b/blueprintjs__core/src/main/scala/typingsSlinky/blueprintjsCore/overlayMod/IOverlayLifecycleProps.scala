package typingsSlinky.blueprintjsCore.overlayMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayLifecycleProps extends js.Object {
  /**
    * Lifecycle method invoked just after the CSS _close_ transition ends but
    * before the child has been removed from the DOM. Receives the DOM element
    * of the child being closed.
    */
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just before the CSS _close_ transition begins on
    * a child. Receives the DOM element of the child being closed.
    */
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just after the CSS _open_ transition ends.
    * Receives the DOM element of the child being opened.
    */
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  /**
    * Lifecycle method invoked just after mounting the child in the DOM but
    * just before the CSS _open_ transition begins. Receives the DOM element of
    * the child being opened.
    */
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
}

object IOverlayLifecycleProps {
  @scala.inline
  def apply(): IOverlayLifecycleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayLifecycleProps]
  }
  @scala.inline
  implicit class IOverlayLifecyclePropsOps[Self <: IOverlayLifecycleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClosed(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClosing(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpened(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpening(value: /* node */ HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpening")(js.undefined)
        ret
    }
  }
  
}

