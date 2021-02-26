package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIndexFieldResponse extends StObject {
  
  /**
    * The status of the index field being deleted.
    */
  var IndexField: IndexFieldStatus = js.native
}
object DeleteIndexFieldResponse {
  
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DeleteIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexFieldResponse]
  }
  
  @scala.inline
  implicit class DeleteIndexFieldResponseMutableBuilder[Self <: DeleteIndexFieldResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexField(value: IndexFieldStatus): Self = StObject.set(x, "IndexField", value.asInstanceOf[js.Any])
  }
}
