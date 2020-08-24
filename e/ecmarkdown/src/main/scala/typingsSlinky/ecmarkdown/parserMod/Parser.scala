package typingsSlinky.ecmarkdown.parserMod

import typingsSlinky.ecmarkdown.anon.Contents
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import typingsSlinky.ecmarkdown.mod.Options
import typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Format
import typingsSlinky.ecmarkdown.nodeTypesMod.FragmentNode
import typingsSlinky.ecmarkdown.nodeTypesMod.ListNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Node
import typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListItemNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Position
import typingsSlinky.ecmarkdown.nodeTypesMod.TagNode
import typingsSlinky.ecmarkdown.nodeTypesMod.TextNode
import typingsSlinky.ecmarkdown.nodeTypesMod.Token
import typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListItemNode
import typingsSlinky.ecmarkdown.tokenizerMod.Tokenizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkdown/dist/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(tokenizer: Tokenizer) = this()
  def this(tokenizer: Tokenizer, options: Options) = this()
  var _posStack: js.UndefOr[js.Array[Position]] = js.native
  var _t: Tokenizer = js.native
  def finish[T /* <: Node */](node: T): T = js.native
  def finish[T /* <: Node */](node: T, start: js.UndefOr[scala.Nothing], end: Position): T = js.native
  def finish[T /* <: Node */](node: T, start: Position): T = js.native
  def finish[T /* <: Node */](node: T, start: Position, end: Position): T = js.native
  def getEnd(node: Node): js.UndefOr[Position] = js.native
  def getEnd(node: Token): js.UndefOr[Position] = js.native
  def getPos(): js.UndefOr[Position] = js.native
  def getPos(node: Node): js.UndefOr[Position] = js.native
  def getPos(node: Token): js.UndefOr[Position] = js.native
  def parseAlgorithm(): Contents = js.native
  def parseFormat(format: Format, opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
  def parseFragment(opts: ParseFragmentOpts): js.Array[FragmentNode] = js.native
  def parseFragment(opts: ParseFragmentOpts, closingFormatKind: Format): js.Array[TextNode | CommentNode | TagNode] = js.native
  def parseList(): ListNode = js.native
  @JSName("parseListItem")
  def parseListItem_ol(kind: ol, indent: Double): OrderedListItemNode = js.native
  @JSName("parseListItem")
  def parseListItem_ul(kind: ul, indent: Double): UnorderedListItemNode = js.native
  def parseText(opts: ParseFragmentOpts): TextNode | Null = js.native
  def parseText(opts: ParseFragmentOpts, closingFormatKind: Format): TextNode | Null = js.native
  def popPos(): js.UndefOr[Position] = js.native
  def pushPos(): Unit = js.native
}

/* static members */
@JSImport("ecmarkdown/dist/parser", "Parser")
@js.native
object Parser extends js.Object {
  def parseAlgorithm(str: String): Contents = js.native
  def parseAlgorithm(str: String, options: Options): Contents = js.native
  def parseFragment(str: String): js.Array[FragmentNode] = js.native
  def parseFragment(str: String, options: Options): js.Array[FragmentNode] = js.native
}

