package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketMetricsConfigurationsOutput extends js.Object {
  /**
    * The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    * The list of metrics configurations for a bucket.
    */
  var MetricsConfigurationList: js.UndefOr[typingsSlinky.awsSdk.s3Mod.MetricsConfigurationList] = js.native
  /**
    * The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}

object ListBucketMetricsConfigurationsOutput {
  @scala.inline
  def apply(): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
  @scala.inline
  implicit class ListBucketMetricsConfigurationsOutputOps[Self <: ListBucketMetricsConfigurationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withIsTruncated(value: IsTruncated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTruncated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTruncated")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricsConfigurationList(value: MetricsConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfigurationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsConfigurationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfigurationList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextContinuationToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextContinuationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextContinuationToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextContinuationToken")(js.undefined)
        ret
    }
  }
  
}

