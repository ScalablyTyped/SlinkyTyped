package typingsSlinky.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends js.Object {
  
  /**
    * The date indicating when the group was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The email of the group.
    */
  var Email: js.UndefOr[EmailAddress] = js.native
  
  /**
    * The date indicating when the group was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The identifier of the group.
    */
  var Id: js.UndefOr[WorkMailIdentifier] = js.native
  
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupName] = js.native
  
  /**
    * The state of the group, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
}
object Group {
  
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
    
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
    def setDisabledDate(value: js.Date): Self = this.set("DisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDate: Self = this.set("DisabledDate", js.undefined)
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setEnabledDate(value: js.Date): Self = this.set("EnabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDate: Self = this.set("EnabledDate", js.undefined)
    
    @scala.inline
    def setId(value: WorkMailIdentifier): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: GroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setState(value: EntityState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
