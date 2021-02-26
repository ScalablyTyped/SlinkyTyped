package typingsSlinky.reactNavigationStack

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.mod.PanGestureHandler
import typingsSlinky.reactNavigationStack.anon.ClosingRouteKeys
import typingsSlinky.reactNavigationStack.anon.Descriptors
import typingsSlinky.reactNavigationStack.anon.ReadonlyProps
import typingsSlinky.reactNavigationStack.anon.ReadonlyState
import typingsSlinky.reactNavigationStack.headerBackButtonMod.Props
import typingsSlinky.reactNavigationStack.stackViewMod.default
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackCardInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolatedStyle
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderInterpolationProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.StackHeaderProps
import typingsSlinky.reactNavigationStack.vendorTypesMod.TransitionPreset
import typingsSlinky.reactNavigationStack.vendorTypesMod.TransitionSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vendorMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "Assets")
  @js.native
  val Assets: js.Array[js.Any] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardAnimationContext")
  @js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  object CardStyleInterpolators {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forFadeFromBottomAndroid")
    @js.native
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forHorizontalIOS")
    @js.native
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forModalPresentationIOS")
    @js.native
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forNoAnimation")
    @js.native
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forRevealFromBottomAndroid")
    @js.native
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forScaleFromCenterAndroid")
    @js.native
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "CardStyleInterpolators.forVerticalIOS")
    @js.native
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "GestureHandlerRefContext")
  @js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "Header")
  @js.native
  val Header: ReactComponentClass[StackHeaderProps] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderBackButton")
  @js.native
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabelStyle: Props
  ): ReactElement = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderBackground")
  @js.native
  def HeaderBackground(hasStyleRest: typingsSlinky.reactNavigationStack.headerBackgroundMod.Props): ReactElement = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  object HeaderStyleInterpolators {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators.forFade")
    @js.native
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators.forNoAnimation")
    @js.native
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators.forSlideLeft")
    @js.native
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators.forSlideRight")
    @js.native
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators.forSlideUp")
    @js.native
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderStyleInterpolators.forUIKit")
    @js.native
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "HeaderTitle")
  @js.native
  def HeaderTitle(hasTintColorStyleRest: typingsSlinky.reactNavigationStack.headerTitleMod.Props): ReactElement = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "StackView")
  @js.native
  class StackView () extends default
  /* static members */
  object StackView {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "StackView.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = js.native
  }
  
  object TransitionPresets {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.DefaultTransition")
    @js.native
    val DefaultTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.FadeFromBottomAndroid")
    @js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ModalPresentationIOS")
    @js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ModalSlideFromBottomIOS")
    @js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ModalTransition")
    @js.native
    val ModalTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.RevealFromBottomAndroid")
    @js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.ScaleFromCenterAndroid")
    @js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionPresets.SlideFromRightIOS")
    @js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  object TransitionSpecs {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.FadeInFromBottomAndroidSpec")
    @js.native
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.FadeOutToBottomAndroidSpec")
    @js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.RevealFromBottomAndroidSpec")
    @js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.ScaleFromCenterAndroidSpec")
    @js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor", "TransitionSpecs.TransitionIOSSpec")
    @js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "useCardAnimation")
  @js.native
  def useCardAnimation(): StackCardInterpolationProps = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "useGestureHandlerRef")
  @js.native
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor", "useHeaderHeight")
  @js.native
  def useHeaderHeight(): Double = js.native
}
