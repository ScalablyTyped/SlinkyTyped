package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IonicAngularBuildOptions
import typingsSlinky.ionic.ionicAngularMod.IonicAngularProject
import typingsSlinky.ionic.libBuildMod.BuildCLI
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/ionic-angular/build", JSImport.Namespace)
@js.native
object ionicAngularBuildMod extends js.Object {
  
  val DEFAULT_BUILD_SCRIPT_VALUE: String = js.native
  
  val DEFAULT_PROGRAM: /* "ionic-app-scripts" */ String = js.native
  
  @js.native
  class IonicAngularBuildCLI () extends BuildCLI[IonicAngularBuildOptions] {
    
    /* protected */ def buildOptionsToAppScriptsArgs(options: IonicAngularBuildOptions): js.Array[String] = js.native
    
    val prefix: /* "app-scripts" */ String = js.native
  }
  
  @js.native
  class IonicAngularBuildRunner protected () extends BuildRunner[IonicAngularBuildOptions] {
    def this(e: IonicAngularBuildRunnerDeps) = this()
    
    @JSName("e")
    val e_IonicAngularBuildRunner: IonicAngularBuildRunnerDeps = js.native
  }
  
  @js.native
  trait IonicAngularBuildRunnerDeps extends BuildRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularBuildRunnerDeps: IonicAngularProject = js.native
  }
}
