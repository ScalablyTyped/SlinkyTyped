package typingsSlinky.atAngularCompiler.publicUnderscoreApiMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "TemplateParseResult")
@js.native
class TemplateParseResult ()
  extends typingsSlinky.atAngularCompiler.srcCompilerMod.TemplateParseResult {
  def this(templateAst: js.Array[TemplateAst]) = this()
  def this(templateAst: js.UndefOr[scala.Nothing], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(templateAst: js.Array[TemplateAst], usedPipes: js.Array[CompilePipeSummary]) = this()
  def this(
    templateAst: js.UndefOr[scala.Nothing],
    usedPipes: js.UndefOr[scala.Nothing],
    errors: js.Array[typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.UndefOr[scala.Nothing],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.UndefOr[scala.Nothing],
    errors: js.Array[typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
  def this(
    templateAst: js.Array[TemplateAst],
    usedPipes: js.Array[CompilePipeSummary],
    errors: js.Array[typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError]
  ) = this()
}

