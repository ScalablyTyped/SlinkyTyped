package typingsSlinky.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketMetricsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>Specifies the metrics configuration.</p>
    */
  var MetricsConfiguration: js.UndefOr[UnmarshalledMetricsConfiguration] = js.native
}

object GetBucketMetricsConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketMetricsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketMetricsConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketMetricsConfigurationOutputOps[Self <: GetBucketMetricsConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetricsConfiguration(value: UnmarshalledMetricsConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricsConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MetricsConfiguration")(js.undefined)
        ret
    }
  }
  
}

