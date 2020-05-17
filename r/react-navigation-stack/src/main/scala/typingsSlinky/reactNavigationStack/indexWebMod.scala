package typingsSlinky.reactNavigationStack

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigation.mod.NavigationStackRouterConfig
import typingsSlinky.reactNavigation.mod.SupportedThemes
import typingsSlinky.reactNavigationStack.anon.BackImage
import typingsSlinky.reactNavigationStack.anon.ComponentClassPickPropssc
import typingsSlinky.reactNavigationStack.anon.ContainerStyleDark
import typingsSlinky.reactNavigationStack.anon.ContainerStyleLight
import typingsSlinky.reactNavigationStack.anon.FnCall
import typingsSlinky.reactNavigationStack.anon.FunctionComponentPickProp
import typingsSlinky.reactNavigationStack.anon.Opacity
import typingsSlinky.reactNavigationStack.anon.OpacityAnimatedInterpolation
import typingsSlinky.reactNavigationStack.anon.OpacityAnimatedInterpolationTransformArray
import typingsSlinky.reactNavigationStack.anon.OpacityNumber
import typingsSlinky.reactNavigationStack.anon.OpacityTransform
import typingsSlinky.reactNavigationStack.anon.OpacityUndefined
import typingsSlinky.reactNavigationStack.anon.OpacityUndefinedTransformArray
import typingsSlinky.reactNavigationStack.anon.OverlayOpacity
import typingsSlinky.reactNavigationStack.anon.PickPropsmodeheaderModehe
import typingsSlinky.reactNavigationStack.anon.PickPropsscenenavigationp
import typingsSlinky.reactNavigationStack.anon.PickPropsstylechildrensce
import typingsSlinky.reactNavigationStack.anon.ScreenInterpolator
import typingsSlinky.reactNavigationStack.anon.ShadowOpacity
import typingsSlinky.reactNavigationStack.anon.Transform
import typingsSlinky.reactNavigationStack.anon.TransformArray
import typingsSlinky.reactNavigationStack.anon.TransitionSpec
import typingsSlinky.reactNavigationStack.anon.`0`
import typingsSlinky.reactNavigationStack.anon.`1`
import typingsSlinky.reactNavigationStack.createPointerEventsContainerMod.InjectedProps
import typingsSlinky.reactNavigationStack.createPointerEventsContainerMod.InputProps
import typingsSlinky.reactNavigationStack.headerBackButtonMod.default
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.onComponentRef
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.pointerEvents
import typingsSlinky.reactNavigationStack.transitionerMod.Props
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackConfig
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackOptions
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackProp
import typingsSlinky.reactNavigationStack.typesMod.NavigationStackState
import typingsSlinky.reactNavigationStack.typesMod.Scene
import typingsSlinky.reactNavigationStack.typesMod.SceneDescriptorMap
import typingsSlinky.reactNavigationStack.typesMod.SceneInterpolatorProps
import typingsSlinky.reactNavigationStack.typesMod.TransitionConfig
import typingsSlinky.reactNavigationStack.typesMod.TransitionProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/index.web", JSImport.Namespace)
@js.native
object indexWebMod extends js.Object {
  @js.native
  class Header protected ()
    extends Component[PickPropsscenenavigationp, js.Any, js.Any] {
    def this(props: PickPropsscenenavigationp) = this()
    def this(props: PickPropsscenenavigationp, context: js.Any) = this()
  }
  
  @js.native
  class HeaderBackButton () extends default
  
  @js.native
  class HeaderTitle ()
    extends typingsSlinky.reactNavigationStack.headerTitleMod.default
  
  @js.native
  class StackView ()
    extends typingsSlinky.reactNavigationStack.stackViewMod.StackView
  
  @js.native
  class StackViewCard protected ()
    extends Component[PickPropsstylechildrensce, js.Object, js.Any] {
    def this(props: PickPropsstylechildrensce) = this()
    def this(props: PickPropsstylechildrensce, context: js.Any) = this()
  }
  
  @js.native
  class StackViewLayout protected ()
    extends Component[PickPropsmodeheaderModehe, js.Object, js.Any] {
    def this(props: PickPropsmodeheaderModehe) = this()
    def this(props: PickPropsmodeheaderModehe, context: js.Any) = this()
  }
  
  @js.native
  class Transitioner protected ()
    extends typingsSlinky.reactNavigationStack.transitionerMod.default {
    def this(props: Props) = this()
  }
  
  val Assets: js.Array[scala.Nothing] = js.native
  val StackGestureContext: Context[Ref[PanGestureHandler]] = js.native
  def ScenesReducer(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: Null,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def ScenesReducer(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: NavigationStackState,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def createPointerEventsContainer[Props /* <: InjectedProps with InputProps */](Component: ReactComponentClass[Props]): ReactComponentClass[
    Pick[
      Props, 
      Exclude[
        /* keyof Props */ String, 
        /* keyof react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/createPointerEventsContainer.InjectedProps */ pointerEvents | onComponentRef
      ]
    ]
  ] = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _]
  ): js.Any = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _], _],
    stackConfig: CreateNavigatorConfig[
      NavigationStackConfig, 
      NavigationStackRouterConfig, 
      NavigationStackOptions, 
      NavigationStackProp[NavigationRoute[NavigationParams], _]
    ]
  ): js.Any = js.native
  @js.native
  object Header extends TopLevel[ComponentClassPickPropssc | FunctionComponentPickProp]
  
  /* static members */
  @js.native
  object HeaderBackButton extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: BackImage = js.native
  }
  
  @js.native
  object HeaderStyleInterpolator extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Opacity] = js.native
    var forBackgroundWithFade: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Opacity] = js.native
    var forBackgroundWithTranslation: js.Function1[/* props */ SceneInterpolatorProps, OpacityTransform | OpacityUndefined] = js.native
    var forCenter: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityTransform | OpacityAnimatedInterpolationTransformArray
      ] = js.native
    var forLayout: js.Function1[/* props */ SceneInterpolatorProps, Transform | TransformArray | `0`] = js.native
    var forLeft: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forLeftButton: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityTransform | OpacityAnimatedInterpolationTransformArray
      ] = js.native
    var forRight: js.Function1[/* props */ SceneInterpolatorProps, Opacity | OpacityAnimatedInterpolation] = js.native
  }
  
  /* static members */
  @js.native
  object HeaderTitle extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
  @js.native
  object StackViewCard extends TopLevel[ReactComponentClass[PickPropsstylechildrensce]]
  
  @js.native
  object StackViewLayout extends TopLevel[ReactComponentClass[PickPropsmodeheaderModehe]]
  
  @js.native
  object StackViewStyleInterpolator extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityNumber | Opacity | OpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[/* props */ SceneInterpolatorProps, OpacityNumber | OpacityTransform | `1`] = js.native
    var forFadeToBottomAndroid: js.Function1[/* props */ SceneInterpolatorProps, OpacityNumber | OpacityTransform | `1`] = js.native
    var forHorizontal: js.Function1[/* props */ SceneInterpolatorProps, OpacityNumber | OverlayOpacity | ShadowOpacity] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        OpacityNumber | OpacityTransform | OpacityUndefinedTransformArray
      ] = js.native
  }
  
  @js.native
  object StackViewTransitionConfigs extends js.Object {
    var FadeInFromBottomAndroid: ScreenInterpolator = js.native
    var FadeOutToBottomAndroid: ScreenInterpolator = js.native
    var ModalSlideFromBottomIOS: ContainerStyleLight = js.native
    var NoAnimation: TransitionSpec = js.native
    var SlideFromRightIOS: ContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: FnCall = js.native
  }
  
}

