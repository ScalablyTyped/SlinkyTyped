package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.mlParserAstMod.Node
import typingsSlinky.angularCompiler.mlParserParserMod.Parser
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseError
import typingsSlinky.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/ml_parser/xml_parser", JSImport.Namespace)
@js.native
object xmlParserMod extends js.Object {
  
  @js.native
  class ParseTreeResult protected ()
    extends typingsSlinky.angularCompiler.mlParserParserMod.ParseTreeResult {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  }
  
  @js.native
  class TreeError protected ()
    extends typingsSlinky.angularCompiler.mlParserParserMod.TreeError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  }
  /* static members */
  @js.native
  object TreeError extends js.Object {
    
    def create(elementName: String, span: ParseSourceSpan, msg: String): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
    def create(elementName: Null, span: ParseSourceSpan, msg: String): typingsSlinky.angularCompiler.mlParserParserMod.TreeError = js.native
  }
  
  @js.native
  class XmlParser () extends Parser
}
