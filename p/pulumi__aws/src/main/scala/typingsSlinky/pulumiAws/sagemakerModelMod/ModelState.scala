package typingsSlinky.pulumiAws.sagemakerModelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.sagemaker.ModelContainer
import typingsSlinky.pulumiAws.inputMod.sagemaker.ModelPrimaryContainer
import typingsSlinky.pulumiAws.inputMod.sagemaker.ModelVpcConfig
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this model.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
    */
  val containers: js.UndefOr[Input[js.Array[Input[ModelContainer]]]] = js.native
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  val enableNetworkIsolation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A role that SageMaker can assume to access model artifacts and docker images for deployment.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
    */
  val primaryContainer: js.UndefOr[Input[ModelPrimaryContainer]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
    */
  val vpcConfig: js.UndefOr[Input[ModelVpcConfig]] = js.native
}

object ModelState {
  @scala.inline
  def apply(): ModelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelState]
  }
  @scala.inline
  implicit class ModelStateOps[Self <: ModelState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withContainers(value: Input[js.Array[Input[ModelContainer]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableNetworkIsolation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetworkIsolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableNetworkIsolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNetworkIsolation")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionRoleArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryContainer(value: Input[ModelPrimaryContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcConfig(value: Input[ModelVpcConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcConfig")(js.undefined)
        ret
    }
  }
  
}

