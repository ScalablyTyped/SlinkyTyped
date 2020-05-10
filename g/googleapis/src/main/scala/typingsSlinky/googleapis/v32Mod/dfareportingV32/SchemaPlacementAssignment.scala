package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Placement Assignment.
  */
@js.native
trait SchemaPlacementAssignment extends js.Object {
  /**
    * Whether this placement assignment is active. When true, the placement
    * will be included in the ad&#39;s rotation.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * ID of the placement to be assigned. This is a required field.
    */
  var placementId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the placement. This is a read-only,
    * auto-generated field.
    */
  var placementIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether the placement to be assigned requires SSL. This is a read-only
    * field that is auto-generated when the ad is inserted or updated.
    */
  var sslRequired: js.UndefOr[Boolean] = js.native
}

object SchemaPlacementAssignment {
  @scala.inline
  def apply(): SchemaPlacementAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementAssignment]
  }
  @scala.inline
  implicit class SchemaPlacementAssignmentOps[Self <: SchemaPlacementAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementId")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacementIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacementIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSslRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslRequired")(js.undefined)
        ret
    }
  }
  
}

