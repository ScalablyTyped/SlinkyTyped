package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleKeyDeletionResponse extends StObject {
  
  /**
    * The date and time after which AWS KMS deletes the customer master key (CMK).
    */
  var DeletionDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}
object ScheduleKeyDeletionResponse {
  
  @scala.inline
  def apply(): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
  
  @scala.inline
  implicit class ScheduleKeyDeletionResponseMutableBuilder[Self <: ScheduleKeyDeletionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
  }
}
