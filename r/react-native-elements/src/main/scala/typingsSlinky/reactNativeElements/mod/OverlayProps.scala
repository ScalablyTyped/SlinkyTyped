package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactNative.mod.ModalBaseProps
import typingsSlinky.reactNative.mod.ModalPropsAndroid
import typingsSlinky.reactNative.mod.ModalPropsIOS
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlayProps
  extends ViewProps
     with ModalBaseProps
     with ModalPropsIOS
     with ModalPropsAndroid {
  
  /**
    *  Override React Native `Modal` component (usable for web-platform)
    */
  var ModalComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  
  /**
    * Style for the backdrop
    */
  var backdropStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Content of the overlay
    */
  var children: ReactElement = js.native
  
  /**
    * If to take up full screen width and height
    *
    * @default false
    */
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the overlay is visible
    */
  var isVisible: Boolean = js.native
  
  /**
    * Callback when user touches the backdrop
    */
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Style of the actual overlay
    */
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object OverlayProps {
  
  @scala.inline
  def apply(children: ReactElement, isVisible: Boolean): OverlayProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  
  @scala.inline
  implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackdropStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "backdropStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackdropStyleNull: Self = StObject.set(x, "backdropStyle", null)
    
    @scala.inline
    def setBackdropStyleUndefined: Self = StObject.set(x, "backdropStyle", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
    
    @scala.inline
    def setOnBackdropPress(value: () => Unit): Self = StObject.set(x, "onBackdropPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
    
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
    
    @scala.inline
    def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
  }
}
