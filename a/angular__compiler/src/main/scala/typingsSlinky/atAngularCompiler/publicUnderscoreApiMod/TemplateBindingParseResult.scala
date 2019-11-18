package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateBindingParseResult")
@js.native
class TemplateBindingParseResult protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.TemplateBindingParseResult {
  def this(
    templateBindings: js.Array[
        typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.TemplateBinding
      ],
    warnings: js.Array[String],
    errors: js.Array[typingsSlinky.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError]
  ) = this()
}

