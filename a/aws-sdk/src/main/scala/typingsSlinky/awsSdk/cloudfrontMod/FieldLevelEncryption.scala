package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryption extends js.Object {
  /**
    * A complex data type that includes the profile configurations specified for field-level encryption. 
    */
  var FieldLevelEncryptionConfig: typingsSlinky.awsSdk.cloudfrontMod.FieldLevelEncryptionConfig = js.native
  /**
    * The configuration ID for a field-level encryption configuration which includes a set of profiles that specify certain selected data fields to be encrypted by specific public keys.
    */
  var Id: String = js.native
  /**
    * The last time the field-level encryption configuration was changed. 
    */
  var LastModifiedTime: js.Date = js.native
}

object FieldLevelEncryption {
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig, Id: String, LastModifiedTime: js.Date): FieldLevelEncryption = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryption]
  }
  @scala.inline
  implicit class FieldLevelEncryptionOps[Self <: FieldLevelEncryption] (val x: Self) extends AnyVal {
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
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

