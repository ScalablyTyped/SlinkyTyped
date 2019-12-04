package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.Parser
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/xml_parser", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserXmlUnderscoreParserMod extends js.Object {
  @js.native
  class ParseTreeResult protected ()
    extends typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult {
    def this(rootNodes: js.Array[Node], errors: js.Array[ParseError]) = this()
  }
  
  @js.native
  class TreeError protected ()
    extends typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError {
    def this(elementName: String, span: ParseSourceSpan, msg: String) = this()
    def this(elementName: Null, span: ParseSourceSpan, msg: String) = this()
  }
  
  @js.native
  class XmlParser () extends Parser
  
  /* static members */
  @js.native
  object TreeError extends js.Object {
    def create(elementName: String, span: ParseSourceSpan, msg: String): typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
    def create(elementName: Null, span: ParseSourceSpan, msg: String): typingsSlinky.atAngularCompiler.srcMlUnderscoreParserParserMod.TreeError = js.native
  }
  
}

