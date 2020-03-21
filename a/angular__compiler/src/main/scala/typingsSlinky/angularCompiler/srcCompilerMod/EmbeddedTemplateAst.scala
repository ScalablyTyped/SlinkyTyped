package typingsSlinky.angularCompiler.srcCompilerMod

import typingsSlinky.angularCompiler.templateAstMod.QueryMatch
import typingsSlinky.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "EmbeddedTemplateAst")
@js.native
class EmbeddedTemplateAst protected ()
  extends typingsSlinky.angularCompiler.templateAstMod.EmbeddedTemplateAst {
  def this(
    attrs: js.Array[typingsSlinky.angularCompiler.templateAstMod.AttrAst],
    outputs: js.Array[typingsSlinky.angularCompiler.templateAstMod.BoundEventAst],
    references: js.Array[typingsSlinky.angularCompiler.templateAstMod.ReferenceAst],
    variables: js.Array[typingsSlinky.angularCompiler.templateAstMod.VariableAst],
    directives: js.Array[typingsSlinky.angularCompiler.templateAstMod.DirectiveAst],
    providers: js.Array[typingsSlinky.angularCompiler.templateAstMod.ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

