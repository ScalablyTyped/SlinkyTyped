package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IonicAngularGenerateOptions
import typingsSlinky.ionic.libGenerateMod.GenerateRunner
import typingsSlinky.ionic.libGenerateMod.GenerateRunnerDeps
import typingsSlinky.ionic.libProjectIonicDashAngularGenerateMod.IonicAngularGenerateRunnerDeps
import typingsSlinky.ionic.libProjectIonicDashAngularMod.IonicAngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/ionic-angular/generate", JSImport.Namespace)
@js.native
object libProjectIonicDashAngularGenerateMod extends js.Object {
  @js.native
  class IonicAngularGenerateRunner protected () extends GenerateRunner[IonicAngularGenerateOptions] {
    def this(e: IonicAngularGenerateRunnerDeps) = this()
    @JSName("e")
    val e_IonicAngularGenerateRunner: IonicAngularGenerateRunnerDeps = js.native
    def getModules(context: js.Any, kind: String): js.Promise[_] = js.native
    def tabsPrompt(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait IonicAngularGenerateRunnerDeps extends GenerateRunnerDeps {
    @JSName("project")
    val project_IonicAngularGenerateRunnerDeps: IonicAngularProject = js.native
  }
  
}

