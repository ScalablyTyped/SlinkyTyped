package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * Request to update a field-level encryption configuration. 
    */
  var FieldLevelEncryptionConfig: typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig = js.native
  /**
    * The ID of the configuration you want to update.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object UpdateFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig, Id: String): UpdateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
  }
  @scala.inline
  implicit class UpdateFieldLevelEncryptionConfigRequestOps[Self <: UpdateFieldLevelEncryptionConfigRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIfMatch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IfMatch")(js.undefined)
        ret
    }
  }
  
}

