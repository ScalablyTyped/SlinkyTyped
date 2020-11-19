package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This API provides the ability to determine the status of and detect changes in the network connection. This API can
  * only be used in privileged extensions.
  *
  * Permissions: `networkStatus`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.networkStatus")
@js.native
object networkStatus extends js.Object {
  
  /* networkStatus functions */
  /** Returns the $(ref:NetworkLinkInfo} of the current network connection. */
  def getLinkInfo(): js.Promise[NetworkLinkInfo] = js.native
  
  /* networkStatus events */
  /** Fired when the network connection state changes. */
  val onConnectionChanged: WebExtEvent[js.Function1[/* details */ NetworkLinkInfo, Unit]] = js.native
}
