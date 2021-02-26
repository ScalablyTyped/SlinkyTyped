package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameServerInstancesInput extends StObject {
  
  /**
    * A unique identifier for the game server group. Use either the GameServerGroup name or ARN value.
    */
  var GameServerGroupName: GameServerGroupNameOrArn = js.native
  
  /**
    * The EC2 instance IDs that you want to retrieve status on. EC2 instance IDs use a 17-character format, for example: i-1234567890abcdef0. To retrieve all instances in the game server group, leave this parameter empty. 
    */
  var InstanceIds: js.UndefOr[GameServerInstanceIds] = js.native
  
  /**
    *  The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential segments. 
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  
  /**
    *  A token that indicates the start of the next sequential segment of results. Use the token returned with the previous call to this operation. To start at the beginning of the result set, do not specify a value. 
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameServerInstancesInput {
  
  @scala.inline
  def apply(GameServerGroupName: GameServerGroupNameOrArn): DescribeGameServerInstancesInput = {
    val __obj = js.Dynamic.literal(GameServerGroupName = GameServerGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameServerInstancesInput]
  }
  
  @scala.inline
  implicit class DescribeGameServerInstancesInputMutableBuilder[Self <: DescribeGameServerInstancesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerGroupName(value: GameServerGroupNameOrArn): Self = StObject.set(x, "GameServerGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIds(value: GameServerInstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: GameServerInstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: PositiveInteger): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
