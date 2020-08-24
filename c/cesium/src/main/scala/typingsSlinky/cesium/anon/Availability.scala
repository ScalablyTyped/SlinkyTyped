package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.BillboardGraphics
import typingsSlinky.cesium.mod.BoxGraphics
import typingsSlinky.cesium.mod.CallbackProperty
import typingsSlinky.cesium.mod.Cesium3DTilesetGraphics
import typingsSlinky.cesium.mod.CorridorGraphics
import typingsSlinky.cesium.mod.CylinderGraphics
import typingsSlinky.cesium.mod.EllipseGraphics
import typingsSlinky.cesium.mod.EllipsoidGraphics
import typingsSlinky.cesium.mod.LabelGraphics
import typingsSlinky.cesium.mod.ModelGraphics
import typingsSlinky.cesium.mod.PathGraphics
import typingsSlinky.cesium.mod.PointGraphics
import typingsSlinky.cesium.mod.PolygonGraphics
import typingsSlinky.cesium.mod.PolylineGraphics
import typingsSlinky.cesium.mod.PolylineVolumeGraphics
import typingsSlinky.cesium.mod.PositionProperty
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.PropertyBag
import typingsSlinky.cesium.mod.Quaternion
import typingsSlinky.cesium.mod.RectangleGraphics
import typingsSlinky.cesium.mod.TimeIntervalCollection
import typingsSlinky.cesium.mod.WallGraphics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Availability extends js.Object {
  var availability: js.UndefOr[TimeIntervalCollection] = js.native
  var billboard: js.UndefOr[BillboardGraphics] = js.native
  var box: js.UndefOr[BoxGraphics] = js.native
  var corridor: js.UndefOr[CorridorGraphics] = js.native
  var cylinder: js.UndefOr[CylinderGraphics] = js.native
  var description: js.UndefOr[Property] = js.native
  var ellipse: js.UndefOr[EllipseGraphics] = js.native
  var ellipsoid: js.UndefOr[EllipsoidGraphics] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[LabelGraphics] = js.native
  var model: js.UndefOr[ModelGraphics] = js.native
  var name: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[Property | Quaternion] = js.native
  var parent: js.UndefOr[typingsSlinky.cesium.mod.Entity] = js.native
  var path: js.UndefOr[PathGraphics] = js.native
  var plane: js.UndefOr[js.Any] = js.native
  var point: js.UndefOr[PointGraphics] = js.native
  var polygon: js.UndefOr[PolygonGraphics] = js.native
  var polyline: js.UndefOr[PolylineGraphics] = js.native
  var polylineVolume: js.UndefOr[PolylineVolumeGraphics] = js.native
  var position: js.UndefOr[CallbackProperty | PositionProperty] = js.native
  var properties: js.UndefOr[PropertyBag] = js.native
  var rectangle: js.UndefOr[RectangleGraphics] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var tileset: js.UndefOr[Cesium3DTilesetGraphics] = js.native
  var viewFrom: js.UndefOr[Property] = js.native
  var wall: js.UndefOr[WallGraphics] = js.native
}

object Availability {
  @scala.inline
  def apply(): Availability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Availability]
  }
  @scala.inline
  implicit class AvailabilityOps[Self <: Availability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailability(value: TimeIntervalCollection): Self = this.set("availability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    @scala.inline
    def setBillboard(value: BillboardGraphics): Self = this.set("billboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillboard: Self = this.set("billboard", js.undefined)
    @scala.inline
    def setBox(value: BoxGraphics): Self = this.set("box", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBox: Self = this.set("box", js.undefined)
    @scala.inline
    def setCorridor(value: CorridorGraphics): Self = this.set("corridor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorridor: Self = this.set("corridor", js.undefined)
    @scala.inline
    def setCylinder(value: CylinderGraphics): Self = this.set("cylinder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCylinder: Self = this.set("cylinder", js.undefined)
    @scala.inline
    def setDescription(value: Property): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEllipse(value: EllipseGraphics): Self = this.set("ellipse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipse: Self = this.set("ellipse", js.undefined)
    @scala.inline
    def setEllipsoid(value: EllipsoidGraphics): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: LabelGraphics): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setModel(value: ModelGraphics): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrientation(value: Property | Quaternion): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setParent(value: typingsSlinky.cesium.mod.Entity): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPath(value: PathGraphics): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPlane(value: js.Any): Self = this.set("plane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlane: Self = this.set("plane", js.undefined)
    @scala.inline
    def setPoint(value: PointGraphics): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPolygon(value: PolygonGraphics): Self = this.set("polygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygon: Self = this.set("polygon", js.undefined)
    @scala.inline
    def setPolyline(value: PolylineGraphics): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    @scala.inline
    def setPolylineVolume(value: PolylineVolumeGraphics): Self = this.set("polylineVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineVolume: Self = this.set("polylineVolume", js.undefined)
    @scala.inline
    def setPosition(value: CallbackProperty | PositionProperty): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRectangle(value: RectangleGraphics): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTileset(value: Cesium3DTilesetGraphics): Self = this.set("tileset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileset: Self = this.set("tileset", js.undefined)
    @scala.inline
    def setViewFrom(value: Property): Self = this.set("viewFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewFrom: Self = this.set("viewFrom", js.undefined)
    @scala.inline
    def setWall(value: WallGraphics): Self = this.set("wall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWall: Self = this.set("wall", js.undefined)
  }
  
}

