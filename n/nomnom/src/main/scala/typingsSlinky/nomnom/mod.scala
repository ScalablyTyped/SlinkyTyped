package typingsSlinky.nomnom

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.nomnom.NomnomInternal.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("nomnom", JSImport.Namespace)
  @js.native
  val ^ : Parser = js.native
  
  type _To = Parser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parser = ^
}
