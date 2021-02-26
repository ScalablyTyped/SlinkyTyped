package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupNameAndArn extends StObject {
  
  /**
    * The group ARN.
    */
  var groupArn: js.UndefOr[ThingGroupArn] = js.native
  
  /**
    * The group name.
    */
  var groupName: js.UndefOr[ThingGroupName] = js.native
}
object GroupNameAndArn {
  
  @scala.inline
  def apply(): GroupNameAndArn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupNameAndArn]
  }
  
  @scala.inline
  implicit class GroupNameAndArnMutableBuilder[Self <: GroupNameAndArn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupArn(value: ThingGroupArn): Self = StObject.set(x, "groupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupArnUndefined: Self = StObject.set(x, "groupArn", js.undefined)
    
    @scala.inline
    def setGroupName(value: ThingGroupName): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
  }
}
