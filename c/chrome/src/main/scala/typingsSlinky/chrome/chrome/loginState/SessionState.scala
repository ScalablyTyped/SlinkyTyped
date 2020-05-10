package typingsSlinky.chrome.chrome.loginState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chrome.chromeStrings.UNKNOWN
  - typingsSlinky.chrome.chromeStrings.IN_OOBE_SCREEN
  - typingsSlinky.chrome.chromeStrings.IN_LOGIN_SCREEN
  - typingsSlinky.chrome.chromeStrings.IN_SESSION
  - typingsSlinky.chrome.chromeStrings.IN_LOCK_SCREEN
*/
trait SessionState extends js.Object

object SessionState {
  @scala.inline
  def IN_LOCK_SCREEN: typingsSlinky.chrome.chromeStrings.IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[typingsSlinky.chrome.chromeStrings.IN_LOCK_SCREEN]
  @scala.inline
  def IN_LOGIN_SCREEN: typingsSlinky.chrome.chromeStrings.IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[typingsSlinky.chrome.chromeStrings.IN_LOGIN_SCREEN]
  @scala.inline
  def IN_OOBE_SCREEN: typingsSlinky.chrome.chromeStrings.IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[typingsSlinky.chrome.chromeStrings.IN_OOBE_SCREEN]
  @scala.inline
  def IN_SESSION: typingsSlinky.chrome.chromeStrings.IN_SESSION = "IN_SESSION".asInstanceOf[typingsSlinky.chrome.chromeStrings.IN_SESSION]
  @scala.inline
  def UNKNOWN: typingsSlinky.chrome.chromeStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.chrome.chromeStrings.UNKNOWN]
}

