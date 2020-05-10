package typingsSlinky.reactNativeSafeAreaView.components

import typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SafeAreaView {
  @JSImport("react-native-safe-area-view", "SafeAreaView")
  @js.native
  object component extends js.Object
  
  def withProps(p: SafeAreaViewProps): SharedBuilder_SafeAreaViewProps_729231753[typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaView] = new SharedBuilder_SafeAreaViewProps_729231753[typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaView](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SafeAreaView.type): SharedBuilder_SafeAreaViewProps_729231753[typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaView] = new SharedBuilder_SafeAreaViewProps_729231753[typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaView](js.Array(this.component, js.Dictionary.empty))()
}

