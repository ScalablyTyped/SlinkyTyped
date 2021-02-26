package typingsSlinky.linq

import typingsSlinky.linq.anon.Dictx
import typingsSlinky.linq.anon.DictxLength
import typingsSlinky.linq.anon.DictxNumberTInner
import typingsSlinky.linq.anon.DictxNumberTResult
import typingsSlinky.linq.anon.DictxNumberU
import typingsSlinky.linq.anon.Key
import typingsSlinky.linq.anon.Length
import typingsSlinky.linq.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Utils {
    
    @JSImport("linq", "Utils.createEnumerable")
    @js.native
    def createEnumerable[T](getEnumerator: js.Function0[IEnumerator[T]]): IEnumerable[T] = js.native
    
    @JSImport("linq", "Utils.createEnumerator")
    @js.native
    def createEnumerator[T](initialize: js.Function0[Unit], tryGetNext: js.Function0[Boolean], dispose: js.Function0[Unit]): IEnumerator[T] = js.native
    
    @JSImport("linq", "Utils.createLambda")
    @js.native
    def createLambda(expression: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
    
    @JSImport("linq", "Utils.extendTo")
    @js.native
    def extendTo(`type`: js.Any): Unit = js.native
    
    @JSImport("linq", "Utils.hasNativeIteratorSupport")
    @js.native
    def hasNativeIteratorSupport(): Boolean = js.native
    
    @JSImport("linq", "Utils.recallFrom")
    @js.native
    def recallFrom(`type`: js.Any): Unit = js.native
  }
  
  @JSImport("linq", "choice")
  @js.native
  def choice[T](params: T*): IEnumerable[T] = js.native
  
  @JSImport("linq", "cycle")
  @js.native
  def cycle[T](params: T*): IEnumerable[T] = js.native
  
  @JSImport("linq", "defer")
  @js.native
  def defer[T](enumerableFactory: js.Function0[IEnumerable[T]]): IEnumerable[T] = js.native
  
  @JSImport("linq", "empty")
  @js.native
  def empty[T](): IEnumerable[T] = js.native
  
  @JSImport("linq", "from")
  @js.native
  def from(): IEnumerable[_] = js.native
  @JSImport("linq", "from")
  @js.native
  def from(obj: String): IEnumerable[String] = js.native
  @JSImport("linq", "from")
  @js.native
  def from(obj: js.Any): IEnumerable[Key] = js.native
  @JSImport("linq", "from")
  @js.native
  def from(obj: Boolean): IEnumerable[Boolean] = js.native
  @JSImport("linq", "from")
  @js.native
  def from(obj: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "from")
  @js.native
  def from[T](obj: js.Array[T]): IEnumerable[T] = js.native
  @JSImport("linq", "from")
  @js.native
  def from[T](obj: Dictx[T]): IEnumerable[T] = js.native
  @JSImport("linq", "from")
  @js.native
  def from[T](obj: IEnumerable[T]): IEnumerable[T] = js.native
  
  @JSImport("linq", "generate")
  @js.native
  def generate[T](func: js.Function0[T]): IEnumerable[T] = js.native
  @JSImport("linq", "generate")
  @js.native
  def generate[T](func: js.Function0[T], count: Double): IEnumerable[T] = js.native
  
  @JSImport("linq", "make")
  @js.native
  def make[T](element: T): IEnumerable[T] = js.native
  
  @JSImport("linq", "matches")
  @js.native
  def matches[T](input: String, pattern: String): IEnumerable[T] = js.native
  @JSImport("linq", "matches")
  @js.native
  def matches[T](input: String, pattern: String, flags: String): IEnumerable[T] = js.native
  @JSImport("linq", "matches")
  @js.native
  def matches[T](input: String, pattern: js.RegExp): IEnumerable[T] = js.native
  
  @JSImport("linq", "range")
  @js.native
  def range(start: Double, count: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "range")
  @js.native
  def range(start: Double, count: Double, step: Double): IEnumerable[Double] = js.native
  
  @JSImport("linq", "rangeDown")
  @js.native
  def rangeDown(start: Double, count: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "rangeDown")
  @js.native
  def rangeDown(start: Double, count: Double, step: Double): IEnumerable[Double] = js.native
  
  @JSImport("linq", "rangeTo")
  @js.native
  def rangeTo(start: Double, to: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "rangeTo")
  @js.native
  def rangeTo(start: Double, to: Double, step: Double): IEnumerable[Double] = js.native
  
  @JSImport("linq", "repeat")
  @js.native
  def repeat[T](element: T): IEnumerable[T] = js.native
  @JSImport("linq", "repeat")
  @js.native
  def repeat[T](element: T, count: Double): IEnumerable[T] = js.native
  
  @JSImport("linq", "repeatWithFinalize")
  @js.native
  def repeatWithFinalize[T](initializer: js.Function0[T], finalizer: js.Function1[/* element */ T, Unit]): IEnumerable[T] = js.native
  
  @JSImport("linq", "toInfinity")
  @js.native
  def toInfinity(): IEnumerable[Double] = js.native
  @JSImport("linq", "toInfinity")
  @js.native
  def toInfinity(start: js.UndefOr[scala.Nothing], step: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "toInfinity")
  @js.native
  def toInfinity(start: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "toInfinity")
  @js.native
  def toInfinity(start: Double, step: Double): IEnumerable[Double] = js.native
  
  @JSImport("linq", "toNegativeInfinity")
  @js.native
  def toNegativeInfinity(): IEnumerable[Double] = js.native
  @JSImport("linq", "toNegativeInfinity")
  @js.native
  def toNegativeInfinity(start: js.UndefOr[scala.Nothing], step: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "toNegativeInfinity")
  @js.native
  def toNegativeInfinity(start: Double): IEnumerable[Double] = js.native
  @JSImport("linq", "toNegativeInfinity")
  @js.native
  def toNegativeInfinity(start: Double, step: Double): IEnumerable[Double] = js.native
  
  @JSImport("linq", "unfold")
  @js.native
  def unfold[T](seed: T, func: js.Function1[/* value */ T, T]): IEnumerable[T] = js.native
  
  @js.native
  trait IDictionary[TKey, TValue] extends StObject {
    
    def add(key: TKey, value: TValue): Unit = js.native
    
    def clear(): Unit = js.native
    
    def contains(key: TKey): Boolean = js.native
    
    def count(): Double = js.native
    
    def get(key: TKey): TValue = js.native
    
    def remove(key: TKey): Unit = js.native
    
    def set(key: TKey, value: TValue): Boolean = js.native
    
    def toEnumerable(): IEnumerable[Value[TKey, TValue]] = js.native
  }
  object IDictionary {
    
    @scala.inline
    def apply[TKey, TValue](
      add: (TKey, TValue) => Unit,
      clear: () => Unit,
      contains: TKey => Boolean,
      count: () => Double,
      get: TKey => TValue,
      remove: TKey => Unit,
      set: (TKey, TValue) => Boolean,
      toEnumerable: () => IEnumerable[Value[TKey, TValue]]
    ): IDictionary[TKey, TValue] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable))
      __obj.asInstanceOf[IDictionary[TKey, TValue]]
    }
    
    @scala.inline
    implicit class IDictionaryMutableBuilder[Self <: IDictionary[_, _], TKey, TValue] (val x: Self with (IDictionary[TKey, TValue])) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (TKey, TValue) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContains(value: TKey => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: TKey => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: TKey => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (TKey, TValue) => Boolean): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToEnumerable(value: () => IEnumerable[Value[TKey, TValue]]): Self = StObject.set(x, "toEnumerable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IDisposableEnumerable[T] extends IEnumerable[T] {
    
    def dispose(): Unit = js.native
  }
  
  @js.native
  trait IEnumerable[T] extends StObject {
    
    def aggregate(func: js.Function2[/* prev */ T, /* current */ T, T]): T = js.native
    def aggregate[TAccumulate](seed: TAccumulate, func: js.Function2[/* prev */ TAccumulate, /* current */ T, TAccumulate]): TAccumulate = js.native
    def aggregate[TAccumulate, TResult](
      seed: TAccumulate,
      func: js.Function2[/* prev */ TAccumulate, /* current */ T, TAccumulate],
      resultSelector: js.Function1[/* last */ TAccumulate, TResult]
    ): TResult = js.native
    
    def all(predicate: js.Function1[/* element */ T, Boolean]): Boolean = js.native
    
    def alternate(alternateSequence: js.Array[T]): IEnumerable[T] = js.native
    def alternate(alternateSequence: Dictx[T]): IEnumerable[T] = js.native
    def alternate(alternateSequence: IEnumerable[T]): IEnumerable[T] = js.native
    def alternate(alternateValue: T): IEnumerable[T] = js.native
    
    def any(): Boolean = js.native
    def any(predicate: js.Function1[/* element */ T, Boolean]): Boolean = js.native
    
    def asEnumerable(): IEnumerable[T] = js.native
    
    def average(): Double = js.native
    def average(selector: js.Function1[/* element */ T, Double]): Double = js.native
    
    def buffer(count: Double): IEnumerable[js.Array[T]] = js.native
    
    def cast[TResult](): IEnumerable[TResult] = js.native
    
    def catchError(handler: js.Function1[/* exception */ js.Any, Unit]): IEnumerable[T] = js.native
    
    def choose(selector: js.Function2[/* element */ T, /* index */ Double, T]): IEnumerable[T] = js.native
    
    def concat(sequences: (Dictx[T] | IEnumerable[T] | T)*): IEnumerable[T] = js.native
    
    def contains(value: T): Boolean = js.native
    def contains[TCompare](value: T, compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
    @JSName("contains")
    def contains_TCompare[TCompare](value: T): Boolean = js.native
    
    def count(): Double = js.native
    def count(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): Double = js.native
    
    def defaultIfEmpty(): IEnumerable[T] = js.native
    def defaultIfEmpty(defaultValue: T): IEnumerable[T] = js.native
    
    def distinct(): IEnumerable[T] = js.native
    def distinct[TCompare](compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    
    def distinctUntilChanged(): IEnumerable[T] = js.native
    def distinctUntilChanged[TCompare](compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    
    def doAction(action: js.Function2[/* element */ T, /* index */ Double, Boolean | Unit]): IEnumerable[T] = js.native
    
    def elementAt(index: Double): T = js.native
    
    def elementAtOrDefault(index: Double): js.UndefOr[T] = js.native
    def elementAtOrDefault(index: Double, defaultValue: T): js.UndefOr[T] = js.native
    
    def except(second: js.Array[T]): IEnumerable[T] = js.native
    def except(second: Dictx[T]): IEnumerable[T] = js.native
    def except(second: IEnumerable[T]): IEnumerable[T] = js.native
    def except[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    def except[TCompare](second: Dictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    def except[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    
    def finallyAction(finallyAction: js.Function0[Unit]): IEnumerable[T] = js.native
    
    def first(): T = js.native
    def first(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
    
    def firstOrDefault(): js.UndefOr[T] = js.native
    def firstOrDefault(defaultValue: T): js.UndefOr[T] = js.native
    def firstOrDefault(predicate: js.UndefOr[scala.Nothing], defaultValue: T): js.UndefOr[T] = js.native
    def firstOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
    def firstOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean], defaultValue: T): js.UndefOr[T] = js.native
    
    def flatten(): IEnumerable[_] = js.native
    
    def forEach(action: js.Function2[/* element */ T, /* index */ Double, Boolean | Unit]): Unit = js.native
    
    def force(): Unit = js.native
    
    def getEnumerator(): IEnumerator[T] = js.native
    
    def groupBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IEnumerable[IGrouping[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement]
    ): IEnumerable[IGrouping[TKey, TElement]] = js.native
    def groupBy[TKey, TElement, TResult](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement],
      resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult]
    ): IEnumerable[TResult] = js.native
    def groupBy[TKey, TElement, TResult, TCompare](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement],
      resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult],
      compareSelector: js.Function1[/* element */ TKey, TCompare]
    ): IEnumerable[TResult] = js.native
    
    def groupJoin[TInner, TKey, TResult](
      inner: js.Array[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult]
    ): IEnumerable[TResult] = js.native
    def groupJoin[TInner, TKey, TResult](
      inner: js.Array[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult],
      compareSelector: js.Function1[/* obj */ T, TKey]
    ): IEnumerable[TResult] = js.native
    def groupJoin[TInner, TKey, TResult](
      inner: DictxNumberTInner[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult]
    ): IEnumerable[TResult] = js.native
    def groupJoin[TInner, TKey, TResult](
      inner: DictxNumberTInner[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult],
      compareSelector: js.Function1[/* obj */ T, TKey]
    ): IEnumerable[TResult] = js.native
    def groupJoin[TInner, TKey, TResult](
      inner: IEnumerable[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult]
    ): IEnumerable[TResult] = js.native
    def groupJoin[TInner, TKey, TResult](
      inner: IEnumerable[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ IEnumerable[TInner], TResult],
      compareSelector: js.Function1[/* obj */ T, TKey]
    ): IEnumerable[TResult] = js.native
    
    def indexOf(item: T): Double = js.native
    def indexOf(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): Double = js.native
    
    def insert(index: Double, second: Dictx[T]): IEnumerable[T] = js.native
    def insert(index: Double, second: IEnumerable[T]): IEnumerable[T] = js.native
    
    def intersect(second: js.Array[T]): IEnumerable[T] = js.native
    def intersect(second: Dictx[T]): IEnumerable[T] = js.native
    def intersect(second: IEnumerable[T]): IEnumerable[T] = js.native
    def intersect[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    def intersect[TCompare](second: Dictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    def intersect[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def join[TInner, TKey, TResult](
      inner: js.Array[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
    ): IEnumerable[TResult] = js.native
    def join[TInner, TKey, TResult](
      inner: js.Array[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
      compareSelector: js.Function1[/* obj */ T, TKey]
    ): IEnumerable[TResult] = js.native
    def join[TInner, TKey, TResult](
      inner: DictxNumberTInner[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
    ): IEnumerable[TResult] = js.native
    def join[TInner, TKey, TResult](
      inner: DictxNumberTInner[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
      compareSelector: js.Function1[/* obj */ T, TKey]
    ): IEnumerable[TResult] = js.native
    def join[TInner, TKey, TResult](
      inner: IEnumerable[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
    ): IEnumerable[TResult] = js.native
    def join[TInner, TKey, TResult](
      inner: IEnumerable[TInner],
      outerKeySelector: js.Function1[/* outer */ T, TKey],
      innerKeySelector: js.Function1[/* inner */ TInner, TKey],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
      compareSelector: js.Function1[/* obj */ T, TKey]
    ): IEnumerable[TResult] = js.native
    
    def last(): T = js.native
    def last(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
    
    def lastIndexOf(item: T): Double = js.native
    def lastIndexOf(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): Double = js.native
    
    def lastOrDefault(): js.UndefOr[T] = js.native
    def lastOrDefault(defaultValue: T): js.UndefOr[T] = js.native
    def lastOrDefault(predicate: js.UndefOr[scala.Nothing], defaultValue: T): js.UndefOr[T] = js.native
    def lastOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
    def lastOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean], defaultValue: T): js.UndefOr[T] = js.native
    
    def letBind[TResult](
      func: js.Function1[
          /* source */ IEnumerable[T], 
          js.Array[TResult] | DictxNumberTResult[TResult] | IEnumerable[TResult]
        ]
    ): IEnumerable[TResult] = js.native
    
    def log(): IEnumerable[T] = js.native
    def log[TValue](selector: js.Function1[/* element */ T, TValue]): IEnumerable[T] = js.native
    
    def max(): Double = js.native
    def max(selector: js.Function1[/* element */ T, Double]): Double = js.native
    
    def maxBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): T = js.native
    
    def memoize(): IDisposableEnumerable[T] = js.native
    
    // last one is selector
    def merge[TResult](params: (js.Array[T] | Dictx[T] | IEnumerable[T])*): IEnumerable[T] = js.native
    
    def min(): Double = js.native
    def min(selector: js.Function1[/* element */ T, Double]): Double = js.native
    
    def minBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): T = js.native
    
    def ofType[TResult](`type`: js.Any): IEnumerable[TResult] = js.native
    
    def orderBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
    def orderBy[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.Function2[/* first */ T, /* second */ T, Double]
    ): IOrderedEnumerable[T] = js.native
    
    def orderByDescending[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
    def orderByDescending[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.Function2[/* first */ T, /* second */ T, Double]
    ): IOrderedEnumerable[T] = js.native
    
    def pairwise[TResult](selector: js.Function2[/* prev */ T, /* current */ T, TResult]): IEnumerable[TResult] = js.native
    
    // :IEnumerable<IGrouping<TKey, T>>
    def partitionBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IEnumerable[IGrouping[TKey, _]] = js.native
    // :IEnumerable<IGrouping<TKey, TElement>>
    def partitionBy[TKey, TElement](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement]
    ): IEnumerable[IGrouping[TKey, TElement]] = js.native
    def partitionBy[TKey, TElement, TResult](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement],
      resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult]
    ): IEnumerable[TResult] = js.native
    def partitionBy[TKey, TElement, TResult, TCompare](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement],
      resultSelector: js.Function2[/* key */ TKey, /* element */ IEnumerable[TElement], TResult],
      compareSelector: js.Function1[/* element */ TKey, TCompare]
    ): IEnumerable[TResult] = js.native
    
    def reverse(): IEnumerable[T] = js.native
    
    def scan(func: js.Function2[/* prev */ T, /* current */ T, T]): IEnumerable[T] = js.native
    def scan[TAccumulate](seed: TAccumulate, func: js.Function2[/* prev */ TAccumulate, /* current */ T, TAccumulate]): IEnumerable[TAccumulate] = js.native
    
    def select[TResult](selector: js.Function2[/* element */ T, /* index */ Double, TResult]): IEnumerable[TResult] = js.native
    
    def selectMany[TOther](
      collectionSelector: js.Function2[
          /* element */ T, 
          /* index */ Double, 
          js.Array[TOther] | IEnumerable[TOther] | Length[TOther]
        ]
    ): IEnumerable[TOther] = js.native
    def selectMany[TCollection, TResult](
      collectionSelector: js.Function2[
          /* element */ T, 
          /* index */ Double, 
          js.Array[TCollection] | DictxLength[TCollection] | IEnumerable[TCollection]
        ],
      resultSelector: js.Function2[/* outer */ T, /* inner */ TCollection, TResult]
    ): IEnumerable[TResult] = js.native
    
    def sequenceEqual(second: js.Array[T]): Boolean = js.native
    def sequenceEqual(second: Dictx[T]): Boolean = js.native
    def sequenceEqual(second: IEnumerable[T]): Boolean = js.native
    def sequenceEqual[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
    def sequenceEqual[TCompare](second: Dictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
    def sequenceEqual[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): Boolean = js.native
    
    def share(): IDisposableEnumerable[T] = js.native
    
    def shuffle(): IEnumerable[T] = js.native
    
    def single(): T = js.native
    def single(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): T = js.native
    
    def singleOrDefault(): js.UndefOr[T] = js.native
    def singleOrDefault(predicate: js.UndefOr[scala.Nothing], defaultValue: T): js.UndefOr[T] = js.native
    def singleOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
    def singleOrDefault(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean], defaultValue: T): js.UndefOr[T] = js.native
    
    def skip(count: Double): IEnumerable[T] = js.native
    
    def skipWhile(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): IEnumerable[T] = js.native
    
    def sum(): Double = js.native
    def sum(selector: js.Function1[/* element */ T, Double]): Double = js.native
    
    def take(count: Double): IEnumerable[T] = js.native
    
    def takeExceptLast(): IEnumerable[T] = js.native
    def takeExceptLast(count: Double): IEnumerable[T] = js.native
    
    def takeFromLast(count: Double): IEnumerable[T] = js.native
    
    def takeWhile(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): IEnumerable[T] = js.native
    
    def toArray(): js.Array[T] = js.native
    
    // :IDictionary<TKey, T>
    def toDictionary[TKey](keySelector: js.Function1[/* element */ T, TKey]): IDictionary[TKey, _] = js.native
    def toDictionary[TKey, TValue](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TValue]
    ): IDictionary[TKey, TValue] = js.native
    def toDictionary[TKey, TValue, TCompare](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TValue],
      compareSelector: js.Function1[/* key */ TKey, TCompare]
    ): IDictionary[TKey, TValue] = js.native
    
    def toJSONString(replacer: js.Array[_]): String = js.native
    def toJSONString(replacer: js.Array[_], space: js.Any): String = js.native
    def toJSONString(replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
    def toJSONString(replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: js.Any): String = js.native
    
    def toJoinedString(): String = js.native
    def toJoinedString(separator: String): String = js.native
    def toJoinedString[TResult](separator: String, selector: js.Function2[/* element */ T, /* index */ Double, TResult]): String = js.native
    
    def toLookup[TKey](keySelector: js.Function1[/* element */ T, TKey]): ILookup[TKey, T] = js.native
    def toLookup[TKey, TElement](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement]
    ): ILookup[TKey, TElement] = js.native
    def toLookup[TKey, TElement, TCompare](
      keySelector: js.Function1[/* element */ T, TKey],
      elementSelector: js.Function1[/* element */ T, TElement],
      compareSelector: js.Function1[/* key */ TKey, TCompare]
    ): ILookup[TKey, TElement] = js.native
    
    def toObject(keySelector: js.Function1[/* element */ T, _]): js.Object = js.native
    def toObject(keySelector: js.Function1[/* element */ T, _], elementSelector: js.Function1[/* element */ T, _]): js.Object = js.native
    
    def trace(): IEnumerable[T] = js.native
    def trace(message: String): IEnumerable[T] = js.native
    def trace[TValue](message: String, selector: js.Function1[/* element */ T, TValue]): IEnumerable[T] = js.native
    
    // Extension Methods
    def traverseBreadthFirst(childrenSelector: js.Function1[/* element */ T, IEnumerable[T]]): IEnumerable[T] = js.native
    def traverseBreadthFirst[TResult](
      childrenSelector: js.Function1[/* element */ T, IEnumerable[T]],
      resultSelector: js.Function2[/* element */ T, /* nestLevel */ Double, TResult]
    ): IEnumerable[TResult] = js.native
    
    def traverseDepthFirst[TResult](childrenSelector: js.Function1[/* element */ T, IEnumerable[T]]): IEnumerable[T] = js.native
    def traverseDepthFirst[TResult](
      childrenSelector: js.Function1[/* element */ T, IEnumerable[T]],
      resultSelector: js.Function2[/* element */ T, /* nestLevel */ Double, TResult]
    ): IEnumerable[TResult] = js.native
    
    def union(second: js.Array[T]): IEnumerable[T] = js.native
    def union(second: Dictx[T]): IEnumerable[T] = js.native
    def union(second: IEnumerable[T]): IEnumerable[T] = js.native
    def union[TCompare](second: js.Array[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    def union[TCompare](second: Dictx[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    def union[TCompare](second: IEnumerable[T], compareSelector: js.Function1[/* element */ T, TCompare]): IEnumerable[T] = js.native
    
    def weightedSample(weightSelector: js.Function1[/* element */ T, Double]): IEnumerable[T] = js.native
    
    def where(predicate: js.Function2[/* element */ T, /* index */ Double, Boolean]): IEnumerable[T] = js.native
    
    def write(): Unit = js.native
    def write(separator: String): Unit = js.native
    def write[TResult](separator: String, selector: js.Function1[/* element */ T, TResult]): Unit = js.native
    
    def writeLine(): Unit = js.native
    def writeLine[TResult](selector: js.Function1[/* element */ T, TResult]): Unit = js.native
    
    def zip[TResult](params: js.Any*): IEnumerable[TResult] = js.native
    def zip[U, TResult](
      second: js.Array[U],
      resultSelector: js.Function3[/* first */ T, /* second */ U, /* index */ Double, TResult]
    ): IEnumerable[TResult] = js.native
    def zip[U, TResult](
      second: DictxNumberU[U],
      resultSelector: js.Function3[/* first */ T, /* second */ U, /* index */ Double, TResult]
    ): IEnumerable[TResult] = js.native
    def zip[U, TResult](
      second: IEnumerable[U],
      resultSelector: js.Function3[/* first */ T, /* second */ U, /* index */ Double, TResult]
    ): IEnumerable[TResult] = js.native
  }
  
  @js.native
  trait IEnumerator[T] extends StObject {
    
    def current(): T = js.native
    
    def dispose(): Unit = js.native
    
    def moveNext(): Boolean = js.native
  }
  object IEnumerator {
    
    @scala.inline
    def apply[T](current: () => T, dispose: () => Unit, moveNext: () => Boolean): IEnumerator[T] = {
      val __obj = js.Dynamic.literal(current = js.Any.fromFunction0(current), dispose = js.Any.fromFunction0(dispose), moveNext = js.Any.fromFunction0(moveNext))
      __obj.asInstanceOf[IEnumerator[T]]
    }
    
    @scala.inline
    implicit class IEnumeratorMutableBuilder[Self <: IEnumerator[_], T] (val x: Self with IEnumerator[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: () => T): Self = StObject.set(x, "current", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoveNext(value: () => Boolean): Self = StObject.set(x, "moveNext", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IGrouping[TKey, TElement] extends IEnumerable[TElement] {
    
    def getSource(): js.Array[TElement] = js.native
    
    def key(): TKey = js.native
  }
  
  @js.native
  trait ILookup[TKey, TElement] extends StObject {
    
    def contains(key: TKey): Boolean = js.native
    
    def count(): Double = js.native
    
    def get(key: TKey): IEnumerable[TElement] = js.native
    
    def toEnumerable(): IEnumerable[IGrouping[TKey, TElement]] = js.native
  }
  object ILookup {
    
    @scala.inline
    def apply[TKey, TElement](
      contains: TKey => Boolean,
      count: () => Double,
      get: TKey => IEnumerable[TElement],
      toEnumerable: () => IEnumerable[IGrouping[TKey, TElement]]
    ): ILookup[TKey, TElement] = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), toEnumerable = js.Any.fromFunction0(toEnumerable))
      __obj.asInstanceOf[ILookup[TKey, TElement]]
    }
    
    @scala.inline
    implicit class ILookupMutableBuilder[Self <: ILookup[_, _], TKey, TElement] (val x: Self with (ILookup[TKey, TElement])) extends AnyVal {
      
      @scala.inline
      def setContains(value: TKey => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: TKey => IEnumerable[TElement]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToEnumerable(value: () => IEnumerable[IGrouping[TKey, TElement]]): Self = StObject.set(x, "toEnumerable", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IOrderedEnumerable[T] extends IEnumerable[T] {
    
    def createOrderedEnumerable[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
    def createOrderedEnumerable[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.UndefOr[scala.Nothing],
      descending: Boolean
    ): IOrderedEnumerable[T] = js.native
    def createOrderedEnumerable[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.Function2[/* first */ T, /* second */ T, Double]
    ): IOrderedEnumerable[T] = js.native
    def createOrderedEnumerable[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.Function2[/* first */ T, /* second */ T, Double],
      descending: Boolean
    ): IOrderedEnumerable[T] = js.native
    
    def thenBy[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
    def thenBy[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.Function2[/* first */ T, /* second */ T, Double]
    ): IOrderedEnumerable[T] = js.native
    
    def thenByDescending[TKey](keySelector: js.Function1[/* element */ T, TKey]): IOrderedEnumerable[T] = js.native
    def thenByDescending[TKey](
      keySelector: js.Function1[/* element */ T, TKey],
      comparer: js.Function2[/* first */ T, /* second */ T, Double]
    ): IOrderedEnumerable[T] = js.native
  }
}
