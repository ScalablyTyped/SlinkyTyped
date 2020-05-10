package typingsSlinky.reactNativeCollapsible.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCollapsible.mod.CollapsibleProps
import typingsSlinky.reactNativeCollapsible.mod.EasingMode
import typingsSlinky.reactNativeCollapsible.mod.default
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsSlinky.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCollapsible {
  @JSImport("react-native-collapsible", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsed(value: Boolean): this.type = set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def collapsedHeight(value: Double): this.type = set("collapsedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def easing(value: EasingMode | js.Any): this.type = set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def enablePointerEvents(value: Boolean): this.type = set("enablePointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def onAnimationEnd(value: () => Unit): this.type = set("onAnimationEnd", js.Any.fromFunction0(value))
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: CollapsibleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeCollapsible.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

