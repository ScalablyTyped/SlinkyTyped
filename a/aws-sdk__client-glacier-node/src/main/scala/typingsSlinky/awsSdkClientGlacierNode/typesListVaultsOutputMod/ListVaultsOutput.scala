package typingsSlinky.awsSdkClientGlacierNode.typesListVaultsOutputMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeMod.UnmarshalledDescribeVaultOutput
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVaultsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.</p>
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * <p>List of vaults.</p>
    */
  var VaultList: js.UndefOr[js.Array[UnmarshalledDescribeVaultOutput]] = js.native
}

object ListVaultsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListVaultsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVaultsOutput]
  }
  @scala.inline
  implicit class ListVaultsOutputOps[Self <: ListVaultsOutput] (val x: Self) extends AnyVal {
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
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withVaultList(value: js.Array[UnmarshalledDescribeVaultOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVaultList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VaultList")(js.undefined)
        ret
    }
  }
  
}

