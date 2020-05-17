package typingsSlinky.angularCompiler.publicApiMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompilePipeSummary
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateParseResult")
@js.native
class TemplateParseResult ()
  extends typingsSlinky.angularCompiler.srcCompilerMod.TemplateParseResult {
  def this(templateAst: js.Array[TemplateAst]) = this()
  def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typingsSlinky.angularCompiler.srcParseUtilMod.ParseError]
  ) = this()
}

