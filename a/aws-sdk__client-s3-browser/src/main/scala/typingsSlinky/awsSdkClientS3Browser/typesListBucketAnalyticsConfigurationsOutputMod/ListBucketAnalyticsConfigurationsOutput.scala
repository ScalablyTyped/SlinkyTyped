package typingsSlinky.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>The list of analytics configurations for a bucket.</p>
    */
  var AnalyticsConfigurationList: js.UndefOr[js.Array[UnmarshalledAnalyticsConfiguration]] = js.native
  /**
    * <p>The ContinuationToken that represents where this request began.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.native
  /**
    * <p>Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  /**
    * <p>NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.native
}

object ListBucketAnalyticsConfigurationsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsOutputOps[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsConfigurationList(value: js.Array[UnmarshalledAnalyticsConfiguration]): Self = {
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
    def withContinuationToken(value: String): Self = {
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
    def withIsTruncated(value: Boolean): Self = {
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
    def withNextContinuationToken(value: String): Self = {
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

