package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.pipe
import typingsSlinky.ecmarkdown.ecmarkdownStrings.star
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tick
import typingsSlinky.ecmarkdown.ecmarkdownStrings.tilde
import typingsSlinky.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.StarNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnderscoreNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TickNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.TildeNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.PipeNode
*/
trait FormatNode extends FragmentNode
object FormatNode {
  
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
