package typingsSlinky.awsSdkClientS3Node.typesS3LocationMod

import typingsSlinky.awsSdkClientS3Node.typesEncryptionMod.UnmarshalledEncryption
import typingsSlinky.awsSdkClientS3Node.typesGrantMod.UnmarshalledGrant
import typingsSlinky.awsSdkClientS3Node.typesMetadataEntryMod.UnmarshalledMetadataEntry
import typingsSlinky.awsSdkClientS3Node.typesTaggingMod.UnmarshalledTagging
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledS3Location extends S3Location {
  /**
    * <p>A list of grants that control access to the staged results.</p>
    */
  @JSName("AccessControlList")
  var AccessControlList_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledGrant]] = js.native
  /**
    * <p>Describes the server-side encryption that will be applied to the restore results.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.native
  /**
    * <p>The tag-set that is applied to the restore results.</p>
    */
  @JSName("Tagging")
  var Tagging_UnmarshalledS3Location: js.UndefOr[UnmarshalledTagging] = js.native
  /**
    * <p>A list of metadata to store with the restore results in S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata_UnmarshalledS3Location: js.UndefOr[js.Array[UnmarshalledMetadataEntry]] = js.native
}

object UnmarshalledS3Location {
  @scala.inline
  def apply(BucketName: String, Prefix: String): UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledS3Location]
  }
  @scala.inline
  implicit class UnmarshalledS3LocationOps[Self <: UnmarshalledS3Location] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: js.Array[UnmarshalledGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessControlList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: UnmarshalledEncryption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withTagging(value: UnmarshalledTagging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tagging")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMetadata(value: js.Array[UnmarshalledMetadataEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserMetadata")(js.undefined)
        ret
    }
  }
  
}

