package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.angularCompilerStrings.ngPreserveWhitespaces
import typingsSlinky.angularCompiler.mlParserAstMod.Attribute
import typingsSlinky.angularCompiler.mlParserAstMod.Comment
import typingsSlinky.angularCompiler.mlParserAstMod.Element
import typingsSlinky.angularCompiler.mlParserAstMod.Expansion
import typingsSlinky.angularCompiler.mlParserAstMod.ExpansionCase
import typingsSlinky.angularCompiler.mlParserAstMod.Text
import typingsSlinky.angularCompiler.mlParserAstMod.Visitor
import typingsSlinky.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
@js.native
object htmlWhitespacesMod extends js.Object {
  @js.native
  class WhitespaceVisitor () extends Visitor {
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitElement(element: Element, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitText(text: Text, context: js.Any): js.Any = js.native
  }
  
  val PRESERVE_WS_ATTR_NAME: ngPreserveWhitespaces = js.native
  def removeWhitespaces(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
  def replaceNgsp(value: String): String = js.native
}

