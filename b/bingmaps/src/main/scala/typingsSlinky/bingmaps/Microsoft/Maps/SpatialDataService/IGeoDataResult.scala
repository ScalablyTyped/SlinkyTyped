package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import typingsSlinky.bingmaps.Microsoft.Maps.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoDataResult extends js.Object {
  /** Copyright information for the returned boundary data. */
  var Copyright: ICopyright = js.native
  /** A unique ID number associated with this entity. */
  var EntityID: String = js.native
  /**
    * A collection of metadata information associated with the entity. The getEntityMetadata option of the request must be set
    * to true. Note, not all boundaries will return this metadata.
    */
  var EntityMetadata: IMetadata = js.native
  /** Information about the name of the boundary location. */
  var Name: IName = js.native
  /** A Polygon object that has been generated from the data in the Primitives property. */
  var Polygons: js.Array[Polygon] = js.native
  /** An array of objects that contain the polygon information for the boundary. */
  var Primitives: js.Array[IGeoDataPrimitive] = js.native
}

object IGeoDataResult {
  @scala.inline
  def apply(
    Copyright: ICopyright,
    EntityID: String,
    EntityMetadata: IMetadata,
    Name: IName,
    Polygons: js.Array[Polygon],
    Primitives: js.Array[IGeoDataPrimitive]
  ): IGeoDataResult = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], EntityID = EntityID.asInstanceOf[js.Any], EntityMetadata = EntityMetadata.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Polygons = Polygons.asInstanceOf[js.Any], Primitives = Primitives.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoDataResult]
  }
  @scala.inline
  implicit class IGeoDataResultOps[Self <: IGeoDataResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: ICopyright): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityMetadata(value: IMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: IName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygons(value: js.Array[Polygon]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimitives(value: js.Array[IGeoDataPrimitive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Primitives")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

