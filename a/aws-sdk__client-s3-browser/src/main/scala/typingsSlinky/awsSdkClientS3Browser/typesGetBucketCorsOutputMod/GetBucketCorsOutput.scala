package typingsSlinky.awsSdkClientS3Browser.typesGetBucketCorsOutputMod

import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.typesCorsruleMod.UnmarshalledCORSRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.UndefOr[js.Array[UnmarshalledCORSRule]] = js.undefined
}

object GetBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CORSRules: js.Array[UnmarshalledCORSRule] = null): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (CORSRules != null) __obj.updateDynamic("CORSRules")(CORSRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
}

