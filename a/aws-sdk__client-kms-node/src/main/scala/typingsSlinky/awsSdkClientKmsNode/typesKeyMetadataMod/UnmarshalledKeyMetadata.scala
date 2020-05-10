package typingsSlinky.awsSdkClientKmsNode.typesKeyMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledKeyMetadata extends KeyMetadata {
  /**
    * <p>The date and time when the CMK was created.</p>
    */
  @JSName("CreationDate")
  var CreationDate_UnmarshalledKeyMetadata: js.UndefOr[js.Date] = js.native
  /**
    * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
    */
  @JSName("DeletionDate")
  var DeletionDate_UnmarshalledKeyMetadata: js.UndefOr[js.Date] = js.native
  /**
    * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
    */
  @JSName("ValidTo")
  var ValidTo_UnmarshalledKeyMetadata: js.UndefOr[js.Date] = js.native
}

object UnmarshalledKeyMetadata {
  @scala.inline
  def apply(KeyId: String): UnmarshalledKeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledKeyMetadata]
  }
  @scala.inline
  implicit class UnmarshalledKeyMetadataOps[Self <: UnmarshalledKeyMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletionDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeletionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidTo(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValidTo")(js.undefined)
        ret
    }
  }
  
}

