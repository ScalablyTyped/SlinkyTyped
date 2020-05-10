package typingsSlinky.officeUiFabricReact.tooltipHostTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
import typingsSlinky.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typingsSlinky.officeUiFabricReact.tooltipTypesMod.TooltipDelay
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipHostProps extends HTMLAttributes[HTMLDivElement | TooltipHostBase] {
  /**
    * Additional properties to pass through for Callout.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Number of milliseconds to delay closing the tooltip, so that the user has time to hover over
    * the tooltip and interact with it. Hovering over the tooltip will count as hovering over the
    * host, so that the tooltip will stay open if the user is actively interacting with it.
    */
  var closeDelay: js.UndefOr[Double] = js.native
  /**
    * Optional callback to access the ITooltipHost interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITooltipHost]] = js.native
  /**
    * Content to display in the Tooltip.
    */
  var content: js.UndefOr[String | ReactElement | js.Array[ReactElement]] = js.native
  /**
    * Length of delay before showing the tooltip on hover.
    * @defaultvalue TooltipDelay.medium
    */
  var delay: js.UndefOr[TooltipDelay] = js.native
  /**
    * How the tooltip should be anchored to its `targetElement`.
    * @defaultvalue DirectionalHint.topCenter
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.native
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used.
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.native
  /**
    * Class name to apply to tooltip host.
    */
  var hostClassName: js.UndefOr[String] = js.native
  /**
    * Notifies when tooltip becomes visible or hidden, whatever the trigger was.
    */
  var onTooltipToggle: js.UndefOr[js.Function1[/* isTooltipVisible */ Boolean, Unit]] = js.native
  /**
    * If this is unset (the default), the tooltip is always shown even if there's no overflow.
    *
    * If set, only show the tooltip if the specified element (`Self` or `Parent`) has overflow.
    * When set to `Parent`, the parent element is also used as the tooltip's target element.
    *
    * Note that even with `Self` mode, the TooltipHost *does not* check whether any children have overflow.
    */
  var overflowMode: js.UndefOr[TooltipOverflowMode] = js.native
  /**
    * Whether or not to mark the TooltipHost root element as described by the tooltip.
    * If not specified, the caller should pass an `id` to the TooltipHost (to be passed through to
    * the Tooltip) and mark the appropriate element as `aria-describedby` the `id`.
    * @defaultvalue true
    */
  var setAriaDescribedBy: js.UndefOr[Boolean] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]] = js.native
  /**
    * Theme provided by higher-order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * Additional properties to pass through for Tooltip.
    */
  var tooltipProps: js.UndefOr[ITooltipProps] = js.native
}

object ITooltipHostProps {
  @scala.inline
  def apply(): ITooltipHostProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipHostProps]
  }
  @scala.inline
  implicit class ITooltipHostPropsOps[Self <: ITooltipHostProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalloutProps(value: ICalloutProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ ITooltipHost | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[ITooltipHost]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[ITooltipHost]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String | ReactElement | js.Array[ReactElement]): Self = {
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
    def withDelay(value: TooltipDelay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHint(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHint")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionalHintForRTL(value: DirectionalHint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionalHintForRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionalHintForRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withHostClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTooltipToggle(value: /* isTooltipVisible */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTooltipToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTooltipToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowMode(value: TooltipOverflowMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAriaDescribedBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAriaDescribedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetAriaDescribedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAriaDescribedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: ITooltipHostStyleProps => Partial[ITooltipHostStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipProps(value: ITooltipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(js.undefined)
        ret
    }
  }
  
}

