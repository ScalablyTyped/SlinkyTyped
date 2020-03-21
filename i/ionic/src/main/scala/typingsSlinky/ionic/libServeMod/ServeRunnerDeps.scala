package typingsSlinky.ionic.libServeMod

import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IProject
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.definitionsMod.IonicEnvironmentFlags
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptModule
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptValueOther
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServeRunnerDeps extends js.Object {
  val config: IConfig = js.native
  val flags: IonicEnvironmentFlags = js.native
  val log: ILogger = js.native
  val project: IProject = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  val shell: IShell = js.native
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
}

