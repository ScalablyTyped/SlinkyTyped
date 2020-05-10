package typingsSlinky.idb.mod

import org.scalajs.dom.raw.DOMStringList
import typingsSlinky.idb.idbStrings.readonly
import typingsSlinky.idb.idbStrings.readwrite
import typingsSlinky.idb.idbStrings.versionchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  /** Resolves when transaction completes, rejects if transaction aborts or errors. */
  val complete: js.Promise[Unit] = js.native
  /** The mode for isolating access to data in the object stores that are in the scope of the transaction. For possible values, see the Constants section below. The default value is readonly. */
  val mode: readonly | readwrite | versionchange = js.native
  /** Returns a DOMStringList of the names of IDBObjectStore objects. */
  val objectStoreNames: DOMStringList = js.native
  /** Rolls back all the changes to objects in the database associated with this transaction. If this transaction has been aborted or completed, then this method throws an error event. */
  def abort(): Unit = js.native
  /** Returns an ObjectStore object representing an object store that is part of the scope of this transaction.
    * @param name The name of the requested object store.
    * @returns The object store in the context of the transaction. */
  def objectStore[TValue, TKey](name: String): ObjectStore[TValue, TKey] = js.native
}

object Transaction {
  @scala.inline
  def apply(
    abort: () => Unit,
    complete: js.Promise[Unit],
    mode: readonly | readwrite | versionchange,
    objectStore: String => ObjectStore[js.Any, js.Any],
    objectStoreNames: DOMStringList
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), complete = complete.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], objectStore = js.Any.fromFunction1(objectStore), objectStoreNames = objectStoreNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withComplete(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: readonly | readwrite | versionchange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectStore(value: String => ObjectStore[js.Any, js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectStore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObjectStoreNames(value: DOMStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectStoreNames")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

