package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CommandInstanceInfo
import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.CommandMetadataOption
import typingsSlinky.ionic.definitionsMod.ICommand
import typingsSlinky.ionic.definitionsMod.INamespace
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsSlinky.ionicCliFramework.mod.BaseCommand
import typingsSlinky.ionicCliFramework.mod.TaskChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/command", JSImport.Namespace)
@js.native
object commandMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsSlinky.ionicCliFramework.definitionsMod.ICommand because var conflicts: namespace. Inlined 
  - typingsSlinky.ionic.definitionsMod.ICommand because var conflicts: namespace. Inlined env, project, execute */ @js.native
  abstract class Command protected () extends BaseCommand[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(namespace: INamespace) = this()
    @JSName("env")
    val env_FCommand: IonicEnvironment = js.native
    @JSName("project")
    val project_FCommand: js.UndefOr[IProject] = js.native
    val taskChains: js.Array[TaskChain] = js.native
    def createTaskChain(): TaskChain = js.native
    def env(): IonicEnvironment = js.native
    def execute(inputs: CommandLineInputs, options: CommandLineOptions, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    def getCleanInputsForTelemetry(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[js.Array[String]] = js.native
    def project(): js.UndefOr[IProject] = js.native
  }
  
}

