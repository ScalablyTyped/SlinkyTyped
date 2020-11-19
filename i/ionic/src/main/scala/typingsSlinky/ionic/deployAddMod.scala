package typingsSlinky.ionic

import typingsSlinky.ionic.coreMod.DeployConfCommand
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/deploy/add", JSImport.Namespace)
@js.native
object deployAddMod extends js.Object {
  
  @js.native
  class AddCommand () extends DeployConfCommand {
    
    /* protected */ def buildCordovaDeployOptions(options: CommandLineOptions): js.Array[String] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
