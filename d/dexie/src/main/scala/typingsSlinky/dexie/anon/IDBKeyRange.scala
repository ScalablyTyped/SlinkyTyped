package typingsSlinky.dexie.anon

import org.scalajs.dom.raw.IDBFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBKeyRange extends js.Object {
  var IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange = js.native
  var indexedDB: IDBFactory = js.native
}

object IDBKeyRange {
  @scala.inline
  def apply(IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange, indexedDB: IDBFactory): IDBKeyRange = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBKeyRange]
  }
  @scala.inline
  implicit class IDBKeyRangeOps[Self <: IDBKeyRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIDBKeyRange(value: org.scalajs.dom.raw.IDBKeyRange): Self = {
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

