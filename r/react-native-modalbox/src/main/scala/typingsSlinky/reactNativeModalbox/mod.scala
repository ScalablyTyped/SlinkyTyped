package typingsSlinky.reactNativeModalbox

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.bottom
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.center
import typingsSlinky.reactNativeModalbox.reactNativeModalboxStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modalbox", JSImport.Default)
  @js.native
  class default () extends Modal
  
  @js.native
  trait Modal
    extends Component[ModalProps, js.Object, js.Any] {
    
    /**
      * Close the modal
      *
      *
      */
    def close(): Unit = js.native
    
    /**
      * Open the modal
      *
      *
      */
    def open(): Unit = js.native
  }
  
  @js.native
  trait ModalProps extends StObject {
    
    /**
      * Duration of the animation
      *
      * Default is 400ms
      *
      */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /**
      * (Android only) Close modal when receiving back button event
      *
      * Default is false
      *
      */
    var backButtonClose: js.UndefOr[Boolean] = js.native
    
    /**
      * If a backdrop is displayed behind the modal
      *
      * Default is true
      *
      */
    var backdrop: js.UndefOr[Boolean] = js.native
    
    /**
      * Background color of the backdrop
      *
      * Default is black
      *
      */
    var backdropColor: js.UndefOr[String] = js.native
    
    /**
      * Add an element in the backdrop (a close button for example)
      *
      * Default is null
      *
      */
    var backdropContent: js.UndefOr[ReactElement] = js.native
    
    /**
      * Opacity of the backdrop
      *
      * Default is 0.5
      *
      */
    var backdropOpacity: js.UndefOr[Double] = js.native
    
    /**
      * If the modal can be closed by pressing on the backdrop
      *
      * Default is true
      *
      */
    var backdropPressToClose: js.UndefOr[Boolean] = js.native
    
    /**
      *
      * Default is false
      */
    var coverScreen: js.UndefOr[Boolean] = js.native
    
    /**
      * The direction modal enters from
      *
      * Default is bottom
      *
      */
    var entry: js.UndefOr[top | bottom | String] = js.native
    
    /**
      * Checks if the modal is disabled
      *
      * Default is false
      *
      */
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Checks if the modal is open
      *
      * Default is false
      *
      */
    var isOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * This property prevent the modal to cover the ios status bar when the modal is scrolling up because the keyboard is opening
      *
      * Default is ios:22, android:0
      */
    var keyboardTopOffset: js.UndefOr[Double] = js.native
    
    /**
      * Event fired when the modal is closed and the animation is complete
      *
      */
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * When the state of the swipe to close feature has changed
      * (useful to change the content of the modal, display a message for example)
      *
      *
      */
    var onClosingState: js.UndefOr[js.Function1[/* state */ Boolean, Unit]] = js.native
    
    /**
      * Event fired when the modal is opened and the animation is complete
      *
      */
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * The final position of the modal.
      * Accepts top, center or bottom
      *
      * Default is center
      *
      */
    var position: js.UndefOr[top | center | bottom | String] = js.native
    
    /**
      * If the modal should appear open without animation upon first mount
      *
      * Default is false
      *
      */
    var startOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom styling for the content area
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * The height in pixels of the swipeable area
      *
      * Default is the Window Height
      *
      */
    var swipeArea: js.UndefOr[Double] = js.native
    
    /**
      * The threshold to reach in pixels to close the modal
      *
      * Default is 50
      *
      */
    var swipeThreshold: js.UndefOr[Double] = js.native
    
    /**
      * If the modal can be closed by swiping
      *
      * Default is true
      *
      */
    var swipeToClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables the hardware acceleration to animate the modal. Please note that enabling this can cause some flashes in a weird way when animating
      *
      * Default is true
      *
      */
    var useNativeDriver: js.UndefOr[Boolean] = js.native
  }
  object ModalProps {
    
    @scala.inline
    def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit class ModalPropsMutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBackButtonClose(value: Boolean): Self = StObject.set(x, "backButtonClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackButtonCloseUndefined: Self = StObject.set(x, "backButtonClose", js.undefined)
      
      @scala.inline
      def setBackdrop(value: Boolean): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropColorUndefined: Self = StObject.set(x, "backdropColor", js.undefined)
      
      @scala.inline
      def setBackdropContent(value: ReactElement): Self = StObject.set(x, "backdropContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropContentReactElement(value: ReactElement): Self = StObject.set(x, "backdropContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropContentUndefined: Self = StObject.set(x, "backdropContent", js.undefined)
      
      @scala.inline
      def setBackdropOpacity(value: Double): Self = StObject.set(x, "backdropOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropOpacityUndefined: Self = StObject.set(x, "backdropOpacity", js.undefined)
      
      @scala.inline
      def setBackdropPressToClose(value: Boolean): Self = StObject.set(x, "backdropPressToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropPressToCloseUndefined: Self = StObject.set(x, "backdropPressToClose", js.undefined)
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      @scala.inline
      def setCoverScreen(value: Boolean): Self = StObject.set(x, "coverScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverScreenUndefined: Self = StObject.set(x, "coverScreen", js.undefined)
      
      @scala.inline
      def setEntry(value: top | bottom | String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setKeyboardTopOffset(value: Double): Self = StObject.set(x, "keyboardTopOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardTopOffsetUndefined: Self = StObject.set(x, "keyboardTopOffset", js.undefined)
      
      @scala.inline
      def setOnClosed(value: () => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnClosingState(value: /* state */ Boolean => Unit): Self = StObject.set(x, "onClosingState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClosingStateUndefined: Self = StObject.set(x, "onClosingState", js.undefined)
      
      @scala.inline
      def setOnOpened(value: () => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setPosition(value: top | center | bottom | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStartOpen(value: Boolean): Self = StObject.set(x, "startOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOpenUndefined: Self = StObject.set(x, "startOpen", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwipeArea(value: Double): Self = StObject.set(x, "swipeArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeAreaUndefined: Self = StObject.set(x, "swipeArea", js.undefined)
      
      @scala.inline
      def setSwipeThreshold(value: Double): Self = StObject.set(x, "swipeThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeThresholdUndefined: Self = StObject.set(x, "swipeThreshold", js.undefined)
      
      @scala.inline
      def setSwipeToClose(value: Boolean): Self = StObject.set(x, "swipeToClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeToCloseUndefined: Self = StObject.set(x, "swipeToClose", js.undefined)
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
