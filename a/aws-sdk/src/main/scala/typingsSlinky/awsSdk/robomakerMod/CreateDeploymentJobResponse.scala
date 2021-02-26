package typingsSlinky.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The deployment application configuration.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.native
  
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.native
  
  /**
    * The failure code of the simulation job if it failed:  BadPermissionError  AWS Greengrass requires a service-level role permission to access other services. The role must include the  AWSGreengrassResourceAccessRolePolicy managed policy.   ExtractingBundleFailure  The robot application could not be extracted from the bundle.  FailureThresholdBreached  The percentage of robots that could not be updated exceeded the percentage set for the deployment.  GreengrassDeploymentFailed  The robot application could not be deployed to the robot.  GreengrassGroupVersionDoesNotExist  The AWS Greengrass group or version associated with a robot is missing.  InternalServerError  An internal error has occurred. Retry your request, but if the problem persists, contact us with details.  MissingRobotApplicationArchitecture  The robot application does not have a source that matches the architecture of the robot.  MissingRobotDeploymentResource  One or more of the resources specified for the robot application are missing. For example, does the robot application have the correct launch package and launch file?  PostLaunchFileFailure  The post-launch script failed.  PreLaunchFileFailure  The pre-launch script failed.  ResourceNotFound  One or more deployment resources are missing. For example, do robot application source bundles still exist?   RobotDeploymentNoResponse  There is no response from the robot. It might not be powered on or connected to the internet.  
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  
  /**
    * The failure reason of the deployment job if it failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  
  /**
    * The target fleet for the deployment job.
    */
  var fleet: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the deployment job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.native
  
  /**
    * The list of all tags added to the deployment job.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object CreateDeploymentJobResponse {
  
  @scala.inline
  def apply(): CreateDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentJobResponse]
  }
  
  @scala.inline
  implicit class CreateDeploymentJobResponseMutableBuilder[Self <: CreateDeploymentJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDeploymentApplicationConfigs(value: DeploymentApplicationConfigs): Self = StObject.set(x, "deploymentApplicationConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentApplicationConfigsUndefined: Self = StObject.set(x, "deploymentApplicationConfigs", js.undefined)
    
    @scala.inline
    def setDeploymentApplicationConfigsVarargs(value: DeploymentApplicationConfig*): Self = StObject.set(x, "deploymentApplicationConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDeploymentConfig(value: DeploymentConfig): Self = StObject.set(x, "deploymentConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigUndefined: Self = StObject.set(x, "deploymentConfig", js.undefined)
    
    @scala.inline
    def setFailureCode(value: DeploymentJobErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
