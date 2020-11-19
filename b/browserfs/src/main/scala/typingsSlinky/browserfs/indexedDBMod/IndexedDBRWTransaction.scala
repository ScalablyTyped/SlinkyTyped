package typingsSlinky.browserfs.indexedDBMod

import org.scalajs.dom.raw.IDBObjectStore
import org.scalajs.dom.raw.IDBTransaction
import typingsSlinky.browserfs.keyValueFilesystemMod.AsyncKeyValueRWTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/IndexedDB", "IndexedDBRWTransaction")
@js.native
class IndexedDBRWTransaction protected ()
  extends IndexedDBROTransaction
     with AsyncKeyValueRWTransaction {
  def this(tx: IDBTransaction, store: IDBObjectStore) = this()
}
