package typingsSlinky.ecmarkdown

import typingsSlinky.ecmarkdown.ecmarkdownStrings.EOF
import typingsSlinky.ecmarkdown.ecmarkdownStrings.comment
import typingsSlinky.ecmarkdown.ecmarkdownStrings.linebreak
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.opaqueTag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.parabreak
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.text
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import typingsSlinky.ecmarkdown.ecmarkdownStrings.whitespace
import typingsSlinky.ecmarkdown.nodeTypesMod.CommentToken
import typingsSlinky.ecmarkdown.nodeTypesMod.EOFToken
import typingsSlinky.ecmarkdown.nodeTypesMod.Format
import typingsSlinky.ecmarkdown.nodeTypesMod.FormatToken
import typingsSlinky.ecmarkdown.nodeTypesMod.IdToken
import typingsSlinky.ecmarkdown.nodeTypesMod.LinebreakToken
import typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagToken
import typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListToken
import typingsSlinky.ecmarkdown.nodeTypesMod.ParabreakToken
import typingsSlinky.ecmarkdown.nodeTypesMod.Position
import typingsSlinky.ecmarkdown.nodeTypesMod.TagToken
import typingsSlinky.ecmarkdown.nodeTypesMod.TextToken
import typingsSlinky.ecmarkdown.nodeTypesMod.Token
import typingsSlinky.ecmarkdown.nodeTypesMod.Unlocated
import typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListToken
import typingsSlinky.ecmarkdown.nodeTypesMod.WhitespaceToken
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkdown/dist/tokenizer", JSImport.Namespace)
@js.native
object tokenizerMod extends js.Object {
  
  @js.native
  class Tokenizer protected () extends js.Object {
    def this(str: String) = this()
    
    var _eof: Boolean = js.native
    
    var _lookahead: js.Array[Token] = js.native
    
    var _newline: Boolean = js.native
    
    var column: Double = js.native
    
    def dequeue(): js.UndefOr[
        EOFToken | FormatToken | ParabreakToken | LinebreakToken | WhitespaceToken | TextToken | CommentToken | OpaqueTagToken | TagToken | UnorderedListToken | OrderedListToken
      ] = js.native
    
    def enqueue(tok: Unlocated[Token], pos: Position): Unit = js.native
    
    def enqueueLookahead(tok: Unlocated[Token], pos: Position): Unit = js.native
    
    def expect(name: Format): Unit = js.native
    @JSName("expect")
    def expect_EOF(name: EOF): Unit = js.native
    @JSName("expect")
    def expect_comment(name: comment): Unit = js.native
    @JSName("expect")
    def expect_linebreak(name: linebreak): Unit = js.native
    @JSName("expect")
    def expect_ol(name: ol): Unit = js.native
    @JSName("expect")
    def expect_opaqueTag(name: opaqueTag): Unit = js.native
    @JSName("expect")
    def expect_parabreak(name: parabreak): Unit = js.native
    @JSName("expect")
    def expect_tag(name: tag): Unit = js.native
    @JSName("expect")
    def expect_text(name: text): Unit = js.native
    @JSName("expect")
    def expect_ul(name: ul): Unit = js.native
    @JSName("expect")
    def expect_whitespace(name: whitespace): Unit = js.native
    
    def getLocation(): Position = js.native
    
    var line: Double = js.native
    
    def locate(tok: Unlocated[IdToken | Token], startPos: Position): /* asserts tok is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(ecmarkdown), TsIdentModule(None,List(ecmarkdown, dist, node-types)), TsIdentSimple(Token))),IArray())*/ Boolean = js.native
    
    def matchToken(): Unit = js.native
    
    def next(): Token = js.native
    
    def peek(): Token = js.native
    def peek(dist: Double): Token = js.native
    
    var pos: Double = js.native
    
    var previous: js.UndefOr[Token] = js.native
    
    var queue: js.Array[Token] = js.native
    
    def raise(message: String, pos: Position): Unit = js.native
    
    def scanChars(): String = js.native
    
    def scanDigits(): String = js.native
    
    def scanEscape(): String = js.native
    
    def scanToEOL(): String = js.native
    
    def scanToEndTag(endTag: String): String = js.native
    
    def scanWhitespace(): String = js.native
    
    var str: String = js.native
    
    def tryScanComment(): js.UndefOr[String] = js.native
    
    def tryScanId(): IdToken | Null = js.native
    
    def tryScanTag(): js.UndefOr[RegExpMatchArray] = js.native
  }
}
