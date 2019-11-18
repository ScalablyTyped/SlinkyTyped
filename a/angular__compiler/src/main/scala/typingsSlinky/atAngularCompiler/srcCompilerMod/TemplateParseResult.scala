package typingsSlinky.atAngularCompiler.srcCompilerMod

import typingsSlinky.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompilePipeSummary
import typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TemplateParseResult")
@js.native
class TemplateParseResult ()
  extends typingsSlinky.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreParserMod.TemplateParseResult {
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

