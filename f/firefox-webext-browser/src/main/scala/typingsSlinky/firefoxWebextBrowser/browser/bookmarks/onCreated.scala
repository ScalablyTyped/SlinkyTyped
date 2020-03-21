package typingsSlinky.firefoxWebextBrowser.browser.bookmarks

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* bookmarks events */
/** Fired when a bookmark or folder is created. */
@JSGlobal("browser.bookmarks.onCreated")
@js.native
object onCreated
  extends TopLevel[
      WebExtEvent[js.Function2[/* id */ String, /* bookmark */ BookmarkTreeNode, Unit]]
    ]

