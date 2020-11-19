package typingsSlinky.ecmarkdown.nodeTypesMod

import typingsSlinky.ecmarkdown.ecmarkdownStrings.ol
import typingsSlinky.ecmarkdown.ecmarkdownStrings.ul
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ecmarkdown.nodeTypesMod.UnorderedListNode
  - typingsSlinky.ecmarkdown.nodeTypesMod.OrderedListNode
*/
trait ListNode extends js.Object
object ListNode {
  
  @scala.inline
  def UnorderedListNode(contents: js.Array[UnorderedListItemNode], indent: Double, name: ul): ListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode]
  }
  
  @scala.inline
  def OrderedListNode(contents: js.Array[OrderedListItemNode], indent: Double, name: ol, start: Double): ListNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode]
  }
}
