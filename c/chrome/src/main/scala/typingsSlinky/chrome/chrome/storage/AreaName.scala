package typingsSlinky.chrome.chrome.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined keyof std.Pick<{  local :chrome.chrome.storage.LocalStorageArea,   sync :chrome.chrome.storage.SyncStorageArea,   managed :chrome.chrome.storage.StorageArea,   onChanged :chrome.chrome.storage.StorageChangedEvent}, 'sync' | 'local' | 'managed'> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chrome.chromeStrings.sync
  - typingsSlinky.chrome.chromeStrings.local
  - typingsSlinky.chrome.chromeStrings.managed
*/
trait AreaName extends js.Object
object AreaName {
  
  @scala.inline
  def local: typingsSlinky.chrome.chromeStrings.local = "local".asInstanceOf[typingsSlinky.chrome.chromeStrings.local]
  
  @scala.inline
  def managed: typingsSlinky.chrome.chromeStrings.managed = "managed".asInstanceOf[typingsSlinky.chrome.chromeStrings.managed]
  
  @scala.inline
  def sync: typingsSlinky.chrome.chromeStrings.sync = "sync".asInstanceOf[typingsSlinky.chrome.chromeStrings.sync]
}
