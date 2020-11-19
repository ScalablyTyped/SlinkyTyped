package typingsSlinky.ecmarkdown

import typingsSlinky.ecmarkdown.mod.Options
import typingsSlinky.ecmarkdown.nodeTypesMod.CommentToken
import typingsSlinky.ecmarkdown.nodeTypesMod.EOFToken
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
    def this(str: String, options: Options) = this()
    
    var _eof: Boolean = js.native
    
    var _lookahead: js.Array[Token] = js.native
    
    var _newline: Boolean = js.native
    
    var _trackPositions: Boolean = js.native
    
    var column: Double = js.native
    
    def dequeue(): js.UndefOr[
        EOFToken | FormatToken | ParabreakToken | LinebreakToken | WhitespaceToken | TextToken | CommentToken | OpaqueTagToken | TagToken | UnorderedListToken | OrderedListToken
      ] = js.native
    
    def enqueue(tok: Token, pos: Position): Unit = js.native
    
    def enqueueLookahead(tok: Token, pos: Position): Unit = js.native
    
    def getLocation(): Position = js.native
    
    var line: Double = js.native
    
    def locate(tok: IdToken, startPos: Position): Unit = js.native
    def locate(tok: Token, startPos: Position): Unit = js.native
    
    def matchToken(): Unit = js.native
    
    def next(): Token = js.native
    
    def peek(): Token = js.native
    def peek(dist: Double): Token = js.native
    
    var pos: Double = js.native
    
    var previous: js.UndefOr[Token] = js.native
    
    var queue: js.Array[Token] = js.native
    
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
