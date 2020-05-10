package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SafeAreaView {
  @JSImport("react-native", "SafeAreaView")
  @js.native
  object component extends js.Object
  
  def withProps(p: ViewProps): SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.SafeAreaView] = new SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.SafeAreaView](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SafeAreaView.type): SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.SafeAreaView] = new SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.SafeAreaView](js.Array(this.component, js.Dictionary.empty))()
}

