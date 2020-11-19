package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.storage.LocalStorageArea
import typingsSlinky.chrome.chrome.storage.StorageArea
import typingsSlinky.chrome.chrome.storage.StorageChangedEvent
import typingsSlinky.chrome.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Storage
////////////////////
/**
  * Use the chrome.storage API to store, retrieve, and track changes to user data.
  * Permissions:  "storage"
  * @since Chrome 20.
  */
@JSGlobal("chrome.storage")
@js.native
object storage extends js.Object {
  
  var local: LocalStorageArea = js.native
  
  var managed: StorageArea = js.native
  
  var onChanged: StorageChangedEvent = js.native
  
  var sync: SyncStorageArea = js.native
}
