package typingsSlinky.ol

import typingsSlinky.ol.circleMod.default
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.geometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMod {
  
  @JSImport("ol/geom", "Circle")
  @js.native
  class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: js.UndefOr[scala.Nothing], opt_layout: GeometryLayout) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "Geometry")
  @js.native
  abstract class Geometry ()
    extends typingsSlinky.ol.geometryMod.default
  
  @JSImport("ol/geom", "GeometryCollection")
  @js.native
  class GeometryCollection ()
    extends typingsSlinky.ol.geometryCollectionMod.default {
    def this(opt_geometries: js.Array[typingsSlinky.ol.geometryMod.default]) = this()
  }
  
  @JSImport("ol/geom", "LineString")
  @js.native
  class LineString protected ()
    extends typingsSlinky.ol.lineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "LinearRing")
  @js.native
  class LinearRing protected ()
    extends typingsSlinky.ol.linearRingMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends typingsSlinky.ol.multiLineStringMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.lineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.lineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.lineStringMod.default],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.lineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @JSImport("ol/geom", "MultiPoint")
  @js.native
  class MultiPoint protected ()
    extends typingsSlinky.ol.multiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiPolygon")
  @js.native
  class MultiPolygon protected ()
    extends typingsSlinky.ol.multiPolygonMod.default {
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.polygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.polygonMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.polygonMod.default],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.polygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  @JSImport("ol/geom", "Point")
  @js.native
  class Point protected ()
    extends typingsSlinky.ol.pointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "Polygon")
  @js.native
  class Polygon protected ()
    extends typingsSlinky.ol.polygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: js.UndefOr[scala.Nothing],
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @JSImport("ol/geom", "SimpleGeometry")
  @js.native
  abstract class SimpleGeometry ()
    extends typingsSlinky.ol.simpleGeometryMod.default
}
