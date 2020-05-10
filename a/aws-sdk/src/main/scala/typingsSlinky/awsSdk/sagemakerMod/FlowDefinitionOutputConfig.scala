package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowDefinitionOutputConfig extends js.Object {
  /**
    * The Amazon Key Management Service (KMS) key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
  /**
    * The Amazon S3 path where the object containing human output will be made available.
    */
  var S3OutputPath: S3Uri = js.native
}

object FlowDefinitionOutputConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri): FlowDefinitionOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionOutputConfig]
  }
  @scala.inline
  implicit class FlowDefinitionOutputConfigOps[Self <: FlowDefinitionOutputConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3OutputPath(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3OutputPath")(value.asInstanceOf[js.Any])
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

