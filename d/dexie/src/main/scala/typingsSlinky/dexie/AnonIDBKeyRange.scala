package typingsSlinky.dexie

import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIDBKeyRange extends js.Object {
  var IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange
  var indexedDB: IDBFactory
}

object AnonIDBKeyRange {
  @scala.inline
  def apply(IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): AnonIDBKeyRange = {
    val __obj = js.Dynamic.literal(IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIDBKeyRange]
  }
}

