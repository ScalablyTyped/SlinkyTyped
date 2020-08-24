package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdUtils.typesMod.Coords
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/positioning/getElementRect", JSImport.Namespace)
@js.native
object getElementRectMod extends js.Object {
  def default(element: HTMLElement): DOMRect | ClientRect = js.native
  def default(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
}

