package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting about various types of technology.
  */
@js.native
trait SchemaTechnologyTargeting extends js.Object {
  /**
    * IDs of device capabilities to be included/excluded.
    */
  var deviceCapabilityTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * IDs of device categories to be included/excluded.
    */
  var deviceCategoryTargeting: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * Operating system related targeting information.
    */
  var operatingSystemTargeting: js.UndefOr[SchemaOperatingSystemTargeting] = js.native
}

object SchemaTechnologyTargeting {
  @scala.inline
  def apply(): SchemaTechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTechnologyTargeting]
  }
  @scala.inline
  implicit class SchemaTechnologyTargetingOps[Self <: SchemaTechnologyTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceCapabilityTargeting(value: SchemaCriteriaTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCapabilityTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCapabilityTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCapabilityTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceCategoryTargeting(value: SchemaCriteriaTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategoryTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceCategoryTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceCategoryTargeting")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemTargeting(value: SchemaOperatingSystemTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemTargeting")(js.undefined)
        ret
    }
  }
  
}

