package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.ADDED
import typingsSlinky.rockset.rocksetStrings.DELETED
import typingsSlinky.rockset.rocksetStrings.ERROR
import typingsSlinky.rockset.rocksetStrings.REPLACED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentStatus extends StObject {
  
  // collection name
  var _collection: js.UndefOr[String] = js.native
  
  // unique document ID
  var _id: js.UndefOr[String] = js.native
  
  // error message, if any
  var error: js.UndefOr[ErrorModel] = js.native
  
  // status, one of ADDED, REPLACED, DELETED, ERROR
  var status: js.UndefOr[ADDED | REPLACED | DELETED | ERROR] = js.native
}
object DocumentStatus {
  
  @scala.inline
  def apply(): DocumentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStatus]
  }
  
  @scala.inline
  implicit class DocumentStatusMutableBuilder[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorModel): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatus(value: ADDED | REPLACED | DELETED | ERROR): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_collection(value: String): Self = StObject.set(x, "_collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_collectionUndefined: Self = StObject.set(x, "_collection", js.undefined)
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
