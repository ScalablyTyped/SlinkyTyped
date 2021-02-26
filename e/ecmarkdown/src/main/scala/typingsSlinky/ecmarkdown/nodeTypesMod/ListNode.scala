package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListNode
*/
trait ListNode extends StObject
object ListNode {
  
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
  def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, location: LocationRange, name: ul): typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode]
  }
}
