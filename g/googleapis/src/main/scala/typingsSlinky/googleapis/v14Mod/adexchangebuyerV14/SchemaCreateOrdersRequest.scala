package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCreateOrdersRequest extends js.Object {
  /**
    * The list of proposals to create.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
  /**
    * Web property id of the seller creating these orders
    */
  var webPropertyCode: js.UndefOr[String] = js.native
}

object SchemaCreateOrdersRequest {
  @scala.inline
  def apply(): SchemaCreateOrdersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateOrdersRequest]
  }
  @scala.inline
  implicit class SchemaCreateOrdersRequestOps[Self <: SchemaCreateOrdersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProposals(value: js.Array[SchemaProposal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposals")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyCode")(js.undefined)
        ret
    }
  }
  
}

