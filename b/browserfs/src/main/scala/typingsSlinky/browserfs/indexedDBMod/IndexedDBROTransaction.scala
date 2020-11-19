package typingsSlinky.browserfs.indexedDBMod

import org.scalajs.dom.raw.IDBObjectStore
import org.scalajs.dom.raw.IDBTransaction
import typingsSlinky.browserfs.keyValueFilesystemMod.AsyncKeyValueROTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBROTransaction")
@js.native
class IndexedDBROTransaction protected () extends AsyncKeyValueROTransaction {
  def this(tx: IDBTransaction, store: IDBObjectStore) = this()
  
  var store: IDBObjectStore = js.native
  
  var tx: IDBTransaction = js.native
}
