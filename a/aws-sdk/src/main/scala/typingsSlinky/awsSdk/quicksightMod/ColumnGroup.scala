package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnGroup extends js.Object {
  /**
    * Geospatial column group that denotes a hierarchy.
    */
  var GeoSpatialColumnGroup: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.GeoSpatialColumnGroup] = js.native
}

object ColumnGroup {
  @scala.inline
  def apply(): ColumnGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroup]
  }
  @scala.inline
  implicit class ColumnGroupOps[Self <: ColumnGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoSpatialColumnGroup(value: GeoSpatialColumnGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoSpatialColumnGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoSpatialColumnGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeoSpatialColumnGroup")(js.undefined)
        ret
    }
  }
  
}

