package typingsSlinky.reactOverlays.overlayMod

import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactOverlays.mod.TransitionCallbacks
import typingsSlinky.reactOverlays.portalMod.PortalProps
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps
  extends TransitionCallbacks
     with PortalProps {
  /**
    * Enables the Popper.js `flip` modifier, allowing the Overlay to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[Boolean] = js.native
  /**
    * A Callback fired by the Overlay when it wishes to be hidden.
    *
    * __required__ when `rootClose` is `true`.
    */
  var onHide: js.UndefOr[js.Function2[/* props */ PortalProps, /* repeated */ js.Any, _]] = js.native
  /** Specify where the overlay element is positioned in relation to the target element */
  var placement: js.UndefOr[Placements] = js.native
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.native
  /**
    * Specify whether the overlay should trigger `onHide` when the user clicks outside the overlay
    */
  var rootClose: js.UndefOr[Boolean] = js.native
  /**
    * Specify disabled for disable RootCloseWrapper
    */
  var rootCloseDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Specify event for toggling overlay
    */
  var rootCloseEvent: js.UndefOr[click | mousedown] = js.native
  /**
    * Set the visibility of the Overlay
    */
  var show: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[ReactInstance | js.Function0[ReactInstance]] = js.native
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[ReactComponentClass[TransitionProps]] = js.native
  /**
    * A render prop that returns an element to overlay and position. See
    * the [react-popper documentation](https://github.com/FezVrasta/react-popper#children) for more info.
    */
  def children(renderProps: OverlayRenderProps): ReactElement = js.native
}

object OverlayProps {
  @scala.inline
  def apply(children: OverlayRenderProps => ReactElement): OverlayProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: OverlayRenderProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: (/* props */ PortalProps, /* repeated */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacement(value: Placements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
    @scala.inline
    def withPopperConfig(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopperConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withRootClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootClose")(js.undefined)
        ret
    }
    @scala.inline
    def withRootCloseDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCloseDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootCloseDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCloseDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRootCloseEvent(value: click | mousedown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootCloseEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetFunction0(value: () => ReactInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetComponent(value: ReactComponentClass[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: ReactInstance | js.Function0[ReactInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionFunctionComponent(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitionComponentClass(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransition(value: ReactComponentClass[TransitionProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

