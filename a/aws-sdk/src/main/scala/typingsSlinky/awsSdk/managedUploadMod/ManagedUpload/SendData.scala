package typingsSlinky.awsSdk.managedUploadMod.ManagedUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendData extends js.Object {
  /**
    * Bucket to which the object was uploaded.
    */
  var Bucket: String = js.native
  /**
    * ETag of the uploaded object.
    */
  var ETag: String = js.native
  /**
    * Key to which the object was uploaded.
    */
  var Key: String = js.native
  /**
    * URL of the uploaded object.
    */
  var Location: String = js.native
}

object SendData {
  @scala.inline
  def apply(Bucket: String, ETag: String, Key: String, Location: String): SendData = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ETag = ETag.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendData]
  }
  @scala.inline
  implicit class SendDataOps[Self <: SendData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withETag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ETag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

