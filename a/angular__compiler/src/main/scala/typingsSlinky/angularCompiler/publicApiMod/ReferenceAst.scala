package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
