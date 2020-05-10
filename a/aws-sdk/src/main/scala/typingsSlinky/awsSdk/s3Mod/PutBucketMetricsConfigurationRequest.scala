package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketMetricsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket for which the metrics configuration is set.
    */
  var Bucket: BucketName = js.native
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId = js.native
  /**
    * Specifies the metrics configuration.
    */
  var MetricsConfiguration: typingsSlinky.awsSdk.s3Mod.MetricsConfiguration = js.native
}

object PutBucketMetricsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId, MetricsConfiguration: MetricsConfiguration): PutBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketMetricsConfigurationRequest]
  }
  @scala.inline
  implicit class PutBucketMetricsConfigurationRequestOps[Self <: PutBucketMetricsConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: BucketName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: MetricsId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricsConfiguration(value: MetricsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

