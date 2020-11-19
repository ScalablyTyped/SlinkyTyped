package typingsSlinky.ionic

import typingsSlinky.ionic.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/ssh/base", JSImport.Namespace)
@js.native
object sshBaseMod extends js.Object {
  
  @js.native
  abstract class SSHBaseCommand () extends Command {
    
    def checkForOpenSSH(): js.Promise[Unit] = js.native
  }
}
