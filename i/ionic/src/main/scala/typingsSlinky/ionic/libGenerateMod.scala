package typingsSlinky.ionic

import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typingsSlinky.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptModule
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionCheckbox
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionConfirm
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptQuestionOther
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueCheckbox
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueConfirm
import typingsSlinky.atIonicCliDashFrameworkDashPrompts.atIonicCliDashFrameworkDashPromptsMod.PromptValueOther
import typingsSlinky.ionic.definitionsMod.CommandMetadata
import typingsSlinky.ionic.definitionsMod.GenerateOptions
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.definitionsMod.IonicContext
import typingsSlinky.ionic.definitionsMod.Runner
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/generate", JSImport.Namespace)
@js.native
object libGenerateMod extends js.Object {
  @js.native
  abstract class GenerateRunner[T /* <: GenerateOptions */] () extends Runner[T, Unit] {
    val e: GenerateRunnerDeps = js.native
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): GenerateOptions = js.native
    def ensureCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def getCommandMetadata(): js.Promise[Partial[CommandMetadata]] = js.native
    /* CompleteClass */
    override def run(options: T): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait GenerateRunnerDeps extends js.Object {
    val config: IConfig = js.native
    val ctx: IonicContext = js.native
    val log: ILogger = js.native
    val project: IProject = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    val shell: IShell = js.native
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
  }
  
}

