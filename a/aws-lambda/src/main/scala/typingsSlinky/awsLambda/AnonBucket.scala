package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBucket extends js.Object {
  var bucket: AnonArn = js.native
  var configurationId: String = js.native
  var `object`: AnonETag = js.native
  var s3SchemaVersion: String = js.native
}

object AnonBucket {
  @scala.inline
  def apply(bucket: AnonArn, configurationId: String, `object`: AnonETag, s3SchemaVersion: String): AnonBucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucket]
  }
  @scala.inline
  implicit class AnonBucketOps[Self <: AnonBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: AnonArn): Self = {
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
    def withObject(value: AnonETag): Self = {
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

