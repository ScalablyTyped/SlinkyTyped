package typingsSlinky.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsSlinky.angularCompiler.parserMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typingsSlinky.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError]
  ) = this()
}

