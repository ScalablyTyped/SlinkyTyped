package typingsSlinky.officeUiFabricReact.anon

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.officeUiFabricReact.stickyStickyMod.Sticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSticky extends StObject {
  
  def addSticky(sticky: Sticky): scala.Unit = js.native
  
  def notifySubscribers(): scala.Unit = js.native
  def notifySubscribers(sort: Boolean): scala.Unit = js.native
  
  def removeSticky(sticky: Sticky): scala.Unit = js.native
  
  def sortSticky(sticky: Sticky): scala.Unit = js.native
  def sortSticky(sticky: Sticky, sortAgain: Boolean): scala.Unit = js.native
  
  def subscribe(handler: js.Function2[/* container */ HTMLElement, /* stickyContainer */ HTMLElement, scala.Unit]): scala.Unit = js.native
  
  def syncScrollSticky(sticky: Sticky): scala.Unit = js.native
  
  def unsubscribe(handler: js.Function2[/* container */ HTMLElement, /* stickyContainer */ HTMLElement, scala.Unit]): scala.Unit = js.native
  
  def updateStickyRefHeights(): scala.Unit = js.native
}
