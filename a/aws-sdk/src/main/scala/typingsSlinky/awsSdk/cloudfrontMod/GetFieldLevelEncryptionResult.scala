package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryption: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.native
}

object GetFieldLevelEncryptionResult {
  @scala.inline
  def apply(): GetFieldLevelEncryptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionResult]
  }
  @scala.inline
  implicit class GetFieldLevelEncryptionResultOps[Self <: GetFieldLevelEncryptionResult] (val x: Self) extends AnyVal {
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

