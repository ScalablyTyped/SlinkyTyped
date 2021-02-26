package typingsSlinky.reactNativeNavigation

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactNative.mod.NativeTouchEvent
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TouchableHighlight
import typingsSlinky.reactNative.mod.TouchableNativeFeedback
import typingsSlinky.reactNative.mod.TouchableOpacity
import typingsSlinky.reactNative.mod.TouchableWithoutFeedback
import typingsSlinky.reactNativeNavigation.anon.Children
import typingsSlinky.reactNativeNavigation.anon.ReactTag
import typingsSlinky.reactNativeNavigation.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchablePreviewMod {
  
  @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
  @js.native
  class TouchablePreview protected ()
    extends PureComponent[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: js.Any) = this()
    
    def onPress(): Unit = js.native
    
    def onPressIn(): Unit | Null = js.native
    
    var onRef: js.Any = js.native
    
    def onTouchEnd(): Unit = js.native
    
    def onTouchMove(event: SyntheticEvent[NodeHandle, NativeTouchEventWithForce]): Unit = js.native
    
    def onTouchStart(event: SyntheticEvent[NodeHandle, NativeTouchEvent]): Unit = js.native
    
    var timeout: js.Any = js.native
    
    var touchStartedAt: js.Any = js.native
  }
  /* static members */
  object TouchablePreview {
    
    @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview.defaultProps")
    @js.native
    def defaultProps: `0` = js.native
    @scala.inline
    def defaultProps_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview.peeking")
    @js.native
    def peeking: Boolean = js.native
    @scala.inline
    def peeking_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peeking")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview.propTypes")
    @js.native
    def propTypes: Children = js.native
    @scala.inline
    def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type GestureResponderEventWithForce = SyntheticEvent[NodeHandle, NativeTouchEventWithForce]
  
  @js.native
  trait NativeTouchEventWithForce extends NativeTouchEvent {
    
    var force: Double = js.native
  }
  object NativeTouchEventWithForce {
    
    @scala.inline
    def apply(
      changedTouches: js.Array[NativeTouchEvent],
      force: Double,
      identifier: String,
      locationX: Double,
      locationY: Double,
      pageX: Double,
      pageY: Double,
      target: String,
      timestamp: Double,
      touches: js.Array[NativeTouchEvent]
    ): NativeTouchEventWithForce = {
      val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], locationX = locationX.asInstanceOf[js.Any], locationY = locationY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeTouchEventWithForce]
    }
    
    @scala.inline
    implicit class NativeTouchEventWithForceMutableBuilder[Self <: NativeTouchEventWithForce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Double): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var onPeekIn: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPeekOut: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onPressIn: js.UndefOr[js.Function1[/* payload */ ReactTag, Unit]] = js.native
    
    var touchableComponent: js.UndefOr[
        TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactElement
      ] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnPeekIn(value: () => Unit): Self = StObject.set(x, "onPeekIn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPeekInUndefined: Self = StObject.set(x, "onPeekIn", js.undefined)
      
      @scala.inline
      def setOnPeekOut(value: () => Unit): Self = StObject.set(x, "onPeekOut", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPeekOutUndefined: Self = StObject.set(x, "onPeekOut", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressIn(value: /* payload */ ReactTag => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setTouchableComponent(
        value: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | ReactElement
      ): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchableComponentReactElement(value: ReactElement): Self = StObject.set(x, "touchableComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchableComponentUndefined: Self = StObject.set(x, "touchableComponent", js.undefined)
    }
  }
}
