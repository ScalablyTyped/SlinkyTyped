package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.IonicAngularServeOptions
import typingsSlinky.ionic.ionicAngularMod.IonicAngularProject
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicAngularServeMod {
  
  @JSImport("ionic/lib/project/ionic-angular/serve", "DEFAULT_SERVE_SCRIPT_VALUE")
  @js.native
  val DEFAULT_SERVE_SCRIPT_VALUE: String = js.native
  
  @JSImport("ionic/lib/project/ionic-angular/serve", "IonicAngularServeRunner")
  @js.native
  class IonicAngularServeRunner protected () extends ServeRunner[IonicAngularServeOptions] {
    def this(e: IonicAngularServeRunnerDeps) = this()
    
    @JSName("e")
    val e_IonicAngularServeRunner: IonicAngularServeRunnerDeps = js.native
  }
  
  @js.native
  trait IonicAngularServeRunnerDeps extends ServeRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularServeRunnerDeps: IonicAngularProject = js.native
  }
}
