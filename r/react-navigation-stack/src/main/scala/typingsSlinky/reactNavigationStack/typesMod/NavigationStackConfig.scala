package typingsSlinky.reactNavigationStack.typesMod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.card
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackConfig extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
  var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.undefined
  var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.undefined
  var headerMode: js.UndefOr[HeaderMode] = js.undefined
  var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
  var mode: js.UndefOr[card | modal] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transitionConfig: js.UndefOr[
    js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      TransitionConfig with HeaderTransitionConfig
    ]
  ] = js.undefined
  var transparentCard: js.UndefOr[Boolean] = js.undefined
}

object NavigationStackConfig {
  @scala.inline
  def apply(
    cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined,
    cardShadowEnabled: js.UndefOr[Boolean] = js.undefined,
    cardStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerBackgroundTransitionPreset: HeaderBackgroundTransitionPreset = null,
    headerLayoutPreset: HeaderLayoutPreset = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: HeaderTransitionPreset = null,
    mode: card | modal = null,
    onTransitionEnd: () => Unit = null,
    onTransitionStart: () => Unit = null,
    transitionConfig: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => TransitionConfig with HeaderTransitionConfig = null,
    transparentCard: js.UndefOr[Boolean] = js.undefined
  ): NavigationStackConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cardOverlayEnabled)) __obj.updateDynamic("cardOverlayEnabled")(cardOverlayEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cardShadowEnabled)) __obj.updateDynamic("cardShadowEnabled")(cardShadowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cardStyle)) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableKeyboardHandling)) __obj.updateDynamic("disableKeyboardHandling")(disableKeyboardHandling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible.get.asInstanceOf[js.Any])
    if (headerBackgroundTransitionPreset != null) __obj.updateDynamic("headerBackgroundTransitionPreset")(headerBackgroundTransitionPreset.asInstanceOf[js.Any])
    if (headerLayoutPreset != null) __obj.updateDynamic("headerLayoutPreset")(headerLayoutPreset.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode.asInstanceOf[js.Any])
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction0(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (transitionConfig != null) __obj.updateDynamic("transitionConfig")(js.Any.fromFunction3(transitionConfig))
    if (!js.isUndefined(transparentCard)) __obj.updateDynamic("transparentCard")(transparentCard.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationStackConfig]
  }
}

