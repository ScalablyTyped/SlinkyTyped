package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupIdentifier extends StObject {
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The name of the security group.
    */
  var GroupName: js.UndefOr[String] = js.native
}
object SecurityGroupIdentifier {
  
  @scala.inline
  def apply(): SecurityGroupIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupIdentifier]
  }
  
  @scala.inline
  implicit class SecurityGroupIdentifierMutableBuilder[Self <: SecurityGroupIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
