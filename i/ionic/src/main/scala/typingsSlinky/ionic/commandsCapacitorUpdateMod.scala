package typingsSlinky.ionic

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionic.commandsCapacitorBaseMod.CapacitorCommand
import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/capacitor/update", JSImport.Namespace)
@js.native
object commandsCapacitorUpdateMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.ICommand because Already inherited
  - typings.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @js.native
  class UpdateCommand () extends CapacitorCommand {
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
}

