package typingsSlinky.jpm

import org.scalajs.dom.raw.DOMException
import org.scalajs.dom.raw.IDBFactory
import org.scalajs.dom.raw.IDBKeyRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexedDbMod {
  
  // these interfaces are already provided by TypeScript
  @js.native
  trait IndexedImpl extends StObject {
    
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
    implicit class IndexedImplMutableBuilder[Self <: IndexedImpl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDOMException(value: DOMException): Self = StObject.set(x, "DOMException", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDBKeyRange(value: IDBKeyRange): Self = StObject.set(x, "IDBKeyRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedDB(value: IDBFactory): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
    }
  }
}
