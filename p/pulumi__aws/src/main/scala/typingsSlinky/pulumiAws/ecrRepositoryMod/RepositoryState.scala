package typingsSlinky.pulumiAws.ecrRepositoryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ecr.RepositoryImageScanningConfiguration
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryState extends js.Object {
  /**
    * Full ARN of the repository.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block that defines image scanning configuration for the repository. By default, image scanning must be manually triggered. See the [ECR User Guide](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html) for more information about image scanning.
    */
  val imageScanningConfiguration: js.UndefOr[Input[RepositoryImageScanningConfiguration]] = js.native
  /**
    * The tag mutability setting for the repository. Must be one of: `MUTABLE` or `IMMUTABLE`. Defaults to `MUTABLE`.
    */
  val imageTagMutability: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the repository.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The registry ID where the repository was created.
    */
  val registryId: js.UndefOr[Input[String]] = js.native
  /**
    * The URL of the repository (in the form `aws_account_id.dkr.ecr.region.amazonaws.com/repositoryName`).
    */
  val repositoryUrl: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RepositoryState {
  @scala.inline
  def apply(): RepositoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryState]
  }
  @scala.inline
  implicit class RepositoryStateOps[Self <: RepositoryState] (val x: Self) extends AnyVal {
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
    def withImageScanningConfiguration(value: Input[RepositoryImageScanningConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanningConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanningConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanningConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTagMutability(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagMutability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTagMutability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagMutability")(js.undefined)
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
    def withRegistryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryUrl(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUrl")(js.undefined)
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
  }
  
}

