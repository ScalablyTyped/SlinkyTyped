package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.idle` API to detect when the machine's idle state changes.
  *
  * Permissions: `idle`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object idle {
  
  /* idle types */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle
  */
  trait IdleState extends StObject
  object IdleState {
    
    @scala.inline
    def active: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active = "active".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.active]
    
    @scala.inline
    def idle: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle = "idle".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.idle]
  }
}
