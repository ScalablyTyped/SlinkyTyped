package typingsSlinky.dexie.anon

import org.scalajs.dom.raw.IDBFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBKeyRange extends js.Object {
  var IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange
  var indexedDB: IDBFactory
}

object IDBKeyRange {
  @scala.inline
  def apply(IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange, indexedDB: IDBFactory): IDBKeyRange = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBKeyRange]
  }
}

