package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerDefinition extends js.Object {
  /**
    * This parameter is ignored for models that contain only a PrimaryContainer. When a ContainerDefinition is part of an inference pipeline, the value of the parameter uniquely identifies the container for the purposes of logging and metrics. For information, see Use Logs and Metrics to Monitor an Inference Pipeline. If you don't specify a value for this parameter for a ContainerDefinition that is part of an inference pipeline, a unique name is automatically assigned based on the position of the ContainerDefinition in the pipeline. If you specify a value for the ContainerHostName for any ContainerDefinition that is part of an inference pipeline, you must specify a value for the ContainerHostName parameter of every ContainerDefinition in that pipeline.
    */
  var ContainerHostname: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerHostname] = js.native
  /**
    * The environment variables to set in the Docker container. Each key and value in the Environment string to string map can have length of up to 1024. We support up to 16 entries in the map. 
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.native
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker 
    */
  var Image: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.Image] = js.native
  /**
    * Whether the container hosts a single model or multiple models.
    */
  var Mode: js.UndefOr[ContainerMode] = js.native
  /**
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own algorithms. For more information on built-in algorithms, see Common Parameters.  If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  If you use a built-in algorithm to create a model, Amazon SageMaker requires that you provide a S3 path to the model artifacts in ModelDataUrl. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
    */
  var ModelPackageName: js.UndefOr[ArnOrName] = js.native
}

object ContainerDefinition {
  @scala.inline
  def apply(): ContainerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDefinition]
  }
  @scala.inline
  implicit class ContainerDefinitionOps[Self <: ContainerDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerHostname(value: ContainerHostname): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerHostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerHostname")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironment(value: EnvironmentMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Environment")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: ContainerMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mode")(js.undefined)
        ret
    }
    @scala.inline
    def withModelDataUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelDataUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelDataUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelDataUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withModelPackageName(value: ArnOrName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelPackageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModelPackageName")(js.undefined)
        ret
    }
  }
  
}

