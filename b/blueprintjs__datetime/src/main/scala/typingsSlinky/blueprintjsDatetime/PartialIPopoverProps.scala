package typingsSlinky.blueprintjsDatetime

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.popoverMod.PopoverInteractionKind
import typingsSlinky.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core.IPopoverProps> */
@js.native
trait PartialIPopoverProps extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.native
  var backdropProps: js.UndefOr[HTMLProps[HTMLDivElement]] = js.native
  var boundary: js.UndefOr[Boundary] = js.native
  var canEscapeKeyClose: js.UndefOr[Boolean] = js.native
  var captureDismiss: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var content: js.UndefOr[String | ReactElement] = js.native
  var defaultIsOpen: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var enforceFocus: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  var hoverCloseDelay: js.UndefOr[Double] = js.native
  var hoverOpenDelay: js.UndefOr[Double] = js.native
  var inheritDarkTheme: js.UndefOr[Boolean] = js.native
  var interactionKind: js.UndefOr[PopoverInteractionKind] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var `lazy`: js.UndefOr[Boolean] = js.native
  var minimal: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onClose: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], Unit]] = js.native
  var onClosed: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  var onClosing: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  var onInteraction: js.UndefOr[
    js.Function2[
      /* nextOpenState */ Boolean, 
      /* e */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]], 
      Unit
    ]
  ] = js.native
  var onOpened: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  var onOpening: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  var openOnTargetFocus: js.UndefOr[Boolean] = js.native
  var popoverClassName: js.UndefOr[String] = js.native
  var popoverRef: js.UndefOr[js.Function1[/* ref */ HTMLDivElement | Null, Unit]] = js.native
  var portalClassName: js.UndefOr[String] = js.native
  var portalContainer: js.UndefOr[HTMLElement] = js.native
  var position: js.UndefOr[PopoverPosition] = js.native
  var target: js.UndefOr[String | ReactElement] = js.native
  var targetClassName: js.UndefOr[String] = js.native
  var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  var transitionDuration: js.UndefOr[Double] = js.native
  var usePortal: js.UndefOr[Boolean] = js.native
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
}

object PartialIPopoverProps {
  @scala.inline
  def apply(): PartialIPopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIPopoverProps]
  }
  @scala.inline
  implicit class PartialIPopoverPropsOps[Self <: PartialIPopoverProps] (val x: Self) extends AnyVal {
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
    def withBackdropProps(value: HTMLProps[HTMLDivElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackdropProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropProps")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundary(value: Boundary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
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
    def withCaptureDismiss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDismiss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDismiss")(js.undefined)
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
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultIsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpenDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritDarkTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDarkTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritDarkTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritDarkTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractionKind(value: PopoverInteractionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractionKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactionKind")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
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
    def withMinimal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimal")(js.undefined)
        ret
    }
    @scala.inline
    def withModifiers(value: Modifiers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* event */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]] => Unit): Self = {
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
    def withOnInteraction(
      value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[Event_, HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteraction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInteraction")(js.undefined)
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
    @scala.inline
    def withOpenOnTargetFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTargetFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOnTargetFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOnTargetFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopoverClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPopoverRef(value: /* ref */ HTMLDivElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPopoverRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverRef")(js.undefined)
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
    def withPosition(value: PopoverPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | ReactElement): Self = {
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
    def withTargetClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetProps(value: HTMLAttributes[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetProps")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetTagName")(js.undefined)
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
    @scala.inline
    def withWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperTagName")(js.undefined)
        ret
    }
  }
  
}

