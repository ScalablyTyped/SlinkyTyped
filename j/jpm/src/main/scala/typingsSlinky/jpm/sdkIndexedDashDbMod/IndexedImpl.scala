package typingsSlinky.jpm.sdkIndexedDashDbMod

import org.scalajs.dom.raw.DOMException
import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// these interfaces are already provided by TypeScript
trait IndexedImpl extends js.Object {
  var DOMException: org.scalajs.dom.raw.DOMException
  var IDBKeyRange: org.scalajs.dom.raw.IDBKeyRange
  var indexedDB: IDBFactory
}

object IndexedImpl {
  @scala.inline
  def apply(DOMException: DOMException, IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): IndexedImpl = {
    val __obj = js.Dynamic.literal(DOMException = DOMException.asInstanceOf[js.Any], IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexedImpl]
  }
}

