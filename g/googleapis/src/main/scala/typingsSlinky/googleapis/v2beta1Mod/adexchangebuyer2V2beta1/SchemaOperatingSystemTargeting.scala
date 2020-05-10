package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting information for operating systems.
  */
@js.native
trait SchemaOperatingSystemTargeting extends js.Object {
  /**
    * IDs of operating systems to be included/excluded.
    */
  var operatingSystemCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.native
  /**
    * IDs of operating system versions to be included/excluded.
    */
  var operatingSystemVersionCriteria: js.UndefOr[SchemaCriteriaTargeting] = js.native
}

object SchemaOperatingSystemTargeting {
  @scala.inline
  def apply(): SchemaOperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperatingSystemTargeting]
  }
  @scala.inline
  implicit class SchemaOperatingSystemTargetingOps[Self <: SchemaOperatingSystemTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatingSystemCriteria(value: SchemaCriteriaTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemVersionCriteria(value: SchemaCriteriaTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersionCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemVersionCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersionCriteria")(js.undefined)
        ret
    }
  }
  
}

