package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
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
@JSGlobal("browser.browserSettings")
@js.native
object browserSettings extends js.Object {
  
  /* browserSettings properties */
  /** Allows or disallows pop-up windows from opening in response to user events. */
  val allowPopupsForUserEvents: Setting = js.native
  
  /** Enables or disables the browser cache. */
  val cacheEnabled: Setting = js.native
  
  /** This boolean setting controls whether the selected tab can be closed with a double click. */
  val closeTabsByDoubleClick: Setting = js.native
  
  /**
    * Controls after which mouse event context menus popup. This setting's value is of type ContextMenuMouseEvent,
    * which has possible values of `mouseup` and `mousedown`.
    */
  val contextMenuShowEvent: Setting = js.native
  
  /** This boolean setting controls whether the FTP protocol is enabled. */
  val ftpProtocolEnabled: Setting = js.native
  
  /** Returns the value of the overridden home page. Read-only. */
  val homepageOverride: Setting = js.native
  
  /**
    * Controls the behaviour of image animation in the browser. This setting's value is of type
    * ImageAnimationBehavior, defaulting to `normal`.
    */
  val imageAnimationBehavior: Setting = js.native
  
  /** Returns the value of the overridden new tab page. Read-only. */
  val newTabPageOverride: Setting = js.native
  
  /**
    * Controls where new tabs are opened. `afterCurrent` will open all new tabs next to the current tab,
    * `relatedAfterCurrent` will open only related tabs next to the current tab, and `atEnd` will open all tabs at the
    * end of the tab strip. The default is `relatedAfterCurrent`.
    */
  val newTabPosition: Setting = js.native
  
  /** This boolean setting controls whether bookmarks are opened in the current tab or in a new tab. */
  val openBookmarksInNewTabs: Setting = js.native
  
  /** This boolean setting controls whether search results are opened in the current tab or in a new tab. */
  val openSearchResultsInNewTabs: Setting = js.native
  
  /** This boolean setting controls whether urlbar results are opened in the current tab or in a new tab. */
  val openUrlbarResultsInNewTabs: Setting = js.native
  
  /** This setting controls whether the user-chosen colors override the page's colors. */
  val overrideDocumentColors: Setting = js.native
  
  /** This setting controls whether the document's fonts are used. */
  val useDocumentFonts: Setting = js.native
  
  /** Disables webAPI notifications. */
  val webNotificationsDisabled: Setting = js.native
  
  /** This boolean setting controls whether zoom is applied to the full page or to text only. */
  val zoomFullPage: Setting = js.native
  
  /**
    * This boolean setting controls whether zoom is applied on a per-site basis or to the current tab only. If
    * privacy.resistFingerprinting is true, this setting has no effect and zoom is applied to the current tab only.
    */
  val zoomSiteSpecific: Setting = js.native
}
