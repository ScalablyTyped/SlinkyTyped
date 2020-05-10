package typingsSlinky.ionic

import typingsSlinky.ionic.angularMod.AngularProject
import typingsSlinky.ionic.definitionsMod.AngularServeOptions
import typingsSlinky.ionic.libServeMod.ServeCLI
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/angular/serve", JSImport.Namespace)
@js.native
object angularServeMod extends js.Object {
  @js.native
  class AngularServeCLI () extends ServeCLI[AngularServeOptions] {
    var chunks: Double = js.native
    @JSName("script")
    val script_AngularServeCLI: /* "ionic:serve" */ String = js.native
    /* protected */ def buildArchitectCommand(options: AngularServeOptions): js.Array[String] = js.native
    /* protected */ def serveOptionsToNgArgs(options: AngularServeOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  class AngularServeRunner protected () extends ServeRunner[AngularServeOptions] {
    def this(e: AngularServeRunnerDeps) = this()
    @JSName("e")
    val e_AngularServeRunner: AngularServeRunnerDeps = js.native
    def platformToMode(platform: String): String = js.native
  }
  
  @js.native
  trait AngularServeRunnerDeps extends ServeRunnerDeps {
    @JSName("project")
    val project_AngularServeRunnerDeps: AngularProject = js.native
  }
  
}

