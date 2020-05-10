package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveDealAssociationRequest extends js.Object {
  /** The association between a creative and a deal that should be removed. */
  var association: js.UndefOr[CreativeDealAssociation] = js.native
}

object RemoveDealAssociationRequest {
  @scala.inline
  def apply(): RemoveDealAssociationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveDealAssociationRequest]
  }
  @scala.inline
  implicit class RemoveDealAssociationRequestOps[Self <: RemoveDealAssociationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociation(value: CreativeDealAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("association")(js.undefined)
        ret
    }
  }
  
}

