package typingsSlinky.angularCompiler.mlParserAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/ast", "Comment")
@js.native
class Comment protected () extends Node {
  def this(value: String, sourceSpan: ParseSourceSpan) = this()
  def this(value: Null, sourceSpan: ParseSourceSpan) = this()
  
  var value: String | Null = js.native
}
