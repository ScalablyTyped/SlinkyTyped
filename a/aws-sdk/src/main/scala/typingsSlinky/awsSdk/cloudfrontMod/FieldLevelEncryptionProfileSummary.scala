package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionProfileSummary extends js.Object {
  /**
    * An optional comment for the field-level encryption profile summary.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    * A complex data type of encryption entities for the field-level encryption profile that include the public key ID, provider, and field patterns for specifying which fields to encrypt with this key.
    */
  var EncryptionEntities: typingsSlinky.awsSdk.cloudfrontMod.EncryptionEntities = js.native
  /**
    * ID for the field-level encryption profile summary.
    */
  var Id: String = js.native
  /**
    * The time when the the field-level encryption profile summary was last updated.
    */
  var LastModifiedTime: js.Date = js.native
  /**
    * Name for the field-level encryption profile summary.
    */
  var Name: String = js.native
}

object FieldLevelEncryptionProfileSummary {
  @scala.inline
  def apply(EncryptionEntities: EncryptionEntities, Id: String, LastModifiedTime: js.Date, Name: String): FieldLevelEncryptionProfileSummary = {
    val __obj = js.Dynamic.literal(EncryptionEntities = EncryptionEntities.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionProfileSummary]
  }
  @scala.inline
  implicit class FieldLevelEncryptionProfileSummaryOps[Self <: FieldLevelEncryptionProfileSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncryptionEntities(value: EncryptionEntities): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionEntities")(value.asInstanceOf[js.Any])
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

