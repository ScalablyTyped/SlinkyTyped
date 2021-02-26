package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserGroupMessage extends StObject {
  
  /**
    * Must be Redis. 
    */
  var Engine: EngineType = js.native
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: String = js.native
  
  /**
    * The list of user IDs that belong to the user group.
    */
  var UserIds: js.UndefOr[UserIdListInput] = js.native
}
object CreateUserGroupMessage {
  
  @scala.inline
  def apply(Engine: EngineType, UserGroupId: String): CreateUserGroupMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any], UserGroupId = UserGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserGroupMessage]
  }
  
  @scala.inline
  implicit class CreateUserGroupMessageMutableBuilder[Self <: CreateUserGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIds(value: UserIdListInput): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: UserId*): Self = StObject.set(x, "UserIds", js.Array(value :_*))
  }
}
