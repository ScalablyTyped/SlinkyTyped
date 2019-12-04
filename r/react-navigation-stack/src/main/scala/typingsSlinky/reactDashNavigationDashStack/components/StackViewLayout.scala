package typingsSlinky.reactDashNavigationDashStack.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNavigationDashStack.PickPropsmodeheaderModeheaderLayoutPresetheaderTra
import typingsSlinky.reactDashNavigationDashStack.TransitionConfigHeaderTransitionConfig
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderBackgroundTransitionPreset
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import typingsSlinky.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewLayoutMod.default
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.card
import typingsSlinky.reactDashNavigationDashStack.reactDashNavigationDashStackStrings.modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackViewLayout
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewLayout", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    transitionProps: TransitionProps,
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: StyleProp[ViewStyle] = null,
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerBackgroundTransitionPreset: HeaderBackgroundTransitionPreset = null,
    headerLayoutPreset: HeaderLayoutPreset = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: HeaderTransitionPreset = null,
    lastTransitionProps: TransitionProps = null,
    mode: card | modal = null,
    onGestureBegin: () => Unit = null,
    onGestureCanceled: () => Unit = null,
    onGestureEnd: () => Unit = null,
    onTransitionEnd: () => Unit = null,
    onTransitionStart: () => Unit = null,
    screenProps: js.Any = null,
    transitionConfig: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => TransitionConfigHeaderTransitionConfig = null,
    transparentCard: js.UndefOr[Boolean] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(transitionProps = transitionProps.asInstanceOf[js.Any])
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.asInstanceOf[js.Any])
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible.asInstanceOf[js.Any])
    if (headerBackgroundTransitionPreset != null) __obj.updateDynamic("headerBackgroundTransitionPreset")(headerBackgroundTransitionPreset.asInstanceOf[js.Any])
    if (headerLayoutPreset != null) __obj.updateDynamic("headerLayoutPreset")(headerLayoutPreset.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (lastTransitionProps != null) __obj.updateDynamic("lastTransitionProps")(lastTransitionProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onGestureBegin != null) __obj.updateDynamic("onGestureBegin")(js.Any.fromFunction0(onGestureBegin))
    if (onGestureCanceled != null) __obj.updateDynamic("onGestureCanceled")(js.Any.fromFunction0(onGestureCanceled))
    if (onGestureEnd != null) __obj.updateDynamic("onGestureEnd")(js.Any.fromFunction0(onGestureEnd))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (transitionConfig != null) __obj.updateDynamic("transitionConfig")(js.Any.fromFunction3(transitionConfig))
    if (!js.isUndefined(transparentCard)) __obj.updateDynamic("transparentCard")(transparentCard.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PickPropsmodeheaderModeheaderLayoutPresetheaderTra
}

