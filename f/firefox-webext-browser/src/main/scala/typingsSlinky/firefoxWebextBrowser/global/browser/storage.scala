package typingsSlinky.firefoxWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.storage.StorageArea
import typingsSlinky.firefoxWebextBrowser.browser.storage.StorageAreaSync
import typingsSlinky.firefoxWebextBrowser.browser.storage.StorageChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.storage` API to store, retrieve, and track changes to user data.
  *
  * Permissions: `storage`
  */
@JSGlobal("browser.storage")
@js.native
object storage extends js.Object {
  
  /** Items in the `local` storage area are local to each machine. */
  val local: StorageArea = js.native
  
  /**
    * Items in the `managed` storage area are set by administrators or native applications, and are read-only for the extension; trying to modify this namespace results in an error.
    */
  val managed: StorageArea = js.native
  
  /* storage events */
  /**
    * Fired when one or more items change.
    * @param changes Object mapping each key that changed to its corresponding `storage.StorageChange` for that item.
    * @param areaName The name of the storage area (`"sync"`, `"local"` or `"managed"`) the changes are for.
    */
  val onChanged: WebExtEvent[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ] = js.native
  
  /* storage properties */
  /** Items in the `sync` storage area are synced by the browser. */
  val sync: StorageAreaSync = js.native
}
