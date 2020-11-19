package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountStatusStatistics extends js.Object {
  
  /**
    * Number of active offers.
    */
  var active: js.UndefOr[String] = js.native
  
  /**
    * Number of disapproved offers.
    */
  var disapproved: js.UndefOr[String] = js.native
  
  /**
    * Number of expiring offers.
    */
  var expiring: js.UndefOr[String] = js.native
  
  /**
    * Number of pending offers.
    */
  var pending: js.UndefOr[String] = js.native
}
object SchemaAccountStatusStatistics {
  
  @scala.inline
  def apply(): SchemaAccountStatusStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusStatistics]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusStatisticsOps[Self <: SchemaAccountStatusStatistics] (val x: Self) extends AnyVal {
    
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setDisapproved(value: String): Self = this.set("disapproved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisapproved: Self = this.set("disapproved", js.undefined)
    
    @scala.inline
    def setExpiring(value: String): Self = this.set("expiring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiring: Self = this.set("expiring", js.undefined)
    
    @scala.inline
    def setPending(value: String): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
}
