package typingsSlinky.sat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SAT {
    
    @JSGlobal("SAT.Box")
    @js.native
    class Box ()
      extends typingsSlinky.sat.SAT.Box {
      def this(pos: typingsSlinky.sat.SAT.Vector) = this()
      def this(pos: js.UndefOr[scala.Nothing], width: Double) = this()
      def this(pos: typingsSlinky.sat.SAT.Vector, width: Double) = this()
      def this(pos: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(pos: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
      def this(pos: typingsSlinky.sat.SAT.Vector, width: js.UndefOr[scala.Nothing], height: Double) = this()
      def this(pos: typingsSlinky.sat.SAT.Vector, width: Double, height: Double) = this()
    }
    
    @JSGlobal("SAT.Circle")
    @js.native
    class Circle ()
      extends typingsSlinky.sat.SAT.Circle {
      def this(pos: typingsSlinky.sat.SAT.Vector) = this()
      def this(pos: js.UndefOr[scala.Nothing], r: Double) = this()
      def this(pos: typingsSlinky.sat.SAT.Vector, r: Double) = this()
    }
    
    @JSGlobal("SAT.Polygon")
    @js.native
    class Polygon ()
      extends typingsSlinky.sat.SAT.Polygon {
      def this(pos: typingsSlinky.sat.SAT.Vector) = this()
      def this(pos: js.UndefOr[scala.Nothing], points: js.Array[typingsSlinky.sat.SAT.Vector]) = this()
      def this(pos: typingsSlinky.sat.SAT.Vector, points: js.Array[typingsSlinky.sat.SAT.Vector]) = this()
    }
    
    @JSGlobal("SAT.Response")
    @js.native
    class Response ()
      extends typingsSlinky.sat.SAT.Response
    
    @JSGlobal("SAT.Vector")
    @js.native
    /**
      * @class Vector has two properties
      * @param {number} x The x-coordinate of the Vector.
      * @param {number} y The y-coordinate of the Vector.
      */
    class Vector ()
      extends typingsSlinky.sat.SAT.Vector {
      def this(x: Double) = this()
      def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
      def this(x: Double, y: Double) = this()
    }
    
    @JSGlobal("SAT.pointInCircle")
    @js.native
    def pointInCircle(p: typingsSlinky.sat.SAT.Vector, c: typingsSlinky.sat.SAT.Circle): Boolean = js.native
    
    @JSGlobal("SAT.pointInPolygon")
    @js.native
    def pointInPolygon(p: typingsSlinky.sat.SAT.Vector, poly: typingsSlinky.sat.SAT.Polygon): Boolean = js.native
    
    @JSGlobal("SAT.testCircleCircle")
    @js.native
    def testCircleCircle(a: typingsSlinky.sat.SAT.Circle, b: typingsSlinky.sat.SAT.Circle): Boolean = js.native
    @JSGlobal("SAT.testCircleCircle")
    @js.native
    def testCircleCircle(
      a: typingsSlinky.sat.SAT.Circle,
      b: typingsSlinky.sat.SAT.Circle,
      response: typingsSlinky.sat.SAT.Response
    ): Boolean = js.native
    
    @JSGlobal("SAT.testCirclePolygon")
    @js.native
    def testCirclePolygon(circle: typingsSlinky.sat.SAT.Circle, polygon: typingsSlinky.sat.SAT.Polygon): Boolean = js.native
    @JSGlobal("SAT.testCirclePolygon")
    @js.native
    def testCirclePolygon(
      circle: typingsSlinky.sat.SAT.Circle,
      polygon: typingsSlinky.sat.SAT.Polygon,
      response: typingsSlinky.sat.SAT.Response
    ): Boolean = js.native
    
    @JSGlobal("SAT.testPolygonCircle")
    @js.native
    def testPolygonCircle(polygon: typingsSlinky.sat.SAT.Polygon, circle: typingsSlinky.sat.SAT.Circle): Boolean = js.native
    @JSGlobal("SAT.testPolygonCircle")
    @js.native
    def testPolygonCircle(
      polygon: typingsSlinky.sat.SAT.Polygon,
      circle: typingsSlinky.sat.SAT.Circle,
      response: typingsSlinky.sat.SAT.Response
    ): Boolean = js.native
    
    @JSGlobal("SAT.testPolygonPolygon")
    @js.native
    def testPolygonPolygon(a: typingsSlinky.sat.SAT.Polygon, b: typingsSlinky.sat.SAT.Polygon): Boolean = js.native
    @JSGlobal("SAT.testPolygonPolygon")
    @js.native
    def testPolygonPolygon(
      a: typingsSlinky.sat.SAT.Polygon,
      b: typingsSlinky.sat.SAT.Polygon,
      response: typingsSlinky.sat.SAT.Response
    ): Boolean = js.native
  }
}
