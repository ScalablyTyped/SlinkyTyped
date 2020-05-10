package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelOutput extends js.Object {
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
  implicit class DescribeModelOutputOps[Self <: DescribeModelOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelArn(value: ModelArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelName(value: ModelName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainers(value: ContainerDefinitionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Containers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetworkIsolation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableNetworkIsolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetworkIsolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableNetworkIsolation")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryContainer(value: ContainerDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: VpcConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcConfig")(js.undefined)
        ret
    }
  }
  
}

