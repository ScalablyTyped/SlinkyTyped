package typingsSlinky.ionic

import typingsSlinky.ionic.angularMod.AngularProject
import typingsSlinky.ionic.definitionsMod.AngularBuildOptions
import typingsSlinky.ionic.libBuildMod.BuildCLI
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/angular/build", JSImport.Namespace)
@js.native
object angularBuildMod extends js.Object {
  
  @js.native
  class AngularBuildCLI () extends BuildCLI[AngularBuildOptions] {
    
    /* protected */ def buildArchitectCommand(options: AngularBuildOptions): js.Array[String] = js.native
    
    /* protected */ def buildOptionsToNgArgs(options: AngularBuildOptions): js.Promise[js.Array[String]] = js.native
    
    val prefix: /* "ng" */ String = js.native
    
    @JSName("script")
    val script_AngularBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @js.native
  class AngularBuildRunner protected () extends BuildRunner[AngularBuildOptions] {
    def this(e: AngularBuildRunnerDeps) = this()
    
    @JSName("e")
    val e_AngularBuildRunner: AngularBuildRunnerDeps = js.native
  }
  
  @js.native
  trait AngularBuildRunnerDeps extends BuildRunnerDeps {
    
    @JSName("project")
    val project_AngularBuildRunnerDeps: AngularProject = js.native
  }
}
