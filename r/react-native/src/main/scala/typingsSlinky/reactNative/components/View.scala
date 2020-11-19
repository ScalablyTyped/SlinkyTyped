package typingsSlinky.reactNative.components

import typingsSlinky.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object View {
  
  @JSImport("react-native", "View")
  @js.native
  object component extends js.Object
  
  def withProps(p: ViewProps): SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.View] = new SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.View](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: View.type): SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.View] = new SharedBuilder_ViewProps_655098327[typingsSlinky.reactNative.mod.View](js.Array(this.component, js.Dictionary.empty))()
}
