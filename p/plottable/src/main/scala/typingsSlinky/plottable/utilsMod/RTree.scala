package typingsSlinky.plottable.utilsMod

import typingsSlinky.plottable.interfacesMod.Bounds
import typingsSlinky.plottable.interfacesMod.IEntityBounds
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.rTreeMod.IDistanceFunction
import typingsSlinky.plottable.rTreeMod.QueryPredicateResult
import typingsSlinky.plottable.rTreeSplitStrategiesMod.IRTreeSplitStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/utils", "RTree")
@js.native
object RTree extends js.Object {
  @js.native
  class RTree[T] ()
    extends typingsSlinky.plottable.rTreeMod.RTree[T] {
    def this(maxNodeChildren: Double) = this()
    def this(maxNodeChildren: js.UndefOr[scala.Nothing], splitStrategy: IRTreeSplitStrategy) = this()
    def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
  }
  
  @js.native
  class RTreeBounds protected ()
    extends typingsSlinky.plottable.rTreeMod.RTreeBounds {
    def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
  }
  
  @js.native
  class RTreeNode[T] protected ()
    extends typingsSlinky.plottable.rTreeMod.RTreeNode[T] {
    def this(leaf: Boolean) = this()
  }
  
  def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ typingsSlinky.plottable.rTreeMod.RTreeNode[T], QueryPredicateResult] = js.native
  def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[
    /* a */ typingsSlinky.plottable.rTreeMod.RTreeNode[T], 
    /* b */ typingsSlinky.plottable.rTreeMod.RTreeNode[T], 
    Double
  ] = js.native
  @js.native
  object QueryPredicateResult extends js.Object {
    /* 1 */ val FAIL: typingsSlinky.plottable.rTreeMod.QueryPredicateResult.FAIL with Double = js.native
    /* 0 */ val PASS: typingsSlinky.plottable.rTreeMod.QueryPredicateResult.PASS with Double = js.native
    /* 2 */ val PASS_AND_OVERWRITE: typingsSlinky.plottable.rTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.plottable.rTreeMod.QueryPredicateResult with Double] = js.native
  }
  
  /* static members */
  @js.native
  object RTreeBounds extends js.Object {
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    def absoluteDistanceToFarEdgeX(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the farthest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToFarEdgeY(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the orthogonal absolute distance in the x-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.x` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeX(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the orthogonal absolute distance in the y-dimension from point
      * `p` to the nearest edge of `bounds`.
      *
      * If `p.y` is inside the bounds returns `0`.
      */
    def absoluteDistanceToNearEdgeY(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    def bounds(bounds: Bounds): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    def distanceSquaredToFarEdge(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    /**
      * Returns the distance squared from `p` to the nearest edge of `bounds`. If
      * the point touches or is inside the bounds, returns `0`;
      *
      * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
      */
    def distanceSquaredToNearEdge(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
    def entityBounds(bounds: IEntityBounds): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    /**
      * Returns true if `a` overlaps `b` in the x and y axes.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapBounds(a: typingsSlinky.plottable.rTreeMod.RTreeBounds, b: typingsSlinky.plottable.rTreeMod.RTreeBounds): Boolean = js.native
    /**
      * Returns true if `a` overlaps `b` in the x axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapX(a: typingsSlinky.plottable.rTreeMod.RTreeBounds, b: typingsSlinky.plottable.rTreeMod.RTreeBounds): Boolean = js.native
    /**
      * Returns true if `a` overlaps `b` in the y axis only.
      *
      * Touching counts as overlap.
      */
    def isBoundsOverlapY(a: typingsSlinky.plottable.rTreeMod.RTreeBounds, b: typingsSlinky.plottable.rTreeMod.RTreeBounds): Boolean = js.native
    def pointPair(p0: Point, p1: Point): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    def points(points: js.Array[Point]): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    def union(b0: typingsSlinky.plottable.rTreeMod.RTreeBounds, b1: typingsSlinky.plottable.rTreeMod.RTreeBounds): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    def unionAll(bounds: js.Array[typingsSlinky.plottable.rTreeMod.RTreeBounds]): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    def xywh(x: Double, y: Double, w: Double, h: Double): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
  }
  
  /* static members */
  @js.native
  object RTreeNode extends js.Object {
    def valueNode[T](bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, value: T): typingsSlinky.plottable.rTreeMod.RTreeNode[T] = js.native
  }
  
}

