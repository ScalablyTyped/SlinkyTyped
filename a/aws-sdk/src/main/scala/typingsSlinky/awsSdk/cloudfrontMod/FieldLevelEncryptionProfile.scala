package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfile extends js.Object {
  /**
    * A complex data type that includes the profile name and the encryption entities for the field-level encryption profile.
    */
  var FieldLevelEncryptionProfileConfig: typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionProfileConfig = js.native
  /**
    * The ID for a field-level encryption profile configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: String = js.native
  /**
    * The last time the field-level encryption profile was updated.
    */
  var LastModifiedTime: js.Date = js.native
}

object FieldLevelEncryptionProfile {
  @scala.inline
  def apply(
    FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
    Id: String,
    LastModifiedTime: js.Date
  ): FieldLevelEncryptionProfile = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfile]
  }
  @scala.inline
  implicit class FieldLevelEncryptionProfileOps[Self <: FieldLevelEncryptionProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldLevelEncryptionProfileConfig(value: FieldLevelEncryptionProfileConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldLevelEncryptionProfileConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

