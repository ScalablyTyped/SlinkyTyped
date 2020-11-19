package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseLocation
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssAst")
@js.native
abstract class CssAst protected () extends js.Object {
  def this(location: ParseSourceSpan) = this()
  
  def end: ParseLocation = js.native
  
  var location: ParseSourceSpan = js.native
  
  def start: ParseLocation = js.native
  
  def visit(visitor: CssAstVisitor): js.Any = js.native
  def visit(visitor: CssAstVisitor, context: js.Any): js.Any = js.native
}
