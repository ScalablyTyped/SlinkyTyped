package typingsSlinky.chromeApps.chrome.fileBrowserHandler

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.AnonEntries
import typingsSlinky.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when file system action is executed from ChromeOS file browser.
  */
@JSGlobal("chrome.fileBrowserHandler.onExecute")
@js.native
object onExecute
  extends TopLevel[
      Event[
        js.Function2[/* id */ FileBrowserHandleExecuteId, /* details */ AnonEntries, Unit]
      ]
    ]

