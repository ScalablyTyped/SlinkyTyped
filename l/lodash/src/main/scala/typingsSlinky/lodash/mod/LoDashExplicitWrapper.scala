package typingsSlinky.lodash.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.lodash.anon.Typeoflodash
import typingsSlinky.lodash.lodashBooleans.`false`
import typingsSlinky.lodash.lodashBooleans.`true`
import typingsSlinky.lodash.lodashStrings.asc
import typingsSlinky.lodash.lodashStrings.desc
import typingsSlinky.std.Exclude
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoDashExplicitWrapper[TValue] extends LoDashWrapper[TValue] {
  
  /**
    * @see _.add
    */
  def add(addend: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.after
    **/
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashExplicitWrapper[TFunc] = js.native
  
  /**
    * @see _.ary
    */
  def ary(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def ary(n: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.assign
    */
  def assign(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assign
    */
  def assign(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assign
    */
  def assign[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assign
    */
  def assign[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.assignIn
    */
  def assignIn(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignIn
    */
  def assignIn[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.assignInWith
    */
  def assignInWith(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.assignWith
    */
  def assignWith(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see assignWith
    */
  def assignWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.at
    */
  def at[T](props: PropertyPath*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.at
    */
  @JSName("at")
  def at_T_Object[T /* <: js.Object */](props: (Many[/* keyof T */ String])*): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.attempt
    */
  def attempt[TResult](args: js.Any*): LoDashExplicitWrapper[TResult | js.Error] = js.native
  
  /**
    * @see _.before
    **/
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LoDashExplicitWrapper[TFunc] = js.native
  
  /**
    * @see _.bind
    */
  def bind(thisArg: js.Any, partials: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.bindKey
    */
  def bindKey(key: String, partials: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.camelCase
    */
  def camelCase(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.capitalize
    */
  def capitalize(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.ceil
    */
  def ceil(): LoDashExplicitWrapper[Double] = js.native
  def ceil(precision: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): this.type = js.native
  
  /**
    * @see _.chunk
    */
  def chunk[T](): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  def chunk[T](size: Double): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  
  /**
    * @see _.clamp
    */
  def clamp(lower: Double, upper: Double): LoDashExplicitWrapper[Double] = js.native
  def clamp(upper: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.cloneDeep
    */
  def cloneDeep(): this.type = js.native
  
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(): this.type = js.native
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith(customizer: CloneDeepWithCustomizer[TValue]): LoDashExplicitWrapper[_] = js.native
  
  /**
    * @see _.cloneWith
    */
  def cloneWith(): this.type = js.native
  /**
    * @see _.cloneWith
    */
  def cloneWith[TResult](customizer: CloneWithCustomizer[TValue, js.UndefOr[TResult]]): LoDashExplicitWrapper[TResult | TValue] = js.native
  /**
    * @see _.cloneWith
    */
  @JSName("cloneWith")
  def cloneWith_TResult_UnionObjectStringDoubleBooleanNull[TResult /* <: js.Object | String | Double | Boolean | Null */](customizer: CloneWithCustomizer[TValue, TResult]): LoDashExplicitWrapper[TResult] = js.native
  
  /**
    * @see _.compact
    */
  def compact[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.compact
    */
  def concat[T](values: Many[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.conforms
    */
  def conforms[T](): LoDashExplicitWrapper[js.Function1[/* value */ T, Boolean]] = js.native
  
  /**
    * @see _.conformsTo
    */
  def conformsTo[T](source: ConformsPredicateObject[T]): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.constant
    */
  def constant(): LoDashExplicitWrapper[js.Function0[TValue]] = js.native
  
  /**
    * @see _.countBy
    */
  def countBy[T](): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  def countBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  /**
    * @see _.countBy
    */
  @JSName("countBy")
  def countBy_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  @JSName("countBy")
  def countBy_T_Object[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashExplicitWrapper[Dictionary[Double]] = js.native
  
  /**
    * @see _.create
    */
  def create[U /* <: js.Object */](): LoDashExplicitWrapper[TValue with U] = js.native
  def create[U /* <: js.Object */](properties: U): LoDashExplicitWrapper[TValue with U] = js.native
  
  /**
    * @see _.curry
    **/
  def curry(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curry(arity: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.curryRight
    **/
  def curryRight(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def curryRight(arity: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1R[T1, R](): LoDashExplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1R[T1, R](arity: Double): LoDashExplicitWrapper[RightCurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](): LoDashExplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2R[T1, T2, R](arity: Double): LoDashExplicitWrapper[RightCurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](): LoDashExplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3R[T1, T2, T3, R](arity: Double): LoDashExplicitWrapper[RightCurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](): LoDashExplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4R[T1, T2, T3, T4, R](arity: Double): LoDashExplicitWrapper[RightCurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curryRight
    **/
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](): LoDashExplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  @JSName("curryRight")
  def curryRight_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](arity: Double): LoDashExplicitWrapper[RightCurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1R[T1, R](): LoDashExplicitWrapper[CurriedFunction1[T1, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2R[T1, T2, R](): LoDashExplicitWrapper[CurriedFunction2[T1, T2, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3R[T1, T2, T3, R](): LoDashExplicitWrapper[CurriedFunction3[T1, T2, T3, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4R[T1, T2, T3, T4, R](): LoDashExplicitWrapper[CurriedFunction4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.curry
    **/
  @JSName("curry")
  def curry_T1T2T3T4T5R[T1, T2, T3, T4, T5, R](): LoDashExplicitWrapper[CurriedFunction5[T1, T2, T3, T4, T5, R]] = js.native
  
  /**
    * @see _.debounce
    */
  def debounce(): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: js.UndefOr[scala.Nothing], options: DebounceSettings): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: Double): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def debounce(wait: Double, options: DebounceSettings): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  
  /**
    * @see _.deburr
    */
  def deburr(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.defaultTo
    */
  def defaultTo[T](defaultValue: T): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def defaultTo_TTDefault[T, TDefault](defaultValue: TDefault): LoDashExplicitWrapper[T | TDefault] = js.native
  
  /**
    * @see _.defaults
    */
  def defaults(): LoDashExplicitWrapper[NonNullable[TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults(sources: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource](source: TSource): LoDashExplicitWrapper[NonNullable[TSource with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[NonNullable[TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[NonNullable[TSource3 with TSource2 with TSource1 with TValue]] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[NonNullable[TSource4 with TSource3 with TSource2 with TSource1 with TValue]] = js.native
  
  /**
    * @see _.defaultsDeep
    **/
  def defaultsDeep(sources: js.Any*): LoDashExplicitWrapper[_] = js.native
  
  /**
    * @see _.defer
    */
  def defer(args: js.Any*): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.delay
    */
  def delay(wait: Double, args: js.Any*): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.difference
    */
  def difference[T](values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.differenceBy
    */
  def differenceBy[T](values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2](values: List[T2], iteratee: ValueIteratee[T1 | T2]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3](values1: List[T2], values2: List[T3], iteratee: ValueIteratee[T1 | T2 | T3]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4](
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5](
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6](
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): LoDashExplicitWrapper[js.Array[T1]] = js.native
  
  /**
    * @see _.differenceWith
    */
  def differenceWith[T](values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2](values: List[T2], comparator: Comparator2[T1, T2]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3](values1: List[T2], values2: List[T3], comparator: Comparator2[T1, T2 | T3]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3, T4](values1: List[T2], values2: List[T3], values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*): LoDashExplicitWrapper[js.Array[T1]] = js.native
  
  /**
    * @see _.divide
    */
  def divide(divisor: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.drop
    */
  def drop[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def drop[T](n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.dropRight
    */
  def dropRight[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def dropRight[T](n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.dropRightWhile
    */
  def dropRightWhile[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def dropRightWhile[T](predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.dropWhile
    */
  def dropWhile[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def dropWhile[T](predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.endsWith
    */
  def endsWith(): LoDashExplicitWrapper[Boolean] = js.native
  def endsWith(target: js.UndefOr[scala.Nothing], position: Double): LoDashExplicitWrapper[Boolean] = js.native
  def endsWith(target: String): LoDashExplicitWrapper[Boolean] = js.native
  def endsWith(target: String, position: Double): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.toPairs
    */
  def entries(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  
  /**
    * @see _.entriesIn
    */
  def entriesIn(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.entriesIn
    */
  @JSName("entriesIn")
  def entriesIn_T[T](): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  
  /**
    * @see _.toPairs
    */
  @JSName("entries")
  def entries_T[T](): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  
  /**
    * @see _.eq
    */
  def eq(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.escape
    */
  def escape(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.escapeRegExp
    */
  def escapeRegExp(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.every
    */
  def every[T](): LoDashExplicitWrapper[Boolean] = js.native
  def every[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.every
    */
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[Boolean] = js.native
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.extend
    */
  def extend(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.extend
    */
  def extend(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extend
    */
  def extend[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.extendWith
    */
  def extendWith(): LoDashExplicitWrapper[TValue] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource](source: TSource, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: AssignCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.fill
    */
  def fill[T](value: T): LoDashExplicitWrapper[js.Array[T]] = js.native
  def fill[T, U](value: T, start: js.UndefOr[scala.Nothing], end: Double): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  def fill[T, U](value: T, start: Double): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  def fill[T, U](value: T, start: Double, end: Double): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  /**
    * @see _.fill
    */
  @JSName("fill")
  def fill_TU[T, U](value: T): LoDashExplicitWrapper[js.Array[T | U]] = js.native
  
  /**
    * @see _.filter
    */
  def filter(): LoDashExplicitWrapper[js.Array[String]] = js.native
  def filter(predicate: StringIterator[Boolean]): LoDashExplicitWrapper[js.Array[String]] = js.native
  def filter[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.Array[S]] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("filter")
  def filter_T_Object[T /* <: js.Object */](predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.Array[S]] = js.native
  
  /**
    * @see _.find
    */
  def find[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def find[T](predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def find[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.find
    */
  def find[T, S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  def find[T, S /* <: T */](predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  
  /**
    * @see _.findIndex
    */
  def findIndex[T](): LoDashExplicitWrapper[Double] = js.native
  def findIndex[T](predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): LoDashExplicitWrapper[Double] = js.native
  def findIndex[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.findKey
    */
  def findKey[T](): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  def findKey[T](predicate: ObjectIteratee[T]): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  
  /**
    * @see _.findLast
    */
  def findLast[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def findLast[T](predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def findLast[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T, S /* <: T */](predicate: ListIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  def findLast[T, S /* <: T */](predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  
  /**
    * @see _.findLastIndex
    */
  def findLastIndex[T](): LoDashExplicitWrapper[Double] = js.native
  def findLastIndex[T](predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): LoDashExplicitWrapper[Double] = js.native
  def findLastIndex[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.findLastKey
    */
  def findLastKey[T](): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  def findLastKey[T](predicate: ObjectIteratee[T]): LoDashExplicitWrapper[js.UndefOr[String]] = js.native
  
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  @JSName("findLast")
  def findLast_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S]): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  @JSName("find")
  def find_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): LoDashExplicitWrapper[js.UndefOr[S]] = js.native
  
  /**
    * @see _.head
    */
  def first[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T /* <: js.Object */, TResult](iteratee: ObjectIterator[T, Many[TResult]]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T /* <: js.Object */, TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDeep
    */
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  def flatMapDepth(iteratee: String, depth: Double): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  def flatMapDepth(iteratee: js.Object, depth: Double): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T /* <: js.Object */, TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.flatMapDepth
    */
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: Double): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.flatMap
    */
  @JSName("flatMap")
  def flatMap_T[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.flatMap
    */
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](iteratee: ListIterator[T, Many[TResult]]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.flatten
    */
  def flatten[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.flattenDeep
    */
  def flattenDeep[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.flattenDeep
    */
  def flattenDepth[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def flattenDepth[T](depth: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.floor
    */
  def floor(): LoDashExplicitWrapper[Double] = js.native
  def floor(precision: Double): LoDashExplicitWrapper[Double] = js.native
  
  def flow(funcs: js.Array[Many[js.Function1[/* a */ _, _]]]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flow
    */
  // 0-argument first function
  def flow[R1, R2](f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function0[R2]] = js.native
  def flow[R1, R2, R3](f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): LoDashExplicitWrapper[js.Function0[R3]] = js.native
  def flow[R1, R2, R3, R4](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function0[R4]] = js.native
  def flow[R1, R2, R3, R4, R5](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function0[R5]] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function0[R6]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function0[R7]] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function0[_]] = js.native
  
  def flowRight(
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (Many[js.Function1[/* repeated */ _, _]])*
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def flowRight(funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  /**
    * @see _.flowRight
    */
  // 0-argument first function
  def flowRight[R2, R1](f1: js.Function0[R1]): LoDashExplicitWrapper[js.Function0[R2]] = js.native
  // any-argument first function
  def flowRight[R2, R1](f1: js.Function1[/* repeated */ js.Any, R1]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R2]] = js.native
  def flowRight[R3, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function0[R1]): LoDashExplicitWrapper[js.Function0[R3]] = js.native
  def flowRight[R3, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* repeated */ js.Any, R1]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R3]] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  def flowRight[R4, R3, R2, R1](f3: js.Function1[/* a */ R2, R3], f2: js.Function1[/* a */ R1, R2], f1: js.Function0[R1]): LoDashExplicitWrapper[js.Function0[R4]] = js.native
  def flowRight[R4, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R4]] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  def flowRight[A1, A2, R3, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R5]] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R5]] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R6]] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): LoDashExplicitWrapper[js.Function0[R7]] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): LoDashExplicitWrapper[js.Function1[/* repeated */ _, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](f1: js.Function1[/* a1 */ A1, R1]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* a1 */ A1, R1]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  
  // 4-argument first function
  // any-argument first function
  @JSName("flow")
  def flow_A1A2A3A4R1R2[A1, A2, A3, A4, R1, R2](f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3[A1, A2, A3, A4, R1, R2, R3](f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4[A1, A2, A3, A4, R1, R2, R3, R4](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3A4R1R2R3R4R5R6R7[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _]] = js.native
  // 3-argument first function
  @JSName("flow")
  def flow_A1A2A3R1R2[A1, A2, A3, R1, R2](f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3[A1, A2, A3, R1, R2, R3](f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4[A1, A2, A3, R1, R2, R3, R4](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5[A1, A2, A3, R1, R2, R3, R4, R5](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7]] = js.native
  @JSName("flow")
  def flow_A1A2A3R1R2R3R4R5R6R7[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _]] = js.native
  // 2-argument first function
  @JSName("flow")
  def flow_A1A2R1R2[A1, A2, R1, R2](f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R2]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3[A1, A2, R1, R2, R3](f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R3]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4[A1, A2, R1, R2, R3, R4](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R4]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5[A1, A2, R1, R2, R3, R4, R5](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R5]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6[A1, A2, R1, R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R6]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, R7]] = js.native
  @JSName("flow")
  def flow_A1A2R1R2R3R4R5R6R7[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, _]] = js.native
  // 1-argument first function
  @JSName("flow")
  def flow_A1R1R2[A1, R1, R2](f2: js.Function1[/* a */ R1, R2]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R2]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3[A1, R1, R2, R3](f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R3]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4[A1, R1, R2, R3, R4](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R4]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5[A1, R1, R2, R3, R4, R5](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R5]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6[A1, R1, R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R6]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, R7]] = js.native
  @JSName("flow")
  def flow_A1R1R2R3R4R5R6R7[A1, R1, R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, _]] = js.native
  
  /**
    @see _.fromPairs
    */
  def fromPairs(): LoDashExplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.fromPairs
    */
  @JSName("fromPairs")
  def fromPairs_T[T](): LoDashExplicitWrapper[Dictionary[T]] = js.native
  
  /**
    * @see _.functions
    */
  def functions(): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.functionsIn
    */
  def functionsIn(): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.get
    */
  def get(path: PropertyPath): LoDashExplicitWrapper[js.UndefOr[scala.Nothing]] = js.native
  def get(path: PropertyPath, defaultValue: js.Any): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.get
    */
  def get[TKey /* <: /* keyof TValue */ String */](path: TKey): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey] */ js.Any
  ] = js.native
  def get[TKey /* <: /* keyof TValue */ String */](path: js.Array[TKey]): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[T](path: Double): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.get
    */
  def get[TDefault](path: PropertyPath, defaultValue: TDefault): LoDashExplicitWrapper[TDefault] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof TValue */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey1][TKey2] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[T, TDefault](path: Double, defaultValue: TDefault): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](path: TKey, defaultValue: TDefault): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](path: js.Array[TKey], defaultValue: TDefault): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof TValue */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TKey1 /* <: /* keyof TValue */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TValue[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply Failed type conversion: TValue[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: TDefault): LoDashExplicitWrapper[
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TObject_ObjectTKey_String[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](path: TKey): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
    ]
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey_String[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](path: js.Array[TKey]): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.groupBy
    */
  def groupBy[T](): LoDashExplicitWrapper[Dictionary[js.Array[T]]] = js.native
  def groupBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Dictionary[js.Array[T]]] = js.native
  /**
    * @see _.groupBy
    */
  @JSName("groupBy")
  def groupBy_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  @JSName("groupBy")
  def groupBy_T_Object[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashExplicitWrapper[
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ] = js.native
  
  /**
    * @see _.gt
    */
  def gt(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.gte
    */
  def gte(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.has
    */
  def has(path: PropertyPath): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.hasIn
    */
  def hasIn(path: PropertyPath): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.head
    */
  def head[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.identity
    */
  def identity(): this.type = js.native
  
  /**
    * @see _.inRange
    */
  def inRange(start: Double): LoDashExplicitWrapper[Boolean] = js.native
  def inRange(start: Double, end: Double): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.includes
    */
  def includes[T](target: T): LoDashExplicitWrapper[Boolean] = js.native
  def includes[T](target: T, fromIndex: Double): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.indexOf
    */
  def indexOf[T](value: T): LoDashExplicitWrapper[Double] = js.native
  def indexOf[T](value: T, fromIndex: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.initial
    */
  def initial[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.intersection
    */
  def intersection[T](arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](values: (List[T2] | (ValueIteratee[T1 | T2]))*): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2](values: List[T2], iteratee: ValueIteratee[T1 | T2]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3](values1: List[T2], values2: List[T3], iteratee: ValueIteratee[T1 | T2 | T3]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3, T4](values1: List[T2], values2: List[T3], values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*): LoDashExplicitWrapper[js.Array[T1]] = js.native
  
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T](values: List[T]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2](values: List[T2], comparator: Comparator2[T1, T2]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3](values1: List[T2], values2: List[T3], comparator: Comparator2[T1, T2 | T3]): LoDashExplicitWrapper[js.Array[T1]] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3, T4](values1: List[T2], values2: List[T3], values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*): LoDashExplicitWrapper[js.Array[T1]] = js.native
  
  /**
    * @see _.invert
    */
  def invert(): LoDashExplicitWrapper[Dictionary[String]] = js.native
  
  /**
    * @see _.invertBy
    */
  def invertBy[T](): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  def invertBy[T](interatee: ValueIteratee[T]): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  /**
    * @see _.invertBy
    */
  @JSName("invertBy")
  def invertBy_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  @JSName("invertBy")
  def invertBy_T_Object[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashExplicitWrapper[Dictionary[js.Array[String]]] = js.native
  
  /**
    * @see _.invoke
    **/
  def invoke(path: PropertyPath, args: js.Any*): LoDashExplicitWrapper[_] = js.native
  
  /**
    * @see _.invokeMap
    **/
  def invokeMap(methodName: String, args: js.Any*): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.isArguments
    */
  def isArguments(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isArray
    */
  def isArray(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isArrayBuffer
    */
  def isArrayBuffer(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isArrayLikeObject
    */
  def isArrayLikeObject(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isBoolean
    */
  def isBoolean(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isBuffer
    */
  def isBuffer(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isDate
    */
  def isDate(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isElement
    */
  def isElement(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isEmpty
    */
  def isEmpty(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isEqual
    */
  def isEqual(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isEqualWith
    */
  def isEqualWith(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  def isEqualWith(other: js.Any, customizer: IsEqualCustomizer): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isError
    */
  def isError(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isFinite
    */
  def isFinite(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isFunction
    */
  def isFunction(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isInteger
    */
  def isInteger(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isLength
    */
  def isLength(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isMap
    */
  def isMap(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isMatch
    */
  def isMatch(source: js.Object): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isMatchWith
    */
  def isMatchWith(source: js.Object, customizer: isMatchWithCustomizer): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isNaN
    */
  def isNaN(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isNative
    */
  def isNative(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isNil
    */
  def isNil(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isNull
    */
  def isNull(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isNumber
    */
  def isNumber(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isObject
    */
  def isObject(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isObjectLike
    */
  def isObjectLike(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isPlainObject
    */
  def isPlainObject(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isRegExp
    */
  def isRegExp(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isSafeInteger
    */
  def isSafeInteger(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isSet
    */
  def isSet(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isString
    */
  def isString(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isSymbol
    */
  def isSymbol(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isTypedArray
    */
  def isTypedArray(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * see _.isUndefined
    */
  def isUndefined(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isSet
    */
  def isWeakMap(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.isWeakSet
    */
  def isWeakSet(): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee[TFunction /* <: js.Function1[/* repeated */ js.Any, _] */](): LoDashExplicitWrapper[TFunction] = js.native
  
  /**
    * @see _.join
    */
  def join(): LoDashExplicitWrapper[String] = js.native
  def join(separator: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.kebabCase
    */
  def kebabCase(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.keyBy
    */
  def keyBy[T](): LoDashExplicitWrapper[Dictionary[T]] = js.native
  def keyBy[T](iteratee: ValueIterateeCustom[T, PropertyName]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.keyBy
    */
  @JSName("keyBy")
  def keyBy_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("keyBy")
  def keyBy_T_Object[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): LoDashExplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.keys
    */
  def keys(): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.keysIn
    */
  def keysIn(): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.last
    */
  def last[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.indexOf
    */
  def lastIndexOf[T](value: T): LoDashExplicitWrapper[Double] = js.native
  def lastIndexOf[T](value: T, fromIndex: Double): LoDashExplicitWrapper[Double] = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true[T](value: T, fromIndex: `true`): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.lowerCase
    */
  def lowerCase(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.lowerFirst
    */
  def lowerFirst(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.lt
    */
  def lt(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.lte
    */
  def lte(other: js.Any): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.map
    */
  def map[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def map[T](iteratee: String): LoDashExplicitWrapper[js.Array[_]] = js.native
  def map[T](iteratee: js.Object): LoDashExplicitWrapper[js.Array[Boolean]] = js.native
  /** @see _.map */
  def map[T, K /* <: /* keyof T */ String */](iteratee: K): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.map
    */
  def map[T /* <: js.Object */, TResult](iteratee: ObjectIterator[T, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.mapKeys
    */
  def mapKeys[T](): LoDashExplicitWrapper[Dictionary[T]] = js.native
  def mapKeys[T](iteratee: ListIteratee[T]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapKeys
    */
  @JSName("mapKeys")
  def mapKeys_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_T_Object[T /* <: js.Object */](iteratee: ObjectIteratee[T]): LoDashExplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): LoDashExplicitWrapper[NumericDictionary[String]] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[TResult](callback: StringIterator[TResult]): LoDashExplicitWrapper[NumericDictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T](iteratee: String): LoDashExplicitWrapper[Dictionary[_]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T](iteratee: js.Object): LoDashExplicitWrapper[Dictionary[Boolean]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T, TKey /* <: /* keyof T */ String */](iteratee: TKey): LoDashExplicitWrapper[
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ]
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T[T](): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_TTResult[T, TResult](callback: DictionaryIterator[T, TResult]): LoDashExplicitWrapper[Dictionary[TResult]] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[T] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object[T /* <: js.Object */](iteratee: String): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.lodash.lodashStrings.LoDashExplicitWrapper with TopLevel[js.Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object[T /* <: js.Object */](iteratee: js.Object): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.lodash.lodashStrings.LoDashExplicitWrapper with TopLevel[js.Any]
  ] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_ObjectTResult[T /* <: js.Object */, TResult](callback: ObjectIterator[T, TResult]): LoDashExplicitWrapper[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.lodash.lodashStrings.LoDashExplicitWrapper with TopLevel[js.Any]
  ] = js.native
  
  /**
    * @see _.map
    */
  @JSName("map")
  def map_TTResult[T, TResult](iteratee: (ArrayIterator[T, TResult]) | (ListIterator[T, TResult])): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.matches
    */
  def matches[V](): LoDashExplicitWrapper[js.Function1[/* value */ V, Boolean]] = js.native
  
  /**
    * @see _.matchesProperty
    */
  def matchesProperty[SrcValue](srcValue: SrcValue): LoDashExplicitWrapper[js.Function1[/* value */ _, Boolean]] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_SrcValueValue[SrcValue, Value](srcValue: SrcValue): LoDashExplicitWrapper[js.Function1[/* value */ Value, Boolean]] = js.native
  
  /**
    * @see _.max
    */
  def max[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.maxBy
    */
  def maxBy[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def maxBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.mean
    */
  def mean(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.meanBy
    */
  def meanBy[T](): LoDashExplicitWrapper[Double] = js.native
  def meanBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.memoize
    */
  def memoize(): LoDashExplicitWrapper[TValue with MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ js.Any, _]): LoDashExplicitWrapper[TValue with MemoizedFunction] = js.native
  
  /**
    * @see _.merge
    */
  def merge(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource](source: TSource): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2](source1: TSource1, source2: TSource2): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.merge
    */
  def merge[TSource1, TSource2, TSource3, TSource4](source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.mergeWith
    */
  def mergeWith(otherArgs: js.Any*): LoDashExplicitWrapper[_] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource](source: TSource, customizer: MergeWithCustomizer): LoDashExplicitWrapper[TValue with TSource] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2](source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3](source1: TSource1, source2: TSource2, source3: TSource3, customizer: MergeWithCustomizer): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3] = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TSource1, TSource2, TSource3, TSource4](
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): LoDashExplicitWrapper[TValue with TSource1 with TSource2 with TSource3 with TSource4] = js.native
  
  /**
    * @see _.method
    */
  def method(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* object */ _, _]] = js.native
  
  /**
    * @see _.methodOf
    */
  def methodOf(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  
  /**
    * @see _.min
    */
  def min[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.minBy
    */
  def minBy[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def minBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.mixin
    */
  def mixin(): LoDashExplicitWrapper[LoDashStatic] = js.native
  def mixin(options: MixinOptions): LoDashExplicitWrapper[LoDashStatic] = js.native
  /**
    * @see _.mixin
    */
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]]): this.type = js.native
  def mixin(source: Dictionary[js.Function1[/* repeated */ _, _]], options: MixinOptions): this.type = js.native
  
  /**
    * @see _.multiply
    */
  def multiply(multiplicand: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.negate
    */
  def negate(): LoDashExplicitWrapper[js.Function0[Boolean]] = js.native
  @JSName("negate")
  def negate_A1[A1](): LoDashExplicitWrapper[js.Function1[/* a1 */ A1, Boolean]] = js.native
  @JSName("negate")
  def negate_A1A2[A1, A2](): LoDashExplicitWrapper[js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean]] = js.native
  
  /**
    * @see _.noConflict
    */
  def noConflict(): LoDashExplicitWrapper[Typeoflodash] = js.native
  
  /**
    * @see _.noop
    */
  def noop(args: js.Any*): LoDashExplicitWrapper[js.UndefOr[scala.Nothing]] = js.native
  
  /**
    * @see _.now
    */
  def now(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.nth
    */
  def nth[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  def nth[T](n: Double): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.nthArg
    */
  def nthArg(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.omit
    */
  def omit[T /* <: AnyKindOfDictionary */](paths: Many[PropertyName]*): LoDashExplicitWrapper[T] = js.native
  
  /**
    * @see _.omitBy
    */
  def omitBy[T](): LoDashExplicitWrapper[Dictionary[T]] = js.native
  def omitBy[T](predicate: ValueKeyIteratee[T]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.omitBy
    */
  @JSName("omitBy")
  def omitBy_T_Object[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashExplicitWrapper[PartialObject[T]] = js.native
  
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_Object[T /* <: js.Object */](paths: Many[PropertyName]*): LoDashExplicitWrapper[PartialObject[T]] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_ObjectK_String[T /* <: js.Object */, K /* <: /* keyof T */ String */](paths: Many[K]*): LoDashExplicitWrapper[Omit[T, K]] = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def orderBy[T](
    iteratees: js.UndefOr[Many[ListIteratee[T] | (ListIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def orderBy[T](iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.orderBy
    */
  @JSName("orderBy")
  def orderBy_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("orderBy")
  def orderBy_T_Object[T /* <: js.Object */](
    iteratees: js.UndefOr[Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("orderBy")
  def orderBy_T_Object[T /* <: js.Object */](iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.over
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ _, TResult]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, js.Array[TResult]]] = js.native
  
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ _, _]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.overEvery
    */
  def overEvery[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ T, Boolean]] = js.native
  
  /**
    * @see _.overSome
    */
  def overSome[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): LoDashExplicitWrapper[js.Function1[/* repeated */ T, Boolean]] = js.native
  
  /**
    * @see _.pad
    */
  def pad(): LoDashExplicitWrapper[String] = js.native
  def pad(length: js.UndefOr[scala.Nothing], chars: String): LoDashExplicitWrapper[String] = js.native
  def pad(length: Double): LoDashExplicitWrapper[String] = js.native
  def pad(length: Double, chars: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.padEnd
    */
  def padEnd(): LoDashExplicitWrapper[String] = js.native
  def padEnd(length: js.UndefOr[scala.Nothing], chars: String): LoDashExplicitWrapper[String] = js.native
  def padEnd(length: Double): LoDashExplicitWrapper[String] = js.native
  def padEnd(length: Double, chars: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.padStart
    */
  def padStart(): LoDashExplicitWrapper[String] = js.native
  def padStart(length: js.UndefOr[scala.Nothing], chars: String): LoDashExplicitWrapper[String] = js.native
  def padStart(length: Double): LoDashExplicitWrapper[String] = js.native
  def padStart(length: Double, chars: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.parseInt
    */
  def parseInt(): LoDashExplicitWrapper[Double] = js.native
  def parseInt(radix: Double): LoDashExplicitWrapper[Double] = js.native
  
  // catch-all
  /**
    * @see _.partial
    */
  def partial(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partial
    */
  def partial[R](): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, R](arg1: T1): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](arg1: T1, arg2: T2): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, R](plc1: __, arg2: T2): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](plc1: __, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, R](plc1: __, plc2: __, arg3: T3): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](arg1: T1, arg2: T2, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](arg1: T1, arg2: T2, plc3: __, arg4: T4): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](arg1: T1, plc2: __, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](arg1: T1, plc2: __, plc3: __, arg4: T4): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](plc1: __, arg2: T2, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](plc1: __, arg2: T2, plc3: __, arg4: T4): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](plc1: __, plc2: __, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4, R](plc1: __, plc2: __, plc3: __, arg4: T4): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  
  // catch-all
  /**
    * @see _.partialRight
    */
  def partialRight(args: js.Any*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  // arity 0
  /**
    * @see _.partialRight
    */
  def partialRight[R](): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, R](arg1: T1): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](arg1: T1, arg2: T2): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, R](arg1: T1, plc2: __): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](arg1: T1, arg2: T2, plc3: __): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, R](arg1: T1, plc2: __, plc3: __): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, arg2: T2, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function0[R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, arg2: T2, arg3: T3, plc4: __): LoDashExplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, arg2: T2, plc3: __, arg4: T4): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, arg2: T2, plc3: __, plc4: __): LoDashExplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, plc2: __, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, plc2: __, arg3: T3, plc4: __): LoDashExplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, plc2: __, plc3: __, arg4: T4): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3, T4, R](arg1: T1, plc2: __, plc3: __, plc4: __): LoDashExplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  var partialRight_Original: ExplicitPartialRight = js.native
  // arity 1
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1R[T1, R](): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2R[T1, T2, R](arg2: T2): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  // arity 3
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](arg2: T2, arg3: T3): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](arg2: T2, plc3: __): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3R[T1, T2, T3, R](arg3: T3): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  // arity 4
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](): LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg2: T2, arg3: T3, arg4: T4): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg2: T2, arg3: T3, plc4: __): LoDashExplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg2: T2, plc3: __, arg4: T4): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg2: T2, plc3: __, plc4: __): LoDashExplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg3: T3, arg4: T4): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg3: T3, plc4: __): LoDashExplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1T2T3T4R[T1, T2, T3, T4, R](arg4: T4): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  
  /**
    * @see _.partial
    */
  @JSName("partial")
  var partial_Original: ExplicitPartial = js.native
  // arity 1
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1R[T1, R](): LoDashExplicitWrapper[Function1[T1, R]] = js.native
  // arity 2
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](): LoDashExplicitWrapper[Function2[T1, T2, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2R[T1, T2, R](arg1: T1): LoDashExplicitWrapper[Function1[T2, R]] = js.native
  // arity 3
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](): LoDashExplicitWrapper[Function3[T1, T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](arg1: T1): LoDashExplicitWrapper[Function2[T2, T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](arg1: T1, arg2: T2): LoDashExplicitWrapper[Function1[T3, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3R[T1, T2, T3, R](plc1: __, arg2: T2): LoDashExplicitWrapper[Function2[T1, T3, R]] = js.native
  // arity 4
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](): LoDashExplicitWrapper[Function4[T1, T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](arg1: T1): LoDashExplicitWrapper[Function3[T2, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](arg1: T1, arg2: T2): LoDashExplicitWrapper[Function2[T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](arg1: T1, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function1[T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](arg1: T1, plc2: __, arg3: T3): LoDashExplicitWrapper[Function2[T2, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](plc1: __, arg2: T2): LoDashExplicitWrapper[Function3[T1, T3, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](plc1: __, arg2: T2, arg3: T3): LoDashExplicitWrapper[Function2[T1, T4, R]] = js.native
  /**
    * @see _.partial
    */
  @JSName("partial")
  def partial_T1T2T3T4R[T1, T2, T3, T4, R](plc1: __, plc2: __, arg3: T3): LoDashExplicitWrapper[Function3[T1, T2, T4, R]] = js.native
  
  /**
    * @see _.partition
    */
  def partition[T](
    callback: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): LoDashExplicitWrapper[js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * @see _.partition
    */
  def partition[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): LoDashExplicitWrapper[js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]] = js.native
  
  /**
    * @see _.pick
    */
  def pick[T /* <: js.Object */](props: PropertyPath*): LoDashExplicitWrapper[PartialObject[T]] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy[T](): LoDashExplicitWrapper[Dictionary[T]] = js.native
  def pickBy[T](predicate: ValueKeyIteratee[T]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): LoDashExplicitWrapper[Dictionary[S]] = js.native
  /**
    * @see _.pickBy
    */
  @JSName("pickBy")
  def pickBy_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[PartialObject[T]] = js.native
  @JSName("pickBy")
  def pickBy_T_Object[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): LoDashExplicitWrapper[PartialObject[T]] = js.native
  
  /**
    * @see _.pick
    */
  @JSName("pick")
  def pick_T_ObjectU_String[T /* <: js.Object */, U /* <: /* keyof T */ String */](props: Many[U]*): LoDashExplicitWrapper[Pick[T, U]] = js.native
  
  /**
    * @see _.plant
    */
  def plant[T](value: T): LoDashExplicitWrapper[T] = js.native
  
  def pop[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.property
    */
  def property[TObj, TResult](): LoDashExplicitWrapper[js.Function1[/* obj */ TObj, TResult]] = js.native
  
  /**
    * @see _.propertyOf
    */
  def propertyOf(): LoDashExplicitWrapper[js.Function1[/* path */ PropertyPath, _]] = js.native
  
  /**
    * @see _.pull
    */
  def pull[T](values: T*): this.type = js.native
  
  /**
    * @see _.pullAll
    */
  def pullAll[T](): this.type = js.native
  def pullAll[T](values: List[T]): this.type = js.native
  
  def push[T](items: T*): this.type = js.native
  
  /**
    * @see _.random
    */
  def random(): LoDashExplicitWrapper[Double] = js.native
  def random(floating: Boolean): LoDashExplicitWrapper[Double] = js.native
  /**
    * @see _.random
    */
  def random(max: Double): LoDashExplicitWrapper[Double] = js.native
  def random(max: Double, floating: Boolean): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.range
    */
  def range(): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def range(end: js.UndefOr[scala.Nothing], step: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def range(end: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def range(end: Double, step: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  
  /**
    * @see _.rangeRight
    */
  def rangeRight(): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: js.UndefOr[scala.Nothing], step: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  def rangeRight(end: Double, step: Double): LoDashExplicitWrapper[js.Array[Double]] = js.native
  
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[Double]*): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.reduce
    **/
  def reduce[T](callback: MemoListIterator[T, T, js.Array[T] | List[T]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitWrapper[TResult] = js.native
  
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T](callback: MemoListIterator[T, T, js.Array[T] | List[T]]): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_TTResult[T, TResult](callback: MemoListIterator[T, TResult, js.Array[T] | List[T]], accumulator: TResult): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reduceRight
    **/
  @JSName("reduceRight")
  def reduceRight_T_Object[T /* <: js.Object */](
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_TTResult[T, TResult](callback: MemoListIterator[T, TResult, js.Array[T] | List[T]], accumulator: TResult): LoDashExplicitWrapper[TResult] = js.native
  /**
    * @see _.reduce
    **/
  @JSName("reduce")
  def reduce_T_Object[T /* <: js.Object */](
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.reject
    */
  def reject(): LoDashExplicitWrapper[js.Array[String]] = js.native
  def reject(predicate: StringIterator[Boolean]): LoDashExplicitWrapper[js.Array[String]] = js.native
  def reject[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("reject")
  def reject_T_Object[T /* <: js.Object */](predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.remove
    */
  def remove[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def remove[T](predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.repeat
    */
  def repeat(): LoDashExplicitWrapper[String] = js.native
  def repeat(n: Double): LoDashExplicitWrapper[String] = js.native
  
  def replace(pattern: String, replacement: String): LoDashExplicitWrapper[String] = js.native
  def replace(pattern: String, replacement: ReplaceFunction): LoDashExplicitWrapper[String] = js.native
  def replace(pattern: js.RegExp, replacement: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: js.RegExp, replacement: ReplaceFunction): LoDashExplicitWrapper[String] = js.native
  def replace(replacement: String): LoDashExplicitWrapper[String] = js.native
  /**
    * @see _.replace
    */
  def replace(replacement: ReplaceFunction): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.rest
    */
  def rest(): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  def rest(start: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * @see _.result
    */
  def result[TResult](path: PropertyPath): LoDashExplicitWrapper[TResult] = js.native
  def result[TResult](path: PropertyPath, defaultValue: TResult): LoDashExplicitWrapper[TResult] = js.native
  def result[TResult](path: PropertyPath, defaultValue: js.Function1[/* repeated */ js.Any, TResult]): LoDashExplicitWrapper[TResult] = js.native
  
  /**
    * @see _.round
    */
  def round(): LoDashExplicitWrapper[Double] = js.native
  def round(precision: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sample
    */
  def sample[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def sampleSize[T](n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sampleSize
    */
  @JSName("sampleSize")
  def sampleSize_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("sampleSize")
  def sampleSize_T_Object[T /* <: js.Object */](n: Double): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.sample
    */
  @JSName("sample")
  def sample_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.set
    */
  def set(path: PropertyPath, value: js.Any): this.type = js.native
  
  /**
    * @see _.setWith
    */
  def setWith(path: PropertyPath, value: js.Any): this.type = js.native
  def setWith(path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): this.type = js.native
  /**
    * @see _.setWith
    */
  @JSName("setWith")
  def setWith_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashExplicitWrapper[TResult] = js.native
  @JSName("setWith")
  def setWith_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[TValue]): LoDashExplicitWrapper[TResult] = js.native
  
  /**
    * @see _.set
    */
  @JSName("set")
  def set_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, value: js.Any): LoDashExplicitWrapper[TResult] = js.native
  
  def shift[T](): LoDashExplicitWrapper[js.UndefOr[T]] = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.shuffle
    */
  @JSName("shuffle")
  def shuffle_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.size
    */
  def size(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.slice
    */
  def slice[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def slice[T](start: js.UndefOr[scala.Nothing], end: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  def slice[T](start: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  def slice[T](start: Double, end: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.snakeCase
    */
  def snakeCase(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.some
    */
  def some[T](): LoDashExplicitWrapper[Boolean] = js.native
  def some[T](predicate: ListIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Boolean] = js.native
  /**
    * @see _.some
    */
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[Boolean] = js.native
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](predicate: ObjectIterateeCustom[T, Boolean]): LoDashExplicitWrapper[Boolean] = js.native
  
  def sort[T](): this.type = js.native
  def sort[T](compareFn: js.Function2[/* a */ T, /* b */ T, Double]): this.type = js.native
  
  /**
    * @see _.sortBy
    */
  def sortBy[T](iteratees: Many[ListIteratee[T]]*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.sortBy
    */
  @JSName("sortBy")
  def sortBy_T_Object[T /* <: js.Object */](iteratees: Many[ObjectIteratee[T]]*): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.sortedIndex
    */
  def sortedIndex[T](value: T): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sortedIndexBy
    */
  def sortedIndexBy[T](value: T): LoDashExplicitWrapper[Double] = js.native
  def sortedIndexBy[T](value: T, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sortedIndexOf
    */
  def sortedIndexOf[T](value: T): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sortedLastIndex
    */
  def sortedLastIndex[T](value: T): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sortedLastIndexBy
    */
  def sortedLastIndexBy[T](value: T, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sortedLastIndexOf
    */
  def sortedLastIndexOf[T](value: T): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sortedUniq
    */
  def sortedUniq[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.sortedUniqBy
    */
  def sortedUniqBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  def splice[T](start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): this.type = js.native
  def splice[T](start: Double, deleteCount: Double, items: T*): this.type = js.native
  
  /**
    * @see _.split
    */
  def split(): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: js.UndefOr[scala.Nothing], limit: Double): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: String): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: String, limit: Double): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: js.RegExp): LoDashExplicitWrapper[js.Array[String]] = js.native
  def split(separator: js.RegExp, limit: Double): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.spread
    */
  def spread[TResult](): LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](start: Double): LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  
  /**
    * @see _.startCase
    */
  def startCase(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.startsWith
    */
  def startsWith(): LoDashExplicitWrapper[Boolean] = js.native
  def startsWith(target: js.UndefOr[scala.Nothing], position: Double): LoDashExplicitWrapper[Boolean] = js.native
  def startsWith(target: String): LoDashExplicitWrapper[Boolean] = js.native
  def startsWith(target: String, position: Double): LoDashExplicitWrapper[Boolean] = js.native
  
  /**
    * @see _.stubArray
    */
  def stubArray(): LoDashExplicitWrapper[js.Array[_]] = js.native
  
  /**
    * @see _.stubFalse
    */
  def stubFalse(): LoDashExplicitWrapper[`false`] = js.native
  
  /**
    * @see _.stubObject
    */
  def stubObject(): LoDashExplicitWrapper[_] = js.native
  
  /**
    * @see _.stubString
    */
  def stubString(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.stubTrue
    */
  def stubTrue(): LoDashExplicitWrapper[`true`] = js.native
  
  /**
    * @see _.subtract
    */
  def subtract(subtrahend: Double): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sum
    */
  def sum(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.sumBy
    */
  def sumBy[T](): LoDashExplicitWrapper[Double] = js.native
  def sumBy[T](iteratee: String): LoDashExplicitWrapper[Double] = js.native
  def sumBy[T](iteratee: js.Function1[/* value */ T, Double]): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.tail
    */
  def tail[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.take
    */
  def take[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def take[T](n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.takeRight
    */
  def takeRight[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def takeRight[T](n: Double): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.takeRightWhile
    */
  def takeRightWhile[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def takeRightWhile[T](predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.takeWhile
    */
  def takeWhile[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def takeWhile[T](predicate: ListIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.template
    */
  def template(): LoDashExplicitWrapper[TemplateExecutor] = js.native
  def template(options: TemplateOptions): LoDashExplicitWrapper[TemplateExecutor] = js.native
  
  /**
    * @see _.throttle
    */
  def throttle(): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: js.UndefOr[scala.Nothing], options: ThrottleSettings): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: Double): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  def throttle(wait: Double, options: ThrottleSettings): LoDashExplicitWrapper[TValue with Cancelable] = js.native
  
  /**
    * @see _.thru
    */
  def thru[TResult](interceptor: js.Function1[/* value */ TValue, TResult]): LoDashExplicitWrapper[TResult] = js.native
  
  /**
    * @see _.times
    */
  def times(): LoDashExplicitWrapper[js.Array[Double]] = js.native
  /**
    * @see _.times
    */
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.toArray
    */
  @JSName("toArray")
  def toArray_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.toFinite
    */
  def toFinite(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.toInteger
    */
  def toInteger(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.toLength
    */
  def toLength(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.toLower
    */
  def toLower(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.toNumber
    */
  def toNumber(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.toPairs
    */
  def toPairs(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): LoDashExplicitWrapper[js.Array[js.Tuple2[String, _]]] = js.native
  /**
    * @see _.toPairsIn
    */
  @JSName("toPairsIn")
  def toPairsIn_T[T](): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  
  /**
    * @see _.toPairs
    */
  @JSName("toPairs")
  def toPairs_T[T](): LoDashExplicitWrapper[js.Array[js.Tuple2[String, T]]] = js.native
  
  /**
    * @see _.toPath
    */
  def toPath(): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.toPlainObject
    */
  def toPlainObject(): LoDashExplicitWrapper[_] = js.native
  
  /**
    * @see _.toSafeInteger
    */
  def toSafeInteger(): LoDashExplicitWrapper[Double] = js.native
  
  /**
    * @see _.toUpper
    */
  def toUpper(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.transform
    */
  def transform(): LoDashExplicitWrapper[js.Array[_]] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult] | Dictionary[TResult]]) | (MemoVoidDictionaryIterator[T, js.Array[TResult] | Dictionary[TResult]])
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    iteratee: (MemoVoidArrayIterator[T, js.Array[TResult]]) | (MemoVoidDictionaryIterator[T, js.Array[TResult]]),
    accumulator: js.Array[TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  def transform[T, TResult](
    iteratee: (MemoVoidArrayIterator[T, Dictionary[TResult]]) | (MemoVoidDictionaryIterator[T, Dictionary[TResult]]),
    accumulator: Dictionary[TResult]
  ): LoDashExplicitWrapper[Dictionary[TResult]] = js.native
  
  /**
    * @see _.trim
    */
  def trim(): LoDashExplicitWrapper[String] = js.native
  def trim(chars: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.trimEnd
    */
  def trimEnd(): LoDashExplicitWrapper[String] = js.native
  def trimEnd(chars: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.trimStart
    */
  def trimStart(): LoDashExplicitWrapper[String] = js.native
  def trimStart(chars: String): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.truncate
    */
  def truncate(): LoDashExplicitWrapper[String] = js.native
  def truncate(options: TruncateOptions): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.unary
    */
  def unary[T, TResult](): LoDashExplicitWrapper[js.Function1[/* arg1 */ T, TResult]] = js.native
  
  /**
    * @see _.unescape
    */
  def unescape(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.union
    */
  def union[T](arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.unionBy
    */
  def unionBy[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](
    arrays2: js.UndefOr[List[T] | Null],
    arrays3: js.UndefOr[List[T] | Null],
    arrays4: js.UndefOr[List[T] | Null],
    arrays5: js.UndefOr[List[T] | Null],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](
    arrays2: js.UndefOr[List[T] | Null],
    arrays3: js.UndefOr[List[T] | Null],
    arrays4: js.UndefOr[List[T] | Null],
    iteratee: js.UndefOr[ValueIteratee[T]]
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: js.UndefOr[scala.Nothing], arrays3: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: js.UndefOr[scala.Nothing], arrays3: Null, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: js.UndefOr[scala.Nothing], arrays3: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: js.UndefOr[scala.Nothing], arrays3: List[T], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: Null, arrays3: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: Null, arrays3: Null, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: Null, arrays3: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: Null, arrays3: List[T], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: Null, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: List[T], arrays3: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: List[T], arrays3: Null, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: List[T], arrays3: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: List[T], arrays3: List[T], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](arrays2: List[T], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.unionWith
    */
  def unionWith[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: Null, arrays3: Null, comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: Null, arrays3: List[T], comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: Null, comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: List[T], arrays3: Null, comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](arrays2: List[T], arrays3: List[T], comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](arrays2: List[T], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def unionWith[T](comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.uniq
    */
  def uniq[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.uniqBy
    */
  def uniqBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.uniqWith
    */
  def uniqWith[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def uniqWith[T](comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.uniqueId
    */
  def uniqueId(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.unset
    */
  def unset(path: PropertyPath): LoDashExplicitWrapper[Boolean] = js.native
  
  def unshift[T](items: T*): this.type = js.native
  
  /**
    * @see _.unzip
    */
  def unzip[T](): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  
  /**
    * @see _.unzipWith
    */
  def unzipWith[T](): LoDashExplicitWrapper[js.Array[js.Array[T]]] = js.native
  /**
    * @see _.unzipWith
    */
  def unzipWith[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  
  /**
    * @see _.update
    */
  def update(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LoDashExplicitWrapper[_] = js.native
  
  /**
    * @see _.updateWith
    */
  def updateWith(path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): this.type = js.native
  def updateWith(
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): this.type = js.native
  /**
    * @see _.updateWith
    */
  @JSName("updateWith")
  def updateWith_TResult_LoDashExplicitWrapper[TResult](path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LoDashExplicitWrapper[TResult] = js.native
  @JSName("updateWith")
  def updateWith_TResult_LoDashExplicitWrapper[TResult](
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[TValue]
  ): LoDashExplicitWrapper[TResult] = js.native
  
  /**
    * @see _.upperCase
    */
  def upperCase(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.upperFirst
    */
  def upperFirst(): LoDashExplicitWrapper[String] = js.native
  
  /**
    * @see _.values
    */
  def values(): LoDashExplicitWrapper[js.Array[_]] = js.native
  
  /**
    * @see _.valuesIn
    */
  def valuesIn[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.valuesIn
    */
  @JSName("valuesIn")
  def valuesIn_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.values
    */
  @JSName("values")
  def values_T[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.values
    */
  @JSName("values")
  def values_T_Object[T /* <: js.Object */](): LoDashExplicitWrapper[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * @see _.without
    */
  def without[T](values: T*): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.words
    */
  def words(): LoDashExplicitWrapper[js.Array[String]] = js.native
  def words(pattern: String): LoDashExplicitWrapper[js.Array[String]] = js.native
  def words(pattern: js.RegExp): LoDashExplicitWrapper[js.Array[String]] = js.native
  
  /**
    * @see _.wrap
    */
  def wrap[TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ js.Any, TResult]): LoDashExplicitWrapper[js.Function1[/* repeated */ _, TResult]] = js.native
  /**
    * @see _.wrap
    */
  @JSName("wrap")
  def wrap_TArgsTResult[TArgs, TResult](wrapper: js.Function2[/* value */ TValue, /* repeated */ TArgs, TResult]): LoDashExplicitWrapper[js.Function1[/* repeated */ TArgs, TResult]] = js.native
  
  /**
    * @see _.xor
    */
  def xor[T](arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.xorBy
    */
  def xorBy[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: Null, arrays3: Null, iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: Null, arrays3: List[T], iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: Null, iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: List[T], arrays3: Null, iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](arrays2: List[T], arrays3: List[T], iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](arrays2: List[T], iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorBy[T](iteratee: ValueIteratee[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.xorWith
    */
  def xorWith[T](): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: Null, arrays3: Null, comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: Null, arrays3: List[T], comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: Null, comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: List[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: List[T], arrays3: Null, comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](arrays2: List[T], arrays3: List[T], comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](arrays2: List[T], comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  def xorWith[T](comparator: Comparator[T]): LoDashExplicitWrapper[js.Array[T]] = js.native
  
  /**
    * @see _.zip
    */
  def zip[T](arrays: (js.UndefOr[List[T] | Null])*): LoDashExplicitWrapper[js.Array[js.Array[js.UndefOr[T]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2](arrays2: List[T2]): LoDashExplicitWrapper[js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3](arrays2: List[T2], arrays3: List[T3]): LoDashExplicitWrapper[js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4](arrays2: List[T2], arrays3: List[T3], arrays4: List[T4]): LoDashExplicitWrapper[
    js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]]
  ] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4, T5](arrays2: List[T2], arrays3: List[T3], arrays4: List[T4], arrays5: List[T5]): LoDashExplicitWrapper[
    js.Array[
      js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
    ]
  ] = js.native
  
  /**
    * @see _.zipObject
    */
  def zipObject(): LoDashExplicitWrapper[Dictionary[js.UndefOr[scala.Nothing]]] = js.native
  /**
    * @see _.zipObject
    */
  def zipObject[T](values: List[T]): LoDashExplicitWrapper[Dictionary[T]] = js.native
  
  /**
    * @see _.zipObjectDeep
    */
  def zipObjectDeep(): LoDashExplicitWrapper[js.Object] = js.native
  def zipObjectDeep(values: List[_]): LoDashExplicitWrapper[js.Object] = js.native
  
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | List[T] | Null])*): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](iteratee: js.Function1[/* value1 */ T, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, TResult](arrays2: List[T2], iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, TResult](
    arrays2: List[T2],
    arrays3: List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, TResult](
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, T5, TResult](
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    arrays5: List[T5],
    iteratee: js.Function5[
      /* value1 */ T1, 
      /* value2 */ T2, 
      /* value3 */ T3, 
      /* value4 */ T4, 
      /* value5 */ T5, 
      TResult
    ]
  ): LoDashExplicitWrapper[js.Array[TResult]] = js.native
}
