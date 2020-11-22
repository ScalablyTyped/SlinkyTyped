package typingsSlinky.lodash.fpMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.lodash.anon.LodashAnyHack
import typingsSlinky.lodash.anon.Typeoflodash
import typingsSlinky.lodash.lodashBooleans.`false`
import typingsSlinky.lodash.lodashBooleans.`true`
import typingsSlinky.lodash.lodashNumbers.`0`
import typingsSlinky.lodash.lodashStrings._empty
import typingsSlinky.lodash.lodashStrings.asc
import typingsSlinky.lodash.lodashStrings.desc
import typingsSlinky.lodash.mod.AssignCustomizer
import typingsSlinky.lodash.mod.CloneDeepWithCustomizer
import typingsSlinky.lodash.mod.CloneWithCustomizer
import typingsSlinky.lodash.mod.Collection
import typingsSlinky.lodash.mod.Comparator
import typingsSlinky.lodash.mod.Comparator2
import typingsSlinky.lodash.mod.CondPair
import typingsSlinky.lodash.mod.ConformsPredicateObject
import typingsSlinky.lodash.mod.CurriedFunction1
import typingsSlinky.lodash.mod.CurriedFunction2
import typingsSlinky.lodash.mod.CurriedFunction3
import typingsSlinky.lodash.mod.CurriedFunction4
import typingsSlinky.lodash.mod.CurriedFunction5
import typingsSlinky.lodash.mod.DebouncedFunc
import typingsSlinky.lodash.mod.Dictionary
import typingsSlinky.lodash.mod.Function
import typingsSlinky.lodash.mod.Function0
import typingsSlinky.lodash.mod.Function1
import typingsSlinky.lodash.mod.Function2
import typingsSlinky.lodash.mod.Function3
import typingsSlinky.lodash.mod.Function4
import typingsSlinky.lodash.mod.FunctionBase
import typingsSlinky.lodash.mod.IsEqualCustomizer
import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.ListOfRecursiveArraysOrValues
import typingsSlinky.lodash.mod.LoDashStatic
import typingsSlinky.lodash.mod.Many
import typingsSlinky.lodash.mod.MemoIteratorCapped
import typingsSlinky.lodash.mod.MemoIteratorCappedRight
import typingsSlinky.lodash.mod.MemoVoidIteratorCapped
import typingsSlinky.lodash.mod.MemoizedFunction
import typingsSlinky.lodash.mod.MergeWithCustomizer
import typingsSlinky.lodash.mod.NotVoid
import typingsSlinky.lodash.mod.NumericDictionary
import typingsSlinky.lodash.mod.Object
import typingsSlinky.lodash.mod.Omit
import typingsSlinky.lodash.mod.PartialObject
import typingsSlinky.lodash.mod.Primitive
import typingsSlinky.lodash.mod.PropertyName
import typingsSlinky.lodash.mod.PropertyPath
import typingsSlinky.lodash.mod.ReplaceFunction
import typingsSlinky.lodash.mod.RightCurriedFunction1
import typingsSlinky.lodash.mod.RightCurriedFunction2
import typingsSlinky.lodash.mod.RightCurriedFunction3
import typingsSlinky.lodash.mod.RightCurriedFunction4
import typingsSlinky.lodash.mod.RightCurriedFunction5
import typingsSlinky.lodash.mod.SetWithCustomizer
import typingsSlinky.lodash.mod.String
import typingsSlinky.lodash.mod.TemplateExecutor
import typingsSlinky.lodash.mod.TruncateOptions
import typingsSlinky.lodash.mod.ValueIteratee
import typingsSlinky.lodash.mod.ValueIterateeCustom
import typingsSlinky.lodash.mod.ValueIteratorTypeGuard
import typingsSlinky.lodash.mod.ValueKeyIteratee
import typingsSlinky.lodash.mod.ValueKeyIterateeTypeGuard
import typingsSlinky.lodash.mod.__
import typingsSlinky.lodash.mod.isMatchWithCustomizer
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoDashFp extends js.Object {
  
  def F(): `false` = js.native
  @JSName("F")
  var F_Original: LodashStubFalse = js.native
  
  def T(): `true` = js.native
  @JSName("T")
  var T_Original: LodashStubTrue = js.native
  
  def __(): String = js.native
  def __(value: java.lang.String): String = js.native
  def __[T /* <: js.Object */](value: T): Object[T] = js.native
  def __[T](value: List[T]): Collection[T] = js.native
  @JSName("__")
  var ___Original: __ = js.native
  @JSName("__")
  def ___T_Collection[T](): Collection[T] = js.native
  @JSName("__")
  def ___T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
  @JSName("__")
  def ___T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
  @JSName("__")
  def ___T_Primitive[T](value: T): Primitive[T] = js.native
  @JSName("__")
  def `___T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  @JSName("__")
  def ___TrapAny_TrapAny_Intersection[TrapAny /* <: typingsSlinky.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with String = js.native
  
  def add(augend: Double): LodashAdd1x1 = js.native
  def add(augend: Double, addend: Double): Double = js.native
  def add(augend: __, addend: Double): LodashAdd1x2 = js.native
  @JSName("add")
  var add_Original: LodashAdd = js.native
  
  def after(func: __, n: Double): LodashAfter1x2 = js.native
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LodashAfter1x1[TFunc] = js.native
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc, n: Double): TFunc = js.native
  @JSName("after")
  var after_Original: LodashAfter = js.native
  
  def all[T](predicate: ValueIterateeCustom[T, Boolean]): LodashEvery1x1[T] = js.native
  def all[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def all[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def all[T /* <: js.Object */](predicate: __): LodashEvery2x2[T] = js.native
  def all[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T] = js.native
  def all[T](predicate: __, collection: List[T]): LodashEvery1x2[T] = js.native
  
  def allPass[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean] = js.native
  @JSName("allPass")
  var allPass_Original: LodashOverEvery = js.native
  
  @JSName("all")
  var all_Original: LodashEvery = js.native
  @JSName("all")
  def all_T_Boolean[T](predicate: ValueIterateeCustom[T, Boolean]): Boolean = js.native
  @JSName("all")
  def all_T_LodashEvery1x2[T](predicate: __): LodashEvery1x2[T] = js.native
  @JSName("all")
  def all_T_Object_Boolean[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): Boolean = js.native
  
  def always[T](value: T): js.Function0[T] = js.native
  @JSName("always")
  var always_Original: LodashConstant = js.native
  
  def any[T](predicate: ValueIterateeCustom[T, Boolean]): Boolean = js.native
  def any[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def any[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def any[T](predicate: __): LodashSome1x2[T] = js.native
  def any[T /* <: js.Object */](predicate: __, collection: T): LodashSome2x2[T] = js.native
  def any[T](predicate: __, collection: List[T]): LodashSome1x2[T] = js.native
  
  def anyPass[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean] = js.native
  @JSName("anyPass")
  var anyPass_Original: LodashOverSome = js.native
  
  @JSName("any")
  var any_Original: LodashSome = js.native
  @JSName("any")
  def any_T_LodashSome1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashSome1x1[T] = js.native
  @JSName("any")
  def any_T_Object[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): Boolean = js.native
  @JSName("any")
  def any_T_Object_LodashSome2x2[T /* <: js.Object */](predicate: __): LodashSome2x2[T] = js.native
  
  @JSName("apply")
  def apply[TResult](func: js.Function1[/* repeated */ js.Any, TResult]): js.Function1[/* repeated */ js.Any, TResult] = js.native
  @JSName("apply")
  var apply_Original: LodashApply = js.native
  
  def ary(n: Double): LodashAry1x1 = js.native
  def ary(n: Double, func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def ary(n: __, func: js.Function1[/* repeated */ js.Any, _]): LodashAry1x2 = js.native
  @JSName("ary")
  var ary_Original: LodashAry = js.native
  
  def assign[TObject](`object`: TObject): LodashAssign1x1[TObject] = js.native
  def assign[TSource](`object`: __, source: TSource): LodashAssign1x2[TSource] = js.native
  def assign[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  
  def assignAll(`object`: js.Array[_]): js.Any = js.native
  def assignAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject with TSource = js.native
  def assignAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject with TSource1 with TSource2 = js.native
  def assignAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject with TSource1 with TSource2 with TSource3 = js.native
  def assignAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  def assignAllWith(customizer: AssignCustomizer): LodashAssignAllWith1x1 = js.native
  def assignAllWith(customizer: AssignCustomizer, args: js.Array[_]): js.Any = js.native
  def assignAllWith(customizer: __, args: js.Array[_]): LodashAssignAllWith1x2 = js.native
  @JSName("assignAllWith")
  var assignAllWith_Original: LodashAssignAllWith = js.native
  
  @JSName("assignAll")
  var assignAll_Original: LodashAssignAll = js.native
  @JSName("assignAll")
  def assignAll_TObject_TObject[TObject](`object`: js.Array[TObject]): TObject = js.native
  
  def assignIn[TObject](`object`: TObject): LodashAssignIn1x1[TObject] = js.native
  def assignIn[TSource](`object`: __, source: TSource): LodashAssignIn1x2[TSource] = js.native
  def assignIn[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  
  def assignInAll[TResult](`object`: js.Array[_]): TResult = js.native
  def assignInAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject with TSource = js.native
  def assignInAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject with TSource1 with TSource2 = js.native
  def assignInAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject with TSource1 with TSource2 with TSource3 = js.native
  def assignInAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  def assignInAllWith(customizer: AssignCustomizer): LodashAssignInAllWith1x1 = js.native
  def assignInAllWith(customizer: AssignCustomizer, args: js.Array[_]): js.Any = js.native
  def assignInAllWith(customizer: __, args: js.Array[_]): LodashAssignInAllWith1x2 = js.native
  @JSName("assignInAllWith")
  var assignInAllWith_Original: LodashAssignInAllWith = js.native
  
  @JSName("assignInAll")
  var assignInAll_Original: LodashAssignInAll = js.native
  @JSName("assignInAll")
  def assignInAll_TObject_TObject[TObject](`object`: js.Array[TObject]): TObject = js.native
  
  def assignInWith(customizer: AssignCustomizer): LodashAssignInWith1x1 = js.native
  def assignInWith[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignInWith1x3[TObject] = js.native
  def assignInWith[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignInWith1x5[TSource] = js.native
  def assignInWith[TObject](customizer: __, `object`: TObject): LodashAssignInWith1x2[TObject] = js.native
  def assignInWith[TSource](customizer: __, `object`: __, source: TSource): LodashAssignInWith1x4[TSource] = js.native
  def assignInWith[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def assignInWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignInWith1x6[TObject, TSource] = js.native
  @JSName("assignInWith")
  var assignInWith_Original: LodashAssignInWith = js.native
  
  @JSName("assignIn")
  var assignIn_Original: LodashAssignIn = js.native
  
  def assignWith(customizer: AssignCustomizer): LodashAssignWith1x1 = js.native
  def assignWith[TObject](customizer: AssignCustomizer, `object`: TObject): LodashAssignWith1x3[TObject] = js.native
  def assignWith[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashAssignWith1x5[TSource] = js.native
  def assignWith[TObject](customizer: __, `object`: TObject): LodashAssignWith1x2[TObject] = js.native
  def assignWith[TSource](customizer: __, `object`: __, source: TSource): LodashAssignWith1x4[TSource] = js.native
  def assignWith[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def assignWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashAssignWith1x6[TObject, TSource] = js.native
  @JSName("assignWith")
  var assignWith_Original: LodashAssignWith = js.native
  
  @JSName("assign")
  var assign_Original: LodashAssign = js.native
  
  def assoc(path: PropertyPath): LodashSet1x1 = js.native
  def assoc(path: PropertyPath, value: js.Any): LodashSet1x3 = js.native
  def assoc(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5 = js.native
  def assoc(path: __, value: js.Any): LodashSet1x2 = js.native
  def assoc(path: __, value: js.Any, `object`: js.Object): LodashSet2x6 = js.native
  def assoc(path: __, value: __, `object`: js.Object): LodashSet2x4 = js.native
  def assoc[T /* <: js.Object */](path: PropertyPath, value: js.Any, `object`: T): T = js.native
  def assoc[TResult](path: PropertyPath, value: js.Any, `object`: js.Object): TResult = js.native
  def assoc[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T] = js.native
  def assoc[T /* <: js.Object */](path: __, value: js.Any, `object`: T): LodashSet1x6[T] = js.native
  def assoc[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T] = js.native
  
  def assocPath(path: PropertyPath): LodashSet1x1 = js.native
  def assocPath(path: PropertyPath, value: js.Any): LodashSet1x3 = js.native
  def assocPath(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5 = js.native
  def assocPath(path: __, value: js.Any): LodashSet1x2 = js.native
  def assocPath(path: __, value: js.Any, `object`: js.Object): LodashSet2x6 = js.native
  def assocPath(path: __, value: __, `object`: js.Object): LodashSet2x4 = js.native
  def assocPath[T /* <: js.Object */](path: PropertyPath, value: js.Any, `object`: T): T = js.native
  def assocPath[TResult](path: PropertyPath, value: js.Any, `object`: js.Object): TResult = js.native
  def assocPath[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T] = js.native
  def assocPath[T /* <: js.Object */](path: __, value: js.Any, `object`: T): LodashSet1x6[T] = js.native
  def assocPath[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T] = js.native
  @JSName("assocPath")
  var assocPath_Original: LodashSet = js.native
  
  @JSName("assoc")
  var assoc_Original: LodashSet = js.native
  
  def at(props: PropertyPath): LodashAt1x1 = js.native
  def at[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def at[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T] = js.native
  def at[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T] = js.native
  def at[T](props: __): LodashAt1x2[T] = js.native
  def at[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T] = js.native
  def at[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T] = js.native
  def at[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T] = js.native
  @JSName("at")
  var at_Original: LodashAt = js.native
  @JSName("at")
  def at_T_Array[T](props: PropertyPath): js.Array[T] = js.native
  @JSName("at")
  def at_T_Object_Array[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("at")
  def at_T_Object_LodashAt2x1[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): LodashAt2x1[T] = js.native
  @JSName("at")
  def at_T_Object_LodashAt2x2[T /* <: js.Object */](props: __): LodashAt2x2[T] = js.native
  
  def attempt[TResult](func: js.Function1[/* repeated */ js.Any, TResult]): TResult | js.Error = js.native
  @JSName("attempt")
  var attempt_Original: LodashAttempt = js.native
  
  def before(func: __, n: Double): LodashBefore1x2 = js.native
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): LodashBefore1x1[TFunc] = js.native
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc, n: Double): TFunc = js.native
  @JSName("before")
  var before_Original: LodashBefore = js.native
  
  def bind(func: js.Function1[/* repeated */ js.Any, _]): LodashBind1x1 = js.native
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  def bind(func: __, thisArg: js.Any): LodashBind1x2 = js.native
  
  def bindAll(methodNames: Many[java.lang.String]): LodashBindAll1x1 = js.native
  def bindAll[T](methodNames: Many[java.lang.String], `object`: T): T = js.native
  def bindAll[T](methodNames: __, `object`: T): LodashBindAll1x2[T] = js.native
  @JSName("bindAll")
  var bindAll_Original: LodashBindAll = js.native
  
  def bindKey(`object`: js.Object): LodashBindKey1x1 = js.native
  def bindKey(`object`: js.Object, key: java.lang.String): js.Function1[/* repeated */ js.Any, _] = js.native
  def bindKey(`object`: __, key: java.lang.String): LodashBindKey1x2 = js.native
  @JSName("bindKey")
  var bindKey_Original: LodashBindKey = js.native
  
  @JSName("bind")
  var bind_Original: LodashBind = js.native
  
  def camelCase(string: java.lang.String): java.lang.String = js.native
  @JSName("camelCase")
  var camelCase_Original: LodashCamelCase = js.native
  
  def capitalize(string: java.lang.String): java.lang.String = js.native
  @JSName("capitalize")
  var capitalize_Original: LodashCapitalize = js.native
  
  def castArray[T](value: Many[T]): js.Array[T] = js.native
  @JSName("castArray")
  var castArray_Original: LodashCastArray = js.native
  
  def ceil(n: Double): Double = js.native
  @JSName("ceil")
  var ceil_Original: LodashCeil = js.native
  
  def chunk(size: Double): LodashChunk1x1 = js.native
  def chunk[T](size: Double, array: List[T]): js.Array[js.Array[T]] = js.native
  def chunk[T](size: __): LodashChunk1x2[T] = js.native
  def chunk[T](size: __, array: List[T]): LodashChunk1x2[T] = js.native
  @JSName("chunk")
  var chunk_Original: LodashChunk = js.native
  @JSName("chunk")
  def chunk_T_Array[T](size: Double): js.Array[js.Array[T]] = js.native
  
  def clamp(lower: Double): LodashClamp1x1 = js.native
  def clamp(lower: Double, upper: Double): LodashClamp1x3 = js.native
  def clamp(lower: Double, upper: Double, number: Double): Double = js.native
  def clamp(lower: Double, upper: __, number: Double): LodashClamp1x5 = js.native
  def clamp(lower: __, upper: Double): LodashClamp1x2 = js.native
  def clamp(lower: __, upper: Double, number: Double): LodashClamp1x6 = js.native
  def clamp(lower: __, upper: __, number: Double): LodashClamp1x4 = js.native
  @JSName("clamp")
  var clamp_Original: LodashClamp = js.native
  
  def clone[T](value: T): T = js.native
  
  def cloneDeep[T](value: T): T = js.native
  
  def cloneDeepWith[T](customizer: CloneDeepWithCustomizer[T]): LodashCloneDeepWith1x1[T] = js.native
  def cloneDeepWith[T](customizer: CloneDeepWithCustomizer[T], value: T): js.Any = js.native
  def cloneDeepWith[T](customizer: __, value: T): LodashCloneDeepWith1x2[T] = js.native
  @JSName("cloneDeepWith")
  var cloneDeepWith_Original: LodashCloneDeepWith = js.native
  
  @JSName("cloneDeep")
  var cloneDeep_Original: LodashCloneDeep = js.native
  
  def cloneWith[T](customizer: __, value: T): LodashCloneWith1x2[T] = js.native
  def cloneWith[T, TResult /* <: js.Object | java.lang.String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult]): LodashCloneWith1x1[T, TResult] = js.native
  def cloneWith[T, TResult /* <: js.Object | java.lang.String | Double | Boolean | Null */](customizer: CloneWithCustomizer[T, TResult], value: T): TResult = js.native
  @JSName("cloneWith")
  var cloneWith_Original: LodashCloneWith = js.native
  @JSName("cloneWith")
  def cloneWith_TTResult_LodashCloneWith2x1[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]]): LodashCloneWith2x1[T, TResult] = js.native
  @JSName("cloneWith")
  def cloneWith_TTResult_Union[T, TResult](customizer: CloneWithCustomizer[T, js.UndefOr[TResult]], value: T): TResult | T = js.native
  
  @JSName("clone")
  var clone_Original: LodashClone = js.native
  
  def compact[T](): js.Array[T] = js.native
  def compact[T](array: List[js.UndefOr[T | Null | `false` | _empty | `0`]]): js.Array[T] = js.native
  @JSName("compact")
  var compact_Original: LodashCompact = js.native
  
  def complement[T /* <: js.Array[_] */](predicate: js.Function1[/* args */ T, _]): js.Function1[/* args */ T, Boolean] = js.native
  @JSName("complement")
  var complement_Original: LodashNegate = js.native
  
  def compose(func: (Many[js.Function1[/* repeated */ _, _]])*): js.Function1[/* repeated */ js.Any, _] = js.native
  def compose[A /* <: js.Array[_] */, R1, R2](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* args */ A, R1]): js.Function1[/* args */ A, R2] = js.native
  def compose[A /* <: js.Array[_] */, R1, R2, R3](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R3] = js.native
  def compose[A /* <: js.Array[_] */, R1, R2, R3, R4](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R4] = js.native
  def compose[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R5] = js.native
  def compose[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R6] = js.native
  def compose[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R7] = js.native
  @JSName("compose")
  var compose_Original: LodashFlowRight = js.native
  
  def concat[T](array: Many[T]): LodashConcat1x1[T] = js.native
  def concat[T](array: Many[T], values: Many[T]): js.Array[T] = js.native
  def concat[T](array: __, values: Many[T]): LodashConcat1x2[T] = js.native
  @JSName("concat")
  var concat_Original: LodashConcat = js.native
  
  def cond[T, R](pairs: js.Array[CondPair[T, R]]): js.Function1[/* Target */ T, R] = js.native
  @JSName("cond")
  var cond_Original: LodashCond = js.native
  
  def conforms[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T] = js.native
  def conforms[T](source: ConformsPredicateObject[T], `object`: T): Boolean = js.native
  def conforms[T](source: __, `object`: T): LodashConformsTo1x2[T] = js.native
  
  def conformsTo[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T] = js.native
  def conformsTo[T](source: ConformsPredicateObject[T], `object`: T): Boolean = js.native
  def conformsTo[T](source: __, `object`: T): LodashConformsTo1x2[T] = js.native
  @JSName("conformsTo")
  var conformsTo_Original: LodashConformsTo = js.native
  
  @JSName("conforms")
  var conforms_Original: LodashConformsTo = js.native
  
  def constant[T](value: T): js.Function0[T] = js.native
  @JSName("constant")
  var constant_Original: LodashConstant = js.native
  
  def contains[T](target: T): LodashContains1x1[T] = js.native
  def contains[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def contains[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def contains[T](target: __): LodashContains1x2[T] = js.native
  def contains[T](target: __, collection: Dictionary[T]): LodashContains1x2[T] = js.native
  def contains[T](target: __, collection: NumericDictionary[T]): LodashContains1x2[T] = js.native
  @JSName("contains")
  var contains_Original: LodashContains = js.native
  @JSName("contains")
  def contains_T_Boolean[T](target: T): Boolean = js.native
  
  def countBy[T](iteratee: ValueIteratee[T]): Dictionary[Double] = js.native
  def countBy[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[Double] = js.native
  def countBy[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[Double] = js.native
  def countBy[T](iteratee: __): LodashCountBy1x2[T] = js.native
  def countBy[T /* <: js.Object */](iteratee: __, collection: T): LodashCountBy2x2[T] = js.native
  def countBy[T](iteratee: __, collection: List[T]): LodashCountBy1x2[T] = js.native
  @JSName("countBy")
  var countBy_Original: LodashCountBy = js.native
  @JSName("countBy")
  def countBy_T_LodashCountBy1x1[T](iteratee: ValueIteratee[T]): LodashCountBy1x1[T] = js.native
  @JSName("countBy")
  def countBy_T_Object[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[Double] = js.native
  @JSName("countBy")
  def countBy_T_Object_LodashCountBy2x2[T /* <: js.Object */](iteratee: __): LodashCountBy2x2[T] = js.native
  
  def create[T /* <: js.Object */, U /* <: js.Object */](prototype: T): T with U = js.native
  @JSName("create")
  var create_Original: LodashCreate = js.native
  
  def curry(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def curry[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R] = js.native
  def curry[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): CurriedFunction3[T1, T2, T3, R] = js.native
  def curry[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): CurriedFunction4[T1, T2, T3, T4, R] = js.native
  def curry[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): CurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  
  def curryN(arity: Double): LodashCurryN1x1 = js.native
  def curryN(arity: Double, func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def curryN(arity: __, func: js.Function1[/* repeated */ js.Any, _]): LodashCurryN6x2 = js.native
  def curryN[T1, T2, R](arity: Double, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R] = js.native
  def curryN[T1, T2, R](arity: __, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): LodashCurryN2x2[T1, T2, R] = js.native
  def curryN[T1, T2, T3, R](arity: Double, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): CurriedFunction3[T1, T2, T3, R] = js.native
  def curryN[T1, T2, T3, R](arity: __, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): LodashCurryN3x2[T1, T2, T3, R] = js.native
  def curryN[T1, T2, T3, T4, R](arity: Double, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): CurriedFunction4[T1, T2, T3, T4, R] = js.native
  def curryN[T1, T2, T3, T4, R](arity: __, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): LodashCurryN4x2[T1, T2, T3, T4, R] = js.native
  def curryN[T1, T2, T3, T4, T5, R](
    arity: Double,
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  ): CurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  def curryN[T1, T2, T3, T4, T5, R](arity: __, func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): LodashCurryN5x2[T1, T2, T3, T4, T5, R] = js.native
  @JSName("curryN")
  var curryN_Original: LodashCurryN = js.native
  @JSName("curryN")
  def curryN_T1R_CurriedFunction1[T1, R](arity: Double, func: js.Function1[/* t1 */ T1, R]): CurriedFunction1[T1, R] = js.native
  @JSName("curryN")
  def curryN_T1R_LodashCurryN1x2[T1, R](arity: __, func: js.Function1[/* t1 */ T1, R]): LodashCurryN1x2[T1, R] = js.native
  
  def curryRight(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def curryRight[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): RightCurriedFunction2[T1, T2, R] = js.native
  def curryRight[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): RightCurriedFunction3[T1, T2, T3, R] = js.native
  def curryRight[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): RightCurriedFunction4[T1, T2, T3, T4, R] = js.native
  def curryRight[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): RightCurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  
  def curryRightN(arity: Double): LodashCurryRightN1x1 = js.native
  def curryRightN(arity: Double, func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def curryRightN(arity: __, func: js.Function1[/* repeated */ js.Any, _]): LodashCurryRightN6x2 = js.native
  def curryRightN[T1, T2, R](arity: Double, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): RightCurriedFunction2[T1, T2, R] = js.native
  def curryRightN[T1, T2, R](arity: __, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): LodashCurryRightN2x2[T1, T2, R] = js.native
  def curryRightN[T1, T2, T3, R](arity: Double, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): RightCurriedFunction3[T1, T2, T3, R] = js.native
  def curryRightN[T1, T2, T3, R](arity: __, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): LodashCurryRightN3x2[T1, T2, T3, R] = js.native
  def curryRightN[T1, T2, T3, T4, R](arity: Double, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): RightCurriedFunction4[T1, T2, T3, T4, R] = js.native
  def curryRightN[T1, T2, T3, T4, R](arity: __, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): LodashCurryRightN4x2[T1, T2, T3, T4, R] = js.native
  def curryRightN[T1, T2, T3, T4, T5, R](
    arity: Double,
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  ): RightCurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  def curryRightN[T1, T2, T3, T4, T5, R](arity: __, func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): LodashCurryRightN5x2[T1, T2, T3, T4, T5, R] = js.native
  @JSName("curryRightN")
  var curryRightN_Original: LodashCurryRightN = js.native
  @JSName("curryRightN")
  def curryRightN_T1R_LodashCurryRightN1x2[T1, R](arity: __, func: js.Function1[/* t1 */ T1, R]): LodashCurryRightN1x2[T1, R] = js.native
  @JSName("curryRightN")
  def curryRightN_T1R_RightCurriedFunction1[T1, R](arity: Double, func: js.Function1[/* t1 */ T1, R]): RightCurriedFunction1[T1, R] = js.native
  
  @JSName("curryRight")
  var curryRight_Original: LodashCurryRight = js.native
  @JSName("curryRight")
  def curryRight_T1R_RightCurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R]): RightCurriedFunction1[T1, R] = js.native
  
  @JSName("curry")
  var curry_Original: LodashCurry = js.native
  @JSName("curry")
  def curry_T1R_CurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R]): CurriedFunction1[T1, R] = js.native
  
  def debounce(wait: Double): LodashDebounce1x1 = js.native
  def debounce[T /* <: js.Function1[/* args */ js.Any, _] */](wait: Double, func: T): DebouncedFunc[T] = js.native
  def debounce[T /* <: js.Function1[/* args */ js.Any, _] */](wait: __, func: T): LodashDebounce1x2[T] = js.native
  @JSName("debounce")
  var debounce_Original: LodashDebounce = js.native
  
  def deburr(string: java.lang.String): java.lang.String = js.native
  @JSName("deburr")
  var deburr_Original: LodashDeburr = js.native
  
  def defaultTo[T](defaultValue: T): LodashDefaultTo1x1[T] = js.native
  def defaultTo[T](defaultValue: T, value: T): T = js.native
  def defaultTo[T](defaultValue: __): LodashDefaultTo1x2[T] = js.native
  def defaultTo[T](defaultValue: __, value: T): LodashDefaultTo1x2[T] = js.native
  @JSName("defaultTo")
  var defaultTo_Original: LodashDefaultTo = js.native
  @JSName("defaultTo")
  def defaultTo_TDefault_LodashDefaultTo2x1[TDefault](defaultValue: TDefault): LodashDefaultTo2x1[TDefault] = js.native
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](defaultValue: TDefault): T | TDefault = js.native
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](defaultValue: TDefault, value: T): T | TDefault = js.native
  @JSName("defaultTo")
  def defaultTo_T_T[T](defaultValue: T): T = js.native
  
  def defaults[TSource](source: TSource): LodashDefaults1x1[TSource] = js.native
  def defaults[TObject](source: __, `object`: TObject): LodashDefaults1x2[TObject] = js.native
  def defaults[TObject, TSource](source: TSource, `object`: TObject): TSource with TObject = js.native
  
  def defaultsAll(`object`: js.Array[_]): js.Any = js.native
  def defaultsAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TSource with TObject = js.native
  def defaultsAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TSource2 with TSource1 with TObject = js.native
  def defaultsAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TSource3 with TSource2 with TSource1 with TObject = js.native
  def defaultsAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TSource4 with TSource3 with TSource2 with TSource1 with TObject = js.native
  @JSName("defaultsAll")
  var defaultsAll_Original: LodashDefaultsAll = js.native
  @JSName("defaultsAll")
  def defaultsAll_TObject_TObject[TObject](`object`: js.Array[TObject]): TObject = js.native
  
  def defaultsDeep(sources: js.Any): LodashDefaultsDeep1x1 = js.native
  def defaultsDeep(sources: js.Any, `object`: js.Any): js.Any = js.native
  def defaultsDeep(sources: __, `object`: js.Any): LodashDefaultsDeep1x2 = js.native
  
  def defaultsDeepAll(`object`: js.Array[_]): js.Any = js.native
  @JSName("defaultsDeepAll")
  var defaultsDeepAll_Original: LodashDefaultsDeepAll = js.native
  
  @JSName("defaultsDeep")
  var defaultsDeep_Original: LodashDefaultsDeep = js.native
  
  @JSName("defaults")
  var defaults_Original: LodashDefaults = js.native
  
  def defer(func: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Double = js.native
  @JSName("defer")
  var defer_Original: LodashDefer = js.native
  
  def delay(wait: Double): LodashDelay1x1 = js.native
  def delay(wait: Double, func: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  def delay(wait: __, func: js.Function1[/* repeated */ js.Any, _]): LodashDelay1x2 = js.native
  @JSName("delay")
  var delay_Original: LodashDelay = js.native
  
  def difference[T](): LodashDifference1x1[T] = js.native
  def difference[T](array: js.UndefOr[scala.Nothing], values: List[T]): js.Array[T] = js.native
  def difference[T](array: Null, values: List[T]): js.Array[T] = js.native
  def difference[T](array: List[T]): LodashDifference1x1[T] = js.native
  def difference[T](array: List[T], values: List[T]): js.Array[T] = js.native
  def difference[T](array: __, values: List[T]): LodashDifference1x2[T] = js.native
  
  def differenceBy[T1](iteratee: __): LodashDifferenceBy1x2[T1] = js.native
  def differenceBy[T1](iteratee: __, array: List[T1]): LodashDifferenceBy1x2[T1] = js.native
  def differenceBy[T2](iteratee: __, array: __, values: List[T2]): LodashDifferenceBy1x4[T2] = js.native
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x1[T1, T2] = js.native
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: js.UndefOr[scala.Nothing], values: List[T2]): js.Array[T1] = js.native
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: List[T2]): js.Array[T1] = js.native
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1]): LodashDifferenceBy1x3[T1, T2] = js.native
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1], values: List[T2]): js.Array[T1] = js.native
  def differenceBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: List[T2]): LodashDifferenceBy1x5[T1] = js.native
  def differenceBy[T1, T2](iteratee: __, array: js.UndefOr[scala.Nothing], values: List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  def differenceBy[T1, T2](iteratee: __, array: Null, values: List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  def differenceBy[T1, T2](iteratee: __, array: List[T1], values: List[T2]): LodashDifferenceBy1x6[T1, T2] = js.native
  @JSName("differenceBy")
  var differenceBy_Original: LodashDifferenceBy = js.native
  @JSName("differenceBy")
  def differenceBy_T1T2_LodashDifferenceBy1x3[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashDifferenceBy1x3[T1, T2] = js.native
  
  def differenceWith[T1](comparator: __): LodashDifferenceWith1x2[T1] = js.native
  def differenceWith[T1](comparator: __, array: List[T1]): LodashDifferenceWith1x2[T1] = js.native
  def differenceWith[T2](comparator: __, array: __, values: List[T2]): LodashDifferenceWith1x4[T2] = js.native
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x1[T1, T2] = js.native
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: js.UndefOr[scala.Nothing], values: List[T2]): js.Array[T1] = js.native
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: Null, values: List[T2]): js.Array[T1] = js.native
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: List[T1]): LodashDifferenceWith1x3[T1, T2] = js.native
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: List[T1], values: List[T2]): js.Array[T1] = js.native
  def differenceWith[T1, T2](comparator: Comparator2[T1, T2], array: __, values: List[T2]): LodashDifferenceWith1x5[T1] = js.native
  def differenceWith[T1, T2](comparator: __, array: js.UndefOr[scala.Nothing], values: List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
  def differenceWith[T1, T2](comparator: __, array: Null, values: List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
  def differenceWith[T1, T2](comparator: __, array: List[T1], values: List[T2]): LodashDifferenceWith1x6[T1, T2] = js.native
  @JSName("differenceWith")
  var differenceWith_Original: LodashDifferenceWith = js.native
  @JSName("differenceWith")
  def differenceWith_T1T2_LodashDifferenceWith1x3[T1, T2](comparator: Comparator2[T1, T2]): LodashDifferenceWith1x3[T1, T2] = js.native
  
  @JSName("difference")
  var difference_Original: LodashDifference = js.native
  
  def dissoc(path: PropertyPath): LodashUnset1x1 = js.native
  def dissoc[T](path: PropertyPath, `object`: T): T = js.native
  def dissoc[T](path: __, `object`: T): LodashUnset1x2[T] = js.native
  
  def dissocPath(path: PropertyPath): LodashUnset1x1 = js.native
  def dissocPath[T](path: PropertyPath, `object`: T): T = js.native
  def dissocPath[T](path: __, `object`: T): LodashUnset1x2[T] = js.native
  @JSName("dissocPath")
  var dissocPath_Original: LodashUnset = js.native
  
  @JSName("dissoc")
  var dissoc_Original: LodashUnset = js.native
  
  def divide(dividend: Double): LodashDivide1x1 = js.native
  def divide(dividend: Double, divisor: Double): Double = js.native
  def divide(dividend: __, divisor: Double): LodashDivide1x2 = js.native
  @JSName("divide")
  var divide_Original: LodashDivide = js.native
  
  def drop(n: Double): LodashDrop1x1 = js.native
  def drop[T](n: Double, array: List[T]): js.Array[T] = js.native
  def drop[T](n: __): LodashDrop1x2[T] = js.native
  def drop[T](n: __, array: List[T]): LodashDrop1x2[T] = js.native
  
  def dropLast(n: Double): LodashDropRight1x1 = js.native
  def dropLast[T](n: Double, array: List[T]): js.Array[T] = js.native
  def dropLast[T](n: __): LodashDropRight1x2[T] = js.native
  def dropLast[T](n: __, array: List[T]): LodashDropRight1x2[T] = js.native
  
  def dropLastWhile[T](predicate: ValueIteratee[T]): LodashDropRightWhile1x1[T] = js.native
  def dropLastWhile[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def dropLastWhile[T](predicate: __): LodashDropRightWhile1x2[T] = js.native
  def dropLastWhile[T](predicate: __, array: List[T]): LodashDropRightWhile1x2[T] = js.native
  @JSName("dropLastWhile")
  var dropLastWhile_Original: LodashDropRightWhile = js.native
  @JSName("dropLastWhile")
  def dropLastWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  
  @JSName("dropLast")
  var dropLast_Original: LodashDropRight = js.native
  @JSName("dropLast")
  def dropLast_T_Array[T](n: Double): js.Array[T] = js.native
  
  def dropRight(n: Double): LodashDropRight1x1 = js.native
  def dropRight[T](n: Double, array: List[T]): js.Array[T] = js.native
  def dropRight[T](n: __): LodashDropRight1x2[T] = js.native
  def dropRight[T](n: __, array: List[T]): LodashDropRight1x2[T] = js.native
  
  def dropRightWhile[T](predicate: ValueIteratee[T]): LodashDropRightWhile1x1[T] = js.native
  def dropRightWhile[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def dropRightWhile[T](predicate: __): LodashDropRightWhile1x2[T] = js.native
  def dropRightWhile[T](predicate: __, array: List[T]): LodashDropRightWhile1x2[T] = js.native
  @JSName("dropRightWhile")
  var dropRightWhile_Original: LodashDropRightWhile = js.native
  @JSName("dropRightWhile")
  def dropRightWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  
  @JSName("dropRight")
  var dropRight_Original: LodashDropRight = js.native
  @JSName("dropRight")
  def dropRight_T_Array[T](n: Double): js.Array[T] = js.native
  
  def dropWhile[T](predicate: ValueIteratee[T]): LodashDropWhile1x1[T] = js.native
  def dropWhile[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def dropWhile[T](predicate: __): LodashDropWhile1x2[T] = js.native
  def dropWhile[T](predicate: __, array: List[T]): LodashDropWhile1x2[T] = js.native
  @JSName("dropWhile")
  var dropWhile_Original: LodashDropWhile = js.native
  @JSName("dropWhile")
  def dropWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  
  @JSName("drop")
  var drop_Original: LodashDrop = js.native
  @JSName("drop")
  def drop_T_Array[T](n: Double): js.Array[T] = js.native
  
  def each[T](iteratee: js.Function1[/* value */ T, _]): LodashForEach1x1[T] = js.native
  def each[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): T = js.native
  def each[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def each[T](iteratee: js.Function1[/* value */ T, _], collection: List[T]): List[T] = js.native
  def each[T /* <: js.Object */](iteratee: __): LodashForEach6x2[T] = js.native
  def each[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach6x2[T] = js.native
  def each[T](iteratee: __, collection: js.Array[T]): LodashForEach1x2[T] = js.native
  def each[T](iteratee: __, collection: List[T]): LodashForEach2x2[T] = js.native
  
  def eachRight[T](iteratee: js.Function1[/* value */ T, _]): LodashForEachRight1x1[T] = js.native
  def eachRight[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): T = js.native
  def eachRight[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def eachRight[T](iteratee: js.Function1[/* value */ T, _], collection: List[T]): List[T] = js.native
  def eachRight[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T] = js.native
  def eachRight[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight3x2[T] = js.native
  def eachRight[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T] = js.native
  def eachRight[T](iteratee: __, collection: List[T]): LodashForEachRight2x2[T] = js.native
  @JSName("eachRight")
  var eachRight_Original: LodashForEachRight = js.native
  @JSName("eachRight")
  def `eachRight_TTArray_UnionArrayTNull<undefined>_LodashForEachRight4x2`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: TArray with (js.UndefOr[js.Array[T] | Null])): LodashForEachRight4x2[T, TArray] = js.native
  @JSName("eachRight")
  def `eachRight_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("eachRight")
  def `eachRight_TTList_UnionListTNull<undefined>_LodashForEachRight5x2`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: __, collection: TList with (js.UndefOr[List[T] | Null])): LodashForEachRight5x2[T, TList] = js.native
  @JSName("eachRight")
  def `eachRight_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("eachRight")
  def eachRight_T_Object_LodashForEachRight6x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight6x2[T] = js.native
  @JSName("eachRight")
  def eachRight_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  @JSName("eachRight")
  def eachRight_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  
  @JSName("each")
  var each_Original: LodashForEach = js.native
  @JSName("each")
  def `each_TTArray_UnionArrayTNull<undefined>_LodashForEach4x2`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: TArray with (js.UndefOr[js.Array[T] | Null])): LodashForEach4x2[T, TArray] = js.native
  @JSName("each")
  def `each_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("each")
  def `each_TTList_UnionListTNull<undefined>_LodashForEach5x2`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: __, collection: TList with (js.UndefOr[List[T] | Null])): LodashForEach5x2[T, TList] = js.native
  @JSName("each")
  def `each_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("each")
  def each_T_Object_LodashForEach3x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach3x2[T] = js.native
  @JSName("each")
  def each_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  @JSName("each")
  def each_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  
  def endsWith(target: java.lang.String): LodashEndsWith1x1 = js.native
  def endsWith(target: java.lang.String, string: java.lang.String): Boolean = js.native
  def endsWith(target: __, string: java.lang.String): LodashEndsWith1x2 = js.native
  @JSName("endsWith")
  var endsWith_Original: LodashEndsWith = js.native
  
  def entries(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def entries[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  def entries[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  
  def entriesIn(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def entriesIn[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  def entriesIn[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  @JSName("entriesIn")
  var entriesIn_Original: LodashToPairsIn = js.native
  
  @JSName("entries")
  var entries_Original: LodashToPairs = js.native
  
  def eq(value: js.Any): LodashEq1x1 = js.native
  def eq(value: js.Any, other: js.Any): Boolean = js.native
  def eq(value: __, other: js.Any): LodashEq1x2 = js.native
  @JSName("eq")
  var eq_Original: LodashEq = js.native
  
  def equals(value: js.Any): LodashIsEqual1x1 = js.native
  def equals(value: js.Any, other: js.Any): Boolean = js.native
  def equals(value: __, other: js.Any): LodashIsEqual1x2 = js.native
  @JSName("equals")
  var equals_Original: LodashIsEqual = js.native
  
  def escape(string: java.lang.String): java.lang.String = js.native
  
  def escapeRegExp(string: java.lang.String): java.lang.String = js.native
  @JSName("escapeRegExp")
  var escapeRegExp_Original: LodashEscapeRegExp = js.native
  
  @JSName("escape")
  var escape_Original: LodashEscape = js.native
  
  def every[T](predicate: ValueIterateeCustom[T, Boolean]): LodashEvery1x1[T] = js.native
  def every[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def every[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def every[T /* <: js.Object */](predicate: __): LodashEvery2x2[T] = js.native
  def every[T /* <: js.Object */](predicate: __, collection: T): LodashEvery2x2[T] = js.native
  def every[T](predicate: __, collection: List[T]): LodashEvery1x2[T] = js.native
  @JSName("every")
  var every_Original: LodashEvery = js.native
  @JSName("every")
  def every_T_Boolean[T](predicate: ValueIterateeCustom[T, Boolean]): Boolean = js.native
  @JSName("every")
  def every_T_LodashEvery1x2[T](predicate: __): LodashEvery1x2[T] = js.native
  @JSName("every")
  def every_T_Object_Boolean[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): Boolean = js.native
  
  def extend[TObject](`object`: TObject): LodashExtend1x1[TObject] = js.native
  def extend[TSource](`object`: __, source: TSource): LodashExtend1x2[TSource] = js.native
  def extend[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  
  def extendAll[TResult](`object`: js.Array[_]): TResult = js.native
  def extendAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject with TSource = js.native
  def extendAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject with TSource1 with TSource2 = js.native
  def extendAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject with TSource1 with TSource2 with TSource3 = js.native
  def extendAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  def extendAllWith(customizer: AssignCustomizer): LodashExtendAllWith1x1 = js.native
  def extendAllWith(customizer: AssignCustomizer, args: js.Array[_]): js.Any = js.native
  def extendAllWith(customizer: __, args: js.Array[_]): LodashExtendAllWith1x2 = js.native
  @JSName("extendAllWith")
  var extendAllWith_Original: LodashExtendAllWith = js.native
  
  @JSName("extendAll")
  var extendAll_Original: LodashExtendAll = js.native
  @JSName("extendAll")
  def extendAll_TObject_TObject[TObject](`object`: js.Array[TObject]): TObject = js.native
  
  def extendWith(customizer: AssignCustomizer): LodashExtendWith1x1 = js.native
  def extendWith[TObject](customizer: AssignCustomizer, `object`: TObject): LodashExtendWith1x3[TObject] = js.native
  def extendWith[TSource](customizer: AssignCustomizer, `object`: __, source: TSource): LodashExtendWith1x5[TSource] = js.native
  def extendWith[TObject](customizer: __, `object`: TObject): LodashExtendWith1x2[TObject] = js.native
  def extendWith[TSource](customizer: __, `object`: __, source: TSource): LodashExtendWith1x4[TSource] = js.native
  def extendWith[TObject, TSource](customizer: AssignCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def extendWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashExtendWith1x6[TObject, TSource] = js.native
  @JSName("extendWith")
  var extendWith_Original: LodashExtendWith = js.native
  
  @JSName("extend")
  var extend_Original: LodashExtend = js.native
  
  def fill(start: Double): LodashFill1x1 = js.native
  def fill(start: Double, end: Double): LodashFill1x3 = js.native
  def fill(start: __, end: Double): LodashFill1x2 = js.native
  def fill[T](start: Double, end: Double, value: T): LodashFill1x7[T] = js.native
  def fill[U](start: Double, end: Double, value: __): LodashFill2x11[U] = js.native
  def fill[U](start: Double, end: Double, value: __, array: js.Array[U]): LodashFill1x11[U] = js.native
  def fill[U](start: Double, end: Double, value: __, array: List[U]): LodashFill2x11[U] = js.native
  def fill[T](start: Double, end: __, value: T): LodashFill1x5[T] = js.native
  def fill[U](start: Double, end: __, value: __): LodashFill2x9[U] = js.native
  def fill[U](start: Double, end: __, value: __, array: js.Array[U]): LodashFill1x9[U] = js.native
  def fill[U](start: Double, end: __, value: __, array: List[U]): LodashFill2x9[U] = js.native
  def fill[T](start: __, end: Double, value: T): LodashFill1x6[T] = js.native
  def fill[U](start: __, end: Double, value: __): LodashFill2x10[U] = js.native
  def fill[U](start: __, end: Double, value: __, array: js.Array[U]): LodashFill1x10[U] = js.native
  def fill[U](start: __, end: Double, value: __, array: List[U]): LodashFill2x10[U] = js.native
  def fill[T](start: __, end: __, value: T): LodashFill1x4[T] = js.native
  def fill[U](start: __, end: __, value: __): LodashFill1x8[U] = js.native
  def fill[U](start: __, end: __, value: __, array: js.Array[U]): LodashFill1x8[U] = js.native
  def fill[U](start: __, end: __, value: __, array: List[U]): LodashFill2x8[U] = js.native
  def fill[T, U](start: Double, end: Double, value: T, array: js.Array[U]): js.Array[T | U] = js.native
  def fill[T, U](start: Double, end: Double, value: T, array: List[U]): List[T | U] = js.native
  def fill[T, U](start: Double, end: __, value: T, array: js.Array[U]): LodashFill1x13[T, U] = js.native
  def fill[T, U](start: Double, end: __, value: T, array: List[U]): LodashFill2x13[T, U] = js.native
  def fill[T, U](start: __, end: Double, value: T, array: js.Array[U]): LodashFill1x14[T, U] = js.native
  def fill[T, U](start: __, end: Double, value: T, array: List[U]): LodashFill2x14[T, U] = js.native
  def fill[T, U](start: __, end: __, value: T, array: js.Array[U]): LodashFill1x12[T, U] = js.native
  def fill[T, U](start: __, end: __, value: T, array: List[U]): LodashFill2x12[T, U] = js.native
  @JSName("fill")
  var fill_Original: LodashFill = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](start: Double, end: Double, value: T): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_List[T, U](start: Double, end: Double, value: T): List[T | U] = js.native
  @JSName("fill")
  def fill_TU_LodashFill1x12[T, U](start: __, end: __, value: T): LodashFill1x12[T, U] = js.native
  @JSName("fill")
  def fill_TU_LodashFill1x13[T, U](start: Double, end: __, value: T): LodashFill1x13[T, U] = js.native
  @JSName("fill")
  def fill_TU_LodashFill1x14[T, U](start: __, end: Double, value: T): LodashFill1x14[T, U] = js.native
  @JSName("fill")
  def fill_TU_LodashFill2x12[T, U](start: __, end: __, value: T): LodashFill2x12[T, U] = js.native
  @JSName("fill")
  def fill_TU_LodashFill2x13[T, U](start: Double, end: __, value: T): LodashFill2x13[T, U] = js.native
  @JSName("fill")
  def fill_TU_LodashFill2x14[T, U](start: __, end: Double, value: T): LodashFill2x14[T, U] = js.native
  @JSName("fill")
  def fill_U_LodashFill1x10[U](start: __, end: Double, value: __): LodashFill1x10[U] = js.native
  @JSName("fill")
  def fill_U_LodashFill1x11[U](start: Double, end: Double, value: __): LodashFill1x11[U] = js.native
  @JSName("fill")
  def fill_U_LodashFill1x9[U](start: Double, end: __, value: __): LodashFill1x9[U] = js.native
  @JSName("fill")
  def fill_U_LodashFill2x8[U](start: __, end: __, value: __): LodashFill2x8[U] = js.native
  
  def filter[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.Array[T] = js.native
  def filter[T](predicate: __): LodashFilter1x2[T] = js.native
  def filter[T /* <: js.Object */](predicate: __, collection: T): LodashFilter3x2[T] = js.native
  def filter[T](predicate: __, collection: List[T]): LodashFilter1x2[T] = js.native
  def filter[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.Array[S] = js.native
  def filter[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.Array[S] = js.native
  def filter[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: List[T]): js.Array[S] = js.native
  @JSName("filter")
  var filter_Original: LodashFilter = js.native
  @JSName("filter")
  def filter_T[T](predicate: ValueIterateeCustom[T, Boolean]): js.Array[T] = js.native
  @JSName("filter")
  def filter_TS_T_LodashFilter1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFilter1x1[T, S] = js.native
  @JSName("filter")
  def filter_T_LodashFilter2x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFilter2x1[T] = js.native
  @JSName("filter")
  def filter_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): js.Array[S] = js.native
  @JSName("filter")
  def filter_T_ObjectS_Any_LodashFilter3x1[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFilter3x1[T, S] = js.native
  @JSName("filter")
  def filter_T_Object_LodashFilter3x2[T /* <: js.Object */](predicate: __): LodashFilter3x2[T] = js.native
  
  def find[T](predicate: ValueIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def find[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.UndefOr[T] = js.native
  def find[T /* <: js.Object */](predicate: __): LodashFind3x2[T] = js.native
  def find[T /* <: js.Object */](predicate: __, collection: T): LodashFind3x2[T] = js.native
  def find[T](predicate: __, collection: List[T]): LodashFind1x2[T] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): js.UndefOr[S] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def find[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: List[T]): js.UndefOr[S] = js.native
  
  def findFrom(predicate: __, fromIndex: Double): LodashFindFrom1x2 = js.native
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindFrom2x1[T] = js.native
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  def findFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, collection: List[T]): js.UndefOr[T] = js.native
  def findFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __
  ): LodashFindFrom4x5[T] = js.native
  def findFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __,
    collection: T
  ): LodashFindFrom4x5[T] = js.native
  def findFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, collection: List[T]): LodashFindFrom2x5[T] = js.native
  def findFrom[T /* <: js.Object */](predicate: __, fromIndex: Double, collection: T): LodashFindFrom3x6[T] = js.native
  def findFrom[T](predicate: __, fromIndex: Double, collection: List[T]): LodashFindFrom1x6[T] = js.native
  def findFrom[T /* <: js.Object */](predicate: __, fromIndex: __): LodashFindFrom3x4[T] = js.native
  def findFrom[T /* <: js.Object */](predicate: __, fromIndex: __, collection: T): LodashFindFrom3x4[T] = js.native
  def findFrom[T](predicate: __, fromIndex: __, collection: List[T]): LodashFindFrom1x4[T] = js.native
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindFrom3x1[T, S] = js.native
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): LodashFindFrom1x3[T, S] = js.native
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[S] = js.native
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double, collection: List[T]): js.UndefOr[S] = js.native
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __): LodashFindFrom1x5[S] = js.native
  def findFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __,
    collection: T
  ): LodashFindFrom3x5[S] = js.native
  def findFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __, collection: List[T]): LodashFindFrom1x5[S] = js.native
  @JSName("findFrom")
  var findFrom_Original: LodashFindFrom = js.native
  @JSName("findFrom")
  def findFrom_TS_T_LodashFindFrom1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindFrom1x1[T, S] = js.native
  @JSName("findFrom")
  def findFrom_TS_T_Union[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom1x4[T](predicate: __, fromIndex: __): LodashFindFrom1x4[T] = js.native
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom1x6[T](predicate: __, fromIndex: Double): LodashFindFrom1x6[T] = js.native
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom2x3[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindFrom2x3[T] = js.native
  @JSName("findFrom")
  def findFrom_T_LodashFindFrom2x5[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindFrom2x5[T] = js.native
  @JSName("findFrom")
  def findFrom_T_Object[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findFrom")
  def findFrom_T_ObjectS_Any_LodashFindFrom3x3[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): LodashFindFrom3x3[T, S] = js.native
  @JSName("findFrom")
  def findFrom_T_ObjectS_Any_LodashFindFrom3x5[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __
  ): LodashFindFrom3x5[S] = js.native
  @JSName("findFrom")
  def findFrom_T_ObjectS_Any_Union[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
  @JSName("findFrom")
  def findFrom_T_Object_LodashFindFrom3x6[T /* <: js.Object */](predicate: __, fromIndex: Double): LodashFindFrom3x6[T] = js.native
  
  def findIndex[T](predicate: ValueIterateeCustom[T, Boolean]): Double = js.native
  def findIndex[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def findIndex[T](predicate: __): LodashFindIndex1x2[T] = js.native
  def findIndex[T](predicate: __, array: List[T]): LodashFindIndex1x2[T] = js.native
  
  def findIndexFrom(predicate: __, fromIndex: Double): LodashFindIndexFrom1x2 = js.native
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndexFrom1x1[T] = js.native
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): Double = js.native
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, array: List[T]): Double = js.native
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindIndexFrom1x5 = js.native
  def findIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, array: List[T]): LodashFindIndexFrom1x5 = js.native
  def findIndexFrom[T](predicate: __, fromIndex: Double, array: List[T]): LodashFindIndexFrom1x6[T] = js.native
  def findIndexFrom[T](predicate: __, fromIndex: __): LodashFindIndexFrom1x4[T] = js.native
  def findIndexFrom[T](predicate: __, fromIndex: __, array: List[T]): LodashFindIndexFrom1x4[T] = js.native
  @JSName("findIndexFrom")
  var findIndexFrom_Original: LodashFindIndexFrom = js.native
  @JSName("findIndexFrom")
  def findIndexFrom_T_LodashFindIndexFrom1x3[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindIndexFrom1x3[T] = js.native
  @JSName("findIndexFrom")
  def findIndexFrom_T_LodashFindIndexFrom1x6[T](predicate: __, fromIndex: Double): LodashFindIndexFrom1x6[T] = js.native
  
  @JSName("findIndex")
  var findIndex_Original: LodashFindIndex = js.native
  @JSName("findIndex")
  def findIndex_T_LodashFindIndex1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndex1x1[T] = js.native
  
  def findKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): js.UndefOr[java.lang.String] = js.native
  def findKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): js.UndefOr[java.lang.String] = js.native
  def findKey[T](predicate: __): LodashFindKey1x2[T] = js.native
  def findKey[T](predicate: __, `object`: T): LodashFindKey1x2[T] = js.native
  @JSName("findKey")
  var findKey_Original: LodashFindKey = js.native
  @JSName("findKey")
  def findKey_T_LodashFindKey1x1[T](predicate: ValueIteratee[T]): LodashFindKey1x1[T] = js.native
  
  def findLast[T](predicate: ValueIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def findLast[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.UndefOr[T] = js.native
  def findLast[T /* <: js.Object */](predicate: __): LodashFindLast3x2[T] = js.native
  def findLast[T /* <: js.Object */](predicate: __, collection: T): LodashFindLast3x2[T] = js.native
  def findLast[T](predicate: __, collection: List[T]): LodashFindLast1x2[T] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindLast3x1[T, S] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    collection: T
  ): js.UndefOr[S] = js.native
  def findLast[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], collection: List[T]): js.UndefOr[S] = js.native
  
  def findLastFrom(predicate: __, fromIndex: Double): LodashFindLastFrom1x2 = js.native
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastFrom2x1[T] = js.native
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  def findLastFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, collection: List[T]): js.UndefOr[T] = js.native
  def findLastFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __
  ): LodashFindLastFrom4x5[T] = js.native
  def findLastFrom[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: __,
    collection: T
  ): LodashFindLastFrom4x5[T] = js.native
  def findLastFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, collection: List[T]): LodashFindLastFrom2x5[T] = js.native
  def findLastFrom[T /* <: js.Object */](predicate: __, fromIndex: Double, collection: T): LodashFindLastFrom3x6[T] = js.native
  def findLastFrom[T](predicate: __, fromIndex: Double, collection: List[T]): LodashFindLastFrom1x6[T] = js.native
  def findLastFrom[T /* <: js.Object */](predicate: __, fromIndex: __): LodashFindLastFrom3x4[T] = js.native
  def findLastFrom[T /* <: js.Object */](predicate: __, fromIndex: __, collection: T): LodashFindLastFrom3x4[T] = js.native
  def findLastFrom[T](predicate: __, fromIndex: __, collection: List[T]): LodashFindLastFrom1x4[T] = js.native
  def findLastFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindLastFrom1x1[T, S] = js.native
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): js.UndefOr[S] = js.native
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double,
    collection: T
  ): js.UndefOr[S] = js.native
  def findLastFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double, collection: List[T]): js.UndefOr[S] = js.native
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __
  ): LodashFindLastFrom3x5[S] = js.native
  def findLastFrom[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: __,
    collection: T
  ): LodashFindLastFrom3x5[S] = js.native
  def findLastFrom[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __, collection: List[T]): LodashFindLastFrom1x5[S] = js.native
  @JSName("findLastFrom")
  var findLastFrom_Original: LodashFindLastFrom = js.native
  @JSName("findLastFrom")
  def findLastFrom_TS_T[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  @JSName("findLastFrom")
  def findLastFrom_TS_T_LodashFindLastFrom1x3[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): LodashFindLastFrom1x3[T, S] = js.native
  @JSName("findLastFrom")
  def findLastFrom_TS_T_LodashFindLastFrom1x5[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: __): LodashFindLastFrom1x5[S] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom1x4[T](predicate: __, fromIndex: __): LodashFindLastFrom1x4[T] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom1x6[T](predicate: __, fromIndex: Double): LodashFindLastFrom1x6[T] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom2x3[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindLastFrom2x3[T] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_LodashFindLastFrom2x5[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindLastFrom2x5[T] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_Object[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_ObjectS_Any_LodashFindLastFrom3x1[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFindLastFrom3x1[T, S] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_ObjectS_Any_LodashFindLastFrom3x3[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ],
    fromIndex: Double
  ): LodashFindLastFrom3x3[T, S] = js.native
  @JSName("findLastFrom")
  def findLastFrom_T_Object_LodashFindLastFrom3x6[T /* <: js.Object */](predicate: __, fromIndex: Double): LodashFindLastFrom3x6[T] = js.native
  
  def findLastIndex[T](predicate: ValueIterateeCustom[T, Boolean]): Double = js.native
  def findLastIndex[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def findLastIndex[T](predicate: __): LodashFindLastIndex1x2[T] = js.native
  def findLastIndex[T](predicate: __, array: List[T]): LodashFindLastIndex1x2[T] = js.native
  
  def findLastIndexFrom(predicate: __, fromIndex: Double): LodashFindLastIndexFrom1x2 = js.native
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastIndexFrom1x1[T] = js.native
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindLastIndexFrom1x3[T] = js.native
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, array: List[T]): Double = js.native
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindLastIndexFrom1x5 = js.native
  def findLastIndexFrom[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, array: List[T]): LodashFindLastIndexFrom1x5 = js.native
  def findLastIndexFrom[T](predicate: __, fromIndex: Double, array: List[T]): LodashFindLastIndexFrom1x6[T] = js.native
  def findLastIndexFrom[T](predicate: __, fromIndex: __): LodashFindLastIndexFrom1x4[T] = js.native
  def findLastIndexFrom[T](predicate: __, fromIndex: __, array: List[T]): LodashFindLastIndexFrom1x4[T] = js.native
  @JSName("findLastIndexFrom")
  var findLastIndexFrom_Original: LodashFindLastIndexFrom = js.native
  @JSName("findLastIndexFrom")
  def findLastIndexFrom_T_Double[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): Double = js.native
  @JSName("findLastIndexFrom")
  def findLastIndexFrom_T_LodashFindLastIndexFrom1x6[T](predicate: __, fromIndex: Double): LodashFindLastIndexFrom1x6[T] = js.native
  
  @JSName("findLastIndex")
  var findLastIndex_Original: LodashFindLastIndex = js.native
  @JSName("findLastIndex")
  def findLastIndex_T_LodashFindLastIndex1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLastIndex1x1[T] = js.native
  
  def findLastKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): js.UndefOr[java.lang.String] = js.native
  def findLastKey[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): js.UndefOr[java.lang.String] = js.native
  def findLastKey[T](predicate: __): LodashFindLastKey1x2[T] = js.native
  def findLastKey[T](predicate: __, `object`: T): LodashFindLastKey1x2[T] = js.native
  @JSName("findLastKey")
  var findLastKey_Original: LodashFindLastKey = js.native
  @JSName("findLastKey")
  def findLastKey_T_LodashFindLastKey1x1[T](predicate: ValueIteratee[T]): LodashFindLastKey1x1[T] = js.native
  
  @JSName("findLast")
  var findLast_Original: LodashFindLast = js.native
  @JSName("findLast")
  def findLast_TS_T_LodashFindLast1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindLast1x1[T, S] = js.native
  @JSName("findLast")
  def findLast_TS_T_Union[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("findLast")
  def findLast_T_LodashFindLast1x2[T](predicate: __): LodashFindLast1x2[T] = js.native
  @JSName("findLast")
  def findLast_T_LodashFindLast2x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindLast2x1[T] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findLast")
  def findLast_T_ObjectS_Any_Union[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): js.UndefOr[S] = js.native
  
  @JSName("find")
  var find_Original: LodashFind = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("find")
  def find_TS_T_LodashFind1x1[T, S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFind1x1[T, S] = js.native
  @JSName("find")
  def find_T_LodashFind1x2[T](predicate: __): LodashFind1x2[T] = js.native
  @JSName("find")
  def find_T_LodashFind2x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFind2x1[T] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("find")
  def find_T_ObjectS_Any_LodashFind3x1[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](
    predicate: ValueIteratorTypeGuard[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      S
    ]
  ): LodashFind3x1[T, S] = js.native
  
  def first[T](): js.UndefOr[T] = js.native
  def first[T](array: List[T]): js.UndefOr[T] = js.native
  @JSName("first")
  var first_Original: LodashHead = js.native
  
  def flatMap(iteratee: java.lang.String): LodashFlatMap3x1 = js.native
  def flatMap(iteratee: java.lang.String, collection: js.Object): js.Array[_] = js.native
  def flatMap(iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMap(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def flatMap(iteratee: __): LodashFlatMap3x2 = js.native
  def flatMap(iteratee: __, collection: js.Object): LodashFlatMap3x2 = js.native
  def flatMap[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMap2x2[T] = js.native
  def flatMap[T](iteratee: __, collection: List[T]): LodashFlatMap1x2[T] = js.native
  def flatMap[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ]
  ): js.Array[TResult] = js.native
  def flatMap[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def flatMap[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]], collection: List[T]): js.Array[TResult] = js.native
  
  def flatMapDeep(iteratee: java.lang.String): LodashFlatMapDeep3x1 = js.native
  def flatMapDeep(iteratee: java.lang.String, collection: js.Object): js.Array[_] = js.native
  def flatMapDeep(iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMapDeep(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def flatMapDeep(iteratee: __): LodashFlatMapDeep3x2 = js.native
  def flatMapDeep(iteratee: __, collection: js.Object): LodashFlatMapDeep3x2 = js.native
  def flatMapDeep[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMapDeep2x2[T] = js.native
  def flatMapDeep[T](iteratee: __, collection: List[T]): LodashFlatMapDeep1x2[T] = js.native
  def flatMapDeep[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDeep1x1[T, TResult] = js.native
  def flatMapDeep[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def flatMapDeep[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    collection: List[T]
  ): js.Array[TResult] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_Array(iteratee: java.lang.String): js.Array[_] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_LodashFlatMapDeep4x1(iteratee: js.Object): LodashFlatMapDeep4x1 = js.native
  @JSName("flatMapDeep")
  var flatMapDeep_Original: LodashFlatMapDeep = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult_Array[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_T_LodashFlatMapDeep1x2[T](iteratee: __): LodashFlatMapDeep1x2[T] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_T_ObjectTResult_Array[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): js.Array[TResult] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_T_ObjectTResult_LodashFlatMapDeep2x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDeep2x1[T, TResult] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_T_Object_LodashFlatMapDeep2x2[T /* <: js.Object */](iteratee: __): LodashFlatMapDeep2x2[T] = js.native
  
  def flatMapDepth(iteratee: java.lang.String): LodashFlatMapDepth3x1 = js.native
  def flatMapDepth(iteratee: java.lang.String, depth: Double): js.Array[_] = js.native
  def flatMapDepth(iteratee: java.lang.String, depth: Double, collection: js.Object): js.Array[_] = js.native
  def flatMapDepth(iteratee: java.lang.String, depth: __): LodashFlatMapDepth3x5 = js.native
  def flatMapDepth(iteratee: java.lang.String, depth: __, collection: js.Object): LodashFlatMapDepth3x5 = js.native
  def flatMapDepth(iteratee: js.Object): LodashFlatMapDepth4x1 = js.native
  def flatMapDepth(iteratee: js.Object, depth: Double): LodashFlatMapDepth4x3 = js.native
  def flatMapDepth(iteratee: js.Object, depth: Double, collection: js.Object): js.Array[Boolean] = js.native
  def flatMapDepth(iteratee: js.Object, depth: __): LodashFlatMapDepth4x5 = js.native
  def flatMapDepth(iteratee: js.Object, depth: __, collection: js.Object): LodashFlatMapDepth4x5 = js.native
  def flatMapDepth(iteratee: __, depth: Double): LodashFlatMapDepth3x6 = js.native
  def flatMapDepth(iteratee: __, depth: Double, collection: js.Object): LodashFlatMapDepth3x6 = js.native
  def flatMapDepth(iteratee: __, depth: __): LodashFlatMapDepth3x4 = js.native
  def flatMapDepth(iteratee: __, depth: __, collection: js.Object): LodashFlatMapDepth3x4 = js.native
  def flatMapDepth[T /* <: js.Object */](iteratee: __, depth: Double, collection: T): LodashFlatMapDepth2x6[T] = js.native
  def flatMapDepth[T](iteratee: __, depth: Double, collection: List[T]): LodashFlatMapDepth1x6[T] = js.native
  def flatMapDepth[T /* <: js.Object */](iteratee: __, depth: __, collection: T): LodashFlatMapDepth2x4[T] = js.native
  def flatMapDepth[T](iteratee: __, depth: __, collection: List[T]): LodashFlatMapDepth1x4[T] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth2x1[T, TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double
  ): js.Array[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double,
    collection: T
  ): js.Array[TResult] = js.native
  def flatMapDepth[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double,
    collection: List[T]
  ): js.Array[TResult] = js.native
  def flatMapDepth[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult], depth: __): LodashFlatMapDepth1x5[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: __,
    collection: T
  ): LodashFlatMapDepth2x5[TResult] = js.native
  def flatMapDepth[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: __,
    collection: List[T]
  ): LodashFlatMapDepth1x5[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_Array(iteratee: js.Object, depth: Double): js.Array[Boolean] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_LodashFlatMapDepth1x2(iteratee: __, depth: Double): LodashFlatMapDepth1x2 = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_LodashFlatMapDepth3x3(iteratee: java.lang.String, depth: Double): LodashFlatMapDepth3x3 = js.native
  @JSName("flatMapDepth")
  var flatMapDepth_Original: LodashFlatMapDepth = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult_LodashFlatMapDepth1x1[T, TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDepth1x1[T, TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult_LodashFlatMapDepth1x3[T, TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): LodashFlatMapDepth1x3[T, TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_LodashFlatMapDepth1x4[T](iteratee: __, depth: __): LodashFlatMapDepth1x4[T] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_LodashFlatMapDepth1x6[T](iteratee: __, depth: Double): LodashFlatMapDepth1x6[T] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_ObjectTResult_LodashFlatMapDepth2x3[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: Double
  ): LodashFlatMapDepth2x3[T, TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_ObjectTResult_LodashFlatMapDepth2x5[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: __
  ): LodashFlatMapDepth2x5[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_Object_LodashFlatMapDepth2x4[T /* <: js.Object */](iteratee: __, depth: __): LodashFlatMapDepth2x4[T] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_T_Object_LodashFlatMapDepth2x6[T /* <: js.Object */](iteratee: __, depth: Double): LodashFlatMapDepth2x6[T] = js.native
  
  @JSName("flatMap")
  def flatMap_Array(iteratee: java.lang.String): js.Array[_] = js.native
  @JSName("flatMap")
  def flatMap_LodashFlatMap4x1(iteratee: js.Object): LodashFlatMap4x1 = js.native
  @JSName("flatMap")
  var flatMap_Original: LodashFlatMap = js.native
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]]): js.Array[TResult] = js.native
  @JSName("flatMap")
  def flatMap_TTResult_LodashFlatMap1x1[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]]): LodashFlatMap1x1[T, TResult] = js.native
  @JSName("flatMap")
  def flatMap_T_LodashFlatMap1x2[T](iteratee: __): LodashFlatMap1x2[T] = js.native
  @JSName("flatMap")
  def flatMap_T_ObjectTResult_LodashFlatMap2x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ]
  ): LodashFlatMap2x1[T, TResult] = js.native
  @JSName("flatMap")
  def flatMap_T_Object_LodashFlatMap2x2[T /* <: js.Object */](iteratee: __): LodashFlatMap2x2[T] = js.native
  
  def flatten[T](): js.Array[T] = js.native
  def flatten[T](array: List[Many[T]]): js.Array[T] = js.native
  
  def flattenDeep[T](): js.Array[T] = js.native
  def flattenDeep[T](array: ListOfRecursiveArraysOrValues[T]): js.Array[T] = js.native
  @JSName("flattenDeep")
  var flattenDeep_Original: LodashFlattenDeep = js.native
  
  def flattenDepth(depth: Double): LodashFlattenDepth1x1 = js.native
  def flattenDepth[T](depth: Double, array: ListOfRecursiveArraysOrValues[T]): js.Array[T] = js.native
  def flattenDepth[T](depth: __): LodashFlattenDepth1x2[T] = js.native
  def flattenDepth[T](depth: __, array: ListOfRecursiveArraysOrValues[T]): LodashFlattenDepth1x2[T] = js.native
  @JSName("flattenDepth")
  var flattenDepth_Original: LodashFlattenDepth = js.native
  @JSName("flattenDepth")
  def flattenDepth_T_Array[T](depth: Double): js.Array[T] = js.native
  
  @JSName("flatten")
  var flatten_Original: LodashFlatten = js.native
  
  def flip[T /* <: js.Function1[/* args */ js.Any, _] */](func: T): T = js.native
  @JSName("flip")
  var flip_Original: LodashFlip = js.native
  
  def floor(n: Double): Double = js.native
  @JSName("floor")
  var floor_Original: LodashFloor = js.native
  
  def flow(func: (Many[js.Function1[/* repeated */ _, _]])*): js.Function1[/* repeated */ js.Any, _] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2](f1: js.Function1[/* args */ A, R1], f2: js.Function1[/* a */ R1, R2]): js.Function1[/* args */ A, R2] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2, R3](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function1[/* args */ A, R3] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2, R3, R4](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function1[/* args */ A, R4] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function1[/* args */ A, R5] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function1[/* args */ A, R6] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function1[/* args */ A, R7] = js.native
  def flow[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    func: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function1[/* args */ A, _] = js.native
  
  def flowRight(func: (Many[js.Function1[/* repeated */ _, _]])*): js.Function1[/* repeated */ js.Any, _] = js.native
  def flowRight[A /* <: js.Array[_] */, R1, R2](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* args */ A, R1]): js.Function1[/* args */ A, R2] = js.native
  def flowRight[A /* <: js.Array[_] */, R1, R2, R3](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R3] = js.native
  def flowRight[A /* <: js.Array[_] */, R1, R2, R3, R4](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R4] = js.native
  def flowRight[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R5] = js.native
  def flowRight[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R6] = js.native
  def flowRight[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): js.Function1[/* args */ A, R7] = js.native
  @JSName("flowRight")
  var flowRight_Original: LodashFlowRight = js.native
  
  @JSName("flow")
  var flow_Original: LodashFlow = js.native
  
  def forEach[T](iteratee: js.Function1[/* value */ T, _]): LodashForEach1x1[T] = js.native
  def forEach[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): T = js.native
  def forEach[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def forEach[T](iteratee: js.Function1[/* value */ T, _], collection: List[T]): List[T] = js.native
  def forEach[T /* <: js.Object */](iteratee: __): LodashForEach6x2[T] = js.native
  def forEach[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach6x2[T] = js.native
  def forEach[T](iteratee: __, collection: js.Array[T]): LodashForEach1x2[T] = js.native
  def forEach[T](iteratee: __, collection: List[T]): LodashForEach2x2[T] = js.native
  
  def forEachRight[T](iteratee: js.Function1[/* value */ T, _]): LodashForEachRight1x1[T] = js.native
  def forEachRight[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): T = js.native
  def forEachRight[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def forEachRight[T](iteratee: js.Function1[/* value */ T, _], collection: List[T]): List[T] = js.native
  def forEachRight[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T] = js.native
  def forEachRight[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight3x2[T] = js.native
  def forEachRight[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T] = js.native
  def forEachRight[T](iteratee: __, collection: List[T]): LodashForEachRight2x2[T] = js.native
  @JSName("forEachRight")
  var forEachRight_Original: LodashForEachRight = js.native
  @JSName("forEachRight")
  def `forEachRight_TTArray_UnionArrayTNull<undefined>_LodashForEachRight4x2`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: TArray with (js.UndefOr[js.Array[T] | Null])): LodashForEachRight4x2[T, TArray] = js.native
  @JSName("forEachRight")
  def `forEachRight_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("forEachRight")
  def `forEachRight_TTList_UnionListTNull<undefined>_LodashForEachRight5x2`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: __, collection: TList with (js.UndefOr[List[T] | Null])): LodashForEachRight5x2[T, TList] = js.native
  @JSName("forEachRight")
  def `forEachRight_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("forEachRight")
  def forEachRight_T_Object_LodashForEachRight6x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight6x2[T] = js.native
  @JSName("forEachRight")
  def forEachRight_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  @JSName("forEachRight")
  def forEachRight_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  
  @JSName("forEach")
  var forEach_Original: LodashForEach = js.native
  @JSName("forEach")
  def `forEach_TTArray_UnionArrayTNull<undefined>_LodashForEach4x2`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: __, collection: TArray with (js.UndefOr[js.Array[T] | Null])): LodashForEach4x2[T, TArray] = js.native
  @JSName("forEach")
  def `forEach_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("forEach")
  def `forEach_TTList_UnionListTNull<undefined>_LodashForEach5x2`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: __, collection: TList with (js.UndefOr[List[T] | Null])): LodashForEach5x2[T, TList] = js.native
  @JSName("forEach")
  def `forEach_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](iteratee: js.Function1[/* value */ T, _], collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("forEach")
  def forEach_T_Object_LodashForEach3x2[T /* <: js.Object */](iteratee: __, collection: T): LodashForEach3x2[T] = js.native
  @JSName("forEach")
  def forEach_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  @JSName("forEach")
  def forEach_T_Object_Union[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  
  def forIn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  def forIn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def forIn[T](iteratee: __): LodashForIn2x2[T] = js.native
  def forIn[T](iteratee: __, `object`: T): LodashForIn1x2[T] = js.native
  
  def forInRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  def forInRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def forInRight[T](iteratee: __): LodashForInRight2x2[T] = js.native
  def forInRight[T](iteratee: __, `object`: T): LodashForInRight1x2[T] = js.native
  @JSName("forInRight")
  var forInRight_Original: LodashForInRight = js.native
  @JSName("forInRight")
  def forInRight_T_LodashForInRight1x1[T](iteratee: js.Function1[/* value */ T, _]): LodashForInRight1x1[T] = js.native
  @JSName("forInRight")
  def forInRight_T_LodashForInRight2x2[T](iteratee: __, `object`: T): LodashForInRight2x2[T] = js.native
  @JSName("forInRight")
  def forInRight_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): T = js.native
  
  @JSName("forIn")
  var forIn_Original: LodashForIn = js.native
  @JSName("forIn")
  def forIn_T_LodashForIn1x1[T](iteratee: js.Function1[/* value */ T, _]): LodashForIn1x1[T] = js.native
  @JSName("forIn")
  def forIn_T_LodashForIn2x2[T](iteratee: __, `object`: T): LodashForIn2x2[T] = js.native
  @JSName("forIn")
  def forIn_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): T = js.native
  
  def forOwn[T](iteratee: js.Function1[/* value */ T, _]): LodashForOwn1x1[T] = js.native
  def forOwn[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def forOwn[T](iteratee: __): LodashForOwn2x2[T] = js.native
  def forOwn[T](iteratee: __, `object`: T): LodashForOwn2x2[T] = js.native
  
  def forOwnRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  def forOwnRight[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): js.UndefOr[T | Null] = js.native
  def forOwnRight[T](iteratee: __): LodashForOwnRight2x2[T] = js.native
  def forOwnRight[T](iteratee: __, `object`: T): LodashForOwnRight2x2[T] = js.native
  @JSName("forOwnRight")
  var forOwnRight_Original: LodashForOwnRight = js.native
  @JSName("forOwnRight")
  def forOwnRight_T_LodashForOwnRight1x1[T](iteratee: js.Function1[/* value */ T, _]): LodashForOwnRight1x1[T] = js.native
  @JSName("forOwnRight")
  def forOwnRight_T_LodashForOwnRight1x2[T](iteratee: __, `object`: T): LodashForOwnRight1x2[T] = js.native
  @JSName("forOwnRight")
  def forOwnRight_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): T = js.native
  
  @JSName("forOwn")
  var forOwn_Original: LodashForOwn = js.native
  @JSName("forOwn")
  def forOwn_T_LodashForOwn1x2[T](iteratee: __, `object`: T): LodashForOwn1x2[T] = js.native
  @JSName("forOwn")
  def forOwn_T_T[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    `object`: T
  ): T = js.native
  @JSName("forOwn")
  def forOwn_T_Union[T](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ]
  ): js.UndefOr[T | Null] = js.native
  
  def fromPairs(): Dictionary[_] = js.native
  def fromPairs(pairs: List[js.Array[_]]): Dictionary[_] = js.native
  @JSName("fromPairs")
  var fromPairs_Original: LodashFromPairs = js.native
  @JSName("fromPairs")
  def fromPairs_T[T](): Dictionary[T] = js.native
  @JSName("fromPairs")
  def fromPairs_T[T](pairs: List[js.Tuple2[PropertyName, T]]): Dictionary[T] = js.native
  
  def functions(`object`: js.Any): js.Array[java.lang.String] = js.native
  
  def functionsIn(`object`: js.Any): js.Array[java.lang.String] = js.native
  @JSName("functionsIn")
  var functionsIn_Original: LodashFunctionsIn = js.native
  
  @JSName("functions")
  var functions_Original: LodashFunctions = js.native
  
  def get(path: Double): LodashGet9x1 = js.native
  def get(path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  def get(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def get(path: __): LodashGet11x2 = js.native
  def get(path: __, `object`: js.Any): LodashGet12x2 = js.native
  def get[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def get[TObject /* <: js.Object */](path: __, `object`: TObject): LodashGet1x2[TObject] = js.native
  def get[T](path: __, `object`: NumericDictionary[T]): LodashGet9x2[T] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashGet3x1[TObject, TKey1, TKey2] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGet5x1[TObject, TKey1, TKey2, TKey3] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGet7x1[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  
  def getOr(defaultValue: js.Any): LodashGetOr7x1 = js.native
  def getOr(defaultValue: js.Any, path: PropertyPath): LodashGetOr7x3 = js.native
  def getOr(defaultValue: js.Any, path: PropertyPath, `object`: js.Any): js.Any = js.native
  def getOr(defaultValue: js.Any, path: __, `object`: js.Any): LodashGetOr7x5 = js.native
  def getOr(defaultValue: __, path: Double): LodashGetOr5x2 = js.native
  def getOr(defaultValue: __, path: PropertyPath): LodashGetOr6x6 = js.native
  def getOr(defaultValue: __, path: PropertyPath, `object`: js.Any): LodashGetOr7x6 = js.native
  def getOr(defaultValue: __, path: __): LodashGetOr6x4 = js.native
  def getOr(defaultValue: __, path: __, `object`: js.Any): LodashGetOr7x4 = js.native
  def getOr[TDefault](defaultValue: TDefault): LodashGetOr1x1[TDefault] = js.native
  def getOr[TDefault](defaultValue: TDefault, path: Double): LodashGetOr5x3[TDefault] = js.native
  def getOr[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault = js.native
  def getOr[TDefault](defaultValue: TDefault, path: __): LodashGetOr6x5[TDefault] = js.native
  def getOr[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashGetOr5x6[T] = js.native
  def getOr[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashGetOr1x4[TObject] = js.native
  def getOr[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashGetOr5x4[T] = js.native
  def getOr[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def getOr[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashGetOr1x5[TObject, TDefault] = js.native
  def getOr[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashGetOr5x5[T, TDefault] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashGetOr1x2[TObject, TKey] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey, `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashGetOr1x2[TObject, TKey] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashGetOr1x6[TObject, TKey] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashGetOr1x3[TObject, TKey, TDefault] = js.native
  def getOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashGetOr2x6[TObject, TKey1, TKey2] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x2[TObject, TKey1, TKey2, TKey3] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashGetOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  def getOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("getOr")
  def getOr_LodashGetOr6x2(defaultValue: __, path: PropertyPath): LodashGetOr6x2 = js.native
  @JSName("getOr")
  var getOr_Original: LodashGetOr = js.native
  @JSName("getOr")
  def getOr_TDefault_LodashGetOr6x3[TDefault](defaultValue: TDefault, path: PropertyPath): LodashGetOr6x3[TDefault] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTDefault_LodashGetOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __): LodashGetOr1x5[TObject, TDefault] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey1_StringTKey2_AnyTDefault_LodashGetOr2x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x3[TObject, TKey1, TKey2, TDefault] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_AnyTDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_LodashGetOr4x2[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashGetOr4x2[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_LodashGetOr3x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashGetOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey1_StringTKey2_Any_LodashGetOr2x2[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashGetOr2x2[TObject, TKey1, TKey2] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey_StringTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey_StringTDefault_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey_String_LodashGetOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashGetOr1x6[TObject, TKey] = js.native
  @JSName("getOr")
  def getOr_TObject_ObjectTKey_String_LodashGetOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashGetOr1x6[TObject, TKey] = js.native
  @JSName("getOr")
  def getOr_TObject_Object_LodashGetOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __): LodashGetOr1x4[TObject] = js.native
  @JSName("getOr")
  def getOr_TTDefault_LodashGetOr5x5[T, TDefault](defaultValue: TDefault, path: __): LodashGetOr5x5[T, TDefault] = js.native
  @JSName("getOr")
  def getOr_TTDefault_Union[T, TDefault](defaultValue: TDefault, path: Double): T | TDefault = js.native
  @JSName("getOr")
  def getOr_T_LodashGetOr5x4[T](defaultValue: __, path: __): LodashGetOr5x4[T] = js.native
  @JSName("getOr")
  def getOr_T_LodashGetOr5x6[T](defaultValue: __, path: Double): LodashGetOr5x6[T] = js.native
  
  @JSName("get")
  def get_LodashGet11x1(path: PropertyPath): LodashGet11x1 = js.native
  @JSName("get")
  var get_Original: LodashGet = js.native
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any = js.native
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey_String_LodashGet1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashGet1x1[TObject, TKey] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey_String_LodashGet1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashGet1x1[TObject, TKey] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_Object_LodashGet2x2[TObject /* <: js.Object */](path: __): LodashGet2x2[TObject] = js.native
  @JSName("get")
  def get_TObject_Object_LodashGet2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashGet2x2[TObject] = js.native
  @JSName("get")
  def get_T_LodashGet10x2[T](path: __): LodashGet10x2[T] = js.native
  @JSName("get")
  def get_T_LodashGet10x2[T](path: __, `object`: NumericDictionary[T]): LodashGet10x2[T] = js.native
  @JSName("get")
  def get_T_T[T](path: Double, `object`: NumericDictionary[T]): T = js.native
  @JSName("get")
  def get_T_Union[T](path: Double): js.UndefOr[T] = js.native
  
  def groupBy[T](iteratee: ValueIteratee[T]): LodashGroupBy1x1[T] = js.native
  def groupBy[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def groupBy[T](iteratee: ValueIteratee[T], collection: List[T]): Dictionary[js.Array[T]] = js.native
  def groupBy[T /* <: js.Object */](iteratee: __): LodashGroupBy2x2[T] = js.native
  def groupBy[T /* <: js.Object */](iteratee: __, collection: T): LodashGroupBy2x2[T] = js.native
  def groupBy[T](iteratee: __, collection: List[T]): LodashGroupBy1x2[T] = js.native
  @JSName("groupBy")
  var groupBy_Original: LodashGroupBy = js.native
  @JSName("groupBy")
  def groupBy_T_Dictionary[T](iteratee: ValueIteratee[T]): Dictionary[js.Array[T]] = js.native
  @JSName("groupBy")
  def groupBy_T_LodashGroupBy1x2[T](iteratee: __): LodashGroupBy1x2[T] = js.native
  @JSName("groupBy")
  def groupBy_T_Object_Dictionary[T /* <: js.Object */](
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  def gt(value: js.Any): LodashGt1x1 = js.native
  def gt(value: js.Any, other: js.Any): Boolean = js.native
  def gt(value: __, other: js.Any): LodashGt1x2 = js.native
  @JSName("gt")
  var gt_Original: LodashGt = js.native
  
  def gte(value: js.Any): LodashGte1x1 = js.native
  def gte(value: js.Any, other: js.Any): Boolean = js.native
  def gte(value: __, other: js.Any): LodashGte1x2 = js.native
  @JSName("gte")
  var gte_Original: LodashGte = js.native
  
  def has(path: PropertyPath): LodashHas1x1 = js.native
  def has[T](path: PropertyPath, `object`: T): Boolean = js.native
  def has[T](path: __, `object`: T): LodashHas1x2 = js.native
  
  def hasIn(path: PropertyPath): LodashHasIn1x1 = js.native
  def hasIn[T](path: PropertyPath, `object`: T): Boolean = js.native
  def hasIn[T](path: __, `object`: T): LodashHasIn1x2 = js.native
  @JSName("hasIn")
  var hasIn_Original: LodashHasIn = js.native
  
  @JSName("has")
  var has_Original: LodashHas = js.native
  
  def head[T](): js.UndefOr[T] = js.native
  def head[T](array: List[T]): js.UndefOr[T] = js.native
  @JSName("head")
  var head_Original: LodashHead = js.native
  
  def identical(value: js.Any): LodashEq1x1 = js.native
  def identical(value: js.Any, other: js.Any): Boolean = js.native
  def identical(value: __, other: js.Any): LodashEq1x2 = js.native
  @JSName("identical")
  var identical_Original: LodashEq = js.native
  
  def identity(): js.UndefOr[scala.Nothing] = js.native
  def identity[T](value: T): T = js.native
  @JSName("identity")
  var identity_Original: LodashIdentity = js.native
  
  def inRange(start: Double): LodashInRange1x1 = js.native
  def inRange(start: Double, end: Double): LodashInRange1x3 = js.native
  def inRange(start: Double, end: Double, n: Double): Boolean = js.native
  def inRange(start: Double, end: __, n: Double): LodashInRange1x5 = js.native
  def inRange(start: __, end: Double): LodashInRange1x2 = js.native
  def inRange(start: __, end: Double, n: Double): LodashInRange1x6 = js.native
  def inRange(start: __, end: __, n: Double): LodashInRange1x4 = js.native
  @JSName("inRange")
  var inRange_Original: LodashInRange = js.native
  
  def includes[T](target: T): Boolean = js.native
  def includes[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def includes[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def includes[T](target: __): LodashIncludes1x2[T] = js.native
  def includes[T](target: __, collection: Dictionary[T]): LodashIncludes1x2[T] = js.native
  def includes[T](target: __, collection: NumericDictionary[T]): LodashIncludes1x2[T] = js.native
  
  def includesFrom(target: __, fromIndex: Double): LodashIncludesFrom1x2 = js.native
  def includesFrom[T](target: T): LodashIncludesFrom1x1[T] = js.native
  def includesFrom[T](target: T, fromIndex: Double): LodashIncludesFrom1x3[T] = js.native
  def includesFrom[T](target: T, fromIndex: Double, collection: Dictionary[T]): Boolean = js.native
  def includesFrom[T](target: T, fromIndex: Double, collection: NumericDictionary[T]): Boolean = js.native
  def includesFrom[T](target: T, fromIndex: __): LodashIncludesFrom1x5 = js.native
  def includesFrom[T](target: T, fromIndex: __, collection: Dictionary[T]): LodashIncludesFrom1x5 = js.native
  def includesFrom[T](target: T, fromIndex: __, collection: NumericDictionary[T]): LodashIncludesFrom1x5 = js.native
  def includesFrom[T](target: __, fromIndex: Double, collection: Dictionary[T]): LodashIncludesFrom1x6[T] = js.native
  def includesFrom[T](target: __, fromIndex: Double, collection: NumericDictionary[T]): LodashIncludesFrom1x6[T] = js.native
  def includesFrom[T](target: __, fromIndex: __): LodashIncludesFrom1x4[T] = js.native
  def includesFrom[T](target: __, fromIndex: __, collection: Dictionary[T]): LodashIncludesFrom1x4[T] = js.native
  def includesFrom[T](target: __, fromIndex: __, collection: NumericDictionary[T]): LodashIncludesFrom1x4[T] = js.native
  @JSName("includesFrom")
  var includesFrom_Original: LodashIncludesFrom = js.native
  @JSName("includesFrom")
  def includesFrom_T_Boolean[T](target: T, fromIndex: Double): Boolean = js.native
  @JSName("includesFrom")
  def includesFrom_T_LodashIncludesFrom1x6[T](target: __, fromIndex: Double): LodashIncludesFrom1x6[T] = js.native
  
  @JSName("includes")
  var includes_Original: LodashIncludes = js.native
  @JSName("includes")
  def includes_T_LodashIncludes1x1[T](target: T): LodashIncludes1x1[T] = js.native
  
  def indexBy[T](iteratee: ValueIterateeCustom[T, PropertyName]): Dictionary[T] = js.native
  def indexBy[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def indexBy[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: List[T]): Dictionary[T] = js.native
  def indexBy[T](iteratee: __): LodashKeyBy1x2[T] = js.native
  def indexBy[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T] = js.native
  def indexBy[T](iteratee: __, collection: List[T]): LodashKeyBy1x2[T] = js.native
  @JSName("indexBy")
  var indexBy_Original: LodashKeyBy = js.native
  @JSName("indexBy")
  def indexBy_T_LodashKeyBy1x1[T](iteratee: ValueIterateeCustom[T, PropertyName]): LodashKeyBy1x1[T] = js.native
  @JSName("indexBy")
  def indexBy_T_Object[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("indexBy")
  def indexBy_T_Object_LodashKeyBy2x2[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T] = js.native
  
  def indexOf[T](value: T): Double = js.native
  def indexOf[T](value: T, array: List[T]): Double = js.native
  def indexOf[T](value: __): LodashIndexOf1x2[T] = js.native
  def indexOf[T](value: __, array: List[T]): LodashIndexOf1x2[T] = js.native
  
  def indexOfFrom(value: __, fromIndex: Double): LodashIndexOfFrom1x2 = js.native
  def indexOfFrom[T](value: T): LodashIndexOfFrom1x1[T] = js.native
  def indexOfFrom[T](value: T, fromIndex: Double): Double = js.native
  def indexOfFrom[T](value: T, fromIndex: Double, array: List[T]): Double = js.native
  def indexOfFrom[T](value: T, fromIndex: __): LodashIndexOfFrom1x5 = js.native
  def indexOfFrom[T](value: T, fromIndex: __, array: List[T]): LodashIndexOfFrom1x5 = js.native
  def indexOfFrom[T](value: __, fromIndex: Double, array: List[T]): LodashIndexOfFrom1x6[T] = js.native
  def indexOfFrom[T](value: __, fromIndex: __): LodashIndexOfFrom1x4[T] = js.native
  def indexOfFrom[T](value: __, fromIndex: __, array: List[T]): LodashIndexOfFrom1x4[T] = js.native
  @JSName("indexOfFrom")
  var indexOfFrom_Original: LodashIndexOfFrom = js.native
  @JSName("indexOfFrom")
  def indexOfFrom_T_LodashIndexOfFrom1x3[T](value: T, fromIndex: Double): LodashIndexOfFrom1x3[T] = js.native
  @JSName("indexOfFrom")
  def indexOfFrom_T_LodashIndexOfFrom1x6[T](value: __, fromIndex: Double): LodashIndexOfFrom1x6[T] = js.native
  
  @JSName("indexOf")
  var indexOf_Original: LodashIndexOf = js.native
  @JSName("indexOf")
  def indexOf_T_LodashIndexOf1x1[T](value: T): LodashIndexOf1x1[T] = js.native
  
  def init[T](): js.Array[T] = js.native
  def init[T](array: List[T]): js.Array[T] = js.native
  @JSName("init")
  var init_Original: LodashInitial = js.native
  
  def initial[T](): js.Array[T] = js.native
  def initial[T](array: List[T]): js.Array[T] = js.native
  @JSName("initial")
  var initial_Original: LodashInitial = js.native
  
  def intersection[T](): js.Array[T] = js.native
  def intersection[T](arrays2: js.UndefOr[scala.Nothing], arrays: List[T]): js.Array[T] = js.native
  def intersection[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def intersection[T](arrays2: List[T]): js.Array[T] = js.native
  def intersection[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def intersection[T](arrays2: __): LodashIntersection1x2[T] = js.native
  def intersection[T](arrays2: __, arrays: List[T]): LodashIntersection1x2[T] = js.native
  
  def intersectionBy[T1](iteratee: __): LodashIntersectionBy1x2[T1] = js.native
  def intersectionBy[T1](iteratee: __, array: List[T1]): LodashIntersectionBy1x2[T1] = js.native
  def intersectionBy[T2](iteratee: __, array: __, values: List[T2]): LodashIntersectionBy1x4[T2] = js.native
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x3[T1, T2] = js.native
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: Null, values: List[T2]): js.Array[T1] = js.native
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1]): LodashIntersectionBy1x3[T1, T2] = js.native
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: List[T1], values: List[T2]): js.Array[T1] = js.native
  def intersectionBy[T1, T2](iteratee: ValueIteratee[T1 | T2], array: __, values: List[T2]): LodashIntersectionBy1x5[T1] = js.native
  def intersectionBy[T1, T2](iteratee: __, array: Null, values: List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
  def intersectionBy[T1, T2](iteratee: __, array: List[T1], values: List[T2]): LodashIntersectionBy1x6[T1, T2] = js.native
  @JSName("intersectionBy")
  var intersectionBy_Original: LodashIntersectionBy = js.native
  @JSName("intersectionBy")
  def intersectionBy_T1T2_LodashIntersectionBy1x1[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashIntersectionBy1x1[T1, T2] = js.native
  
  def intersectionWith[T1](comparator: __): LodashIntersectionWith1x2[T1] = js.native
  def intersectionWith[T1](comparator: __, array: List[T1]): LodashIntersectionWith1x2[T1] = js.native
  def intersectionWith[T2](comparator: __, array: __, values: List[T2]): LodashIntersectionWith1x4[T2] = js.native
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2]): LodashIntersectionWith1x1[T1, T2] = js.native
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: js.UndefOr[scala.Nothing], values: List[T2]): js.Array[T1] = js.native
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: Null, values: List[T2]): js.Array[T1] = js.native
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: List[T1]): LodashIntersectionWith1x3[T1, T2] = js.native
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: List[T1], values: List[T2]): js.Array[T1] = js.native
  def intersectionWith[T1, T2](comparator: Comparator2[T1, T2], array: __, values: List[T2]): LodashIntersectionWith1x5[T1] = js.native
  def intersectionWith[T1, T2](comparator: __, array: js.UndefOr[scala.Nothing], values: List[T2]): LodashIntersectionWith1x6[T1, T2] = js.native
  def intersectionWith[T1, T2](comparator: __, array: Null, values: List[T2]): LodashIntersectionWith1x6[T1, T2] = js.native
  def intersectionWith[T1, T2](comparator: __, array: List[T1], values: List[T2]): LodashIntersectionWith1x6[T1, T2] = js.native
  @JSName("intersectionWith")
  var intersectionWith_Original: LodashIntersectionWith = js.native
  @JSName("intersectionWith")
  def intersectionWith_T1T2_LodashIntersectionWith1x3[T1, T2](comparator: Comparator2[T1, T2]): LodashIntersectionWith1x3[T1, T2] = js.native
  
  @JSName("intersection")
  var intersection_Original: LodashIntersection = js.native
  @JSName("intersection")
  def intersection_T_LodashIntersection1x1[T](): LodashIntersection1x1[T] = js.native
  @JSName("intersection")
  def intersection_T_LodashIntersection1x1[T](arrays2: List[T]): LodashIntersection1x1[T] = js.native
  
  def invert(`object`: js.Object): Dictionary[java.lang.String] = js.native
  
  def invertBy[T](interatee: ValueIteratee[T]): LodashInvertBy1x1[T] = js.native
  def invertBy[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): Dictionary[js.Array[java.lang.String]] = js.native
  def invertBy[T](interatee: ValueIteratee[T], `object`: Dictionary[T]): Dictionary[js.Array[java.lang.String]] = js.native
  def invertBy[T](interatee: ValueIteratee[T], `object`: NumericDictionary[T]): Dictionary[js.Array[java.lang.String]] = js.native
  def invertBy[T](interatee: __): LodashInvertBy1x2[T] = js.native
  def invertBy[T /* <: js.Object */](interatee: __, `object`: T): LodashInvertBy2x2[T] = js.native
  def invertBy[T](interatee: __, `object`: Dictionary[T]): LodashInvertBy1x2[T] = js.native
  def invertBy[T](interatee: __, `object`: NumericDictionary[T]): LodashInvertBy1x2[T] = js.native
  @JSName("invertBy")
  var invertBy_Original: LodashInvertBy = js.native
  @JSName("invertBy")
  def invertBy_T_Dictionary[T](interatee: ValueIteratee[T]): Dictionary[js.Array[java.lang.String]] = js.native
  @JSName("invertBy")
  def invertBy_T_Object_Dictionary[T /* <: js.Object */](
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[js.Array[java.lang.String]] = js.native
  @JSName("invertBy")
  def invertBy_T_Object_LodashInvertBy2x2[T /* <: js.Object */](interatee: __): LodashInvertBy2x2[T] = js.native
  
  def invertObj(`object`: js.Object): Dictionary[java.lang.String] = js.native
  @JSName("invertObj")
  var invertObj_Original: LodashInvert = js.native
  
  @JSName("invert")
  var invert_Original: LodashInvert = js.native
  
  def invoke(path: PropertyPath): LodashInvoke1x1 = js.native
  def invoke(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def invoke(path: __, `object`: js.Any): LodashInvoke1x2 = js.native
  
  def invokeArgs(path: PropertyPath): LodashInvokeArgs1x1 = js.native
  def invokeArgs(path: PropertyPath, args: js.Array[_]): LodashInvokeArgs1x3 = js.native
  def invokeArgs(path: PropertyPath, args: js.Array[_], `object`: js.Any): js.Any = js.native
  def invokeArgs(path: PropertyPath, args: __, `object`: js.Any): LodashInvokeArgs1x5 = js.native
  def invokeArgs(path: __, args: js.Array[_]): LodashInvokeArgs1x2 = js.native
  def invokeArgs(path: __, args: js.Array[_], `object`: js.Any): LodashInvokeArgs1x6 = js.native
  def invokeArgs(path: __, args: __, `object`: js.Any): LodashInvokeArgs1x4 = js.native
  
  def invokeArgsMap(methodNameOrMethod: __, args: js.Array[_]): LodashInvokeArgsMap1x6 = js.native
  def invokeArgsMap(methodNameOrMethod: __, args: js.Array[_], collection: js.Object): LodashInvokeArgsMap1x6 = js.native
  def invokeArgsMap(methodNameOrMethod: __, args: __): LodashInvokeArgsMap1x4 = js.native
  def invokeArgsMap(methodNameOrMethod: __, args: __, collection: js.Object): LodashInvokeArgsMap1x4 = js.native
  def invokeArgsMap(methodName: java.lang.String): LodashInvokeArgsMap1x1 = js.native
  def invokeArgsMap(methodName: java.lang.String, args: js.Array[_]): LodashInvokeArgsMap1x3 = js.native
  def invokeArgsMap(methodName: java.lang.String, args: js.Array[_], collection: js.Object): js.Array[_] = js.native
  def invokeArgsMap(methodName: java.lang.String, args: __): LodashInvokeArgsMap1x5 = js.native
  def invokeArgsMap(methodName: java.lang.String, args: __, collection: js.Object): LodashInvokeArgsMap1x5 = js.native
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult]): LodashInvokeArgsMap2x1[TResult] = js.native
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Array[_]): js.Array[TResult] = js.native
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Array[_], collection: js.Object): js.Array[TResult] = js.native
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: __): LodashInvokeArgsMap2x5[TResult] = js.native
  def invokeArgsMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: __, collection: js.Object): LodashInvokeArgsMap2x5[TResult] = js.native
  @JSName("invokeArgsMap")
  def invokeArgsMap_Array(methodName: java.lang.String, args: js.Array[_]): js.Array[_] = js.native
  @JSName("invokeArgsMap")
  def invokeArgsMap_LodashInvokeArgsMap1x2(methodNameOrMethod: __, args: js.Array[_]): LodashInvokeArgsMap1x2 = js.native
  @JSName("invokeArgsMap")
  var invokeArgsMap_Original: LodashInvokeArgsMap = js.native
  @JSName("invokeArgsMap")
  def invokeArgsMap_TResult_LodashInvokeArgsMap2x3[TResult](method: js.Function1[/* repeated */ js.Any, TResult], args: js.Array[_]): LodashInvokeArgsMap2x3[TResult] = js.native
  
  @JSName("invokeArgs")
  var invokeArgs_Original: LodashInvokeArgs = js.native
  
  def invokeMap(methodNameOrMethod: __): LodashInvokeMap1x2 = js.native
  def invokeMap(methodNameOrMethod: __, collection: js.Object): LodashInvokeMap1x2 = js.native
  def invokeMap(methodName: java.lang.String): LodashInvokeMap1x1 = js.native
  def invokeMap(methodName: java.lang.String, collection: js.Object): js.Array[_] = js.native
  def invokeMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult]): js.Array[TResult] = js.native
  def invokeMap[TResult](method: js.Function1[/* repeated */ js.Any, TResult], collection: js.Object): js.Array[TResult] = js.native
  @JSName("invokeMap")
  def invokeMap_Array(methodName: java.lang.String): js.Array[_] = js.native
  @JSName("invokeMap")
  var invokeMap_Original: LodashInvokeMap = js.native
  @JSName("invokeMap")
  def invokeMap_TResult_LodashInvokeMap2x1[TResult](method: js.Function1[/* repeated */ js.Any, TResult]): LodashInvokeMap2x1[TResult] = js.native
  
  @JSName("invoke")
  var invoke_Original: LodashInvoke = js.native
  
  def isArguments(value: js.Any): /* is std.IArguments */ Boolean = js.native
  @JSName("isArguments")
  var isArguments_Original: LodashIsArguments = js.native
  
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  def isArrayBuffer(value: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
  @JSName("isArrayBuffer")
  var isArrayBuffer_Original: LodashIsArrayBuffer = js.native
  
  def isArrayLike(): /* is never */ Boolean = js.native
  def isArrayLike(value: js.Any): /* is lodash.anon.Length */ Boolean = js.native
  def isArrayLike(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  def isArrayLike[T /* <: LodashAnyHack */](t: T): Boolean = js.native
  
  def isArrayLikeObject(): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: java.lang.String): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: js.Any): Boolean = js.native
  def isArrayLikeObject(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: Boolean): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: Double): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: FunctionBase): /* is never */ Boolean = js.native
  def isArrayLikeObject[T /* <: LodashAnyHack */](value: T): Boolean = js.native
  @JSName("isArrayLikeObject")
  var isArrayLikeObject_Original: LodashIsArrayLikeObject = js.native
  
  @JSName("isArrayLike")
  var isArrayLike_Original: LodashIsArrayLike = js.native
  
  @JSName("isArray")
  var isArray_Original: LodashIsArray = js.native
  
  def isBoolean(value: js.Any): /* is boolean */ Boolean = js.native
  @JSName("isBoolean")
  var isBoolean_Original: LodashIsBoolean = js.native
  
  def isBuffer(value: js.Any): Boolean = js.native
  @JSName("isBuffer")
  var isBuffer_Original: LodashIsBuffer = js.native
  
  def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
  @JSName("isDate")
  var isDate_Original: LodashIsDate = js.native
  
  def isElement(value: js.Any): Boolean = js.native
  @JSName("isElement")
  var isElement_Original: LodashIsElement = js.native
  
  def isEmpty(value: js.Any): Boolean = js.native
  @JSName("isEmpty")
  var isEmpty_Original: LodashIsEmpty = js.native
  
  def isEqual(value: js.Any): LodashIsEqual1x1 = js.native
  def isEqual(value: js.Any, other: js.Any): Boolean = js.native
  def isEqual(value: __, other: js.Any): LodashIsEqual1x2 = js.native
  
  def isEqualWith(customizer: IsEqualCustomizer): LodashIsEqualWith1x1 = js.native
  def isEqualWith(customizer: IsEqualCustomizer, value: js.Any): LodashIsEqualWith1x3 = js.native
  def isEqualWith(customizer: IsEqualCustomizer, value: js.Any, other: js.Any): Boolean = js.native
  def isEqualWith(customizer: IsEqualCustomizer, value: __, other: js.Any): LodashIsEqualWith1x5 = js.native
  def isEqualWith(customizer: __, value: js.Any): LodashIsEqualWith1x2 = js.native
  def isEqualWith(customizer: __, value: js.Any, other: js.Any): LodashIsEqualWith1x6 = js.native
  def isEqualWith(customizer: __, value: __, other: js.Any): LodashIsEqualWith1x4 = js.native
  @JSName("isEqualWith")
  var isEqualWith_Original: LodashIsEqualWith = js.native
  
  @JSName("isEqual")
  var isEqual_Original: LodashIsEqual = js.native
  
  def isError(value: js.Any): /* is std.Error */ Boolean = js.native
  @JSName("isError")
  var isError_Original: LodashIsError = js.native
  
  def isFinite(value: js.Any): Boolean = js.native
  @JSName("isFinite")
  var isFinite_Original: LodashIsFinite = js.native
  
  def isFunction(value: js.Any): Boolean = js.native
  @JSName("isFunction")
  var isFunction_Original: LodashIsFunction = js.native
  
  def isInteger(value: js.Any): Boolean = js.native
  @JSName("isInteger")
  var isInteger_Original: LodashIsInteger = js.native
  
  def isLength(value: js.Any): Boolean = js.native
  @JSName("isLength")
  var isLength_Original: LodashIsLength = js.native
  
  def isMap(value: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  @JSName("isMap")
  var isMap_Original: LodashIsMap = js.native
  
  def isMatch(source: js.Object): LodashIsMatch1x1 = js.native
  def isMatch(source: js.Object, `object`: js.Object): Boolean = js.native
  def isMatch(source: __, `object`: js.Object): LodashIsMatch1x2 = js.native
  
  def isMatchWith(customizer: __, source: js.Object): LodashIsMatchWith1x2 = js.native
  def isMatchWith(customizer: __, source: js.Object, `object`: js.Object): LodashIsMatchWith1x6 = js.native
  def isMatchWith(customizer: __, source: __, `object`: js.Object): LodashIsMatchWith1x4 = js.native
  def isMatchWith(customizer: isMatchWithCustomizer): LodashIsMatchWith1x1 = js.native
  def isMatchWith(customizer: isMatchWithCustomizer, source: js.Object): LodashIsMatchWith1x3 = js.native
  def isMatchWith(customizer: isMatchWithCustomizer, source: js.Object, `object`: js.Object): Boolean = js.native
  def isMatchWith(customizer: isMatchWithCustomizer, source: __, `object`: js.Object): LodashIsMatchWith1x5 = js.native
  @JSName("isMatchWith")
  var isMatchWith_Original: LodashIsMatchWith = js.native
  
  @JSName("isMatch")
  var isMatch_Original: LodashIsMatch = js.native
  
  def isNaN(value: js.Any): Boolean = js.native
  @JSName("isNaN")
  var isNaN_Original: LodashIsNaN = js.native
  
  def isNative(value: js.Any): Boolean = js.native
  @JSName("isNative")
  var isNative_Original: LodashIsNative = js.native
  
  def isNil(value: js.Any): Boolean = js.native
  @JSName("isNil")
  var isNil_Original: LodashIsNil = js.native
  
  def isNull(value: js.Any): /* is null */ Boolean = js.native
  @JSName("isNull")
  var isNull_Original: LodashIsNull = js.native
  
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  @JSName("isNumber")
  var isNumber_Original: LodashIsNumber = js.native
  
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  
  def isObjectLike(value: js.Any): Boolean = js.native
  @JSName("isObjectLike")
  var isObjectLike_Original: LodashIsObjectLike = js.native
  
  @JSName("isObject")
  var isObject_Original: LodashIsObject = js.native
  
  def isPlainObject(value: js.Any): Boolean = js.native
  @JSName("isPlainObject")
  var isPlainObject_Original: LodashIsPlainObject = js.native
  
  def isRegExp(value: js.Any): /* is std.RegExp */ Boolean = js.native
  @JSName("isRegExp")
  var isRegExp_Original: LodashIsRegExp = js.native
  
  def isSafeInteger(value: js.Any): Boolean = js.native
  @JSName("isSafeInteger")
  var isSafeInteger_Original: LodashIsSafeInteger = js.native
  
  def isSet(value: js.Any): /* is std.Set<any> */ Boolean = js.native
  @JSName("isSet")
  var isSet_Original: LodashIsSet = js.native
  
  def isString(value: js.Any): /* is string */ Boolean = js.native
  @JSName("isString")
  var isString_Original: LodashIsString = js.native
  
  def isSymbol(value: js.Any): /* is symbol */ Boolean = js.native
  @JSName("isSymbol")
  var isSymbol_Original: LodashIsSymbol = js.native
  
  def isTypedArray(value: js.Any): Boolean = js.native
  @JSName("isTypedArray")
  var isTypedArray_Original: LodashIsTypedArray = js.native
  
  def isUndefined(value: js.Any): /* is undefined */ Boolean = js.native
  @JSName("isUndefined")
  var isUndefined_Original: LodashIsUndefined = js.native
  
  def isWeakMap(value: js.Any): /* is std.WeakMap<object, any> */ Boolean = js.native
  @JSName("isWeakMap")
  var isWeakMap_Original: LodashIsWeakMap = js.native
  
  def isWeakSet(value: js.Any): /* is std.WeakSet<object> */ Boolean = js.native
  @JSName("isWeakSet")
  var isWeakSet_Original: LodashIsWeakSet = js.native
  
  def iteratee(func: java.lang.String): js.Function1[/* repeated */ js.Any, _] = js.native
  def iteratee(func: js.Object): js.Function1[/* repeated */ js.Any, _] = js.native
  def iteratee[TFunction /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunction): TFunction = js.native
  @JSName("iteratee")
  var iteratee_Original: LodashIteratee = js.native
  
  def join(separator: java.lang.String): java.lang.String = js.native
  def join(separator: java.lang.String, array: List[_]): java.lang.String = js.native
  def join(separator: __): LodashJoin1x2 = js.native
  def join(separator: __, array: List[_]): LodashJoin1x2 = js.native
  @JSName("join")
  def join_LodashJoin1x1(separator: java.lang.String): LodashJoin1x1 = js.native
  @JSName("join")
  var join_Original: LodashJoin = js.native
  
  def juxt[TResult](iteratees: Many[js.Function1[/* repeated */ _, TResult]]): js.Function1[/* repeated */ js.Any, js.Array[TResult]] = js.native
  @JSName("juxt")
  var juxt_Original: LodashOver = js.native
  
  def kebabCase(string: java.lang.String): java.lang.String = js.native
  @JSName("kebabCase")
  var kebabCase_Original: LodashKebabCase = js.native
  
  def keyBy[T](iteratee: ValueIterateeCustom[T, PropertyName]): Dictionary[T] = js.native
  def keyBy[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ],
    collection: T
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def keyBy[T](iteratee: ValueIterateeCustom[T, PropertyName], collection: List[T]): Dictionary[T] = js.native
  def keyBy[T](iteratee: __): LodashKeyBy1x2[T] = js.native
  def keyBy[T /* <: js.Object */](iteratee: __, collection: T): LodashKeyBy2x2[T] = js.native
  def keyBy[T](iteratee: __, collection: List[T]): LodashKeyBy1x2[T] = js.native
  @JSName("keyBy")
  var keyBy_Original: LodashKeyBy = js.native
  @JSName("keyBy")
  def keyBy_T_LodashKeyBy1x1[T](iteratee: ValueIterateeCustom[T, PropertyName]): LodashKeyBy1x1[T] = js.native
  @JSName("keyBy")
  def keyBy_T_Object[T /* <: js.Object */](
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("keyBy")
  def keyBy_T_Object_LodashKeyBy2x2[T /* <: js.Object */](iteratee: __): LodashKeyBy2x2[T] = js.native
  
  def keys(`object`: js.Any): js.Array[java.lang.String] = js.native
  
  def keysIn(`object`: js.Any): js.Array[java.lang.String] = js.native
  @JSName("keysIn")
  var keysIn_Original: LodashKeysIn = js.native
  
  @JSName("keys")
  var keys_Original: LodashKeys = js.native
  
  def last[T](): js.UndefOr[T] = js.native
  def last[T](array: List[T]): js.UndefOr[T] = js.native
  
  def lastIndexOf[T](value: T): Double = js.native
  def lastIndexOf[T](value: T, array: List[T]): Double = js.native
  def lastIndexOf[T](value: __): LodashLastIndexOf1x2[T] = js.native
  def lastIndexOf[T](value: __, array: List[T]): LodashLastIndexOf1x2[T] = js.native
  
  def lastIndexOfFrom(value: __, fromIndex: Double): LodashLastIndexOfFrom1x2 = js.native
  def lastIndexOfFrom[T](value: T): LodashLastIndexOfFrom1x1[T] = js.native
  def lastIndexOfFrom[T](value: T, fromIndex: Double): LodashLastIndexOfFrom1x3[T] = js.native
  def lastIndexOfFrom[T](value: T, fromIndex: Double, array: List[T]): Double = js.native
  def lastIndexOfFrom[T](value: T, fromIndex: __): LodashLastIndexOfFrom1x5 = js.native
  def lastIndexOfFrom[T](value: T, fromIndex: __, array: List[T]): LodashLastIndexOfFrom1x5 = js.native
  def lastIndexOfFrom[T](value: __, fromIndex: Double, array: List[T]): LodashLastIndexOfFrom1x6[T] = js.native
  def lastIndexOfFrom[T](value: __, fromIndex: __): LodashLastIndexOfFrom1x4[T] = js.native
  def lastIndexOfFrom[T](value: __, fromIndex: __, array: List[T]): LodashLastIndexOfFrom1x4[T] = js.native
  @JSName("lastIndexOfFrom")
  var lastIndexOfFrom_Original: LodashLastIndexOfFrom = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_T_Double[T](value: T, fromIndex: Double): Double = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_T_LodashLastIndexOfFrom1x6[T](value: __, fromIndex: Double): LodashLastIndexOfFrom1x6[T] = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true(value: __, fromIndex: `true`): LodashLastIndexOfFrom1x2 = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true[T](value: T, fromIndex: `true`): LodashLastIndexOfFrom1x3[T] = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true[T](value: T, fromIndex: `true`, array: List[T]): Double = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true[T](value: __, fromIndex: `true`, array: List[T]): LodashLastIndexOfFrom1x6[T] = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true_T_Double[T](value: T, fromIndex: `true`): Double = js.native
  @JSName("lastIndexOfFrom")
  def lastIndexOfFrom_true_T_LodashLastIndexOfFrom1x6[T](value: __, fromIndex: `true`): LodashLastIndexOfFrom1x6[T] = js.native
  
  @JSName("lastIndexOf")
  var lastIndexOf_Original: LodashLastIndexOf = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_T_LodashLastIndexOf1x1[T](value: T): LodashLastIndexOf1x1[T] = js.native
  
  @JSName("last")
  var last_Original: LodashLast = js.native
  
  def lowerCase(string: java.lang.String): java.lang.String = js.native
  @JSName("lowerCase")
  var lowerCase_Original: LodashLowerCase = js.native
  
  def lowerFirst(string: java.lang.String): java.lang.String = js.native
  @JSName("lowerFirst")
  var lowerFirst_Original: LodashLowerFirst = js.native
  
  def lt(value: js.Any): LodashLt1x1 = js.native
  def lt(value: js.Any, other: js.Any): Boolean = js.native
  def lt(value: __, other: js.Any): LodashLt1x2 = js.native
  @JSName("lt")
  var lt_Original: LodashLt = js.native
  
  def lte(value: js.Any): LodashLte1x1 = js.native
  def lte(value: js.Any, other: js.Any): Boolean = js.native
  def lte(value: __, other: js.Any): LodashLte1x2 = js.native
  @JSName("lte")
  var lte_Original: LodashLte = js.native
  
  def map(iteratee: java.lang.String): LodashMap5x1 = js.native
  def map(iteratee: js.Object): LodashMap6x1 = js.native
  def map[T](iteratee: java.lang.String, collection: Dictionary[T]): js.Array[_] = js.native
  def map[T](iteratee: java.lang.String, collection: NumericDictionary[T]): js.Array[_] = js.native
  def map[T](iteratee: js.Object, collection: Dictionary[T]): js.Array[Boolean] = js.native
  def map[T](iteratee: js.Object, collection: NumericDictionary[T]): js.Array[Boolean] = js.native
  def map[T](iteratee: __): LodashMap2x2[T] = js.native
  def map[T /* <: js.Object */](iteratee: __, collection: T): LodashMap3x2[T] = js.native
  def map[T](iteratee: __, collection: js.Array[T]): LodashMap1x2[T] = js.native
  def map[T](iteratee: __, collection: Dictionary[T]): LodashMap4x2[T] = js.native
  def map[T](iteratee: __, collection: List[T]): LodashMap2x2[T] = js.native
  def map[T](iteratee: __, collection: NumericDictionary[T]): LodashMap4x2[T] = js.native
  def map[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def map[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: Dictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def map[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: NumericDictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def map[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): js.Array[TResult] = js.native
  def map[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def map[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult] = js.native
  def map[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: List[T]): js.Array[TResult] = js.native
  
  def mapKeys(iteratee: ValueIteratee[Double]): LodashMapKeys1x1 = js.native
  def mapKeys[T /* <: js.Object */](iteratee: ValueIteratee[java.lang.String], `object`: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def mapKeys[T](iteratee: ValueIteratee[Double], `object`: List[T]): Dictionary[T] = js.native
  def mapKeys[T](iteratee: __): LodashMapKeys1x2[T] = js.native
  def mapKeys[T /* <: js.Object */](iteratee: __, `object`: T): LodashMapKeys2x2[T] = js.native
  def mapKeys[T](iteratee: __, `object`: List[T]): LodashMapKeys1x2[T] = js.native
  @JSName("mapKeys")
  def mapKeys_LodashMapKeys2x1(iteratee: ValueIteratee[java.lang.String]): LodashMapKeys2x1 = js.native
  @JSName("mapKeys")
  var mapKeys_Original: LodashMapKeys = js.native
  @JSName("mapKeys")
  def mapKeys_T_Dictionary[T](iteratee: ValueIteratee[Double]): Dictionary[T] = js.native
  @JSName("mapKeys")
  def mapKeys_T_Object_Dictionary[T /* <: js.Object */](iteratee: ValueIteratee[java.lang.String]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_T_Object_LodashMapKeys2x2[T /* <: js.Object */](iteratee: __): LodashMapKeys2x2[T] = js.native
  
  def mapValues(iteratee: java.lang.String): LodashMapValues6x1 = js.native
  def mapValues(iteratee: js.Object): LodashMapValues3x1 = js.native
  def mapValues[T](callbackOrIterateeOrIterateeOrIteratee: __): LodashMapValues1x2[T] = js.native
  def mapValues[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: Dictionary[T]): LodashMapValues1x2[T] = js.native
  def mapValues[T](callbackOrIterateeOrIterateeOrIteratee: __, obj: NumericDictionary[T]): LodashMapValues1x2[T] = js.native
  def mapValues[T /* <: js.Object */](callbackOrIterateeOrIteratee: __, obj: T): LodashMapValues2x2[T] = js.native
  def mapValues[T /* <: js.Object */](iteratee: java.lang.String, obj: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.lodash.lodashStrings.LoDashFp with TopLevel[js.Any] = js.native
  def mapValues[T](iteratee: java.lang.String, obj: Dictionary[T]): Dictionary[_] = js.native
  def mapValues[T](iteratee: java.lang.String, obj: NumericDictionary[T]): Dictionary[_] = js.native
  def mapValues[T /* <: js.Object */](iteratee: js.Object, obj: T): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.lodash.lodashStrings.LoDashFp with TopLevel[js.Any] = js.native
  def mapValues[T](iteratee: js.Object, obj: Dictionary[T]): Dictionary[Boolean] = js.native
  def mapValues[T](iteratee: js.Object, obj: NumericDictionary[T]): Dictionary[Boolean] = js.native
  def mapValues[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.lodash.lodashStrings.LoDashFp with TopLevel[js.Any] = js.native
  def mapValues[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    obj: T
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.lodash.lodashStrings.LoDashFp with TopLevel[js.Any] = js.native
  def mapValues[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: Dictionary[T]): Dictionary[TResult] = js.native
  def mapValues[T, TResult](callback: js.Function1[/* value */ T, TResult], obj: NumericDictionary[T]): Dictionary[TResult] = js.native
  def mapValues[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def mapValues[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey, obj: Dictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def mapValues[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey, obj: NumericDictionary[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  @JSName("mapValues")
  var mapValues_Original: LodashMapValues = js.native
  @JSName("mapValues")
  def mapValues_TTKey_String_LodashMapValues5x1[T, TKey /* <: /* keyof T */ java.lang.String */](iteratee: TKey): LodashMapValues5x1[T, TKey] = js.native
  @JSName("mapValues")
  def mapValues_TTResult_Dictionary[T, TResult](callback: js.Function1[/* value */ T, TResult]): Dictionary[TResult] = js.native
  @JSName("mapValues")
  def mapValues_TTResult_LodashMapValues1x1[T, TResult](callback: js.Function1[/* value */ T, TResult]): LodashMapValues1x1[T, TResult] = js.native
  @JSName("mapValues")
  def mapValues_T_Dictionary[T](iteratee: java.lang.String): Dictionary[_] = js.native
  @JSName("mapValues")
  def mapValues_T_Dictionary[T](iteratee: js.Object): Dictionary[Boolean] = js.native
  @JSName("mapValues")
  def mapValues_T_ObjectTResult_LodashMapValues2x1[T /* <: js.Object */, TResult](
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMapValues2x1[T, TResult] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_Intersection[T /* <: js.Object */](iteratee: java.lang.String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.lodash.lodashStrings.LoDashFp with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_Intersection[T /* <: js.Object */](iteratee: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.lodash.lodashStrings.LoDashFp with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_LodashMapValues2x2[T /* <: js.Object */](callbackOrIterateeOrIteratee: __): LodashMapValues2x2[T] = js.native
  
  @JSName("map")
  var map_Original: LodashMap = js.native
  @JSName("map")
  def map_TK_String_LodashMap4x1[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): LodashMap4x1[T, K] = js.native
  @JSName("map")
  def map_TTResult[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): js.Array[TResult] = js.native
  @JSName("map")
  def map_TTResult_LodashMap1x1[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): LodashMap1x1[T, TResult] = js.native
  @JSName("map")
  def map_T_Array[T](iteratee: java.lang.String): js.Array[_] = js.native
  @JSName("map")
  def map_T_Array[T](iteratee: js.Object): js.Array[Boolean] = js.native
  @JSName("map")
  def map_T_LodashMap1x2[T](iteratee: __): LodashMap1x2[T] = js.native
  @JSName("map")
  def map_T_LodashMap4x2[T](iteratee: __): LodashMap4x2[T] = js.native
  @JSName("map")
  def map_T_ObjectTResult_LodashMap3x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMap3x1[T, TResult] = js.native
  @JSName("map")
  def map_T_Object_LodashMap3x2[T /* <: js.Object */](iteratee: __): LodashMap3x2[T] = js.native
  
  def matches(source: js.Object): LodashIsMatch1x1 = js.native
  def matches(source: js.Object, `object`: js.Object): Boolean = js.native
  def matches(source: __, `object`: js.Object): LodashIsMatch1x2 = js.native
  
  def matchesProperty(path: PropertyPath): LodashMatchesProperty1x1 = js.native
  def matchesProperty[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ js.Any, Boolean] = js.native
  def matchesProperty[T](path: __, srcValue: T): LodashMatchesProperty1x2 = js.native
  @JSName("matchesProperty")
  var matchesProperty_Original: LodashMatchesProperty = js.native
  
  @JSName("matches")
  var matches_Original: LodashIsMatch = js.native
  
  def max[T](): js.UndefOr[T] = js.native
  def max[T](collection: List[T]): js.UndefOr[T] = js.native
  
  def maxBy[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def maxBy[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def maxBy[T](iteratee: __): LodashMaxBy1x2[T] = js.native
  def maxBy[T](iteratee: __, collection: List[T]): LodashMaxBy1x2[T] = js.native
  @JSName("maxBy")
  var maxBy_Original: LodashMaxBy = js.native
  @JSName("maxBy")
  def maxBy_T_LodashMaxBy1x1[T](iteratee: ValueIteratee[T]): LodashMaxBy1x1[T] = js.native
  
  @JSName("max")
  var max_Original: LodashMax = js.native
  
  def mean(): Double = js.native
  def mean(collection: List[_]): Double = js.native
  
  def meanBy[T](iteratee: ValueIteratee[T]): Double = js.native
  def meanBy[T](iteratee: ValueIteratee[T], collection: List[T]): Double = js.native
  def meanBy[T](iteratee: __): LodashMeanBy1x2[T] = js.native
  def meanBy[T](iteratee: __, collection: List[T]): LodashMeanBy1x2[T] = js.native
  @JSName("meanBy")
  var meanBy_Original: LodashMeanBy = js.native
  @JSName("meanBy")
  def meanBy_T_LodashMeanBy1x1[T](iteratee: ValueIteratee[T]): LodashMeanBy1x1[T] = js.native
  
  @JSName("mean")
  var mean_Original: LodashMean = js.native
  
  def memoize[T /* <: js.Function1[/* args */ js.Any, _] */](func: T): T with MemoizedFunction = js.native
  @JSName("memoize")
  var memoize_Original: LodashMemoize = js.native
  
  def merge[TObject](`object`: TObject): LodashMerge1x1[TObject] = js.native
  def merge[TSource](`object`: __, source: TSource): LodashMerge1x2[TSource] = js.native
  def merge[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  
  def mergeAll(`object`: js.Array[_]): js.Any = js.native
  def mergeAll[TObject, TSource](`object`: js.Tuple2[TObject, TSource]): TObject with TSource = js.native
  def mergeAll[TObject, TSource1, TSource2](`object`: js.Tuple3[TObject, TSource1, TSource2]): TObject with TSource1 with TSource2 = js.native
  def mergeAll[TObject, TSource1, TSource2, TSource3](`object`: js.Tuple4[TObject, TSource1, TSource2, TSource3]): TObject with TSource1 with TSource2 with TSource3 = js.native
  def mergeAll[TObject, TSource1, TSource2, TSource3, TSource4](`object`: js.Tuple5[TObject, TSource1, TSource2, TSource3, TSource4]): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  def mergeAllWith(customizer: MergeWithCustomizer): LodashMergeAllWith1x1 = js.native
  def mergeAllWith(customizer: MergeWithCustomizer, args: js.Array[_]): js.Any = js.native
  def mergeAllWith(customizer: __, args: js.Array[_]): LodashMergeAllWith1x2 = js.native
  @JSName("mergeAllWith")
  var mergeAllWith_Original: LodashMergeAllWith = js.native
  
  @JSName("mergeAll")
  var mergeAll_Original: LodashMergeAll = js.native
  
  def mergeWith(customizer: MergeWithCustomizer): LodashMergeWith1x1 = js.native
  def mergeWith[TObject](customizer: MergeWithCustomizer, `object`: TObject): LodashMergeWith1x3[TObject] = js.native
  def mergeWith[TSource](customizer: MergeWithCustomizer, `object`: __, source: TSource): LodashMergeWith1x5[TSource] = js.native
  def mergeWith[TObject](customizer: __, `object`: TObject): LodashMergeWith1x2[TObject] = js.native
  def mergeWith[TSource](customizer: __, `object`: __, source: TSource): LodashMergeWith1x4[TSource] = js.native
  def mergeWith[TObject, TSource](customizer: MergeWithCustomizer, `object`: TObject, source: TSource): TObject with TSource = js.native
  def mergeWith[TObject, TSource](customizer: __, `object`: TObject, source: TSource): LodashMergeWith1x6[TObject, TSource] = js.native
  @JSName("mergeWith")
  var mergeWith_Original: LodashMergeWith = js.native
  
  @JSName("merge")
  var merge_Original: LodashMerge = js.native
  
  def method(path: PropertyPath): js.Function1[/* object */ js.Any, _] = js.native
  
  def methodOf(`object`: js.Object): js.Function1[/* path */ PropertyPath, _] = js.native
  @JSName("methodOf")
  var methodOf_Original: LodashMethodOf = js.native
  
  @JSName("method")
  var method_Original: LodashMethod = js.native
  
  def min[T](): js.UndefOr[T] = js.native
  def min[T](collection: List[T]): js.UndefOr[T] = js.native
  
  def minBy[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def minBy[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def minBy[T](iteratee: __): LodashMinBy1x2[T] = js.native
  def minBy[T](iteratee: __, collection: List[T]): LodashMinBy1x2[T] = js.native
  @JSName("minBy")
  var minBy_Original: LodashMinBy = js.native
  @JSName("minBy")
  def minBy_T_LodashMinBy1x1[T](iteratee: ValueIteratee[T]): LodashMinBy1x1[T] = js.native
  
  @JSName("min")
  var min_Original: LodashMin = js.native
  
  def multiply(multiplier: Double): LodashMultiply1x1 = js.native
  def multiply(multiplier: Double, multiplicand: Double): Double = js.native
  def multiply(multiplier: __, multiplicand: Double): LodashMultiply1x2 = js.native
  @JSName("multiply")
  var multiply_Original: LodashMultiply = js.native
  
  def nAry(n: Double): LodashAry1x1 = js.native
  def nAry(n: Double, func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def nAry(n: __, func: js.Function1[/* repeated */ js.Any, _]): LodashAry1x2 = js.native
  @JSName("nAry")
  var nAry_Original: LodashAry = js.native
  
  def negate[T /* <: js.Array[_] */](predicate: js.Function1[/* args */ T, _]): js.Function1[/* args */ T, Boolean] = js.native
  @JSName("negate")
  var negate_Original: LodashNegate = js.native
  
  def noConflict(): Typeoflodash = js.native
  @JSName("noConflict")
  var noConflict_Original: LodashNoConflict = js.native
  
  def noop(args: js.Any*): Unit = js.native
  @JSName("noop")
  var noop_Original: LodashNoop = js.native
  
  def now(): Double = js.native
  @JSName("now")
  var now_Original: LodashNow = js.native
  
  def nth(n: Double): LodashNth1x1 = js.native
  def nth[T](n: Double, array: List[T]): js.UndefOr[T] = js.native
  def nth[T](n: __): LodashNth1x2[T] = js.native
  def nth[T](n: __, array: List[T]): LodashNth1x2[T] = js.native
  
  def nthArg(n: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("nthArg")
  var nthArg_Original: LodashNthArg = js.native
  
  @JSName("nth")
  var nth_Original: LodashNth = js.native
  @JSName("nth")
  def nth_T_Union[T](n: Double): js.UndefOr[T] = js.native
  
  def omit(paths: Many[PropertyName]): LodashOmit2x1 = js.native
  def omit[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T] = js.native
  def omit[T /* <: js.Object */](paths: __): LodashOmit1x2[T] = js.native
  def omit[T /* <: js.Object */](paths: __, `object`: T): LodashOmit1x2[T] = js.native
  
  def omitAll(paths: Many[PropertyName]): LodashOmit2x1 = js.native
  def omitAll[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T] = js.native
  def omitAll[T /* <: js.Object */](paths: __): LodashOmit1x2[T] = js.native
  def omitAll[T /* <: js.Object */](paths: __, `object`: T): LodashOmit1x2[T] = js.native
  @JSName("omitAll")
  var omitAll_Original: LodashOmit = js.native
  @JSName("omitAll")
  def omitAll_T_ObjectK_String_LodashOmit1x1[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): LodashOmit1x1[T, K] = js.native
  @JSName("omitAll")
  def omitAll_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): Omit[T, K] = js.native
  @JSName("omitAll")
  def omitAll_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K], `object`: T): Omit[T, K] = js.native
  @JSName("omitAll")
  def omitAll_T_Object_PartialObject[T /* <: js.Object */](paths: Many[PropertyName]): PartialObject[T] = js.native
  
  def omitBy[T](predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def omitBy[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def omitBy[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def omitBy[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def omitBy[T /* <: js.Object */](predicate: __): LodashOmitBy3x2[T] = js.native
  def omitBy[T /* <: js.Object */](predicate: __, `object`: T): LodashOmitBy3x2[T] = js.native
  def omitBy[T](predicate: __, `object`: Dictionary[T]): LodashOmitBy1x2[T] = js.native
  def omitBy[T](predicate: __, `object`: NumericDictionary[T]): LodashOmitBy2x2[T] = js.native
  @JSName("omitBy")
  var omitBy_Original: LodashOmitBy = js.native
  @JSName("omitBy")
  def omitBy_T_Dictionary[T](predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  @JSName("omitBy")
  def omitBy_T_LodashOmitBy1x1[T](predicate: ValueKeyIteratee[T]): LodashOmitBy1x1[T] = js.native
  @JSName("omitBy")
  def omitBy_T_LodashOmitBy1x2[T](predicate: __): LodashOmitBy1x2[T] = js.native
  @JSName("omitBy")
  def omitBy_T_LodashOmitBy2x2[T](predicate: __): LodashOmitBy2x2[T] = js.native
  @JSName("omitBy")
  def omitBy_T_Object_PartialObject[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  
  @JSName("omit")
  var omit_Original: LodashOmit = js.native
  @JSName("omit")
  def omit_T_ObjectK_String_LodashOmit1x1[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): LodashOmit1x1[T, K] = js.native
  @JSName("omit")
  def omit_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K]): Omit[T, K] = js.native
  @JSName("omit")
  def omit_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ java.lang.String */](paths: Many[K], `object`: T): Omit[T, K] = js.native
  @JSName("omit")
  def omit_T_Object_PartialObject[T /* <: js.Object */](paths: Many[PropertyName]): PartialObject[T] = js.native
  
  def once[T /* <: js.Function1[/* args */ js.Any, _] */](func: T): T = js.native
  @JSName("once")
  var once_Original: LodashOnce = js.native
  
  def orderBy(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x2 = js.native
  def orderBy[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]]): LodashOrderBy1x1[T] = js.native
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    orders: Many[Boolean | asc | desc],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T](
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc],
    collection: List[T]
  ): js.Array[T] = js.native
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: __
  ): LodashOrderBy4x5[T] = js.native
  def orderBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy4x5[T] = js.native
  def orderBy[T](iteratees: Many[ValueIteratee[T]], orders: __, collection: List[T]): LodashOrderBy2x5[T] = js.native
  def orderBy[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc], collection: T): LodashOrderBy3x6[T] = js.native
  def orderBy[T](iteratees: __, orders: Many[Boolean | asc | desc], collection: List[T]): LodashOrderBy1x6[T] = js.native
  def orderBy[T](iteratees: __, orders: __): LodashOrderBy1x4[T] = js.native
  def orderBy[T /* <: js.Object */](iteratees: __, orders: __, collection: T): LodashOrderBy3x4[T] = js.native
  def orderBy[T](iteratees: __, orders: __, collection: List[T]): LodashOrderBy1x4[T] = js.native
  @JSName("orderBy")
  var orderBy_Original: LodashOrderBy = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    iteratees: Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x3[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: Many[Boolean | asc | desc]): LodashOrderBy1x3[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x5[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: __): LodashOrderBy1x5[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x5[T](iteratees: Many[js.Function1[/* value */ T, NotVoid]], orders: __, collection: List[T]): LodashOrderBy1x5[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy1x6[T](iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy1x6[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy2x1[T](iteratees: Many[ValueIteratee[T]]): LodashOrderBy2x1[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy2x3[T](iteratees: Many[ValueIteratee[T]], orders: Many[Boolean | asc | desc]): LodashOrderBy2x3[T] = js.native
  @JSName("orderBy")
  def orderBy_T_LodashOrderBy2x5[T](iteratees: Many[ValueIteratee[T]], orders: __): LodashOrderBy2x5[T] = js.native
  @JSName("orderBy")
  def orderBy_T_Object_LodashOrderBy3x4[T /* <: js.Object */](iteratees: __, orders: __): LodashOrderBy3x4[T] = js.native
  @JSName("orderBy")
  def orderBy_T_Object_LodashOrderBy3x5[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __
  ): LodashOrderBy3x5[T] = js.native
  @JSName("orderBy")
  def orderBy_T_Object_LodashOrderBy3x5[T /* <: js.Object */](
    iteratees: Many[
      js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]
    ],
    orders: __,
    collection: T
  ): LodashOrderBy3x5[T] = js.native
  @JSName("orderBy")
  def orderBy_T_Object_LodashOrderBy3x6[T /* <: js.Object */](iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy3x6[T] = js.native
  
  def over[TResult](iteratees: Many[js.Function1[/* repeated */ _, TResult]]): js.Function1[/* repeated */ js.Any, js.Array[TResult]] = js.native
  
  def overArgs(func: js.Function1[/* repeated */ js.Any, _]): LodashOverArgs1x1 = js.native
  def overArgs(func: js.Function1[/* repeated */ js.Any, _], transforms: Many[js.Function1[/* repeated */ _, _]]): js.Function1[/* repeated */ js.Any, _] = js.native
  def overArgs(func: __, transforms: Many[js.Function1[/* repeated */ _, _]]): LodashOverArgs1x2 = js.native
  @JSName("overArgs")
  var overArgs_Original: LodashOverArgs = js.native
  
  def overEvery[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean] = js.native
  @JSName("overEvery")
  var overEvery_Original: LodashOverEvery = js.native
  
  def overSome[T](predicates: Many[js.Function1[/* repeated */ T, Boolean]]): js.Function1[/* repeated */ T, Boolean] = js.native
  @JSName("overSome")
  var overSome_Original: LodashOverSome = js.native
  
  @JSName("over")
  var over_Original: LodashOver = js.native
  
  def pad(length: Double): LodashPad1x1 = js.native
  def pad(length: Double, string: java.lang.String): java.lang.String = js.native
  def pad(length: __, string: java.lang.String): LodashPad1x2 = js.native
  
  def padChars(chars: java.lang.String): LodashPadChars1x1 = js.native
  def padChars(chars: java.lang.String, length: Double): LodashPadChars1x3 = js.native
  def padChars(chars: java.lang.String, length: Double, string: java.lang.String): java.lang.String = js.native
  def padChars(chars: java.lang.String, length: __, string: java.lang.String): LodashPadChars1x5 = js.native
  def padChars(chars: __, length: Double): LodashPadChars1x2 = js.native
  def padChars(chars: __, length: Double, string: java.lang.String): LodashPadChars1x6 = js.native
  def padChars(chars: __, length: __, string: java.lang.String): LodashPadChars1x4 = js.native
  
  def padCharsEnd(chars: java.lang.String): LodashPadCharsEnd1x1 = js.native
  def padCharsEnd(chars: java.lang.String, length: Double): LodashPadCharsEnd1x3 = js.native
  def padCharsEnd(chars: java.lang.String, length: Double, string: java.lang.String): java.lang.String = js.native
  def padCharsEnd(chars: java.lang.String, length: __, string: java.lang.String): LodashPadCharsEnd1x5 = js.native
  def padCharsEnd(chars: __, length: Double): LodashPadCharsEnd1x2 = js.native
  def padCharsEnd(chars: __, length: Double, string: java.lang.String): LodashPadCharsEnd1x6 = js.native
  def padCharsEnd(chars: __, length: __, string: java.lang.String): LodashPadCharsEnd1x4 = js.native
  @JSName("padCharsEnd")
  var padCharsEnd_Original: LodashPadCharsEnd = js.native
  
  def padCharsStart(chars: java.lang.String): LodashPadCharsStart1x1 = js.native
  def padCharsStart(chars: java.lang.String, length: Double): LodashPadCharsStart1x3 = js.native
  def padCharsStart(chars: java.lang.String, length: Double, string: java.lang.String): java.lang.String = js.native
  def padCharsStart(chars: java.lang.String, length: __, string: java.lang.String): LodashPadCharsStart1x5 = js.native
  def padCharsStart(chars: __, length: Double): LodashPadCharsStart1x2 = js.native
  def padCharsStart(chars: __, length: Double, string: java.lang.String): LodashPadCharsStart1x6 = js.native
  def padCharsStart(chars: __, length: __, string: java.lang.String): LodashPadCharsStart1x4 = js.native
  @JSName("padCharsStart")
  var padCharsStart_Original: LodashPadCharsStart = js.native
  
  @JSName("padChars")
  var padChars_Original: LodashPadChars = js.native
  
  def padEnd(length: Double): LodashPadEnd1x1 = js.native
  def padEnd(length: Double, string: java.lang.String): java.lang.String = js.native
  def padEnd(length: __, string: java.lang.String): LodashPadEnd1x2 = js.native
  @JSName("padEnd")
  var padEnd_Original: LodashPadEnd = js.native
  
  def padStart(length: Double): LodashPadStart1x1 = js.native
  def padStart(length: Double, string: java.lang.String): java.lang.String = js.native
  def padStart(length: __, string: java.lang.String): LodashPadStart1x2 = js.native
  @JSName("padStart")
  var padStart_Original: LodashPadStart = js.native
  
  @JSName("pad")
  var pad_Original: LodashPad = js.native
  
  def parseInt(radix: Double): LodashParseInt1x1 = js.native
  def parseInt(radix: Double, string: java.lang.String): Double = js.native
  def parseInt(radix: __, string: java.lang.String): LodashParseInt1x2 = js.native
  @JSName("parseInt")
  var parseInt_Original: LodashParseInt = js.native
  
  def partial[T1](func: __, arg1: js.Array[T1]): LodashPartial18x2[T1] = js.native
  def partial[T2](func: __, plc1: js.Tuple2[__, T2]): LodashPartial1x2[T2] = js.native
  def partial[T3](func: __, plc1: js.Tuple3[__, __, T3]): LodashPartial3x2[T3] = js.native
  def partial[T4](func: __, plc1: js.Tuple4[__, __, __, T4]): LodashPartial11x2[T4] = js.native
  def partial[TS /* <: js.Array[_] */, T1, R](func: js.Function2[/* t1 */ T1, /* ts */ TS, R]): LodashPartial18x1[TS, T1, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, R](func: js.Function2[/* t1 */ T1, /* ts */ TS, R], arg1: js.Array[T1]): js.Function1[/* ts */ TS, R] = js.native
  def partial[T1, T2, R](func: Function2[T1, T2, R], plc1: js.Tuple2[__, T2]): Function1[T1, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, T2, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* ts */ TS, R]): LodashPartial19x1[TS, T1, T2, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, T2, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* ts */ TS, R], t1: js.Tuple2[T1, T2]): js.Function1[/* ts */ TS, R] = js.native
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1 | __, T2 | __, T3]): Function1[T2, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, T2, T3, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* ts */ TS, R]): LodashPartial20x1[TS, T1, T2, T3, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, T2, T3, R](
    func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* ts */ TS, R],
    t1: js.Tuple3[T1, T2, T3]
  ): js.Function1[/* ts */ TS, R] = js.native
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1 | __, T2 | __, T3 | __, T4]): Function1[T3, R] = js.native
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: js.Tuple2[__, T2]): Function3[T1, T3, T4, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, T2, T3, T4, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* ts */ TS, R]): LodashPartial21x1[TS, T1, T2, T3, T4, R] = js.native
  def partial[TS /* <: js.Array[_] */, T1, T2, T3, T4, R](
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* ts */ TS, R],
    t1: js.Tuple4[T1, T2, T3, T4]
  ): js.Function1[/* ts */ TS, R] = js.native
  
  def partialRight(func: js.Function1[/* repeated */ js.Any, _]): LodashPartialRight27x1 = js.native
  def partialRight(func: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): js.Function1[/* repeated */ js.Any, _] = js.native
  def partialRight(func: __, args: js.Array[_]): LodashPartialRight27x2 = js.native
  def partialRight[T1](func: __, arg1: js.Tuple2[T1, __]): LodashPartialRight2x2[T1] = js.native
  def partialRight[T1](func: __, arg1: js.Tuple4[T1, __, __, __]): LodashPartialRight12x2[T1] = js.native
  def partialRight[T2](func: __, arg2: js.Tuple3[T2, __, __]): LodashPartialRight13x2[T2] = js.native
  def partialRight[T1, T2, R](func: Function2[T1, T2, R]): LodashPartialRight2x1[T1, T2, R] = js.native
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg1: js.Tuple2[T1, T2]): Function0[R] = js.native
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg2: js.Array[T2]): Function1[T1, R] = js.native
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): LodashPartialRight5x1[T1, T2, T3, R] = js.native
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, T2 | __, T3 | __]): Function1[T3, R] = js.native
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: js.Tuple2[T2, T3]): Function1[T1, R] = js.native
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg3: js.Array[T3]): Function2[T1, T2, R] = js.native
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): LodashPartialRight12x1[T1, T2, T3, T4, R] = js.native
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, T2, T3, T4]): Function0[R] = js.native
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, T3, T4]): Function1[T1, R] = js.native
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: js.Tuple2[T3, T4]): Function2[T1, T2, R] = js.native
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg4: js.Array[T4]): Function3[T1, T2, T3, R] = js.native
  @JSName("partialRight")
  var partialRight_Original: LodashPartialRight = js.native
  @JSName("partialRight")
  def partialRight_T1R_Function0[T1, R](func: Function1[T1, R], arg1: js.Array[T1]): Function0[R] = js.native
  @JSName("partialRight")
  def partialRight_T1R_LodashPartialRight1x1[T1, R](func: Function1[T1, R]): LodashPartialRight1x1[T1, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2R_Function1[T1, T2, R](func: Function2[T1, T2, R], arg1: js.Tuple2[T1, __]): Function1[T2, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3R_Function0[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, T2, T3]): Function0[R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3R_Function2[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, __, __]): Function2[T2, T3, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3R_Function2[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: js.Tuple2[T2, __]): Function2[T1, T3, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, T2 | __, T3 | __, T4 | __]): Function1[T4, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function2[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, T2 | __, T3 | __, T4 | __]): Function2[T3, T4, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function2[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, T3 | __, T4 | __]): Function2[T1, T4, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, __, __, __]): Function3[T2, T3, T4, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, __, __]): Function3[T1, T3, T4, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: js.Tuple2[T3, __]): Function3[T1, T2, T4, R] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3T4_LodashPartialRight26x2[T1, T2, T3, T4](func: __, arg1: js.Tuple4[T1, T2, T3, T4]): LodashPartialRight26x2[T1, T2, T3, T4] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3_LodashPartialRight11x2[T1, T2, T3](func: __, arg1: js.Tuple3[T1, T2, T3]): LodashPartialRight11x2[T1, T2, T3] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T3_LodashPartialRight18x2[T1, T2, T3](func: __, arg1: js.Tuple4[T1, T2, T3, __]): LodashPartialRight18x2[T1, T2, T3] = js.native
  @JSName("partialRight")
  def partialRight_T1T2T4_LodashPartialRight22x2[T1, T2, T4](func: __, arg1: js.Tuple4[T1, T2, __, T4]): LodashPartialRight22x2[T1, T2, T4] = js.native
  @JSName("partialRight")
  def partialRight_T1T2_LodashPartialRight14x2[T1, T2](func: __, arg1: js.Tuple4[T1, T2, __, __]): LodashPartialRight14x2[T1, T2] = js.native
  @JSName("partialRight")
  def partialRight_T1T2_LodashPartialRight4x2[T1, T2](func: __, arg1: js.Tuple2[T1, T2]): LodashPartialRight4x2[T1, T2] = js.native
  @JSName("partialRight")
  def partialRight_T1T2_LodashPartialRight7x2[T1, T2](func: __, arg1: js.Tuple3[T1, T2, __]): LodashPartialRight7x2[T1, T2] = js.native
  @JSName("partialRight")
  def partialRight_T1T3T4_LodashPartialRight24x2[T1, T3, T4](func: __, arg1: js.Tuple4[T1, __, T3, T4]): LodashPartialRight24x2[T1, T3, T4] = js.native
  @JSName("partialRight")
  def partialRight_T1T3_LodashPartialRight16x2[T1, T3](func: __, arg1: js.Tuple4[T1, __, T3, __]): LodashPartialRight16x2[T1, T3] = js.native
  @JSName("partialRight")
  def partialRight_T1T3_LodashPartialRight9x2[T1, T3](func: __, arg1: js.Tuple3[T1, __, T3]): LodashPartialRight9x2[T1, T3] = js.native
  @JSName("partialRight")
  def partialRight_T1T4_LodashPartialRight20x2[T1, T4](func: __, arg1: js.Tuple4[T1, __, __, T4]): LodashPartialRight20x2[T1, T4] = js.native
  @JSName("partialRight")
  def partialRight_T1_LodashPartialRight1x2[T1](func: __, arg1: js.Array[T1]): LodashPartialRight1x2[T1] = js.native
  @JSName("partialRight")
  def partialRight_T1_LodashPartialRight5x2[T1](func: __, arg1: js.Tuple3[T1, __, __]): LodashPartialRight5x2[T1] = js.native
  @JSName("partialRight")
  def partialRight_T2T3T4_LodashPartialRight25x2[T2, T3, T4](func: __, arg2: js.Tuple3[T2, T3, T4]): LodashPartialRight25x2[T2, T3, T4] = js.native
  @JSName("partialRight")
  def partialRight_T2T3_LodashPartialRight10x2[T2, T3](func: __, arg2: js.Tuple2[T2, T3]): LodashPartialRight10x2[T2, T3] = js.native
  @JSName("partialRight")
  def partialRight_T2T3_LodashPartialRight17x2[T2, T3](func: __, arg2: js.Tuple3[T2, T3, __]): LodashPartialRight17x2[T2, T3] = js.native
  @JSName("partialRight")
  def partialRight_T2T4_LodashPartialRight21x2[T2, T4](func: __, arg2: js.Tuple3[T2, __, T4]): LodashPartialRight21x2[T2, T4] = js.native
  @JSName("partialRight")
  def partialRight_T2_LodashPartialRight3x2[T2](func: __, arg2: js.Array[T2]): LodashPartialRight3x2[T2] = js.native
  @JSName("partialRight")
  def partialRight_T2_LodashPartialRight6x2[T2](func: __, arg2: js.Tuple2[T2, __]): LodashPartialRight6x2[T2] = js.native
  @JSName("partialRight")
  def partialRight_T3T4_LodashPartialRight23x2[T3, T4](func: __, arg3: js.Tuple2[T3, T4]): LodashPartialRight23x2[T3, T4] = js.native
  @JSName("partialRight")
  def partialRight_T3_LodashPartialRight15x2[T3](func: __, arg3: js.Tuple2[T3, __]): LodashPartialRight15x2[T3] = js.native
  @JSName("partialRight")
  def partialRight_T3_LodashPartialRight8x2[T3](func: __, arg3: js.Array[T3]): LodashPartialRight8x2[T3] = js.native
  @JSName("partialRight")
  def partialRight_T4_LodashPartialRight19x2[T4](func: __, arg4: js.Array[T4]): LodashPartialRight19x2[T4] = js.native
  
  @JSName("partial")
  var partial_Original: LodashPartial = js.native
  @JSName("partial")
  def partial_T1T2R_LodashPartial1x1[T1, T2, R](func: Function2[T1, T2, R]): LodashPartial1x1[T1, T2, R] = js.native
  @JSName("partial")
  def partial_T1T2T3R_Function2[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: js.Tuple2[__, T2]): Function2[T1, T3, R] = js.native
  @JSName("partial")
  def partial_T1T2T3R_Function2[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: js.Tuple3[__, __, T3]): Function2[T1, T2, R] = js.native
  @JSName("partial")
  def partial_T1T2T3R_LodashPartial2x1[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): LodashPartial2x1[T1, T2, T3, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R_Function1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple3[T1, T2, T3]): Function1[T4, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R_Function2[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple3[T1 | __, T2 | __, T3]): Function2[T2, T4, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R_Function2[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1 | __, T2 | __, T3 | __, T4]): Function2[T2, T3, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: js.Tuple3[__, __, T3]): Function3[T1, T2, T4, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R_Function3[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: js.Tuple4[__, __, __, T4]): Function3[T1, T2, T3, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4R_LodashPartial6x1[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): LodashPartial6x1[T1, T2, T3, T4, R] = js.native
  @JSName("partial")
  def partial_T1T2T3T4_LodashPartial21x2[T1, T2, T3, T4](func: __, t1: js.Tuple4[T1, T2, T3, T4]): LodashPartial21x2[T1, T2, T3, T4] = js.native
  @JSName("partial")
  def partial_T1T2T3_LodashPartial10x2[T1, T2, T3](func: __, arg1OrT1: js.Tuple3[T1, T2, T3]): LodashPartial10x2[T1, T2, T3] = js.native
  @JSName("partial")
  def partial_T1T2T4_LodashPartial14x2[T1, T2, T4](func: __, arg1: js.Tuple4[T1, T2, __, T4]): LodashPartial14x2[T1, T2, T4] = js.native
  @JSName("partial")
  def partial_T1T2_LodashPartial19x2[T1, T2](func: __, t1: js.Tuple2[T1, T2]): LodashPartial19x2[T1, T2] = js.native
  @JSName("partial")
  def partial_T1T3T4_LodashPartial16x2[T1, T3, T4](func: __, arg1: js.Tuple4[T1, __, T3, T4]): LodashPartial16x2[T1, T3, T4] = js.native
  @JSName("partial")
  def partial_T1T3_LodashPartial4x2[T1, T3](func: __, arg1: js.Tuple3[T1, __, T3]): LodashPartial4x2[T1, T3] = js.native
  @JSName("partial")
  def partial_T1T4_LodashPartial12x2[T1, T4](func: __, arg1: js.Tuple4[T1, __, __, T4]): LodashPartial12x2[T1, T4] = js.native
  @JSName("partial")
  def partial_T2T3T4_LodashPartial17x2[T2, T3, T4](func: __, plc1: js.Tuple4[__, T2, T3, T4]): LodashPartial17x2[T2, T3, T4] = js.native
  @JSName("partial")
  def partial_T2T3_LodashPartial5x2[T2, T3](func: __, plc1: js.Tuple3[__, T2, T3]): LodashPartial5x2[T2, T3] = js.native
  @JSName("partial")
  def partial_T2T4_LodashPartial13x2[T2, T4](func: __, plc1: js.Tuple4[__, T2, __, T4]): LodashPartial13x2[T2, T4] = js.native
  @JSName("partial")
  def partial_T3T4_LodashPartial15x2[T3, T4](func: __, plc1: js.Tuple4[__, __, T3, T4]): LodashPartial15x2[T3, T4] = js.native
  
  def partition[T](callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition[T /* <: js.Object */](
    callback: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): js.Tuple2[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def partition[T](callback: ValueIteratee[T], collection: List[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition[T](callback: __): LodashPartition1x2[T] = js.native
  def partition[T /* <: js.Object */](callback: __, collection: T): LodashPartition3x2[T] = js.native
  def partition[T](callback: __, collection: List[T]): LodashPartition1x2[T] = js.native
  def partition[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  def partition[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U], collection: List[T]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  @JSName("partition")
  var partition_Original: LodashPartition = js.native
  @JSName("partition")
  def partition_TU_T_LodashPartition1x1[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): LodashPartition1x1[T, U] = js.native
  @JSName("partition")
  def partition_T_LodashPartition2x1[T](callback: ValueIteratee[T]): LodashPartition2x1[T] = js.native
  @JSName("partition")
  def partition_T_Object[T /* <: js.Object */](
    callback: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): js.Tuple2[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("partition")
  def partition_T_Object_LodashPartition3x2[T /* <: js.Object */](callback: __): LodashPartition3x2[T] = js.native
  
  def path(path: Double): LodashPath9x1 = js.native
  def path(path: PropertyPath): LodashPath11x1 = js.native
  def path(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def path(path: __): LodashPath11x2 = js.native
  def path(path: __, `object`: js.Any): LodashPath12x2 = js.native
  def path[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def path[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPath2x2[TObject] = js.native
  def path[T](path: __, `object`: NumericDictionary[T]): LodashPath10x2[T] = js.native
  def path[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashPath1x1[TObject, TKey] = js.native
  def path[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def path[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashPath1x1[TObject, TKey] = js.native
  def path[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any = js.native
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPath7x1[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def path[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  
  def pathEq(path: PropertyPath): LodashMatchesProperty1x1 = js.native
  def pathEq[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ js.Any, Boolean] = js.native
  def pathEq[T](path: __, srcValue: T): LodashMatchesProperty1x2 = js.native
  @JSName("pathEq")
  var pathEq_Original: LodashMatchesProperty = js.native
  
  def pathOr(defaultValue: js.Any): LodashPathOr7x1 = js.native
  def pathOr(defaultValue: js.Any, path: PropertyPath): LodashPathOr7x3 = js.native
  def pathOr(defaultValue: js.Any, path: PropertyPath, `object`: js.Any): js.Any = js.native
  def pathOr(defaultValue: js.Any, path: __, `object`: js.Any): LodashPathOr7x5 = js.native
  def pathOr(defaultValue: __, path: Double): LodashPathOr5x2 = js.native
  def pathOr(defaultValue: __, path: PropertyPath): LodashPathOr6x6 = js.native
  def pathOr(defaultValue: __, path: PropertyPath, `object`: js.Any): LodashPathOr7x6 = js.native
  def pathOr(defaultValue: __, path: __): LodashPathOr6x4 = js.native
  def pathOr(defaultValue: __, path: __, `object`: js.Any): LodashPathOr7x4 = js.native
  def pathOr[TDefault](defaultValue: TDefault): LodashPathOr1x1[TDefault] = js.native
  def pathOr[TDefault](defaultValue: TDefault, path: Double): LodashPathOr5x3[TDefault] = js.native
  def pathOr[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault = js.native
  def pathOr[TDefault](defaultValue: TDefault, path: __): LodashPathOr6x5[TDefault] = js.native
  def pathOr[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPathOr5x6[T] = js.native
  def pathOr[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashPathOr1x4[TObject] = js.native
  def pathOr[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPathOr5x4[T] = js.native
  def pathOr[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashPathOr1x5[TObject, TDefault] = js.native
  def pathOr[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPathOr5x5[T, TDefault] = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPathOr1x2[TObject, TKey] = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey, `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x2[TObject, TKey] = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPathOr1x6[TObject, TKey] = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x2[TObject, TKey1, TKey2] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x3[TObject, TKey1, TKey2, TDefault] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x2[TObject, TKey1, TKey2, TKey3] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x2[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashPathOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def pathOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("pathOr")
  def pathOr_LodashPathOr6x2(defaultValue: __, path: PropertyPath): LodashPathOr6x2 = js.native
  @JSName("pathOr")
  var pathOr_Original: LodashPathOr = js.native
  @JSName("pathOr")
  def pathOr_TDefault_LodashPathOr6x3[TDefault](defaultValue: TDefault, path: PropertyPath): LodashPathOr6x3[TDefault] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTDefault_LodashPathOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __): LodashPathOr1x5[TObject, TDefault] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey1_StringTKey2_AnyTDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_AnyTDefault_LodashPathOr4x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_LodashPathOr4x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPathOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_LodashPathOr3x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPathOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey1_StringTKey2_Any_LodashPathOr2x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPathOr2x6[TObject, TKey1, TKey2] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey_StringTDefault_LodashPathOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey_StringTDefault_LodashPathOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPathOr1x3[TObject, TKey, TDefault] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey_String_LodashPathOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPathOr1x6[TObject, TKey] = js.native
  @JSName("pathOr")
  def pathOr_TObject_ObjectTKey_String_LodashPathOr1x6[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPathOr1x6[TObject, TKey] = js.native
  @JSName("pathOr")
  def pathOr_TObject_Object_LodashPathOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __): LodashPathOr1x4[TObject] = js.native
  @JSName("pathOr")
  def pathOr_TTDefault_LodashPathOr5x5[T, TDefault](defaultValue: TDefault, path: __): LodashPathOr5x5[T, TDefault] = js.native
  @JSName("pathOr")
  def pathOr_TTDefault_Union[T, TDefault](defaultValue: TDefault, path: Double): T | TDefault = js.native
  @JSName("pathOr")
  def pathOr_T_LodashPathOr5x4[T](defaultValue: __, path: __): LodashPathOr5x4[T] = js.native
  @JSName("pathOr")
  def pathOr_T_LodashPathOr5x6[T](defaultValue: __, path: Double): LodashPathOr5x6[T] = js.native
  
  @JSName("path")
  var path_Original: LodashPath = js.native
  @JSName("path")
  def path_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any = js.native
  @JSName("path")
  def path_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_LodashPath5x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPath5x1[TObject, TKey1, TKey2, TKey3] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey1_StringTKey2_Any_LodashPath3x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashPath3x1[TObject, TKey1, TKey2] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("path")
  def path_TObject_Object_LodashPath1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPath1x2[TObject] = js.native
  @JSName("path")
  def path_TObject_Object_LodashPath2x2[TObject /* <: js.Object */](path: __): LodashPath2x2[TObject] = js.native
  @JSName("path")
  def path_T_LodashPath10x2[T](path: __): LodashPath10x2[T] = js.native
  @JSName("path")
  def path_T_LodashPath9x2[T](path: __, `object`: NumericDictionary[T]): LodashPath9x2[T] = js.native
  @JSName("path")
  def path_T_T[T](path: Double, `object`: NumericDictionary[T]): T = js.native
  @JSName("path")
  def path_T_Union[T](path: Double): js.UndefOr[T] = js.native
  @JSName("path")
  def path_Union(path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  
  def paths(props: PropertyPath): LodashAt1x1 = js.native
  def paths[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def paths[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T] = js.native
  def paths[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T] = js.native
  def paths[T](props: __): LodashAt1x2[T] = js.native
  def paths[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T] = js.native
  def paths[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T] = js.native
  def paths[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T] = js.native
  @JSName("paths")
  var paths_Original: LodashAt = js.native
  @JSName("paths")
  def paths_T_Array[T](props: PropertyPath): js.Array[T] = js.native
  @JSName("paths")
  def paths_T_Object_Array[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("paths")
  def paths_T_Object_LodashAt2x1[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): LodashAt2x1[T] = js.native
  @JSName("paths")
  def paths_T_Object_LodashAt2x2[T /* <: js.Object */](props: __): LodashAt2x2[T] = js.native
  
  def pick(props: PropertyPath): LodashPick2x1 = js.native
  def pick[T](props: PropertyPath, `object`: T): PartialObject[T] = js.native
  def pick[T](props: __): LodashPick2x2[T] = js.native
  def pick[T](props: __, `object`: T): LodashPick2x2[T] = js.native
  
  def pickAll(props: PropertyPath): LodashPick2x1 = js.native
  def pickAll[T](props: PropertyPath, `object`: T): PartialObject[T] = js.native
  def pickAll[T](props: __): LodashPick2x2[T] = js.native
  def pickAll[T](props: __, `object`: T): LodashPick2x2[T] = js.native
  @JSName("pickAll")
  var pickAll_Original: LodashPick = js.native
  @JSName("pickAll")
  def pickAll_T_ObjectU_String_LodashPick1x1[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U]): LodashPick1x1[T, U] = js.native
  @JSName("pickAll")
  def pickAll_T_ObjectU_String_Pick[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U], `object`: T): Pick[T, U] = js.native
  @JSName("pickAll")
  def pickAll_T_Object_LodashPick1x2[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T] = js.native
  @JSName("pickAll")
  def pickAll_T_PartialObject[T](props: PropertyPath): PartialObject[T] = js.native
  
  def pickBy[T](predicate: ValueKeyIteratee[T]): LodashPickBy3x1[T] = js.native
  def pickBy[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): PartialObject[T] = js.native
  def pickBy[T](predicate: ValueKeyIteratee[T], `object`: Dictionary[T]): Dictionary[T] = js.native
  def pickBy[T](predicate: ValueKeyIteratee[T], `object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def pickBy[T](predicate: __): LodashPickBy2x2[T] = js.native
  def pickBy[T /* <: js.Object */](predicate: __, `object`: T): LodashPickBy5x2[T] = js.native
  def pickBy[T](predicate: __, `object`: Dictionary[T]): LodashPickBy1x2[T] = js.native
  def pickBy[T](predicate: __, `object`: NumericDictionary[T]): LodashPickBy2x2[T] = js.native
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): LodashPickBy1x1[T, S] = js.native
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: Dictionary[T]): Dictionary[S] = js.native
  def pickBy[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S], `object`: NumericDictionary[T]): NumericDictionary[S] = js.native
  @JSName("pickBy")
  var pickBy_Original: LodashPickBy = js.native
  @JSName("pickBy")
  def pickBy_TS_T_Dictionary[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
  @JSName("pickBy")
  def pickBy_TS_T_NumericDictionary[T, S /* <: T */](predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
  @JSName("pickBy")
  def pickBy_T_Dictionary[T](predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  @JSName("pickBy")
  def pickBy_T_LodashPickBy1x2[T](predicate: __): LodashPickBy1x2[T] = js.native
  @JSName("pickBy")
  def pickBy_T_NumericDictionary[T](predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  @JSName("pickBy")
  def pickBy_T_Object_LodashPickBy5x2[T /* <: js.Object */](predicate: __): LodashPickBy5x2[T] = js.native
  @JSName("pickBy")
  def pickBy_T_Object_PartialObject[T /* <: js.Object */](
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  
  @JSName("pick")
  var pick_Original: LodashPick = js.native
  @JSName("pick")
  def pick_T_ObjectU_String_LodashPick1x1[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U]): LodashPick1x1[T, U] = js.native
  @JSName("pick")
  def pick_T_ObjectU_String_Pick[T /* <: js.Object */, U /* <: /* keyof T */ java.lang.String */](props: Many[U], `object`: T): Pick[T, U] = js.native
  @JSName("pick")
  def pick_T_Object_LodashPick1x2[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T] = js.native
  @JSName("pick")
  def pick_T_PartialObject[T](props: PropertyPath): PartialObject[T] = js.native
  
  def pipe(func: (Many[js.Function1[/* repeated */ _, _]])*): js.Function1[/* repeated */ js.Any, _] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2](f1: js.Function1[/* args */ A, R1], f2: js.Function1[/* a */ R1, R2]): js.Function1[/* args */ A, R2] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2, R3](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function1[/* args */ A, R3] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2, R3, R4](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function1[/* args */ A, R4] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2, R3, R4, R5](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function1[/* args */ A, R5] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function1[/* args */ A, R6] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function1[/* args */ A, R7] = js.native
  def pipe[A /* <: js.Array[_] */, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* args */ A, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    func: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function1[/* args */ A, _] = js.native
  @JSName("pipe")
  var pipe_Original: LodashFlow = js.native
  
  def placeholder(): String = js.native
  def placeholder(value: java.lang.String): String = js.native
  def placeholder[T /* <: js.Object */](value: T): Object[T] = js.native
  def placeholder[T](value: List[T]): Collection[T] = js.native
  @JSName("placeholder")
  var placeholder_Original: __ = js.native
  @JSName("placeholder")
  def placeholder_T_Collection[T](): Collection[T] = js.native
  @JSName("placeholder")
  def placeholder_T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
  @JSName("placeholder")
  def placeholder_T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
  @JSName("placeholder")
  def placeholder_T_Primitive[T](value: T): Primitive[T] = js.native
  @JSName("placeholder")
  def `placeholder_T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  @JSName("placeholder")
  def placeholder_TrapAny_TrapAny_Intersection[TrapAny /* <: typingsSlinky.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with String = js.native
  
  def pluck(iteratee: java.lang.String): LodashMap5x1 = js.native
  def pluck(iteratee: js.Object): LodashMap6x1 = js.native
  def pluck[T](iteratee: java.lang.String, collection: Dictionary[T]): js.Array[_] = js.native
  def pluck[T](iteratee: java.lang.String, collection: NumericDictionary[T]): js.Array[_] = js.native
  def pluck[T](iteratee: js.Object, collection: Dictionary[T]): js.Array[Boolean] = js.native
  def pluck[T](iteratee: js.Object, collection: NumericDictionary[T]): js.Array[Boolean] = js.native
  def pluck[T](iteratee: __): LodashMap2x2[T] = js.native
  def pluck[T /* <: js.Object */](iteratee: __, collection: T): LodashMap3x2[T] = js.native
  def pluck[T](iteratee: __, collection: js.Array[T]): LodashMap1x2[T] = js.native
  def pluck[T](iteratee: __, collection: Dictionary[T]): LodashMap4x2[T] = js.native
  def pluck[T](iteratee: __, collection: List[T]): LodashMap2x2[T] = js.native
  def pluck[T](iteratee: __, collection: NumericDictionary[T]): LodashMap4x2[T] = js.native
  def pluck[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def pluck[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: Dictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def pluck[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K, collection: NumericDictionary[T]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def pluck[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): js.Array[TResult] = js.native
  def pluck[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def pluck[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: js.Array[T]): js.Array[TResult] = js.native
  def pluck[T, TResult](iteratee: js.Function1[/* value */ T, TResult], collection: List[T]): js.Array[TResult] = js.native
  @JSName("pluck")
  var pluck_Original: LodashMap = js.native
  @JSName("pluck")
  def pluck_TK_String_LodashMap4x1[T, K /* <: /* keyof T */ java.lang.String */](iteratee: K): LodashMap4x1[T, K] = js.native
  @JSName("pluck")
  def pluck_TTResult[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): js.Array[TResult] = js.native
  @JSName("pluck")
  def pluck_TTResult_LodashMap1x1[T, TResult](iteratee: js.Function1[/* value */ T, TResult]): LodashMap1x1[T, TResult] = js.native
  @JSName("pluck")
  def pluck_T_Array[T](iteratee: java.lang.String): js.Array[_] = js.native
  @JSName("pluck")
  def pluck_T_Array[T](iteratee: js.Object): js.Array[Boolean] = js.native
  @JSName("pluck")
  def pluck_T_LodashMap1x2[T](iteratee: __): LodashMap1x2[T] = js.native
  @JSName("pluck")
  def pluck_T_LodashMap4x2[T](iteratee: __): LodashMap4x2[T] = js.native
  @JSName("pluck")
  def pluck_T_ObjectTResult_LodashMap3x1[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      TResult
    ]
  ): LodashMap3x1[T, TResult] = js.native
  @JSName("pluck")
  def pluck_T_Object_LodashMap3x2[T /* <: js.Object */](iteratee: __): LodashMap3x2[T] = js.native
  
  def prop(path: Double): LodashProp9x1 = js.native
  def prop(path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  def prop(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def prop(path: __): LodashProp11x2 = js.native
  def prop(path: __, `object`: js.Any): LodashProp12x2 = js.native
  def prop[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def prop[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProp1x2[TObject] = js.native
  def prop[T](path: __, `object`: NumericDictionary[T]): LodashProp10x2[T] = js.native
  def prop[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashProp1x1[TObject, TKey] = js.native
  def prop[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def prop[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashProp1x1[TObject, TKey] = js.native
  def prop[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashProp3x1[TObject, TKey1, TKey2] = js.native
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any = js.native
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashProp5x1[TObject, TKey1, TKey2, TKey3] = js.native
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashProp7x1[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def prop[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  
  def propEq(path: PropertyPath): LodashMatchesProperty1x1 = js.native
  def propEq[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ js.Any, Boolean] = js.native
  def propEq[T](path: __, srcValue: T): LodashMatchesProperty1x2 = js.native
  @JSName("propEq")
  var propEq_Original: LodashMatchesProperty = js.native
  
  def propOr(defaultValue: js.Any): LodashPropOr7x1 = js.native
  def propOr(defaultValue: js.Any, path: PropertyPath): LodashPropOr7x3 = js.native
  def propOr(defaultValue: js.Any, path: PropertyPath, `object`: js.Any): js.Any = js.native
  def propOr(defaultValue: js.Any, path: __, `object`: js.Any): LodashPropOr7x5 = js.native
  def propOr(defaultValue: __, path: Double): LodashPropOr5x2 = js.native
  def propOr(defaultValue: __, path: PropertyPath): LodashPropOr6x6 = js.native
  def propOr(defaultValue: __, path: PropertyPath, `object`: js.Any): LodashPropOr7x6 = js.native
  def propOr(defaultValue: __, path: __): LodashPropOr6x4 = js.native
  def propOr(defaultValue: __, path: __, `object`: js.Any): LodashPropOr7x4 = js.native
  def propOr[TDefault](defaultValue: TDefault): LodashPropOr1x1[TDefault] = js.native
  def propOr[TDefault](defaultValue: TDefault, path: Double): LodashPropOr5x3[TDefault] = js.native
  def propOr[TDefault](defaultValue: TDefault, path: PropertyPath): TDefault = js.native
  def propOr[TDefault](defaultValue: TDefault, path: __): LodashPropOr6x5[TDefault] = js.native
  def propOr[T](defaultValue: __, path: Double, `object`: NumericDictionary[T]): LodashPropOr5x6[T] = js.native
  def propOr[TObject /* <: js.Object */](defaultValue: __, path: __, `object`: TObject): LodashPropOr1x4[TObject] = js.native
  def propOr[T](defaultValue: __, path: __, `object`: NumericDictionary[T]): LodashPropOr5x4[T] = js.native
  def propOr[T, TDefault](defaultValue: TDefault, path: Double, `object`: NumericDictionary[T]): T | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __, `object`: TObject): LodashPropOr1x5[TObject, TDefault] = js.native
  def propOr[T, TDefault](defaultValue: TDefault, path: __, `object`: NumericDictionary[T]): LodashPropOr5x5[T, TDefault] = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPropOr1x6[TObject, TKey] = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey, `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPropOr1x6[TObject, TKey] = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey], `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x6[TObject, TKey1, TKey2] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2], `object`: TObject): LodashPropOr2x6[TObject, TKey1, TKey2] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x3[TObject, TKey1, TKey2, TDefault] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x2[TObject, TKey1, TKey2, TKey3] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): LodashPropOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x3[TObject, TKey1, TKey2, TKey3, TDefault] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x2[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def propOr[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("propOr")
  def propOr_LodashPropOr6x2(defaultValue: __, path: PropertyPath): LodashPropOr6x2 = js.native
  @JSName("propOr")
  var propOr_Original: LodashPropOr = js.native
  @JSName("propOr")
  def propOr_TDefault_LodashPropOr6x3[TDefault](defaultValue: TDefault, path: PropertyPath): LodashPropOr6x3[TDefault] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTDefault_LodashPropOr1x5[TObject /* <: js.Object */, TDefault](defaultValue: TDefault, path: __): LodashPropOr1x5[TObject, TDefault] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey1_StringTKey2_AnyTDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple2[TKey1, TKey2]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTDefault_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple3[TKey1, TKey2, TKey3]): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_AnyTDefault_LodashPropOr4x3[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](defaultValue: TDefault, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x3[TObject, TKey1, TKey2, TKey3, TKey4, TDefault] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_LodashPropOr4x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](defaultValue: __, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropOr4x6[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_LodashPropOr3x6[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](defaultValue: __, path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropOr3x6[TObject, TKey1, TKey2, TKey3] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey1_StringTKey2_Any_LodashPropOr2x2[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](defaultValue: __, path: js.Tuple2[TKey1, TKey2]): LodashPropOr2x2[TObject, TKey1, TKey2] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey_StringTDefault_LodashPropOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: TKey): LodashPropOr1x3[TObject, TKey, TDefault] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey_StringTDefault_LodashPropOr1x3[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */, TDefault](defaultValue: TDefault, path: js.Array[TKey]): LodashPropOr1x3[TObject, TKey, TDefault] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey_String_LodashPropOr1x2[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: TKey): LodashPropOr1x2[TObject, TKey] = js.native
  @JSName("propOr")
  def propOr_TObject_ObjectTKey_String_LodashPropOr1x2[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](defaultValue: __, path: js.Array[TKey]): LodashPropOr1x2[TObject, TKey] = js.native
  @JSName("propOr")
  def propOr_TObject_Object_LodashPropOr1x4[TObject /* <: js.Object */](defaultValue: __, path: __): LodashPropOr1x4[TObject] = js.native
  @JSName("propOr")
  def propOr_TTDefault_LodashPropOr5x5[T, TDefault](defaultValue: TDefault, path: __): LodashPropOr5x5[T, TDefault] = js.native
  @JSName("propOr")
  def propOr_TTDefault_Union[T, TDefault](defaultValue: TDefault, path: Double): T | TDefault = js.native
  @JSName("propOr")
  def propOr_T_LodashPropOr5x4[T](defaultValue: __, path: __): LodashPropOr5x4[T] = js.native
  @JSName("propOr")
  def propOr_T_LodashPropOr5x6[T](defaultValue: __, path: Double): LodashPropOr5x6[T] = js.native
  
  @JSName("prop")
  def prop_LodashProp11x1(path: PropertyPath): LodashProp11x1 = js.native
  @JSName("prop")
  var prop_Original: LodashProp = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("prop")
  def prop_TObject_Object_LodashProp2x2[TObject /* <: js.Object */](path: __): LodashProp2x2[TObject] = js.native
  @JSName("prop")
  def prop_TObject_Object_LodashProp2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProp2x2[TObject] = js.native
  @JSName("prop")
  def prop_T_LodashProp10x2[T](path: __): LodashProp10x2[T] = js.native
  @JSName("prop")
  def prop_T_LodashProp9x2[T](path: __, `object`: NumericDictionary[T]): LodashProp9x2[T] = js.native
  @JSName("prop")
  def prop_T_T[T](path: Double, `object`: NumericDictionary[T]): T = js.native
  @JSName("prop")
  def prop_T_Union[T](path: Double): js.UndefOr[T] = js.native
  
  def property(path: Double): LodashProperty9x1 = js.native
  def property(path: PropertyPath): LodashProperty11x1 = js.native
  def property(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def property(path: __): LodashProperty11x2 = js.native
  def property(path: __, `object`: js.Any): LodashProperty12x2 = js.native
  def property[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def property[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProperty2x2[TObject] = js.native
  def property[T](path: __, `object`: NumericDictionary[T]): LodashProperty10x2[T] = js.native
  def property[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def property[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def property[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def property[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashProperty3x1[TObject, TKey1, TKey2] = js.native
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any = js.native
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashProperty5x1[TObject, TKey1, TKey2, TKey3] = js.native
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashProperty7x1[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def property[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  
  def propertyOf(path: Double): LodashPropertyOf9x1 = js.native
  def propertyOf(path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  def propertyOf(path: PropertyPath, `object`: js.Any): js.Any = js.native
  def propertyOf(path: __): LodashPropertyOf11x2 = js.native
  def propertyOf(path: __, `object`: js.Any): LodashPropertyOf12x2 = js.native
  def propertyOf[T](path: Double, `object`: NumericDictionary[T]): js.UndefOr[T] = js.native
  def propertyOf[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPropertyOf1x2[TObject] = js.native
  def propertyOf[T](path: __, `object`: NumericDictionary[T]): LodashPropertyOf10x2[T] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def propertyOf[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): LodashPropertyOf3x1[TObject, TKey1, TKey2] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any = js.native
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): LodashPropertyOf7x1[TObject, TKey1, TKey2, TKey3, TKey4] = js.native
  def propertyOf[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any = js.native
  @JSName("propertyOf")
  def propertyOf_LodashPropertyOf11x1(path: PropertyPath): LodashPropertyOf11x1 = js.native
  @JSName("propertyOf")
  var propertyOf_Original: LodashPropertyOf = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_LodashPropertyOf5x1[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): LodashPropertyOf5x1[TObject, TKey1, TKey2, TKey3] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey_String_LodashPropertyOf1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashPropertyOf1x1[TObject, TKey] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey_String_LodashPropertyOf1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashPropertyOf1x1[TObject, TKey] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_Object_LodashPropertyOf2x2[TObject /* <: js.Object */](path: __): LodashPropertyOf2x2[TObject] = js.native
  @JSName("propertyOf")
  def propertyOf_TObject_Object_LodashPropertyOf2x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashPropertyOf2x2[TObject] = js.native
  @JSName("propertyOf")
  def propertyOf_T_LodashPropertyOf10x2[T](path: __): LodashPropertyOf10x2[T] = js.native
  @JSName("propertyOf")
  def propertyOf_T_LodashPropertyOf9x2[T](path: __, `object`: NumericDictionary[T]): LodashPropertyOf9x2[T] = js.native
  @JSName("propertyOf")
  def propertyOf_T_T[T](path: Double, `object`: NumericDictionary[T]): T = js.native
  @JSName("propertyOf")
  def propertyOf_T_Union[T](path: Double): js.UndefOr[T] = js.native
  
  @JSName("property")
  var property_Original: LodashProperty = js.native
  @JSName("property")
  def property_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey1_StringTKey2_AnyTKey3_AnyTKey4_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Any[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3], `object`: TObject): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any = js.native
  @JSName("property")
  def property_TObject_ObjectTKey1_StringTKey2_AnyTKey3_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey1_StringTKey2_Any_Union[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ java.lang.String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](path: js.Tuple2[TKey1, TKey2], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey_String_LodashProperty1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey): LodashProperty1x1[TObject, TKey] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey_String_LodashProperty1x1[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey]): LodashProperty1x1[TObject, TKey] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: TKey, `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ java.lang.String */](path: js.Array[TKey], `object`: TObject): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("property")
  def property_TObject_Object_LodashProperty1x2[TObject /* <: js.Object */](path: __, `object`: TObject): LodashProperty1x2[TObject] = js.native
  @JSName("property")
  def property_TObject_Object_LodashProperty2x2[TObject /* <: js.Object */](path: __): LodashProperty2x2[TObject] = js.native
  @JSName("property")
  def property_T_LodashProperty10x2[T](path: __): LodashProperty10x2[T] = js.native
  @JSName("property")
  def property_T_LodashProperty9x2[T](path: __, `object`: NumericDictionary[T]): LodashProperty9x2[T] = js.native
  @JSName("property")
  def property_T_T[T](path: Double, `object`: NumericDictionary[T]): T = js.native
  @JSName("property")
  def property_T_Union[T](path: Double): js.UndefOr[T] = js.native
  @JSName("property")
  def property_Union(path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  
  def props(props: PropertyPath): LodashAt1x1 = js.native
  def props[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def props[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T] = js.native
  def props[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T] = js.native
  def props[T](props: __): LodashAt1x2[T] = js.native
  def props[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T] = js.native
  def props[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T] = js.native
  def props[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T] = js.native
  @JSName("props")
  var props_Original: LodashAt = js.native
  @JSName("props")
  def props_T_Array[T](props: PropertyPath): js.Array[T] = js.native
  @JSName("props")
  def props_T_Object_Array[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("props")
  def props_T_Object_LodashAt2x1[T /* <: js.Object */](props: Many[/* keyof T */ java.lang.String]): LodashAt2x1[T] = js.native
  @JSName("props")
  def props_T_Object_LodashAt2x2[T /* <: js.Object */](props: __): LodashAt2x2[T] = js.native
  
  def pull[T](values: T): LodashPull1x1[T] = js.native
  def pull[T](values: T, array: js.Array[T]): js.Array[T] = js.native
  def pull[T](values: T, array: List[T]): List[T] = js.native
  def pull[T](values: __, array: js.Array[T]): LodashPull1x2[T] = js.native
  def pull[T](values: __, array: List[T]): LodashPull2x2[T] = js.native
  
  def pullAll[T](values: List[T]): LodashPullAll1x1[T] = js.native
  def pullAll[T](values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def pullAll[T](values: List[T], array: List[T]): List[T] = js.native
  def pullAll[T](values: __, array: js.Array[T]): LodashPullAll1x2[T] = js.native
  def pullAll[T](values: __, array: List[T]): LodashPullAll2x2[T] = js.native
  
  def pullAllBy[T](iteratee: ValueIteratee[T]): LodashPullAllBy1x1[T] = js.native
  def pullAllBy[T](iteratee: ValueIteratee[T], values: List[T]): LodashPullAllBy1x3[T] = js.native
  def pullAllBy[T](iteratee: ValueIteratee[T], values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def pullAllBy[T](iteratee: ValueIteratee[T], values: List[T], array: List[T]): List[T] = js.native
  def pullAllBy[T](iteratee: ValueIteratee[T], values: __, array: js.Array[T]): LodashPullAllBy1x5[T] = js.native
  def pullAllBy[T](iteratee: ValueIteratee[T], values: __, array: List[T]): LodashPullAllBy2x5[T] = js.native
  def pullAllBy[T](iteratee: __, values: List[T]): LodashPullAllBy1x2[T] = js.native
  def pullAllBy[T](iteratee: __, values: List[T], array: js.Array[T]): LodashPullAllBy1x6[T] = js.native
  def pullAllBy[T](iteratee: __, values: List[T], array: List[T]): LodashPullAllBy2x6[T] = js.native
  def pullAllBy[T1](iteratee: __, values: __, array: js.Array[T1]): LodashPullAllBy3x4[T1] = js.native
  def pullAllBy[T1](iteratee: __, values: __, array: List[T1]): LodashPullAllBy4x4[T1] = js.native
  @JSName("pullAllBy")
  var pullAllBy_Original: LodashPullAllBy = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](iteratee: ValueIteratee[T1 | T2], values: List[T2], array: js.Array[T1]): js.Array[T1] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](iteratee: ValueIteratee[T1 | T2], values: List[T2], array: List[T1]): List[T1] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x1[T1, T2](iteratee: ValueIteratee[T1 | T2]): LodashPullAllBy3x1[T1, T2] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x3[T1, T2](iteratee: ValueIteratee[T1 | T2], values: List[T2]): LodashPullAllBy3x3[T1] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x5[T1, T2](iteratee: ValueIteratee[T1 | T2], values: __, array: js.Array[T1]): LodashPullAllBy3x5[T1, T2] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy3x6[T1, T2](iteratee: __, values: List[T2], array: js.Array[T1]): LodashPullAllBy3x6[T1, T2] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy4x5[T1, T2](iteratee: ValueIteratee[T1 | T2], values: __, array: List[T1]): LodashPullAllBy4x5[T1, T2] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T1T2_LodashPullAllBy4x6[T1, T2](iteratee: __, values: List[T2], array: List[T1]): LodashPullAllBy4x6[T1, T2] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T2_LodashPullAllBy3x2[T2](iteratee: __, values: List[T2]): LodashPullAllBy3x2[T2] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T_LodashPullAllBy1x4[T](iteratee: __, values: __, array: js.Array[T]): LodashPullAllBy1x4[T] = js.native
  @JSName("pullAllBy")
  def pullAllBy_T_LodashPullAllBy2x4[T](iteratee: __, values: __, array: List[T]): LodashPullAllBy2x4[T] = js.native
  
  def pullAllWith[T](comparator: Comparator[T]): LodashPullAllWith1x1[T] = js.native
  def pullAllWith[T](comparator: Comparator[T], values: List[T]): LodashPullAllWith1x3[T] = js.native
  def pullAllWith[T](comparator: Comparator[T], values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def pullAllWith[T](comparator: Comparator[T], values: List[T], array: List[T]): List[T] = js.native
  def pullAllWith[T](comparator: Comparator[T], values: __, array: js.Array[T]): LodashPullAllWith1x5[T] = js.native
  def pullAllWith[T](comparator: Comparator[T], values: __, array: List[T]): LodashPullAllWith2x5[T] = js.native
  def pullAllWith[T](comparator: __, values: List[T]): LodashPullAllWith1x2[T] = js.native
  def pullAllWith[T](comparator: __, values: List[T], array: js.Array[T]): LodashPullAllWith1x6[T] = js.native
  def pullAllWith[T](comparator: __, values: List[T], array: List[T]): LodashPullAllWith2x6[T] = js.native
  def pullAllWith[T](comparator: __, values: __, array: js.Array[T]): LodashPullAllWith1x4[T] = js.native
  def pullAllWith[T](comparator: __, values: __, array: List[T]): LodashPullAllWith2x4[T] = js.native
  @JSName("pullAllWith")
  var pullAllWith_Original: LodashPullAllWith = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](comparator: Comparator2[T1, T2], values: List[T2], array: js.Array[T1]): js.Array[T1] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](comparator: Comparator2[T1, T2], values: List[T2], array: List[T1]): List[T1] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x1[T1, T2](comparator: Comparator2[T1, T2]): LodashPullAllWith3x1[T1, T2] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x3[T1, T2](comparator: Comparator2[T1, T2], values: List[T2]): LodashPullAllWith3x3[T1] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x5[T1, T2](comparator: Comparator2[T1, T2], values: __, array: js.Array[T1]): LodashPullAllWith3x5[T1, T2] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith3x6[T1, T2](comparator: __, values: List[T2], array: js.Array[T1]): LodashPullAllWith3x6[T1, T2] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith4x5[T1, T2](comparator: Comparator2[T1, T2], values: __, array: List[T1]): LodashPullAllWith4x5[T1, T2] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1T2_LodashPullAllWith4x6[T1, T2](comparator: __, values: List[T2], array: List[T1]): LodashPullAllWith4x6[T1, T2] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1_LodashPullAllWith3x4[T1](comparator: __, values: __, array: js.Array[T1]): LodashPullAllWith3x4[T1] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T1_LodashPullAllWith4x4[T1](comparator: __, values: __, array: List[T1]): LodashPullAllWith4x4[T1] = js.native
  @JSName("pullAllWith")
  def pullAllWith_T2_LodashPullAllWith3x2[T2](comparator: __, values: List[T2]): LodashPullAllWith3x2[T2] = js.native
  
  @JSName("pullAll")
  var pullAll_Original: LodashPullAll = js.native
  
  def pullAt(indexes: Many[Double]): LodashPullAt1x1 = js.native
  def pullAt[T](indexes: Many[Double], array: js.Array[T]): js.Array[T] = js.native
  def pullAt[T](indexes: Many[Double], array: List[T]): List[T] = js.native
  def pullAt[T](indexes: __, array: js.Array[T]): LodashPullAt1x2[T] = js.native
  def pullAt[T](indexes: __, array: List[T]): LodashPullAt2x2[T] = js.native
  @JSName("pullAt")
  var pullAt_Original: LodashPullAt = js.native
  
  @JSName("pull")
  var pull_Original: LodashPull = js.native
  
  def random(maxOrMin: Double): LodashRandom1x1 = js.native
  def random(maxOrMin: Double, floatingOrMax: Boolean): Double = js.native
  def random(maxOrMin: Double, floatingOrMax: Double): Double = js.native
  def random(max: __, floating: Boolean): LodashRandom1x2 = js.native
  def random(min: __, max: Double): LodashRandom2x2 = js.native
  @JSName("random")
  var random_Original: LodashRandom = js.native
  
  def range(start: Double): LodashRange1x1 = js.native
  def range(start: Double, end: Double): js.Array[Double] = js.native
  def range(start: __, end: Double): LodashRange1x2 = js.native
  
  def rangeRight(start: Double): LodashRangeRight1x1 = js.native
  def rangeRight(start: Double, end: Double): js.Array[Double] = js.native
  def rangeRight(start: __, end: Double): LodashRangeRight1x2 = js.native
  @JSName("rangeRight")
  var rangeRight_Original: LodashRangeRight = js.native
  
  def rangeStep(start: Double): LodashRangeStep1x1 = js.native
  def rangeStep(start: Double, end: Double): LodashRangeStep1x3 = js.native
  def rangeStep(start: Double, end: Double, step: Double): js.Array[Double] = js.native
  def rangeStep(start: Double, end: __, step: Double): LodashRangeStep1x5 = js.native
  def rangeStep(start: __, end: Double): LodashRangeStep1x2 = js.native
  def rangeStep(start: __, end: Double, step: Double): LodashRangeStep1x6 = js.native
  def rangeStep(start: __, end: __, step: Double): LodashRangeStep1x4 = js.native
  
  def rangeStepRight(start: Double): LodashRangeStepRight1x1 = js.native
  def rangeStepRight(start: Double, end: Double): LodashRangeStepRight1x3 = js.native
  def rangeStepRight(start: Double, end: Double, step: Double): js.Array[Double] = js.native
  def rangeStepRight(start: Double, end: __, step: Double): LodashRangeStepRight1x5 = js.native
  def rangeStepRight(start: __, end: Double): LodashRangeStepRight1x2 = js.native
  def rangeStepRight(start: __, end: Double, step: Double): LodashRangeStepRight1x6 = js.native
  def rangeStepRight(start: __, end: __, step: Double): LodashRangeStepRight1x4 = js.native
  @JSName("rangeStepRight")
  var rangeStepRight_Original: LodashRangeStepRight = js.native
  
  @JSName("rangeStep")
  var rangeStep_Original: LodashRangeStep = js.native
  
  @JSName("range")
  var range_Original: LodashRange = js.native
  
  def rearg(indexes: Many[Double]): LodashRearg1x1 = js.native
  def rearg(indexes: Many[Double], func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def rearg(indexes: __, func: js.Function1[/* repeated */ js.Any, _]): LodashRearg1x2 = js.native
  @JSName("rearg")
  var rearg_Original: LodashRearg = js.native
  
  def reduce[TResult](callback: __, accumulator: TResult): LodashReduce1x2[TResult] = js.native
  def reduce[T](callback: __, accumulator: __): LodashReduce1x4[T] = js.native
  def reduce[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduce3x4[T] = js.native
  def reduce[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduce1x4[T] = js.native
  def reduce[T](callback: __, accumulator: __, collection: List[T]): LodashReduce2x4[T] = js.native
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x1[T, TResult] = js.native
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): LodashReduce1x3[T, TResult] = js.native
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult, collection: List[T]): TResult = js.native
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __
  ): LodashReduce3x5[TResult] = js.native
  def reduce[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduce3x5[TResult] = js.native
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduce1x5[TResult] = js.native
  def reduce[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __, collection: List[T]): LodashReduce2x5[TResult] = js.native
  def reduce[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduce3x6[T, TResult] = js.native
  def reduce[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduce1x6[T, TResult] = js.native
  def reduce[T, TResult](callback: __, accumulator: TResult, collection: List[T]): LodashReduce2x6[T, TResult] = js.native
  
  def reduceRight[TResult](callback: __, accumulator: TResult): LodashReduceRight1x2[TResult] = js.native
  def reduceRight[T](callback: __, accumulator: __): LodashReduceRight2x4[T] = js.native
  def reduceRight[T /* <: js.Object */](callback: __, accumulator: __, collection: T): LodashReduceRight3x4[T] = js.native
  def reduceRight[T](callback: __, accumulator: __, collection: js.Array[T]): LodashReduceRight1x4[T] = js.native
  def reduceRight[T](callback: __, accumulator: __, collection: List[T]): LodashReduceRight2x4[T] = js.native
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult]): LodashReduceRight1x1[T, TResult] = js.native
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): LodashReduceRight3x3[T, TResult] = js.native
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult,
    collection: T
  ): TResult = js.native
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult, collection: js.Array[T]): TResult = js.native
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult, collection: List[T]): TResult = js.native
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __): LodashReduceRight1x5[TResult] = js.native
  def reduceRight[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __,
    collection: T
  ): LodashReduceRight3x5[TResult] = js.native
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __, collection: js.Array[T]): LodashReduceRight1x5[TResult] = js.native
  def reduceRight[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __, collection: List[T]): LodashReduceRight2x5[TResult] = js.native
  def reduceRight[T /* <: js.Object */, TResult](callback: __, accumulator: TResult, collection: T): LodashReduceRight3x6[T, TResult] = js.native
  def reduceRight[T, TResult](callback: __, accumulator: TResult, collection: js.Array[T]): LodashReduceRight1x6[T, TResult] = js.native
  def reduceRight[T, TResult](callback: __, accumulator: TResult, collection: List[T]): LodashReduceRight2x6[T, TResult] = js.native
  @JSName("reduceRight")
  var reduceRight_Original: LodashReduceRight = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight1x3[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult): LodashReduceRight1x3[T, TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight1x6[T, TResult](callback: __, accumulator: TResult): LodashReduceRight1x6[T, TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight2x5[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: __): LodashReduceRight2x5[TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult_LodashReduceRight2x6[T, TResult](callback: __, accumulator: TResult): LodashReduceRight2x6[T, TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_TTResult_TResult[T, TResult](callback: MemoIteratorCappedRight[T, TResult], accumulator: TResult): TResult = js.native
  @JSName("reduceRight")
  def reduceRight_T_LodashReduceRight1x4[T](callback: __, accumulator: __): LodashReduceRight1x4[T] = js.native
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult_LodashReduceRight3x1[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduceRight3x1[T, TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult_LodashReduceRight3x5[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: __
  ): LodashReduceRight3x5[TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult_LodashReduceRight3x6[T /* <: js.Object */, TResult](callback: __, accumulator: TResult): LodashReduceRight3x6[T, TResult] = js.native
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult_TResult[T /* <: js.Object */, TResult](
    callback: MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): TResult = js.native
  @JSName("reduceRight")
  def reduceRight_T_Object_LodashReduceRight3x4[T /* <: js.Object */](callback: __, accumulator: __): LodashReduceRight3x4[T] = js.native
  
  @JSName("reduce")
  var reduce_Original: LodashReduce = js.native
  @JSName("reduce")
  def reduce_TTResult_LodashReduce1x5[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __): LodashReduce1x5[TResult] = js.native
  @JSName("reduce")
  def reduce_TTResult_LodashReduce1x6[T, TResult](callback: __, accumulator: TResult): LodashReduce1x6[T, TResult] = js.native
  @JSName("reduce")
  def reduce_TTResult_LodashReduce2x5[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: __): LodashReduce2x5[TResult] = js.native
  @JSName("reduce")
  def reduce_TTResult_LodashReduce2x6[T, TResult](callback: __, accumulator: TResult): LodashReduce2x6[T, TResult] = js.native
  @JSName("reduce")
  def reduce_TTResult_TResult[T, TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  @JSName("reduce")
  def reduce_T_LodashReduce2x4[T](callback: __, accumulator: __): LodashReduce2x4[T] = js.native
  @JSName("reduce")
  def reduce_T_ObjectTResult_LodashReduce3x1[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ]
  ): LodashReduce3x1[T, TResult] = js.native
  @JSName("reduce")
  def reduce_T_ObjectTResult_LodashReduce3x3[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): LodashReduce3x3[T, TResult] = js.native
  @JSName("reduce")
  def reduce_T_ObjectTResult_LodashReduce3x6[T /* <: js.Object */, TResult](callback: __, accumulator: TResult): LodashReduce3x6[T, TResult] = js.native
  @JSName("reduce")
  def reduce_T_ObjectTResult_TResult[T /* <: js.Object */, TResult](
    callback: MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ],
    accumulator: TResult
  ): TResult = js.native
  @JSName("reduce")
  def reduce_T_Object_LodashReduce3x4[T /* <: js.Object */](callback: __, accumulator: __): LodashReduce3x4[T] = js.native
  
  def reject[T](predicate: ValueIterateeCustom[T, Boolean]): LodashReject1x1[T] = js.native
  def reject[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): js.Array[T] = js.native
  def reject[T /* <: js.Object */](predicate: __): LodashReject2x2[T] = js.native
  def reject[T /* <: js.Object */](predicate: __, collection: T): LodashReject2x2[T] = js.native
  def reject[T](predicate: __, collection: List[T]): LodashReject1x2[T] = js.native
  @JSName("reject")
  var reject_Original: LodashReject = js.native
  @JSName("reject")
  def reject_T_Array[T](predicate: ValueIterateeCustom[T, Boolean]): js.Array[T] = js.native
  @JSName("reject")
  def reject_T_LodashReject1x2[T](predicate: __): LodashReject1x2[T] = js.native
  @JSName("reject")
  def reject_T_Object_Array[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  def remove[T](predicate: ValueIteratee[T]): LodashRemove1x1[T] = js.native
  def remove[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def remove[T](predicate: __, array: List[T]): LodashRemove1x2[T] = js.native
  @JSName("remove")
  var remove_Original: LodashRemove = js.native
  
  def repeat(n: Double): LodashRepeat1x1 = js.native
  def repeat(n: Double, string: java.lang.String): java.lang.String = js.native
  def repeat(n: __, string: java.lang.String): LodashRepeat1x2 = js.native
  @JSName("repeat")
  var repeat_Original: LodashRepeat = js.native
  
  def replace(pattern: java.lang.String): LodashReplace1x1 = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String): LodashReplace1x3 = js.native
  def replace(pattern: java.lang.String, replacement: java.lang.String, string: java.lang.String): java.lang.String = js.native
  def replace(pattern: java.lang.String, replacement: ReplaceFunction): LodashReplace1x3 = js.native
  def replace(pattern: java.lang.String, replacement: ReplaceFunction, string: java.lang.String): java.lang.String = js.native
  def replace(pattern: java.lang.String, replacement: __, string: java.lang.String): LodashReplace1x5 = js.native
  def replace(pattern: __, replacement: java.lang.String): LodashReplace1x2 = js.native
  def replace(pattern: __, replacement: java.lang.String, string: java.lang.String): LodashReplace1x6 = js.native
  def replace(pattern: __, replacement: ReplaceFunction): LodashReplace1x2 = js.native
  def replace(pattern: __, replacement: ReplaceFunction, string: java.lang.String): LodashReplace1x6 = js.native
  def replace(pattern: __, replacement: __, string: java.lang.String): LodashReplace1x4 = js.native
  def replace(pattern: js.RegExp): LodashReplace1x1 = js.native
  def replace(pattern: js.RegExp, replacement: java.lang.String): LodashReplace1x3 = js.native
  def replace(pattern: js.RegExp, replacement: java.lang.String, string: java.lang.String): java.lang.String = js.native
  def replace(pattern: js.RegExp, replacement: ReplaceFunction): LodashReplace1x3 = js.native
  def replace(pattern: js.RegExp, replacement: ReplaceFunction, string: java.lang.String): java.lang.String = js.native
  def replace(pattern: js.RegExp, replacement: __, string: java.lang.String): LodashReplace1x5 = js.native
  @JSName("replace")
  var replace_Original: LodashReplace = js.native
  
  def rest(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  
  def restFrom(start: Double): LodashRestFrom1x1 = js.native
  def restFrom(start: Double, func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def restFrom(start: __, func: js.Function1[/* repeated */ js.Any, _]): LodashRestFrom1x2 = js.native
  @JSName("restFrom")
  var restFrom_Original: LodashRestFrom = js.native
  
  @JSName("rest")
  var rest_Original: LodashRest = js.native
  
  def result(path: PropertyPath): LodashResult1x1 = js.native
  def result(path: __, `object`: js.Any): LodashResult1x2 = js.native
  def result[TResult](path: PropertyPath, `object`: js.Any): TResult = js.native
  @JSName("result")
  var result_Original: LodashResult = js.native
  
  def reverse[TList /* <: List[_] */](array: TList): TList = js.native
  @JSName("reverse")
  var reverse_Original: LodashReverse = js.native
  
  def round(n: Double): Double = js.native
  @JSName("round")
  var round_Original: LodashRound = js.native
  
  def runInContext(context: js.Object): LoDashStatic = js.native
  @JSName("runInContext")
  var runInContext_Original: LodashRunInContext = js.native
  
  def sample[T](): js.UndefOr[T] = js.native
  def sample[T /* <: js.Object */](collection: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sample[T](collection: Dictionary[T]): js.UndefOr[T] = js.native
  def sample[T](collection: NumericDictionary[T]): js.UndefOr[T] = js.native
  
  def sampleSize(n: Double): LodashSampleSize1x1 = js.native
  def sampleSize[T /* <: js.Object */](n: Double, collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize[T](n: Double, collection: Dictionary[T]): js.Array[T] = js.native
  def sampleSize[T](n: Double, collection: NumericDictionary[T]): js.Array[T] = js.native
  def sampleSize[T](n: __): LodashSampleSize1x2[T] = js.native
  def sampleSize[T /* <: js.Object */](n: __, collection: T): LodashSampleSize2x2[T] = js.native
  def sampleSize[T](n: __, collection: Dictionary[T]): LodashSampleSize1x2[T] = js.native
  def sampleSize[T](n: __, collection: NumericDictionary[T]): LodashSampleSize1x2[T] = js.native
  @JSName("sampleSize")
  var sampleSize_Original: LodashSampleSize = js.native
  @JSName("sampleSize")
  def sampleSize_T_Array[T](n: Double): js.Array[T] = js.native
  @JSName("sampleSize")
  def sampleSize_T_Object_Array[T /* <: js.Object */](n: Double): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("sampleSize")
  def sampleSize_T_Object_LodashSampleSize2x2[T /* <: js.Object */](n: __): LodashSampleSize2x2[T] = js.native
  
  @JSName("sample")
  var sample_Original: LodashSample = js.native
  @JSName("sample")
  def sample_T_Object[T /* <: js.Object */](): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  def set(path: PropertyPath): LodashSet1x1 = js.native
  def set(path: PropertyPath, value: js.Any): LodashSet1x3 = js.native
  def set(path: PropertyPath, value: __, `object`: js.Object): LodashSet2x5 = js.native
  def set(path: __, value: js.Any): LodashSet1x2 = js.native
  def set(path: __, value: js.Any, `object`: js.Object): LodashSet2x6 = js.native
  def set(path: __, value: __, `object`: js.Object): LodashSet2x4 = js.native
  def set[T /* <: js.Object */](path: PropertyPath, value: js.Any, `object`: T): T = js.native
  def set[TResult](path: PropertyPath, value: js.Any, `object`: js.Object): TResult = js.native
  def set[T /* <: js.Object */](path: PropertyPath, value: __, `object`: T): LodashSet1x5[T] = js.native
  def set[T /* <: js.Object */](path: __, value: js.Any, `object`: T): LodashSet1x6[T] = js.native
  def set[T /* <: js.Object */](path: __, value: __, `object`: T): LodashSet1x4[T] = js.native
  
  def setWith(customizer: __, path: PropertyPath): LodashSetWith1x2 = js.native
  def setWith(customizer: __, path: PropertyPath, value: js.Any): LodashSetWith1x6 = js.native
  def setWith(customizer: __, path: __, value: js.Any): LodashSetWith1x4 = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashSetWith1x1[T] = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashSetWith1x3[T] = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: js.Any): LodashSetWith1x7[T] = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: js.Any, `object`: T): T = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, value: __, `object`: T): LodashSetWith1x11[T] = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: js.Any): LodashSetWith1x5[T] = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: js.Any, `object`: T): LodashSetWith1x13[T] = js.native
  def setWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, value: __, `object`: T): LodashSetWith1x9[T] = js.native
  def setWith[T /* <: js.Object */](customizer: __, path: PropertyPath, value: js.Any, `object`: T): LodashSetWith1x14[T] = js.native
  def setWith[T /* <: js.Object */](customizer: __, path: PropertyPath, value: __, `object`: T): LodashSetWith1x10[T] = js.native
  def setWith[T /* <: js.Object */](customizer: __, path: __, value: js.Any, `object`: T): LodashSetWith1x12[T] = js.native
  def setWith[T /* <: js.Object */](customizer: __, path: __, value: __, `object`: T): LodashSetWith1x8[T] = js.native
  @JSName("setWith")
  var setWith_Original: LodashSetWith = js.native
  
  @JSName("set")
  var set_Original: LodashSet = js.native
  
  def shuffle[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def shuffle[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def shuffle[T](collection: List[T]): js.Array[T] = js.native
  @JSName("shuffle")
  var shuffle_Original: LodashShuffle = js.native
  @JSName("shuffle")
  def shuffle_T[T](): js.Array[T] = js.native
  
  def size(): Double = js.native
  def size(collection: java.lang.String): Double = js.native
  def size(collection: js.Object): Double = js.native
  @JSName("size")
  var size_Original: LodashSize = js.native
  
  def slice(start: Double): LodashSlice1x1 = js.native
  def slice(start: Double, end: Double): LodashSlice1x3 = js.native
  def slice(start: __, end: Double): LodashSlice1x2 = js.native
  def slice[T](start: Double, end: Double, array: List[T]): js.Array[T] = js.native
  def slice[T](start: Double, end: __): LodashSlice1x5[T] = js.native
  def slice[T](start: Double, end: __, array: List[T]): LodashSlice1x5[T] = js.native
  def slice[T](start: __, end: Double, array: List[T]): LodashSlice1x6[T] = js.native
  def slice[T](start: __, end: __): LodashSlice1x4[T] = js.native
  def slice[T](start: __, end: __, array: List[T]): LodashSlice1x4[T] = js.native
  @JSName("slice")
  var slice_Original: LodashSlice = js.native
  @JSName("slice")
  def slice_T_Array[T](start: Double, end: Double): js.Array[T] = js.native
  @JSName("slice")
  def slice_T_LodashSlice1x6[T](start: __, end: Double): LodashSlice1x6[T] = js.native
  
  def snakeCase(string: java.lang.String): java.lang.String = js.native
  @JSName("snakeCase")
  var snakeCase_Original: LodashSnakeCase = js.native
  
  def some[T](predicate: ValueIterateeCustom[T, Boolean]): Boolean = js.native
  def some[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ],
    collection: T
  ): Boolean = js.native
  def some[T](predicate: ValueIterateeCustom[T, Boolean], collection: List[T]): Boolean = js.native
  def some[T](predicate: __): LodashSome1x2[T] = js.native
  def some[T /* <: js.Object */](predicate: __, collection: T): LodashSome2x2[T] = js.native
  def some[T](predicate: __, collection: List[T]): LodashSome1x2[T] = js.native
  @JSName("some")
  var some_Original: LodashSome = js.native
  @JSName("some")
  def some_T_LodashSome1x1[T](predicate: ValueIterateeCustom[T, Boolean]): LodashSome1x1[T] = js.native
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](
    predicate: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ]
  ): Boolean = js.native
  @JSName("some")
  def some_T_Object_LodashSome2x2[T /* <: js.Object */](predicate: __): LodashSome2x2[T] = js.native
  
  def sortBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sortBy[T /* <: js.Object */](
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ],
    collection: T
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sortBy[T](iteratees: Many[ValueIteratee[T]], collection: List[T]): js.Array[T] = js.native
  def sortBy[T](iteratees: __): LodashSortBy1x2[T] = js.native
  def sortBy[T /* <: js.Object */](iteratees: __, collection: T): LodashSortBy2x2[T] = js.native
  def sortBy[T](iteratees: __, collection: List[T]): LodashSortBy1x2[T] = js.native
  @JSName("sortBy")
  var sortBy_Original: LodashSortBy = js.native
  @JSName("sortBy")
  def sortBy_T[T](iteratees: Many[ValueIteratee[T]]): js.Array[T] = js.native
  @JSName("sortBy")
  def sortBy_T_LodashSortBy1x1[T](iteratees: Many[ValueIteratee[T]]): LodashSortBy1x1[T] = js.native
  @JSName("sortBy")
  def sortBy_T_Object_LodashSortBy2x2[T /* <: js.Object */](iteratees: __): LodashSortBy2x2[T] = js.native
  
  def sortedIndex[T](value: T): LodashSortedIndex1x1[T] = js.native
  def sortedIndex[T](value: T, array: List[T]): Double = js.native
  def sortedIndex[T](value: __): LodashSortedIndex1x2[T] = js.native
  def sortedIndex[T](value: __, array: List[T]): LodashSortedIndex1x2[T] = js.native
  
  def sortedIndexBy[T](iteratee: ValueIteratee[T]): LodashSortedIndexBy1x1[T] = js.native
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: T): Double = js.native
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: T, array: List[T]): Double = js.native
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: __): LodashSortedIndexBy1x5[T] = js.native
  def sortedIndexBy[T](iteratee: ValueIteratee[T], value: __, array: List[T]): LodashSortedIndexBy1x5[T] = js.native
  def sortedIndexBy[T](iteratee: __, value: T): LodashSortedIndexBy1x2[T] = js.native
  def sortedIndexBy[T](iteratee: __, value: T, array: List[T]): LodashSortedIndexBy1x6[T] = js.native
  def sortedIndexBy[T](iteratee: __, value: __): LodashSortedIndexBy1x4[T] = js.native
  def sortedIndexBy[T](iteratee: __, value: __, array: List[T]): LodashSortedIndexBy1x4[T] = js.native
  @JSName("sortedIndexBy")
  var sortedIndexBy_Original: LodashSortedIndexBy = js.native
  @JSName("sortedIndexBy")
  def sortedIndexBy_T_LodashSortedIndexBy1x3[T](iteratee: ValueIteratee[T], value: T): LodashSortedIndexBy1x3[T] = js.native
  @JSName("sortedIndexBy")
  def sortedIndexBy_T_LodashSortedIndexBy1x6[T](iteratee: __, value: T): LodashSortedIndexBy1x6[T] = js.native
  
  def sortedIndexOf[T](value: T): Double = js.native
  def sortedIndexOf[T](value: T, array: List[T]): Double = js.native
  def sortedIndexOf[T](value: __): LodashSortedIndexOf1x2[T] = js.native
  def sortedIndexOf[T](value: __, array: List[T]): LodashSortedIndexOf1x2[T] = js.native
  @JSName("sortedIndexOf")
  var sortedIndexOf_Original: LodashSortedIndexOf = js.native
  @JSName("sortedIndexOf")
  def sortedIndexOf_T_LodashSortedIndexOf1x1[T](value: T): LodashSortedIndexOf1x1[T] = js.native
  
  @JSName("sortedIndex")
  var sortedIndex_Original: LodashSortedIndex = js.native
  @JSName("sortedIndex")
  def sortedIndex_T_Double[T](value: T): Double = js.native
  
  def sortedLastIndex[T](value: T): Double = js.native
  def sortedLastIndex[T](value: T, array: List[T]): Double = js.native
  def sortedLastIndex[T](value: __): LodashSortedLastIndex1x2[T] = js.native
  def sortedLastIndex[T](value: __, array: List[T]): LodashSortedLastIndex1x2[T] = js.native
  
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T]): LodashSortedLastIndexBy1x1[T] = js.native
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: T): Double = js.native
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: T, array: List[T]): Double = js.native
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: __): LodashSortedLastIndexBy1x5[T] = js.native
  def sortedLastIndexBy[T](iteratee: ValueIteratee[T], value: __, array: List[T]): LodashSortedLastIndexBy1x5[T] = js.native
  def sortedLastIndexBy[T](iteratee: __, value: T): LodashSortedLastIndexBy1x2[T] = js.native
  def sortedLastIndexBy[T](iteratee: __, value: T, array: List[T]): LodashSortedLastIndexBy1x6[T] = js.native
  def sortedLastIndexBy[T](iteratee: __, value: __): LodashSortedLastIndexBy1x4[T] = js.native
  def sortedLastIndexBy[T](iteratee: __, value: __, array: List[T]): LodashSortedLastIndexBy1x4[T] = js.native
  @JSName("sortedLastIndexBy")
  var sortedLastIndexBy_Original: LodashSortedLastIndexBy = js.native
  @JSName("sortedLastIndexBy")
  def sortedLastIndexBy_T_LodashSortedLastIndexBy1x3[T](iteratee: ValueIteratee[T], value: T): LodashSortedLastIndexBy1x3[T] = js.native
  @JSName("sortedLastIndexBy")
  def sortedLastIndexBy_T_LodashSortedLastIndexBy1x6[T](iteratee: __, value: T): LodashSortedLastIndexBy1x6[T] = js.native
  
  def sortedLastIndexOf[T](value: T): LodashSortedLastIndexOf1x1[T] = js.native
  def sortedLastIndexOf[T](value: T, array: List[T]): Double = js.native
  def sortedLastIndexOf[T](value: __): LodashSortedLastIndexOf1x2[T] = js.native
  def sortedLastIndexOf[T](value: __, array: List[T]): LodashSortedLastIndexOf1x2[T] = js.native
  @JSName("sortedLastIndexOf")
  var sortedLastIndexOf_Original: LodashSortedLastIndexOf = js.native
  @JSName("sortedLastIndexOf")
  def sortedLastIndexOf_T_Double[T](value: T): Double = js.native
  
  @JSName("sortedLastIndex")
  var sortedLastIndex_Original: LodashSortedLastIndex = js.native
  @JSName("sortedLastIndex")
  def sortedLastIndex_T_LodashSortedLastIndex1x1[T](value: T): LodashSortedLastIndex1x1[T] = js.native
  
  def sortedUniq[T](): js.Array[T] = js.native
  def sortedUniq[T](array: List[T]): js.Array[T] = js.native
  
  def sortedUniqBy[T](iteratee: ValueIteratee[T]): LodashSortedUniqBy1x1[T] = js.native
  def sortedUniqBy[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def sortedUniqBy[T](iteratee: __): LodashSortedUniqBy1x2[T] = js.native
  def sortedUniqBy[T](iteratee: __, array: List[T]): LodashSortedUniqBy1x2[T] = js.native
  @JSName("sortedUniqBy")
  var sortedUniqBy_Original: LodashSortedUniqBy = js.native
  @JSName("sortedUniqBy")
  def sortedUniqBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  
  @JSName("sortedUniq")
  var sortedUniq_Original: LodashSortedUniq = js.native
  
  def split(separator: java.lang.String): LodashSplit1x1 = js.native
  def split(separator: java.lang.String, string: java.lang.String): js.Array[java.lang.String] = js.native
  def split(separator: __): LodashSplit1x2 = js.native
  def split(separator: __, string: java.lang.String): LodashSplit1x2 = js.native
  def split(separator: js.RegExp): LodashSplit1x1 = js.native
  def split(separator: js.RegExp, string: java.lang.String): js.Array[java.lang.String] = js.native
  @JSName("split")
  def split_Array(separator: java.lang.String): js.Array[java.lang.String] = js.native
  @JSName("split")
  def split_Array(separator: js.RegExp): js.Array[java.lang.String] = js.native
  @JSName("split")
  var split_Original: LodashSplit = js.native
  
  def spread[TResult](func: js.Function1[/* repeated */ js.Any, TResult]): js.Function1[/* repeated */ js.Any, TResult] = js.native
  
  def spreadFrom(start: Double): LodashSpreadFrom1x1 = js.native
  def spreadFrom[TResult](start: Double, func: js.Function1[/* repeated */ js.Any, TResult]): js.Function1[/* repeated */ js.Any, TResult] = js.native
  def spreadFrom[TResult](start: __, func: js.Function1[/* repeated */ js.Any, TResult]): LodashSpreadFrom1x2[TResult] = js.native
  @JSName("spreadFrom")
  var spreadFrom_Original: LodashSpreadFrom = js.native
  
  @JSName("spread")
  var spread_Original: LodashSpread = js.native
  
  def startCase(string: java.lang.String): java.lang.String = js.native
  @JSName("startCase")
  var startCase_Original: LodashStartCase = js.native
  
  def startsWith(target: java.lang.String): LodashStartsWith1x1 = js.native
  def startsWith(target: java.lang.String, string: java.lang.String): Boolean = js.native
  def startsWith(target: __, string: java.lang.String): LodashStartsWith1x2 = js.native
  @JSName("startsWith")
  var startsWith_Original: LodashStartsWith = js.native
  
  def stubArray(): js.Array[_] = js.native
  @JSName("stubArray")
  var stubArray_Original: LodashStubArray = js.native
  
  def stubFalse(): `false` = js.native
  @JSName("stubFalse")
  var stubFalse_Original: LodashStubFalse = js.native
  
  def stubObject(): js.Any = js.native
  @JSName("stubObject")
  var stubObject_Original: LodashStubObject = js.native
  
  def stubString(): java.lang.String = js.native
  @JSName("stubString")
  var stubString_Original: LodashStubString = js.native
  
  def stubTrue(): `true` = js.native
  @JSName("stubTrue")
  var stubTrue_Original: LodashStubTrue = js.native
  
  def subtract(minuend: Double): LodashSubtract1x1 = js.native
  def subtract(minuend: Double, subtrahend: Double): Double = js.native
  def subtract(minuend: __, subtrahend: Double): LodashSubtract1x2 = js.native
  @JSName("subtract")
  var subtract_Original: LodashSubtract = js.native
  
  def sum(): Double = js.native
  def sum(collection: List[_]): Double = js.native
  
  def sumBy[T](iteratee: java.lang.String): LodashSumBy1x1[T] = js.native
  def sumBy[T](iteratee: java.lang.String, collection: List[T]): Double = js.native
  def sumBy[T](iteratee: js.Function1[/* value */ T, Double]): LodashSumBy1x1[T] = js.native
  def sumBy[T](iteratee: js.Function1[/* value */ T, Double], collection: List[T]): Double = js.native
  def sumBy[T](iteratee: __): LodashSumBy1x2[T] = js.native
  def sumBy[T](iteratee: __, collection: List[T]): LodashSumBy1x2[T] = js.native
  @JSName("sumBy")
  var sumBy_Original: LodashSumBy = js.native
  @JSName("sumBy")
  def sumBy_T_Double[T](iteratee: java.lang.String): Double = js.native
  @JSName("sumBy")
  def sumBy_T_Double[T](iteratee: js.Function1[/* value */ T, Double]): Double = js.native
  
  @JSName("sum")
  var sum_Original: LodashSum = js.native
  
  def symmetricDifference[T](): js.Array[T] = js.native
  def symmetricDifference[T](arrays2: js.UndefOr[scala.Nothing], arrays: List[T]): js.Array[T] = js.native
  def symmetricDifference[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def symmetricDifference[T](arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifference[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def symmetricDifference[T](arrays2: __): LodashXor1x2[T] = js.native
  def symmetricDifference[T](arrays2: __, arrays: List[T]): LodashXor1x2[T] = js.native
  
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T]): LodashXorBy1x3[T] = js.native
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: List[T]): LodashXorBy1x3[T] = js.native
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: __): LodashXorBy1x5[T] = js.native
  def symmetricDifferenceBy[T](iteratee: ValueIteratee[T], arrays: __, arrays2: List[T]): LodashXorBy1x5[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __): LodashXorBy1x6[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __, arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashXorBy1x6[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __, arrays: Null, arrays2: List[T]): LodashXorBy1x6[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __, arrays: List[T]): LodashXorBy1x6[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __, arrays: List[T], arrays2: List[T]): LodashXorBy1x6[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __, arrays: __): LodashXorBy1x4[T] = js.native
  def symmetricDifferenceBy[T](iteratee: __, arrays: __, arrays2: List[T]): LodashXorBy1x4[T] = js.native
  @JSName("symmetricDifferenceBy")
  var symmetricDifferenceBy_Original: LodashXorBy = js.native
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_Array[T](iteratee: ValueIteratee[T], arrays: List[T]): js.Array[T] = js.native
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_LodashXorBy1x1[T](iteratee: ValueIteratee[T]): LodashXorBy1x1[T] = js.native
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_LodashXorBy1x2[T](iteratee: __): LodashXorBy1x2[T] = js.native
  @JSName("symmetricDifferenceBy")
  def symmetricDifferenceBy_T_LodashXorBy1x2[T](iteratee: __, arrays: List[T]): LodashXorBy1x2[T] = js.native
  
  def symmetricDifferenceWith[T](comparator: Comparator[T]): js.Array[T] = js.native
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: List[T]): js.Array[T] = js.native
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: __): LodashXorWith1x5[T] = js.native
  def symmetricDifferenceWith[T](comparator: Comparator[T], arrays: __, arrays2: List[T]): LodashXorWith1x5[T] = js.native
  def symmetricDifferenceWith[T](comparator: __): LodashXorWith1x2[T] = js.native
  def symmetricDifferenceWith[T](comparator: __, arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashXorWith1x6[T] = js.native
  def symmetricDifferenceWith[T](comparator: __, arrays: Null, arrays2: List[T]): LodashXorWith1x6[T] = js.native
  def symmetricDifferenceWith[T](comparator: __, arrays: List[T]): LodashXorWith1x2[T] = js.native
  def symmetricDifferenceWith[T](comparator: __, arrays: List[T], arrays2: List[T]): LodashXorWith1x6[T] = js.native
  def symmetricDifferenceWith[T](comparator: __, arrays: __): LodashXorWith1x4[T] = js.native
  def symmetricDifferenceWith[T](comparator: __, arrays: __, arrays2: List[T]): LodashXorWith1x4[T] = js.native
  @JSName("symmetricDifferenceWith")
  var symmetricDifferenceWith_Original: LodashXorWith = js.native
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x1[T](comparator: Comparator[T]): LodashXorWith1x1[T] = js.native
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x3[T](comparator: Comparator[T]): LodashXorWith1x3[T] = js.native
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x3[T](comparator: Comparator[T], arrays: List[T]): LodashXorWith1x3[T] = js.native
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x6[T](comparator: __): LodashXorWith1x6[T] = js.native
  @JSName("symmetricDifferenceWith")
  def symmetricDifferenceWith_T_LodashXorWith1x6[T](comparator: __, arrays: List[T]): LodashXorWith1x6[T] = js.native
  
  @JSName("symmetricDifference")
  var symmetricDifference_Original: LodashXor = js.native
  @JSName("symmetricDifference")
  def symmetricDifference_T_LodashXor1x1[T](): LodashXor1x1[T] = js.native
  @JSName("symmetricDifference")
  def symmetricDifference_T_LodashXor1x1[T](arrays2: List[T]): LodashXor1x1[T] = js.native
  
  def tail[T](): js.Array[T] = js.native
  def tail[T](array: List[T]): js.Array[T] = js.native
  @JSName("tail")
  var tail_Original: LodashTail = js.native
  
  def take(n: Double): LodashTake1x1 = js.native
  def take[T](n: Double, array: List[T]): js.Array[T] = js.native
  def take[T](n: __): LodashTake1x2[T] = js.native
  def take[T](n: __, array: List[T]): LodashTake1x2[T] = js.native
  
  def takeLast(n: Double): LodashTakeRight1x1 = js.native
  def takeLast[T](n: Double, array: List[T]): js.Array[T] = js.native
  def takeLast[T](n: __): LodashTakeRight1x2[T] = js.native
  def takeLast[T](n: __, array: List[T]): LodashTakeRight1x2[T] = js.native
  
  def takeLastWhile[T](predicate: ValueIteratee[T]): LodashTakeRightWhile1x1[T] = js.native
  def takeLastWhile[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def takeLastWhile[T](predicate: __): LodashTakeRightWhile1x2[T] = js.native
  def takeLastWhile[T](predicate: __, array: List[T]): LodashTakeRightWhile1x2[T] = js.native
  @JSName("takeLastWhile")
  var takeLastWhile_Original: LodashTakeRightWhile = js.native
  @JSName("takeLastWhile")
  def takeLastWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  
  @JSName("takeLast")
  var takeLast_Original: LodashTakeRight = js.native
  @JSName("takeLast")
  def takeLast_T_Array[T](n: Double): js.Array[T] = js.native
  
  def takeRight(n: Double): LodashTakeRight1x1 = js.native
  def takeRight[T](n: Double, array: List[T]): js.Array[T] = js.native
  def takeRight[T](n: __): LodashTakeRight1x2[T] = js.native
  def takeRight[T](n: __, array: List[T]): LodashTakeRight1x2[T] = js.native
  
  def takeRightWhile[T](predicate: ValueIteratee[T]): LodashTakeRightWhile1x1[T] = js.native
  def takeRightWhile[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def takeRightWhile[T](predicate: __): LodashTakeRightWhile1x2[T] = js.native
  def takeRightWhile[T](predicate: __, array: List[T]): LodashTakeRightWhile1x2[T] = js.native
  @JSName("takeRightWhile")
  var takeRightWhile_Original: LodashTakeRightWhile = js.native
  @JSName("takeRightWhile")
  def takeRightWhile_T_Array[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  
  @JSName("takeRight")
  var takeRight_Original: LodashTakeRight = js.native
  @JSName("takeRight")
  def takeRight_T_Array[T](n: Double): js.Array[T] = js.native
  
  def takeWhile[T](predicate: ValueIteratee[T]): js.Array[T] = js.native
  def takeWhile[T](predicate: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def takeWhile[T](predicate: __): LodashTakeWhile1x2[T] = js.native
  def takeWhile[T](predicate: __, array: List[T]): LodashTakeWhile1x2[T] = js.native
  @JSName("takeWhile")
  var takeWhile_Original: LodashTakeWhile = js.native
  @JSName("takeWhile")
  def takeWhile_T_LodashTakeWhile1x1[T](predicate: ValueIteratee[T]): LodashTakeWhile1x1[T] = js.native
  
  @JSName("take")
  var take_Original: LodashTake = js.native
  @JSName("take")
  def take_T_Array[T](n: Double): js.Array[T] = js.native
  
  def tap[T](interceptor: js.Function1[/* value */ T, Unit]): LodashTap1x1[T] = js.native
  def tap[T](interceptor: js.Function1[/* value */ T, Unit], value: T): T = js.native
  def tap[T](interceptor: __, value: T): LodashTap1x2[T] = js.native
  @JSName("tap")
  var tap_Original: LodashTap = js.native
  
  def template(string: java.lang.String): TemplateExecutor = js.native
  @JSName("template")
  var template_Original: LodashTemplate = js.native
  
  def throttle(wait: Double): LodashThrottle1x1 = js.native
  def throttle[T /* <: js.Function1[/* args */ js.Any, _] */](wait: Double, func: T): DebouncedFunc[T] = js.native
  def throttle[T /* <: js.Function1[/* args */ js.Any, _] */](wait: __, func: T): LodashThrottle1x2[T] = js.native
  @JSName("throttle")
  var throttle_Original: LodashThrottle = js.native
  
  def thru[T](interceptor: __, value: T): LodashThru1x2[T] = js.native
  def thru[T, TResult](interceptor: js.Function1[/* value */ T, TResult]): LodashThru1x1[T, TResult] = js.native
  def thru[T, TResult](interceptor: js.Function1[/* value */ T, TResult], value: T): TResult = js.native
  @JSName("thru")
  var thru_Original: LodashThru = js.native
  
  def times(iteratee: __, n: Double): LodashTimes1x2 = js.native
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult]): LodashTimes1x1[TResult] = js.native
  def times[TResult](iteratee: js.Function1[/* num */ Double, TResult], n: Double): js.Array[TResult] = js.native
  @JSName("times")
  var times_Original: LodashTimes = js.native
  
  def toArray(): js.Array[_] = js.native
  def toArray[T](value: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def toArray[T](value: Dictionary[T]): js.Array[T] = js.native
  def toArray[T](value: NumericDictionary[T]): js.Array[T] = js.native
  @JSName("toArray")
  var toArray_Original: LodashToArray = js.native
  @JSName("toArray")
  def toArray_T[T](): js.Array[T] = js.native
  
  def toFinite(value: js.Any): Double = js.native
  @JSName("toFinite")
  var toFinite_Original: LodashToFinite = js.native
  
  def toInteger(value: js.Any): Double = js.native
  @JSName("toInteger")
  var toInteger_Original: LodashToInteger = js.native
  
  def toLength(value: js.Any): Double = js.native
  @JSName("toLength")
  var toLength_Original: LodashToLength = js.native
  
  def toLower(string: java.lang.String): java.lang.String = js.native
  @JSName("toLower")
  var toLower_Original: LodashToLower = js.native
  
  def toNumber(value: js.Any): Double = js.native
  @JSName("toNumber")
  var toNumber_Original: LodashToNumber = js.native
  
  def toPairs(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def toPairs[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  def toPairs[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  
  def toPairsIn(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def toPairsIn[T](`object`: Dictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  def toPairsIn[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[java.lang.String, T]] = js.native
  @JSName("toPairsIn")
  var toPairsIn_Original: LodashToPairsIn = js.native
  
  @JSName("toPairs")
  var toPairs_Original: LodashToPairs = js.native
  
  def toPath(value: js.Any): js.Array[java.lang.String] = js.native
  @JSName("toPath")
  var toPath_Original: LodashToPath = js.native
  
  def toPlainObject(value: js.Any): js.Any = js.native
  @JSName("toPlainObject")
  var toPlainObject_Original: LodashToPlainObject = js.native
  
  def toSafeInteger(value: js.Any): Double = js.native
  @JSName("toSafeInteger")
  var toSafeInteger_Original: LodashToSafeInteger = js.native
  
  def toString(value: js.Any): java.lang.String = js.native
  @JSName("toString")
  var toString_Original: LodashToString = js.native
  
  def toUpper(string: java.lang.String): java.lang.String = js.native
  @JSName("toUpper")
  var toUpper_Original: LodashToUpper = js.native
  
  def transform[TResult](iteratee: __, accumulator: TResult): LodashTransform1x2[TResult] = js.native
  def transform[T](iteratee: __, accumulator: __, `object`: js.Array[T]): LodashTransform1x4[T] = js.native
  def transform[T](iteratee: __, accumulator: __, `object`: Dictionary[T]): LodashTransform2x4[T] = js.native
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult]): LodashTransform1x1[T, TResult] = js.native
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult): LodashTransform1x3[T, TResult] = js.native
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: js.Array[T]): TResult = js.native
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: TResult, `object`: Dictionary[T]): TResult = js.native
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def transform[T, TResult](iteratee: MemoVoidIteratorCapped[T, TResult], accumulator: __, `object`: Dictionary[T]): LodashTransform2x5[TResult] = js.native
  def transform[T, TResult](iteratee: __, accumulator: TResult, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def transform[T, TResult](iteratee: __, accumulator: TResult, `object`: Dictionary[T]): LodashTransform2x6[T, TResult] = js.native
  @JSName("transform")
  var transform_Original: LodashTransform = js.native
  
  def trim(string: java.lang.String): java.lang.String = js.native
  
  def trimChars(chars: java.lang.String): LodashTrimChars1x1 = js.native
  def trimChars(chars: java.lang.String, string: java.lang.String): java.lang.String = js.native
  def trimChars(chars: __, string: java.lang.String): LodashTrimChars1x2 = js.native
  
  def trimCharsEnd(chars: java.lang.String): LodashTrimCharsEnd1x1 = js.native
  def trimCharsEnd(chars: java.lang.String, string: java.lang.String): java.lang.String = js.native
  def trimCharsEnd(chars: __, string: java.lang.String): LodashTrimCharsEnd1x2 = js.native
  @JSName("trimCharsEnd")
  var trimCharsEnd_Original: LodashTrimCharsEnd = js.native
  
  def trimCharsStart(chars: java.lang.String): LodashTrimCharsStart1x1 = js.native
  def trimCharsStart(chars: java.lang.String, string: java.lang.String): java.lang.String = js.native
  def trimCharsStart(chars: __, string: java.lang.String): LodashTrimCharsStart1x2 = js.native
  @JSName("trimCharsStart")
  var trimCharsStart_Original: LodashTrimCharsStart = js.native
  
  @JSName("trimChars")
  var trimChars_Original: LodashTrimChars = js.native
  
  def trimEnd(string: java.lang.String): java.lang.String = js.native
  @JSName("trimEnd")
  var trimEnd_Original: LodashTrimEnd = js.native
  
  def trimStart(string: java.lang.String): java.lang.String = js.native
  @JSName("trimStart")
  var trimStart_Original: LodashTrimStart = js.native
  
  @JSName("trim")
  var trim_Original: LodashTrim = js.native
  
  def truncate(options: TruncateOptions): LodashTruncate1x1 = js.native
  def truncate(options: TruncateOptions, string: java.lang.String): java.lang.String = js.native
  def truncate(options: __, string: java.lang.String): LodashTruncate1x2 = js.native
  @JSName("truncate")
  var truncate_Original: LodashTruncate = js.native
  
  def unapply(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  @JSName("unapply")
  var unapply_Original: LodashUnapply = js.native
  
  def unary[T, TResult](func: js.Function2[/* arg1 */ T, /* repeated */ js.Any, TResult]): js.Function1[/* arg1 */ T, TResult] = js.native
  @JSName("unary")
  var unary_Original: LodashUnary = js.native
  
  def unescape(string: java.lang.String): java.lang.String = js.native
  @JSName("unescape")
  var unescape_Original: LodashUnescape = js.native
  
  def union[T](): LodashUnion1x1[T] = js.native
  def union[T](arrays2: js.UndefOr[scala.Nothing], arrays: List[T]): js.Array[T] = js.native
  def union[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def union[T](arrays2: List[T]): LodashUnion1x1[T] = js.native
  def union[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def union[T](arrays2: __): LodashUnion1x2[T] = js.native
  def union[T](arrays2: __, arrays: List[T]): LodashUnion1x2[T] = js.native
  
  def unionBy[T](iteratee: ValueIteratee[T]): LodashUnionBy1x3[T] = js.native
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: Null, arrays2: List[T]): js.Array[T] = js.native
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: List[T]): LodashUnionBy1x3[T] = js.native
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: List[T], arrays2: List[T]): js.Array[T] = js.native
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: __): LodashUnionBy1x5[T] = js.native
  def unionBy[T](iteratee: ValueIteratee[T], arrays1: __, arrays2: List[T]): LodashUnionBy1x5[T] = js.native
  def unionBy[T](iteratee: __): LodashUnionBy1x2[T] = js.native
  def unionBy[T](iteratee: __, arrays1: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def unionBy[T](iteratee: __, arrays1: Null, arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def unionBy[T](iteratee: __, arrays1: List[T]): LodashUnionBy1x2[T] = js.native
  def unionBy[T](iteratee: __, arrays1: List[T], arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def unionBy[T](iteratee: __, arrays1: __): LodashUnionBy1x4[T] = js.native
  def unionBy[T](iteratee: __, arrays1: __, arrays2: List[T]): LodashUnionBy1x4[T] = js.native
  @JSName("unionBy")
  var unionBy_Original: LodashUnionBy = js.native
  @JSName("unionBy")
  def unionBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  @JSName("unionBy")
  def unionBy_T_Array[T](iteratee: ValueIteratee[T], arrays1: List[T]): js.Array[T] = js.native
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x1[T](iteratee: ValueIteratee[T]): LodashUnionBy1x1[T] = js.native
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x6[T](iteratee: __): LodashUnionBy1x6[T] = js.native
  @JSName("unionBy")
  def unionBy_T_LodashUnionBy1x6[T](iteratee: __, arrays1: List[T]): LodashUnionBy1x6[T] = js.native
  
  def unionWith[T](comparator: Comparator[T]): LodashUnionWith1x3[T] = js.native
  def unionWith[T](comparator: Comparator[T], arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def unionWith[T](comparator: Comparator[T], arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def unionWith[T](comparator: Comparator[T], arrays: List[T]): LodashUnionWith1x3[T] = js.native
  def unionWith[T](comparator: Comparator[T], arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def unionWith[T](comparator: Comparator[T], arrays: __): LodashUnionWith1x5[T] = js.native
  def unionWith[T](comparator: Comparator[T], arrays: __, arrays2: List[T]): LodashUnionWith1x5[T] = js.native
  def unionWith[T](comparator: __): LodashUnionWith1x6[T] = js.native
  def unionWith[T](comparator: __, arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashUnionWith1x6[T] = js.native
  def unionWith[T](comparator: __, arrays: Null, arrays2: List[T]): LodashUnionWith1x6[T] = js.native
  def unionWith[T](comparator: __, arrays: List[T]): LodashUnionWith1x6[T] = js.native
  def unionWith[T](comparator: __, arrays: List[T], arrays2: List[T]): LodashUnionWith1x6[T] = js.native
  def unionWith[T](comparator: __, arrays: __): LodashUnionWith1x4[T] = js.native
  def unionWith[T](comparator: __, arrays: __, arrays2: List[T]): LodashUnionWith1x4[T] = js.native
  @JSName("unionWith")
  var unionWith_Original: LodashUnionWith = js.native
  @JSName("unionWith")
  def unionWith_T_Array[T](comparator: Comparator[T]): js.Array[T] = js.native
  @JSName("unionWith")
  def unionWith_T_Array[T](comparator: Comparator[T], arrays: List[T]): js.Array[T] = js.native
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x1[T](comparator: Comparator[T]): LodashUnionWith1x1[T] = js.native
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x2[T](comparator: __): LodashUnionWith1x2[T] = js.native
  @JSName("unionWith")
  def unionWith_T_LodashUnionWith1x2[T](comparator: __, arrays: List[T]): LodashUnionWith1x2[T] = js.native
  
  @JSName("union")
  var union_Original: LodashUnion = js.native
  @JSName("union")
  def union_T_Array[T](): js.Array[T] = js.native
  @JSName("union")
  def union_T_Array[T](arrays2: List[T]): js.Array[T] = js.native
  
  def uniq[T](): js.Array[T] = js.native
  def uniq[T](array: List[T]): js.Array[T] = js.native
  
  def uniqBy[T](iteratee: ValueIteratee[T]): LodashUniqBy1x1[T] = js.native
  def uniqBy[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def uniqBy[T](iteratee: __): LodashUniqBy1x2[T] = js.native
  def uniqBy[T](iteratee: __, array: List[T]): LodashUniqBy1x2[T] = js.native
  @JSName("uniqBy")
  var uniqBy_Original: LodashUniqBy = js.native
  @JSName("uniqBy")
  def uniqBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  
  def uniqWith[T](comparator: Comparator[T]): js.Array[T] = js.native
  def uniqWith[T](comparator: Comparator[T], array: List[T]): js.Array[T] = js.native
  def uniqWith[T](comparator: __): LodashUniqWith1x2[T] = js.native
  def uniqWith[T](comparator: __, array: List[T]): LodashUniqWith1x2[T] = js.native
  @JSName("uniqWith")
  var uniqWith_Original: LodashUniqWith = js.native
  @JSName("uniqWith")
  def uniqWith_T_LodashUniqWith1x1[T](comparator: Comparator[T]): LodashUniqWith1x1[T] = js.native
  
  @JSName("uniq")
  var uniq_Original: LodashUniq = js.native
  
  def uniqueId(prefix: java.lang.String): java.lang.String = js.native
  @JSName("uniqueId")
  var uniqueId_Original: LodashUniqueId = js.native
  
  def unnest[T](): js.Array[T] = js.native
  def unnest[T](array: List[Many[T]]): js.Array[T] = js.native
  @JSName("unnest")
  var unnest_Original: LodashFlatten = js.native
  
  def unset(path: PropertyPath): LodashUnset1x1 = js.native
  def unset[T](path: PropertyPath, `object`: T): T = js.native
  def unset[T](path: __, `object`: T): LodashUnset1x2[T] = js.native
  @JSName("unset")
  var unset_Original: LodashUnset = js.native
  
  def unzip[T](): js.Array[js.Array[T]] = js.native
  def unzip[T](array: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
  def unzip[T](array: List[List[T]]): js.Array[js.Array[T]] = js.native
  
  def unzipWith[T](iteratee: __): LodashUnzipWith1x2[T] = js.native
  def unzipWith[T](iteratee: __, array: List[List[T]]): LodashUnzipWith1x2[T] = js.native
  def unzipWith[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): LodashUnzipWith1x1[T, TResult] = js.native
  def unzipWith[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult], array: List[List[T]]): js.Array[TResult] = js.native
  @JSName("unzipWith")
  var unzipWith_Original: LodashUnzipWith = js.native
  @JSName("unzipWith")
  def unzipWith_TTResult_Array[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  
  @JSName("unzip")
  var unzip_Original: LodashUnzip = js.native
  
  def update(path: PropertyPath): LodashUpdate1x1 = js.native
  def update(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): LodashUpdate1x3 = js.native
  def update(path: PropertyPath, updater: js.Function1[/* value */ js.Any, _], `object`: js.Object): js.Any = js.native
  def update(path: PropertyPath, updater: __, `object`: js.Object): LodashUpdate1x5 = js.native
  def update(path: __, updater: js.Function1[/* value */ js.Any, _]): LodashUpdate1x2 = js.native
  def update(path: __, updater: js.Function1[/* value */ js.Any, _], `object`: js.Object): LodashUpdate1x6 = js.native
  def update(path: __, updater: __, `object`: js.Object): LodashUpdate1x4 = js.native
  
  def updateWith(customizer: __, path: PropertyPath): LodashUpdateWith1x2 = js.native
  def updateWith(customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x6 = js.native
  def updateWith(customizer: __, path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x4 = js.native
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T]): LodashUpdateWith1x1[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath): LodashUpdateWith1x3[T] = js.native
  def updateWith[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _]
  ): LodashUpdateWith1x7[T] = js.native
  def updateWith[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    `object`: T
  ): T = js.native
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x11[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, updater: js.Function1[/* oldValue */ js.Any, _]): LodashUpdateWith1x5[T] = js.native
  def updateWith[T /* <: js.Object */](
    customizer: SetWithCustomizer[T],
    path: __,
    updater: js.Function1[/* oldValue */ js.Any, _],
    `object`: T
  ): LodashUpdateWith1x13[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: SetWithCustomizer[T], path: __, updater: __, `object`: T): LodashUpdateWith1x9[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: __, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): LodashUpdateWith1x14[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: __, path: PropertyPath, updater: __, `object`: T): LodashUpdateWith1x10[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: __, path: __, updater: js.Function1[/* oldValue */ js.Any, _], `object`: T): LodashUpdateWith1x12[T] = js.native
  def updateWith[T /* <: js.Object */](customizer: __, path: __, updater: __, `object`: T): LodashUpdateWith1x8[T] = js.native
  @JSName("updateWith")
  var updateWith_Original: LodashUpdateWith = js.native
  
  @JSName("update")
  var update_Original: LodashUpdate = js.native
  
  def upperCase(string: java.lang.String): java.lang.String = js.native
  @JSName("upperCase")
  var upperCase_Original: LodashUpperCase = js.native
  
  def upperFirst(string: java.lang.String): java.lang.String = js.native
  @JSName("upperFirst")
  var upperFirst_Original: LodashUpperFirst = js.native
  
  def useWith(func: js.Function1[/* repeated */ js.Any, _]): LodashOverArgs1x1 = js.native
  def useWith(func: js.Function1[/* repeated */ js.Any, _], transforms: Many[js.Function1[/* repeated */ _, _]]): js.Function1[/* repeated */ js.Any, _] = js.native
  def useWith(func: __, transforms: Many[js.Function1[/* repeated */ _, _]]): LodashOverArgs1x2 = js.native
  @JSName("useWith")
  var useWith_Original: LodashOverArgs = js.native
  
  def values(`object`: js.Any): js.Array[_] = js.native
  def values[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def values[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def values[T](`object`: Dictionary[T]): js.Array[T] = js.native
  def values[T](`object`: List[T]): js.Array[T] = js.native
  def values[T](`object`: NumericDictionary[T]): js.Array[T] = js.native
  
  def valuesIn[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def valuesIn[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def valuesIn[T](`object`: Dictionary[T]): js.Array[T] = js.native
  def valuesIn[T](`object`: List[T]): js.Array[T] = js.native
  def valuesIn[T](`object`: NumericDictionary[T]): js.Array[T] = js.native
  @JSName("valuesIn")
  var valuesIn_Original: LodashValuesIn = js.native
  @JSName("valuesIn")
  def valuesIn_T[T](): js.Array[T] = js.native
  
  @JSName("values")
  var values_Original: LodashValues = js.native
  @JSName("values")
  def values_T[T](): js.Array[T] = js.native
  
  def where[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T] = js.native
  def where[T](source: ConformsPredicateObject[T], `object`: T): Boolean = js.native
  def where[T](source: __, `object`: T): LodashConformsTo1x2[T] = js.native
  
  def whereEq(source: js.Object): LodashIsMatch1x1 = js.native
  def whereEq(source: js.Object, `object`: js.Object): Boolean = js.native
  def whereEq(source: __, `object`: js.Object): LodashIsMatch1x2 = js.native
  @JSName("whereEq")
  var whereEq_Original: LodashIsMatch = js.native
  
  @JSName("where")
  var where_Original: LodashConformsTo = js.native
  
  def without[T](values: js.Array[T]): LodashWithout1x1[T] = js.native
  def without[T](values: js.Array[T], array: List[T]): js.Array[T] = js.native
  def without[T](values: __): LodashWithout1x2[T] = js.native
  def without[T](values: __, array: List[T]): LodashWithout1x2[T] = js.native
  @JSName("without")
  var without_Original: LodashWithout = js.native
  @JSName("without")
  def without_T_Array[T](values: js.Array[T]): js.Array[T] = js.native
  
  def words(string: java.lang.String): js.Array[java.lang.String] = js.native
  @JSName("words")
  var words_Original: LodashWords = js.native
  
  def wrap[T](wrapper: __, value: T): LodashWrap1x2[T] = js.native
  def wrap[T, TArgs, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult]): LodashWrap1x1[T, TArgs, TResult] = js.native
  def wrap[T, TArgs, TResult](wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult], value: T): js.Function1[/* repeated */ TArgs, TResult] = js.native
  @JSName("wrap")
  var wrap_Original: LodashWrap = js.native
  
  def xor[T](): js.Array[T] = js.native
  def xor[T](arrays2: js.UndefOr[scala.Nothing], arrays: List[T]): js.Array[T] = js.native
  def xor[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def xor[T](arrays2: List[T]): js.Array[T] = js.native
  def xor[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def xor[T](arrays2: __): LodashXor1x2[T] = js.native
  def xor[T](arrays2: __, arrays: List[T]): LodashXor1x2[T] = js.native
  
  def xorBy[T](iteratee: ValueIteratee[T]): LodashXorBy1x3[T] = js.native
  def xorBy[T](iteratee: ValueIteratee[T], arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def xorBy[T](iteratee: ValueIteratee[T], arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def xorBy[T](iteratee: ValueIteratee[T], arrays: List[T]): LodashXorBy1x3[T] = js.native
  def xorBy[T](iteratee: ValueIteratee[T], arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def xorBy[T](iteratee: ValueIteratee[T], arrays: __): LodashXorBy1x5[T] = js.native
  def xorBy[T](iteratee: ValueIteratee[T], arrays: __, arrays2: List[T]): LodashXorBy1x5[T] = js.native
  def xorBy[T](iteratee: __): LodashXorBy1x6[T] = js.native
  def xorBy[T](iteratee: __, arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashXorBy1x6[T] = js.native
  def xorBy[T](iteratee: __, arrays: Null, arrays2: List[T]): LodashXorBy1x6[T] = js.native
  def xorBy[T](iteratee: __, arrays: List[T]): LodashXorBy1x6[T] = js.native
  def xorBy[T](iteratee: __, arrays: List[T], arrays2: List[T]): LodashXorBy1x6[T] = js.native
  def xorBy[T](iteratee: __, arrays: __): LodashXorBy1x4[T] = js.native
  def xorBy[T](iteratee: __, arrays: __, arrays2: List[T]): LodashXorBy1x4[T] = js.native
  @JSName("xorBy")
  var xorBy_Original: LodashXorBy = js.native
  @JSName("xorBy")
  def xorBy_T_Array[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  @JSName("xorBy")
  def xorBy_T_Array[T](iteratee: ValueIteratee[T], arrays: List[T]): js.Array[T] = js.native
  @JSName("xorBy")
  def xorBy_T_LodashXorBy1x1[T](iteratee: ValueIteratee[T]): LodashXorBy1x1[T] = js.native
  @JSName("xorBy")
  def xorBy_T_LodashXorBy1x2[T](iteratee: __): LodashXorBy1x2[T] = js.native
  @JSName("xorBy")
  def xorBy_T_LodashXorBy1x2[T](iteratee: __, arrays: List[T]): LodashXorBy1x2[T] = js.native
  
  def xorWith[T](comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](comparator: Comparator[T], arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def xorWith[T](comparator: Comparator[T], arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def xorWith[T](comparator: Comparator[T], arrays: List[T]): js.Array[T] = js.native
  def xorWith[T](comparator: Comparator[T], arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def xorWith[T](comparator: Comparator[T], arrays: __): LodashXorWith1x5[T] = js.native
  def xorWith[T](comparator: Comparator[T], arrays: __, arrays2: List[T]): LodashXorWith1x5[T] = js.native
  def xorWith[T](comparator: __): LodashXorWith1x2[T] = js.native
  def xorWith[T](comparator: __, arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): LodashXorWith1x6[T] = js.native
  def xorWith[T](comparator: __, arrays: Null, arrays2: List[T]): LodashXorWith1x6[T] = js.native
  def xorWith[T](comparator: __, arrays: List[T]): LodashXorWith1x2[T] = js.native
  def xorWith[T](comparator: __, arrays: List[T], arrays2: List[T]): LodashXorWith1x6[T] = js.native
  def xorWith[T](comparator: __, arrays: __): LodashXorWith1x4[T] = js.native
  def xorWith[T](comparator: __, arrays: __, arrays2: List[T]): LodashXorWith1x4[T] = js.native
  @JSName("xorWith")
  var xorWith_Original: LodashXorWith = js.native
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x1[T](comparator: Comparator[T]): LodashXorWith1x1[T] = js.native
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x3[T](comparator: Comparator[T]): LodashXorWith1x3[T] = js.native
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x3[T](comparator: Comparator[T], arrays: List[T]): LodashXorWith1x3[T] = js.native
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x6[T](comparator: __): LodashXorWith1x6[T] = js.native
  @JSName("xorWith")
  def xorWith_T_LodashXorWith1x6[T](comparator: __, arrays: List[T]): LodashXorWith1x6[T] = js.native
  
  @JSName("xor")
  var xor_Original: LodashXor = js.native
  @JSName("xor")
  def xor_T_LodashXor1x1[T](): LodashXor1x1[T] = js.native
  @JSName("xor")
  def xor_T_LodashXor1x1[T](arrays2: List[T]): LodashXor1x1[T] = js.native
  
  def zip[T1](arrays1: List[T1]): LodashZip1x1[T1] = js.native
  def zip[T2](arrays1: __, arrays2: List[T2]): LodashZip1x2[T2] = js.native
  def zip[T1, T2](arrays1: List[T1], arrays2: List[T2]): js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]] = js.native
  
  def zipAll[T](arrays: js.Array[js.UndefOr[List[T] | Null]]): js.Array[js.Array[js.UndefOr[T]]] = js.native
  def zipAll[T1, T2](arrays1: js.Tuple2[List[T1], List[T2]]): js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]] = js.native
  def zipAll[T1, T2, T3](arrays1: js.Tuple3[List[T1], List[T2], List[T3]]): js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]] = js.native
  def zipAll[T1, T2, T3, T4](arrays1: js.Tuple4[List[T1], List[T2], List[T3], List[T4]]): js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]] = js.native
  def zipAll[T1, T2, T3, T4, T5](arrays1: js.Tuple5[List[T1], List[T2], List[T3], List[T4], List[T5]]): js.Array[
    js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
  ] = js.native
  @JSName("zipAll")
  var zipAll_Original: LodashZipAll = js.native
  
  def zipObj(props: List[PropertyName]): LodashZipObject1x1 = js.native
  def zipObj[T](props: List[PropertyName], values: List[T]): Dictionary[T] = js.native
  def zipObj[T](props: __, values: List[T]): LodashZipObject1x2[T] = js.native
  @JSName("zipObj")
  var zipObj_Original: LodashZipObject = js.native
  
  def zipObject(props: List[PropertyName]): LodashZipObject1x1 = js.native
  def zipObject[T](props: List[PropertyName], values: List[T]): Dictionary[T] = js.native
  def zipObject[T](props: __, values: List[T]): LodashZipObject1x2[T] = js.native
  
  def zipObjectDeep(paths: List[PropertyPath]): LodashZipObjectDeep1x1 = js.native
  def zipObjectDeep(paths: List[PropertyPath], values: List[_]): js.Object = js.native
  def zipObjectDeep(paths: __, values: List[_]): LodashZipObjectDeep1x2 = js.native
  @JSName("zipObjectDeep")
  var zipObjectDeep_Original: LodashZipObjectDeep = js.native
  
  @JSName("zipObject")
  var zipObject_Original: LodashZipObject = js.native
  
  def zipWith[T1](iteratee: __, arrays1: List[T1]): LodashZipWith1x2[T1] = js.native
  def zipWith[T2](iteratee: __, arrays1: __, arrays2: List[T2]): LodashZipWith1x4[T2] = js.native
  def zipWith[T1, T2](iteratee: __, arrays1: List[T1], arrays2: List[T2]): LodashZipWith1x6[T1, T2] = js.native
  def zipWith[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]): LodashZipWith1x1[T1, T2, TResult] = js.native
  def zipWith[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult], arrays1: List[T1]): LodashZipWith1x3[T2, TResult] = js.native
  def zipWith[T1, T2, TResult](
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult],
    arrays1: List[T1],
    arrays2: List[T2]
  ): js.Array[TResult] = js.native
  def zipWith[T1, T2, TResult](iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult], arrays1: __, arrays2: List[T2]): LodashZipWith1x5[T1, TResult] = js.native
  @JSName("zipWith")
  var zipWith_Original: LodashZipWith = js.native
  
  @JSName("zip")
  var zip_Original: LodashZip = js.native
}
