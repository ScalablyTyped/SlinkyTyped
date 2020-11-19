package typingsSlinky.ionic

import typingsSlinky.ionic.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/ssl/base", JSImport.Namespace)
@js.native
object sslBaseMod extends js.Object {
  
  @js.native
  abstract class SSLBaseCommand () extends Command {
    
    def checkForOpenSSL(): js.Promise[Unit] = js.native
  }
}
