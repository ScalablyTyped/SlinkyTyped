package typingsSlinky.remarkParse

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.mdastUtilFromMarkdown.mod.Options
import typingsSlinky.unified.mod.Plugin
import typingsSlinky.unified.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-parse", JSImport.Namespace)
  @js.native
  val ^ : Parse = js.native
  
  type Parse = Plugin[js.Array[js.UndefOr[RemarkParseOptions]], Settings]
  
  type RemarkParseOptions = Options
  
  type _To = Parse
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parse = ^
}
