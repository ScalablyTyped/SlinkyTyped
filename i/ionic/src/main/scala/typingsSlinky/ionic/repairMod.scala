package typingsSlinky.ionic

import typingsSlinky.ionic.anon.RequiredProjectIntegratio
import typingsSlinky.ionic.commandMod.Command
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/repair", JSImport.Namespace)
@js.native
object repairMod extends js.Object {
  
  @js.native
  class RepairCommand () extends Command {
    
    def cordovaRepair(cordova: RequiredProjectIntegratio, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
    
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
}
