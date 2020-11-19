package typingsSlinky.angularCompiler.r3AstMod

import typingsSlinky.angularCompiler.astMod.AST
import typingsSlinky.angularCompiler.i18nAstMod.Message
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundText")
@js.native
class BoundText protected () extends Node {
  def this(value: AST, sourceSpan: ParseSourceSpan) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: Message) = this()
  def this(value: AST, sourceSpan: ParseSourceSpan, i18n: typingsSlinky.angularCompiler.i18nAstMod.Node) = this()
  
  var i18n: js.UndefOr[Message | typingsSlinky.angularCompiler.i18nAstMod.Node] = js.native
  
  var value: AST = js.native
}
