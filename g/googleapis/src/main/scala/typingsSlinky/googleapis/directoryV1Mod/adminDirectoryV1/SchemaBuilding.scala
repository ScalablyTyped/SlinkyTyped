package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Building object in Directory API.
  */
@js.native
trait SchemaBuilding extends js.Object {
  /**
    * The postal address of the building. See PostalAddress for details. Note
    * that only a single address line and region code are required.
    */
  var address: js.UndefOr[SchemaBuildingAddress] = js.native
  /**
    * Unique identifier for the building. The maximum length is 100 characters.
    */
  var buildingId: js.UndefOr[String] = js.native
  /**
    * The building name as seen by users in Calendar. Must be unique for the
    * customer. For example, &quot;NYC-CHEL&quot;. The maximum length is 100
    * characters.
    */
  var buildingName: js.UndefOr[String] = js.native
  /**
    * The geographic coordinates of the center of the building, expressed as
    * latitude and longitude in decimal degrees.
    */
  var coordinates: js.UndefOr[SchemaBuildingCoordinates] = js.native
  /**
    * A brief description of the building. For example, &quot;Chelsea
    * Market&quot;.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  /**
    * The display names for all floors in this building. The floors are
    * expected to be sorted in ascending order, from lowest floor to highest
    * floor. For example, [&quot;B2&quot;, &quot;B1&quot;, &quot;L&quot;,
    * &quot;1&quot;, &quot;2&quot;, &quot;2M&quot;, &quot;3&quot;,
    * &quot;PH&quot;] Must contain at least one entry.
    */
  var floorNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBuilding {
  @scala.inline
  def apply(): SchemaBuilding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuilding]
  }
  @scala.inline
  implicit class SchemaBuildingOps[Self <: SchemaBuilding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: SchemaBuildingAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildingId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingId")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildingName")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordinates(value: SchemaBuildingCoordinates): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEtags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etags")(js.undefined)
        ret
    }
    @scala.inline
    def withFloorNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloorNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floorNames")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

