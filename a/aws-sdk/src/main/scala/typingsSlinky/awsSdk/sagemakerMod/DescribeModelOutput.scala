package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeModelOutput extends StObject {
  
  /**
    * The containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.native
  
  /**
    * A timestamp that shows when the model was created.
    */
  var CreationTime: js.Date = js.native
  
  /**
    * If True, no inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that you specified for the model.
    */
  var ExecutionRoleArn: RoleArn = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typingsSlinky.awsSdk.sagemakerMod.ModelArn = js.native
  
  /**
    * Name of the Amazon SageMaker model.
    */
  var ModelName: typingsSlinky.awsSdk.sagemakerMod.ModelName = js.native
  
  /**
    * The location of the primary inference code, associated artifacts, and custom environment map that the inference code uses when it is deployed in production. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.native
  
  /**
    * A VpcConfig object that specifies the VPC that this model has access to. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud 
    */
  var VpcConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.VpcConfig] = js.native
}
object DescribeModelOutput {
  
  @scala.inline
  def apply(CreationTime: js.Date, ExecutionRoleArn: RoleArn, ModelArn: ModelArn, ModelName: ModelName): DescribeModelOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelOutput]
  }
  
  @scala.inline
  implicit class DescribeModelOutputMutableBuilder[Self <: DescribeModelOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: ContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: ContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value :_*))
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelArn(value: ModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryContainer(value: ContainerDefinition): Self = StObject.set(x, "PrimaryContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryContainerUndefined: Self = StObject.set(x, "PrimaryContainer", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
