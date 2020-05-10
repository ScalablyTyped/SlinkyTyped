package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOrdersResponse extends js.Object {
  /**
    * The list of matching proposals.
    */
  var proposals: js.UndefOr[js.Array[SchemaProposal]] = js.native
}

object SchemaGetOrdersResponse {
  @scala.inline
  def apply(): SchemaGetOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOrdersResponse]
  }
  @scala.inline
  implicit class SchemaGetOrdersResponseOps[Self <: SchemaGetOrdersResponse] (val x: Self) extends AnyVal {
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
  }
  
}

