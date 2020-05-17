package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`hover-target`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.hover
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typingsSlinky.blueprintjsCore.tooltipMod.ITooltipProps
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  @JSImport("@blueprintjs/core", "Tooltip")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Tooltip] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def boundary(value: Boundary): this.type = set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def canEscapeKeyClose(value: Boolean): this.type = set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    @scala.inline
    def captureDismiss(value: Boolean): this.type = set("captureDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultIsOpen(value: Boolean): this.type = set("defaultIsOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverCloseDelay(value: Double): this.type = set("hoverCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverOpenDelay(value: Double): this.type = set("hoverOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def inheritDarkTheme(value: Boolean): this.type = set("inheritDarkTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def interactionKind(value: hover | `hover-target`): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def modifiers(value: Modifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def onClose(value: /* event */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def onClosed(value: /* node */ HTMLElement => Unit): this.type = set("onClosed", js.Any.fromFunction1(value))
    @scala.inline
    def onClosing(value: /* node */ HTMLElement => Unit): this.type = set("onClosing", js.Any.fromFunction1(value))
    @scala.inline
    def onInteraction(
      value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit
    ): this.type = set("onInteraction", js.Any.fromFunction2(value))
    @scala.inline
    def onOpened(value: /* node */ HTMLElement => Unit): this.type = set("onOpened", js.Any.fromFunction1(value))
    @scala.inline
    def onOpening(value: /* node */ HTMLElement => Unit): this.type = set("onOpening", js.Any.fromFunction1(value))
    @scala.inline
    def openOnTargetFocus(value: Boolean): this.type = set("openOnTargetFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverClassName(value: String): this.type = set("popoverClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: PopoverPosition): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def targetClassName(value: String): this.type = set("targetClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def targetProps(value: HTMLAttributes[HTMLElement]): this.type = set("targetProps", value.asInstanceOf[js.Any])
    @scala.inline
    def targetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): this.type = set("targetTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): this.type = set("wrapperTagName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(content: ReactElement | String): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITooltipProps]))
  }
}

