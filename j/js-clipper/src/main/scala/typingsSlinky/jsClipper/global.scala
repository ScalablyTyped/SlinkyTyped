package typingsSlinky.jsClipper

import typingsSlinky.jsClipper.ClipperLib.JoinType
import typingsSlinky.jsClipper.anon.Value
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ClipperLib {
    
    @JSGlobal("ClipperLib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ClipperLib.Cast_Int32")
    @js.native
    def CastInt32(a: Double): Double = js.native
    
    @JSGlobal("ClipperLib.Cast_Int64")
    @js.native
    def CastInt64(a: Double): Double = js.native
    
    @JSGlobal("ClipperLib.Clean")
    @js.native
    def Clean(
      polygon: ArrayLike[
          ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] | typingsSlinky.jsClipper.ClipperLib.IntPoint
        ],
      delta: Double
    ): ArrayLike[
        ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] | typingsSlinky.jsClipper.ClipperLib.IntPoint
      ] = js.native
    
    @JSGlobal("ClipperLib.Clear")
    @js.native
    def Clear(a: ArrayLike[_]): Unit = js.native
    
    @JSGlobal("ClipperLib.ClipType")
    @js.native
    object ClipType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.ClipType with Double] = js.native
      
      /* 2 */ val ctDifference: typingsSlinky.jsClipper.ClipperLib.ClipType.ctDifference with Double = js.native
      
      /* 0 */ val ctIntersection: typingsSlinky.jsClipper.ClipperLib.ClipType.ctIntersection with Double = js.native
      
      /* 1 */ val ctUnion: typingsSlinky.jsClipper.ClipperLib.ClipType.ctUnion with Double = js.native
      
      /* 3 */ val ctXor: typingsSlinky.jsClipper.ClipperLib.ClipType.ctXor with Double = js.native
    }
    
    @JSGlobal("ClipperLib.Clipper")
    @js.native
    class Clipper ()
      extends typingsSlinky.jsClipper.ClipperLib.Clipper
    
    @JSGlobal("ClipperLib.ClipperBase")
    @js.native
    class ClipperBase ()
      extends typingsSlinky.jsClipper.ClipperLib.ClipperBase
    
    @JSGlobal("ClipperLib.Clone")
    @js.native
    def Clone(
      polygon: ArrayLike[
          ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] | typingsSlinky.jsClipper.ClipperLib.IntPoint
        ]
    ): ArrayLike[
        ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] | typingsSlinky.jsClipper.ClipperLib.IntPoint
      ] = js.native
    
    @JSGlobal("ClipperLib.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.Direction with Double] = js.native
      
      /* 1 */ val dLeftToRight: typingsSlinky.jsClipper.ClipperLib.Direction.dLeftToRight with Double = js.native
      
      /* 0 */ val dRightToLeft: typingsSlinky.jsClipper.ClipperLib.Direction.dRightToLeft with Double = js.native
    }
    
    @JSGlobal("ClipperLib.DoublePoint")
    @js.native
    class DoublePoint protected ()
      extends typingsSlinky.jsClipper.ClipperLib.DoublePoint {
      def this(x: Double, y: Double) = this()
    }
    
    @JSGlobal("ClipperLib.EdgeSide")
    @js.native
    object EdgeSide extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.EdgeSide with Double] = js.native
      
      /* 0 */ val esLeft: typingsSlinky.jsClipper.ClipperLib.EdgeSide.esLeft with Double = js.native
      
      /* 1 */ val esRight: typingsSlinky.jsClipper.ClipperLib.EdgeSide.esRight with Double = js.native
    }
    
    @JSGlobal("ClipperLib.Error")
    @js.native
    def Error(message: String): Unit = js.native
    
    @JSGlobal("ClipperLib.ExPolygon")
    @js.native
    class ExPolygon ()
      extends typingsSlinky.jsClipper.ClipperLib.ExPolygon
    
    @JSGlobal("ClipperLib.HorzJoinRec")
    @js.native
    class HorzJoinRec ()
      extends typingsSlinky.jsClipper.ClipperLib.HorzJoinRec
    
    @JSGlobal("ClipperLib.IntPoint")
    @js.native
    class IntPoint ()
      extends typingsSlinky.jsClipper.ClipperLib.IntPoint {
      def this(PointXY: typingsSlinky.jsClipper.ClipperLib.IntPoint) = this()
      def this(x: Double, y: Double) = this()
    }
    
    @JSGlobal("ClipperLib.IntRect")
    @js.native
    class IntRect ()
      extends typingsSlinky.jsClipper.ClipperLib.IntRect {
      def this(left: Double, top: Double, right: Double, bottom: Double) = this()
    }
    
    @JSGlobal("ClipperLib.IntersectNode")
    @js.native
    class IntersectNode ()
      extends typingsSlinky.jsClipper.ClipperLib.IntersectNode
    
    @JSGlobal("ClipperLib.JoinRec")
    @js.native
    class JoinRec ()
      extends typingsSlinky.jsClipper.ClipperLib.JoinRec
    
    @JSGlobal("ClipperLib.JoinType")
    @js.native
    object JoinType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.JoinType with Double] = js.native
      
      /* 2 */ val jtMiter: typingsSlinky.jsClipper.ClipperLib.JoinType.jtMiter with Double = js.native
      
      /* 1 */ val jtRound: typingsSlinky.jsClipper.ClipperLib.JoinType.jtRound with Double = js.native
      
      /* 0 */ val jtSquare: typingsSlinky.jsClipper.ClipperLib.JoinType.jtSquare with Double = js.native
    }
    
    @JSGlobal("ClipperLib.Lighten")
    @js.native
    def Lighten(
      polygon: ArrayLike[
          ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] | typingsSlinky.jsClipper.ClipperLib.IntPoint
        ],
      tolerance: Double
    ): ArrayLike[
        ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint] | typingsSlinky.jsClipper.ClipperLib.IntPoint
      ] = js.native
    
    @JSGlobal("ClipperLib.LocalMinima")
    @js.native
    class LocalMinima ()
      extends typingsSlinky.jsClipper.ClipperLib.LocalMinima
    
    @JSGlobal("ClipperLib.Math_Abs_Double")
    @js.native
    def MathAbsDouble(a: Double): Double = js.native
    
    @JSGlobal("ClipperLib.Math_Abs_Int32")
    @js.native
    def MathAbsInt32(a: Double): Double = js.native
    
    @JSGlobal("ClipperLib.Math_Abs_Int64")
    @js.native
    def MathAbsInt64(a: Double): Double = js.native
    
    @JSGlobal("ClipperLib.Math_Max_Int32_Int32")
    @js.native
    def MathMaxInt32Int32(a: Double, b: Double): Double = js.native
    
    @JSGlobal("ClipperLib.MaxSteps")
    @js.native
    def MaxSteps: Double = js.native
    @scala.inline
    def MaxSteps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxSteps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ClipperLib.OutPt")
    @js.native
    class OutPt ()
      extends typingsSlinky.jsClipper.ClipperLib.OutPt
    
    @JSGlobal("ClipperLib.OutRec")
    @js.native
    class OutRec ()
      extends typingsSlinky.jsClipper.ClipperLib.OutRec
    
    @JSGlobal("ClipperLib.PI")
    @js.native
    def PI: Double = js.native
    
    @JSGlobal("ClipperLib.PI2")
    @js.native
    def PI2: Double = js.native
    @scala.inline
    def PI2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def PI_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PI")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ClipperLib.PolyFillType")
    @js.native
    object PolyFillType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.PolyFillType with Double] = js.native
      
      /* 0 */ val pftEvenOdd: typingsSlinky.jsClipper.ClipperLib.PolyFillType.pftEvenOdd with Double = js.native
      
      /* 3 */ val pftNegative: typingsSlinky.jsClipper.ClipperLib.PolyFillType.pftNegative with Double = js.native
      
      /* 1 */ val pftNonZero: typingsSlinky.jsClipper.ClipperLib.PolyFillType.pftNonZero with Double = js.native
      
      /* 2 */ val pftPositive: typingsSlinky.jsClipper.ClipperLib.PolyFillType.pftPositive with Double = js.native
    }
    
    @JSGlobal("ClipperLib.PolyOffsetBuilder")
    @js.native
    class PolyOffsetBuilder protected ()
      extends typingsSlinky.jsClipper.ClipperLib.PolyOffsetBuilder {
      def this(
        pts: typingsSlinky.jsClipper.ClipperLib.Polygons,
        solution: Value,
        delta: Double,
        jointype: JoinType,
        MiterLimit: Double,
        AutoFix: Boolean
      ) = this()
    }
    
    @JSGlobal("ClipperLib.PolyType")
    @js.native
    object PolyType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.PolyType with Double] = js.native
      
      /* 1 */ val ptClip: typingsSlinky.jsClipper.ClipperLib.PolyType.ptClip with Double = js.native
      
      /* 0 */ val ptSubject: typingsSlinky.jsClipper.ClipperLib.PolyType.ptSubject with Double = js.native
    }
    
    @JSGlobal("ClipperLib.Polygon")
    @js.native
    class Polygon ()
      extends typingsSlinky.jsClipper.ClipperLib.Polygon {
      def this(poly: ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint]) = this()
    }
    
    @JSGlobal("ClipperLib.Polygons")
    @js.native
    class Polygons ()
      extends typingsSlinky.jsClipper.ClipperLib.Polygons {
      def this(polys: ArrayLike[ArrayLike[typingsSlinky.jsClipper.ClipperLib.IntPoint]]) = this()
    }
    
    @JSGlobal("ClipperLib.Protects")
    @js.native
    object Protects extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.jsClipper.ClipperLib.Protects with Double] = js.native
      
      /* 3 */ val ipBoth: typingsSlinky.jsClipper.ClipperLib.Protects.ipBoth with Double = js.native
      
      /* 1 */ val ipLeft: typingsSlinky.jsClipper.ClipperLib.Protects.ipLeft with Double = js.native
      
      /* 0 */ val ipNone: typingsSlinky.jsClipper.ClipperLib.Protects.ipNone with Double = js.native
      
      /* 2 */ val ipRight: typingsSlinky.jsClipper.ClipperLib.Protects.ipRight with Double = js.native
    }
    
    @JSGlobal("ClipperLib.Scanbeam")
    @js.native
    class Scanbeam ()
      extends typingsSlinky.jsClipper.ClipperLib.Scanbeam
    
    @JSGlobal("ClipperLib.TEdge")
    @js.native
    class TEdge ()
      extends typingsSlinky.jsClipper.ClipperLib.TEdge
    
    @JSGlobal("ClipperLib.biginteger_used")
    @js.native
    def bigintegerUsed: Boolean = js.native
    
    @scala.inline
    def bigintegerUsed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("biginteger_used")(x.asInstanceOf[js.Any])
  }
}
