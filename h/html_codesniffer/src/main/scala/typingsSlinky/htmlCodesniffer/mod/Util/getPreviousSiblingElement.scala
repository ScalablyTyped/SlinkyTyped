package typingsSlinky.htmlCodesniffer.mod.Util

import org.scalajs.dom.raw.Node
import typingsSlinky.std.ChildNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("html_codesniffer", "Util.getPreviousSiblingElement")
@js.native
object getPreviousSiblingElement extends js.Object {
  
  /**
    * Get the previous sibling element.
    *
    * This is a substitute for previousSibling where there are text, comment and
    * other nodes between elements.
    *
    * If tagName is null, immediate is ignored and effectively defaults to true: the
    * previous element will be returned regardless of what it is.
    *
    * @param element Element to start from.
    * @param [tagName=null] Only match this tag. If null, match any. Not case-sensitive.
    * @param [immediate=false] Only match if the tag in tagName is the immediately preceding non-whitespace node.
    */
  def apply(element: Node): ChildNode | Null = js.native
  def apply(element: Node, tagName: js.UndefOr[scala.Nothing], immediate: Boolean): ChildNode | Null = js.native
  def apply(element: Node, tagName: String): ChildNode | Null = js.native
  def apply(element: Node, tagName: String, immediate: Boolean): ChildNode | Null = js.native
}
