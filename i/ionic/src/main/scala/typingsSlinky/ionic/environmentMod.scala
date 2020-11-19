package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IClient
import typingsSlinky.ionic.definitionsMod.IConfig
import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.ISession
import typingsSlinky.ionic.definitionsMod.IShell
import typingsSlinky.ionic.definitionsMod.InfoItem
import typingsSlinky.ionic.definitionsMod.IonicContext
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/environment", JSImport.Namespace)
@js.native
object environmentMod extends js.Object {
  
  @js.native
  class Environment protected () extends IonicEnvironment {
    def this(hasClientConfigFlagsGetInfoLogCtxPromptSessionShell: EnvironmentDeps) = this()
  }
  
  @js.native
  trait EnvironmentDeps extends js.Object {
    
    val client: IClient = js.native
    
    val config: IConfig = js.native
    
    val ctx: IonicContext = js.native
    
    val flags: IonicEnvironmentFlags = js.native
    
    def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
    
    val log: ILogger = js.native
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    
    val session: ISession = js.native
    
    val shell: IShell = js.native
  }
}
