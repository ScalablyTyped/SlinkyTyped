package typingsSlinky.reactNavigationNative

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Context
import typingsSlinky.reactNavigationNative.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeContextMod extends Shortcut {
  
  @JSImport("@react-navigation/native/lib/typescript/src/theming/ThemeContext", JSImport.Default)
  @js.native
  val default: Context[Theme] = js.native
  
  type _To = Context[Theme]
  
  /* This means you don't have to write `default`, but can instead just say `themeContextMod.foo` */
  override def _to: Context[Theme] = default
}
