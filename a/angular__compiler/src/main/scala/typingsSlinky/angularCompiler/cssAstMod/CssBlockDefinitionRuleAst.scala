package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssBlockDefinitionRuleAst")
@js.native
class CssBlockDefinitionRuleAst protected () extends CssBlockRuleAst {
  def this(
    location: ParseSourceSpan,
    strValue: String,
    `type`: BlockType,
    query: CssAtRulePredicateAst,
    block: CssBlockAst
  ) = this()
  
  var query: CssAtRulePredicateAst = js.native
  
  var strValue: String = js.native
}
