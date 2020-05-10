package typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The configuration and any analyses for the analytics filter.</p>
    */
  var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.native
}

object GetBucketAnalyticsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketAnalyticsConfigurationOutputOps[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyticsConfiguration(value: UnmarshalledAnalyticsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyticsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyticsConfiguration")(js.undefined)
        ret
    }
  }
  
}

