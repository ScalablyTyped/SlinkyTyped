package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupIdentity extends StObject {
  
  /**
    * The AWS SSO ID of the group.
    */
  var id: IdentityId = js.native
}
object GroupIdentity {
  
  @scala.inline
  def apply(id: IdentityId): GroupIdentity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdentity]
  }
  
  @scala.inline
  implicit class GroupIdentityMutableBuilder[Self <: GroupIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
