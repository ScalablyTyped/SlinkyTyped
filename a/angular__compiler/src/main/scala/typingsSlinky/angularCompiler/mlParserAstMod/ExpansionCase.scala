package typingsSlinky.angularCompiler.mlParserAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/ast", "ExpansionCase")
@js.native
class ExpansionCase protected () extends Node {
  def this(
    value: String,
    expression: js.Array[Node],
    sourceSpan: ParseSourceSpan,
    valueSourceSpan: ParseSourceSpan,
    expSourceSpan: ParseSourceSpan
  ) = this()
  
  var expSourceSpan: ParseSourceSpan = js.native
  
  var expression: js.Array[Node] = js.native
  
  var value: String = js.native
  
  var valueSourceSpan: ParseSourceSpan = js.native
}
