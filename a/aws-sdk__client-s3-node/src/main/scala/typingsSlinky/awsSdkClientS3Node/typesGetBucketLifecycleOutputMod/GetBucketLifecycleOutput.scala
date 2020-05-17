package typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod

import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.typesRuleMod.UnmarshalledRule
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLifecycleOutput
  extends MetadataBearer
     with OutputTypesUnion {
  /**
    * _Rules shape
    */
  var Rules: js.UndefOr[js.Array[UnmarshalledRule]] = js.native
}

object GetBucketLifecycleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketLifecycleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleOutput]
  }
  @scala.inline
  implicit class GetBucketLifecycleOutputOps[Self <: GetBucketLifecycleOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[UnmarshalledRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rules")(js.undefined)
        ret
    }
  }
  
}

