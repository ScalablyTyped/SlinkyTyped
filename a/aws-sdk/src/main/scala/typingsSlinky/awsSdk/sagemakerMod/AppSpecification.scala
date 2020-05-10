package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppSpecification extends js.Object {
  /**
    * The arguments for a container used to run a processing job.
    */
  var ContainerArguments: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerArguments] = js.native
  /**
    * The entrypoint for a container used to run a processing job.
    */
  var ContainerEntrypoint: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContainerEntrypoint] = js.native
  /**
    * The container image to be run by the processing job.
    */
  var ImageUri: typingsSlinky.awsSdk.sagemakerMod.ImageUri = js.native
}

object AppSpecification {
  @scala.inline
  def apply(ImageUri: ImageUri): AppSpecification = {
    val __obj = js.Dynamic.literal(ImageUri = ImageUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSpecification]
  }
  @scala.inline
  implicit class AppSpecificationOps[Self <: AppSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUri(value: ImageUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImageUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainerArguments(value: ContainerArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerArguments")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerEntrypoint(value: ContainerEntrypoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerEntrypoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerEntrypoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainerEntrypoint")(js.undefined)
        ret
    }
  }
  
}

