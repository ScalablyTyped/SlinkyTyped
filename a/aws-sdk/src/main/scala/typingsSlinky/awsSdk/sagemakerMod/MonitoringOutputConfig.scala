package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringOutputConfig extends js.Object {
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * Monitoring outputs for monitoring jobs. This is where the output of the periodic monitoring jobs is uploaded.
    */
  var MonitoringOutputs: typingsSlinky.awsSdk.sagemakerMod.MonitoringOutputs = js.native
}

object MonitoringOutputConfig {
  @scala.inline
  def apply(MonitoringOutputs: MonitoringOutputs): MonitoringOutputConfig = {
    val __obj = js.Dynamic.literal(MonitoringOutputs = MonitoringOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutputConfig]
  }
  @scala.inline
  implicit class MonitoringOutputConfigOps[Self <: MonitoringOutputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMonitoringOutputs(value: MonitoringOutputs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonitoringOutputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
  }
  
}

