package typingsSlinky.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteQualificationTypeRequest extends StObject {
  
  /**
    * The ID of the QualificationType to dispose.
    */
  var QualificationTypeId: EntityId = js.native
}
object DeleteQualificationTypeRequest {
  
  @scala.inline
  def apply(QualificationTypeId: EntityId): DeleteQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQualificationTypeRequest]
  }
  
  @scala.inline
  implicit class DeleteQualificationTypeRequestMutableBuilder[Self <: DeleteQualificationTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
  }
}
