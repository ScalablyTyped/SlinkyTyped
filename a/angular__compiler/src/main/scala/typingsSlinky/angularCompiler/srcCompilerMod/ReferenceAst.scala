package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typingsSlinky.angularCompiler.templateAstMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
