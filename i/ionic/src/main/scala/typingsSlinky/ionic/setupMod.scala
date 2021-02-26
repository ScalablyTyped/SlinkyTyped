package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.sshBaseMod.SSHBaseCommand
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupMod {
  
  @JSImport("ionic/commands/ssh/setup", "SSHSetupCommand")
  @js.native
  class SSHSetupCommand protected () extends SSHBaseCommand {
    def this(namespace: INamespace) = this()
    
    def preRun(): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
