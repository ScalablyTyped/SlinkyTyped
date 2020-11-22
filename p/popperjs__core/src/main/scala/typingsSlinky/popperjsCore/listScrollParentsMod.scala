package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.popperjsCore.typesMod.VisualViewport
import typingsSlinky.popperjsCore.typesMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/listScrollParents", JSImport.Namespace)
@js.native
object listScrollParentsMod extends js.Object {
  
  def default(element: Node): js.Array[Element | Window | VisualViewport] = js.native
  def default(element: Node, list: js.Array[Element | Window]): js.Array[Element | Window | VisualViewport] = js.native
}
