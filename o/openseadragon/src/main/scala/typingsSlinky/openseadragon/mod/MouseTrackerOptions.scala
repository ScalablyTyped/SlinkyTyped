package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseTrackerOptions extends js.Object {
  var blurHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var clickDistThreshold: js.UndefOr[Double] = js.native
  var clickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var clickTimeThreshold: js.UndefOr[Double] = js.native
  var dblClickDistThreshold: js.UndefOr[Double] = js.native
  var dblClickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var dblClickTimeThreshold: js.UndefOr[Double] = js.native
  var dragEndHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var dragHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var element: Element | String = js.native
  var enterHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var exitHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var focusHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var keyDownHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var keyHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var keyUpHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var moveHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var nonPrimaryPressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var nonPrimaryReleaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var pinchHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var pressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var releaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var scrollHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  var startDisabled: js.UndefOr[Boolean] = js.native
  var stopDelay: js.UndefOr[Double] = js.native
  var userData: js.UndefOr[js.Object] = js.native
}

object MouseTrackerOptions {
  @scala.inline
  def apply(element: Element | String): MouseTrackerOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTrackerOptions]
  }
  @scala.inline
  implicit class MouseTrackerOptionsOps[Self <: MouseTrackerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlurHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBlurHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withClickDistThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDistThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickDistThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickDistThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withClickHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withClickTimeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickTimeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickTimeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDblClickDistThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickDistThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickDistThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickDistThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDblClickHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDblClickHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDblClickTimeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickTimeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblClickTimeThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblClickTimeThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEndHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEndHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragEndHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEndHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDragHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnterHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withExitHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExitHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFocusHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyDownHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyDownHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyDownHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUpHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUpHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyUpHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUpHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMoveHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPrimaryPressHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPrimaryPressHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNonPrimaryPressHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPrimaryPressHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withNonPrimaryReleaseHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPrimaryReleaseHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNonPrimaryReleaseHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonPrimaryReleaseHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPinchHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withPressHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPressHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReleaseHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollHandler(value: OSDEvent[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutScrollHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStopDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withUserData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userData")(js.undefined)
        ret
    }
  }
  
}

