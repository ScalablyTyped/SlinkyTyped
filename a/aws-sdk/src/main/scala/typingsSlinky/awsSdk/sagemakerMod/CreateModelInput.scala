package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelInput extends StObject {
  
  /**
    * Specifies the containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.native
  
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker can assume to access model artifacts and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute instances is part of model hosting. For more information, see Amazon SageMaker Roles.   To be able to pass this role to Amazon SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var ExecutionRoleArn: RoleArn = js.native
  
  /**
    * The name of the new model.
    */
  var ModelName: typingsSlinky.awsSdk.sagemakerMod.ModelName = js.native
  
  /**
    * The location of the primary docker image containing inference code, associated artifacts, and custom environment map that the inference code uses when the model is deployed for predictions. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.native
  
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A VpcConfig object that specifies the VPC that you want your model to connect to. Control access to and from your model container by configuring the VPC. VpcConfig is used in hosting services and in batch transform. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud and Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.VpcConfig] = js.native
}
object CreateModelInput {
  
  @scala.inline
  def apply(ExecutionRoleArn: RoleArn, ModelName: ModelName): CreateModelInput = {
    val __obj = js.Dynamic.literal(ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelInput]
  }
  
  @scala.inline
  implicit class CreateModelInputMutableBuilder[Self <: CreateModelInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: ContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: ContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value :_*))
    
    @scala.inline
    def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryContainer(value: ContainerDefinition): Self = StObject.set(x, "PrimaryContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryContainerUndefined: Self = StObject.set(x, "PrimaryContainer", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
