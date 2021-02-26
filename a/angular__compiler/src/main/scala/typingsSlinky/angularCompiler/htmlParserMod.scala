package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.mlParserAstMod.Node
import typingsSlinky.angularCompiler.mlParserParserMod.Parser
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParserMod {
  
  @JSImport("@angular/compiler/src/ml_parser/html_parser", "HtmlParser")
  @js.native
  class HtmlParser () extends Parser
  
  @JSImport("@angular/compiler/src/ml_parser/html_parser", "ParseTreeResult")
  @js.native
  class ParseTreeResult protected ()
    extends typingsSlinky.angularCompiler.mlParserParserMod.ParseTreeResult {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  }
  
  @JSImport("@angular/compiler/src/ml_parser/html_parser", "TreeError")
  @js.native
  class TreeError protected ()
    extends typingsSlinky.angularCompiler.mlParserParserMod.TreeError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  }
  /* static members */
  object TreeError {
    
    @JSImport("@angular/compiler/src/ml_parser/html_parser", "TreeError.create")
    @js.native
    def create(elementName: String, span: ParseSourceSpan, msg: String): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
    @JSImport("@angular/compiler/src/ml_parser/html_parser", "TreeError.create")
    @js.native
    def create(elementName: Null, span: ParseSourceSpan, msg: String): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
  }
}
