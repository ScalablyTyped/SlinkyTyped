package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption profile information.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.native
}

object GetFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(): GetFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
  }
  @scala.inline
  implicit class GetFieldLevelEncryptionProfileResultOps[Self <: GetFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
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
    def withFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLevelEncryptionProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldLevelEncryptionProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLevelEncryptionProfile")(js.undefined)
        ret
    }
  }
  
}

