package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.scriptBadge.AttentionDetails
import typingsSlinky.chrome.chrome.scriptBadge.GetPopupDetails
import typingsSlinky.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typingsSlinky.chrome.chrome.scriptBadge.SetPopupDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Script Badge
////////////////////
@JSGlobal("chrome.scriptBadge")
@js.native
object scriptBadge extends js.Object {
  
  def getAttention(details: AttentionDetails): Unit = js.native
  
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  
  var onClicked: ScriptBadgeClickedEvent = js.native
  
  def setPopup(details: SetPopupDetails): Unit = js.native
}
