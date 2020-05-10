package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadata extends js.Object {
  /** The approximate total surface area (in square kilometers) covered by all the polygons that comprise this entity. */
  var AreaSqKm: String = js.native
  /**
    * An area on the Earth that provides the best map view for this entity. This area is defined as a bounding box in the format of a
    * “MULTIPOINT ((WestLongitude SouthLatitude), (EastLongitude NorthLatitude))”.
    */
  var BestMapViewBox: String = js.native
  /** The culture associated with this entity. Example: en */
  var OfficialCulture: String = js.native
  /** The approximate population within this entity. Example: PopClass20000to99999 */
  var PopulationClass: String = js.native
  /** The regional culture associated with this entity. */
  var RegionalCulture: String = js.native
}

object IMetadata {
  @scala.inline
  def apply(
    AreaSqKm: String,
    BestMapViewBox: String,
    OfficialCulture: String,
    PopulationClass: String,
    RegionalCulture: String
  ): IMetadata = {
    val __obj = js.Dynamic.literal(AreaSqKm = AreaSqKm.asInstanceOf[js.Any], BestMapViewBox = BestMapViewBox.asInstanceOf[js.Any], OfficialCulture = OfficialCulture.asInstanceOf[js.Any], PopulationClass = PopulationClass.asInstanceOf[js.Any], RegionalCulture = RegionalCulture.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadata]
  }
  @scala.inline
  implicit class IMetadataOps[Self <: IMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreaSqKm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AreaSqKm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBestMapViewBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BestMapViewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficialCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OfficialCulture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopulationClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulationClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegionalCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegionalCulture")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

