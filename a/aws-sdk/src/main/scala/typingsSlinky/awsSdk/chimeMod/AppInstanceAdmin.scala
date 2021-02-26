package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceAdmin extends StObject {
  
  /**
    * The name and metadata of the app instance administrator.
    */
  var Admin: js.UndefOr[Identity] = js.native
  
  /**
    * The ARN of the app instance administrator.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The time at which an administrator was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.native
}
object AppInstanceAdmin {
  
  @scala.inline
  def apply(): AppInstanceAdmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceAdmin]
  }
  
  @scala.inline
  implicit class AppInstanceAdminMutableBuilder[Self <: AppInstanceAdmin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Identity): Self = StObject.set(x, "Admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUndefined: Self = StObject.set(x, "Admin", js.undefined)
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
  }
}
