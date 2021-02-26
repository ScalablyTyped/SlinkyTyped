package typingsSlinky.jpm

import typingsSlinky.jpm.FFAddonSDK.BrowserWindow
import typingsSlinky.jpm.FFAddonSDK.ContentWorker
import typingsSlinky.jpm.FFAddonSDK.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Check whether a given object is private, so an add-on can respect private browsing
  */
object privateBrowsingMod {
  
  @JSImport("sdk/private-browsing", "isPrivate")
  @js.native
  def isPrivate(`object`: BrowserWindow): Boolean = js.native
  @JSImport("sdk/private-browsing", "isPrivate")
  @js.native
  def isPrivate(`object`: ContentWorker): Boolean = js.native
  @JSImport("sdk/private-browsing", "isPrivate")
  @js.native
  def isPrivate(`object`: Tab): Boolean = js.native
}
