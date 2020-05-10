package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ReactBuildOptions
import typingsSlinky.ionic.libBuildMod.BuildCLI
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import typingsSlinky.ionic.reactMod.ReactProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/build", JSImport.Namespace)
@js.native
object reactBuildMod extends js.Object {
  @js.native
  class ReactBuildCLI () extends BuildCLI[ReactBuildOptions] {
    val prefix: /* "react-scripts" */ String = js.native
    @JSName("script")
    val script_ReactBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @js.native
  class ReactBuildRunner protected () extends BuildRunner[ReactBuildOptions] {
    def this(e: ReactBuildRunnerDeps) = this()
    @JSName("e")
    val e_ReactBuildRunner: ReactBuildRunnerDeps = js.native
  }
  
  @js.native
  trait ReactBuildRunnerDeps extends BuildRunnerDeps {
    @JSName("project")
    val project_ReactBuildRunnerDeps: ReactProject = js.native
  }
  
}

