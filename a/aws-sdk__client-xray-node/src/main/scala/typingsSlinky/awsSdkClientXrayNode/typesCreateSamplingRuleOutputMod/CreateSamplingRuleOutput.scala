package typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleOutputMod

import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSamplingRuleOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The saved rule definition and metadata.</p>
    */
  var SamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRuleRecord] = js.native
}

object CreateSamplingRuleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): CreateSamplingRuleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSamplingRuleOutput]
  }
  @scala.inline
  implicit class CreateSamplingRuleOutputOps[Self <: CreateSamplingRuleOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$metadata(value: ResponseMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSamplingRuleRecord(value: UnmarshalledSamplingRuleRecord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingRuleRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SamplingRuleRecord")(js.undefined)
        ret
    }
  }
  
}

