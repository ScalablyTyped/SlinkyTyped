package typingsSlinky.cesium

import typingsSlinky.cesium.mod.BillboardGraphics
import typingsSlinky.cesium.mod.BoxGraphics
import typingsSlinky.cesium.mod.Cesium3DTilesetGraphics
import typingsSlinky.cesium.mod.CorridorGraphics
import typingsSlinky.cesium.mod.CylinderGraphics
import typingsSlinky.cesium.mod.EllipseGraphics
import typingsSlinky.cesium.mod.EllipsoidGraphics
import typingsSlinky.cesium.mod.Entity
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
trait AnonAvailability extends js.Object {
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
  var parent: js.UndefOr[Entity] = js.native
  var path: js.UndefOr[PathGraphics] = js.native
  var plane: js.UndefOr[js.Any] = js.native
  var point: js.UndefOr[PointGraphics] = js.native
  var polygon: js.UndefOr[PolygonGraphics] = js.native
  var polyline: js.UndefOr[PolylineGraphics] = js.native
  var polylineVolume: js.UndefOr[PolylineVolumeGraphics] = js.native
  var position: js.UndefOr[PositionProperty] = js.native
  var properties: js.UndefOr[PropertyBag] = js.native
  var rectangle: js.UndefOr[RectangleGraphics] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var tileset: js.UndefOr[Cesium3DTilesetGraphics] = js.native
  var viewFrom: js.UndefOr[Property] = js.native
  var wall: js.UndefOr[WallGraphics] = js.native
}

object AnonAvailability {
  @scala.inline
  def apply(): AnonAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAvailability]
  }
  @scala.inline
  implicit class AnonAvailabilityOps[Self <: AnonAvailability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailability(value: TimeIntervalCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
        ret
    }
    @scala.inline
    def withBillboard(value: BillboardGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billboard")(js.undefined)
        ret
    }
    @scala.inline
    def withBox(value: BoxGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("box")(js.undefined)
        ret
    }
    @scala.inline
    def withCorridor(value: CorridorGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corridor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorridor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corridor")(js.undefined)
        ret
    }
    @scala.inline
    def withCylinder(value: CylinderGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCylinder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cylinder")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Property): Self = {
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
    def withEllipse(value: EllipseGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: EllipsoidGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: LabelGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: ModelGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: Property | Quaternion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: PathGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPlane(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plane")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: PointGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon(value: PolygonGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyline(value: PolylineGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineVolume(value: PolylineVolumeGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PositionProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: RectangleGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTileset(value: Cesium3DTilesetGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileset")(js.undefined)
        ret
    }
    @scala.inline
    def withViewFrom(value: Property): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withWall(value: WallGraphics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wall")(js.undefined)
        ret
    }
  }
  
}

