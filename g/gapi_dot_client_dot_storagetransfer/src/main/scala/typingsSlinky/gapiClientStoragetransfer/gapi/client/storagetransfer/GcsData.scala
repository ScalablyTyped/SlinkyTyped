package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcsData extends js.Object {
  /**
    * Google Cloud Storage bucket name (see
    * [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}

object GcsData {
  @scala.inline
  def apply(): GcsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsData]
  }
  @scala.inline
  implicit class GcsDataOps[Self <: GcsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketName")(js.undefined)
        ret
    }
  }
  
}

