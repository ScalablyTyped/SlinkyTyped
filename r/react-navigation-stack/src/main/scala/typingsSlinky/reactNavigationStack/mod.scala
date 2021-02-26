package typingsSlinky.reactNavigationStack

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNavigation.mod.CreateNavigatorConfig
import typingsSlinky.reactNavigation.mod.NavigationNavigator
import typingsSlinky.reactNavigation.mod.NavigationParams
import typingsSlinky.reactNavigation.mod.NavigationProp
import typingsSlinky.reactNavigation.mod.NavigationRoute
import typingsSlinky.reactNavigation.mod.NavigationRouteConfigMap
import typingsSlinky.reactNavigation.mod.NavigationStackRouterConfig
import typingsSlinky.reactNavigation.mod.NavigationState
import typingsSlinky.reactNavigationStack.anon.ClosingRouteKeys
import typingsSlinky.reactNavigationStack.anon.Descriptors
import typingsSlinky.reactNavigationStack.anon.ReadonlyProps
import typingsSlinky.reactNavigationStack.anon.ReadonlyState
import typingsSlinky.reactNavigationStack.headerBackButtonMod.Props
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationConfig
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationOptions
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackNavigationProp
import typingsSlinky.reactNavigationStack.vendorTypesMod.TransitionPreset
import typingsSlinky.reactNavigationStack.vendorTypesMod.TransitionSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-navigation-stack", "Assets")
  @js.native
  val Assets: js.Array[js.Any] = js.native
  
  @JSImport("react-navigation-stack", "CardAnimationContext")
  @js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  object CardStyleInterpolators {
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forFadeFromBottomAndroid")
    @js.native
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forHorizontalIOS")
    @js.native
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forModalPresentationIOS")
    @js.native
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forNoAnimation")
    @js.native
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forRevealFromBottomAndroid")
    @js.native
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forScaleFromCenterAndroid")
    @js.native
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators.forVerticalIOS")
    @js.native
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @JSImport("react-navigation-stack", "GestureHandlerRefContext")
  @js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  @JSImport("react-navigation-stack", "Header")
  @js.native
  val Header: ReactComponentClass[StackHeaderProps] = js.native
  
  @JSImport("react-navigation-stack", "HeaderBackButton")
  @js.native
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): ReactElement = js.native
  
  @JSImport("react-navigation-stack", "HeaderBackground")
  @js.native
  def HeaderBackground(hasStyleRest: typingsSlinky.reactNavigationStack.headerBackgroundMod.Props): ReactElement = js.native
  
  @JSImport("react-navigation-stack", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  object HeaderStyleInterpolators {
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators.forFade")
    @js.native
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators.forNoAnimation")
    @js.native
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators.forSlideLeft")
    @js.native
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators.forSlideRight")
    @js.native
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators.forSlideUp")
    @js.native
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators.forUIKit")
    @js.native
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  @JSImport("react-navigation-stack", "HeaderTitle")
  @js.native
  def HeaderTitle(hasTintColorStyleRest: typingsSlinky.reactNavigationStack.headerTitleMod.Props): ReactElement = js.native
  
  @JSImport("react-navigation-stack", "StackView")
  @js.native
  class StackView ()
    extends typingsSlinky.reactNavigationStack.vendorMod.StackView
  /* static members */
  object StackView {
    
    @JSImport("react-navigation-stack", "StackView.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = js.native
  }
  
  object TransitionPresets {
    
    @JSImport("react-navigation-stack", "TransitionPresets.DefaultTransition")
    @js.native
    val DefaultTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.FadeFromBottomAndroid")
    @js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ModalPresentationIOS")
    @js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ModalSlideFromBottomIOS")
    @js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ModalTransition")
    @js.native
    val ModalTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.RevealFromBottomAndroid")
    @js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ScaleFromCenterAndroid")
    @js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.SlideFromRightIOS")
    @js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  object TransitionSpecs {
    
    @JSImport("react-navigation-stack", "TransitionSpecs.FadeInFromBottomAndroidSpec")
    @js.native
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.FadeOutToBottomAndroidSpec")
    @js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.RevealFromBottomAndroidSpec")
    @js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.ScaleFromCenterAndroidSpec")
    @js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.TransitionIOSSpec")
    @js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
  @JSImport("react-navigation-stack", "createStackNavigator")
  @js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  @JSImport("react-navigation-stack", "createStackNavigator")
  @js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ],
    stackConfig: CreateNavigatorConfig[
      StackNavigationConfig, 
      NavigationStackRouterConfig, 
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ): NavigationNavigator[_, NavigationProp[NavigationState]] = js.native
  
  @JSImport("react-navigation-stack", "useCardAnimation")
  @js.native
  def useCardAnimation(): StackCardInterpolationProps = js.native
  
  @JSImport("react-navigation-stack", "useGestureHandlerRef")
  @js.native
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  
  @JSImport("react-navigation-stack", "useHeaderHeight")
  @js.native
  def useHeaderHeight(): Double = js.native
}
