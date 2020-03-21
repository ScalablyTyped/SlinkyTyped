package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "ReferenceAst")
@js.native
class ReferenceAst protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.ReferenceAst {
  def this(
    name: String,
    value: CompileTokenMetadata,
    originalValue: String,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

