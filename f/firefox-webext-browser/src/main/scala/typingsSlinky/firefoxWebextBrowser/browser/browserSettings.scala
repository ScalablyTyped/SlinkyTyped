package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.browserSettings` API to control global settings of the browser.
  *
  * Permissions: `browserSettings`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object browserSettings {
  
  /** After which mouse event context menus should popup. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown
  */
  trait ContextMenuMouseEvent extends StObject
  object ContextMenuMouseEvent {
    
    @scala.inline
    def mousedown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown = "mousedown".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mousedown]
    
    @scala.inline
    def mouseup: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup = "mouseup".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.mouseup]
  }
  
  /* browserSettings types */
  /** How images should be animated in the browser. */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
    - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.once
  */
  trait ImageAnimationBehavior extends StObject
  object ImageAnimationBehavior {
    
    @scala.inline
    def none: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = "none".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.none]
    
    @scala.inline
    def normal: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = "normal".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal]
    
    @scala.inline
    def once: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.once = "once".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.once]
  }
}
