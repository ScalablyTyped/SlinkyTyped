package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsSlinky.atAngularCompiler.srcStyleUnderscoreCompilerMod.CompiledStylesheet {
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

