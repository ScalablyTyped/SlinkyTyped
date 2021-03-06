package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "CompiledStylesheet")
@js.native
class CompiledStylesheet protected ()
  extends typingsSlinky.angularCompiler.compilerMod.CompiledStylesheet {
  def this(
    outputCtx: OutputContext,
    stylesVar: String,
    dependencies: js.Array[typingsSlinky.angularCompiler.styleCompilerMod.StylesCompileDependency],
    isShimmed: Boolean,
    meta: typingsSlinky.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
  ) = this()
}
