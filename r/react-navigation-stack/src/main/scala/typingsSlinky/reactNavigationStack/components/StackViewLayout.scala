package typingsSlinky.reactNavigationStack.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNavigationStack.PickPropsmodeheaderModehe
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.card
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.modal
import typingsSlinky.reactNavigationStack.stackViewLayoutMod.default
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

object StackViewLayout {
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewLayout", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def cardOverlayEnabled(value: Boolean): this.type = set("cardOverlayEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def cardShadowEnabled(value: Boolean): this.type = set("cardShadowEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def cardStyle(value: StyleProp[ViewStyle]): this.type = set("cardStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def cardStyleNull: this.type = set("cardStyle", null)
    @scala.inline
    def disableKeyboardHandling(value: Boolean): this.type = set("disableKeyboardHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def headerBackTitleVisible(value: Boolean): this.type = set("headerBackTitleVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def headerBackgroundTransitionPreset(value: HeaderBackgroundTransitionPreset): this.type = set("headerBackgroundTransitionPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def headerLayoutPreset(value: HeaderLayoutPreset): this.type = set("headerLayoutPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def headerMode(value: HeaderMode): this.type = set("headerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def headerTransitionPreset(value: HeaderTransitionPreset): this.type = set("headerTransitionPreset", value.asInstanceOf[js.Any])
    @scala.inline
    def lastTransitionProps(value: TransitionProps): this.type = set("lastTransitionProps", value.asInstanceOf[js.Any])
    @scala.inline
    def mode(value: card | modal): this.type = set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def onGestureBegin(value: () => Unit): this.type = set("onGestureBegin", js.Any.fromFunction0(value))
    @scala.inline
    def onGestureCanceled(value: () => Unit): this.type = set("onGestureCanceled", js.Any.fromFunction0(value))
    @scala.inline
    def onGestureEnd(value: () => Unit): this.type = set("onGestureEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onTransitionEnd(value: () => Unit): this.type = set("onTransitionEnd", js.Any.fromFunction0(value))
    @scala.inline
    def onTransitionStart(value: () => Unit): this.type = set("onTransitionStart", js.Any.fromFunction0(value))
    @scala.inline
    def screenProps(value: js.Any): this.type = set("screenProps", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionConfig(
      value: (/* transitionProps */ TransitionProps, /* prevTransitionProps */ js.UndefOr[TransitionProps], /* isModal */ js.UndefOr[Boolean]) => TransitionConfig with HeaderTransitionConfig
    ): this.type = set("transitionConfig", js.Any.fromFunction3(value))
    @scala.inline
    def transparentCard(value: Boolean): this.type = set("transparentCard", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickPropsmodeheaderModehe): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(transitionProps: TransitionProps): Builder = {
    val __props = js.Dynamic.literal(transitionProps = transitionProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickPropsmodeheaderModehe]))
  }
}

