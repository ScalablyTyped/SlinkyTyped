package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.`ordered-list-item`
import typingsSlinky.ecmarkdown.ecmarkdownStrings.`unordered-list-item`
import typingsSlinky.ecmarkdown.ecmarkdownStrings.algorithm
import typingsSlinky.ecmarkdown.ecmarkdownStrings.comment
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.opaqueTag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.pipe
import typingsSlinky.ecmarkdown.ecmarkdownStrings.star
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.text
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tick
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tilde
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import typingsSlinky.ecmarkdown.ecmarkdownStrings.underscore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TagNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.AlgorithmNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TextNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.StarNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnderscoreNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TickNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TildeNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.PipeNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListItemNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListItemNode
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def OpaqueTagNode(contents: String, name: opaqueTag): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], name: star): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def OrderedListItemNode(contents: js.Array[FragmentNode], name: `ordered-list-item`): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TagNode(contents: String, name: tag): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def AlgorithmNode(contents: OrderedListNode, name: algorithm): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TextNode(contents: String, name: text): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def UnorderedListItemNode(contents: js.Array[FragmentNode], name: `unordered-list-item`): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, name: ol, start: Double): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, name: ul): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], name: tick): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def CommentNode(contents: String, name: comment): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], name: underscore): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], name: tilde): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def PipeNode(contents: Null, name: pipe, nonTerminal: String, optional: Boolean, params: String): Node = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}
