package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information to identify a particular user uniquely.
  */
@js.native
trait SchemaUser extends js.Object {
  
  /**
    * Type of the user in the request. The field `userId` is associated with
    * this type.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Unique Id of the user for which the data is being requested.
    */
  var userId: js.UndefOr[String] = js.native
}
object SchemaUser {
  
  @scala.inline
  def apply(): SchemaUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUser]
  }
  
  @scala.inline
  implicit class SchemaUserOps[Self <: SchemaUser] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
