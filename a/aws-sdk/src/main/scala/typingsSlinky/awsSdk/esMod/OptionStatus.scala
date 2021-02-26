package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionStatus extends StObject {
  
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: js.Date = js.native
  
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState = js.native
  
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: js.Date = js.native
  
  /**
    * Specifies the latest version for the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.native
}
object OptionStatus {
  
  @scala.inline
  def apply(CreationDate: js.Date, State: OptionState, UpdateDate: js.Date): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
  
  @scala.inline
  implicit class OptionStatusMutableBuilder[Self <: OptionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingDeletion(value: Boolean): Self = StObject.set(x, "PendingDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingDeletionUndefined: Self = StObject.set(x, "PendingDeletion", js.undefined)
    
    @scala.inline
    def setState(value: OptionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateVersion(value: UIntValue): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
