package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ReactServeOptions
import typingsSlinky.ionic.libServeMod.ServeCLI
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactServeMod {
  
  @JSImport("ionic/lib/project/react/serve", "ReactServeCLI")
  @js.native
  class ReactServeCLI protected () extends ServeCLI[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
    
    var chunks: Double = js.native
    
    @JSName("script")
    val script_ReactServeCLI: /* "ionic:serve" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/react/serve", "ReactServeRunner")
  @js.native
  class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
}
