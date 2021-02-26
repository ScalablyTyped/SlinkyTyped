package typingsSlinky.ionic

import typingsSlinky.ionic.anon.PartialCommandMetadata
import typingsSlinky.ionic.definitionsMod.GenerateOptions
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.definitionsMod.IonicContext
import typingsSlinky.ionic.definitionsMod.Runner
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsSlinky.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptModule
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueOther
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGenerateMod {
  
  @JSImport("ionic/lib/generate", "GenerateRunner")
  @js.native
  abstract class GenerateRunner[T /* <: GenerateOptions */] () extends Runner[T, Unit] {
    
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): GenerateOptions = js.native
    
    val e: GenerateRunnerDeps = js.native
    
    def ensureCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
  }
  
  @js.native
  trait GenerateRunnerDeps extends StObject {
    
    val config: IConfig = js.native
    
    val ctx: IonicContext = js.native
    
    val log: ILogger = js.native
    
    val project: IProject = js.native
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    
    val shell: IShell = js.native
  }
}
