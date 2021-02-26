package typingsSlinky.angularCompiler.compilerMod

import typingsSlinky.angularCompiler.astMod.TemplateBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsSlinky.angularCompiler.publicApiMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[TemplateBinding],
    warnings: js.Array[String],
    errors: js.Array[typingsSlinky.angularCompiler.astMod.ParserError]
  ) = this()
}
