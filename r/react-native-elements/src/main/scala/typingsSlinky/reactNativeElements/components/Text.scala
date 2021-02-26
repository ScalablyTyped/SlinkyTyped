package typingsSlinky.reactNativeElements.components

import typingsSlinky.reactNativeElements.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  @JSImport("react-native-elements", "Text")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Text.type): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps): SharedBuilder_TextProps_219755688 = new SharedBuilder_TextProps_219755688(js.Array(this.component, p.asInstanceOf[js.Any]))
}
