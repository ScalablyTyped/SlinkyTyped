package typingsSlinky.awsSdkClientGlacierNode.typesS3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientGlacierNode.typesEncryptionMod.UnmarshalledEncryption
import typingsSlinky.awsSdkClientGlacierNode.typesGrantMod.UnmarshalledGrant
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
    * <p>Contains information about the encryption used to store the job results in Amazon S3.</p>
    */
  @JSName("Encryption")
  var Encryption_UnmarshalledS3Location: js.UndefOr[UnmarshalledEncryption] = js.native
  /**
    * <p>The tag-set that is applied to the job results.</p>
    */
  @JSName("Tagging")
  var Tagging_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * <p>A map of metadata to store with the job results in Amazon S3.</p>
    */
  @JSName("UserMetadata")
  var UserMetadata_UnmarshalledS3Location: js.UndefOr[StringDictionary[String]] = js.native
}

object UnmarshalledS3Location {
  @scala.inline
  def apply(): UnmarshalledS3Location = {
    val __obj = js.Dynamic.literal()
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
    def withTagging(value: StringDictionary[String]): Self = {
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
    def withUserMetadata(value: StringDictionary[String]): Self = {
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

