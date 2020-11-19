package typingsSlinky.jpm.indexedDbMod

import org.scalajs.dom.raw.DOMException
import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.IDBKeyRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDOMException(value: DOMException): Self = this.set("DOMException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIDBKeyRange(value: IDBKeyRange): Self = this.set("IDBKeyRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexedDB(value: IDBFactory): Self = this.set("indexedDB", value.asInstanceOf[js.Any])
  }
}
