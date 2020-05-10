package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementAssignment extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
  var placementId: js.UndefOr[String] = js.native
  var placementIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var sslRequired: js.UndefOr[Boolean] = js.native
}

object PlacementAssignment {
  @scala.inline
  def apply(): PlacementAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementAssignment]
  }
  @scala.inline
  implicit class PlacementAssignmentOps[Self <: PlacementAssignment] (val x: Self) extends AnyVal {
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
    def withPlacementIdDimensionValue(value: DimensionValue): Self = {
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

