package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.Ionic1BuildOptions
import typingsSlinky.ionic.ionic1Mod.Ionic1Project
import typingsSlinky.ionic.libBuildMod.BuildRunner
import typingsSlinky.ionic.libBuildMod.BuildRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/ionic1/build", JSImport.Namespace)
@js.native
object ionic1BuildMod extends js.Object {
  
  @js.native
  class Ionic1BuildRunner protected () extends BuildRunner[Ionic1BuildOptions] {
    def this(e: Ionic1BuildRunnerDeps) = this()
    
    @JSName("e")
    val e_Ionic1BuildRunner: Ionic1BuildRunnerDeps = js.native
  }
  
  @js.native
  trait Ionic1BuildRunnerDeps extends BuildRunnerDeps {
    
    @JSName("project")
    val project_Ionic1BuildRunnerDeps: Ionic1Project = js.native
  }
}
