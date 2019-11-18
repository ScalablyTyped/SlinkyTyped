package typingsSlinky.atAngularCompiler.atAngularCompilerMod

import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsSlinky.atAngularCompiler.publicUnderscoreApiMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[
        typingsSlinky.atAngularCompiler.srcStyleUnderscoreCompilerMod.StylesCompileDependency
      ],
    isShimmed: Boolean,
    meta: typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileStylesheetMetadata
  ) = this()
}

