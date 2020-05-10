package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageContainerDefinition extends js.Object {
  /**
    * The DNS host name for the Docker container.
    */
  var ContainerHostname: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerHostname] = js.native
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var Image: typingsSlinky.awsSdk.sagemakerMod.Image = js.native
  /**
    * An MD5 hash of the training algorithm that identifies the Docker image used for training.
    */
  var ImageDigest: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ImageDigest] = js.native
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
  /**
    * The AWS Marketplace product ID of the model package.
    */
  var ProductId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ProductId] = js.native
}

object ModelPackageContainerDefinition {
  @scala.inline
  def apply(Image: Image): ModelPackageContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageContainerDefinition]
  }
  @scala.inline
  implicit class ModelPackageContainerDefinitionOps[Self <: ModelPackageContainerDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withImageDigest(value: ImageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageDigest")(js.undefined)
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
    def withProductId(value: ProductId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductId")(js.undefined)
        ret
    }
  }
  
}

