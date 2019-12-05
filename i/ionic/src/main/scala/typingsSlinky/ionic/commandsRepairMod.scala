package typingsSlinky.ionic

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import typingsSlinky.ionic.libCommandMod.Command
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/repair", JSImport.Namespace)
@js.native
object commandsRepairMod extends js.Object {
  @js.native
  class RepairCommand () extends Command {
    def cordovaRepair(cordova: Required[ProjectIntegration], runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
    def run(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

