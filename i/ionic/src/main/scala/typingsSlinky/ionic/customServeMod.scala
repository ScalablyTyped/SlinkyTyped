package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.CustomServeOptions
import typingsSlinky.ionic.libServeMod.ServeRunner
import typingsSlinky.ionic.libServeMod.ServeRunnerDeps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/project/custom/serve", JSImport.Namespace)
@js.native
object customServeMod extends js.Object {
  @js.native
  class CustomServeRunner protected () extends ServeRunner[CustomServeOptions] {
    def this(e: ServeRunnerDeps) = this()
  }
  
}

