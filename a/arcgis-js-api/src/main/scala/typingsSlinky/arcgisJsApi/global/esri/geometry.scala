package typingsSlinky.arcgisJsApi.global.esri

import typingsSlinky.arcgisJsApi.esri.ExtentConstructor
import typingsSlinky.arcgisJsApi.esri.ExtentProperties
import typingsSlinky.arcgisJsApi.esri.MeshConstructor
import typingsSlinky.arcgisJsApi.esri.MeshProperties
import typingsSlinky.arcgisJsApi.esri.MultipointConstructor
import typingsSlinky.arcgisJsApi.esri.MultipointProperties
import typingsSlinky.arcgisJsApi.esri.PointConstructor
import typingsSlinky.arcgisJsApi.esri.PointProperties
import typingsSlinky.arcgisJsApi.esri.PolygonConstructor
import typingsSlinky.arcgisJsApi.esri.PolygonProperties
import typingsSlinky.arcgisJsApi.esri.PolylineConstructor
import typingsSlinky.arcgisJsApi.esri.PolylineProperties
import typingsSlinky.arcgisJsApi.esri.SpatialReferenceConstructor
import typingsSlinky.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry.html)
  */
object geometry {
  
  @JSGlobal("__esri.geometry.Extent")
  @js.native
  val Extent: ExtentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Extent")
  @js.native
  class ExtentCls ()
    extends typingsSlinky.arcgisJsApi.esri.Extent {
    def this(properties: ExtentProperties) = this()
  }
  
  @JSGlobal("__esri.geometry.Mesh")
  @js.native
  val Mesh: MeshConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Mesh")
  @js.native
  /**
    * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
    */
  class MeshCls ()
    extends typingsSlinky.arcgisJsApi.esri.Mesh {
    def this(properties: MeshProperties) = this()
  }
  
  @JSGlobal("__esri.geometry.Multipoint")
  @js.native
  val Multipoint: MultipointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Multipoint")
  @js.native
  class MultipointCls ()
    extends typingsSlinky.arcgisJsApi.esri.Multipoint {
    def this(properties: MultipointProperties) = this()
  }
  
  @JSGlobal("__esri.geometry.Point")
  @js.native
  val Point: PointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Point")
  @js.native
  /**
    * A location defined by X, Y, and Z coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
    */
  class PointCls ()
    extends typingsSlinky.arcgisJsApi.esri.Point {
    def this(properties: PointProperties) = this()
  }
  
  @JSGlobal("__esri.geometry.Polygon")
  @js.native
  val Polygon: PolygonConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Polygon")
  @js.native
  /**
    * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
    */
  class PolygonCls ()
    extends typingsSlinky.arcgisJsApi.esri.Polygon {
    def this(properties: PolygonProperties) = this()
  }
  
  @JSGlobal("__esri.geometry.Polyline")
  @js.native
  val Polyline: PolylineConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Polyline")
  @js.native
  class PolylineCls ()
    extends typingsSlinky.arcgisJsApi.esri.Polyline {
    def this(properties: PolylineProperties) = this()
  }
  
  @JSGlobal("__esri.geometry.SpatialReference")
  @js.native
  val SpatialReference: SpatialReferenceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.SpatialReference")
  @js.native
  class SpatialReferenceCls ()
    extends typingsSlinky.arcgisJsApi.esri.SpatialReference {
    def this(properties: SpatialReferenceProperties) = this()
  }
}
