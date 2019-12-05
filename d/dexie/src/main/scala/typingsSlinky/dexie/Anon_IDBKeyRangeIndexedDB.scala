package typingsSlinky.dexie

import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IDBKeyRangeIndexedDB extends js.Object {
  var IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange
  var indexedDB: IDBFactory
}

object Anon_IDBKeyRangeIndexedDB {
  @scala.inline
  def apply(IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): Anon_IDBKeyRangeIndexedDB = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IDBKeyRangeIndexedDB]
  }
}

