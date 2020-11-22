package typingsSlinky.halfmoon

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.halfmoon.anon.AlertType
import typingsSlinky.halfmoon.halfmoonStrings.no
import typingsSlinky.halfmoon.halfmoonStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("halfmoon", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clickHandler(event: MouseEvent): Unit = js.native
  
  def createCookie(name: String, value: String): Unit = js.native
  def createCookie(name: String, value: String, days: Double): Unit = js.native
  
  var darkModeOn: yes | no = js.native
  
  def deactivateAllDropdownToggles(): Unit = js.native
  
  def eraseCookie(name: String): Unit = js.native
  
  def initStickyAlert(param: AlertType): Unit = js.native
  
  def keydownHandler(event: KeyboardEvent): Unit = js.native
  
  def makeId(length: Double): String = js.native
  
  def onDOMContentLoaded(): Unit = js.native
  
  val pageWrapper: Element = js.native
  
  def readCookie(name: String): String | Null = js.native
  
  val stickyAlerts: Element = js.native
  
  def toastAlert(alertId: String): Unit = js.native
  def toastAlert(alertId: String, timeShown: Double): Unit = js.native
  
  def toggleDarkMode(): Unit = js.native
  
  def toggleModal(modalId: String): Unit = js.native
  
  def toggleSidebar(): Unit = js.native
}
