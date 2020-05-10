package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoSpatialColumnGroup extends js.Object {
  /**
    * Columns in this hierarchy.
    */
  var Columns: ColumnList = js.native
  /**
    * Country code.
    */
  var CountryCode: GeoSpatialCountryCode = js.native
  /**
    * A display name for the hierarchy.
    */
  var Name: ColumnGroupName = js.native
}

object GeoSpatialColumnGroup {
  @scala.inline
  def apply(Columns: ColumnList, CountryCode: GeoSpatialCountryCode, Name: ColumnGroupName): GeoSpatialColumnGroup = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSpatialColumnGroup]
  }
  @scala.inline
  implicit class GeoSpatialColumnGroupOps[Self <: GeoSpatialColumnGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: ColumnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: GeoSpatialCountryCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ColumnGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

