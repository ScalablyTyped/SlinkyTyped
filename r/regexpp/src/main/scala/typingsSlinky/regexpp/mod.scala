package typingsSlinky.regexpp

import typingsSlinky.regexpp.astMod.Node
import typingsSlinky.regexpp.astMod.RegExpLiteral
import typingsSlinky.regexpp.parserMod.RegExpParser.Options
import typingsSlinky.regexpp.visitorMod.RegExpVisitor.Handlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexpp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def parseRegExpLiteral(source: String): RegExpLiteral = js.native
  def parseRegExpLiteral(source: String, options: Options): RegExpLiteral = js.native
  def parseRegExpLiteral(source: js.RegExp): RegExpLiteral = js.native
  def parseRegExpLiteral(source: js.RegExp, options: Options): RegExpLiteral = js.native
  
  def validateRegExpLiteral(source: String): Unit = js.native
  def validateRegExpLiteral(source: String, options: typingsSlinky.regexpp.validatorMod.RegExpValidator.Options): Unit = js.native
  
  def visitRegExpAST(node: Node, handlers: Handlers): Unit = js.native
  
  @js.native
  class RegExpParser ()
    extends typingsSlinky.regexpp.parserMod.RegExpParser {
    def this(options: Options) = this()
  }
  
  @js.native
  class RegExpValidator ()
    extends typingsSlinky.regexpp.validatorMod.RegExpValidator {
    def this(options: typingsSlinky.regexpp.validatorMod.RegExpValidator.Options) = this()
  }
}
