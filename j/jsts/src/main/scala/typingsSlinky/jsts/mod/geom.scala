package typingsSlinky.jsts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom")
@js.native
object geom extends js.Object {
  @js.native
  class Coordinate protected ()
    extends typingsSlinky.jsts.jsts.geom.Coordinate {
    /**
      * @constructor
      */
    def this(c: typingsSlinky.jsts.jsts.geom.Coordinate) = this()
    /**
      * @constructor
      */
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class CoordinateSequence ()
    extends typingsSlinky.jsts.jsts.geom.CoordinateSequence
  
  @js.native
  class Envelope protected ()
    extends typingsSlinky.jsts.jsts.geom.Envelope {
    /**
      * Initialize an <code>Envelope</code> from an existing Envelope.
      *
      * @param {jsts.geom.Envelope} env the Envelope to initialize from.
      */
    def this(env: typingsSlinky.jsts.jsts.geom.Envelope) = this()
    /**
      * Initialize an <code>Envelope</code> to a region defined by a single
      * Coordinate.
      *
      * @param {jsts.geom.Coordinate} p the Coordinate.
      */
    def this(p: typingsSlinky.jsts.jsts.geom.Coordinate) = this()
    /**
      * Initialize an <code>Envelope</code> to a region defined by two Coordinates.
      *
      * @param {jsts.geom.Coordinate} p1 the first Coordinate.
      * @param {jsts.geom.Coordinate} p2 the second Coordinate.
      */
    def this(p1: typingsSlinky.jsts.jsts.geom.Coordinate, p2: typingsSlinky.jsts.jsts.geom.Coordinate) = this()
    /**
      * Creates an <code>Envelope</code> for a region defined by maximum and
      * minimum values.
      *
      * @param {number} x1 the first x-value.
      * @param {number} x2 the second x-value.
      * @param {number} y1 the first y-value.
      * @param {number} y2 the second y-value.
      */
    def this(x1: Double, x2: Double, y1: Double, y2: Double) = this()
  }
  
  @js.native
  /**
    * Creates a new <tt>Geometry</tt> via the specified GeometryFactory.
    */
  class Geometry ()
    extends typingsSlinky.jsts.jsts.geom.Geometry {
    def this(factory: js.Any) = this()
  }
  
  @js.native
  class GeometryCollection ()
    extends typingsSlinky.jsts.jsts.geom.GeometryCollection {
    def this(geometries: js.Array[typingsSlinky.jsts.jsts.geom.Geometry]) = this()
    def this(
      geometries: js.Array[typingsSlinky.jsts.jsts.geom.Geometry],
      factory: typingsSlinky.jsts.jsts.geom.GeometryFactory
    ) = this()
  }
  
  @js.native
  /**
    * Constructs a GeometryFactory that generates Geometries having a floating PrecisionModel and a spatial-reference ID of 0.
    */
  class GeometryFactory ()
    extends typingsSlinky.jsts.jsts.geom.GeometryFactory {
    def this(precisionModel: typingsSlinky.jsts.jsts.geom.PrecisionModel) = this()
  }
  
  @js.native
  class IntersectionMatrix ()
    extends typingsSlinky.jsts.jsts.geom.IntersectionMatrix {
    def this(elements: js.Array[String]) = this()
    def this(other: typingsSlinky.jsts.jsts.geom.IntersectionMatrix) = this()
  }
  
  @js.native
  class LineString protected ()
    extends typingsSlinky.jsts.jsts.geom.LineString {
    /**
      * @constructor
      */
    def this(points: js.Array[typingsSlinky.jsts.jsts.geom.Coordinate]) = this()
    def this(points: js.Array[typingsSlinky.jsts.jsts.geom.Coordinate], factory: js.Any) = this()
  }
  
  @js.native
  class LinearRing ()
    extends typingsSlinky.jsts.jsts.geom.LineString
  
  @js.native
  class Point protected ()
    extends typingsSlinky.jsts.jsts.geom.Point {
    /**
      * @constructor
      */
    def this(coordinate: typingsSlinky.jsts.jsts.geom.Coordinate) = this()
    def this(coordinate: typingsSlinky.jsts.jsts.geom.Coordinate, factory: js.Any) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typingsSlinky.jsts.jsts.geom.Polygon {
    /**
      * @constructor
      */
    def this(shell: typingsSlinky.jsts.jsts.geom.LinearRing) = this()
    def this(
      shell: typingsSlinky.jsts.jsts.geom.LinearRing,
      holes: js.Array[typingsSlinky.jsts.jsts.geom.LinearRing]
    ) = this()
    def this(
      shell: typingsSlinky.jsts.jsts.geom.LinearRing,
      holes: js.Array[typingsSlinky.jsts.jsts.geom.LinearRing],
      factory: js.Any
    ) = this()
  }
  
  @js.native
  /**
    * 
    * @param modelType
    */
  class PrecisionModel ()
    extends typingsSlinky.jsts.jsts.geom.PrecisionModel {
    def this(modelType: String) = this()
    def this(modelType: Double) = this()
  }
  
  /* static members */
  @js.native
  object CoordinateSequence extends js.Object {
    var M: Double = js.native
    var X: Double = js.native
    var Y: Double = js.native
    var Z: Double = js.native
  }
  
  /* static members */
  @js.native
  object Envelope extends js.Object {
    /**
      * Test the point q to see whether it intersects the Envelope defined by p1-p2
      *
      * NOTE: calls intersectsEnvelope if four arguments are given to simulate
      * overloaded function
      *
      * @param {jsts.geom.Coordinate}
      *          p1 one extremal point of the envelope.
      * @param {jsts.geom.Coordinate}
      *          p2 another extremal point of the envelope.
      * @param {jsts.geom.Coordinate}
      *          q the point to test for intersection.
      * @return {boolean} <code>true</code> if q intersects the envelope p1-p2.
      */
    def intersects(
      p1: typingsSlinky.jsts.jsts.geom.Coordinate,
      p2: typingsSlinky.jsts.jsts.geom.Coordinate,
      q: typingsSlinky.jsts.jsts.geom.Coordinate
    ): Boolean = js.native
    /**
      * Test the envelope defined by p1-p2 for intersection with the envelope defined
      * by q1-q2
      *
      * @param {jsts.geom.Coordinate}
      *          p1 one extremal point of the envelope P.
      * @param {jsts.geom.Coordinate}
      *          p2 another extremal point of the envelope P.
      * @param {jsts.geom.Coordinate}
      *          q1 one extremal point of the envelope Q.
      * @param {jsts.geom.Coordinate}
      *          q2 another extremal point of the envelope Q.
      * @return {boolean} <code>true</code> if Q intersects P.
      */
    def intersectsEnvelope(
      p1: typingsSlinky.jsts.jsts.geom.Coordinate,
      p2: typingsSlinky.jsts.jsts.geom.Coordinate,
      q1: typingsSlinky.jsts.jsts.geom.Coordinate,
      q2: typingsSlinky.jsts.jsts.geom.Coordinate
    ): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IntersectionMatrix extends js.Object {
    def isTrue(actualDimensionValue: Double): Boolean = js.native
    def matches(actualDimensionSymbols: String, requiredDimensionSymbols: String): Boolean = js.native
    def matches(actualDimensionValue: Double, requiredDimensionSymbol: String): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PrecisionModel extends js.Object {
    var FIXED: String = js.native
    var FLOATING: String = js.native
    var FLOATING_SINGLE: String = js.native
  }
  
  @js.native
  object util extends js.Object {
    @js.native
    class AffineTransformation ()
      extends typingsSlinky.jsts.jsts.geom.util.AffineTransformation {
      def this(trans: typingsSlinky.jsts.jsts.geom.util.AffineTransformation) = this()
      def this(m00: Double, m01: Double, m02: Double, m10: Double, m11: Double, m12: Double) = this()
      def this(
        src0: typingsSlinky.jsts.jsts.geom.Coordinate,
        src1: typingsSlinky.jsts.jsts.geom.Coordinate,
        src2: typingsSlinky.jsts.jsts.geom.Coordinate,
        dest0: typingsSlinky.jsts.jsts.geom.Coordinate,
        dest1: typingsSlinky.jsts.jsts.geom.Coordinate,
        dest2: typingsSlinky.jsts.jsts.geom.Coordinate
      ) = this()
    }
    
    /* static members */
    @js.native
    object AffineTransformation extends js.Object {
      def reflectionInstance(x0: Double, y0: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def reflectionInstance(x0: Double, y0: Double, x1: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def reflectionInstance(x0: Double, y0: Double, x1: Double, y1: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def rotationInstance(sinTheta: Double, cosTheta: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def rotationInstance(sinTheta: Double, cosTheta: Double, x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def rotationInstance(theta: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def rotationInstance(theta: Double, x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def scaleInstance(xScale: Double, yScale: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def scaleInstance(xScale: Double, yScale: Double, x: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def scaleInstance(xScale: Double, yScale: Double, x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def shearInstance(xShear: Double, yShear: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
      def translationInstance(x: Double, y: Double): typingsSlinky.jsts.jsts.geom.util.AffineTransformation = js.native
    }
    
  }
  
}

