package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.mlParserAstMod.Visitor
import typingsSlinky.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
@js.native
object htmlWhitespacesMod extends js.Object {
  @js.native
  class WhitespaceVisitor () extends Visitor
  
  val PRESERVE_WS_ATTR_NAME: /* "ngPreserveWhitespaces" */ String = js.native
  def removeWhitespaces(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
  def replaceNgsp(value: String): String = js.native
}

