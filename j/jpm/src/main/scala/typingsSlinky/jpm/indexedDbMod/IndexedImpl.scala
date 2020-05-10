package typingsSlinky.jpm.indexedDbMod

import org.scalajs.dom.raw.DOMException
import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// these interfaces are already provided by TypeScript
@js.native
trait IndexedImpl extends js.Object {
  var DOMException: org.scalajs.dom.raw.DOMException = js.native
  var IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange = js.native
  var indexedDB: IDBFactory = js.native
}

object IndexedImpl {
  @scala.inline
  def apply(DOMException: DOMException, IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): IndexedImpl = {
    val __obj = js.Dynamic.literal(DOMException = DOMException.asInstanceOf[js.Any], IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedImpl]
  }
  @scala.inline
  implicit class IndexedImplOps[Self <: IndexedImpl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDOMException(value: DOMException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOMException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIDBKeyRange(value: IDBKeyRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IDBKeyRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexedDB(value: IDBFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexedDB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

