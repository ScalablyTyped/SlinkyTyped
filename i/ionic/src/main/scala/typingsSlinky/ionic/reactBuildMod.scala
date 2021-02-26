package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ReactBuildOptions
import typingsSlinky.ionic.libBuildMod.BuildCLI
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import typingsSlinky.ionic.reactMod.ReactProject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactBuildMod {
  
  @JSImport("ionic/lib/project/react/build", "ReactBuildCLI")
  @js.native
  class ReactBuildCLI protected () extends BuildCLI[ReactBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    val prefix: /* "react-scripts" */ String = js.native
    
    @JSName("script")
    val script_ReactBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/react/build", "ReactBuildRunner")
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
