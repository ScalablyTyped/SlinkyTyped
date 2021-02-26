package typingsSlinky.actionsOnGoogle.apiV1Mod

import typingsSlinky.actionsOnGoogle.anon.TypeChallengeType
import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteResponseCommands extends StObject {
  
  var challengeNeeded: js.UndefOr[TypeChallengeType] = js.native
  
  var debugString: js.UndefOr[String] = js.native
  
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.native
  
  var ids: js.Array[String] = js.native
  
  var states: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var status: SmartHomeV1ExecuteStatus = js.native
}
object SmartHomeV1ExecuteResponseCommands {
  
  @scala.inline
  def apply(ids: js.Array[String], status: SmartHomeV1ExecuteStatus): SmartHomeV1ExecuteResponseCommands = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponseCommands]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteResponseCommandsMutableBuilder[Self <: SmartHomeV1ExecuteResponseCommands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeNeeded(value: TypeChallengeType): Self = StObject.set(x, "challengeNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeNeededUndefined: Self = StObject.set(x, "challengeNeeded", js.undefined)
    
    @scala.inline
    def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    @scala.inline
    def setErrorCode(value: SmartHomeV1ExecuteErrors): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: ApiClientObjectMap[_]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStatus(value: SmartHomeV1ExecuteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
