package typingsSlinky.ol

import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.geomCircleMod.default
import typingsSlinky.ol.geomGeometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", JSImport.Namespace)
@js.native
object geomMod extends js.Object {
  @js.native
  class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class Geometry ()
    extends typingsSlinky.ol.geomGeometryMod.default
  
  @js.native
  class LineString protected ()
    extends typingsSlinky.ol.geomLineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class MultiLineString protected ()
    extends typingsSlinky.ol.geomMultiLineStringMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.geomLineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsSlinky.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @js.native
  class MultiPoint protected ()
    extends typingsSlinky.ol.geomMultiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class MultiPolygon protected ()
    extends typingsSlinky.ol.geomMultiPolygonMod.default {
    def this(coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.geomPolygonMod.default
          ]) = this()
    def this(
      coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.geomPolygonMod.default
          ],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsSlinky.ol.geomPolygonMod.default
          ],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  @js.native
  class Point protected ()
    extends typingsSlinky.ol.geomPointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typingsSlinky.ol.geomPolygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
}

