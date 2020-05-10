package typingsSlinky.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectResponse extends js.Object {
  /**
    * The SHA256 digest of the object that is persisted.
    */
  var ContentSHA256: js.UndefOr[SHA256Hash] = js.native
  /**
    * Unique identifier of the object in the container.
    */
  var ETag: js.UndefOr[typingsSlinky.awsSdk.mediastoredataMod.ETag] = js.native
  /**
    * The storage class where the object was persisted. The class should be “Temporal”.
    */
  var StorageClass: js.UndefOr[typingsSlinky.awsSdk.mediastoredataMod.StorageClass] = js.native
}

object PutObjectResponse {
  @scala.inline
  def apply(): PutObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectResponse]
  }
  @scala.inline
  implicit class PutObjectResponseOps[Self <: PutObjectResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentSHA256(value: SHA256Hash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentSHA256")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentSHA256: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentSHA256")(js.undefined)
        ret
    }
    @scala.inline
    def withETag(value: ETag): Self = {
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
    def withStorageClass(value: StorageClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StorageClass")(js.undefined)
        ret
    }
  }
  
}

