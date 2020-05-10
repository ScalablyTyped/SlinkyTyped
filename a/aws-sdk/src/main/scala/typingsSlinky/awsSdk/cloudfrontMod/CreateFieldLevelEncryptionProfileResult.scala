package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Returned when you create a new field-level encryption profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.native
  /**
    * The fully qualified URI of the new profile resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-profile/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(): CreateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileResult]
  }
  @scala.inline
  implicit class CreateFieldLevelEncryptionProfileResultOps[Self <: CreateFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
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

