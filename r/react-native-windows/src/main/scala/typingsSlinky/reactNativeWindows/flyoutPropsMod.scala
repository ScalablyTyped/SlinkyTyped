package typingsSlinky.reactNativeWindows

import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flyoutPropsMod {
  
  @js.native
  trait IFlyoutProps extends ViewProps {
    
    var horizontalOffset: js.UndefOr[Double] = js.native
    
    var isLightDismissEnabled: js.UndefOr[Boolean] = js.native
    
    var isOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether the area outside the flyout is darkened
      */
    var isOverlayEnabled: js.UndefOr[Boolean] = js.native
    
    var onDismiss: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var target: js.UndefOr[ReactElement] = js.native
    
    var verticalOffset: js.UndefOr[Double] = js.native
  }
  object IFlyoutProps {
    
    @scala.inline
    def apply(): IFlyoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlyoutProps]
    }
    
    @scala.inline
    implicit class IFlyoutPropsMutableBuilder[Self <: IFlyoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      @scala.inline
      def setIsLightDismissEnabled(value: Boolean): Self = StObject.set(x, "isLightDismissEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLightDismissEnabledUndefined: Self = StObject.set(x, "isLightDismissEnabled", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setIsOverlayEnabled(value: Boolean): Self = StObject.set(x, "isOverlayEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOverlayEnabledUndefined: Self = StObject.set(x, "isOverlayEnabled", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* isOpen */ Boolean => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTarget(value: ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetReactElement(value: ReactElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.top
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.bottom
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.left
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.right
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.full
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom`
    - typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom`
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottom: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.bottom]
    
    @scala.inline
    def `bottom-edge-aligned-left`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left` = "bottom-edge-aligned-left".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left`]
    
    @scala.inline
    def `bottom-edge-aligned-right`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right` = "bottom-edge-aligned-right".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right`]
    
    @scala.inline
    def full: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.full = "full".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.full]
    
    @scala.inline
    def left: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.left = "left".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.left]
    
    @scala.inline
    def `left-edge-aligned-bottom`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom` = "left-edge-aligned-bottom".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom`]
    
    @scala.inline
    def `left-edge-aligned-top`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top` = "left-edge-aligned-top".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top`]
    
    @scala.inline
    def right: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.right = "right".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.right]
    
    @scala.inline
    def `right-edge-aligned-bottom`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom` = "right-edge-aligned-bottom".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom`]
    
    @scala.inline
    def `right-edge-aligned-top`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top` = "right-edge-aligned-top".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top`]
    
    @scala.inline
    def top: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.top = "top".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.top]
    
    @scala.inline
    def `top-edge-aligned-left`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left` = "top-edge-aligned-left".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left`]
    
    @scala.inline
    def `top-edge-aligned-right`: typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right` = "top-edge-aligned-right".asInstanceOf[typingsSlinky.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right`]
  }
}
