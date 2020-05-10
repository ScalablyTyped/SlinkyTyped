package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfileConfig extends js.Object {
  /**
    * A unique number that ensures that the request can't be replayed.
    */
  var CallerReference: String = js.native
  /**
    * An optional comment for the field-level encryption profile.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typingsSlinky.awsSdk.cloudfrontMod.EncryptionEntities = js.native
  /**
    * Profile name for the field-level encryption profile.
    */
  var Name: String = js.native
}

object FieldLevelEncryptionProfileConfig {
  @scala.inline
  def apply(CallerReference: String, EncryptionEntities: EncryptionEntities, Name: String): FieldLevelEncryptionProfileConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any], EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileConfig]
  }
  @scala.inline
  implicit class FieldLevelEncryptionProfileConfigOps[Self <: FieldLevelEncryptionProfileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallerReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallerReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionEntities(value: EncryptionEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
  }
  
}

