package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionStatus extends js.Object {
  
  /**
    * A timestamp for when this option was created.
    */
  var CreationDate: js.Date = js.native
  
  /**
    * Indicates that the option will be deleted once processing is complete.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  
  /**
    * The state of processing a change to an option. Possible values: RequiresIndexDocuments: the option's latest value will not be deployed until IndexDocuments has been called and indexing is complete. Processing: the option's latest value is in the process of being activated.  Active: the option's latest value is completely deployed. FailedToValidate: the option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents. 
    */
  var State: OptionState = js.native
  
  /**
    * A timestamp for when this option was last updated.
    */
  var UpdateDate: js.Date = js.native
  
  /**
    * A unique integer that indicates when this option was last updated.
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
  implicit class OptionStatusOps[Self <: OptionStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationDate(value: js.Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: OptionState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDate(value: js.Date): Self = this.set("UpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingDeletion(value: Boolean): Self = this.set("PendingDeletion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingDeletion: Self = this.set("PendingDeletion", js.undefined)
    
    @scala.inline
    def setUpdateVersion(value: UIntValue): Self = this.set("UpdateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateVersion: Self = this.set("UpdateVersion", js.undefined)
  }
}
