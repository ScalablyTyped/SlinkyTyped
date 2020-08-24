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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/src/vendor", JSImport.Namespace)
@js.native
object vendorMod extends js.Object {
  @js.native
  class StackView () extends default
  
  val Assets: js.Array[js.Any] = js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  val Header: ReactComponentClass[StackHeaderProps] = js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  def HeaderBackButton(
    hasDisabledAllowFontScalingBackImageLabelLabelStyleLabelVisibleOnLabelLayoutOnPressPressColorAndroidScreenLayoutTintColorTitleLayoutTruncatedLabelAccessibilityLabel: Props
  ): ReactElement = js.native
  def HeaderBackground(hasStyleRest: typingsSlinky.reactNavigationStack.headerBackgroundMod.Props): ReactElement = js.native
  def HeaderTitle(hasTintColorStyleRest: typingsSlinky.reactNavigationStack.headerTitleMod.Props): ReactElement = js.native
  def useCardAnimation(): StackCardInterpolationProps = js.native
  def useGestureHandlerRef(): Ref[PanGestureHandler] = js.native
  def useHeaderHeight(): Double = js.native
  @js.native
  object CardStyleInterpolators extends js.Object {
    def forFadeFromBottomAndroid(hasCurrentInvertedLayoutsClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forHorizontalIOS(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forModalPresentationIOS(hasIndexCurrentNextInvertedLayoutsInsets: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forNoAnimation(): StackCardInterpolatedStyle = js.native
    def forRevealFromBottomAndroid(hasCurrentNextInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forScaleFromCenterAndroid(hasCurrentNextClosing: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
    def forVerticalIOS(hasCurrentInvertedLayouts: StackCardInterpolationProps): StackCardInterpolatedStyle = js.native
  }
  
  @js.native
  object HeaderStyleInterpolators extends js.Object {
    def forFade(hasCurrentNext: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forNoAnimation(): StackHeaderInterpolatedStyle = js.native
    def forSlideLeft(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forSlideRight(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forSlideUp(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
    def forUIKit(hasCurrentNextLayouts: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = js.native
  }
  
  /* static members */
  @js.native
  object StackView extends js.Object {
    def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = js.native
  }
  
  @js.native
  object TransitionPresets extends js.Object {
    val DefaultTransition: TransitionPreset = js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    val ModalTransition: TransitionPreset = js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  @js.native
  object TransitionSpecs extends js.Object {
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
}

