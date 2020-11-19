package typingsSlinky.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFleetResponse extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the last deployment job.
    */
  var lastDeploymentJob: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the last deployment.
    */
  var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.native
  
  /**
    * The time of the last deployment.
    */
  var lastDeploymentTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the fleet.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * A list of robots.
    */
  var robots: js.UndefOr[Robots] = js.native
  
  /**
    * The list of all tags added to the specified fleet.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object DescribeFleetResponse {
  
  @scala.inline
  def apply(): DescribeFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetResponse]
  }
  
  @scala.inline
  implicit class DescribeFleetResponseOps[Self <: DescribeFleetResponse] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setLastDeploymentJob(value: Arn): Self = this.set("lastDeploymentJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentJob: Self = this.set("lastDeploymentJob", js.undefined)
    
    @scala.inline
    def setLastDeploymentStatus(value: DeploymentStatus): Self = this.set("lastDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentStatus: Self = this.set("lastDeploymentStatus", js.undefined)
    
    @scala.inline
    def setLastDeploymentTime(value: js.Date): Self = this.set("lastDeploymentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDeploymentTime: Self = this.set("lastDeploymentTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRobotsVarargs(value: Robot*): Self = this.set("robots", js.Array(value :_*))
    
    @scala.inline
    def setRobots(value: Robots): Self = this.set("robots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRobots: Self = this.set("robots", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
