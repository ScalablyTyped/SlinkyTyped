package typingsSlinky.blueprintjsCore.overlayMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverlayableProps extends IOverlayLifecycleProps {
  /**
    * Whether the overlay should acquire application focus when it first opens.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /**
    * Whether pressing the `esc` key should invoke `onClose`.
    * @default true
    */
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
  /**
    * Whether the overlay should prevent focus from leaving itself. That is, if the user attempts
    * to focus an element outside the overlay and this prop is enabled, then the overlay will
    * immediately bring focus back to itself. If you are nesting overlay components, either disable
    * this prop on the "outermost" overlays or mark the nested ones `usePortal={false}`.
    * @default true
    */
  var enforceFocus: js.UndefOr[Boolean] = js.native
  /**
    * If `true` and `usePortal={true}`, the `Portal` containing the children is created and attached
    * to the DOM when the overlay is opened for the first time; otherwise this happens when the
    * component mounts. Lazy mounting provides noticeable performance improvements if you have lots
    * of overlays at once, such as on each row of a table.
    * @default true
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  /**
    * A callback that is invoked when user interaction causes the overlay to close, such as
    * clicking on the overlay or pressing the `esc` key (if enabled).
    *
    * Receives the event from the user's interaction, if there was an event (generally either a
    * mouse or key event). Note that, since this component is controlled by the `isOpen` prop, it
    * will not actually close itself until that prop becomes `false`.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], Unit]] = js.native
  /**
    * Space-delimited string of class names applied to the `Portal` element if
    * `usePortal={true}`.
    */
  var portalClassName: js.UndefOr[String] = js.native
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
    * Whether the overlay should be wrapped in a `Portal`, which renders its contents in a new
    * element attached to `portalContainer` prop.
    *
    * This prop essentially determines which element is covered by the backdrop: if `false`,
    * then only its parent is covered; otherwise, the entire page is covered (because the parent
    * of the `Portal` is the `<body>` itself).
    *
    * Set this prop to `false` on nested overlays (such as `Dialog` or `Popover`) to ensure that they
    * are rendered above their parents.
    * @default true
    */
  var usePortal: js.UndefOr[Boolean] = js.native
}

object IOverlayableProps {
  @scala.inline
  def apply(): IOverlayableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOverlayableProps]
  }
  @scala.inline
  implicit class IOverlayablePropsOps[Self <: IOverlayableProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withCanEscapeKeyClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEscapeKeyClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanEscapeKeyClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canEscapeKeyClose")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforceFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): Self = {
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
    def withPortalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePortal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(js.undefined)
        ret
    }
  }
  
}

