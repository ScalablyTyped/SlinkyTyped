package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMarketplaceLabel extends js.Object {
  /**
    * The accountId of the party that created the label.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The creation time (in ms since epoch) for the label.
    */
  var createTimeMs: js.UndefOr[String] = js.native
  /**
    * Information about the party that created the label.
    */
  var deprecatedMarketplaceDealParty: js.UndefOr[SchemaMarketplaceDealParty] = js.native
  /**
    * The label to use.
    */
  var label: js.UndefOr[String] = js.native
}

object SchemaMarketplaceLabel {
  @scala.inline
  def apply(): SchemaMarketplaceLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceLabel]
  }
  @scala.inline
  implicit class SchemaMarketplaceLabelOps[Self <: SchemaMarketplaceLabel] (val x: Self) extends AnyVal {
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
    def withCreateTimeMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTimeMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTimeMs")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedMarketplaceDealParty(value: SchemaMarketplaceDealParty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedMarketplaceDealParty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedMarketplaceDealParty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedMarketplaceDealParty")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

