package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputConfig extends js.Object {
  /**
    * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example, s3://bucket-name/key-name-prefix.
    */
  var S3OutputLocation: S3Uri = js.native
  /**
    * Identifies the device that you want to run your model on after it has been compiled. For example: ml_c5.
    */
  var TargetDevice: typingsSlinky.awsSdk.sagemakerMod.TargetDevice = js.native
}

object OutputConfig {
  @scala.inline
  def apply(S3OutputLocation: S3Uri, TargetDevice: TargetDevice): OutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputLocation = S3OutputLocation.asInstanceOf[js.Any], TargetDevice = TargetDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputConfig]
  }
  @scala.inline
  implicit class OutputConfigOps[Self <: OutputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3OutputLocation(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDevice(value: TargetDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetDevice")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

