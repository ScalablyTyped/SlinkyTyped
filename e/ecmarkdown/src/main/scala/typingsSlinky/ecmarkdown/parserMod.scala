package typingsSlinky.ecmarkdown

import typingsSlinky.ecmarkdown.anon.Contents
import typingsSlinky.ecmarkdown.anon.ContentsLocation
import typingsSlinky.ecmarkdown.anon.Location
import typingsSlinky.ecmarkdown.anon.Name
import typingsSlinky.ecmarkdown.anon.PickOrderedListNodestartc
import typingsSlinky.ecmarkdown.anon.PickPipeNodeoptionalconte
import typingsSlinky.ecmarkdown.anon.PickUnorderedListNodecont
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Format
import typingsSlinky.ecmarkdown.nodeTypesMod.FragmentNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Node
import typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListItemNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Position
import typingsSlinky.ecmarkdown.nodeTypesMod.TagNode
import typingsSlinky.ecmarkdown.nodeTypesMod.TextNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Token
import typingsSlinky.ecmarkdown.nodeTypesMod.Unlocated
import typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListItemNode
import typingsSlinky.ecmarkdown.tokenizerMod.Tokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("ecmarkdown/dist/parser", "Parser")
  @js.native
  class Parser protected () extends StObject {
    def this(tokenizer: Tokenizer) = this()
    
    var _posStack: js.Array[Position] = js.native
    
    var _t: Tokenizer = js.native
    
    def finish[T /* <: Unlocated[Node] */](node: T): T with Location = js.native
    def finish[T /* <: Unlocated[Node] */](node: T, start: js.UndefOr[scala.Nothing], end: Position): T with Location = js.native
    def finish[T /* <: Unlocated[Node] */](node: T, start: Position): T with Location = js.native
    def finish[T /* <: Unlocated[Node] */](node: T, start: Position, end: Position): T with Location = js.native
    
    def getEnd(node: Node): Position = js.native
    def getEnd(node: Token): Position = js.native
    
    def getPos(): Position = js.native
    def getPos(node: Node): Position = js.native
    def getPos(node: Token): Position = js.native
    
    def parseAlgorithm(): Contents = js.native
    
    def parseFormat(format: Format, opts: ParseFragmentOpts): js.Array[CommentNode | ContentsLocation | PickPipeNodeoptionalconte | TagNode | TextNode] = js.native
    
    def parseFragment(opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
    def parseFragment(opts: ParseFragmentOpts, closingFormatKind: Format): js.Array[TextNode | CommentNode | TagNode] = js.native
    
    def parseList(): PickOrderedListNodestartc | PickUnorderedListNodecont = js.native
    
    @JSName("parseListItem")
    def parseListItem_ol(kind: ol, indent: Double): OrderedListItemNode = js.native
    @JSName("parseListItem")
    def parseListItem_ul(kind: ul, indent: Double): UnorderedListItemNode = js.native
    
    def parseText(opts: ParseFragmentOpts): Name | Null = js.native
    def parseText(opts: ParseFragmentOpts, closingFormatKind: Format): Name | Null = js.native
    
    def popPos(): js.UndefOr[Position] = js.native
    
    def pushPos(): Unit = js.native
  }
  /* static members */
  object Parser {
    
    @JSImport("ecmarkdown/dist/parser", "Parser.parseAlgorithm")
    @js.native
    def parseAlgorithm(str: String): Contents = js.native
    
    @JSImport("ecmarkdown/dist/parser", "Parser.parseFragment")
    @js.native
    def parseFragment(str: String): js.Array[FragmentNode] = js.native
  }
  
  @js.native
  trait ParseFragmentOpts extends StObject {
    
    var inList: js.UndefOr[Boolean] = js.native
  }
  object ParseFragmentOpts {
    
    @scala.inline
    def apply(): ParseFragmentOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseFragmentOpts]
    }
    
    @scala.inline
    implicit class ParseFragmentOptsMutableBuilder[Self <: ParseFragmentOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInList(value: Boolean): Self = StObject.set(x, "inList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInListUndefined: Self = StObject.set(x, "inList", js.undefined)
    }
  }
}
