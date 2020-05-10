package typingsSlinky.awsSdkClientLambdaNode.typesGetAccountSettingsOutputMod

import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesAccountLimitMod.UnmarshalledAccountLimit
import typingsSlinky.awsSdkClientLambdaNode.typesAccountUsageMod.UnmarshalledAccountUsage
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Limits related to concurrency and code storage.</p>
    */
  var AccountLimit: js.UndefOr[UnmarshalledAccountLimit] = js.native
  /**
    * <p>The number of functions and amount of storage in use.</p>
    */
  var AccountUsage: js.UndefOr[UnmarshalledAccountUsage] = js.native
}

object GetAccountSettingsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetAccountSettingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsOutput]
  }
  @scala.inline
  implicit class GetAccountSettingsOutputOps[Self <: GetAccountSettingsOutput] (val x: Self) extends AnyVal {
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
    def withAccountLimit(value: UnmarshalledAccountLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountUsage(value: UnmarshalledAccountUsage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountUsage")(js.undefined)
        ret
    }
  }
  
}

