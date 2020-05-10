package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents creative restrictions associated to Programmatic Guaranteed/
  * Preferred Deal in Ad Manager. This doesn&#39;t apply to Private Auction and
  * AdX Preferred Deals.
  */
@js.native
trait SchemaCreativeRestrictions extends js.Object {
  /**
    * The format of the environment that the creatives will be displayed in.
    */
  var creativeFormat: js.UndefOr[String] = js.native
  var creativeSpecifications: js.UndefOr[js.Array[SchemaCreativeSpecification]] = js.native
  /**
    * Skippable video ads allow viewers to skip ads after 5 seconds.
    */
  var skippableAdType: js.UndefOr[String] = js.native
}

object SchemaCreativeRestrictions {
  @scala.inline
  def apply(): SchemaCreativeRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeRestrictions]
  }
  @scala.inline
  implicit class SchemaCreativeRestrictionsOps[Self <: SchemaCreativeRestrictions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreativeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeSpecifications(value: js.Array[SchemaCreativeSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSpecifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeSpecifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeSpecifications")(js.undefined)
        ret
    }
    @scala.inline
    def withSkippableAdType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippableAdType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkippableAdType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skippableAdType")(js.undefined)
        ret
    }
  }
  
}

