package typingsSlinky.reactMdUtils

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactMdUtils.typesMod.Coords
import typingsSlinky.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementRectMod {
  
  @JSImport("@react-md/utils/types/positioning/getElementRect", "getElementRect")
  @js.native
  def getElementRect(element: HTMLElement): DOMRect | ClientRect = js.native
  @JSImport("@react-md/utils/types/positioning/getElementRect", "getElementRect")
  @js.native
  def getElementRect(element: HTMLElement, coords: Coords): DOMRect | ClientRect = js.native
}
