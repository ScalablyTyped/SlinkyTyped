package typingsSlinky.mapboxS3urls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBucketinhost extends js.Object {
  var `bucket-in-host`: String = js.native
  var `bucket-in-path`: String = js.native
  var s3: String = js.native
}

object AnonBucketinhost {
  @scala.inline
  def apply(`bucket-in-host`: String, `bucket-in-path`: String, s3: String): AnonBucketinhost = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
    __obj.updateDynamic("bucket-in-host")(`bucket-in-host`.asInstanceOf[js.Any])
    __obj.updateDynamic("bucket-in-path")(`bucket-in-path`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucketinhost]
  }
  @scala.inline
  implicit class AnonBucketinhostOps[Self <: AnonBucketinhost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withBucket-in-host`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket-in-host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withBucket-in-path`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket-in-path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

