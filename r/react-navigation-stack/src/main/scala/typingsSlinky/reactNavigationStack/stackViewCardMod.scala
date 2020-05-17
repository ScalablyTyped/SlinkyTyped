package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
import typingsSlinky.reactNative.mod.Animated.Value
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.View
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigationStack.anon.PickPropsstylechildrensce
import typingsSlinky.reactNavigationStack.createPointerEventsContainerMod.PointerEvents
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewCard", JSImport.Namespace)
@js.native
object stackViewCardMod extends js.Object {
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InputProps & react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps & {  style  :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   animatedStyle  :any,   position  :react-native.react-native.Animated.AnimatedInterpolation,   transparent ? :boolean,   children  :react.react.ReactNode} */
  @js.native
  trait Props extends js.Object {
    var animatedStyle: js.Any = js.native
    var children: TagMod[Any] = js.native
    var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
    var pointerEvents: PointerEvents = js.native
    var position: AnimatedInterpolation = js.native
    var realPosition: Value = js.native
    var scene: Scene = js.native
    var style: StyleProp[ViewStyle] = js.native
    var transparent: js.UndefOr[Boolean] = js.native
    def onComponentRef(): Unit = js.native
    def onComponentRef(ref: View): Unit = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[PickPropsstylechildrensce, js.Object, js.Any] {
    def this(props: PickPropsstylechildrensce) = this()
    def this(props: PickPropsstylechildrensce, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ReactComponentClass[PickPropsstylechildrensce]]
  
}

