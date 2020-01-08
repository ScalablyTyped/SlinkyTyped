package typingsSlinky.reactDashNavigationDashStack

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderBackgroundTransitionPreset
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionConfig
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.card
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewLayout", JSImport.Namespace)
@js.native
object libTypescriptViewsStackViewStackViewLayoutMod extends js.Object {
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackConfig & {  isLandscape  :boolean,   transitionProps  :react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps,   lastTransitionProps ? :react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, transitionConfig ? (transitionProps : react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, prevTransitionProps ? : react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, isModal ? : boolean): react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionConfig, onGestureBegin ? (): void, onGestureEnd ? (): void, onGestureCanceled ? (): void,   screenProps ? :unknown} */
  @js.native
  trait Props extends js.Object {
    var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
    var cardShadowEnabled: js.UndefOr[Boolean] = js.native
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    var disableKeyboardHandling: js.UndefOr[Boolean] = js.native
    var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
    var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.native
    var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.native
    var headerMode: js.UndefOr[HeaderMode] = js.native
    var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.native
    var isLandscape: Boolean = js.native
    var lastTransitionProps: js.UndefOr[TransitionProps] = js.native
    var mode: js.UndefOr[card | modal] = js.native
    var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.native
    var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.native
    var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.native
    var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
    var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
    var screenProps: js.UndefOr[js.Any] = js.native
    var transitionConfig: js.UndefOr[
        js.Function3[
          /* transitionProps */ TransitionProps, 
          js.UndefOr[TransitionProps], 
          js.UndefOr[Boolean], 
          TransitionConfig | TransitionConfigHeaderTransitionConfig
        ]
      ] = js.native
    var transitionProps: TransitionProps = js.native
    var transparentCard: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[PickPropsmodeheaderModeheaderLayoutPresetheaderTra, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra) = this()
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[PickPropsmodeheaderModeheaderLayoutPresetheaderTra]]
  
}

