package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ReactServeOptions
import typingsSlinky.ionic.libServeMod.ServeCLI
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/react/serve", JSImport.Namespace)
@js.native
object reactServeMod extends js.Object {
  @js.native
  class ReactServeCLI () extends ServeCLI[ReactServeOptions] {
    var chunks: Double = js.native
    @JSName("script")
    val script_ReactServeCLI: /* "ionic:serve" */ String = js.native
  }
  
  @js.native
  class ReactServeRunner protected () extends ServeRunner[ReactServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

