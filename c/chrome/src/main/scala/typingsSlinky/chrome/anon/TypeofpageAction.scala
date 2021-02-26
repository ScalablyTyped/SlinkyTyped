package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.pageAction.GetDetails
import typingsSlinky.chrome.chrome.pageAction.IconDetails
import typingsSlinky.chrome.chrome.pageAction.PageActionClickedEvent
import typingsSlinky.chrome.chrome.pageAction.PopupDetails
import typingsSlinky.chrome.chrome.pageAction.TitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpageAction extends StObject {
  
  def getPopup(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def getTitle(details: GetDetails, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
  
  def hide(tabId: Double): Unit = js.native
  def hide(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  var onClicked: PageActionClickedEvent = js.native
  
  def setIcon(details: IconDetails): Unit = js.native
  def setIcon(details: IconDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setPopup(details: PopupDetails): Unit = js.native
  def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def setTitle(details: TitleDetails): Unit = js.native
  def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = js.native
  
  def show(tabId: Double): Unit = js.native
  def show(tabId: Double, callback: js.Function0[Unit]): Unit = js.native
}
