package typingsSlinky.ionic

import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sslBaseMod {
  
  @JSImport("ionic/commands/ssl/base", "SSLBaseCommand")
  @js.native
  abstract class SSLBaseCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def checkForOpenSSL(): js.Promise[Unit] = js.native
  }
}
