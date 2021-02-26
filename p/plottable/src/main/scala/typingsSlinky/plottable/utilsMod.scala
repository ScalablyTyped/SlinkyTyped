package typingsSlinky.plottable

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGRect
import typingsSlinky.d3Selection.mod.Selection_
import typingsSlinky.lodash.mod.MemoizedFunction
import typingsSlinky.plottable.anon.Left
import typingsSlinky.plottable.anon.MaximumExtents
import typingsSlinky.plottable.componentMod.Component
import typingsSlinky.plottable.datasetMod.Dataset
import typingsSlinky.plottable.entityStoreMod.IPositionedEntity
import typingsSlinky.plottable.interfacesMod.Bounds
import typingsSlinky.plottable.interfacesMod.IAccessor
import typingsSlinky.plottable.interfacesMod.IEntityBounds
import typingsSlinky.plottable.interfacesMod.Point
import typingsSlinky.plottable.interfacesMod.Range
import typingsSlinky.plottable.interfacesMod.SimpleSelection
import typingsSlinky.plottable.mathUtilsMod.ICssTransformMatrix
import typingsSlinky.plottable.mathUtilsMod.ITranslateVector
import typingsSlinky.plottable.plottableStrings.bottomup
import typingsSlinky.plottable.plottableStrings.topdown
import typingsSlinky.plottable.rTreeMod.IDistanceFunction
import typingsSlinky.plottable.rTreeMod.QueryPredicateResult
import typingsSlinky.plottable.rTreeSplitStrategiesMod.IRTreeSplitStrategy
import typingsSlinky.plottable.stackingUtilsMod.GenericStackingResult
import typingsSlinky.plottable.stackingUtilsMod.IStackingOrder
import typingsSlinky.plottable.stackingUtilsMod.StackingResult
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object Array {
    
    @JSImport("plottable/build/src/utils", "Array.add")
    @js.native
    def add(aList: js.Array[Double], bList: js.Array[Double]): js.Array[Double] = js.native
    
    @JSImport("plottable/build/src/utils", "Array.createFilledArray")
    @js.native
    def createFilledArray[T](value: T, count: Double): js.Array[T] = js.native
    @JSImport("plottable/build/src/utils", "Array.createFilledArray")
    @js.native
    def createFilledArray[T](value: js.Function1[/* index */ js.UndefOr[Double], T], count: Double): js.Array[T] = js.native
    
    @JSImport("plottable/build/src/utils", "Array.flatten")
    @js.native
    def flatten[T](a: js.Array[js.Array[T]]): js.Array[T] = js.native
    
    @JSImport("plottable/build/src/utils", "Array.uniq")
    @js.native
    def uniq[T](arr: js.Array[T]): js.Array[T] = js.native
  }
  
  @JSImport("plottable/build/src/utils", "Bucket")
  @js.native
  class Bucket protected ()
    extends typingsSlinky.plottable.bucketMod.Bucket {
    def this(index: Double, xValue: Double, yValue: Double) = this()
  }
  
  @JSImport("plottable/build/src/utils", "CallbackSet")
  @js.native
  class CallbackSet[CB /* <: js.Function */] ()
    extends typingsSlinky.plottable.callbackSetMod.CallbackSet[CB]
  
  object Color {
    
    @JSImport("plottable/build/src/utils", "Color.colorTest")
    @js.native
    def colorTest(colorTester: SimpleSelection[_], className: String): String = js.native
    
    @JSImport("plottable/build/src/utils", "Color.contrast")
    @js.native
    def contrast(a: String, b: String): Double = js.native
    
    @JSImport("plottable/build/src/utils", "Color.lightenColor")
    @js.native
    def lightenColor(color: String, factor: Double): String = js.native
  }
  
  object DOM {
    
    @JSImport("plottable/build/src/utils", "DOM")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.SCREEN_REFRESH_RATE_MILLISECONDS")
    @js.native
    def SCREEN_REFRESH_RATE_MILLISECONDS: Double = js.native
    @scala.inline
    def SCREEN_REFRESH_RATE_MILLISECONDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_REFRESH_RATE_MILLISECONDS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/utils", "DOM.clientRectInside")
    @js.native
    def clientRectInside(innerClientRect: ClientRect, outerClientRect: ClientRect): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.clientRectsOverlap")
    @js.native
    def clientRectsOverlap(clientRectA: ClientRect, clientRectB: ClientRect): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.contains")
    @js.native
    def contains(parent: Element, child: Element): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.elementBBox")
    @js.native
    def elementBBox(element: SimpleSelection[_]): SVGRect = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.elementHeight")
    @js.native
    def elementHeight(elementOrSelection: Element): Double = js.native
    @JSImport("plottable/build/src/utils", "DOM.elementHeight")
    @js.native
    def elementHeight(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.elementWidth")
    @js.native
    def elementWidth(elementOrSelection: Element): Double = js.native
    @JSImport("plottable/build/src/utils", "DOM.elementWidth")
    @js.native
    def elementWidth(elementOrSelection: Selection_[Element, _, _, _]): Double = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.entityBounds")
    @js.native
    def entityBounds(element: Element): IEntityBounds = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.expandRect")
    @js.native
    def expandRect(rect: ClientRect, amount: Double): Left = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.getElementTransform")
    @js.native
    def getElementTransform(elem: Element): ICssTransformMatrix | Null = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.getHtmlElementAncestors")
    @js.native
    def getHtmlElementAncestors(elem: Element): js.Array[HTMLElement] = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.getRotate")
    @js.native
    def getRotate(el: SimpleSelection[_]): Double = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.getScaleValues")
    @js.native
    def getScaleValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.getTranslateValues")
    @js.native
    def getTranslateValues(el: SimpleSelection[_]): js.Tuple2[Double, Double] = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Double, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Double, bbox: SVGRect, tolerance: Double): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect): Boolean = js.native
    @JSImport("plottable/build/src/utils", "DOM.intersectsBBox")
    @js.native
    def intersectsBBox(xValOrRange: Range, yValOrRange: Range, bbox: SVGRect, tolerance: Double): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "DOM.requestAnimationFramePolyfill")
    @js.native
    def requestAnimationFramePolyfill(callback: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("plottable/build/src/utils", "EntityStore")
  @js.native
  class EntityStore[T /* <: IPositionedEntity */] ()
    extends typingsSlinky.plottable.entityStoreMod.EntityStore[T]
  
  @JSImport("plottable/build/src/utils", "Map")
  @js.native
  class Map[K, V] ()
    extends typingsSlinky.plottable.mapMod.Map[K, V]
  
  object Math {
    
    @JSImport("plottable/build/src/utils", "Math.applyTransform")
    @js.native
    def applyTransform(a: ICssTransformMatrix, p: Point): Point = js.native
    
    @JSImport("plottable/build/src/utils", "Math.boundsIntersects")
    @js.native
    def boundsIntersects(
      aX: Double,
      aY: Double,
      aWidth: Double,
      aHeight: Double,
      bX: Double,
      bY: Double,
      bWidth: Double,
      bHeight: Double
    ): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "Math.clamp")
    @js.native
    def clamp(x: Double, min: Double, max: Double): Double = js.native
    
    @JSImport("plottable/build/src/utils", "Math.degreesToRadians")
    @js.native
    def degreesToRadians(degree: Double): Double = js.native
    
    @JSImport("plottable/build/src/utils", "Math.distanceSquared")
    @js.native
    def distanceSquared(p1: Point, p2: Point): Double = js.native
    
    @JSImport("plottable/build/src/utils", "Math.getCumulativeTransform")
    @js.native
    def getCumulativeTransform(element: Element): ICssTransformMatrix = js.native
    
    @JSImport("plottable/build/src/utils", "Math.inRange")
    @js.native
    def inRange(x: Double, a: Double, b: Double): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "Math.invertMatrix")
    @js.native
    def invertMatrix(a: ICssTransformMatrix): ICssTransformMatrix = js.native
    
    @JSImport("plottable/build/src/utils", "Math.isNaN")
    @js.native
    def isNaN(n: js.Any): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "Math.isValidNumber")
    @js.native
    def isValidNumber(n: js.Any): Boolean = js.native
    
    @JSImport("plottable/build/src/utils", "Math.max")
    @js.native
    def max[C](array: js.Array[C], defaultValue: C): C = js.native
    @JSImport("plottable/build/src/utils", "Math.max")
    @js.native
    def max[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = js.native
    
    @JSImport("plottable/build/src/utils", "Math.min")
    @js.native
    def min[C](array: js.Array[C], defaultValue: C): C = js.native
    @JSImport("plottable/build/src/utils", "Math.min")
    @js.native
    def min[T, C](
      array: js.Array[T],
      accessor: js.Function2[/* t */ js.UndefOr[T], /* i */ js.UndefOr[Double], C],
      defaultValue: C
    ): C = js.native
    
    @JSImport("plottable/build/src/utils", "Math.multiplyMatrix")
    @js.native
    def multiplyMatrix(a: ICssTransformMatrix, b: ICssTransformMatrix): ICssTransformMatrix = js.native
    
    @JSImport("plottable/build/src/utils", "Math.multiplyTranslate")
    @js.native
    def multiplyTranslate(a: ICssTransformMatrix, v: ITranslateVector): ICssTransformMatrix = js.native
    
    @JSImport("plottable/build/src/utils", "Math.premultiplyTranslate")
    @js.native
    def premultiplyTranslate(v: ITranslateVector, b: ICssTransformMatrix): ICssTransformMatrix = js.native
    
    @JSImport("plottable/build/src/utils", "Math.range")
    @js.native
    def range(start: Double, stop: Double): js.Array[Double] = js.native
    @JSImport("plottable/build/src/utils", "Math.range")
    @js.native
    def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
    
    @JSImport("plottable/build/src/utils", "Math.within")
    @js.native
    def within(p: Point, bounds: Bounds): Boolean = js.native
  }
  
  object RTree {
    
    @JSImport("plottable/build/src/utils", "RTree.QueryPredicateResult")
    @js.native
    object QueryPredicateResult extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.plottable.rTreeMod.QueryPredicateResult with Double] = js.native
      
      /* 1 */ val FAIL: typingsSlinky.plottable.rTreeMod.QueryPredicateResult.FAIL with Double = js.native
      
      /* 0 */ val PASS: typingsSlinky.plottable.rTreeMod.QueryPredicateResult.PASS with Double = js.native
      
      /* 2 */ val PASS_AND_OVERWRITE: typingsSlinky.plottable.rTreeMod.QueryPredicateResult.PASS_AND_OVERWRITE with Double = js.native
    }
    
    @JSImport("plottable/build/src/utils", "RTree.RTree")
    @js.native
    class RTree[T] ()
      extends typingsSlinky.plottable.rTreeMod.RTree[T] {
      def this(maxNodeChildren: Double) = this()
      def this(maxNodeChildren: js.UndefOr[scala.Nothing], splitStrategy: IRTreeSplitStrategy) = this()
      def this(maxNodeChildren: Double, splitStrategy: IRTreeSplitStrategy) = this()
    }
    
    @JSImport("plottable/build/src/utils", "RTree.RTreeBounds")
    @js.native
    class RTreeBounds protected ()
      extends typingsSlinky.plottable.rTreeMod.RTreeBounds {
      def this(xl: Double, yl: Double, xh: Double, yh: Double) = this()
    }
    /* static members */
    object RTreeBounds {
      
      /**
        * Returns the orthogonal absolute distance in the x-dimension from point
        * `p` to the farthest edge of `bounds`.
        *
        * If `p.x` is inside the bounds returns `0`.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.absoluteDistanceToFarEdgeX")
      @js.native
      def absoluteDistanceToFarEdgeX(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the orthogonal absolute distance in the y-dimension from point
        * `p` to the farthest edge of `bounds`.
        *
        * If `p.y` is inside the bounds returns `0`.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.absoluteDistanceToFarEdgeY")
      @js.native
      def absoluteDistanceToFarEdgeY(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the orthogonal absolute distance in the x-dimension from point
        * `p` to the nearest edge of `bounds`.
        *
        * If `p.x` is inside the bounds returns `0`.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.absoluteDistanceToNearEdgeX")
      @js.native
      def absoluteDistanceToNearEdgeX(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the orthogonal absolute distance in the y-dimension from point
        * `p` to the nearest edge of `bounds`.
        *
        * If `p.y` is inside the bounds returns `0`.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.absoluteDistanceToNearEdgeY")
      @js.native
      def absoluteDistanceToNearEdgeY(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.bounds")
      @js.native
      def bounds(bounds: Bounds): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.distanceSquaredToFarEdge")
      @js.native
      def distanceSquaredToFarEdge(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      /**
        * Returns the distance squared from `p` to the nearest edge of `bounds`. If
        * the point touches or is inside the bounds, returns `0`;
        *
        * https://gamedev.stackexchange.com/questions/44483/how-do-i-calculate-distance-between-a-point-and-an-axis-aligned-rectangle
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.distanceSquaredToNearEdge")
      @js.native
      def distanceSquaredToNearEdge(bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, p: Point): Double = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.entityBounds")
      @js.native
      def entityBounds(bounds: IEntityBounds): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
      
      /**
        * Returns true if `a` overlaps `b` in the x and y axes.
        *
        * Touching counts as overlap.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.isBoundsOverlapBounds")
      @js.native
      def isBoundsOverlapBounds(a: typingsSlinky.plottable.rTreeMod.RTreeBounds, b: typingsSlinky.plottable.rTreeMod.RTreeBounds): Boolean = js.native
      
      /**
        * Returns true if `a` overlaps `b` in the x axis only.
        *
        * Touching counts as overlap.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.isBoundsOverlapX")
      @js.native
      def isBoundsOverlapX(a: typingsSlinky.plottable.rTreeMod.RTreeBounds, b: typingsSlinky.plottable.rTreeMod.RTreeBounds): Boolean = js.native
      
      /**
        * Returns true if `a` overlaps `b` in the y axis only.
        *
        * Touching counts as overlap.
        */
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.isBoundsOverlapY")
      @js.native
      def isBoundsOverlapY(a: typingsSlinky.plottable.rTreeMod.RTreeBounds, b: typingsSlinky.plottable.rTreeMod.RTreeBounds): Boolean = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.pointPair")
      @js.native
      def pointPair(p0: Point, p1: Point): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.points")
      @js.native
      def points(points: js.Array[Point]): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.union")
      @js.native
      def union(b0: typingsSlinky.plottable.rTreeMod.RTreeBounds, b1: typingsSlinky.plottable.rTreeMod.RTreeBounds): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.unionAll")
      @js.native
      def unionAll(bounds: js.Array[typingsSlinky.plottable.rTreeMod.RTreeBounds]): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeBounds.xywh")
      @js.native
      def xywh(x: Double, y: Double, w: Double, h: Double): typingsSlinky.plottable.rTreeMod.RTreeBounds = js.native
    }
    
    @JSImport("plottable/build/src/utils", "RTree.RTreeNode")
    @js.native
    class RTreeNode[T] protected ()
      extends typingsSlinky.plottable.rTreeMod.RTreeNode[T] {
      def this(leaf: Boolean) = this()
    }
    /* static members */
    object RTreeNode {
      
      @JSImport("plottable/build/src/utils", "RTree.RTreeNode.valueNode")
      @js.native
      def valueNode[T](bounds: typingsSlinky.plottable.rTreeMod.RTreeBounds, value: T): typingsSlinky.plottable.rTreeMod.RTreeNode[T] = js.native
    }
    
    @JSImport("plottable/build/src/utils", "RTree.createMinimizingNodePredicate")
    @js.native
    def createMinimizingNodePredicate[T](point: Point, nearFn: IDistanceFunction, farFn: IDistanceFunction): js.Function1[/* node */ typingsSlinky.plottable.rTreeMod.RTreeNode[T], QueryPredicateResult] = js.native
    
    @JSImport("plottable/build/src/utils", "RTree.createNodeSort")
    @js.native
    def createNodeSort[T](point: Point, distanceFn: IDistanceFunction): js.Function2[
        /* a */ typingsSlinky.plottable.rTreeMod.RTreeNode[T], 
        /* b */ typingsSlinky.plottable.rTreeMod.RTreeNode[T], 
        Double
      ] = js.native
  }
  
  @JSImport("plottable/build/src/utils", "Set")
  @js.native
  class Set[T] ()
    extends typingsSlinky.plottable.setMod.Set[T]
  
  object Stacking {
    
    object IStackingOrder {
      
      @JSImport("plottable/build/src/utils", "Stacking.IStackingOrder")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("plottable/build/src/utils", "Stacking.IStackingOrder.bottomup")
      @js.native
      def bottomup: typingsSlinky.plottable.plottableStrings.bottomup = js.native
      @scala.inline
      def bottomup_=(x: bottomup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomup")(x.asInstanceOf[js.Any])
      
      @JSImport("plottable/build/src/utils", "Stacking.IStackingOrder.topdown")
      @js.native
      def topdown: typingsSlinky.plottable.plottableStrings.topdown = js.native
      @scala.inline
      def topdown_=(x: topdown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topdown")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("plottable/build/src/utils", "Stacking.normalizeKey")
    @js.native
    val normalizeKey: (js.Function1[/* key */ js.Any, String]) with MemoizedFunction = js.native
    
    @JSImport("plottable/build/src/utils", "Stacking.stack")
    @js.native
    def stack(datasets: js.Array[Dataset], keyAccessor: IAccessor[_], valueAccessor: IAccessor[Double]): StackingResult = js.native
    @JSImport("plottable/build/src/utils", "Stacking.stack")
    @js.native
    def stack(
      datasets: js.Array[Dataset],
      keyAccessor: IAccessor[_],
      valueAccessor: IAccessor[Double],
      stackingOrder: IStackingOrder
    ): StackingResult = js.native
    
    @JSImport("plottable/build/src/utils", "Stacking.stackedExtent")
    @js.native
    def stackedExtent(stackingResult: StackingResult, keyAccessor: IAccessor[_], filter: IAccessor[Boolean]): js.Array[Double] = js.native
    
    @JSImport("plottable/build/src/utils", "Stacking.stackedExtents")
    @js.native
    def stackedExtents[D](stackingResult: GenericStackingResult[D]): MaximumExtents[D] = js.native
  }
  
  @JSImport("plottable/build/src/utils", "Translator")
  @js.native
  class Translator protected ()
    extends typingsSlinky.plottable.transformAwareTranslatorMod.Translator {
    def this(_rootElement: HTMLElement) = this()
  }
  /* static members */
  object Translator {
    
    /**
      * Is the event's target part of the given component's DOM tree?
      */
    @JSImport("plottable/build/src/utils", "Translator.isEventInside")
    @js.native
    def isEventInside(component: Component, e: Event): Boolean = js.native
  }
  
  object Window {
    
    @JSImport("plottable/build/src/utils", "Window.debounce")
    @js.native
    def debounce[T /* <: js.Function */](msec: Double, callback: T): T = js.native
    @JSImport("plottable/build/src/utils", "Window.debounce")
    @js.native
    def debounce[T /* <: js.Function */](msec: Double, callback: T, context: js.Any): T = js.native
    
    @JSImport("plottable/build/src/utils", "Window.deprecated")
    @js.native
    def deprecated(callingMethod: String, version: String): Unit = js.native
    @JSImport("plottable/build/src/utils", "Window.deprecated")
    @js.native
    def deprecated(callingMethod: String, version: String, message: String): Unit = js.native
    
    @JSImport("plottable/build/src/utils", "Window.setTimeout")
    @js.native
    def setTimeout(f: js.Function, time: Double, args: js.Any*): Double = js.native
    
    @JSImport("plottable/build/src/utils", "Window.warn")
    @js.native
    def warn(warning: String): Unit = js.native
  }
  
  @JSImport("plottable/build/src/utils", "assign")
  @js.native
  def assign[T /* <: Record[_, _] */](objs: Partial[T]*): T = js.native
  
  @JSImport("plottable/build/src/utils", "coerceExternalD3")
  @js.native
  def coerceExternalD3[S /* <: Selection_[_, _, _, _] */](externalD3Selection: S): S = js.native
  
  @JSImport("plottable/build/src/utils", "getTranslator")
  @js.native
  def getTranslator(component: Component): typingsSlinky.plottable.transformAwareTranslatorMod.Translator = js.native
}
