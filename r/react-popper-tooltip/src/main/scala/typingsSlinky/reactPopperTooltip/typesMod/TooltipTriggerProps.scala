package typingsSlinky.reactPopperTooltip.typesMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.popperJs.mod.Popper.Modifiers
import typingsSlinky.popperJs.mod.Popper.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipTriggerProps extends js.Object {
  /**
    * Whether to close the tooltip when it's trigger is out of the boundary
    * @default true
    */
  var closeOnOutOfBoundaries: Boolean = js.native
  /**
    * Whether tooltip is shown by default
    * @default false
    */
  var defaultTooltipShown: Boolean = js.native
  /**
    * Delay in hiding the tooltip
    * @default 0
    */
  var delayHide: Double = js.native
  /**
    * Delay in showing the tooltip
    * @default 0
    */
  var delayShow: Double = js.native
  /**
    * Whether to make the tooltip spawn at cursor position
    * @default false
    */
  var followCursor: Boolean = js.native
  /**
    * Function that can be used to obtain a tooltip element reference
    */
  var getTooltipRef: js.UndefOr[Ref] = js.native
  /**
    * Function that can be used to obtain a trigger element reference
    */
  var getTriggerRef: js.UndefOr[Ref] = js.native
  /**
    * Modifiers passed directly to the underlying popper.js instance
    * For more information, refer to Popper.js’ modifier docs:
    * @link https://popper.js.org/popper-documentation.html#modifiers
    */
  var modifiers: js.UndefOr[Modifiers] = js.native
  /**
    * Tooltip placement w.r.t. trigger
    *  @default right
    */
  var placement: Placement = js.native
  /**
    * Element to be used as portal container
    * @default document.body
    */
  var portalContainer: HTMLElement = js.native
  /**
    * Used to create controlled tooltip
    */
  var tooltipShown: js.UndefOr[Boolean] = js.native
  /**
    * Event that triggers the tooltip
    * @default hover
    */
  var trigger: Trigger = js.native
  /**
    * Whether to use React.createPortal for creating tooltip
    * @default true // for browser environments
    */
  var usePortal: Boolean = js.native
  /**
    * Trigger
    */
  def children(arg: ChildrenArg): TagMod[Any] = js.native
  /**
    * Called when the visibility of the tooltip changes
    * @default no-op
    */
  def onVisibilityChange(tooltipShown: Boolean): Unit = js.native
  /**
    * Tooltip
    */
  def tooltip(arg: TooltipArg): TagMod[Any] = js.native
}

object TooltipTriggerProps {
  @scala.inline
  def apply(
    children: ChildrenArg => TagMod[Any],
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    onVisibilityChange: Boolean => Unit,
    placement: Placement,
    portalContainer: HTMLElement,
    tooltip: TooltipArg => TagMod[Any],
    trigger: Trigger,
    usePortal: Boolean
  ): TooltipTriggerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerProps]
  }
  @scala.inline
  implicit class TooltipTriggerPropsOps[Self <: TooltipTriggerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: ChildrenArg => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCloseOnOutOfBoundaries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnOutOfBoundaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultTooltipShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTooltipShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayHide(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelayShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFollowCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnVisibilityChange(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVisibilityChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPlacement(value: Placement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPortalContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: TooltipArg => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrigger(value: Trigger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePortal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePortal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTooltipRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTooltipRef(value: Ref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTooltipRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTooltipRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTooltipRef")(null)
        ret
    }
    @scala.inline
    def withGetTriggerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTriggerRef(value: Ref): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetTriggerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTriggerRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTriggerRef")(null)
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
    def withTooltipShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipShown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipShown")(js.undefined)
        ret
    }
  }
  
}

