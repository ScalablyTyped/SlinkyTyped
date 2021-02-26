package typingsSlinky.freedom

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.freedom.freedom.FreedomInCoreEnv
import typingsSlinky.freedom.freedom.FreedomInModuleEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object freedom extends Shortcut {
    
    @JSGlobal("freedom")
    @js.native
    val ^ : FreedomInCoreEnv with FreedomInModuleEnv = js.native
    
    type _To = FreedomInCoreEnv with FreedomInModuleEnv
    
    /* This means you don't have to write `^`, but can instead just say `freedom.foo` */
    override def _to: FreedomInCoreEnv with FreedomInModuleEnv = ^
  }
}
