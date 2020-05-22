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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.TextNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.FormatNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.CommentNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TagNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.OpaqueTagNode
*/
trait FragmentNode extends js.Object

object FragmentNode {
  @scala.inline
  def OpaqueTagNode(contents: String, name: opaqueTag, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def StarNode(contents: js.Array[FragmentNode], name: star, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TagNode(contents: String, name: tag, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TextNode(contents: String, name: text, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TickNode(contents: js.Array[FragmentNode], name: tick, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def CommentNode(contents: String, name: comment, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def UnderscoreNode(contents: js.Array[FragmentNode], name: underscore, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def TildeNode(contents: js.Array[FragmentNode], name: tilde, location: LocationRange = null): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
  @scala.inline
  def PipeNode(
    contents: Null,
    name: pipe,
    nonTerminal: String,
    optional: Boolean,
    params: String,
    location: LocationRange = null
  ): FragmentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nonTerminal = nonTerminal.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentNode]
  }
}

