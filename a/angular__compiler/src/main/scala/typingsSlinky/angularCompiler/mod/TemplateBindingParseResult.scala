package typingsSlinky.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[typingsSlinky.angularCompiler.astMod.TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError]
  ) = this()
}

