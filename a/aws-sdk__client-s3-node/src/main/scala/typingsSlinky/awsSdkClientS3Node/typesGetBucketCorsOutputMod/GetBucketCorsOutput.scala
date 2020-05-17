package typingsSlinky.awsSdkClientS3Node.typesGetBucketCorsOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketCorsOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _CORSRules shape
    */
  var CORSRules: js.UndefOr[js.Array[UnmarshalledCORSRule]] = js.native
}

object GetBucketCorsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
  @scala.inline
  implicit class GetBucketCorsOutputOps[Self <: GetBucketCorsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CORSRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCORSRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CORSRules")(js.undefined)
        ret
    }
  }
  
}

