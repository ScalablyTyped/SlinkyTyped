package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ParsedProperty")
@js.native
class ParsedProperty protected ()
  extends typingsSlinky.angularCompiler.compilerMod.ParsedProperty {
  def this(
    name: String,
    expression: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    `type`: typingsSlinky.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    expression: typingsSlinky.angularCompiler.astMod.ASTWithSource,
    `type`: typingsSlinky.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
