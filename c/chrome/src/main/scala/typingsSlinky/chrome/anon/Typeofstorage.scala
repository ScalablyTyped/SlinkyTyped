package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.storage.LocalStorageArea
import typingsSlinky.chrome.chrome.storage.StorageArea
import typingsSlinky.chrome.chrome.storage.StorageChangedEvent
import typingsSlinky.chrome.chrome.storage.SyncStorageArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstorage extends StObject {
  
  var local: LocalStorageArea = js.native
  
  var managed: StorageArea = js.native
  
  var onChanged: StorageChangedEvent = js.native
  
  var sync: SyncStorageArea = js.native
}
object Typeofstorage {
  
  @scala.inline
  def apply(
    local: LocalStorageArea,
    managed: StorageArea,
    onChanged: StorageChangedEvent,
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
  
  @scala.inline
  implicit class TypeofstorageMutableBuilder[Self <: Typeofstorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: LocalStorageArea): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManaged(value: StorageArea): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChanged(value: StorageChangedEvent): Self = StObject.set(x, "onChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: SyncStorageArea): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
  }
}
