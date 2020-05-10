package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
  /**
    * The name of the bucket from which analytics configurations are retrieved.
    */
  var Bucket: BucketName = js.native
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
}

object ListBucketAnalyticsConfigurationsRequest {
  @scala.inline
  def apply(Bucket: BucketName): ListBucketAnalyticsConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
  }
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsRequestOps[Self <: ListBucketAnalyticsConfigurationsRequest] (val x: Self) extends AnyVal {
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
    def withContinuationToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContinuationToken")(js.undefined)
        ret
    }
  }
  
}

