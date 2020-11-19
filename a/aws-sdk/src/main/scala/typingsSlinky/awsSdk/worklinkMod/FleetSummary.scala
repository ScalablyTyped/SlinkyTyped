package typingsSlinky.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetSummary extends js.Object {
  
  /**
    * The identifier used by users to sign into the Amazon WorkLink app.
    */
  var CompanyCode: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.CompanyCode] = js.native
  
  /**
    * The time when the fleet was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the fleet to display.
    */
  var DisplayName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.FleetArn] = js.native
  
  /**
    * The name of the fleet.
    */
  var FleetName: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.FleetName] = js.native
  
  /**
    * The status of the fleet.
    */
  var FleetStatus: js.UndefOr[typingsSlinky.awsSdk.worklinkMod.FleetStatus] = js.native
  
  /**
    * The time when the fleet was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The tags attached to the resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object FleetSummary {
  
  @scala.inline
  def apply(): FleetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetSummary]
  }
  
  @scala.inline
  implicit class FleetSummaryOps[Self <: FleetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompanyCode(value: CompanyCode): Self = this.set("CompanyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyCode: Self = this.set("CompanyCode", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: js.Date): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("CreatedTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = this.set("FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetArn: Self = this.set("FleetArn", js.undefined)
    
    @scala.inline
    def setFleetName(value: FleetName): Self = this.set("FleetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetName: Self = this.set("FleetName", js.undefined)
    
    @scala.inline
    def setFleetStatus(value: FleetStatus): Self = this.set("FleetStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetStatus: Self = this.set("FleetStatus", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: js.Date): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
