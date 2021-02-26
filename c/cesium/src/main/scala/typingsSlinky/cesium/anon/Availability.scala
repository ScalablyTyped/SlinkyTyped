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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Availability extends StObject {
  
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
  implicit class AvailabilityMutableBuilder[Self <: Availability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailability(value: TimeIntervalCollection): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    @scala.inline
    def setBillboard(value: BillboardGraphics): Self = StObject.set(x, "billboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillboardUndefined: Self = StObject.set(x, "billboard", js.undefined)
    
    @scala.inline
    def setBox(value: BoxGraphics): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
    
    @scala.inline
    def setCorridor(value: CorridorGraphics): Self = StObject.set(x, "corridor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorridorUndefined: Self = StObject.set(x, "corridor", js.undefined)
    
    @scala.inline
    def setCylinder(value: CylinderGraphics): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
    
    @scala.inline
    def setDescription(value: Property): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEllipse(value: EllipseGraphics): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: EllipsoidGraphics): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabel(value: LabelGraphics): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setModel(value: ModelGraphics): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: Property | Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setParent(value: typingsSlinky.cesium.mod.Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPath(value: PathGraphics): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPlane(value: js.Any): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaneUndefined: Self = StObject.set(x, "plane", js.undefined)
    
    @scala.inline
    def setPoint(value: PointGraphics): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setPolygon(value: PolygonGraphics): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
    
    @scala.inline
    def setPolyline(value: PolylineGraphics): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    @scala.inline
    def setPolylineVolume(value: PolylineVolumeGraphics): Self = StObject.set(x, "polylineVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineVolumeUndefined: Self = StObject.set(x, "polylineVolume", js.undefined)
    
    @scala.inline
    def setPosition(value: CallbackProperty | PositionProperty): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRectangle(value: RectangleGraphics): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTileset(value: Cesium3DTilesetGraphics): Self = StObject.set(x, "tileset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesetUndefined: Self = StObject.set(x, "tileset", js.undefined)
    
    @scala.inline
    def setViewFrom(value: Property): Self = StObject.set(x, "viewFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewFromUndefined: Self = StObject.set(x, "viewFrom", js.undefined)
    
    @scala.inline
    def setWall(value: WallGraphics): Self = StObject.set(x, "wall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWallUndefined: Self = StObject.set(x, "wall", js.undefined)
  }
}
