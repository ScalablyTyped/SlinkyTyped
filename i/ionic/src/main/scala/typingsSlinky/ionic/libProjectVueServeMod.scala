package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.VueServeOptions
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/vue/serve", JSImport.Namespace)
@js.native
object libProjectVueServeMod extends js.Object {
  @js.native
  class VueServeRunner protected () extends ServeRunner[VueServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

