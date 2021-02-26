package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.tooltipHostBaseMod.TooltipHostBase
import typingsSlinky.officeUiFabricReact.tooltipTypesMod.ITooltipProps
import typingsSlinky.officeUiFabricReact.tooltipTypesMod.TooltipDelay
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipHostTypesMod {
  
  @js.native
  sealed trait TooltipOverflowMode extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/TooltipHost.types", "TooltipOverflowMode")
  @js.native
  object TooltipOverflowMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TooltipOverflowMode with Double] = js.native
    
    /** Only show tooltip if parent DOM element is overflowing */
    @js.native
    sealed trait Parent extends TooltipOverflowMode
    /* 0 */ val Parent: typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode.Parent with Double = js.native
    
    /**
      * Only show tooltip if tooltip host's content is overflowing.
      * Note that this does not check the children for overflow, only the TooltipHost root.
      */
    @js.native
    sealed trait Self extends TooltipOverflowMode
    /* 1 */ val Self: typingsSlinky.officeUiFabricReact.tooltipHostTypesMod.TooltipOverflowMode.Self with Double = js.native
  }
  
  @js.native
  trait ITooltipHost extends StObject {
    
    /**
      * Dismisses the tooltip.
      */
    def dismiss(): Unit = js.native
    
    /**
      * Shows the tooltip.
      */
    def show(): Unit = js.native
  }
  object ITooltipHost {
    
    @scala.inline
    def apply(dismiss: () => Unit, show: () => Unit): ITooltipHost = {
      val __obj = js.Dynamic.literal(dismiss = js.Any.fromFunction0(dismiss), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITooltipHost]
    }
    
    @scala.inline
    implicit class ITooltipHostMutableBuilder[Self <: ITooltipHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismiss(value: () => Unit): Self = StObject.set(x, "dismiss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
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
    implicit class ITooltipHostPropsMutableBuilder[Self <: ITooltipHostProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setCloseDelay(value: Double): Self = StObject.set(x, "closeDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseDelayUndefined: Self = StObject.set(x, "closeDelay", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ITooltipHost]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ITooltipHost | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[ITooltipHost]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setContent(value: String | ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: ReactElement*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: TooltipDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDirectionalHint(value: DirectionalHint): Self = StObject.set(x, "directionalHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTL(value: DirectionalHint): Self = StObject.set(x, "directionalHintForRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalHintForRTLUndefined: Self = StObject.set(x, "directionalHintForRTL", js.undefined)
      
      @scala.inline
      def setDirectionalHintUndefined: Self = StObject.set(x, "directionalHint", js.undefined)
      
      @scala.inline
      def setHostClassName(value: String): Self = StObject.set(x, "hostClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostClassNameUndefined: Self = StObject.set(x, "hostClassName", js.undefined)
      
      @scala.inline
      def setOnTooltipToggle(value: /* isTooltipVisible */ Boolean => Unit): Self = StObject.set(x, "onTooltipToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTooltipToggleUndefined: Self = StObject.set(x, "onTooltipToggle", js.undefined)
      
      @scala.inline
      def setOverflowMode(value: TooltipOverflowMode): Self = StObject.set(x, "overflowMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowModeUndefined: Self = StObject.set(x, "overflowMode", js.undefined)
      
      @scala.inline
      def setSetAriaDescribedBy(value: Boolean): Self = StObject.set(x, "setAriaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAriaDescribedByUndefined: Self = StObject.set(x, "setAriaDescribedBy", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ITooltipHostStyleProps, ITooltipHostStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ITooltipHostStyleProps => DeepPartial[ITooltipHostStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTooltipProps(value: ITooltipProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  @js.native
  trait ITooltipHostStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object ITooltipHostStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ITooltipHostStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipHostStyleProps]
    }
    
    @scala.inline
    implicit class ITooltipHostStylePropsMutableBuilder[Self <: ITooltipHostStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITooltipHostStyles extends StObject {
    
    /**
      * Style for the host wrapper element.
      */
    var root: IStyle = js.native
  }
  object ITooltipHostStyles {
    
    @scala.inline
    def apply(): ITooltipHostStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipHostStyles]
    }
    
    @scala.inline
    implicit class ITooltipHostStylesMutableBuilder[Self <: ITooltipHostStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
