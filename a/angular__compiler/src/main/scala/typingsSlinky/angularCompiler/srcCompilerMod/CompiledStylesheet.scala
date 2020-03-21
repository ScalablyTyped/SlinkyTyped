package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsSlinky.angularCompiler.styleCompilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typingsSlinky.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typingsSlinky.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}

