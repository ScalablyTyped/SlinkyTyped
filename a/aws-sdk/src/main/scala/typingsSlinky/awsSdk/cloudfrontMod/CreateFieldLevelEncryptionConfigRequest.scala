package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * The request to create a new field-level encryption configuration.
    */
  var FieldLevelEncryptionConfig: typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig = js.native
}

object CreateFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig): CreateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigRequest]
  }
  @scala.inline
  implicit class CreateFieldLevelEncryptionConfigRequestOps[Self <: CreateFieldLevelEncryptionConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLevelEncryptionConfig")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

