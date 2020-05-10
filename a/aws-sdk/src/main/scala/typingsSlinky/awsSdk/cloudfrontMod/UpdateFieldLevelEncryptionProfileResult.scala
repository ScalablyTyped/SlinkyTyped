package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The result of the field-level encryption profile request. 
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the results of updating the profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionProfile] = js.native
}

object UpdateFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(): UpdateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
  }
  @scala.inline
  implicit class UpdateFieldLevelEncryptionProfileResultOps[Self <: UpdateFieldLevelEncryptionProfileResult] (val x: Self) extends AnyVal {
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

