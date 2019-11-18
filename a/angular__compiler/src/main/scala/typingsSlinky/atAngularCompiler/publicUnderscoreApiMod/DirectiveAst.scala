package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "DirectiveAst")
@js.native
class DirectiveAst protected ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.DirectiveAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[
        typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundDirectivePropertyAst
      ],
    hostProperties: js.Array[
        typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst
      ],
    hostEvents: js.Array[
        typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst
      ],
    contentQueryStartId: Double,
    sourceSpan: typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

