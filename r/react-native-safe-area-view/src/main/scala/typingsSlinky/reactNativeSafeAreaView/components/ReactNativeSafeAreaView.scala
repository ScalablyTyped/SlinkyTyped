package typingsSlinky.reactNativeSafeAreaView.components

import typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaViewProps
import typingsSlinky.reactNativeSafeAreaView.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSafeAreaView {
  @JSImport("react-native-safe-area-view", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SafeAreaViewProps): SharedBuilder_SafeAreaViewProps_729231753[default] = new SharedBuilder_SafeAreaViewProps_729231753[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeSafeAreaView.type): SharedBuilder_SafeAreaViewProps_729231753[default] = new SharedBuilder_SafeAreaViewProps_729231753[default](js.Array(this.component, js.Dictionary.empty))()
}

