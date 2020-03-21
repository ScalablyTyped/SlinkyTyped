package typingsSlinky.rollupPluginTypescript2

import typingsSlinky.rollup.mod.PluginContext
import typingsSlinky.rollupPluginTypescript2.contextMod.IContext
import typingsSlinky.rollupPluginTypescript2.contextMod.VerbosityLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/rollupcontext", JSImport.Namespace)
@js.native
object rollupcontextMod extends js.Object {
  @js.native
  class RollupContext protected () extends IContext {
    def this(verbosity: VerbosityLevel, bail: Boolean, context: PluginContext) = this()
    def this(verbosity: VerbosityLevel, bail: Boolean, context: PluginContext, prefix: String) = this()
    var bail: js.Any = js.native
    var context: js.Any = js.native
    var hasContext: js.Any = js.native
    var prefix: js.Any = js.native
    var verbosity: js.Any = js.native
  }
  
}

