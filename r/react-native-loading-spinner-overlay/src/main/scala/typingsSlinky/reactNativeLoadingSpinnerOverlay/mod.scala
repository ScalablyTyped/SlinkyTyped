package typingsSlinky.reactNativeLoadingSpinnerOverlay

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.fade
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.large
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.none
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.normal
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.slide
import typingsSlinky.reactNativeLoadingSpinnerOverlay.reactNativeLoadingSpinnerOverlayStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-loading-spinner-overlay", JSImport.Default)
  @js.native
  class default ()
    extends Component[SpinnerProps, js.Object, js.Any]
  
  type Spinner = ReactComponentClass[SpinnerProps]
  
  @js.native
  trait SpinnerProps extends StObject {
    
    var animation: js.UndefOr[none | slide | fade] = js.native
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var customIndicator: js.UndefOr[ReactElement] = js.native
    
    var overlayColor: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[normal | small | large] = js.native
    
    var textContent: js.UndefOr[String] = js.native
    
    var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SpinnerProps {
    
    @scala.inline
    def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: none | slide | fade): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustomIndicator(value: ReactElement): Self = StObject.set(x, "customIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomIndicatorUndefined: Self = StObject.set(x, "customIndicator", js.undefined)
      
      @scala.inline
      def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      @scala.inline
      def setSize(value: normal | small | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
      
      @scala.inline
      def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
