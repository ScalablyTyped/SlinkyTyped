package typingsSlinky.ionic

import typingsSlinky.ionic.configBaseMod.BaseConfigCommand
import typingsSlinky.ionic.configBaseMod.ConfigContext
import typingsSlinky.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMod {
  
  @JSImport("ionic/commands/config/get", "ConfigGetCommand")
  @js.native
  class ConfigGetCommand protected () extends BaseConfigCommand {
    def this(namespace: INamespace) = this()
    
    def printConfig(ctx: ConfigContext, v: js.Any): Unit = js.native
    
    def sanitizeEntry(key: String, value: js.Any): js.Any = js.native
  }
}
