package typingsSlinky.reactNativeSafeAreaView.components

import typingsSlinky.reactNativeSafeAreaView.mod.SafeAreaViewProps
import typingsSlinky.reactNativeSafeAreaView.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSafeAreaView {
  
  @JSImport("react-native-safe-area-view", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeSafeAreaView.type): SharedBuilder_SafeAreaViewProps_729231753[default] = new SharedBuilder_SafeAreaViewProps_729231753[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SafeAreaViewProps): SharedBuilder_SafeAreaViewProps_729231753[default] = new SharedBuilder_SafeAreaViewProps_729231753[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
