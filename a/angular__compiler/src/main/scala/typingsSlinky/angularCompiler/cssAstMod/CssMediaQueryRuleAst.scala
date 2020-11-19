package typingsSlinky.angularCompiler.cssAstMod

import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/css_parser/css_ast", "CssMediaQueryRuleAst")
@js.native
class CssMediaQueryRuleAst protected () extends CssBlockDefinitionRuleAst {
  def this(location: ParseSourceSpan, strValue: String, query: CssAtRulePredicateAst, block: CssBlockAst) = this()
}
