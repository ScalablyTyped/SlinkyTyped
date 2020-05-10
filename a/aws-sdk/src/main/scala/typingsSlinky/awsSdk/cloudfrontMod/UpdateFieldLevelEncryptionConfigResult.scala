package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The value of the ETag header that you received when updating the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the results of updating the configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.native
}

object UpdateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(): UpdateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
  }
  @scala.inline
  implicit class UpdateFieldLevelEncryptionConfigResultOps[Self <: UpdateFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutETag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldLevelEncryption(value: FieldLevelEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLevelEncryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldLevelEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLevelEncryption")(js.undefined)
        ret
    }
  }
  
}

