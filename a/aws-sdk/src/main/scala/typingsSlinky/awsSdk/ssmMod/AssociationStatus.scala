package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociationStatus extends StObject {
  
  /**
    * A user-defined string.
    */
  var AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.native
  
  /**
    * The date when the status changed.
    */
  var Date: js.Date = js.native
  
  /**
    * The reason for the status.
    */
  var Message: StatusMessage = js.native
  
  /**
    * The status.
    */
  var Name: AssociationStatusName = js.native
}
object AssociationStatus {
  
  @scala.inline
  def apply(Date: js.Date, Message: StatusMessage, Name: AssociationStatusName): AssociationStatus = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationStatus]
  }
  
  @scala.inline
  implicit class AssociationStatusMutableBuilder[Self <: AssociationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalInfo(value: StatusAdditionalInfo): Self = StObject.set(x, "AdditionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInfoUndefined: Self = StObject.set(x, "AdditionalInfo", js.undefined)
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: StatusMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AssociationStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
