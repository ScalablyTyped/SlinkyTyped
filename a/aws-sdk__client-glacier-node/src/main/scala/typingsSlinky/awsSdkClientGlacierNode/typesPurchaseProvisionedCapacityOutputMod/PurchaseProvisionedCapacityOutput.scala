package typingsSlinky.awsSdkClientGlacierNode.typesPurchaseProvisionedCapacityOutputMod

import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsSlinky.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseProvisionedCapacityOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The ID that identifies the provisioned capacity unit.</p>
    */
  var capacityId: js.UndefOr[String] = js.native
}

object PurchaseProvisionedCapacityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PurchaseProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseProvisionedCapacityOutput]
  }
  @scala.inline
  implicit class PurchaseProvisionedCapacityOutputOps[Self <: PurchaseProvisionedCapacityOutput] (val x: Self) extends AnyVal {
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
    def withCapacityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapacityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacityId")(js.undefined)
        ret
    }
  }
  
}

