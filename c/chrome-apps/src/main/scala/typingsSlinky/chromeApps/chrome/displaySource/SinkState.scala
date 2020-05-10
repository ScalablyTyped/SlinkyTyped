package typingsSlinky.chromeApps.chrome.displaySource

import typingsSlinky.chromeApps.chromeAppsStrings.Connected_
import typingsSlinky.chromeApps.chromeAppsStrings.Connecting_
import typingsSlinky.chromeApps.chromeAppsStrings.Disconnected_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @description
  * **'connected'**
  * Connected using this Display Source (i.e., there is an active session)
  *
  * **'connecting'**
  * In process of connection to this Display Source
  *
  * **'disconnected'**
  * Disconnected from this Display Source
  */
@JSGlobal("chrome.displaySource.SinkState")
@js.native
object SinkState extends js.Object {
  var CONNECTED: Connected_ = js.native
  var CONNECTING: Connecting_ = js.native
  var DISCONNECTED: Disconnected_ = js.native
}

