package typingsSlinky.reactInteractive.anon

import org.scalajs.dom.raw.Element
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactInteractive.mod.ClickType
import typingsSlinky.reactInteractive.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  // as: string | Component | ReactElement;
  var as: js.Any = js.native
  var className: js.UndefOr[String] = js.native
  var extraTouchNoTap: js.UndefOr[Boolean] = js.native
   // Not sure about this type
  var focusToggleOff: js.UndefOr[Boolean] = js.native
  var forceState: js.UndefOr[State] = js.native
  var hover: js.UndefOr[CSSProperties] = js.native
  var initialState: js.UndefOr[State] = js.native
  var interactiveChild: js.UndefOr[Boolean] = js.native
  var mutableProps: js.UndefOr[Boolean] = js.native
  var nonContainedChild: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[org.scalajs.dom.raw.Event, Element], 
      /* clickType */ ClickType, 
      Unit
    ]
  ] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ org.scalajs.dom.raw.Event, Unit]] = js.native
  var onStateChange: js.UndefOr[js.Function1[/* arg0 */ Event, Unit]] = js.native
  var onTapFour: js.UndefOr[js.Function1[/* event */ org.scalajs.dom.raw.Event, Unit]] = js.native
  var onTapThree: js.UndefOr[js.Function1[/* event */ org.scalajs.dom.raw.Event, Unit]] = js.native
  var onTapTwo: js.UndefOr[js.Function1[/* event */ org.scalajs.dom.raw.Event, Unit]] = js.native
  var refDOMNode: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
  var setStateCallback: js.UndefOr[js.Function1[/* arg0 */ NextState, Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var styleProperty: js.UndefOr[js.Object] = js.native
  var tapTimeCutoff: js.UndefOr[Double] = js.native
  var touchActiveTapOnly: js.UndefOr[Boolean] = js.native
  var wrapperClassName: js.UndefOr[String] = js.native
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}

object As {
  @scala.inline
  def apply(as: js.Any): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraTouchNoTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraTouchNoTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraTouchNoTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraTouchNoTap")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusToggleOff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusToggleOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusToggleOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusToggleOff")(js.undefined)
        ret
    }
    @scala.inline
    def withForceState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceState")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialState")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractiveChild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractiveChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveChild")(js.undefined)
        ret
    }
    @scala.inline
    def withMutableProps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMutableProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutableProps")(js.undefined)
        ret
    }
    @scala.inline
    def withNonContainedChild(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonContainedChild")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonContainedChild: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonContainedChild")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* event */ SyntheticEvent[org.scalajs.dom.raw.Event, Element], /* clickType */ ClickType) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLongPress(value: /* event */ org.scalajs.dom.raw.Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLongPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: /* arg0 */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTapFour(value: /* event */ org.scalajs.dom.raw.Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTapFour")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTapFour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTapFour")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTapThree(value: /* event */ org.scalajs.dom.raw.Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTapThree")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTapThree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTapThree")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTapTwo(value: /* event */ org.scalajs.dom.raw.Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTapTwo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTapTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTapTwo")(js.undefined)
        ret
    }
    @scala.inline
    def withRefDOMNode(value: /* node */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDOMNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRefDOMNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDOMNode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetStateCallback(value: /* arg0 */ NextState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStateCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetStateCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStateCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleProperty(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withTapTimeCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapTimeCutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTapTimeCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tapTimeCutoff")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchActiveTapOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchActiveTapOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchActiveTapOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchActiveTapOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(js.undefined)
        ret
    }
  }
  
}

