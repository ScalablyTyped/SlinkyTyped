package typingsSlinky.chromeApps.global.chrome

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chromeApps.chrome.storage.LocalStorageArea
import typingsSlinky.chromeApps.chrome.storage.ManagedStorageArea
import typingsSlinky.chromeApps.chrome.storage.StorageAreas
import typingsSlinky.chromeApps.chrome.storage.StorageChange
import typingsSlinky.chromeApps.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion chrome.sockets.*
// #region chrome.storage
/////////////
// Storage //
/////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  'storage'
  * @since Chrome 20.
  */
@JSGlobal("chrome.storage")
@js.native
object storage extends js.Object {
  
  /** Items in the local storage area are local to each machine. */
  val local: LocalStorageArea = js.native
  
  /**
    * Items in the managed storage area are set by the domain administrator,
    * and are read-only for the extension; trying to modify this namespace
    * results in an error.
    * @since Chrome 33.
    */
  val managed: ManagedStorageArea = js.native
  
  /** Fired when one or more items change. */
  val onChanged: typingsSlinky.chromeApps.chrome.events.Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
  ] = js.native
  
  /** Items in the sync storage area are synced using Chrome Sync. */
  val sync: SyncStorageArea = js.native
}
