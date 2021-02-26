package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.browser.activityLog.ActivityLogOnExtensionActivityEvent
import typingsSlinky.firefoxWebextBrowser.browser.activityLog.OnExtensionActivityDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Monitor extension activity
  *
  * Permissions: `activityLog`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object activityLog {
  
  /* activityLog events */
  /** Receives an activityItem for each logging event. */
  @JSGlobal("browser.activityLog.onExtensionActivity")
  @js.native
  val onExtensionActivity: ActivityLogOnExtensionActivityEvent[js.Function1[/* details */ OnExtensionActivityDetails, Unit]] = js.native
}
