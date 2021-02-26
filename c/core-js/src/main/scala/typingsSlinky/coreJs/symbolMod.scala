package typingsSlinky.coreJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod extends Shortcut {
  
  @JSImport("core-js/es6/symbol", JSImport.Namespace)
  @js.native
  val ^ : SymbolConstructor = js.native
  
  type _To = SymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `symbolMod.foo` */
  override def _to: SymbolConstructor = ^
}
