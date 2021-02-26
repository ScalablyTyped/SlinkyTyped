package typingsSlinky.reapop

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.reapop.themesTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrapMod extends Shortcut {
  
  @JSImport("reapop/dist/themes/bootstrap", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  @JSImport("reapop/dist/themes/bootstrap", "bootstrapTheme")
  @js.native
  val bootstrapTheme: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `bootstrapMod.foo` */
  override def _to: Theme = default
}
