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
import org.scalablytyped.runtime.StObject
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
trait Node extends StObject
object Node {
  
  @scala.inline
  def AlgorithmNode(contents: OrderedListNode, location: LocationRange, name: algorithm): typingsSlinky.ecmarkdown.nodeTypesMod.AlgorithmNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.AlgorithmNode]
  }
  
  @scala.inline
  def CommentNode(contents: String, location: LocationRange, name: comment): typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode]
  }
  
  @scala.inline
  def OpaqueTagNode(contents: String, location: LocationRange, name: opaqueTag): typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagNode]
  }
  
  @scala.inline
  def OrderedListItemNode(contents: js.Array[FragmentNode], location: LocationRange, name: `ordered-list-item`): typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListItemNode]
  }
  
  @scala.inline
  def OrderedListNode(
    contents: js.Array[OrderedListItemNode],
    indent: Double,
    location: LocationRange,
    name: ol,
    start: Double
  ): typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListNode]
  }
  
  @scala.inline
  def PipeNode(
    contents: Null,
    location: LocationRange,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String
  ): typingsSlinky.ecmarkdown.nodeTypesMod.PipeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.PipeNode]
  }
  
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], location: LocationRange, name: star): typingsSlinky.ecmarkdown.nodeTypesMod.StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.StarNode]
  }
  
  @scala.inline
  def TagNode(contents: String, location: LocationRange, name: tag): typingsSlinky.ecmarkdown.nodeTypesMod.TagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.TagNode]
  }
  
  @scala.inline
  def TextNode(contents: String, location: LocationRange, name: text): typingsSlinky.ecmarkdown.nodeTypesMod.TextNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.TextNode]
  }
  
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], location: LocationRange, name: tick): typingsSlinky.ecmarkdown.nodeTypesMod.TickNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.TickNode]
  }
  
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], location: LocationRange, name: tilde): typingsSlinky.ecmarkdown.nodeTypesMod.TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.TildeNode]
  }
  
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], location: LocationRange, name: underscore): typingsSlinky.ecmarkdown.nodeTypesMod.UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.UnderscoreNode]
  }
  
  @scala.inline
  def UnorderedListItemNode(contents: js.Array[FragmentNode], location: LocationRange, name: `unordered-list-item`): typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListItemNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListItemNode]
  }
  
  @scala.inline
  def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange, name: ul): typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode]
  }
}
