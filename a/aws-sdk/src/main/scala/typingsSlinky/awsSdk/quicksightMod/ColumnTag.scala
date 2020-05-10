package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnTag extends js.Object {
  /**
    * A geospatial role for a column.
    */
  var ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole] = js.native
}

object ColumnTag {
  @scala.inline
  def apply(): ColumnTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTag]
  }
  @scala.inline
  implicit class ColumnTagOps[Self <: ColumnTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnGeographicRole(value: GeoSpatialDataRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGeographicRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGeographicRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnGeographicRole")(js.undefined)
        ret
    }
  }
  
}

