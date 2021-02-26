package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteObjectsOutput extends StObject {
  
  /**
    * Container element for a successful delete. It identifies the object that was successfully deleted.
    */
  var Deleted: js.UndefOr[DeletedObjects] = js.native
  
  /**
    * Container for a failed delete operation that describes the object that Amazon S3 attempted to delete and the error it encountered.
    */
  var Errors: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Errors] = js.native
  
  var RequestCharged: js.UndefOr[typingsSlinky.awsSdk.s3Mod.RequestCharged] = js.native
}
object DeleteObjectsOutput {
  
  @scala.inline
  def apply(): DeleteObjectsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteObjectsOutput]
  }
  
  @scala.inline
  implicit class DeleteObjectsOutputMutableBuilder[Self <: DeleteObjectsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: DeletedObjects): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "Deleted", js.undefined)
    
    @scala.inline
    def setDeletedVarargs(value: DeletedObject*): Self = StObject.set(x, "Deleted", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
