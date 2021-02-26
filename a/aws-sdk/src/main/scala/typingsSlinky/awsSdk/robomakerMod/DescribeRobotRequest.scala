package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRobotRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot to be described.
    */
  var robot: Arn = js.native
}
object DescribeRobotRequest {
  
  @scala.inline
  def apply(robot: Arn): DescribeRobotRequest = {
    val __obj = js.Dynamic.literal(robot = robot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRobotRequest]
  }
  
  @scala.inline
  implicit class DescribeRobotRequestMutableBuilder[Self <: DescribeRobotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRobot(value: Arn): Self = StObject.set(x, "robot", value.asInstanceOf[js.Any])
  }
}
