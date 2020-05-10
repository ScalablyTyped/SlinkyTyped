package typingsSlinky.pulumiAws.resourceDataSyncMod

import typingsSlinky.pulumiAws.inputMod.ssm.ResourceDataSyncS3Destination
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncArgs extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: Input[ResourceDataSyncS3Destination] = js.native
}

object ResourceDataSyncArgs {
  @scala.inline
  def apply(s3Destination: Input[ResourceDataSyncS3Destination]): ResourceDataSyncArgs = {
    val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncArgs]
  }
  @scala.inline
  implicit class ResourceDataSyncArgsOps[Self <: ResourceDataSyncArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Destination(value: Input[ResourceDataSyncS3Destination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3Destination")(value.asInstanceOf[js.Any])
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
  }
  
}

