package typingsSlinky.awsSdkClientGlacierNode.typesGetVaultAccessPolicyOutputMod

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesVaultAccessPolicyMod.UnmarshalledVaultAccessPolicy
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVaultAccessPolicyOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Contains the returned vault access policy as a JSON string.</p>
    */
  var policy: js.UndefOr[UnmarshalledVaultAccessPolicy] = js.native
}

object GetVaultAccessPolicyOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetVaultAccessPolicyOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVaultAccessPolicyOutput]
  }
  @scala.inline
  implicit class GetVaultAccessPolicyOutputOps[Self <: GetVaultAccessPolicyOutput] (val x: Self) extends AnyVal {
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
    def withPolicy(value: UnmarshalledVaultAccessPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
  }
  
}

