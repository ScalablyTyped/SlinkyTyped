package typingsSlinky.remarkMdx

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.unified.mod.Plugin
import typingsSlinky.unified.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-mdx", JSImport.Namespace)
  @js.native
  val ^ : Plugin[js.Array[js.Any], Settings] = js.native
  
  type _To = Plugin[js.Array[js.Any], Settings]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[js.Any], Settings] = ^
}
