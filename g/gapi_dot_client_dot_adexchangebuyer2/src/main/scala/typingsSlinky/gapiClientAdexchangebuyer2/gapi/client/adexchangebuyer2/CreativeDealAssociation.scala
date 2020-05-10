package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeDealAssociation extends js.Object {
  /** The account the creative belongs to. */
  var accountId: js.UndefOr[String] = js.native
  /** The ID of the creative associated with the deal. */
  var creativeId: js.UndefOr[String] = js.native
  /** The externalDealId for the deal associated with the creative. */
  var dealsId: js.UndefOr[String] = js.native
}

object CreativeDealAssociation {
  @scala.inline
  def apply(): CreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeDealAssociation]
  }
  @scala.inline
  implicit class CreativeDealAssociationOps[Self <: CreativeDealAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withDealsId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealsId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealsId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealsId")(js.undefined)
        ret
    }
  }
  
}

