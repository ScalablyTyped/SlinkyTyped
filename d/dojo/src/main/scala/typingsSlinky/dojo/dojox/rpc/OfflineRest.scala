package typingsSlinky.dojo.dojox.rpc

import typingsSlinky.dojo.dojo.data.api.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rpc/OfflineRest.html
  *
  * Makes the REST service be able to store changes in local
  * storage so it can be used offline automatically.
  *
  */
@js.native
trait OfflineRest extends js.Object {
  /**
    *
    */
  var stores: js.Array[_] = js.native
  /**
    * Adds a store to the monitored store for local storage
    *
    * @param store Store to add
    * @param baseQuery               OptionalThis is the base query to should be used to load the items forthe store. Generally you want to load all the items that should beavailable when offline.
    */
  def addStore(store: Read, baseQuery: String): Unit = js.native
  /**
    *
    */
  def downloadChanges(): Unit = js.native
  /**
    *
    */
  def sendChanges(): Unit = js.native
  /**
    *
    */
  def sync(): Unit = js.native
  /**
    *
    */
  def turnOffAutoSync(): Unit = js.native
}

object OfflineRest {
  @scala.inline
  def apply(
    addStore: (Read, String) => Unit,
    downloadChanges: () => Unit,
    sendChanges: () => Unit,
    stores: js.Array[_],
    sync: () => Unit,
    turnOffAutoSync: () => Unit
  ): OfflineRest = {
    val __obj = js.Dynamic.literal(addStore = js.Any.fromFunction2(addStore), downloadChanges = js.Any.fromFunction0(downloadChanges), sendChanges = js.Any.fromFunction0(sendChanges), stores = stores.asInstanceOf[js.Any], sync = js.Any.fromFunction0(sync), turnOffAutoSync = js.Any.fromFunction0(turnOffAutoSync))
    __obj.asInstanceOf[OfflineRest]
  }
  @scala.inline
  implicit class OfflineRestOps[Self <: OfflineRest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddStore(value: (Read, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStore")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDownloadChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSendChanges(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendChanges")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStores(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stores")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTurnOffAutoSync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("turnOffAutoSync")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

