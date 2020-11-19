package typingsSlinky.angularCompiler.mod

import typingsSlinky.angularCompiler.astMod.TemplateBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsSlinky.angularCompiler.compilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError]
  ) = this()
}
