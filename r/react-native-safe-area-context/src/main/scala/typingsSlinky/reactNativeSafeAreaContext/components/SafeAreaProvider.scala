package typingsSlinky.reactNativeSafeAreaContext.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSafeAreaContext.safeAreaContextMod.SafeAreaViewProps
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.EdgeInsets
import typingsSlinky.reactNativeSafeAreaContext.safeAreaTypesMod.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SafeAreaProvider {
  @JSImport("react-native-safe-area-context", "SafeAreaProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def initialMetrics(value: Metrics): this.type = set("initialMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def initialMetricsNull: this.type = set("initialMetrics", null)
    @scala.inline
    def initialSafeAreaInsets(value: EdgeInsets): this.type = set("initialSafeAreaInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def initialSafeAreaInsetsNull: this.type = set("initialSafeAreaInsets", null)
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
  }
  
  def withProps(p: SafeAreaViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SafeAreaProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

