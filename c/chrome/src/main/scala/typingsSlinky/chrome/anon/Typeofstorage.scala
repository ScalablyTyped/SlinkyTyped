package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.storage.LocalStorageArea
import typingsSlinky.chrome.chrome.storage.StorageArea
import typingsSlinky.chrome.chrome.storage.StorageChangedEvent
import typingsSlinky.chrome.chrome.storage.SyncStorageArea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstorage extends js.Object {
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
  implicit class TypeofstorageOps[Self <: Typeofstorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocal(value: LocalStorageArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("local")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManaged(value: StorageArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChanged(value: StorageChangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(value: SyncStorageArea): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

