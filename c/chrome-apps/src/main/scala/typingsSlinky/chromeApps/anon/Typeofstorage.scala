package typingsSlinky.chromeApps.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.storage.LocalStorageArea
import typingsSlinky.chromeApps.chrome.storage.ManagedStorageArea
import typingsSlinky.chromeApps.chrome.storage.StorageAreas
import typingsSlinky.chromeApps.chrome.storage.StorageChange
import typingsSlinky.chromeApps.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstorage extends js.Object {
  
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
  val onChanged: Event[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
  ] = js.native
  
  /** Items in the sync storage area are synced using Chrome Sync. */
  val sync: SyncStorageArea = js.native
}
object Typeofstorage {
  
  @scala.inline
  def apply(
    local: LocalStorageArea,
    managed: ManagedStorageArea,
    onChanged: Event[
      js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
    ],
    sync: SyncStorageArea
  ): Typeofstorage = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], managed = managed.asInstanceOf[js.Any], onChanged = onChanged.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstorage]
  }
  
  @scala.inline
  implicit class TypeofstorageOps[Self <: Typeofstorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocal(value: LocalStorageArea): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManaged(value: ManagedStorageArea): Self = this.set("managed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChanged(
      value: Event[
          js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ StorageAreas, Unit]
        ]
    ): Self = this.set("onChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync(value: SyncStorageArea): Self = this.set("sync", value.asInstanceOf[js.Any])
  }
}
