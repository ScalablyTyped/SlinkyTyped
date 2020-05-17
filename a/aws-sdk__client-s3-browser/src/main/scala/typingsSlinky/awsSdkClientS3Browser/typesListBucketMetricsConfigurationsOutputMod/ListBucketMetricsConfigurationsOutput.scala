package typingsSlinky.awsSdkClientS3Browser.typesListBucketMetricsConfigurationsOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketMetricsConfigurationsOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * <p>The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.native
  /**
    * <p>Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  /**
    * <p>The list of metrics configurations for a bucket.</p>
    */
  var MetricsConfigurationList: js.UndefOr[js.Array[UnmarshalledMetricsConfiguration]] = js.native
  /**
    * <p>The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.native
}

object ListBucketMetricsConfigurationsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
  @scala.inline
  implicit class ListBucketMetricsConfigurationsOutputOps[Self <: ListBucketMetricsConfigurationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMetricsConfigurationList(value: js.Array[UnmarshalledMetricsConfiguration]): Self = {
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

