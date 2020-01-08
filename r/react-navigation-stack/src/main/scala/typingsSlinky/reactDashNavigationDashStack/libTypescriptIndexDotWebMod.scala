package typingsSlinky.reactDashNavigationDashStack

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.PanGestureHandler
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.NavigationRouteConfigMap
import typingsSlinky.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackOptions
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackState
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionConfig
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderBackButtonMod.default
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.Props
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/index.web", JSImport.Namespace)
@js.native
object libTypescriptIndexDotWebMod extends js.Object {
  @js.native
  class Header protected ()
    extends Component[PickPropsscenenavigationpositionlayoutPresetbackTi, js.Any, js.Any] {
    def this(props: PickPropsscenenavigationpositionlayoutPresetbackTi) = this()
    def this(props: PickPropsscenenavigationpositionlayoutPresetbackTi, context: js.Any) = this()
  }
  
  @js.native
  class HeaderBackButton () extends default
  
  @js.native
  class HeaderTitle ()
    extends typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderTitleMod.default
  
  @js.native
  class StackView ()
    extends typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.StackView
  
  @js.native
  class StackViewCard protected ()
    extends Component[PickPropsstylechildrenscenenavigationrealPositiona, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona) = this()
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona, context: js.Any) = this()
  }
  
  @js.native
  class StackViewLayout protected ()
    extends Component[PickPropsmodeheaderModeheaderLayoutPresetheaderTra, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra) = this()
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra, context: js.Any) = this()
  }
  
  @js.native
  class Transitioner protected ()
    extends typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod.default {
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
  def createPointerEventsContainer[Props /* <: InjectedPropsInputProps */](Component: ReactComponentClass[Props]): ReactComponentClass[Pick[Props, Exclude[String, String]]] = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _]]
  ): js.Any = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _]],
    stackConfig: CreateNavigatorConfigNavigationStackConfigNavigati
  ): js.Any = js.native
  @js.native
  object Header extends TopLevel[
          ComponentClassPickPropsscenenavigationpositionlayo | FunctionComponentPickPropsscenenavigationpositionl
        ]
  
  /* static members */
  @js.native
  object HeaderBackButton extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: Anon_BackImage = js.native
  }
  
  @js.native
  object HeaderStyleInterpolator extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Anon_Opacity] = js.native
    var forBackgroundWithFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, Anon_Opacity] = js.native
    var forBackgroundWithTranslation: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forCenter: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolation
      ] = js.native
    var forLayout: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Transform | Anon_TransformAnonTranslateX | Anon_TransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forLeftButton: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolation
      ] = js.native
    var forRight: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
  }
  
  /* static members */
  @js.native
  object HeaderTitle extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
  @js.native
  object StackViewCard extends TopLevel[ComponentType[PickPropsstylechildrenscenenavigationrealPositiona]]
  
  @js.native
  object StackViewLayout extends TopLevel[ComponentType[PickPropsmodeheaderModeheaderLayoutPresetheaderTra]]
  
  @js.native
  object StackViewStyleInterpolator extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_Opacity | Anon_OpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forFadeToBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forHorizontal: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityOverlayOpacity | Anon_OpacityOverlayOpacityShadowOpacity
      ] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateY
      ] = js.native
  }
  
  @js.native
  object StackViewTransitionConfigs extends js.Object {
    var FadeInFromBottomAndroid: Anon_Props = js.native
    var FadeOutToBottomAndroid: Anon_Props = js.native
    var ModalSlideFromBottomIOS: Anon_ContainerStyleDarkContainerStyleLight = js.native
    var NoAnimation: Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator = js.native
    var SlideFromRightIOS: Anon_ContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: Fn_IsModal = js.native
  }
  
}

