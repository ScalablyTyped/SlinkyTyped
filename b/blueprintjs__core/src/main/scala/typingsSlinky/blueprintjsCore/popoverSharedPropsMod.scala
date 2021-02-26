package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`auto-end`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`auto-start`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-top`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-top`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-left`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-right`
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.auto
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.bottom
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.top
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayableProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.popperJs.mod.Boundary
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverSharedPropsMod {
  
  /* Inlined {  AUTO :'auto',   AUTO_END :'auto-end',   AUTO_START :'auto-start',   BOTTOM :'bottom',   BOTTOM_LEFT :'bottom-left',   BOTTOM_RIGHT :'bottom-right',   LEFT :'left',   LEFT_BOTTOM :'left-bottom',   LEFT_TOP :'left-top',   RIGHT :'right',   RIGHT_BOTTOM :'right-bottom',   RIGHT_TOP :'right-top',   TOP :'top',   TOP_LEFT :'top-left',   TOP_RIGHT :'top-right'}[keyof {  AUTO :'auto',   AUTO_END :'auto-end',   AUTO_START :'auto-start',   BOTTOM :'bottom',   BOTTOM_LEFT :'bottom-left',   BOTTOM_RIGHT :'bottom-right',   LEFT :'left',   LEFT_BOTTOM :'left-bottom',   LEFT_TOP :'left-top',   RIGHT :'right',   RIGHT_BOTTOM :'right-bottom',   RIGHT_TOP :'right-top',   TOP :'top',   TOP_LEFT :'top-left',   TOP_RIGHT :'top-right'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-top`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-top`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.right
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.auto
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-right`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`top-left`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`auto-end`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.left
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.bottom
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`auto-start`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.top
    - typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
  */
  trait PopoverPosition extends StObject
  object PopoverPosition {
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.AUTO")
    @js.native
    def AUTO: auto = js.native
    @scala.inline
    def AUTO_=(x: auto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.AUTO_END")
    @js.native
    def AUTO_END: `auto-end` = js.native
    @scala.inline
    def AUTO_END_=(x: `auto-end`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_END")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.AUTO_START")
    @js.native
    def AUTO_START: `auto-start` = js.native
    @scala.inline
    def AUTO_START_=(x: `auto-start`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO_START")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.BOTTOM")
    @js.native
    def BOTTOM: bottom = js.native
    @scala.inline
    def BOTTOM_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.BOTTOM_LEFT")
    @js.native
    def BOTTOM_LEFT: `bottom-left` = js.native
    @scala.inline
    def BOTTOM_LEFT_=(x: `bottom-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.BOTTOM_RIGHT")
    @js.native
    def BOTTOM_RIGHT: `bottom-right` = js.native
    @scala.inline
    def BOTTOM_RIGHT_=(x: `bottom-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.LEFT")
    @js.native
    def LEFT: left = js.native
    @scala.inline
    def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.LEFT_BOTTOM")
    @js.native
    def LEFT_BOTTOM: `left-bottom` = js.native
    @scala.inline
    def LEFT_BOTTOM_=(x: `left-bottom`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT_BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.LEFT_TOP")
    @js.native
    def LEFT_TOP: `left-top` = js.native
    @scala.inline
    def LEFT_TOP_=(x: `left-top`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.RIGHT")
    @js.native
    def RIGHT: right = js.native
    @scala.inline
    def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.RIGHT_BOTTOM")
    @js.native
    def RIGHT_BOTTOM: `right-bottom` = js.native
    @scala.inline
    def RIGHT_BOTTOM_=(x: `right-bottom`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT_BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.RIGHT_TOP")
    @js.native
    def RIGHT_TOP: `right-top` = js.native
    @scala.inline
    def RIGHT_TOP_=(x: `right-top`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT_TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.TOP")
    @js.native
    def TOP: top = js.native
    @scala.inline
    def TOP_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.TOP_LEFT")
    @js.native
    def TOP_LEFT: `top-left` = js.native
    @scala.inline
    def TOP_LEFT_=(x: `top-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverSharedProps", "PopoverPosition.TOP_RIGHT")
    @js.native
    def TOP_RIGHT: `top-right` = js.native
    @scala.inline
    def TOP_RIGHT_=(x: `top-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPopoverSharedProps
    extends IOverlayableProps
       with IProps {
    
    /**
      * Determines the boundary element used by Popper for its `flip` and
      * `preventOverflow` modifiers. Three shorthand keywords are supported;
      * Popper will find the correct DOM element itself.
      * @default "scrollParent"
      */
    var boundary: js.UndefOr[Boundary] = js.native
    
    /**
      * When enabled, clicks inside a `Classes.POPOVER_DISMISS` element
      * will only close the current popover and not outer popovers.
      * When disabled, the current popover and any ancestor popovers will be closed.
      * @see http://blueprintjs.com/docs/#core/components/popover.closing-on-click
      * @default false
      */
    var captureDismiss: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial opened state when uncontrolled.
      * @default false
      */
    var defaultIsOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Prevents the popover from appearing when `true`.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The amount of time in milliseconds the popover should remain open after
      * the user hovers off the trigger. The timer is canceled if the user mouses
      * over the target before it expires.
      * @default 300
      */
    var hoverCloseDelay: js.UndefOr[Double] = js.native
    
    /**
      * The amount of time in milliseconds the popover should wait before opening
      * after the user hovers over the trigger. The timer is canceled if the user
      * mouses away from the target before it expires.
      * @default 150
      */
    var hoverOpenDelay: js.UndefOr[Double] = js.native
    
    /**
      * Whether a popover that uses a `Portal` should automatically inherit the
      * dark theme from its parent.
      * @default true
      */
    var inheritDarkTheme: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the popover is visible. Passing this prop puts the popover in
      * controlled mode, where the only way to change visibility is by updating
      * this property. If `disabled={true}`, this prop will be ignored, and the
      * popover will remain closed.
      * @default undefined
      */
    var isOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to apply minimal styling to this popover or tooltip. Minimal popovers
      * do not have an arrow pointing to their target and use a subtler animation.
      * @default false
      */
    var minimal: js.UndefOr[Boolean] = js.native
    
    /**
      * Popper modifier options, passed directly to internal Popper instance. See
      * https://popper.js.org/docs/modifiers/ for complete
      * details.
      */
    var modifiers: js.UndefOr[Modifiers] = js.native
    
    /**
      * Callback invoked in controlled mode when the popover open state *would*
      * change due to user interaction.
      */
    var onInteraction: js.UndefOr[
        js.Function2[
          /* nextOpenState */ Boolean, 
          /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]], 
          Unit
        ]
      ] = js.native
    
    /**
      * Whether the popover should open when its target is focused. If `true`,
      * target will render with `tabindex="0"` to make it focusable via keyboard
      * navigation.
      * @default true
      */
    var openOnTargetFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * A space-delimited string of class names applied to the popover element.
      */
    var popoverClassName: js.UndefOr[String] = js.native
    
    /**
      * The position (relative to the target) at which the popover should appear.
      *
      * The default value of `"auto"` will choose the best position when opened
      * and will allow the popover to reposition itself to remain onscreen as the
      * user scrolls around.
      * @default "auto"
      */
    var position: js.UndefOr[PopoverPosition] = js.native
    
    /**
      * Space-delimited string of class names applied to the target element.
      */
    var targetClassName: js.UndefOr[String] = js.native
    
    /**
      * HTML props to spread to target element. Use `targetTagName` to change
      * the type of element rendered. Note that `ref` is not supported.
      */
    var targetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
    
    /**
      * HTML tag name for the target element. This must be an HTML element to
      * ensure that it supports the necessary DOM event handlers.
      *
      * By default, a `<span>` tag is used so popovers appear as inline-block
      * elements and can be nested in text. Use `<div>` tag for a block element.
      * @default "span"
      */
    var targetTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
    
    /**
      * HTML tag name for the wrapper element, which also receives the
      * `className` prop.
      * @default "span"
      */
    var wrapperTagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
      ] = js.native
  }
  object IPopoverSharedProps {
    
    @scala.inline
    def apply(): IPopoverSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopoverSharedProps]
    }
    
    @scala.inline
    implicit class IPopoverSharedPropsMutableBuilder[Self <: IPopoverSharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setCaptureDismiss(value: Boolean): Self = StObject.set(x, "captureDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureDismissUndefined: Self = StObject.set(x, "captureDismiss", js.undefined)
      
      @scala.inline
      def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHoverCloseDelay(value: Double): Self = StObject.set(x, "hoverCloseDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverCloseDelayUndefined: Self = StObject.set(x, "hoverCloseDelay", js.undefined)
      
      @scala.inline
      def setHoverOpenDelay(value: Double): Self = StObject.set(x, "hoverOpenDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverOpenDelayUndefined: Self = StObject.set(x, "hoverOpenDelay", js.undefined)
      
      @scala.inline
      def setInheritDarkTheme(value: Boolean): Self = StObject.set(x, "inheritDarkTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInheritDarkThemeUndefined: Self = StObject.set(x, "inheritDarkTheme", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setModifiers(value: Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      @scala.inline
      def setOnInteraction(
        value: (/* nextOpenState */ Boolean, /* e */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit
      ): Self = StObject.set(x, "onInteraction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnInteractionUndefined: Self = StObject.set(x, "onInteraction", js.undefined)
      
      @scala.inline
      def setOpenOnTargetFocus(value: Boolean): Self = StObject.set(x, "openOnTargetFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnTargetFocusUndefined: Self = StObject.set(x, "openOnTargetFocus", js.undefined)
      
      @scala.inline
      def setPopoverClassName(value: String): Self = StObject.set(x, "popoverClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverClassNameUndefined: Self = StObject.set(x, "popoverClassName", js.undefined)
      
      @scala.inline
      def setPosition(value: PopoverPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTargetClassName(value: String): Self = StObject.set(x, "targetClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetClassNameUndefined: Self = StObject.set(x, "targetClassName", js.undefined)
      
      @scala.inline
      def setTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "targetProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPropsUndefined: Self = StObject.set(x, "targetProps", js.undefined)
      
      @scala.inline
      def setTargetTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "targetTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTagNameUndefined: Self = StObject.set(x, "targetTagName", js.undefined)
      
      @scala.inline
      def setWrapperTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = StObject.set(x, "wrapperTagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperTagNameUndefined: Self = StObject.set(x, "wrapperTagName", js.undefined)
    }
  }
}
