package typingsSlinky.popperjsCore

import org.scalajs.dom.raw.Element
import typingsSlinky.popperjsCore.typesMod.ClientRectObject
import typingsSlinky.popperjsCore.typesMod.VirtualElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popperjs/core/lib/dom-utils/getBoundingClientRect", JSImport.Namespace)
@js.native
object getBoundingClientRectMod extends js.Object {
  
  def default(element: VirtualElement): ClientRectObject = js.native
  def default(element: Element): ClientRectObject = js.native
}
