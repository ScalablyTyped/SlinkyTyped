package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting about where the ads can appear, e.g., certain sites or
  * mobile applications. Different placement targeting types will be logically
  * OR&#39;ed.
  */
@js.native
trait SchemaPlacementTargeting extends js.Object {
  /**
    * Mobile application targeting information in a deal. This doesn&#39;t
    * apply to Auction Packages.
    */
  var mobileApplicationTargeting: js.UndefOr[SchemaMobileApplicationTargeting] = js.native
  /**
    * URLs to be included/excluded.
    */
  var urlTargeting: js.UndefOr[SchemaUrlTargeting] = js.native
}

object SchemaPlacementTargeting {
  @scala.inline
  def apply(): SchemaPlacementTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementTargeting]
  }
  @scala.inline
  implicit class SchemaPlacementTargetingOps[Self <: SchemaPlacementTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobileApplicationTargeting(value: SchemaMobileApplicationTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApplicationTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileApplicationTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileApplicationTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlTargeting(value: SchemaUrlTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlTargeting")(js.undefined)
        ret
    }
  }
  
}

