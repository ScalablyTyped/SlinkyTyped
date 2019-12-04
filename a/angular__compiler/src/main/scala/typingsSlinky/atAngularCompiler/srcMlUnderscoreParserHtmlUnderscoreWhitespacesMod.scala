package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.atAngularCompilerStrings.ngPreserveWhitespaces
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Attribute
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Comment
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Element
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Text
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Visitor
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserHtmlUnderscoreWhitespacesMod extends js.Object {
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

