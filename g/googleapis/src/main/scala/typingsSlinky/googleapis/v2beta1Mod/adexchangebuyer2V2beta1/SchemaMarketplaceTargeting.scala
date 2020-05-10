package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Targeting represents different criteria that can be used by advertisers to
  * target ad inventory. For example, they can choose to target ad requests
  * only if the user is in the US. Multiple types of targeting are always
  * applied as a logical AND, unless noted otherwise.
  */
@js.native
trait SchemaMarketplaceTargeting extends js.Object {
  /**
    * Geo criteria IDs to be included/excluded.
    */
  var geoTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * Inventory sizes to be included/excluded.
    */
  var inventorySizeTargeting: js.UndefOr[SchemaInventorySizeTargeting] = js.native
  /**
    * Placement targeting information, e.g., URL, mobile applications.
    */
  var placementTargeting: js.UndefOr[SchemaPlacementTargeting] = js.native
  /**
    * Technology targeting information, e.g., operating system, device
    * category.
    */
  var technologyTargeting: js.UndefOr[SchemaTechnologyTargeting] = js.native
  /**
    * Video targeting information.
    */
  var videoTargeting: js.UndefOr[SchemaVideoTargeting] = js.native
}

object SchemaMarketplaceTargeting {
  @scala.inline
  def apply(): SchemaMarketplaceTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMarketplaceTargeting]
  }
  @scala.inline
  implicit class SchemaMarketplaceTargetingOps[Self <: SchemaMarketplaceTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoTargeting(value: SchemaCriteriaTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withInventorySizeTargeting(value: SchemaInventorySizeTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventorySizeTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventorySizeTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inventorySizeTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementTargeting(value: SchemaPlacementTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withTechnologyTargeting(value: SchemaTechnologyTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technologyTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTechnologyTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("technologyTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoTargeting(value: SchemaVideoTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoTargeting")(js.undefined)
        ret
    }
  }
  
}

