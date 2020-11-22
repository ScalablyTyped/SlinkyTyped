package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdUtils.typesMod.Coords
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/positioning/getElementRect", JSImport.Namespace)
@js.native
object getElementRectMod extends js.Object {
  
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
}
