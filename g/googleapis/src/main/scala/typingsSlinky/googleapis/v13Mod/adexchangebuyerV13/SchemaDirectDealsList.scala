package typingsSlinky.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A direct deals feed lists Direct Deals the Ad Exchange buyer account has
  * access to. This includes direct deals set up for the buyer account as well
  * as its merged stream seats.
  */
@js.native
trait SchemaDirectDealsList extends js.Object {
  /**
    * A list of direct deals relevant for your account.
    */
  var directDeals: js.UndefOr[js.Array[SchemaDirectDeal]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDirectDealsList {
  @scala.inline
  def apply(): SchemaDirectDealsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDealsList]
  }
  @scala.inline
  implicit class SchemaDirectDealsListOps[Self <: SchemaDirectDealsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectDeals(value: js.Array[SchemaDirectDeal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directDeals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectDeals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directDeals")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

