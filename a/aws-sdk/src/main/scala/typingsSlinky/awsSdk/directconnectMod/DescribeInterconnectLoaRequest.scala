package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInterconnectLoaRequest extends js.Object {
  /**
    * The ID of the interconnect.
    */
  var interconnectId: InterconnectId = js.native
  /**
    * The standard media type for the LOA-CFA document. The only supported value is application/pdf.
    */
  var loaContentType: js.UndefOr[LoaContentType] = js.native
  /**
    * The name of the service provider who establishes connectivity on your behalf. If you supply this parameter, the LOA-CFA lists the provider name alongside your company name as the requester of the cross connect.
    */
  var providerName: js.UndefOr[ProviderName] = js.native
}

object DescribeInterconnectLoaRequest {
  @scala.inline
  def apply(interconnectId: InterconnectId): DescribeInterconnectLoaRequest = {
    val __obj = js.Dynamic.literal(interconnectId = interconnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInterconnectLoaRequest]
  }
  @scala.inline
  implicit class DescribeInterconnectLoaRequestOps[Self <: DescribeInterconnectLoaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterconnectId(value: InterconnectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interconnectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaContentType(value: LoaContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaContentType")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: ProviderName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(js.undefined)
        ret
    }
  }
  
}

