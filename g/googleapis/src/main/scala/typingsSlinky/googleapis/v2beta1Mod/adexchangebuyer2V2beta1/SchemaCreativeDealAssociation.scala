package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The association between a creative and a deal.
  */
@js.native
trait SchemaCreativeDealAssociation extends js.Object {
  /**
    * The account the creative belongs to.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The ID of the creative associated with the deal.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The externalDealId for the deal associated with the creative.
    */
  var dealsId: js.UndefOr[String] = js.native
}

object SchemaCreativeDealAssociation {
  @scala.inline
  def apply(): SchemaCreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeDealAssociation]
  }
  @scala.inline
  implicit class SchemaCreativeDealAssociationOps[Self <: SchemaCreativeDealAssociation] (val x: Self) extends AnyVal {
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

