package typingsSlinky.reactNavigationStack.anon

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.card
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.modal
import typingsSlinky.reactNavigationStack.typesMod.HeaderBackgroundTransitionPreset
import typingsSlinky.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsSlinky.reactNavigationStack.typesMod.HeaderMode
import typingsSlinky.reactNavigationStack.typesMod.HeaderTransitionConfig
import typingsSlinky.reactNavigationStack.typesMod.HeaderTransitionPreset
import typingsSlinky.reactNavigationStack.typesMod.TransitionConfig
import typingsSlinky.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/StackView/StackViewLayout.Props, 'mode' | 'headerMode' | 'headerLayoutPreset' | 'headerTransitionPreset' | 'headerBackgroundTransitionPreset' | 'headerBackTitleVisible' | 'disableKeyboardHandling' | 'transparentCard' | 'cardShadowEnabled' | 'cardOverlayEnabled' | 'cardStyle' | 'onTransitionStart' | 'onTransitionEnd' | 'transitionConfig' | 'transitionProps' | 'lastTransitionProps' | 'onGestureBegin' | 'onGestureEnd' | 'onGestureCanceled' | 'screenProps'> */
trait PickPropsmodeheaderModehe extends js.Object {
  var cardOverlayEnabled: js.UndefOr[Boolean] = js.undefined
  var cardShadowEnabled: js.UndefOr[Boolean] = js.undefined
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var disableKeyboardHandling: js.UndefOr[Boolean] = js.undefined
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
  var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.undefined
  var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.undefined
  var headerMode: js.UndefOr[HeaderMode] = js.undefined
  var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
  var lastTransitionProps: js.UndefOr[TransitionProps] = js.undefined
  var mode: js.UndefOr[card | modal] = js.undefined
  var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
  var transitionConfig: js.UndefOr[
    js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      TransitionConfig with HeaderTransitionConfig
    ]
  ] = js.undefined
  var transitionProps: TransitionProps
  var transparentCard: js.UndefOr[Boolean] = js.undefined
}

object PickPropsmodeheaderModehe {
  @scala.inline
  def apply(transitionProps: TransitionProps): PickPropsmodeheaderModehe = {
    val __obj = js.Dynamic.literal(transitionProps = transitionProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickPropsmodeheaderModehe]
  }
  @scala.inline
  implicit class PickPropsmodeheaderModeheOps[Self <: PickPropsmodeheaderModehe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTransitionProps(value: TransitionProps): Self = this.set("transitionProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardOverlayEnabled(value: Boolean): Self = this.set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardOverlayEnabled: Self = this.set("cardOverlayEnabled", js.undefined)
    @scala.inline
    def setCardShadowEnabled(value: Boolean): Self = this.set("cardShadowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardShadowEnabled: Self = this.set("cardShadowEnabled", js.undefined)
    @scala.inline
    def setCardStyle(value: StyleProp[ViewStyle]): Self = this.set("cardStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardStyle: Self = this.set("cardStyle", js.undefined)
    @scala.inline
    def setCardStyleNull: Self = this.set("cardStyle", null)
    @scala.inline
    def setDisableKeyboardHandling(value: Boolean): Self = this.set("disableKeyboardHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableKeyboardHandling: Self = this.set("disableKeyboardHandling", js.undefined)
    @scala.inline
    def setHeaderBackTitleVisible(value: Boolean): Self = this.set("headerBackTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackTitleVisible: Self = this.set("headerBackTitleVisible", js.undefined)
    @scala.inline
    def setHeaderBackgroundTransitionPreset(value: HeaderBackgroundTransitionPreset): Self = this.set("headerBackgroundTransitionPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderBackgroundTransitionPreset: Self = this.set("headerBackgroundTransitionPreset", js.undefined)
    @scala.inline
    def setHeaderLayoutPreset(value: HeaderLayoutPreset): Self = this.set("headerLayoutPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderLayoutPreset: Self = this.set("headerLayoutPreset", js.undefined)
    @scala.inline
    def setHeaderMode(value: HeaderMode): Self = this.set("headerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderMode: Self = this.set("headerMode", js.undefined)
    @scala.inline
    def setHeaderTransitionPreset(value: HeaderTransitionPreset): Self = this.set("headerTransitionPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderTransitionPreset: Self = this.set("headerTransitionPreset", js.undefined)
    @scala.inline
    def setLastTransitionProps(value: TransitionProps): Self = this.set("lastTransitionProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastTransitionProps: Self = this.set("lastTransitionProps", js.undefined)
    @scala.inline
    def setMode(value: card | modal): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnGestureBegin(value: () => Unit): Self = this.set("onGestureBegin", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnGestureBegin: Self = this.set("onGestureBegin", js.undefined)
    @scala.inline
    def setOnGestureCanceled(value: () => Unit): Self = this.set("onGestureCanceled", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnGestureCanceled: Self = this.set("onGestureCanceled", js.undefined)
    @scala.inline
    def setOnGestureEnd(value: () => Unit): Self = this.set("onGestureEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnGestureEnd: Self = this.set("onGestureEnd", js.undefined)
    @scala.inline
    def setOnTransitionEnd(value: () => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    @scala.inline
    def setOnTransitionStart(value: () => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
    @scala.inline
    def setScreenProps(value: js.Any): Self = this.set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenProps: Self = this.set("screenProps", js.undefined)
    @scala.inline
    def setTransitionConfig(
      value: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => TransitionConfig with HeaderTransitionConfig
    ): Self = this.set("transitionConfig", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTransitionConfig: Self = this.set("transitionConfig", js.undefined)
    @scala.inline
    def setTransparentCard(value: Boolean): Self = this.set("transparentCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparentCard: Self = this.set("transparentCard", js.undefined)
  }
  
}

