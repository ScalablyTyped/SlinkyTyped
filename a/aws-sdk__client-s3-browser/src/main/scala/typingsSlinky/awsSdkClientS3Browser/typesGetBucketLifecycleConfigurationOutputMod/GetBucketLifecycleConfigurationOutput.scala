package typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketLifecycleConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.UndefOr[js.Array[UnmarshalledLifecycleRule]] = js.undefined
}

object GetBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Rules: js.Array[UnmarshalledLifecycleRule] = null): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Rules != null) __obj.updateDynamic("Rules")(Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
}

