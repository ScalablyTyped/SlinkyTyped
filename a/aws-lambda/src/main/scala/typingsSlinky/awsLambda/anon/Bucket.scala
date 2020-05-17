package typingsSlinky.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  var bucket: Arn = js.native
  var configurationId: String = js.native
  var `object`: ETag = js.native
  var s3SchemaVersion: String = js.native
}

object Bucket {
  @scala.inline
  def apply(bucket: Arn, configurationId: String, `object`: ETag, s3SchemaVersion: String): Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ETag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3SchemaVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3SchemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

