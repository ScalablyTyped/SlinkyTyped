package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Returned when you create a new field-level encryption configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryption] = js.native
  /**
    * The fully qualified URI of the new configuration resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(): CreateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigResult]
  }
  @scala.inline
  implicit class CreateFieldLevelEncryptionConfigResultOps[Self <: CreateFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(js.undefined)
        ret
    }
  }
  
}

