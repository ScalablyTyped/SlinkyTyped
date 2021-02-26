package typingsSlinky.devexpressUtils

import typingsSlinky.devexpressUtils.anon.Interval
import typingsSlinky.devexpressUtils.anon.IntervalConstInterval
import typingsSlinky.devexpressUtils.constMod.ConstInterval
import typingsSlinky.devexpressUtils.fixedMod.FixedInterval
import typingsSlinky.devexpressUtils.intervalsMod.SparseIntervals
import typingsSlinky.devexpressUtils.mutableMod.MutableInterval
import typingsSlinky.devexpressUtils.reproducibleMod.IReproducibleInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmsMod {
  
  @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms")
  @js.native
  class IntervalAlgorithms () extends StObject
  /* static members */
  object IntervalAlgorithms {
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjects")
    @js.native
    def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](objects: js.Array[TObj], intervals: js.Array[T with IReproducibleInterval[T]]): SparseIntervals[T] = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjects")
    @js.native
    def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](
      objects: js.Array[TObj],
      intervals: js.Array[T with IReproducibleInterval[T]],
      getFirstIndex: js.UndefOr[scala.Nothing],
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[T] = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjects")
    @js.native
    def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](
      objects: js.Array[TObj],
      intervals: js.Array[T with IReproducibleInterval[T]],
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double]
    ): SparseIntervals[T] = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjects")
    @js.native
    def getAffectedObjects[T /* <: MutableInterval */, TObj /* <: Interval[T] */](
      objects: js.Array[TObj],
      intervals: js.Array[T with IReproducibleInterval[T]],
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double],
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[T] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjectsTemplate")
    @js.native
    def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](objects: js.Array[TObj], intervals: js.Array[ConstInterval], template: TemplateT): SparseIntervals[ResultIntervalT] = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjectsTemplate")
    @js.native
    def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[ConstInterval],
      template: TemplateT,
      getFirstIndex: js.UndefOr[scala.Nothing],
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[ResultIntervalT] = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjectsTemplate")
    @js.native
    def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[ConstInterval],
      template: TemplateT,
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double]
    ): SparseIntervals[ResultIntervalT] = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getAffectedObjectsTemplate")
    @js.native
    def getAffectedObjectsTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[ConstInterval],
      template: TemplateT,
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double],
      conflictResolver: js.Function3[
          /* objectInterval */ ConstInterval, 
          /* touchingIntervalLength */ Double, 
          /* touchPoint */ Double, 
          Boolean
        ]
    ): SparseIntervals[ResultIntervalT] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getIntersection")
    @js.native
    def getIntersection[T /* <: ConstInterval */](intervalA: T with IReproducibleInterval[T], intervalB: T): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getIntersectionNonNullLength")
    @js.native
    def getIntersectionNonNullLength[T /* <: ConstInterval */](intervalA: T with IReproducibleInterval[T], intervalB: ConstInterval): T | Null = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getIntersectionNonNullLengthTemplate")
    @js.native
    def getIntersectionNonNullLengthTemplate[ResultIntervalT /* <: ConstInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */](intervalA: ConstInterval, intervalB: ConstInterval, template: TemplateT): ResultIntervalT | Null = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getIntersectionTemplate")
    @js.native
    def getIntersectionTemplate[ResultIntervalT /* <: ConstInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */](intervalA: ConstInterval, intervalB: ConstInterval, template: TemplateT): ResultIntervalT | Null = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getIntersectionsTwoArraysOfInterval")
    @js.native
    def getIntersectionsTwoArraysOfInterval[T /* <: MutableInterval */](intervalsA: js.Array[T with IReproducibleInterval[T]], intervalsB: js.Array[ConstInterval]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getIntersectionsTwoArraysOfIntervalTemplate")
    @js.native
    def getIntersectionsTwoArraysOfIntervalTemplate[ResultIntervalT /* <: MutableInterval */, TemplateT /* <: IReproducibleInterval[ResultIntervalT] */](intervalsA: js.Array[ConstInterval], intervalsB: js.Array[ConstInterval], template: TemplateT): js.Array[ResultIntervalT] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getMergedIntervals")
    @js.native
    def getMergedIntervals[T /* <: ConstInterval */](intervals: js.Array[T with IReproducibleInterval[T]], needSort: Boolean): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.getMergedIntervalsTemplate")
    @js.native
    def getMergedIntervalsTemplate[ResultIntervalT /* <: ConstInterval */](
      intervals: js.Array[ConstInterval],
      needSort: Boolean,
      template: IReproducibleInterval[ResultIntervalT]
    ): js.Array[ResultIntervalT] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.handleAffectedObjects")
    @js.native
    def handleAffectedObjects[IntervalT /* <: ConstInterval */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[IntervalT],
      callback: js.Function4[
          /* obj */ TObj, 
          /* index */ Double, 
          /* interval */ IntervalT, 
          /* intersection */ ConstInterval, 
          Unit
        ]
    ): Unit = js.native
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.handleAffectedObjects")
    @js.native
    def handleAffectedObjects[IntervalT /* <: ConstInterval */, TObj /* <: IntervalConstInterval */](
      objects: js.Array[TObj],
      intervals: js.Array[IntervalT],
      callback: js.Function4[
          /* obj */ TObj, 
          /* index */ Double, 
          /* interval */ IntervalT, 
          /* intersection */ ConstInterval, 
          Unit
        ],
      getFirstIndex: js.Function2[/* start */ Double, /* objects */ js.Array[TObj], Double]
    ): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.oneConstainsOtherArraysOfInterval")
    @js.native
    def oneConstainsOtherArraysOfInterval(mergedIntervalsA: js.Array[FixedInterval], intervalsB: js.Array[FixedInterval]): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.reflectIntervals")
    @js.native
    def reflectIntervals[T /* <: ConstInterval */](intervals: js.Array[T], bounds: T with IReproducibleInterval[T]): js.Array[T] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.reflectIntervalsTemplate")
    @js.native
    def reflectIntervalsTemplate[ResultT /* <: ConstInterval */](
      intervals: js.Array[ConstInterval],
      bounds: ConstInterval,
      template: IReproducibleInterval[ResultT]
    ): js.Array[ResultT] = js.native
    
    @JSImport("@devexpress/utils/lib/intervals/algorithms", "IntervalAlgorithms.reflectionOfPointOnInterval")
    @js.native
    def reflectionOfPointOnInterval(value: Double, valInterval: FixedInterval, targetInterval: FixedInterval): Double = js.native
  }
}
