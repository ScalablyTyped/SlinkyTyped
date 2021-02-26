package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.comment
import typingsSlinky.ecmarkdown.ecmarkdownStrings.opaqueTag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.pipe
import typingsSlinky.ecmarkdown.ecmarkdownStrings.star
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tag
import typingsSlinky.ecmarkdown.ecmarkdownStrings.text
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tick
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tilde
import typingsSlinky.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.TextNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.FormatNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TagNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagNode
*/
trait FragmentNode extends StObject
object FragmentNode {
  
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
}
