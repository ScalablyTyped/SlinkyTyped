package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
  /**
    * The list of analytics configurations for a bucket.
    */
  var AnalyticsConfigurationList: js.UndefOr[typingsSlinky.awsSdk.s3Mod.AnalyticsConfigurationList] = js.native
  /**
    * The marker that is used as a starting point for this analytics configuration list response. This value is present if it was sent in the request.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typingsSlinky.awsSdk.s3Mod.IsTruncated] = js.native
  /**
    *  NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}

object ListBucketAnalyticsConfigurationsOutput {
  @scala.inline
  def apply(): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsOutputOps[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsConfigurationList(value: AnalyticsConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsConfigurationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsConfigurationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsConfigurationList")(js.undefined)
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

