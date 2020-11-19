package typingsSlinky.ionic

import typingsSlinky.ionic.angularMod.AngularProject
import typingsSlinky.ionic.definitionsMod.AngularGenerateOptions
import typingsSlinky.ionic.libGenerateMod.GenerateRunner
import typingsSlinky.ionic.libGenerateMod.GenerateRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/project/angular/generate", JSImport.Namespace)
@js.native
object angularGenerateMod extends js.Object {
  
  @js.native
  class AngularGenerateRunner protected () extends GenerateRunner[AngularGenerateOptions] {
    def this(e: AngularGenerateRunnerDeps) = this()
    
    @JSName("e")
    val e_AngularGenerateRunner: AngularGenerateRunnerDeps = js.native
    
    var generateComponent: js.Any = js.native
    
    var validateFeatureType: js.Any = js.native
  }
  
  @js.native
  trait AngularGenerateRunnerDeps extends GenerateRunnerDeps {
    
    @JSName("project")
    val project_AngularGenerateRunnerDeps: AngularProject = js.native
  }
}
