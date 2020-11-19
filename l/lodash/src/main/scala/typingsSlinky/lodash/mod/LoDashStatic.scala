package typingsSlinky.lodash.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.lodash.anon.Call
import typingsSlinky.lodash.anon.FnCall
import typingsSlinky.lodash.anon.FnCallCollectionIteratee
import typingsSlinky.lodash.anon.FnCallValue
import typingsSlinky.lodash.anon.Typeoflodash
import typingsSlinky.lodash.lodashBooleans.`false`
import typingsSlinky.lodash.lodashBooleans.`true`
import typingsSlinky.lodash.lodashNumbers.`0`
import typingsSlinky.lodash.lodashStrings._empty
import typingsSlinky.lodash.lodashStrings.asc
import typingsSlinky.lodash.lodashStrings.desc
import typingsSlinky.std.Exclude
import typingsSlinky.std.NonNullable
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-empty-interface (This will be augmented)
// chunk
// compact
// concat
// difference
// differenceBy
// differenceWith
// drop
// dropRight
// dropRightWhile
// dropWhile
// fill
// findIndex
// findLastIndex
// first
// flatten
// flattenDeep
// flattenDepth
// fromPairs
// head
// indexOf
// initial
// intersection
// intersectionBy
// intersectionWith
// join
// last
// lastIndexOf
// nth
// pull
// pullAll
// pullAllBy
// pullAllWith
// pullAt
// remove
// reverse
// slice
// sortedIndex
// sortedIndexBy
// _.sortedIndexBy
// sortedIndexOf
// sortedLastIndex
// sortedLastIndexBy
// sortedLastIndexOf
// sortedUniq
// sortedUniqBy
// tail
// take
// takeRight
// takeRightWhile
// takeWhile
// union
// unionBy
// unionWith
// uniq
// uniqBy
// uniqWith
// unzip
// unzipWith
// without
// xor
// xorBy
// xorWith
// zip
// zipObject
// zipObjectDeep
// zipWith
// countBy
// each
// eachRight
// every
// filter
// find
// findLast
// flatMap
// flatMapDeep
// flatMapDepth
// forEach
// forEachRight
// groupBy
// includes
// invokeMap
// keyBy
// map
// orderBy
// partition
// reduce
// reduceRight
// reject
// sample
// sampleSize
// shuffle
// size
// some
// sortBy
// now
// after
// ary
// before
// defer
// delay
// flip
// negate
// once
// overArgs
// partial
// partialRight
// rearg
// rest
// spread
// unary
// wrap
// castArray
// clone
// cloneDeep
// conformsTo
// eq
// gt
// gte
// isArguments
// isArray
// isArrayBuffer
// isArrayLike
// isArrayLikeObject
// isBoolean
// isBuffer
// isDate
// isElement
// isEmpty
// isEqual
// isError
// isFinite
// isFunction
// isInteger
// isLength
// isMap
// isMatch
// isNaN
// isNative
// isNil
// isNull
// isNumber
// isObject
// isObjectLike
// isPlainObject
// isRegExp
// isSafeInteger
// isSet
// isString
// isSymbol
// isTypedArray
// isUndefined
// isWeakMap
// isWeakSet
// lt
// lte
// toArray
// toFinite
// toInteger
// toLength
// toNumber
// toPlainObject
// toSafeInteger
// toString
// add
// ceil
// divide
// floor
// max
// maxBy
// mean
// meanBy
// min
// minBy
// multiply
// round
// subtract
// sum
// sumBy
// clamp
// inRange
// random
// assign
// assignIn
// assignWith
// at
// create
// defaults
// defaultsDeep
// entries
// entriesIn
// extend
// extendWith
// findKey
// findLastKey
// forIn
// forInRight
// forOwn
// forOwnRight
// functions
// functionsIn
// get
// has
// hasIn
// invert
// invertBy
// invoke
// keys
// keysIn
// mapKeys
// mapValues
// merge
// omit
// omitBy
// pick
// pickBy
// result
// set
// toPairs
// toPairsIn
// transform
// unset
// update
// updateWith
// values
// valuesIn
// chain
// prototype.chain
// tap
// thru
// camelCase
// capitalize
// deburr
// endsWith
// escape
// escapeRegExp
// kebabCase
// lowerCase
// lowerFirst
// pad
// padEnd
// padStart
// parseInt
// repeat
// replace
// snakeCase
// split
// startCase
// startsWith
// toLower
// toUpper
// trim
// trimEnd
// trimStart
// unescape
// upperCase
// upperFirst
// words
// attempt
// bindAll
// cond
// constant
// defaultTo
// flow
// flowRight
// identity
// iteratee
// matches
// matchesProperty
// method
// methodOf
// noConflict
// noop
// nthArg
// over
// overEvery
// overSome
// property
// propertyOf
// range
// rangeRight
// runInContext
// stubArray
// stubFalse
// stubObject
// stubString
// stubTrue
// times
// toPath
// uniqueId
// stubTrue
// stubFalse
@js.native
trait LoDashStatic extends js.Object {
  
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
  def apply[T](value: T): LoDashImplicitWrapper[T] = js.native
  
  /**
    * The semantic version number.
    **/
  var VERSION: String = js.native
  
  /**
    * Adds two numbers.
    *
    * @param augend The first number to add.
    * @param addend The second number to add.
    * @return Returns the sum.
    */
  def add(augend: Double, addend: Double): Double = js.native
  
  /**
    * The opposite of _.before; this method creates a function that invokes func once it’s called n or more times.
    *
    * @param n The number of calls before func is invoked.
    * @param func The function to restrict.
    * @return Returns the new restricted function.
    */
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](n: Double, func: TFunc): TFunc = js.native
  
  /**
    * Creates a function that accepts up to n arguments ignoring any additional arguments.
    *
    * @param func The function to cap arguments for.
    * @param n The arity cap.
    * @returns Returns the new function.
    */
  def ary(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def ary(func: js.Function1[/* repeated */ js.Any, _], n: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  
  /**
    * @see _.assign
    */
  def assign(`object`: js.Any, otherArgs: js.Any*): js.Any = js.native
  /**
    * @see _.assign
    */
  def assign[TObject](`object`: TObject): TObject = js.native
  /**
    * Assigns own enumerable properties of source objects to the destination
    * object. Source objects are applied from left to right. Subsequent sources
    * overwrite property assignments of previous sources.
    *
    * **Note:** This method mutates `object` and is loosely based on
    * [`Object.assign`](https://mdn.io/Object/assign).
    *
    * @category Object
    * @param object The destination object.
    * @param [sources] The source objects.
    * @returns Returns `object`.
    * @example
    *
    * function Foo() {
    *   this.c = 3;
    * }
    *
    * function Bar() {
    *   this.e = 5;
    * }
    *
    * Foo.prototype.d = 4;
    * Bar.prototype.f = 6;
    *
    * _.assign({ 'a': 1 }, new Foo, new Bar);
    * // => { 'a': 1, 'c': 3, 'e': 5 }
    */
  def assign[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  /**
    * @see assign
    */
  def assign[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2): TObject with TSource1 with TSource2 = js.native
  /**
    * @see assign
    */
  def assign[TObject, TSource1, TSource2, TSource3](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see assign
    */
  def assign[TObject, TSource1, TSource2, TSource3, TSource4](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * @see _.assignIn
    */
  def assignIn[TObject](`object`: TObject): TObject = js.native
  /**
    * @see _.assignIn
    */
  def assignIn[TResult](`object`: js.Any, otherArgs: js.Any*): TResult = js.native
  /**
    * This method is like `_.assign` except that it iterates over own and
    * inherited source properties.
    *
    * **Note:** This method mutates `object`.
    *
    * @alias extend
    * @category Object
    * @param object The destination object.
    * @param [sources] The source objects.
    * @returns Returns `object`.
    * @example
    *
    * function Foo() {
    *   this.b = 2;
    * }
    *
    * function Bar() {
    *   this.d = 4;
    * }
    *
    * Foo.prototype.c = 3;
    * Bar.prototype.e = 5;
    *
    * _.assignIn({ 'a': 1 }, new Foo, new Bar);
    * // => { 'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5 }
    */
  def assignIn[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  /**
    * @see assignIn
    */
  def assignIn[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2): TObject with TSource1 with TSource2 = js.native
  /**
    * @see assignIn
    */
  def assignIn[TObject, TSource1, TSource2, TSource3](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see assignIn
    */
  def assignIn[TObject, TSource1, TSource2, TSource3, TSource4](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * @see _.assignInWith
    */
  def assignInWith[TObject](`object`: TObject): TObject = js.native
  /**
    * @see _.assignInWith
    */
  def assignInWith[TResult](`object`: js.Any, otherArgs: js.Any*): TResult = js.native
  /**
    * This method is like `_.assignIn` except that it accepts `customizer` which
    * is invoked to produce the assigned values. If `customizer` returns `undefined`
    * assignment is handled by the method instead. The `customizer` is invoked
    * with five arguments: (objValue, srcValue, key, object, source).
    *
    * **Note:** This method mutates `object`.
    *
    * @alias extendWith
    * @category Object
    * @param object The destination object.
    * @param sources The source objects.
    * @param [customizer] The function to customize assigned values.
    * @returns Returns `object`.
    * @example
    *
    * function customizer(objValue, srcValue) {
    *   return _.isUndefined(objValue) ? srcValue : objValue;
    * }
    *
    * var defaults = _.partialRight(_.assignInWith, customizer);
    *
    * defaults({ 'a': 1 }, { 'b': 2 }, { 'a': 3 });
    * // => { 'a': 1, 'b': 2 }
    */
  def assignInWith[TObject, TSource](`object`: TObject, source: TSource, customizer: AssignCustomizer): TObject with TSource = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2, customizer: AssignCustomizer): TObject with TSource1 with TSource2 = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TObject, TSource1, TSource2, TSource3](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: AssignCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see assignInWith
    */
  def assignInWith[TObject, TSource1, TSource2, TSource3, TSource4](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * @see _.assignWith
    */
  def assignWith[TObject](`object`: TObject): TObject = js.native
  /**
    * @see _.assignWith
    */
  def assignWith[TResult](`object`: js.Any, otherArgs: js.Any*): TResult = js.native
  /**
    * This method is like `_.assign` except that it accepts `customizer` which
    * is invoked to produce the assigned values. If `customizer` returns `undefined`
    * assignment is handled by the method instead. The `customizer` is invoked
    * with five arguments: (objValue, srcValue, key, object, source).
    *
    * **Note:** This method mutates `object`.
    *
    * @category Object
    * @param object The destination object.
    * @param sources The source objects.
    * @param [customizer] The function to customize assigned values.
    * @returns Returns `object`.
    * @example
    *
    * function customizer(objValue, srcValue) {
    *   return _.isUndefined(objValue) ? srcValue : objValue;
    * }
    *
    * var defaults = _.partialRight(_.assignWith, customizer);
    *
    * defaults({ 'a': 1 }, { 'b': 2 }, { 'a': 3 });
    * // => { 'a': 1, 'b': 2 }
    */
  def assignWith[TObject, TSource](`object`: TObject, source: TSource, customizer: AssignCustomizer): TObject with TSource = js.native
  /**
    * @see assignWith
    */
  def assignWith[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2, customizer: AssignCustomizer): TObject with TSource1 with TSource2 = js.native
  /**
    * @see assignWith
    */
  def assignWith[TObject, TSource1, TSource2, TSource3](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: AssignCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see assignWith
    */
  def assignWith[TObject, TSource1, TSource2, TSource3, TSource4](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * @see _.at
    */
  def at[T /* <: js.Object */](`object`: T, props: (Many[/* keyof T */ String])*): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def at[T /* <: js.Object */](`object`: js.UndefOr[scala.Nothing], props: (Many[/* keyof T */ String])*): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def at[T /* <: js.Object */](`object`: Null, props: (Many[/* keyof T */ String])*): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def at[T](`object`: Dictionary[T], props: PropertyPath*): js.Array[T] = js.native
  /**
    * Creates an array of elements corresponding to the given keys, or indexes, of collection. Keys may be
    * specified as individual arguments or as arrays of keys.
    *
    * @param object The object to iterate over.
    * @param props The property names or indexes of elements to pick, specified individually or in arrays.
    * @return Returns the new array of picked elements.
    */
  def at[T](`object`: List[T], props: PropertyPath*): js.Array[T] = js.native
  def at[T](`object`: NumericDictionary[T], props: PropertyPath*): js.Array[T] = js.native
  @JSName("at")
  def at_T[T](`object`: js.UndefOr[scala.Nothing], props: PropertyPath*): js.Array[T] = js.native
  @JSName("at")
  def at_T[T](`object`: Null, props: PropertyPath*): js.Array[T] = js.native
  
  /**
    * Attempts to invoke func, returning either the result or the caught error object. Any additional arguments
    * are provided to func when it’s invoked.
    *
    * @param func The function to attempt.
    * @return Returns the func result or error object.
    */
  def attempt[TResult](func: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): TResult | js.Error = js.native
  
  /**
    * Creates a function that invokes func, with the this binding and arguments of the created function, while
    * it’s called less than n times. Subsequent calls to the created function return the result of the last func
    * invocation.
    *
    * @param n The number of calls at which func is no longer invoked.
    * @param func The function to restrict.
    * @return Returns the new restricted function.
    */
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](n: Double, func: TFunc): TFunc = js.native
  
  /**
    * Creates a function that invokes func with the this binding of thisArg and prepends any additional _.bind
    * arguments to those provided to the bound function.
    *
    * The _.bind.placeholder value, which defaults to _ in monolithic builds, may be used as a placeholder for
    * partially applied arguments.
    *
    * Note: Unlike native Function#bind this method does not set the "length" property of bound functions.
    *
    * @param func The function to bind.
    * @param thisArg The this binding of func.
    * @param partials The arguments to be partially applied.
    * @return Returns the new bound function.
    */
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisArg: js.Any, partials: js.Any*): js.Function1[/* repeated */ js.Any, _] = js.native
  
  /**
    * Binds methods of an object to the object itself, overwriting the existing method. Method names may be
    * specified as individual arguments or as arrays of method names. If no method names are provided all
    * enumerable function properties, own and inherited, of object are bound.
    *
    * Note: This method does not set the "length" property of bound functions.
    *
    * @param object The object to bind and assign the bound methods to.
    * @param methodNames The object method names to bind, specified as individual method names or arrays of
    * method names.
    * @return Returns object.
    */
  def bindAll[T](`object`: T, methodNames: Many[String]*): T = js.native
  
  /**
    * Creates a function that invokes the method at object[key] and prepends any additional _.bindKey arguments
    * to those provided to the bound function.
    *
    * This method differs from _.bind by allowing bound functions to reference methods that may be redefined
    * or don’t yet exist. See Peter Michaux’s article for more details.
    *
    * The _.bindKey.placeholder value, which defaults to _ in monolithic builds, may be used as a placeholder
    * for partially applied arguments.
    *
    * @param object The object the method belongs to.
    * @param key The key of the method.
    * @param partials The arguments to be partially applied.
    * @return Returns the new bound function.
    */
  def bindKey(`object`: js.Object, key: String, partials: js.Any*): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Creates a function that invokes the method at object[key] and prepends any additional _.bindKey arguments
    * to those provided to the bound function.
    *
    * This method differs from _.bind by allowing bound functions to reference methods that may be redefined
    * or don’t yet exist. See Peter Michaux’s article for more details.
    *
    * The _.bindKey.placeholder value, which defaults to _ in monolithic builds, may be used as a placeholder
    * for partially applied arguments.
    *
    * @param object The object the method belongs to.
    * @param key The key of the method.
    * @param partials The arguments to be partially applied.
    * @return Returns the new bound function.
    */
  @JSName("bindKey")
  var bindKey_Original: FunctionBindKey = js.native
  
  /**
    * Creates a function that invokes func with the this binding of thisArg and prepends any additional _.bind
    * arguments to those provided to the bound function.
    *
    * The _.bind.placeholder value, which defaults to _ in monolithic builds, may be used as a placeholder for
    * partially applied arguments.
    *
    * Note: Unlike native Function#bind this method does not set the "length" property of bound functions.
    *
    * @param func The function to bind.
    * @param thisArg The this binding of func.
    * @param partials The arguments to be partially applied.
    * @return Returns the new bound function.
    */
  @JSName("bind")
  var bind_Original: FunctionBind = js.native
  
  /**
    * Converts string to camel case.
    *
    * @param string The string to convert.
    * @return Returns the camel cased string.
    */
  def camelCase(): String = js.native
  def camelCase(string: String): String = js.native
  
  /**
    * Converts the first character of string to upper case and the remaining to lower case.
    *
    * @param string The string to capitalize.
    * @return Returns the capitalized string.
    */
  def capitalize(): String = js.native
  def capitalize(string: String): String = js.native
  
  /**
    * Casts value as an array if it’s not one.
    *
    * @param value The value to inspect.
    * @return Returns the cast array.
    */
  def castArray[T](): js.Array[T] = js.native
  def castArray[T](value: Many[T]): js.Array[T] = js.native
  
  /**
    * Calculates n rounded up to precision.
    *
    * @param n The number to round up.
    * @param precision The precision to round up to.
    * @return Returns the rounded up number.
    */
  def ceil(n: Double): Double = js.native
  def ceil(n: Double, precision: Double): Double = js.native
  
  /**
    * Creates a lodash object that wraps value with explicit method chaining enabled.
    *
    * @param value The value to wrap.
    * @return Returns the new lodash wrapper instance.
    */
  def chain[T](value: T): LoDashExplicitWrapper[T] = js.native
  
  /**
    * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
    * final chunk will be the remaining elements.
    *
    * @param array The array to process.
    * @param size The length of each chunk.
    * @return Returns the new array containing chunks.
    */
  def chunk[T](): js.Array[js.Array[T]] = js.native
  def chunk[T](array: js.UndefOr[scala.Nothing], size: Double): js.Array[js.Array[T]] = js.native
  def chunk[T](array: Null, size: Double): js.Array[js.Array[T]] = js.native
  def chunk[T](array: List[T]): js.Array[js.Array[T]] = js.native
  def chunk[T](array: List[T], size: Double): js.Array[js.Array[T]] = js.native
  
  /**
    * Clamps `number` within the inclusive `lower` and `upper` bounds.
    *
    * @category Number
    * @param number The number to clamp.
    * @param [lower] The lower bound.
    * @param upper The upper bound.
    * @returns Returns the clamped number.
    * @example
    *
    * _.clamp(-10, -5, 5);
    * // => -5
    *
    * _.clamp(10, -5, 5);
    * // => 5
    */
  def clamp(number: Double, lower: Double, upper: Double): Double = js.native
  def clamp(number: Double, upper: Double): Double = js.native
  
  /**
    * Creates a shallow clone of value.
    *
    * Note: This method is loosely based on the structured clone algorithm and supports cloning arrays,
    * array buffers, booleans, date objects, maps, numbers, Object objects, regexes, sets, strings, symbols,
    * and typed arrays. The own enumerable properties of arguments objects are cloned as plain objects. An empty
    * object is returned for uncloneable values such as error objects, functions, DOM nodes, and WeakMaps.
    *
    * @param value The value to clone.
    * @return Returns the cloned value.
    */
  def clone[T](value: T): T = js.native
  
  /**
    * This method is like _.clone except that it recursively clones value.
    *
    * @param value The value to recursively clone.
    * @return Returns the deep cloned value.
    */
  def cloneDeep[T](value: T): T = js.native
  
  /**
    * @see _.cloneDeepWith
    */
  def cloneDeepWith[T](value: T): T = js.native
  /**
    * This method is like _.cloneWith except that it recursively clones value.
    *
    * @param value The value to recursively clone.
    * @param customizer The function to customize cloning.
    * @return Returns the deep cloned value.
    */
  def cloneDeepWith[T](value: T, customizer: CloneDeepWithCustomizer[T]): js.Any = js.native
  
  /**
    * @see _.cloneWith
    */
  def cloneWith[T](value: T): T = js.native
  /**
    * This method is like _.clone except that it accepts customizer which is invoked to produce the cloned value.
    * If customizer returns undefined cloning is handled by the method instead.
    *
    * @param value The value to clone.
    * @param customizer The function to customize cloning.
    * @return Returns the cloned value.
    */
  def cloneWith[T, TResult /* <: js.Object | String | Double | Boolean | Null */](value: T, customizer: CloneWithCustomizer[T, TResult]): TResult = js.native
  /**
    * @see _.cloneWith
    */
  @JSName("cloneWith")
  def cloneWith_TTResult_Union[T, TResult](value: T, customizer: CloneWithCustomizer[T, js.UndefOr[TResult]]): TResult | T = js.native
  
  /**
    * Creates an array with all falsey values removed. The values false, null, 0, "", undefined, and NaN are
    * falsey.
    *
    * @param array The array to compact.
    * @return Returns the new array of filtered values.
    */
  def compact[T](): js.Array[T] = js.native
  def compact[T](array: List[js.UndefOr[T | Null | `false` | _empty | `0`]]): js.Array[T] = js.native
  
  /**
    * Creates a new array concatenating `array` with any additional arrays
    * and/or values.
    *
    * @category Array
    * @param array The array to concatenate.
    * @param [values] The values to concatenate.
    * @returns Returns the new concatenated array.
    * @example
    *
    * var array = [1];
    * var other = _.concat(array, 2, [3], [[4]]);
    *
    * console.log(other);
    * // => [1, 2, 3, [4]]
    *
    * console.log(array);
    * // => [1]
    */
  def concat[T](array: Many[T], values: Many[T]*): js.Array[T] = js.native
  
  /**
    * Creates a function that iterates over `pairs` and invokes the corresponding
    * function of the first predicate to return truthy. The predicate-function
    * pairs are invoked with the `this` binding and arguments of the created
    * function.
    *
    * @since 4.0.0
    * @category Util
    * @param pairs The predicate-function pairs.
    * @returns Returns the new composite function.
    * @example
    *
    * var func = _.cond([
    *   [_.matches({ 'a': 1 }),           _.constant('matches A')],
    *   [_.conforms({ 'b': _.isNumber }), _.constant('matches B')],
    *   [_.stubTrue,                      _.constant('no match')]
    * ]);
    *
    * func({ 'a': 1, 'b': 2 });
    * // => 'matches A'
    *
    * func({ 'a': 0, 'b': 1 });
    * // => 'matches B'
    *
    * func({ 'a': '1', 'b': '2' });
    * // => 'no match'
    */
  def cond[T, R](pairs: js.Array[CondPair[T, R]]): js.Function1[/* Target */ T, R] = js.native
  
  /**
    * Creates a function that invokes the predicate properties of `source` with the corresponding
    * property values of a given object, returning true if all predicates return truthy, else false.
    */
  def conforms[T](source: ConformsPredicateObject[T]): js.Function1[/* value */ T, Boolean] = js.native
  
  /**
    * Checks if object conforms to source by invoking the predicate properties of source with the
    * corresponding property values of object.
    *
    * Note: This method is equivalent to _.conforms when source is partially applied.
    */
  def conformsTo[T](`object`: T, source: ConformsPredicateObject[T]): Boolean = js.native
  
  /**
    * Creates a function that returns value.
    *
    * @param value The value to return from the new function.
    * @return Returns the new function.
    */
  def constant[T](value: T): js.Function0[T] = js.native
  
  /**
    * Creates an object composed of keys generated from the results of running each element of collection through
    * iteratee. The corresponding value of each key is the number of times the key was returned by iteratee. The
    * iteratee is invoked with one argument: (value).
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns the composed aggregate object.
    */
  def countBy[T](): Dictionary[Double] = js.native
  def countBy[T /* <: js.Object */](collection: T): Dictionary[Double] = js.native
  def countBy[T /* <: js.Object */](
    collection: T,
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[Double] = js.native
  def countBy[T](collection: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): Dictionary[Double] = js.native
  def countBy[T](collection: Null, iteratee: ValueIteratee[T]): Dictionary[Double] = js.native
  def countBy[T](collection: List[T]): Dictionary[Double] = js.native
  def countBy[T](collection: List[T], iteratee: ValueIteratee[T]): Dictionary[Double] = js.native
  /**
    * @see _.countBy
    */
  @JSName("countBy")
  def countBy_T_Object[T /* <: js.Object */](): Dictionary[Double] = js.native
  @JSName("countBy")
  def countBy_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[Double] = js.native
  @JSName("countBy")
  def countBy_T_Object[T /* <: js.Object */](
    collection: Null,
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[Double] = js.native
  
  /**
    * Creates an object that inherits from the given prototype object. If a properties object is provided its own
    * enumerable properties are assigned to the created object.
    *
    * @param prototype The object to inherit from.
    * @param properties The properties to assign to the object.
    * @return Returns the new object.
    */
  def create[T /* <: js.Object */, U /* <: js.Object */](prototype: T): T with U = js.native
  def create[T /* <: js.Object */, U /* <: js.Object */](prototype: T, properties: U): T with U = js.native
  
  /**
    * Creates a function that accepts one or more arguments of func that when called either invokes func returning
    * its result, if all func arguments have been provided, or returns a function that accepts one or more of the
    * remaining func arguments, and so on. The arity of func may be specified if func.length is not sufficient.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curry(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def curry(func: js.Function1[/* repeated */ js.Any, _], arity: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Creates a function that accepts one or more arguments of func that when called either invokes func returning
    * its result, if all func arguments have been provided, or returns a function that accepts one or more of the
    * remaining func arguments, and so on. The arity of func may be specified if func.length is not sufficient.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curry[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): CurriedFunction2[T1, T2, R] = js.native
  def curry[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R], arity: Double): CurriedFunction2[T1, T2, R] = js.native
  /**
    * Creates a function that accepts one or more arguments of func that when called either invokes func returning
    * its result, if all func arguments have been provided, or returns a function that accepts one or more of the
    * remaining func arguments, and so on. The arity of func may be specified if func.length is not sufficient.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curry[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): CurriedFunction3[T1, T2, T3, R] = js.native
  def curry[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R], arity: Double): CurriedFunction3[T1, T2, T3, R] = js.native
  /**
    * Creates a function that accepts one or more arguments of func that when called either invokes func returning
    * its result, if all func arguments have been provided, or returns a function that accepts one or more of the
    * remaining func arguments, and so on. The arity of func may be specified if func.length is not sufficient.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curry[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): CurriedFunction4[T1, T2, T3, T4, R] = js.native
  def curry[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R], arity: Double): CurriedFunction4[T1, T2, T3, T4, R] = js.native
  /**
    * Creates a function that accepts one or more arguments of func that when called either invokes func returning
    * its result, if all func arguments have been provided, or returns a function that accepts one or more of the
    * remaining func arguments, and so on. The arity of func may be specified if func.length is not sufficient.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curry[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): CurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  def curry[T1, T2, T3, T4, T5, R](
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R],
    arity: Double
  ): CurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  
  /**
    * This method is like _.curry except that arguments are applied to func in the manner of _.partialRight
    * instead of _.partial.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curryRight(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def curryRight(func: js.Function1[/* repeated */ js.Any, _], arity: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * This method is like _.curry except that arguments are applied to func in the manner of _.partialRight
    * instead of _.partial.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curryRight[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): RightCurriedFunction2[T1, T2, R] = js.native
  def curryRight[T1, T2, R](func: js.Function2[/* t1 */ T1, /* t2 */ T2, R], arity: Double): RightCurriedFunction2[T1, T2, R] = js.native
  /**
    * This method is like _.curry except that arguments are applied to func in the manner of _.partialRight
    * instead of _.partial.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curryRight[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): RightCurriedFunction3[T1, T2, T3, R] = js.native
  def curryRight[T1, T2, T3, R](func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R], arity: Double): RightCurriedFunction3[T1, T2, T3, R] = js.native
  /**
    * This method is like _.curry except that arguments are applied to func in the manner of _.partialRight
    * instead of _.partial.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curryRight[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): RightCurriedFunction4[T1, T2, T3, T4, R] = js.native
  def curryRight[T1, T2, T3, T4, R](func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R], arity: Double): RightCurriedFunction4[T1, T2, T3, T4, R] = js.native
  /**
    * This method is like _.curry except that arguments are applied to func in the manner of _.partialRight
    * instead of _.partial.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  def curryRight[T1, T2, T3, T4, T5, R](func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): RightCurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  def curryRight[T1, T2, T3, T4, T5, R](
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R],
    arity: Double
  ): RightCurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  @JSName("curryRight")
  var curryRight_Original: CurryRight = js.native
  /**
    * This method is like _.curry except that arguments are applied to func in the manner of _.partialRight
    * instead of _.partial.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  @JSName("curryRight")
  def curryRight_T1R_RightCurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R]): RightCurriedFunction1[T1, R] = js.native
  @JSName("curryRight")
  def curryRight_T1R_RightCurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R], arity: Double): RightCurriedFunction1[T1, R] = js.native
  
  @JSName("curry")
  var curry_Original: Curry = js.native
  /**
    * Creates a function that accepts one or more arguments of func that when called either invokes func returning
    * its result, if all func arguments have been provided, or returns a function that accepts one or more of the
    * remaining func arguments, and so on. The arity of func may be specified if func.length is not sufficient.
    * @param func The function to curry.
    * @param arity The arity of func.
    * @return Returns the new curried function.
    */
  @JSName("curry")
  def curry_T1R_CurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R]): CurriedFunction1[T1, R] = js.native
  @JSName("curry")
  def curry_T1R_CurriedFunction1[T1, R](func: js.Function1[/* t1 */ T1, R], arity: Double): CurriedFunction1[T1, R] = js.native
  
  /**
    * Creates a debounced function that delays invoking func until after wait milliseconds have elapsed since
    * the last time the debounced function was invoked. The debounced function comes with a cancel method to
    * cancel delayed invocations and a flush method to immediately invoke them. Provide an options object to
    * indicate that func should be invoked on the leading and/or trailing edge of the wait timeout. Subsequent
    * calls to the debounced function return the result of the last func invocation.
    *
    * Note: If leading and trailing options are true, func is invoked on the trailing edge of the timeout only
    * if the the debounced function is invoked more than once during the wait timeout.
    *
    * See David Corbacho’s article for details over the differences between _.debounce and _.throttle.
    *
    * @param func The function to debounce.
    * @param wait The number of milliseconds to delay.
    * @param options The options object.
    * @param options.leading Specify invoking on the leading edge of the timeout.
    * @param options.maxWait The maximum time func is allowed to be delayed before it’s invoked.
    * @param options.trailing Specify invoking on the trailing edge of the timeout.
    * @return Returns the new debounced function.
    */
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T with Cancelable = js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: js.UndefOr[scala.Nothing], options: DebounceSettings): T with Cancelable = js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double): T with Cancelable = js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double, options: DebounceSettings): T with Cancelable = js.native
  
  /**
    * Deburrs string by converting latin-1 supplementary letters to basic latin letters and removing combining
    * diacritical marks.
    *
    * @param string The string to deburr.
    * @return Returns the deburred string.
    */
  def deburr(): String = js.native
  def deburr(string: String): String = js.native
  
  /**
    * Checks `value` to determine whether a default value should be returned in
    * its place. The `defaultValue` is returned if `value` is `NaN`, `null`,
    * or `undefined`.
    *
    * @param value The value to check.
    * @param defaultValue The default value.
    * @returns Returns the resolved value.
    */
  def defaultTo[T](value: T, defaultValue: T): T = js.native
  def defaultTo[T](value: js.UndefOr[scala.Nothing], defaultValue: T): T = js.native
  def defaultTo[T](value: Null, defaultValue: T): T = js.native
  /**
    * @see _.defaultTo
    */
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](value: T, defaultValue: TDefault): T | TDefault = js.native
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](value: js.UndefOr[scala.Nothing], defaultValue: TDefault): T | TDefault = js.native
  @JSName("defaultTo")
  def defaultTo_TTDefault_Union[T, TDefault](value: Null, defaultValue: TDefault): T | TDefault = js.native
  
  /**
    * @see _.defaults
    */
  def defaults(`object`: js.Any, sources: js.Any*): js.Any = js.native
  /**
    * @see _.defaults
    */
  def defaults[TObject](`object`: TObject): NonNullable[TObject] = js.native
  /**
    * Assigns own enumerable properties of source object(s) to the destination object for all destination
    * properties that resolve to undefined. Once a property is set, additional values of the same property are
    * ignored.
    *
    * Note: This method mutates object.
    *
    * @param object The destination object.
    * @param sources The source objects.
    * @return The destination object.
    */
  def defaults[TObject, TSource](`object`: TObject, source: TSource): NonNullable[TSource with TObject] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2): NonNullable[TSource2 with TSource1 with TObject] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TObject, TSource1, TSource2, TSource3](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3): NonNullable[TSource3 with TSource2 with TSource1 with TObject] = js.native
  /**
    * @see _.defaults
    */
  def defaults[TObject, TSource1, TSource2, TSource3, TSource4](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): NonNullable[TSource4 with TSource3 with TSource2 with TSource1 with TObject] = js.native
  
  /**
    * This method is like _.defaults except that it recursively assigns default properties.
    * @param object The destination object.
    * @param sources The source objects.
    * @return Returns object.
    **/
  def defaultsDeep(`object`: js.Any, sources: js.Any*): js.Any = js.native
  
  /**
    * Defers invoking the func until the current call stack has cleared. Any additional arguments are provided to
    * func when it’s invoked.
    *
    * @param func The function to defer.
    * @param args The arguments to invoke the function with.
    * @return Returns the timer id.
    */
  def defer(func: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Double = js.native
  
  /**
    * Invokes func after wait milliseconds. Any additional arguments are provided to func when it’s invoked.
    *
    * @param func The function to delay.
    * @param wait The number of milliseconds to delay invocation.
    * @param args The arguments to invoke the function with.
    * @return Returns the timer id.
    */
  def delay(func: js.Function1[/* repeated */ js.Any, _], wait: Double, args: js.Any*): Double = js.native
  
  def difference[T](array: js.UndefOr[scala.Nothing], values: List[T]*): js.Array[T] = js.native
  def difference[T](array: Null, values: List[T]*): js.Array[T] = js.native
  /**
    * Creates an array of unique array values not included in the other provided arrays using SameValueZero for
    * equality comparisons.
    *
    * @param array The array to inspect.
    * @param values The arrays of values to exclude.
    * @return Returns the new array of filtered values.
    */
  def difference[T](array: List[T], values: List[T]*): js.Array[T] = js.native
  
  def differenceBy[T](array: js.UndefOr[scala.Nothing], values: List[T]*): js.Array[T] = js.native
  def differenceBy[T](array: Null, values: List[T]*): js.Array[T] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T](array: List[T], values: List[T]*): js.Array[T] = js.native
  def differenceBy[T1, T2](array: js.UndefOr[scala.Nothing], values: List[T2], iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  def differenceBy[T1, T2](array: Null, values: List[T2], iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  /**
    * This method is like _.difference except that it accepts iteratee which is invoked for each element of array
    * and values to generate the criterion by which uniqueness is computed. The iteratee is invoked with one
    * argument: (value).
    *
    * @param array The array to inspect.
    * @param values The values to exclude.
    * @param iteratee The iteratee invoked per element.
    * @returns Returns the new array of filtered values.
    */
  def differenceBy[T1, T2](array: List[T1], values: List[T2], iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    iteratee: ValueIteratee[T1 | T2 | T3]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3](array: Null, values1: List[T2], values2: List[T3], iteratee: ValueIteratee[T1 | T2 | T3]): js.Array[T1] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3](array: List[T1], values1: List[T2], values2: List[T3], iteratee: ValueIteratee[T1 | T2 | T3]): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): js.Array[T1] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4, T5](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4, T5](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): js.Array[T1] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): js.Array[T1] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    iteratee: ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6]
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): js.Array[T1] = js.native
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): js.Array[T1] = js.native
  /**
    * @see _.differenceBy
    */
  def differenceBy[T1, T2, T3, T4, T5, T6, T7](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values3: List[T4],
    values4: List[T5],
    values5: List[T6],
    values: (List[T7] | (ValueIteratee[T1 | T2 | T3 | T4 | T5 | T6 | T7]))*
  ): js.Array[T1] = js.native
  
  def differenceWith[T](array: js.UndefOr[scala.Nothing], values: List[T]*): js.Array[T] = js.native
  def differenceWith[T](array: Null, values: List[T]*): js.Array[T] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T](array: List[T], values: List[T]*): js.Array[T] = js.native
  def differenceWith[T1, T2](array: js.UndefOr[scala.Nothing], values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  def differenceWith[T1, T2](array: Null, values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  /**
    * Creates an array of unique `array` values not included in the other
    * provided arrays using [`SameValueZero`](http://ecma-international.org/ecma-262/6.0/#sec-samevaluezero)
    * for equality comparisons.
    *
    * @category Array
    * @param [values] The arrays to inspect.
    * @param [comparator] The comparator invoked per element.
    * @returns Returns the new array of filtered values.
    * @example
    *
    * var objects = [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }];
    * _.differenceWith(objects, [{ 'x': 1, 'y': 2 }], _.isEqual);
    * // => [{ 'x': 2, 'y': 1 }]
    */
  def differenceWith[T1, T2](array: List[T1], values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  def differenceWith[T1, T2, T3](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): js.Array[T1] = js.native
  def differenceWith[T1, T2, T3](array: Null, values1: List[T2], values2: List[T3], comparator: Comparator2[T1, T2 | T3]): js.Array[T1] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3](array: List[T1], values1: List[T2], values2: List[T3], comparator: Comparator2[T1, T2 | T3]): js.Array[T1] = js.native
  def differenceWith[T1, T2, T3, T4](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  def differenceWith[T1, T2, T3, T4](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  /**
    * @see _.differenceWith
    */
  def differenceWith[T1, T2, T3, T4](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  
  /**
    * Divide two numbers.
    *
    * @param dividend The first number in a division.
    * @param divisor The second number in a division.
    * @returns Returns the quotient.
    */
  def divide(dividend: Double, divisor: Double): Double = js.native
  
  /**
    * Creates a slice of array with n elements dropped from the beginning.
    *
    * @param array The array to query.
    * @param n The number of elements to drop.
    * @return Returns the slice of array.
    */
  def drop[T](): js.Array[T] = js.native
  def drop[T](array: js.UndefOr[scala.Nothing], n: Double): js.Array[T] = js.native
  def drop[T](array: Null, n: Double): js.Array[T] = js.native
  def drop[T](array: List[T]): js.Array[T] = js.native
  def drop[T](array: List[T], n: Double): js.Array[T] = js.native
  
  /**
    * Creates a slice of array with n elements dropped from the end.
    *
    * @param array The array to query.
    * @param n The number of elements to drop.
    * @return Returns the slice of array.
    */
  def dropRight[T](): js.Array[T] = js.native
  def dropRight[T](array: js.UndefOr[scala.Nothing], n: Double): js.Array[T] = js.native
  def dropRight[T](array: Null, n: Double): js.Array[T] = js.native
  def dropRight[T](array: List[T]): js.Array[T] = js.native
  def dropRight[T](array: List[T], n: Double): js.Array[T] = js.native
  
  /**
    * Creates a slice of array excluding elements dropped from the end. Elements are dropped until predicate
    * returns falsey. The predicate is invoked with three arguments: (value, index, array).
    *
    * @param array The array to query.
    * @param predicate The function invoked per iteration.
    * @return Returns the slice of array.
    */
  def dropRightWhile[T](): js.Array[T] = js.native
  def dropRightWhile[T](array: js.UndefOr[scala.Nothing], predicate: ListIteratee[T]): js.Array[T] = js.native
  def dropRightWhile[T](array: Null, predicate: ListIteratee[T]): js.Array[T] = js.native
  def dropRightWhile[T](array: List[T]): js.Array[T] = js.native
  def dropRightWhile[T](array: List[T], predicate: ListIteratee[T]): js.Array[T] = js.native
  
  /**
    * Creates a slice of array excluding elements dropped from the beginning. Elements are dropped until predicate
    * returns falsey. The predicate is invoked with three arguments: (value, index, array).
    *
    * @param array The array to query.
    * @param predicate The function invoked per iteration.
    * @return Returns the slice of array.
    */
  def dropWhile[T](): js.Array[T] = js.native
  def dropWhile[T](array: js.UndefOr[scala.Nothing], predicate: ListIteratee[T]): js.Array[T] = js.native
  def dropWhile[T](array: Null, predicate: ListIteratee[T]): js.Array[T] = js.native
  def dropWhile[T](array: List[T]): js.Array[T] = js.native
  def dropWhile[T](array: List[T], predicate: ListIteratee[T]): js.Array[T] = js.native
  
  def each(collection: String): String = js.native
  def each(collection: String, iteratee: StringIterator[_]): String = js.native
  def each[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  def each[T /* <: js.Object */](collection: T): T = js.native
  def each[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): T = js.native
  def each[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def each[T](collection: js.Array[T]): js.Array[T] = js.native
  def each[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def each[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def each[T](collection: List[T]): List[T] = js.native
  def each[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
  
  def eachRight(collection: String): String = js.native
  def eachRight(collection: String, iteratee: StringIterator[_]): String = js.native
  def eachRight[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  def eachRight[T /* <: js.Object */](collection: T): T = js.native
  def eachRight[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): T = js.native
  def eachRight[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def eachRight[T](collection: js.Array[T]): js.Array[T] = js.native
  def eachRight[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def eachRight[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def eachRight[T](collection: List[T]): List[T] = js.native
  def eachRight[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
  @JSName("eachRight")
  var eachRight_Original: FnCallCollectionIteratee = js.native
  @JSName("eachRight")
  def `eachRight_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString): TString = js.native
  @JSName("eachRight")
  def `eachRight_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString, iteratee: StringIterator[_]): TString = js.native
  @JSName("eachRight")
  def `eachRight_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("eachRight")
  def `eachRight_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null]), iteratee: ArrayIterator[T, _]): TArray = js.native
  @JSName("eachRight")
  def `eachRight_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("eachRight")
  def `eachRight_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null]), iteratee: ListIterator[T, _]): TList = js.native
  @JSName("eachRight")
  def eachRight_T_Object_Union[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
  @JSName("eachRight")
  def eachRight_T_Object_Union[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  
  @JSName("each")
  var each_Original: FnCallCollectionIteratee = js.native
  @JSName("each")
  def `each_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString): TString = js.native
  @JSName("each")
  def `each_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString, iteratee: StringIterator[_]): TString = js.native
  @JSName("each")
  def `each_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("each")
  def `each_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null]), iteratee: ArrayIterator[T, _]): TArray = js.native
  @JSName("each")
  def `each_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("each")
  def `each_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null]), iteratee: ListIterator[T, _]): TList = js.native
  @JSName("each")
  def each_T_Object_Union[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
  @JSName("each")
  def each_T_Object_Union[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  
  /**
    * Checks if string ends with the given target string.
    *
    * @param string The string to search.
    * @param target The string to search for.
    * @param position The position to search from.
    * @return Returns true if string ends with target, else false.
    */
  def endsWith(): Boolean = js.native
  def endsWith(string: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def endsWith(string: js.UndefOr[scala.Nothing], target: String): Boolean = js.native
  def endsWith(string: js.UndefOr[scala.Nothing], target: String, position: Double): Boolean = js.native
  def endsWith(string: String): Boolean = js.native
  def endsWith(string: String, target: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def endsWith(string: String, target: String): Boolean = js.native
  def endsWith(string: String, target: String, position: Double): Boolean = js.native
  
  /**
    * @see _.toPairs
    */
  def entries(): js.Array[js.Tuple2[String, _]] = js.native
  def entries(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def entries[T](`object`: Dictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def entries[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  
  /**
    * @see _.entriesIn
    */
  def entriesIn(): js.Array[js.Tuple2[String, _]] = js.native
  def entriesIn(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def entriesIn[T](`object`: Dictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def entriesIn[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  /**
    * @see _.entriesIn
    */
  @JSName("entriesIn")
  def entriesIn_T[T](): js.Array[js.Tuple2[String, T]] = js.native
  
  /**
    * @see _.toPairs
    */
  @JSName("entries")
  def entries_T[T](): js.Array[js.Tuple2[String, T]] = js.native
  
  /**
    * Performs a [`SameValueZero`](http://ecma-international.org/ecma-262/6.0/#sec-samevaluezero)
    * comparison between two values to determine if they are equivalent.
    *
    * @category Lang
    * @param value The value to compare.
    * @param other The other value to compare.
    * @returns Returns `true` if the values are equivalent, else `false`.
    * @example
    *
    * var object = { 'user': 'fred' };
    * var other = { 'user': 'fred' };
    *
    * _.eq(object, object);
    * // => true
    *
    * _.eq(object, other);
    * // => false
    *
    * _.eq('a', 'a');
    * // => true
    *
    * _.eq('a', Object('a'));
    * // => false
    *
    * _.eq(NaN, NaN);
    * // => true
    */
  def eq(value: js.Any, other: js.Any): Boolean = js.native
  
  /**
    * Converts the characters "&", "<", ">", '"', "'", and "`" in string to their corresponding HTML entities.
    *
    * Note: No other characters are escaped. To escape additional characters use a third-party library like he.
    *
    * hough the ">" character is escaped for symmetry, characters like ">" and "/" don’t need escaping in HTML
    * and have no special meaning unless they're part of a tag or unquoted attribute value. See Mathias Bynens’s
    * article (under "semi-related fun fact") for more details.
    *
    * Backticks are escaped because in IE < 9, they can break out of attribute values or HTML comments. See #59,
    * #102, #108, and #133 of the HTML5 Security Cheatsheet for more details.
    *
    * When working with HTML you should always quote attribute values to reduce XSS vectors.
    *
    * @param string The string to escape.
    * @return Returns the escaped string.
    */
  def escape(): String = js.native
  def escape(string: String): String = js.native
  
  /**
    * Escapes the RegExp special characters "^", "$", "\", ".", "*", "+", "?", "(", ")", "[", "]",
    * "{", "}", and "|" in string.
    *
    * @param string The string to escape.
    * @return Returns the escaped string.
    */
  def escapeRegExp(): String = js.native
  def escapeRegExp(string: String): String = js.native
  
  /**
    * Checks if predicate returns truthy for all elements of collection. Iteration is stopped once predicate
    * returns falsey. The predicate is invoked with three arguments: (value, index|key, collection).
    *
    * @param collection The collection to iterate over.
    * @param predicate The function invoked per iteration.
    * @return Returns true if all elements pass the predicate check, else false.
    */
  def every[T](): Boolean = js.native
  def every[T /* <: js.Object */](collection: T): Boolean = js.native
  def every[T /* <: js.Object */](collection: T, predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  def every[T](collection: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  def every[T](collection: Null, predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  def every[T](collection: List[T]): Boolean = js.native
  def every[T](collection: List[T], predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  /**
    * @see _.every
    */
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](): Boolean = js.native
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  @JSName("every")
  def every_T_Object[T /* <: js.Object */](collection: Null, predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  
  /**
    * @see _.extend
    */
  def extend[TObject](`object`: TObject): TObject = js.native
  /**
    * @see _.extend
    */
  def extend[TResult](`object`: js.Any, otherArgs: js.Any*): TResult = js.native
  /**
    * @see _.extend
    */
  def extend[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  /**
    * @see _.extend
    */
  def extend[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2): TObject with TSource1 with TSource2 = js.native
  /**
    * @see _.extend
    */
  def extend[TObject, TSource1, TSource2, TSource3](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see _.extend
    */
  def extend[TObject, TSource1, TSource2, TSource3, TSource4](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * @see _.extendWith
    */
  def extendWith[TObject](`object`: TObject): TObject = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TResult](`object`: js.Any, otherArgs: js.Any*): TResult = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TObject, TSource](`object`: TObject, source: TSource, customizer: AssignCustomizer): TObject with TSource = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2, customizer: AssignCustomizer): TObject with TSource1 with TSource2 = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TObject, TSource1, TSource2, TSource3](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: AssignCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see _.extendWith
    */
  def extendWith[TObject, TSource1, TSource2, TSource3, TSource4](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: AssignCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  def fill[T](array: js.UndefOr[scala.Nothing], value: T): List[T] = js.native
  /**
    * Fills elements of array with value from start up to, but not including, end.
    *
    * Note: This method mutates array.
    *
    * @param array The array to fill.
    * @param value The value to fill array with.
    * @param start The start position.
    * @param end The end position.
    * @return Returns array.
    */
  def fill[T](array: js.Array[_], value: T): js.Array[T] = js.native
  def fill[T](array: Null, value: T): List[T] = js.native
  /**
    * @see _.fill
    */
  def fill[T](array: List[_], value: T): List[T] = js.native
  def fill[T, U](array: js.UndefOr[scala.Nothing], value: T, start: js.UndefOr[scala.Nothing], end: Double): List[T | U] = js.native
  def fill[T, U](array: js.UndefOr[scala.Nothing], value: T, start: Double): List[T | U] = js.native
  def fill[T, U](array: js.UndefOr[scala.Nothing], value: T, start: Double, end: Double): List[T | U] = js.native
  def fill[T, U](array: js.Array[U], value: T, start: js.UndefOr[scala.Nothing], end: Double): js.Array[T | U] = js.native
  def fill[T, U](array: js.Array[U], value: T, start: Double): js.Array[T | U] = js.native
  def fill[T, U](array: js.Array[U], value: T, start: Double, end: Double): js.Array[T | U] = js.native
  def fill[T, U](array: Null, value: T, start: js.UndefOr[scala.Nothing], end: Double): List[T | U] = js.native
  def fill[T, U](array: Null, value: T, start: Double): List[T | U] = js.native
  def fill[T, U](array: Null, value: T, start: Double, end: Double): List[T | U] = js.native
  def fill[T, U](array: List[U], value: T, start: js.UndefOr[scala.Nothing], end: Double): List[T | U] = js.native
  def fill[T, U](array: List[U], value: T, start: Double): List[T | U] = js.native
  def fill[T, U](array: List[U], value: T, start: Double, end: Double): List[T | U] = js.native
  @JSName("fill")
  def fill_TU[T, U](array: js.UndefOr[scala.Nothing], value: T): List[T | U] = js.native
  /**
    * @see _.fill
    */
  @JSName("fill")
  def fill_TU[T, U](array: js.Array[U], value: T): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU[T, U](array: Null, value: T): List[T | U] = js.native
  /**
    * @see _.fill
    */
  @JSName("fill")
  def fill_TU[T, U](array: List[U], value: T): List[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: js.UndefOr[scala.Nothing], value: T): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: js.UndefOr[scala.Nothing], value: T, start: js.UndefOr[scala.Nothing], end: Double): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: js.UndefOr[scala.Nothing], value: T, start: Double): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: js.UndefOr[scala.Nothing], value: T, start: Double, end: Double): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: Null, value: T): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: Null, value: T, start: js.UndefOr[scala.Nothing], end: Double): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: Null, value: T, start: Double): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_TU_Array[T, U](array: Null, value: T, start: Double, end: Double): js.Array[T | U] = js.native
  @JSName("fill")
  def fill_T_Array[T](array: js.UndefOr[scala.Nothing], value: T): js.Array[T] = js.native
  @JSName("fill")
  def fill_T_Array[T](array: Null, value: T): js.Array[T] = js.native
  
  /**
    * Iterates over elements of collection, returning an array of all elements predicate returns truthy for. The
    * predicate is invoked with three arguments: (value, index|key, collection).
    *
    * @param collection The collection to iterate over.
    * @param predicate The function invoked per iteration.
    * @return Returns the new filtered array.
    */
  def filter(): js.Array[String] = js.native
  def filter(collection: js.UndefOr[scala.Nothing], predicate: StringIterator[Boolean]): js.Array[String] = js.native
  def filter(collection: String): js.Array[String] = js.native
  def filter(collection: String, predicate: StringIterator[Boolean]): js.Array[String] = js.native
  def filter(collection: Null, predicate: StringIterator[Boolean]): js.Array[String] = js.native
  def filter[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter[T /* <: js.Object */](collection: T, predicate: ObjectIterateeCustom[T, Boolean]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIterateeCustom[T, Boolean]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter[T /* <: js.Object */](collection: Null, predicate: ObjectIterateeCustom[T, Boolean]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def filter[T](collection: List[T]): js.Array[T] = js.native
  def filter[T](collection: List[T], predicate: ListIterateeCustom[T, Boolean]): js.Array[T] = js.native
  /**
    * @see _.filter
    */
  def filter[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: T, predicate: ObjectIteratorTypeGuard[T, S]): js.Array[S] = js.native
  /**
    * @see _.filter
    */
  def filter[T, S /* <: T */](collection: List[T], predicate: ListIteratorTypeGuard[T, S]): js.Array[S] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T[T](): js.Array[T] = js.native
  @JSName("filter")
  def filter_T[T](collection: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): js.Array[T] = js.native
  @JSName("filter")
  def filter_T[T](collection: Null, predicate: ListIterateeCustom[T, Boolean]): js.Array[T] = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](collection: js.UndefOr[scala.Nothing], predicate: ListIteratorTypeGuard[T, S]): js.Array[S] = js.native
  @JSName("filter")
  def filter_TS_T[T, S /* <: T */](collection: Null, predicate: ListIteratorTypeGuard[T, S]): js.Array[S] = js.native
  /**
    * @see _.filter
    */
  @JSName("filter")
  def filter_T_Object[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("filter")
  def filter_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIteratorTypeGuard[T, S]): js.Array[S] = js.native
  @JSName("filter")
  def filter_T_ObjectS_Any[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: Null, predicate: ObjectIteratorTypeGuard[T, S]): js.Array[S] = js.native
  
  /**
    * @see _.find
    */
  def find[T](): js.UndefOr[T] = js.native
  def find[T /* <: js.Object */](collection: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find[T /* <: js.Object */](collection: T, predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find[T /* <: js.Object */](collection: T, predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def find[T](
    collection: js.UndefOr[scala.Nothing],
    predicate: js.UndefOr[ListIterateeCustom[T, Boolean]],
    fromIndex: Double
  ): js.UndefOr[T] = js.native
  def find[T](collection: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def find[T](collection: Null, predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[T] = js.native
  def find[T](collection: Null, predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def find[T](collection: List[T]): js.UndefOr[T] = js.native
  def find[T](collection: List[T], predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[T] = js.native
  def find[T](collection: List[T], predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  /**
    * @see _.find
    */
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: T, predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: T, predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: Null, predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: Null, predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  /**
    * Iterates over elements of collection, returning the first element predicate returns truthy for.
    * The predicate is invoked with three arguments: (value, index|key, collection).
    *
    * @param collection The collection to search.
    * @param predicate The function invoked per iteration.
    * @param fromIndex The index to search from.
    * @return Returns the matched element, else undefined.
    */
  def find[T, S /* <: T */](collection: List[T], predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def find[T, S /* <: T */](collection: List[T], predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  
  /**
    * This method is like _.find except that it returns the index of the first element predicate returns truthy
    * for instead of the element itself.
    *
    * @param array The array to search.
    * @param predicate The function invoked per iteration.
    * @param fromIndex The index to search from.
    * @return Returns the index of the found element, else -1.
    */
  def findIndex[T](): Double = js.native
  def findIndex[T](
    array: js.UndefOr[scala.Nothing],
    predicate: js.UndefOr[ListIterateeCustom[T, Boolean]],
    fromIndex: Double
  ): Double = js.native
  def findIndex[T](array: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  def findIndex[T](array: Null, predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): Double = js.native
  def findIndex[T](array: Null, predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  def findIndex[T](array: List[T]): Double = js.native
  def findIndex[T](array: List[T], predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): Double = js.native
  def findIndex[T](array: List[T], predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  
  /**
    * This method is like _.find except that it returns the key of the first element predicate returns truthy for
    * instead of the element itself.
    *
    * @param object The object to search.
    * @param predicate The function invoked per iteration.
    * @return Returns the key of the matched element, else undefined.
    */
  def findKey[T](): js.UndefOr[String] = js.native
  def findKey[T](`object`: T): js.UndefOr[String] = js.native
  def findKey[T](`object`: T, predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  def findKey[T](`object`: js.UndefOr[scala.Nothing], predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  def findKey[T](`object`: Null, predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  
  /**
    * @see _.findLast
    */
  def findLast[T](): js.UndefOr[T] = js.native
  def findLast[T /* <: js.Object */](collection: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast[T /* <: js.Object */](collection: T, predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast[T /* <: js.Object */](collection: T, predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def findLast[T](
    collection: js.UndefOr[scala.Nothing],
    predicate: js.UndefOr[ListIterateeCustom[T, Boolean]],
    fromIndex: Double
  ): js.UndefOr[T] = js.native
  def findLast[T](collection: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def findLast[T](collection: Null, predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[T] = js.native
  def findLast[T](collection: Null, predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  def findLast[T](collection: List[T]): js.UndefOr[T] = js.native
  def findLast[T](collection: List[T], predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[T] = js.native
  def findLast[T](collection: List[T], predicate: ListIterateeCustom[T, Boolean]): js.UndefOr[T] = js.native
  /**
    * @see _.findLast
    */
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: T, predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: T, predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: Null, predicate: ObjectIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[T /* <: js.Object */, S /* <: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any */](collection: Null, predicate: ObjectIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  /**
    * This method is like _.find except that it iterates over elements of a collection from
    * right to left.
    * @param collection Searches for a value in this list.
    * @param predicate The function called per iteration.
    * @param fromIndex The index to search from.
    * @return The found element, else undefined.
    */
  def findLast[T, S /* <: T */](collection: List[T], predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  def findLast[T, S /* <: T */](collection: List[T], predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  
  /**
    * This method is like _.findIndex except that it iterates over elements of collection from right to left.
    *
    * @param array The array to search.
    * @param predicate The function invoked per iteration.
    * @param fromIndex The index to search from.
    * @return Returns the index of the found element, else -1.
    */
  def findLastIndex[T](): Double = js.native
  def findLastIndex[T](
    array: js.UndefOr[scala.Nothing],
    predicate: js.UndefOr[ListIterateeCustom[T, Boolean]],
    fromIndex: Double
  ): Double = js.native
  def findLastIndex[T](array: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  def findLastIndex[T](array: Null, predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): Double = js.native
  def findLastIndex[T](array: Null, predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  def findLastIndex[T](array: List[T]): Double = js.native
  def findLastIndex[T](array: List[T], predicate: js.UndefOr[ListIterateeCustom[T, Boolean]], fromIndex: Double): Double = js.native
  def findLastIndex[T](array: List[T], predicate: ListIterateeCustom[T, Boolean]): Double = js.native
  
  /**
    * This method is like _.findKey except that it iterates over elements of a collection in the opposite order.
    *
    * @param object The object to search.
    * @param predicate The function invoked per iteration.
    * @return Returns the key of the matched element, else undefined.
    */
  def findLastKey[T](): js.UndefOr[String] = js.native
  def findLastKey[T](`object`: T): js.UndefOr[String] = js.native
  def findLastKey[T](`object`: T, predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  def findLastKey[T](`object`: js.UndefOr[scala.Nothing], predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  def findLastKey[T](`object`: Null, predicate: ObjectIteratee[T]): js.UndefOr[String] = js.native
  
  @JSName("findLast")
  def findLast_TS_T[T, S /* <: T */](collection: js.UndefOr[scala.Nothing], predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("findLast")
  def findLast_TS_T[T, S /* <: T */](collection: js.UndefOr[scala.Nothing], predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  @JSName("findLast")
  def findLast_TS_T[T, S /* <: T */](collection: Null, predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("findLast")
  def findLast_TS_T[T, S /* <: T */](collection: Null, predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  /**
    * @see _.findLast
    */
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](collection: Null, predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("findLast")
  def findLast_T_Object[T /* <: js.Object */](collection: Null, predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  @JSName("find")
  def find_TS_T[T, S /* <: T */](collection: js.UndefOr[scala.Nothing], predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](collection: js.UndefOr[scala.Nothing], predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](collection: Null, predicate: ListIteratorTypeGuard[T, S]): js.UndefOr[S] = js.native
  @JSName("find")
  def find_TS_T[T, S /* <: T */](collection: Null, predicate: ListIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
  /**
    * @see _.find
    */
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]],
    fromIndex: Double
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](collection: Null, predicate: js.UndefOr[ObjectIterateeCustom[T, Boolean]], fromIndex: Double): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("find")
  def find_T_Object[T /* <: js.Object */](collection: Null, predicate: ObjectIterateeCustom[T, Boolean]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  def first[T](): js.UndefOr[T] = js.native
  def first[T](array: List[T]): js.UndefOr[T] = js.native
  @JSName("first")
  var first_Original: FnCall = js.native
  
  /**
    * @see _.flatMap
    */
  def flatMap(): js.Array[_] = js.native
  def flatMap(collection: js.UndefOr[scala.Nothing], iteratee: String): js.Array[_] = js.native
  def flatMap(collection: js.UndefOr[scala.Nothing], iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMap(collection: js.Object): js.Array[_] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(collection: js.Object, iteratee: String): js.Array[_] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap(collection: js.Object, iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMap(collection: Null, iteratee: String): js.Array[_] = js.native
  def flatMap(collection: Null, iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMap[T](collection: Dictionary[Many[T]]): js.Array[T] = js.native
  def flatMap[T](collection: List[Many[T]]): js.Array[T] = js.native
  def flatMap[T](collection: NumericDictionary[Many[T]]): js.Array[T] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T /* <: js.Object */, TResult](collection: T, iteratee: ObjectIterator[T, Many[TResult]]): js.Array[TResult] = js.native
  def flatMap[T /* <: js.Object */, TResult](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, Many[TResult]]): js.Array[TResult] = js.native
  def flatMap[T /* <: js.Object */, TResult](collection: Null, iteratee: ObjectIterator[T, Many[TResult]]): js.Array[TResult] = js.native
  /**
    * @see _.flatMap
    */
  def flatMap[T, TResult](collection: List[T], iteratee: ListIterator[T, Many[TResult]]): js.Array[TResult] = js.native
  
  def flatMapDeep(collection: js.UndefOr[scala.Nothing], iteratee: String): js.Array[_] = js.native
  def flatMapDeep(collection: js.UndefOr[scala.Nothing], iteratee: js.Object): js.Array[Boolean] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(collection: js.Object, iteratee: String): js.Array[_] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep(collection: js.Object, iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMapDeep(collection: Null, iteratee: String): js.Array[_] = js.native
  def flatMapDeep(collection: Null, iteratee: js.Object): js.Array[Boolean] = js.native
  /**
    * This method is like `_.flatMap` except that it recursively flattens the
    * mapped results.
    *
    * @since 4.7.0
    * @category Collection
    * @param collection The collection to iterate over.
    * @param [iteratee=_.identity] The function invoked per iteration.
    * @returns Returns the new flattened array.
    * @example
    *
    * function duplicate(n) {
    *   return [[[n, n]]];
    * }
    *
    * _.flatMapDeep([1, 2], duplicate);
    * // => [1, 1, 2, 2]
    */
  def flatMapDeep[T](): js.Array[T] = js.native
  def flatMapDeep[T](collection: Dictionary[ListOfRecursiveArraysOrValues[T] | T]): js.Array[T] = js.native
  def flatMapDeep[T](collection: List[ListOfRecursiveArraysOrValues[T] | T]): js.Array[T] = js.native
  def flatMapDeep[T](collection: NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]): js.Array[T] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T /* <: js.Object */, TResult](collection: T, iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  def flatMapDeep[T /* <: js.Object */, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): js.Array[TResult] = js.native
  def flatMapDeep[T /* <: js.Object */, TResult](collection: Null, iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  /**
    * @see _.flatMapDeep
    */
  def flatMapDeep[T, TResult](collection: List[T], iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): js.Array[TResult] = js.native
  @JSName("flatMapDeep")
  def flatMapDeep_TTResult[T, TResult](collection: Null, iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  
  def flatMapDepth(collection: js.UndefOr[scala.Nothing], iteratee: String): js.Array[_] = js.native
  def flatMapDepth(collection: js.UndefOr[scala.Nothing], iteratee: String, depth: Double): js.Array[_] = js.native
  def flatMapDepth(collection: js.UndefOr[scala.Nothing], iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMapDepth(collection: js.UndefOr[scala.Nothing], iteratee: js.Object, depth: Double): js.Array[Boolean] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(collection: js.Object, iteratee: String): js.Array[_] = js.native
  def flatMapDepth(collection: js.Object, iteratee: String, depth: Double): js.Array[_] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth(collection: js.Object, iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMapDepth(collection: js.Object, iteratee: js.Object, depth: Double): js.Array[Boolean] = js.native
  def flatMapDepth(collection: Null, iteratee: String): js.Array[_] = js.native
  def flatMapDepth(collection: Null, iteratee: String, depth: Double): js.Array[_] = js.native
  def flatMapDepth(collection: Null, iteratee: js.Object): js.Array[Boolean] = js.native
  def flatMapDepth(collection: Null, iteratee: js.Object, depth: Double): js.Array[Boolean] = js.native
  /**
    * This method is like `_.flatMap` except that it recursively flattens the
    * mapped results up to `depth` times.
    *
    * @since 4.7.0
    * @category Collection
    * @param collection The collection to iterate over.
    * @param [iteratee=_.identity] The function invoked per iteration.
    * @param [depth=1] The maximum recursion depth.
    * @returns Returns the new flattened array.
    * @example
    *
    * function duplicate(n) {
    *   return [[[n, n]]];
    * }
    *
    * _.flatMapDepth([1, 2], duplicate, 2);
    * // => [[1, 1], [2, 2]]
    */
  def flatMapDepth[T](): js.Array[T] = js.native
  def flatMapDepth[T](collection: Dictionary[ListOfRecursiveArraysOrValues[T] | T]): js.Array[T] = js.native
  def flatMapDepth[T](collection: List[ListOfRecursiveArraysOrValues[T] | T]): js.Array[T] = js.native
  def flatMapDepth[T](collection: NumericDictionary[ListOfRecursiveArraysOrValues[T] | T]): js.Array[T] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T /* <: js.Object */, TResult](collection: T, iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    collection: T,
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): js.Array[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](collection: Null, iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  def flatMapDepth[T /* <: js.Object */, TResult](
    collection: Null,
    iteratee: ObjectIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  /**
    * @see _.flatMapDepth
    */
  def flatMapDepth[T, TResult](collection: List[T], iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  def flatMapDepth[T, TResult](
    collection: List[T],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]
  ): js.Array[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](collection: Null, iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult]): js.Array[TResult] = js.native
  @JSName("flatMapDepth")
  def flatMapDepth_TTResult[T, TResult](
    collection: Null,
    iteratee: ListIterator[T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
  
  /**
    * Creates an array of flattened values by running each element in collection through iteratee
    * and concating its result to the other mapped values. The iteratee is invoked with three arguments:
    * (value, index|key, collection).
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns the new flattened array.
    */
  @JSName("flatMap")
  def flatMap_T[T](): js.Array[T] = js.native
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](collection: js.UndefOr[scala.Nothing], iteratee: ListIterator[T, Many[TResult]]): js.Array[TResult] = js.native
  @JSName("flatMap")
  def flatMap_TTResult[T, TResult](collection: Null, iteratee: ListIterator[T, Many[TResult]]): js.Array[TResult] = js.native
  
  /**
    * Flattens `array` a single level deep.
    *
    * @param array The array to flatten.
    * @return Returns the new flattened array.
    */
  def flatten[T](): js.Array[T] = js.native
  def flatten[T](array: List[Many[T]]): js.Array[T] = js.native
  
  /**
    * Recursively flattens a nested array.
    *
    * @param array The array to recursively flatten.
    * @return Returns the new flattened array.
    */
  def flattenDeep[T](): js.Array[T] = js.native
  def flattenDeep[T](array: ListOfRecursiveArraysOrValues[T]): js.Array[T] = js.native
  
  /**
    * Recursively flatten array up to depth times.
    *
    * @param array The array to recursively flatten.
    * @param number The maximum recursion depth.
    * @return Returns the new flattened array.
    */
  def flattenDepth[T](): js.Array[T] = js.native
  def flattenDepth[T](array: js.UndefOr[scala.Nothing], depth: Double): js.Array[T] = js.native
  def flattenDepth[T](array: Null, depth: Double): js.Array[T] = js.native
  def flattenDepth[T](array: ListOfRecursiveArraysOrValues[T]): js.Array[T] = js.native
  def flattenDepth[T](array: ListOfRecursiveArraysOrValues[T], depth: Double): js.Array[T] = js.native
  
  /**
    * Creates a function that invokes `func` with arguments reversed.
    *
    * @category Function
    * @param func The function to flip arguments for.
    * @returns Returns the new function.
    * @example
    *
    * var flipped = _.flip(function() {
    *   return _.toArray(arguments);
    * });
    *
    * flipped('a', 'b', 'c', 'd');
    * // => ['d', 'c', 'b', 'a']
    */
  def flip[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T = js.native
  
  /**
    * Calculates n rounded down to precision.
    *
    * @param n The number to round down.
    * @param precision The precision to round down to.
    * @return Returns the rounded down number.
    */
  def floor(n: Double): Double = js.native
  def floor(n: Double, precision: Double): Double = js.native
  
  def flow(funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Creates a function that returns the result of invoking the provided functions with the this binding of the
    * created function, where each successive invocation is supplied the return value of the previous.
    *
    * @param funcs Functions to invoke.
    * @return Returns the new function.
    */
  // 0-argument first function
  def flow[R1, R2](f1: js.Function0[R1], f2: js.Function1[/* a */ R1, R2]): js.Function0[R2] = js.native
  def flow[R1, R2, R3](f1: js.Function0[R1], f2: js.Function1[/* a */ R1, R2], f3: js.Function1[/* a */ R2, R3]): js.Function0[R3] = js.native
  // 1-argument first function
  def flow[A1, R1, R2](f1: js.Function1[/* a1 */ A1, R1], f2: js.Function1[/* a */ R1, R2]): js.Function1[/* a1 */ A1, R2] = js.native
  def flow[R1, R2, R3, R4](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function0[R4] = js.native
  def flow[A1, R1, R2, R3](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function1[/* a1 */ A1, R3] = js.native
  // 2-argument first function
  def flow[A1, A2, R1, R2](f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1], f2: js.Function1[/* a */ R1, R2]): js.Function2[/* a1 */ A1, /* a2 */ A2, R2] = js.native
  def flow[R1, R2, R3, R4, R5](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function0[R5] = js.native
  def flow[A1, R1, R2, R3, R4](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function1[/* a1 */ A1, R4] = js.native
  def flow[A1, A2, R1, R2, R3](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R3] = js.native
  // 3-argument first function
  def flow[A1, A2, A3, R1, R2](f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1], f2: js.Function1[/* a */ R1, R2]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2] = js.native
  def flow[R1, R2, R3, R4, R5, R6](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function0[R6] = js.native
  def flow[A1, R1, R2, R3, R4, R5](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function1[/* a1 */ A1, R5] = js.native
  def flow[A1, A2, R1, R2, R3, R4](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R4] = js.native
  def flow[A1, A2, A3, R1, R2, R3](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3] = js.native
  // 4-argument first function
  def flow[A1, A2, A3, A4, R1, R2](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2] = js.native
  // any-argument first function
  def flow[A1, A2, A3, A4, R1, R2](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R2] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function0[R7] = js.native
  def flow[R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function0[R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function0[_] = js.native
  def flow[A1, R1, R2, R3, R4, R5, R6](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function1[/* a1 */ A1, R6] = js.native
  def flow[A1, A2, R1, R2, R3, R4, R5](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R5] = js.native
  def flow[A1, A2, A3, R1, R2, R3, R4](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R3] = js.native
  def flow[A1, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function1[/* a1 */ A1, R7] = js.native
  def flow[A1, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function1[/* a1 */ A1, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function1[/* a1 */ A1, _] = js.native
  def flow[A1, A2, R1, R2, R3, R4, R5, R6](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R6] = js.native
  def flow[A1, A2, A3, R1, R2, R3, R4, R5](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R4] = js.native
  def flow[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R7] = js.native
  def flow[A1, A2, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, _] = js.native
  def flow[A1, A2, A3, R1, R2, R3, R4, R5, R6](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R5] = js.native
  def flow[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7] = js.native
  def flow[A1, A2, A3, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, _] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R6] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, _] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R7] = js.native
  def flow[A1, A2, A3, A4, R1, R2, R3, R4, R5, R6, R7](
    f1: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, R1],
    f2: js.Function1[/* a */ R1, R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    funcs: (Many[js.Function1[/* a */ _, _]])*
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* repeated */ js.Any, _] = js.native
  
  def flowRight(
    f7: js.Function1[/* a */ js.Any, _],
    f6: js.Function1[/* a */ js.Any, _],
    f5: js.Function1[/* a */ js.Any, _],
    f4: js.Function1[/* a */ js.Any, _],
    f3: js.Function1[/* a */ js.Any, _],
    f2: js.Function1[/* a */ js.Any, _],
    f1: js.Function0[_],
    funcs: (Many[js.Function1[/* repeated */ _, _]])*
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  def flowRight(funcs: js.Array[Many[js.Function1[/* repeated */ _, _]]]): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * This method is like _.flow except that it creates a function that invokes the provided functions from right
    * to left.
    *
    * @param funcs Functions to invoke.
    * @return Returns the new function.
    */
  // 0-argument first function
  def flowRight[R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function0[R1]): js.Function0[R2] = js.native
  // any-argument first function
  def flowRight[R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* repeated */ js.Any, R1]): js.Function1[/* repeated */ js.Any, R2] = js.native
  def flowRight[R3, R2, R1](f3: js.Function1[/* a */ R2, R3], f2: js.Function1[/* a */ R1, R2], f1: js.Function0[R1]): js.Function0[R3] = js.native
  def flowRight[R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): js.Function1[/* repeated */ js.Any, R3] = js.native
  // 2-argument first function
  def flowRight[A1, A2, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]): js.Function2[/* a1 */ A1, /* a2 */ A2, R2] = js.native
  def flowRight[R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): js.Function0[R4] = js.native
  def flowRight[R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): js.Function1[/* repeated */ js.Any, R4] = js.native
  // 3-argument first function
  def flowRight[A1, A2, A3, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R2] = js.native
  def flowRight[A1, A2, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R3] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): js.Function0[R5] = js.native
  def flowRight[R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): js.Function1[/* repeated */ js.Any, R5] = js.native
  // 4-argument first function
  def flowRight[A1, A2, A3, A4, R2, R1](
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R2] = js.native
  def flowRight[A1, A2, A3, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R3] = js.native
  def flowRight[A1, A2, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R4] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): js.Function0[R6] = js.native
  def flowRight[R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): js.Function1[/* repeated */ js.Any, R6] = js.native
  def flowRight[A1, A2, A3, A4, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R3] = js.native
  def flowRight[A1, A2, A3, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R4] = js.native
  def flowRight[A1, A2, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R5] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function0[R1]
  ): js.Function0[R7] = js.native
  def flowRight[R7, R6, R5, R4, R3, R2, R1](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* repeated */ js.Any, R1]
  ): js.Function1[/* repeated */ js.Any, R7] = js.native
  def flowRight[A1, A2, A3, A4, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R4] = js.native
  def flowRight[A1, A2, A3, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R5] = js.native
  def flowRight[A1, A2, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R6] = js.native
  def flowRight[A1, A2, A3, A4, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R5] = js.native
  def flowRight[A1, A2, A3, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R6] = js.native
  def flowRight[A1, A2, R7, R6, R5, R4, R3, R2, R1](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function2[/* a1 */ A1, /* a2 */ A2, R1]
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, R7] = js.native
  def flowRight[A1, A2, A3, A4, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R6] = js.native
  def flowRight[A1, A2, A3, R7, R6, R5, R4, R3, R2, R1](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R1]
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, R7] = js.native
  def flowRight[A1, A2, A3, A4, R7, R6, R5, R4, R3, R2, R1](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R1]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, R7] = js.native
  // 1-argument first function
  @JSName("flowRight")
  def flowRight_A1R2R1[A1, R2, R1](f2: js.Function1[/* a */ R1, R2], f1: js.Function1[/* a1 */ A1, R1]): js.Function1[/* a1 */ A1, R2] = js.native
  @JSName("flowRight")
  def flowRight_A1R3R2R1[A1, R3, R2, R1](
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): js.Function1[/* a1 */ A1, R3] = js.native
  @JSName("flowRight")
  def flowRight_A1R4R3R2R1[A1, R4, R3, R2, R1](
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): js.Function1[/* a1 */ A1, R4] = js.native
  @JSName("flowRight")
  def flowRight_A1R5R4R3R2R1[A1, R5, R4, R3, R2, R1](
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): js.Function1[/* a1 */ A1, R5] = js.native
  @JSName("flowRight")
  def flowRight_A1R6R5R4R3R2R1[A1, R6, R5, R4, R3, R2, R1](
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): js.Function1[/* a1 */ A1, R6] = js.native
  @JSName("flowRight")
  def flowRight_A1R7R6R5R4R3R2R1[A1, R7, R6, R5, R4, R3, R2, R1](
    f7: js.Function1[/* a */ R6, R7],
    f6: js.Function1[/* a */ R5, R6],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* a1 */ A1, R1]
  ): js.Function1[/* a1 */ A1, R7] = js.native
  
  /**
    * @see _.forEach
    */
  def forEach(collection: String): String = js.native
  def forEach(collection: String, iteratee: StringIterator[_]): String = js.native
  /**
    * @see _.forEach
    */
  def forEach[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  /**
    * @see _.forEach
    */
  def forEach[T /* <: js.Object */](collection: T): T = js.native
  def forEach[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): T = js.native
  def forEach[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  /**
    * Iterates over elements of collection invoking iteratee for each element. The iteratee is invoked with three arguments:
    * (value, index|key, collection). Iteratee functions may exit iteration early by explicitly returning false.
    *
    * Note: As with other "Collections" methods, objects with a "length" property are iterated like arrays. To
    * avoid this behavior _.forIn or _.forOwn may be used for object iteration.
    *
    * @alias _.each
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function invoked per iteration.
    */
  def forEach[T](collection: js.Array[T]): js.Array[T] = js.native
  def forEach[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def forEach[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  /**
    * @see _.forEach
    */
  def forEach[T](collection: List[T]): List[T] = js.native
  def forEach[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
  
  /**
    * @see _.forEachRight
    */
  def forEachRight(collection: String): String = js.native
  def forEachRight(collection: String, iteratee: StringIterator[_]): String = js.native
  /**
    * @see _.forEachRight
    */
  def forEachRight[T /* <: js.Object */](): js.UndefOr[T | Null] = js.native
  /**
    * @see _.forEachRight
    */
  def forEachRight[T /* <: js.Object */](collection: T): T = js.native
  def forEachRight[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): T = js.native
  def forEachRight[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  /**
    * This method is like _.forEach except that it iterates over elements of collection from right to left.
    *
    * @alias _.eachRight
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function called per iteration.
    */
  def forEachRight[T](collection: js.Array[T]): js.Array[T] = js.native
  def forEachRight[T](collection: js.Array[T], iteratee: ArrayIterator[T, _]): js.Array[T] = js.native
  def forEachRight[T /* <: js.Object */](collection: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  /**
    * @see _.forEachRight
    */
  def forEachRight[T](collection: List[T]): List[T] = js.native
  def forEachRight[T](collection: List[T], iteratee: ListIterator[T, _]): List[T] = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("forEachRight")
  def `forEachRight_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString): TString = js.native
  @JSName("forEachRight")
  def `forEachRight_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString, iteratee: StringIterator[_]): TString = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("forEachRight")
  def `forEachRight_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("forEachRight")
  def `forEachRight_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null]), iteratee: ArrayIterator[T, _]): TArray = js.native
  /**
    * @see _.forEachRight
    */
  @JSName("forEachRight")
  def `forEachRight_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("forEachRight")
  def `forEachRight_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null]), iteratee: ListIterator[T, _]): TList = js.native
  @JSName("forEachRight")
  def forEachRight_T_Object_Union[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
  @JSName("forEachRight")
  def forEachRight_T_Object_Union[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  
  /**
    * @see _.forEach
    */
  @JSName("forEach")
  def `forEach_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString): TString = js.native
  @JSName("forEach")
  def `forEach_TString_UnionStringNull<undefined>_TString`[TString /* <: js.UndefOr[String | Null] */](collection: TString, iteratee: StringIterator[_]): TString = js.native
  /**
    * @see _.forEach
    */
  @JSName("forEach")
  def `forEach_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
  @JSName("forEach")
  def `forEach_TTArray_UnionArrayTNull<undefined>_TArray`[T, TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null]), iteratee: ArrayIterator[T, _]): TArray = js.native
  /**
    * @see _.forEach
    */
  @JSName("forEach")
  def `forEach_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
  @JSName("forEach")
  def `forEach_TTList_UnionListTNull<undefined>_TList`[T, TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null]), iteratee: ListIterator[T, _]): TList = js.native
  @JSName("forEach")
  def forEach_T_Object_Union[T /* <: js.Object */](collection: T): js.UndefOr[T | Null] = js.native
  @JSName("forEach")
  def forEach_T_Object_Union[T /* <: js.Object */](collection: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  
  /**
    * @see _.forIn
    */
  def forIn[T](): js.UndefOr[T | Null] = js.native
  def forIn[T](`object`: T): js.UndefOr[T | Null] = js.native
  def forIn[T](`object`: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forIn[T](`object`: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forIn[T](`object`: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  
  /**
    * @see _.forInRight
    */
  def forInRight[T](): js.UndefOr[T | Null] = js.native
  def forInRight[T](`object`: T): js.UndefOr[T | Null] = js.native
  def forInRight[T](`object`: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forInRight[T](`object`: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forInRight[T](`object`: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  /**
    * This method is like _.forIn except that it iterates over properties of object in the opposite order.
    *
    * @param object The object to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns object.
    */
  @JSName("forInRight")
  def forInRight_T_T[T](`object`: T): T = js.native
  @JSName("forInRight")
  def forInRight_T_T[T](`object`: T, iteratee: ObjectIterator[T, _]): T = js.native
  
  /**
    * Iterates over own and inherited enumerable properties of an object invoking iteratee for each property. The
    * iteratee is invoked with three arguments: (value, key, object). Iteratee functions may
    * exit iteration early by explicitly returning false.
    *
    * @param object The object to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns object.
    */
  @JSName("forIn")
  def forIn_T_T[T](`object`: T): T = js.native
  @JSName("forIn")
  def forIn_T_T[T](`object`: T, iteratee: ObjectIterator[T, _]): T = js.native
  
  /**
    * @see _.forOwn
    */
  def forOwn[T](): js.UndefOr[T | Null] = js.native
  def forOwn[T](`object`: T): js.UndefOr[T | Null] = js.native
  def forOwn[T](`object`: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forOwn[T](`object`: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forOwn[T](`object`: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  
  /**
    * @see _.forOwnRight
    */
  def forOwnRight[T](): js.UndefOr[T | Null] = js.native
  def forOwnRight[T](`object`: T): js.UndefOr[T | Null] = js.native
  def forOwnRight[T](`object`: T, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forOwnRight[T](`object`: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  def forOwnRight[T](`object`: Null, iteratee: ObjectIterator[T, _]): js.UndefOr[T | Null] = js.native
  /**
    * This method is like _.forOwn except that it iterates over properties of object in the opposite order.
    *
    * @param object The object to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns object.
    */
  @JSName("forOwnRight")
  def forOwnRight_T_T[T](`object`: T): T = js.native
  @JSName("forOwnRight")
  def forOwnRight_T_T[T](`object`: T, iteratee: ObjectIterator[T, _]): T = js.native
  
  /**
    * Iterates over own enumerable properties of an object invoking iteratee for each property. The iteratee is
    * invoked with three arguments: (value, key, object). Iteratee functions may exit
    * iteration early by explicitly returning false.
    *
    * @param object The object to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns object.
    */
  @JSName("forOwn")
  def forOwn_T_T[T](`object`: T): T = js.native
  @JSName("forOwn")
  def forOwn_T_T[T](`object`: T, iteratee: ObjectIterator[T, _]): T = js.native
  
  /**
    @see _.fromPairs
    */
  def fromPairs(): Dictionary[_] = js.native
  def fromPairs(pairs: List[js.Array[_]]): Dictionary[_] = js.native
  /**
    * The inverse of `_.toPairs`; this method returns an object composed
    * from key-value `pairs`.
    *
    * @category Array
    * @param pairs The key-value pairs.
    * @returns Returns the new object.
    * @example
    *
    * _.fromPairs([['fred', 30], ['barney', 40]]);
    * // => { 'fred': 30, 'barney': 40 }
    */
  @JSName("fromPairs")
  def fromPairs_T[T](): Dictionary[T] = js.native
  @JSName("fromPairs")
  def fromPairs_T[T](pairs: List[js.Tuple2[PropertyName, T]]): Dictionary[T] = js.native
  
  /**
    * Creates an array of function property names from own enumerable properties
    * of `object`.
    *
    * @category Object
    * @param object The object to inspect.
    * @returns Returns the new array of property names.
    * @example
    *
    * function Foo() {
    *   this.a = _.constant('a');
    *   this.b = _.constant('b');
    * }
    *
    * Foo.prototype.c = _.constant('c');
    *
    * _.functions(new Foo);
    * // => ['a', 'b']
    */
  def functions(`object`: js.Any): js.Array[String] = js.native
  
  /**
    * Creates an array of function property names from own and inherited
    * enumerable properties of `object`.
    *
    * @category Object
    * @param object The object to inspect.
    * @returns Returns the new array of property names.
    * @example
    *
    * function Foo() {
    *   this.a = _.constant('a');
    *   this.b = _.constant('b');
    * }
    *
    * Foo.prototype.c = _.constant('c');
    *
    * _.functionsIn(new Foo);
    * // => ['a', 'b', 'c']
    */
  def functionsIn[T /* <: js.Object */](`object`: js.Any): js.Array[String] = js.native
  
  def get(`object`: js.UndefOr[scala.Nothing], path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  /**
    * @see _.get
    */
  def get(`object`: js.Any, path: PropertyPath): js.Any = js.native
  def get(`object`: js.Any, path: PropertyPath, defaultValue: js.Any): js.Any = js.native
  /**
    * @see _.get
    */
  def get(`object`: Null, path: PropertyPath): js.UndefOr[scala.Nothing] = js.native
  def get[T](`object`: js.UndefOr[scala.Nothing], path: Double): js.UndefOr[T] = js.native
  def get[TDefault](`object`: js.UndefOr[scala.Nothing], path: PropertyPath, defaultValue: TDefault): TDefault = js.native
  def get[T](`object`: Null, path: Double): js.UndefOr[T] = js.native
  /**
    * @see _.get
    */
  def get[TDefault](`object`: Null, path: PropertyPath, defaultValue: TDefault): TDefault = js.native
  /**
    * @see _.get
    */
  def get[T](`object`: NumericDictionary[T], path: Double): js.UndefOr[T] = js.native
  /**
    * Gets the property value at path of object. If the resolved value is undefined the defaultValue is used
    * in its place.
    *
    * @param object The object to query.
    * @param path The path of the property to get.
    * @param defaultValue The value returned if the resolved value is undefined.
    * @return Returns the resolved value.
    */
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: TObject, path: TKey): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: TObject, path: js.Array[TKey]): /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: js.UndefOr[scala.Nothing], path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: js.UndefOr[scala.Nothing], path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[T, TDefault](`object`: js.UndefOr[scala.Nothing], path: Double, defaultValue: TDefault): T | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: Null, path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: Null, path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  def get[T, TDefault](`object`: Null, path: Double, defaultValue: TDefault): T | TDefault = js.native
  /**
    * @see _.get
    */
  def get[T, TDefault](`object`: NumericDictionary[T], path: Double, defaultValue: TDefault): T | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](`object`: TObject, path: TKey, defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](`object`: TObject, path: js.Array[TKey], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](`object`: TObject, path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](`object`: js.UndefOr[scala.Nothing], path: TKey, defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](`object`: js.UndefOr[scala.Nothing], path: js.Array[TKey], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](`object`: js.UndefOr[scala.Nothing], path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](`object`: Null, path: TKey, defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */, TDefault](`object`: Null, path: js.Array[TKey], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */](`object`: Null, path: js.Tuple2[TKey1, TKey2]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](`object`: TObject, path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](`object`: TObject, path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](`object`: js.UndefOr[scala.Nothing], path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](`object`: js.UndefOr[scala.Nothing], path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault](`object`: Null, path: js.Tuple2[TKey1, TKey2], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */](`object`: Null, path: js.Tuple3[TKey1, TKey2, TKey3]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](`object`: TObject, path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](`object`: TObject, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](`object`: js.UndefOr[scala.Nothing], path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](`object`: js.UndefOr[scala.Nothing], path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault](`object`: Null, path: js.Tuple3[TKey1, TKey2, TKey3], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */](`object`: Null, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](`object`: TObject, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](
    `object`: js.UndefOr[scala.Nothing],
    path: js.Tuple4[TKey1, TKey2, TKey3, TKey4],
    defaultValue: TDefault
  ): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def get[TObject /* <: js.Object */, TKey1 /* <: /* keyof TObject */ String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault](`object`: Null, path: js.Tuple4[TKey1, TKey2, TKey3, TKey4], defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: TObject, path: TKey): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  @JSName("get")
  def get_TObject_ObjectTKey_String_Union[TObject /* <: js.Object */, TKey /* <: /* keyof TObject */ String */](`object`: TObject, path: js.Array[TKey]): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.get
    */
  @JSName("get")
  def get_T_T[T](`object`: NumericDictionary[T], path: Double): T = js.native
  
  /**
    * Creates an object composed of keys generated from the results of running each element of collection through
    * iteratee. The corresponding value of each key is an array of the elements responsible for generating the
    * key. The iteratee is invoked with one argument: (value).
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns the composed aggregate object.
    */
  def groupBy[T](): Dictionary[js.Array[T]] = js.native
  def groupBy[T /* <: js.Object */](collection: T): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def groupBy[T /* <: js.Object */](
    collection: T,
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def groupBy[T](collection: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): Dictionary[js.Array[T]] = js.native
  def groupBy[T](collection: Null, iteratee: ValueIteratee[T]): Dictionary[js.Array[T]] = js.native
  def groupBy[T](collection: List[T]): Dictionary[js.Array[T]] = js.native
  def groupBy[T](collection: List[T], iteratee: ValueIteratee[T]): Dictionary[js.Array[T]] = js.native
  /**
    * @see _.groupBy
    */
  @JSName("groupBy")
  def groupBy_T_Object[T /* <: js.Object */](): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("groupBy")
  def groupBy_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  @JSName("groupBy")
  def groupBy_T_Object[T /* <: js.Object */](
    collection: Null,
    iteratee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  
  /**
    * Checks if value is greater than other.
    *
    * @param value The value to compare.
    * @param other The other value to compare.
    * @return Returns true if value is greater than other, else false.
    */
  def gt(value: js.Any, other: js.Any): Boolean = js.native
  
  /**
    * Checks if value is greater than or equal to other.
    *
    * @param value The value to compare.
    * @param other The other value to compare.
    * @return Returns true if value is greater than or equal to other, else false.
    */
  def gte(value: js.Any, other: js.Any): Boolean = js.native
  
  /**
    * Checks if `path` is a direct property of `object`.
    *
    * @category Object
    * @param object The object to query.
    * @param path The path to check.
    * @returns Returns `true` if `path` exists, else `false`.
    * @example
    *
    * var object = { 'a': { 'b': { 'c': 3 } } };
    * var other = _.create({ 'a': _.create({ 'b': _.create({ 'c': 3 }) }) });
    *
    * _.has(object, 'a');
    * // => true
    *
    * _.has(object, 'a.b.c');
    * // => true
    *
    * _.has(object, ['a', 'b', 'c']);
    * // => true
    *
    * _.has(other, 'a');
    * // => false
    */
  def has[T](`object`: T, path: PropertyPath): Boolean = js.native
  
  /**
    * Checks if `path` is a direct or inherited property of `object`.
    *
    * @category Object
    * @param object The object to query.
    * @param path The path to check.
    * @returns Returns `true` if `path` exists, else `false`.
    * @example
    *
    * var object = _.create({ 'a': _.create({ 'b': _.create({ 'c': 3 }) }) });
    *
    * _.hasIn(object, 'a');
    * // => true
    *
    * _.hasIn(object, 'a.b.c');
    * // => true
    *
    * _.hasIn(object, ['a', 'b', 'c']);
    * // => true
    *
    * _.hasIn(object, 'b');
    * // => false
    */
  def hasIn[T](`object`: T, path: PropertyPath): Boolean = js.native
  
  /**
    * Gets the first element of array.
    *
    * @alias _.first
    *
    * @param array The array to query.
    * @return Returns the first element of array.
    */
  def head[T](): js.UndefOr[T] = js.native
  def head[T](array: List[T]): js.UndefOr[T] = js.native
  
  /**
    * @see _.identity
    */
  def identity(): js.UndefOr[scala.Nothing] = js.native
  /**
    * This method returns the first argument provided to it.
    *
    * @param value Any value.
    * @return Returns value.
    */
  def identity[T](value: T): T = js.native
  
  /**
    * Checks if n is between start and up to but not including, end. If end is not specified it’s set to start
    * with start then set to 0.
    *
    * @param n The number to check.
    * @param start The start of the range.
    * @param end The end of the range.
    * @return Returns true if n is in the range, else false.
    */
  def inRange(n: Double, start: Double): Boolean = js.native
  def inRange(n: Double, start: Double, end: Double): Boolean = js.native
  
  def includes[T](collection: js.UndefOr[scala.Nothing], target: T): Boolean = js.native
  def includes[T](collection: js.UndefOr[scala.Nothing], target: T, fromIndex: Double): Boolean = js.native
  def includes[T](collection: Null, target: T): Boolean = js.native
  def includes[T](collection: Null, target: T, fromIndex: Double): Boolean = js.native
  def includes[T](collection: Dictionary[T], target: T): Boolean = js.native
  def includes[T](collection: Dictionary[T], target: T, fromIndex: Double): Boolean = js.native
  /**
    * Checks if target is in collection using SameValueZero for equality comparisons. If fromIndex is negative,
    * it’s used as the offset from the end of collection.
    *
    * @param collection The collection to search.
    * @param target The value to search for.
    * @param fromIndex The index to search from.
    * @return True if the target element is found, else false.
    */
  def includes[T](collection: List[T], target: T): Boolean = js.native
  def includes[T](collection: List[T], target: T, fromIndex: Double): Boolean = js.native
  def includes[T](collection: NumericDictionary[T], target: T): Boolean = js.native
  def includes[T](collection: NumericDictionary[T], target: T, fromIndex: Double): Boolean = js.native
  
  def indexOf[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def indexOf[T](array: js.UndefOr[scala.Nothing], value: T, fromIndex: Double): Double = js.native
  def indexOf[T](array: Null, value: T): Double = js.native
  def indexOf[T](array: Null, value: T, fromIndex: Double): Double = js.native
  /**
    * Gets the index at which the first occurrence of `value` is found in `array`
    * using [`SameValueZero`](http://ecma-international.org/ecma-262/6.0/#sec-samevaluezero)
    * for equality comparisons. If `fromIndex` is negative, it's used as the offset
    * from the end of `array`.
    *
    * @category Array
    * @param array The array to search.
    * @param value The value to search for.
    * @param [fromIndex=0] The index to search from.
    * @returns Returns the index of the matched value, else `-1`.
    * @example
    *
    * _.indexOf([1, 2, 1, 2], 2);
    * // => 1
    *
    * // using `fromIndex`
    * _.indexOf([1, 2, 1, 2], 2, 2);
    * // => 3
    */
  def indexOf[T](array: List[T], value: T): Double = js.native
  def indexOf[T](array: List[T], value: T, fromIndex: Double): Double = js.native
  
  /**
    * Gets all but the last element of array.
    *
    * @param array The array to query.
    * @return Returns the slice of array.
    */
  def initial[T](): js.Array[T] = js.native
  def initial[T](array: List[T]): js.Array[T] = js.native
  
  /**
    * Creates an array of unique values that are included in all of the provided arrays using SameValueZero for
    * equality comparisons.
    *
    * @param arrays The arrays to inspect.
    * @return Returns the new array of shared values.
    */
  def intersection[T](arrays: (js.UndefOr[List[T] | Null])*): js.Array[T] = js.native
  
  def intersectionBy[T](array: js.UndefOr[scala.Nothing], values: List[T]*): js.Array[T] = js.native
  def intersectionBy[T](array: Null, values: List[T]*): js.Array[T] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T](array: List[T], values: List[T]*): js.Array[T] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T](values: (List[T] | ValueIteratee[T])*): js.Array[T] = js.native
  def intersectionBy[T1, T2](array: Null, values: List[T2], iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  /**
    * This method is like `_.intersection` except that it accepts `iteratee`
    * which is invoked for each element of each `arrays` to generate the criterion
    * by which uniqueness is computed. The iteratee is invoked with one argument: (value).
    *
    * @category Array
    * @param [arrays] The arrays to inspect.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns the new array of shared values.
    * @example
    *
    * _.intersectionBy([2.1, 1.2], [4.3, 2.4], Math.floor);
    * // => [2.1]
    *
    * // using the `_.property` iteratee shorthand
    * _.intersectionBy([{ 'x': 1 }], [{ 'x': 2 }, { 'x': 1 }], 'x');
    * // => [{ 'x': 1 }]
    */
  def intersectionBy[T1, T2](array: List[T1], values: List[T2], iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  def intersectionBy[T1, T2, T3](array: Null, values1: List[T2], values2: List[T3], iteratee: ValueIteratee[T1 | T2 | T3]): js.Array[T1] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3](array: List[T1], values1: List[T2], values2: List[T3], iteratee: ValueIteratee[T1 | T2 | T3]): js.Array[T1] = js.native
  def intersectionBy[T1, T2, T3, T4](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  def intersectionBy[T1, T2, T3, T4](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  /**
    * @see _.intersectionBy
    */
  def intersectionBy[T1, T2, T3, T4](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (ValueIteratee[T1 | T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  
  def intersectionWith[T](array: js.UndefOr[scala.Nothing], values: (List[T] | (Comparator2[T, scala.Nothing]))*): js.Array[T] = js.native
  def intersectionWith[T](array: Null, values: (List[T] | (Comparator2[T, scala.Nothing]))*): js.Array[T] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T](array: List[T], values: (List[T] | (Comparator2[T, scala.Nothing]))*): js.Array[T] = js.native
  def intersectionWith[T1, T2](array: js.UndefOr[scala.Nothing], values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  def intersectionWith[T1, T2](array: Null, values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  /**
    * Creates an array of unique `array` values not included in the other
    * provided arrays using [`SameValueZero`](http://ecma-international.org/ecma-262/6.0/#sec-samevaluezero)
    * for equality comparisons.
    *
    * @category Array
    * @param [values] The arrays to inspect.
    * @param [comparator] The comparator invoked per element.
    * @returns Returns the new array of filtered values.
    * @example
    *
    * var objects = [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }];
    * var others = [{ 'x': 1, 'y': 1 }, { 'x': 1, 'y': 2 }];
    * _.intersectionWith(objects, others, _.isEqual);
    * // => [{ 'x': 1, 'y': 2 }]
    */
  def intersectionWith[T1, T2](array: List[T1], values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  def intersectionWith[T1, T2, T3](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    comparator: Comparator2[T1, T2 | T3]
  ): js.Array[T1] = js.native
  def intersectionWith[T1, T2, T3](array: Null, values1: List[T2], values2: List[T3], comparator: Comparator2[T1, T2 | T3]): js.Array[T1] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3](array: List[T1], values1: List[T2], values2: List[T3], comparator: Comparator2[T1, T2 | T3]): js.Array[T1] = js.native
  def intersectionWith[T1, T2, T3, T4](
    array: js.UndefOr[scala.Nothing],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  def intersectionWith[T1, T2, T3, T4](
    array: Null,
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  /**
    * @see _.intersectionWith
    */
  def intersectionWith[T1, T2, T3, T4](
    array: List[T1],
    values1: List[T2],
    values2: List[T3],
    values: (List[T4] | (Comparator2[T1, T2 | T3 | T4]))*
  ): js.Array[T1] = js.native
  
  /**
    * Creates an object composed of the inverted keys and values of object. If object contains duplicate values,
    * subsequent values overwrite property assignments of previous values unless multiValue is true.
    *
    * @param object The object to invert.
    * @param multiValue Allow multiple values per key.
    * @return Returns the new inverted object.
    */
  def invert(`object`: js.Object): Dictionary[String] = js.native
  
  /**
    * This method is like _.invert except that the inverted object is generated from the results of running each
    * element of object through iteratee. The corresponding inverted value of each inverted key is an array of
    * keys responsible for generating the inverted value. The iteratee is invoked with one argument: (value).
    *
    * @param object The object to invert.
    * @param interatee The iteratee invoked per element.
    * @return Returns the new inverted object.
    */
  def invertBy[T](): Dictionary[js.Array[String]] = js.native
  def invertBy[T /* <: js.Object */](`object`: T): Dictionary[js.Array[String]] = js.native
  def invertBy[T /* <: js.Object */](
    `object`: T,
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: js.UndefOr[scala.Nothing], interatee: ValueIteratee[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: Null, interatee: ValueIteratee[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: Dictionary[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: Dictionary[T], interatee: ValueIteratee[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: List[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: List[T], interatee: ValueIteratee[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: NumericDictionary[T]): Dictionary[js.Array[String]] = js.native
  def invertBy[T](`object`: NumericDictionary[T], interatee: ValueIteratee[T]): Dictionary[js.Array[String]] = js.native
  /**
    * @see _.invertBy
    */
  @JSName("invertBy")
  def invertBy_T_Object[T /* <: js.Object */](): Dictionary[js.Array[String]] = js.native
  @JSName("invertBy")
  def invertBy_T_Object[T /* <: js.Object */](
    `object`: js.UndefOr[scala.Nothing],
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[js.Array[String]] = js.native
  @JSName("invertBy")
  def invertBy_T_Object[T /* <: js.Object */](
    `object`: Null,
    interatee: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): Dictionary[js.Array[String]] = js.native
  
  /**
    * Invokes the method at path of object.
    * @param object The object to query.
    * @param path The path of the method to invoke.
    * @param args The arguments to invoke the method with.
    **/
  def invoke(`object`: js.Any, path: PropertyPath, args: js.Any*): js.Any = js.native
  
  def invokeMap(collection: js.UndefOr[scala.Nothing], methodName: String, args: js.Any*): js.Array[_] = js.native
  /**
    * Invokes the method named by methodName on each element in the collection returning
    * an array of the results of each invoked method. Additional arguments will be provided
    * to each invoked method. If methodName is a function it will be invoked for, and this
    * bound to, each element in the collection.
    * @param collection The collection to iterate over.
    * @param methodName The name of the method to invoke.
    * @param args Arguments to invoke the method with.
    **/
  def invokeMap(collection: js.Object, methodName: String, args: js.Any*): js.Array[_] = js.native
  def invokeMap(collection: Null, methodName: String, args: js.Any*): js.Array[_] = js.native
  def invokeMap[TResult](
    collection: js.UndefOr[scala.Nothing],
    method: js.Function1[/* repeated */ js.Any, TResult],
    args: js.Any*
  ): js.Array[TResult] = js.native
  /**
    * @see _.invokeMap
    **/
  def invokeMap[TResult](collection: js.Object, method: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): js.Array[TResult] = js.native
  def invokeMap[TResult](collection: Null, method: js.Function1[/* repeated */ js.Any, TResult], args: js.Any*): js.Array[TResult] = js.native
  
  /**
    * Checks if value is classified as an arguments object.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isArguments(): /* is std.IArguments */ Boolean = js.native
  def isArguments(value: js.Any): /* is std.IArguments */ Boolean = js.native
  
  /**
    * Checks if value is classified as an Array object.
    * @param value The value to check.
    *
    * @return Returns true if value is correctly classified, else false.
    */
  def isArray(): /* is std.Array<any> */ Boolean = js.native
  def isArray(value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  /**
    * Checks if value is classified as an ArrayBuffer object.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isArrayBuffer(): /* is std.ArrayBuffer */ Boolean = js.native
  def isArrayBuffer(value: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
  
   // should only match if T = any
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(): /* is never */ Boolean = js.native
  /**
    * @see _.isArrayLike
    */
  def isArrayLike(value: js.Any): /* is lodash.anon.Length */ Boolean = js.native
  def isArrayLike(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  /**
    * Checks if `value` is array-like. A value is considered array-like if it's
    * not a function and has a `value.length` that's an integer greater than or
    * equal to `0` and less than or equal to `Number.MAX_SAFE_INTEGER`.
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is array-like, else `false`.
    * @example
    *
    * _.isArrayLike([1, 2, 3]);
    * // => true
    *
    * _.isArrayLike(document.body.children);
    * // => true
    *
    * _.isArrayLike('abc');
    * // => true
    *
    * _.isArrayLike(_.noop);
    * // => false
    */
  def isArrayLike[T](value: T with String with Double): Boolean = js.native
  
   // should only match if T = any
  /**
    * @see _.isArrayLike
    */
  // tslint:disable-next-line:ban-types (type guard doesn't seem to work correctly without the Function type)
  def isArrayLikeObject(): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: String): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: js.Function): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: js.Function1[/* repeated */ js.Any, _]): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: Boolean): /* is never */ Boolean = js.native
  def isArrayLikeObject(value: Double): /* is never */ Boolean = js.native
  def isArrayLikeObject[T /* <: js.Object */](value: T): Boolean = js.native
  /**
    * This method is like `_.isArrayLike` except that it also checks if `value`
    * is an object.
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is an array-like object, else `false`.
    * @example
    *
    * _.isArrayLikeObject([1, 2, 3]);
    * // => true
    *
    * _.isArrayLikeObject(document.body.children);
    * // => true
    *
    * _.isArrayLikeObject('abc');
    * // => false
    *
    * _.isArrayLikeObject(_.noop);
    * // => false
    */
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T[T](value: T with String with Double): Boolean = js.native
  /**
    * @see _.isArrayLike
    */
  // tslint:disable-next-line:ban-types (type guard doesn't seem to work correctly without the Function type)
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T_Object[T /* <: js.Object */](): Boolean = js.native
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T_Object[T /* <: js.Object */](value: String): Boolean = js.native
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T_Object[T /* <: js.Object */](value: js.Function): Boolean = js.native
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T_Object[T /* <: js.Object */](value: js.Function1[/* repeated */ js.Any, _]): Boolean = js.native
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T_Object[T /* <: js.Object */](value: Boolean): Boolean = js.native
  @JSName("isArrayLikeObject")
  def isArrayLikeObject_T_Object[T /* <: js.Object */](value: Double): Boolean = js.native
  
  /**
    * DEPRECATED
    */
  @JSName("isArray")
  def isArray_T[T](): /* is std.Array<any> */ Boolean = js.native
  @JSName("isArray")
  def isArray_T[T](value: js.Any): /* is std.Array<any> */ Boolean = js.native
  
  /**
    * Checks if value is classified as a boolean primitive or object.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isBoolean(): /* is boolean */ Boolean = js.native
  def isBoolean(value: js.Any): /* is boolean */ Boolean = js.native
  
  /**
    * Checks if value is a buffer.
    *
    * @param value The value to check.
    * @return Returns true if value is a buffer, else false.
    */
  def isBuffer(): Boolean = js.native
  def isBuffer(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is classified as a Date object.
    * @param value The value to check.
    *
    * @return Returns true if value is correctly classified, else false.
    */
  def isDate(): /* is std.Date */ Boolean = js.native
  def isDate(value: js.Any): /* is std.Date */ Boolean = js.native
  
  /**
    * Checks if value is a DOM element.
    *
    * @param value The value to check.
    * @return Returns true if value is a DOM element, else false.
    */
  def isElement(): Boolean = js.native
  def isElement(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is empty. A value is considered empty unless it’s an arguments object, array, string, or
    * jQuery-like collection with a length greater than 0 or an object with own enumerable properties.
    *
    * @param value The value to inspect.
    * @return Returns true if value is empty, else false.
    */
  def isEmpty(): Boolean = js.native
  def isEmpty(value: js.Any): Boolean = js.native
  
  /**
    * Performs a deep comparison between two values to determine if they are
    * equivalent.
    *
    * **Note:** This method supports comparing arrays, array buffers, booleans,
    * date objects, error objects, maps, numbers, `Object` objects, regexes,
    * sets, strings, symbols, and typed arrays. `Object` objects are compared
    * by their own, not inherited, enumerable properties. Functions and DOM
    * nodes are **not** supported.
    *
    * @category Lang
    * @param value The value to compare.
    * @param other The other value to compare.
    * @returns Returns `true` if the values are equivalent, else `false`.
    * @example
    *
    * var object = { 'user': 'fred' };
    * var other = { 'user': 'fred' };
    *
    * _.isEqual(object, other);
    * // => true
    *
    * object === other;
    * // => false
    */
  def isEqual(value: js.Any, other: js.Any): Boolean = js.native
  
  /**
    * This method is like `_.isEqual` except that it accepts `customizer` which is
    * invoked to compare values. If `customizer` returns `undefined` comparisons are
    * handled by the method instead. The `customizer` is invoked with up to seven arguments:
    * (objValue, othValue [, index|key, object, other, stack]).
    *
    * @category Lang
    * @param value The value to compare.
    * @param other The other value to compare.
    * @param [customizer] The function to customize comparisons.
    * @returns Returns `true` if the values are equivalent, else `false`.
    * @example
    *
    * function isGreeting(value) {
    *   return /^h(?:i|ello)$/.test(value);
    * }
    *
    * function customizer(objValue, othValue) {
    *   if (isGreeting(objValue) && isGreeting(othValue)) {
    *     return true;
    *   }
    * }
    *
    * var array = ['hello', 'goodbye'];
    * var other = ['hi', 'goodbye'];
    *
    * _.isEqualWith(array, other, customizer);
    * // => true
    */
  def isEqualWith(value: js.Any, other: js.Any): Boolean = js.native
  def isEqualWith(value: js.Any, other: js.Any, customizer: IsEqualCustomizer): Boolean = js.native
  
  /**
    * Checks if value is an Error, EvalError, RangeError, ReferenceError, SyntaxError, TypeError, or URIError
    * object.
    *
    * @param value The value to check.
    * @return Returns true if value is an error object, else false.
    */
  def isError(value: js.Any): /* is std.Error */ Boolean = js.native
  
  /**
    * Checks if value is a finite primitive number.
    *
    * Note: This method is based on Number.isFinite.
    *
    * @param value The value to check.
    * @return Returns true if value is a finite number, else false.
    */
  def isFinite(): Boolean = js.native
  def isFinite(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is a callable function.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isFunction(value: js.Any): Boolean = js.native
  
  /**
    * Checks if `value` is an integer.
    *
    * **Note:** This method is based on [`Number.isInteger`](https://mdn.io/Number/isInteger).
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is an integer, else `false`.
    * @example
    *
    * _.isInteger(3);
    * // => true
    *
    * _.isInteger(Number.MIN_VALUE);
    * // => false
    *
    * _.isInteger(Infinity);
    * // => false
    *
    * _.isInteger('3');
    * // => false
    */
  def isInteger(): Boolean = js.native
  def isInteger(value: js.Any): Boolean = js.native
  
  /**
    * Checks if `value` is a valid array-like length.
    *
    * **Note:** This function is loosely based on [`ToLength`](http://ecma-international.org/ecma-262/6.0/#sec-tolength).
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is a valid length, else `false`.
    * @example
    *
    * _.isLength(3);
    * // => true
    *
    * _.isLength(Number.MIN_VALUE);
    * // => false
    *
    * _.isLength(Infinity);
    * // => false
    *
    * _.isLength('3');
    * // => false
    */
  def isLength(): Boolean = js.native
  def isLength(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is classified as a Map object.
    *
    * @param value The value to check.
    * @returns Returns true if value is correctly classified, else false.
    */
  def isMap(): /* is std.Map<any, any> */ Boolean = js.native
  def isMap(value: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  
  /**
    * Performs a deep comparison between `object` and `source` to determine if
    * `object` contains equivalent property values.
    *
    * **Note:** This method supports comparing the same values as `_.isEqual`.
    *
    * @category Lang
    * @param object The object to inspect.
    * @param source The object of property values to match.
    * @returns Returns `true` if `object` is a match, else `false`.
    * @example
    *
    * var object = { 'user': 'fred', 'age': 40 };
    *
    * _.isMatch(object, { 'age': 40 });
    * // => true
    *
    * _.isMatch(object, { 'age': 36 });
    * // => false
    */
  def isMatch(`object`: js.Object, source: js.Object): Boolean = js.native
  
  /**
    * This method is like `_.isMatch` except that it accepts `customizer` which
    * is invoked to compare values. If `customizer` returns `undefined` comparisons
    * are handled by the method instead. The `customizer` is invoked with three
    * arguments: (objValue, srcValue, index|key, object, source).
    *
    * @category Lang
    * @param object The object to inspect.
    * @param source The object of property values to match.
    * @param [customizer] The function to customize comparisons.
    * @returns Returns `true` if `object` is a match, else `false`.
    * @example
    *
    * function isGreeting(value) {
    *   return /^h(?:i|ello)$/.test(value);
    * }
    *
    * function customizer(objValue, srcValue) {
    *   if (isGreeting(objValue) && isGreeting(srcValue)) {
    *     return true;
    *   }
    * }
    *
    * var object = { 'greeting': 'hello' };
    * var source = { 'greeting': 'hi' };
    *
    * _.isMatchWith(object, source, customizer);
    * // => true
    */
  def isMatchWith(`object`: js.Object, source: js.Object, customizer: isMatchWithCustomizer): Boolean = js.native
  
  /**
    * Checks if value is NaN.
    *
    * Note: This method is not the same as isNaN which returns true for undefined and other non-numeric values.
    *
    * @param value The value to check.
    * @return Returns true if value is NaN, else false.
    */
  def isNaN(): Boolean = js.native
  def isNaN(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is a native function.
    * @param value The value to check.
    *
    * @retrun Returns true if value is a native function, else false.
    */
  def isNative(value: js.Any): Boolean = js.native
  
  /**
    * Checks if `value` is `null` or `undefined`.
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is nullish, else `false`.
    * @example
    *
    * _.isNil(null);
    * // => true
    *
    * _.isNil(void 0);
    * // => true
    *
    * _.isNil(NaN);
    * // => false
    */
  def isNil(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is null.
    *
    * @param value The value to check.
    * @return Returns true if value is null, else false.
    */
  def isNull(value: js.Any): /* is null */ Boolean = js.native
  
  /**
    * Checks if value is classified as a Number primitive or object.
    *
    * Note: To exclude Infinity, -Infinity, and NaN, which are classified as numbers, use the _.isFinite method.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isNumber(): /* is number */ Boolean = js.native
  def isNumber(value: js.Any): /* is number */ Boolean = js.native
  
  /**
    * Checks if value is the language type of Object. (e.g. arrays, functions, objects, regexes, new Number(0),
    * and new String(''))
    *
    * @param value The value to check.
    * @return Returns true if value is an object, else false.
    */
  def isObject(): /* is object */ Boolean = js.native
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  
  /**
    * Checks if `value` is object-like. A value is object-like if it's not `null`
    * and has a `typeof` result of "object".
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is object-like, else `false`.
    * @example
    *
    * _.isObjectLike({});
    * // => true
    *
    * _.isObjectLike([1, 2, 3]);
    * // => true
    *
    * _.isObjectLike(_.noop);
    * // => false
    *
    * _.isObjectLike(null);
    * // => false
    */
  def isObjectLike(): Boolean = js.native
  def isObjectLike(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is a plain object, that is, an object created by the Object constructor or one with a
    * [[Prototype]] of null.
    *
    * Note: This method assumes objects created by the Object constructor have no inherited enumerable properties.
    *
    * @param value The value to check.
    * @return Returns true if value is a plain object, else false.
    */
  def isPlainObject(): Boolean = js.native
  def isPlainObject(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is classified as a RegExp object.
    * @param value The value to check.
    *
    * @return Returns true if value is correctly classified, else false.
    */
  def isRegExp(): /* is std.RegExp */ Boolean = js.native
  def isRegExp(value: js.Any): /* is std.RegExp */ Boolean = js.native
  
  /**
    * Checks if `value` is a safe integer. An integer is safe if it's an IEEE-754
    * double precision number which isn't the result of a rounded unsafe integer.
    *
    * **Note:** This method is based on [`Number.isSafeInteger`](https://mdn.io/Number/isSafeInteger).
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is a safe integer, else `false`.
    * @example
    *
    * _.isSafeInteger(3);
    * // => true
    *
    * _.isSafeInteger(Number.MIN_VALUE);
    * // => false
    *
    * _.isSafeInteger(Infinity);
    * // => false
    *
    * _.isSafeInteger('3');
    * // => false
    */
  def isSafeInteger(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is classified as a Set object.
    *
    * @param value The value to check.
    * @returns Returns true if value is correctly classified, else false.
    */
  def isSet(): /* is std.Set<any> */ Boolean = js.native
  def isSet(value: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  /**
    * Checks if value is classified as a String primitive or object.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isString(): /* is string */ Boolean = js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  
  /**
    * Checks if `value` is classified as a `Symbol` primitive or object.
    *
    * @category Lang
    * @param value The value to check.
    * @returns Returns `true` if `value` is correctly classified, else `false`.
    * @example
    *
    * _.isSymbol(Symbol.iterator);
    * // => true
    *
    * _.isSymbol('abc');
    * // => false
    */
  def isSymbol(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is classified as a typed array.
    *
    * @param value The value to check.
    * @return Returns true if value is correctly classified, else false.
    */
  def isTypedArray(value: js.Any): Boolean = js.native
  
  /**
    * Checks if value is undefined.
    *
    * @param value The value to check.
    * @return Returns true if value is undefined, else false.
    */
  def isUndefined(value: js.Any): /* is undefined */ Boolean = js.native
  
  /**
    * Checks if value is classified as a WeakMap object.
    *
    * @param value The value to check.
    * @returns Returns true if value is correctly classified, else false.
    */
  def isWeakMap(): /* is std.WeakMap<object, any> */ Boolean = js.native
  def isWeakMap(value: js.Any): /* is std.WeakMap<object, any> */ Boolean = js.native
  
  /**
    * Checks if value is classified as a WeakSet object.
    *
    * @param value The value to check.
    * @returns Returns true if value is correctly classified, else false.
    */
  def isWeakSet(): /* is std.WeakSet<object> */ Boolean = js.native
  def isWeakSet(value: js.Any): /* is std.WeakSet<object> */ Boolean = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): FnCallValue = js.native
  /**
    * @see _.iteratee
    */
  // tslint:disable-next-line:unified-signatures Tests fail in TS2.3 if the overloads are joined
  def iteratee(func: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def iteratee(func: js.Object): js.Function1[/* repeated */ js.Any, _] = js.native
  /**
    * Creates a function that invokes `func` with the arguments of the created
    * function. If `func` is a property name the created callback returns the
    * property value for a given element. If `func` is an object the created
    * callback returns `true` for elements that contain the equivalent object properties, otherwise it returns `false`.
    *
    * @category Util
    * @param [func=_.identity] The value to convert to a callback.
    * @returns Returns the callback.
    * @example
    *
    * var users = [
    *   { 'user': 'barney', 'age': 36 },
    *   { 'user': 'fred',   'age': 40 }
    * ];
    *
    * // create custom iteratee shorthands
    * _.iteratee = _.wrap(_.iteratee, function(callback, func) {
    *   var p = /^(\S+)\s*([<>])\s*(\S+)$/.exec(func);
    *   return !p ? callback(func) : function(object) {
    *     return (p[2] == '>' ? object[p[1]] > p[3] : object[p[1]] < p[3]);
    *   };
    * });
    *
    * _.filter(users, 'age > 36');
    * // => [{ 'user': 'fred', 'age': 40 }]
    */
  def iteratee[TFunction /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunction): TFunction = js.native
  
  /**
    * Converts all elements in `array` into a string separated by `separator`.
    *
    * @param array The array to convert.
    * @param separator The element separator.
    * @returns Returns the joined string.
    */
  def join(): String = js.native
  def join(array: js.UndefOr[scala.Nothing], separator: String): String = js.native
  def join(array: Null, separator: String): String = js.native
  def join(array: List[_]): String = js.native
  def join(array: List[_], separator: String): String = js.native
  
  /**
    * Converts string to kebab case.
    *
    * @param string The string to convert.
    * @return Returns the kebab cased string.
    */
  def kebabCase(): String = js.native
  def kebabCase(string: String): String = js.native
  
  /**
    * Creates an object composed of keys generated from the results of running each element of collection through
    * iteratee. The corresponding value of each key is the last element responsible for generating the key. The
    * iteratee function is invoked with one argument: (value).
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns the composed aggregate object.
    */
  def keyBy[T](): Dictionary[T] = js.native
  def keyBy[T /* <: js.Object */](collection: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def keyBy[T /* <: js.Object */](
    collection: T,
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def keyBy[T](collection: js.UndefOr[scala.Nothing], iteratee: ValueIterateeCustom[T, PropertyName]): Dictionary[T] = js.native
  def keyBy[T](collection: Null, iteratee: ValueIterateeCustom[T, PropertyName]): Dictionary[T] = js.native
  def keyBy[T](collection: List[T]): Dictionary[T] = js.native
  def keyBy[T](collection: List[T], iteratee: ValueIterateeCustom[T, PropertyName]): Dictionary[T] = js.native
  /**
    * @see _.keyBy
    */
  @JSName("keyBy")
  def keyBy_T_Object[T /* <: js.Object */](): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("keyBy")
  def keyBy_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("keyBy")
  def keyBy_T_Object[T /* <: js.Object */](
    collection: Null,
    iteratee: ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ]
  ): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * Creates an array of the own enumerable property names of object.
    *
    * Note: Non-object values are coerced to objects. See the ES spec for more details.
    *
    * @param object The object to query.
    * @return Returns the array of property names.
    */
  def keys(): js.Array[String] = js.native
  def keys(`object`: js.Any): js.Array[String] = js.native
  
  /**
    * Creates an array of the own and inherited enumerable property names of object.
    *
    * Note: Non-object values are coerced to objects.
    *
    * @param object The object to query.
    * @return An array of property names.
    */
  def keysIn(): js.Array[String] = js.native
  def keysIn(`object`: js.Any): js.Array[String] = js.native
  
  /**
    * Gets the last element of array.
    *
    * @param array The array to query.
    * @return Returns the last element of array.
    */
  def last[T](): js.UndefOr[T] = js.native
  def last[T](array: List[T]): js.UndefOr[T] = js.native
  
  def lastIndexOf[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def lastIndexOf[T](array: js.UndefOr[scala.Nothing], value: T, fromIndex: Double): Double = js.native
  def lastIndexOf[T](array: Null, value: T): Double = js.native
  def lastIndexOf[T](array: Null, value: T, fromIndex: Double): Double = js.native
  /**
    * This method is like _.indexOf except that it iterates over elements of array from right to left.
    *
    * @param array The array to search.
    * @param value The value to search for.
    * @param fromIndex The index to search from or true to perform a binary search on a sorted array.
    * @return Returns the index of the matched value, else -1.
    */
  def lastIndexOf[T](array: List[T], value: T): Double = js.native
  def lastIndexOf[T](array: List[T], value: T, fromIndex: Double): Double = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true[T](array: js.UndefOr[scala.Nothing], value: T, fromIndex: `true`): Double = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true[T](array: Null, value: T, fromIndex: `true`): Double = js.native
  @JSName("lastIndexOf")
  def lastIndexOf_true[T](array: List[T], value: T, fromIndex: `true`): Double = js.native
  
  /**
    * Converts `string`, as space separated words, to lower case.
    *
    * @param string The string to convert.
    * @return Returns the lower cased string.
    */
  def lowerCase(): String = js.native
  def lowerCase(string: String): String = js.native
  
  /**
    * Converts the first character of `string` to lower case.
    *
    * @param string The string to convert.
    * @return Returns the converted string.
    */
  def lowerFirst(): String = js.native
  def lowerFirst(string: String): String = js.native
  
  /**
    * Checks if value is less than other.
    *
    * @param value The value to compare.
    * @param other The other value to compare.
    * @return Returns true if value is less than other, else false.
    */
  def lt(value: js.Any, other: js.Any): Boolean = js.native
  
  /**
    * Checks if value is less than or equal to other.
    *
    * @param value The value to compare.
    * @param other The other value to compare.
    * @return Returns true if value is less than or equal to other, else false.
    */
  def lte(value: js.Any, other: js.Any): Boolean = js.native
  
  /**
    * @see _.map
    */
  def map[T](): js.Array[T] = js.native
  def map[T](collection: js.UndefOr[scala.Nothing], iteratee: String): js.Array[_] = js.native
  def map[T](collection: js.UndefOr[scala.Nothing], iteratee: js.Object): js.Array[Boolean] = js.native
  def map[T](collection: Null, iteratee: String): js.Array[_] = js.native
  def map[T](collection: Null, iteratee: js.Object): js.Array[Boolean] = js.native
  def map[T](collection: Dictionary[T]): js.Array[T] = js.native
  def map[T](collection: Dictionary[T], iteratee: String): js.Array[_] = js.native
  def map[T](collection: Dictionary[T], iteratee: js.Object): js.Array[Boolean] = js.native
  def map[T](collection: List[T]): js.Array[T] = js.native
  def map[T](collection: List[T], iteratee: String): js.Array[_] = js.native
  def map[T](collection: List[T], iteratee: js.Object): js.Array[Boolean] = js.native
  def map[T](collection: NumericDictionary[T]): js.Array[T] = js.native
  def map[T](collection: NumericDictionary[T], iteratee: String): js.Array[_] = js.native
  def map[T](collection: NumericDictionary[T], iteratee: js.Object): js.Array[Boolean] = js.native
  /**
    * @see _.map
    */
  def map[T /* <: js.Object */, TResult](collection: T, iteratee: ObjectIterator[T, TResult]): js.Array[TResult] = js.native
  def map[T, K /* <: /* keyof T */ String */](collection: js.UndefOr[scala.Nothing], iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def map[T /* <: js.Object */, TResult](collection: js.UndefOr[scala.Nothing], iteratee: ObjectIterator[T, TResult]): js.Array[TResult] = js.native
  /**
    * Creates an array of values by running each element in collection through iteratee. The iteratee is
    * invoked with three arguments: (value, index|key, collection).
    *
    * Many lodash methods are guarded to work as iteratees for methods like _.every, _.filter, _.map, _.mapValues,
    * _.reject, and _.some.
    *
    * The guarded methods are:
    * ary, callback, chunk, clone, create, curry, curryRight, drop, dropRight, every, fill, flatten, invert, max,
    * min, parseInt, slice, sortBy, take, takeRight, template, trim, trimLeft, trimRight, trunc, random, range,
    * sample, some, sum, uniq, and words
    *
    * @param collection The collection to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns the new mapped array.
    */
  def map[T, TResult](collection: js.Array[T], iteratee: ArrayIterator[T, TResult]): js.Array[TResult] = js.native
  def map[T, K /* <: /* keyof T */ String */](collection: Null, iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  def map[T /* <: js.Object */, TResult](collection: Null, iteratee: ObjectIterator[T, TResult]): js.Array[TResult] = js.native
  def map[T, K /* <: /* keyof T */ String */](collection: Dictionary[T], iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  /** @see _.map */
  def map[T, K /* <: /* keyof T */ String */](collection: List[T], iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  /**
    * @see _.map
    */
  def map[T, TResult](collection: List[T], iteratee: ListIterator[T, TResult]): js.Array[TResult] = js.native
  def map[T, K /* <: /* keyof T */ String */](collection: NumericDictionary[T], iteratee: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  /**
    * The opposite of _.mapValues; this method creates an object with the same values as object and keys generated
    * by running each own enumerable property of object through iteratee.
    *
    * @param object The object to iterate over.
    * @param iteratee The function invoked per iteration.
    * @return Returns the new mapped object.
    */
  def mapKeys[T](): Dictionary[T] = js.native
  def mapKeys[T /* <: js.Object */](`object`: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def mapKeys[T /* <: js.Object */](`object`: T, iteratee: ObjectIteratee[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def mapKeys[T](`object`: js.UndefOr[scala.Nothing], iteratee: ListIteratee[T]): Dictionary[T] = js.native
  def mapKeys[T](`object`: Null, iteratee: ListIteratee[T]): Dictionary[T] = js.native
  def mapKeys[T](`object`: List[T]): Dictionary[T] = js.native
  def mapKeys[T](`object`: List[T], iteratee: ListIteratee[T]): Dictionary[T] = js.native
  /**
    * @see _.mapKeys
    */
  @JSName("mapKeys")
  def mapKeys_T_Object[T /* <: js.Object */](): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_T_Object[T /* <: js.Object */](`object`: js.UndefOr[scala.Nothing], iteratee: ObjectIteratee[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("mapKeys")
  def mapKeys_T_Object[T /* <: js.Object */](`object`: Null, iteratee: ObjectIteratee[T]): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * @see _.mapValues
    */
  def mapValues(): NumericDictionary[String] = js.native
  def mapValues(obj: String): NumericDictionary[String] = js.native
  def mapValues[T /* <: js.Object */](obj: T): PartialObject[T] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */](obj: T, iteratee: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */](obj: T, iteratee: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  def mapValues[TResult](obj: js.UndefOr[scala.Nothing], callback: StringIterator[TResult]): NumericDictionary[TResult] = js.native
  def mapValues[T](obj: js.UndefOr[scala.Nothing], iteratee: String): Dictionary[_] = js.native
  def mapValues[T](obj: js.UndefOr[scala.Nothing], iteratee: js.Object): Dictionary[Boolean] = js.native
  /**
    * Creates an object with the same keys as object and values generated by running each own
    * enumerable property of object through iteratee. The iteratee function is
    * invoked with three arguments: (value, key, object).
    *
    * @param object The object to iterate over.
    * @param iteratee  The function invoked per iteration.
    * @return Returns the new mapped object.
    */
  def mapValues[TResult](obj: String, callback: StringIterator[TResult]): NumericDictionary[TResult] = js.native
  def mapValues[TResult](obj: Null, callback: StringIterator[TResult]): NumericDictionary[TResult] = js.native
  def mapValues[T](obj: Null, iteratee: String): Dictionary[_] = js.native
  def mapValues[T](obj: Null, iteratee: js.Object): Dictionary[Boolean] = js.native
  def mapValues[T](obj: Dictionary[T]): Dictionary[T] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T](obj: Dictionary[T], iteratee: String): Dictionary[_] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T](obj: Dictionary[T], iteratee: js.Object): Dictionary[Boolean] = js.native
  def mapValues[T](obj: NumericDictionary[T]): Dictionary[T] = js.native
  def mapValues[T](obj: NumericDictionary[T], iteratee: String): Dictionary[_] = js.native
  def mapValues[T](obj: NumericDictionary[T], iteratee: js.Object): Dictionary[Boolean] = js.native
  /**
    * @see _.mapValues
    */
  def mapValues[T /* <: js.Object */, TResult](obj: T, callback: ObjectIterator[T, TResult]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  def mapValues[T, TKey /* <: /* keyof T */ String */](obj: js.UndefOr[scala.Nothing], iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def mapValues[T, TKey /* <: /* keyof T */ String */](obj: Null, iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T, TResult](obj: Dictionary[T], callback: DictionaryIterator[T, TResult]): Dictionary[TResult] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  def mapValues[T, TKey /* <: /* keyof T */ String */](obj: Dictionary[T], iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  def mapValues[T, TResult](obj: NumericDictionary[T], callback: DictionaryIterator[T, TResult]): Dictionary[TResult] = js.native
  def mapValues[T, TKey /* <: /* keyof T */ String */](obj: NumericDictionary[T], iteratee: TKey): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  @JSName("mapValues")
  def mapValues_TTResult_Dictionary[T, TResult](obj: js.UndefOr[scala.Nothing], callback: DictionaryIterator[T, TResult]): Dictionary[TResult] = js.native
  @JSName("mapValues")
  def mapValues_TTResult_Dictionary[T, TResult](obj: Null, callback: DictionaryIterator[T, TResult]): Dictionary[TResult] = js.native
  /**
    * @see _.mapValues
    * TODO: This would be better if we had a separate overload for obj: NumericDictionary that returned a NumericDictionary,
    *       but TypeScript cannot select overload signatures based on number vs string index key type.
    */
  @JSName("mapValues")
  def mapValues_T_Dictionary[T](): Dictionary[T] = js.native
  @JSName("mapValues")
  def mapValues_T_ObjectTResult_Intersection[T /* <: js.Object */, TResult](obj: js.UndefOr[scala.Nothing], callback: ObjectIterator[T, TResult]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_ObjectTResult_Intersection[T /* <: js.Object */, TResult](obj: Null, callback: ObjectIterator[T, TResult]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_Intersection[T /* <: js.Object */](obj: js.UndefOr[scala.Nothing], iteratee: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_Intersection[T /* <: js.Object */](obj: js.UndefOr[scala.Nothing], iteratee: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_Intersection[T /* <: js.Object */](obj: Null, iteratee: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: any}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  @JSName("mapValues")
  def mapValues_T_Object_Intersection[T /* <: js.Object */](obj: Null, iteratee: js.Object): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: boolean}
    */ typingsSlinky.lodash.lodashStrings.LoDashStatic with TopLevel[js.Any] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object_PartialObject[T /* <: js.Object */](): PartialObject[T] = js.native
  /**
    * @see _.mapValues
    */
  @JSName("mapValues")
  def mapValues_T_Object_T[T /* <: js.Object */](obj: T): T = js.native
  
  @JSName("map")
  def map_TTResult[T, TResult](
    collection: js.UndefOr[scala.Nothing],
    iteratee: (ArrayIterator[T, TResult]) | (ListIterator[T, TResult])
  ): js.Array[TResult] = js.native
  @JSName("map")
  def map_TTResult[T, TResult](collection: Null, iteratee: (ArrayIterator[T, TResult]) | (ListIterator[T, TResult])): js.Array[TResult] = js.native
  
  /**
    * Creates a function that performs a deep comparison between a given object and source, returning true if the
    * given object has equivalent property values, else false.
    *
    * Note: This method supports comparing arrays, booleans, Date objects, numbers, Object objects, regexes, and
    * strings. Objects are compared by their own, not inherited, enumerable properties. For comparing a single own
    * or inherited property value see _.matchesProperty.
    *
    * @param source The object of property values to match.
    * @return Returns the new function.
    */
  def matches[T](source: T): js.Function1[/* value */ js.Any, Boolean] = js.native
  
  /**
    * Creates a function that compares the property value of path on a given object to value.
    *
    * Note: This method supports comparing arrays, booleans, Date objects, numbers, Object objects, regexes, and
    * strings. Objects are compared by their own, not inherited, enumerable properties.
    *
    * @param path The path of the property to get.
    * @param srcValue The value to match.
    * @return Returns the new function.
    */
  def matchesProperty[T](path: PropertyPath, srcValue: T): js.Function1[/* value */ js.Any, Boolean] = js.native
  /**
    * @see _.matchesProperty
    */
  @JSName("matchesProperty")
  def matchesProperty_TV[T, V](path: PropertyPath, srcValue: T): js.Function1[/* value */ V, Boolean] = js.native
  
  /**
    * @see _.matches
    */
  @JSName("matches")
  def matches_TV[T, V](source: T): js.Function1[/* value */ V, Boolean] = js.native
  
  /**
    * Computes the maximum value of `array`. If `array` is empty or falsey
    * `undefined` is returned.
    *
    * @category Math
    * @param array The array to iterate over.
    * @returns Returns the maximum value.
    */
  def max[T](): js.UndefOr[T] = js.native
  def max[T](collection: List[T]): js.UndefOr[T] = js.native
  
  /**
    * This method is like `_.max` except that it accepts `iteratee` which is
    * invoked for each element in `array` to generate the criterion by which
    * the value is ranked. The iteratee is invoked with one argument: (value).
    *
    * @category Math
    * @param array The array to iterate over.
    * @param iteratee The iteratee invoked per element.
    * @returns Returns the maximum value.
    * @example
    *
    * var objects = [{ 'n': 1 }, { 'n': 2 }];
    *
    * _.maxBy(objects, function(o) { return o.a; });
    * // => { 'n': 2 }
    *
    * // using the `_.property` iteratee shorthand
    * _.maxBy(objects, 'n');
    * // => { 'n': 2 }
    */
  def maxBy[T](): js.UndefOr[T] = js.native
  def maxBy[T](collection: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def maxBy[T](collection: Null, iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def maxBy[T](collection: List[T]): js.UndefOr[T] = js.native
  def maxBy[T](collection: List[T], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  
  /**
    * Computes the mean of the values in `array`.
    *
    * @category Math
    * @param array The array to iterate over.
    * @returns Returns the mean.
    * @example
    *
    * _.mean([4, 2, 8, 6]);
    * // => 5
    */
  def mean(): Double = js.native
  def mean(collection: List[_]): Double = js.native
  
  /**
    * Computes the mean of the provided propties of the objects in the `array`
    *
    * @category Math
    * @param array The array to iterate over.
    * @param iteratee The iteratee invoked per element.
    * @returns Returns the mean.
    * @example
    *
    * _.mean([{ 'n': 4 }, { 'n': 2 }, { 'n': 8 }, { 'n': 6 }], 'n');
    * // => 5
    */
  def meanBy[T](): Double = js.native
  def meanBy[T](collection: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): Double = js.native
  def meanBy[T](collection: Null, iteratee: ValueIteratee[T]): Double = js.native
  def meanBy[T](collection: List[T]): Double = js.native
  def meanBy[T](collection: List[T], iteratee: ValueIteratee[T]): Double = js.native
  
  /**
    * Creates a function that memoizes the result of `func`. If `resolver` is
    * provided, it determines the cache key for storing the result based on the
    * arguments provided to the memoized function. By default, the first argument
    * provided to the memoized function is used as the map cache key. The `func`
    * is invoked with the `this` binding of the memoized function.
    *
    * @param func The function to have its output memoized.
    * @param resolver The function to resolve the cache key.
    * @return Returns the new memoizing function.
    */
  def memoize[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T with MemoizedFunction = js.native
  def memoize[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, resolver: js.Function1[/* repeated */ js.Any, _]): T with MemoizedFunction = js.native
  /**
    * Creates a function that memoizes the result of `func`. If `resolver` is
    * provided, it determines the cache key for storing the result based on the
    * arguments provided to the memoized function. By default, the first argument
    * provided to the memoized function is used as the map cache key. The `func`
    * is invoked with the `this` binding of the memoized function.
    *
    * @param func The function to have its output memoized.
    * @param resolver The function to resolve the cache key.
    * @return Returns the new memoizing function.
    */
  @JSName("memoize")
  var memoize_Original: Call = js.native
  
  /**
    * @see _.merge
    */
  def merge(`object`: js.Any, otherArgs: js.Any*): js.Any = js.native
  /**
    * Recursively merges own and inherited enumerable properties of source
    * objects into the destination object, skipping source properties that resolve
    * to `undefined`. Array and plain object properties are merged recursively.
    * Other objects and value types are overridden by assignment. Source objects
    * are applied from left to right. Subsequent sources overwrite property
    * assignments of previous sources.
    *
    * **Note:** This method mutates `object`.
    *
    * @category Object
    * @param object The destination object.
    * @param [sources] The source objects.
    * @returns Returns `object`.
    * @example
    *
    * var users = {
    *   'data': [{ 'user': 'barney' }, { 'user': 'fred' }]
    * };
    *
    * var ages = {
    *   'data': [{ 'age': 36 }, { 'age': 40 }]
    * };
    *
    * _.merge(users, ages);
    * // => { 'data': [{ 'user': 'barney', 'age': 36 }, { 'user': 'fred', 'age': 40 }] }
    */
  def merge[TObject, TSource](`object`: TObject, source: TSource): TObject with TSource = js.native
  /**
    * @see _.merge
    */
  def merge[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2): TObject with TSource1 with TSource2 = js.native
  /**
    * @see _.merge
    */
  def merge[TObject, TSource1, TSource2, TSource3](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see _.merge
    */
  def merge[TObject, TSource1, TSource2, TSource3, TSource4](`object`: TObject, source1: TSource1, source2: TSource2, source3: TSource3, source4: TSource4): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * @see _.mergeWith
    */
  def mergeWith(`object`: js.Any, otherArgs: js.Any*): js.Any = js.native
  /**
    * This method is like `_.merge` except that it accepts `customizer` which
    * is invoked to produce the merged values of the destination and source
    * properties. If `customizer` returns `undefined` merging is handled by the
    * method instead. The `customizer` is invoked with seven arguments:
    * (objValue, srcValue, key, object, source, stack).
    *
    * @category Object
    * @param object The destination object.
    * @param sources The source objects.
    * @param customizer The function to customize assigned values.
    * @returns Returns `object`.
    * @example
    *
    * function customizer(objValue, srcValue) {
    *   if (_.isArray(objValue)) {
    *     return objValue.concat(srcValue);
    *   }
    * }
    *
    * var object = {
    *   'fruits': ['apple'],
    *   'vegetables': ['beet']
    * };
    *
    * var other = {
    *   'fruits': ['banana'],
    *   'vegetables': ['carrot']
    * };
    *
    * _.merge(object, other, customizer);
    * // => { 'fruits': ['apple', 'banana'], 'vegetables': ['beet', 'carrot'] }
    */
  def mergeWith[TObject, TSource](`object`: TObject, source: TSource, customizer: MergeWithCustomizer): TObject with TSource = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TObject, TSource1, TSource2](`object`: TObject, source1: TSource1, source2: TSource2, customizer: MergeWithCustomizer): TObject with TSource1 with TSource2 = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TObject, TSource1, TSource2, TSource3](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    customizer: MergeWithCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 = js.native
  /**
    * @see _.mergeWith
    */
  def mergeWith[TObject, TSource1, TSource2, TSource3, TSource4](
    `object`: TObject,
    source1: TSource1,
    source2: TSource2,
    source3: TSource3,
    source4: TSource4,
    customizer: MergeWithCustomizer
  ): TObject with TSource1 with TSource2 with TSource3 with TSource4 = js.native
  
  /**
    * Creates a function that invokes the method at path on a given object. Any additional arguments are provided
    * to the invoked method.
    *
    * @param path The path of the method to invoke.
    * @param args The arguments to invoke the method with.
    * @return Returns the new function.
    */
  def method(path: PropertyPath, args: js.Any*): js.Function1[/* object */ js.Any, _] = js.native
  
  /**
    * The opposite of _.method; this method creates a function that invokes the method at a given path on object.
    * Any additional arguments are provided to the invoked method.
    *
    * @param object The object to query.
    * @param args The arguments to invoke the method with.
    * @return Returns the new function.
    */
  def methodOf(`object`: js.Object, args: js.Any*): js.Function1[/* path */ PropertyPath, _] = js.native
  
  /**
    * Computes the minimum value of `array`. If `array` is empty or falsey
    * `undefined` is returned.
    *
    * @category Math
    * @param array The array to iterate over.
    * @returns Returns the minimum value.
    */
  def min[T](): js.UndefOr[T] = js.native
  def min[T](collection: List[T]): js.UndefOr[T] = js.native
  
  /**
    * This method is like `_.min` except that it accepts `iteratee` which is
    * invoked for each element in `array` to generate the criterion by which
    * the value is ranked. The iteratee is invoked with one argument: (value).
    *
    * @category Math
    * @param array The array to iterate over.
    * @param iteratee The iteratee invoked per element.
    * @returns Returns the minimum value.
    * @example
    *
    * var objects = [{ 'n': 1 }, { 'n': 2 }];
    *
    * _.minBy(objects, function(o) { return o.a; });
    * // => { 'n': 1 }
    *
    * // using the `_.property` iteratee shorthand
    * _.minBy(objects, 'n');
    * // => { 'n': 1 }
    */
  def minBy[T](): js.UndefOr[T] = js.native
  def minBy[T](collection: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def minBy[T](collection: Null, iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def minBy[T](collection: List[T]): js.UndefOr[T] = js.native
  def minBy[T](collection: List[T], iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  
  /**
    * Adds all own enumerable function properties of a source object to the destination object. If object is a
    * function then methods are added to its prototype as well.
    *
    * Note: Use _.runInContext to create a pristine lodash function to avoid conflicts caused by modifying
    * the original.
    *
    * @param object The destination object.
    * @param source The object of functions to add.
    * @param options The options object.
    * @param options.chain Specify whether the functions added are chainable.
    * @return Returns object.
    */
  def mixin[TObject](`object`: TObject, source: Dictionary[js.Function1[/* repeated */ _, _]]): TObject = js.native
  def mixin[TObject](`object`: TObject, source: Dictionary[js.Function1[/* repeated */ _, _]], options: MixinOptions): TObject = js.native
  /**
    * @see _.mixin
    */
  def mixin[TResult](source: Dictionary[js.Function1[/* repeated */ _, _]]): LoDashStatic = js.native
  def mixin[TResult](source: Dictionary[js.Function1[/* repeated */ _, _]], options: MixinOptions): LoDashStatic = js.native
  
  /**
    * Multiply two numbers.
    * @param multiplier The first number in a multiplication.
    * @param multiplicand The second number in a multiplication.
    * @returns Returns the product.
    */
  def multiply(multiplier: Double, multiplicand: Double): Double = js.native
  
  /**
    * Creates a function that negates the result of the predicate func. The func predicate is invoked with
    * the this binding and arguments of the created function.
    *
    * @param predicate The predicate to negate.
    * @return Returns the new function.
    */
  def negate(predicate: js.Function0[Boolean]): js.Function0[Boolean] = js.native
  def negate(predicate: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, Boolean] = js.native
  def negate[A1, A2](predicate: js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean]): js.Function2[/* a1 */ A1, /* a2 */ A2, Boolean] = js.native
  @JSName("negate")
  def negate_A1[A1](predicate: js.Function1[/* a1 */ A1, Boolean]): js.Function1[/* a1 */ A1, Boolean] = js.native
  
  /**
    * Reverts the _ variable to its previous value and returns a reference to the lodash function.
    *
    * @return Returns the lodash function.
    */
  def noConflict(): Typeoflodash = js.native
  
  /**
    * A no-operation function that returns undefined regardless of the arguments it receives.
    *
    * @return undefined
    */
  def noop(args: js.Any*): Unit = js.native
  
  /**
    * Gets the number of milliseconds that have elapsed since the Unix epoch (1 January 1970 00:00:00 UTC).
    *
    * @return The number of milliseconds.
    */
  def now(): Double = js.native
  
  /**
    * Gets the element at index `n` of `array`. If `n` is negative, the nth element from the end is returned.
    *
    * @param array array The array to query.
    * @param value The index of the element to return.
    * @return Returns the nth element of `array`.
    */
  def nth[T](): js.UndefOr[T] = js.native
  def nth[T](array: js.UndefOr[scala.Nothing], n: Double): js.UndefOr[T] = js.native
  def nth[T](array: Null, n: Double): js.UndefOr[T] = js.native
  def nth[T](array: List[T]): js.UndefOr[T] = js.native
  def nth[T](array: List[T], n: Double): js.UndefOr[T] = js.native
  
  /**
    * Creates a function that returns its nth argument.
    *
    * @param n The index of the argument to return.
    * @return Returns the new function.
    */
  def nthArg(): js.Function1[/* repeated */ js.Any, _] = js.native
  def nthArg(n: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  
  /**
    * The opposite of `_.pick`; this method creates an object composed of the
    * own and inherited enumerable properties of `object` that are not omitted.
    *
    * @category Object
    * @param object The source object.
    * @param [paths] The property names to omit, specified
    *  individually or in arrays..
    * @returns Returns the new object.
    * @example
    *
    * var object = { 'a': 1, 'b': '2', 'c': 3 };
    *
    * _.omit(object, ['a', 'c']);
    * // => { 'b': '2' }
    */
  def omit[T /* <: AnyKindOfDictionary */](`object`: T, paths: Many[PropertyName]*): T = js.native
  def omit[T /* <: AnyKindOfDictionary */](`object`: js.UndefOr[scala.Nothing], paths: Many[PropertyName]*): T = js.native
  def omit[T /* <: AnyKindOfDictionary */](`object`: Null, paths: Many[PropertyName]*): T = js.native
  
  /**
    * @see _.omitBy
    */
  def omitBy[T](): NumericDictionary[T] = js.native
  /**
    * @see _.omitBy
    */
  def omitBy[T /* <: js.Object */](
    `object`: T,
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  def omitBy[T](`object`: js.UndefOr[scala.Nothing], predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def omitBy[T](`object`: Null, predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def omitBy[T](`object`: Dictionary[T]): Dictionary[T] = js.native
  def omitBy[T](`object`: Dictionary[T], predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  def omitBy[T](`object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def omitBy[T](`object`: NumericDictionary[T], predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  /**
    * The opposite of `_.pickBy`; this method creates an object composed of the
    * own and inherited enumerable properties of `object` that `predicate`
    * doesn't return truthy for.
    *
    * @category Object
    * @param object The source object.
    * @param [predicate=_.identity] The function invoked per property.
    * @returns Returns the new object.
    * @example
    *
    * var object = { 'a': 1, 'b': '2', 'c': 3 };
    *
    * _.omitBy(object, _.isNumber);
    * // => { 'b': '2' }
    */
  @JSName("omitBy")
  def omitBy_T_Dictionary[T](): Dictionary[T] = js.native
  @JSName("omitBy")
  def omitBy_T_Dictionary[T](`object`: js.UndefOr[scala.Nothing], predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  @JSName("omitBy")
  def omitBy_T_Dictionary[T](`object`: Null, predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  @JSName("omitBy")
  def omitBy_T_Object_PartialObject[T /* <: js.Object */](
    `object`: js.UndefOr[scala.Nothing],
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  @JSName("omitBy")
  def omitBy_T_Object_PartialObject[T /* <: js.Object */](
    `object`: Null,
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, paths: Many[K]*): Omit[T, K] = js.native
  @JSName("omit")
  def omit_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: js.UndefOr[scala.Nothing], paths: Many[K]*): Omit[T, K] = js.native
  @JSName("omit")
  def omit_T_ObjectK_String_Omit[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: Null, paths: Many[K]*): Omit[T, K] = js.native
  /**
    * @see _.omit
    */
  @JSName("omit")
  def omit_T_Object_PartialObject[T /* <: js.Object */](`object`: T, paths: Many[PropertyName]*): PartialObject[T] = js.native
  @JSName("omit")
  def omit_T_Object_PartialObject[T /* <: js.Object */](`object`: js.UndefOr[scala.Nothing], paths: Many[PropertyName]*): PartialObject[T] = js.native
  @JSName("omit")
  def omit_T_Object_PartialObject[T /* <: js.Object */](`object`: Null, paths: Many[PropertyName]*): PartialObject[T] = js.native
  
  /**
    * Creates a function that is restricted to invoking func once. Repeat calls to the function return the value
    * of the first call. The func is invoked with the this binding and arguments of the created function.
    *
    * @param func The function to restrict.
    * @return Returns the new restricted function.
    */
  def once[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T = js.native
  
  /**
    * @see _.orderBy
    */
  def orderBy[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](
    collection: T,
    iteratees: js.UndefOr[Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](collection: T, iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    iteratees: js.UndefOr[Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](
    collection: Null,
    iteratees: js.UndefOr[Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T /* <: js.Object */](collection: Null, iteratees: Many[ObjectIteratee[T] | (ObjectIterator[T, NotVoid])]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def orderBy[T](collection: List[T]): js.Array[T] = js.native
  def orderBy[T](
    collection: List[T],
    iteratees: js.UndefOr[Many[ListIteratee[T] | (ListIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  def orderBy[T](collection: List[T], iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]): js.Array[T] = js.native
  /**
    * This method is like `_.sortBy` except that it allows specifying the sort
    * orders of the iteratees to sort by. If `orders` is unspecified, all values
    * are sorted in ascending order. Otherwise, specify an order of "desc" for
    * descending or "asc" for ascending sort order of corresponding values.
    *
    * @category Collection
    * @param collection The collection to iterate over.
    * @param [iteratees=[_.identity]] The iteratees to sort by.
    * @param [orders] The sort orders of `iteratees`.
    * @param- {Object} [guard] Enables use as an iteratee for functions like `_.reduce`.
    * @returns Returns the new sorted array.
    * @example
    *
    * var users = [
    *   { 'user': 'fred',   'age': 48 },
    *   { 'user': 'barney', 'age': 34 },
    *   { 'user': 'fred',   'age': 42 },
    *   { 'user': 'barney', 'age': 36 }
    * ];
    *
    * // sort by `user` in ascending order and by `age` in descending order
    * _.orderBy(users, ['user', 'age'], ['asc', 'desc']);
    * // => objects for [['barney', 36], ['barney', 34], ['fred', 48], ['fred', 42]]
    */
  @JSName("orderBy")
  def orderBy_T[T](): js.Array[T] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    collection: js.UndefOr[scala.Nothing],
    iteratees: js.UndefOr[Many[ListIteratee[T] | (ListIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    collection: js.UndefOr[scala.Nothing],
    iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]
  ): js.Array[T] = js.native
  @JSName("orderBy")
  def orderBy_T[T](
    collection: Null,
    iteratees: js.UndefOr[Many[ListIteratee[T] | (ListIterator[T, NotVoid])]],
    orders: Many[Boolean | asc | desc]
  ): js.Array[T] = js.native
  @JSName("orderBy")
  def orderBy_T[T](collection: Null, iteratees: Many[ListIteratee[T] | (ListIterator[T, NotVoid])]): js.Array[T] = js.native
  
  /**
    * Creates a function that invokes iteratees with the arguments provided to the created function and returns
    * their results.
    *
    * @param iteratees The iteratees to invoke.
    * @return Returns the new function.
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ _, TResult]])*): js.Function1[/* repeated */ js.Any, js.Array[TResult]] = js.native
  
  /**
    * Creates a function that runs each argument through a corresponding transform function.
    *
    * @param func The function to wrap.
    * @param transforms The functions to transform arguments, specified as individual functions or arrays
    * of functions.
    * @return Returns the new function.
    */
  def overArgs(
    func: js.Function1[/* repeated */ js.Any, _],
    transforms: (Many[js.Function1[/* repeated */ _, _]])*
  ): js.Function1[/* repeated */ js.Any, _] = js.native
  
  def overEvery[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): js.Function1[/* repeated */ T, Boolean] = js.native
  /**
    * Creates a function that checks if all of the predicates return truthy when invoked with the arguments
    * provided to the created function.
    *
    * @param predicates The predicates to check.
    * @return Returns the new function.
    */
  def overEvery[T, Result1 /* <: T */, Result2 /* <: T */](
    a: js.Function1[/* arg */ T, /* is Result1 */ Boolean],
    b: js.Function1[/* arg */ T, /* is Result2 */ Boolean]
  ): js.Function1[/* arg */ T, Boolean] = js.native
  
  def overSome[T](predicates: (Many[js.Function1[/* repeated */ T, Boolean]])*): js.Function1[/* repeated */ T, Boolean] = js.native
  /**
    * Creates a function that checks if any of the predicates return truthy when invoked with the arguments
    * provided to the created function.
    *
    * @param predicates The predicates to check.
    * @return Returns the new function.
    */
  def overSome[T, Result1 /* <: T */, Result2 /* <: T */](
    a: js.Function1[/* arg */ T, /* is Result1 */ Boolean],
    b: js.Function1[/* arg */ T, /* is Result2 */ Boolean]
  ): js.Function1[/* arg */ T, Boolean] = js.native
  
  /**
    * Pads string on the left and right sides if it’s shorter than length. Padding characters are truncated if
    * they can’t be evenly divided by length.
    *
    * @param string The string to pad.
    * @param length The padding length.
    * @param chars The string used as padding.
    * @return Returns the padded string.
    */
  def pad(): String = js.native
  def pad(string: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def pad(string: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def pad(string: js.UndefOr[scala.Nothing], length: Double, chars: String): String = js.native
  def pad(string: String): String = js.native
  def pad(string: String, length: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def pad(string: String, length: Double): String = js.native
  def pad(string: String, length: Double, chars: String): String = js.native
  
  /**
    * Pads string on the right side if it’s shorter than length. Padding characters are truncated if they exceed
    * length.
    *
    * @param string The string to pad.
    * @param length The padding length.
    * @param chars The string used as padding.
    * @return Returns the padded string.
    */
  def padEnd(): String = js.native
  def padEnd(string: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def padEnd(string: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def padEnd(string: js.UndefOr[scala.Nothing], length: Double, chars: String): String = js.native
  def padEnd(string: String): String = js.native
  def padEnd(string: String, length: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def padEnd(string: String, length: Double): String = js.native
  def padEnd(string: String, length: Double, chars: String): String = js.native
  
  /**
    * Pads string on the left side if it’s shorter than length. Padding characters are truncated if they exceed
    * length.
    *
    * @param string The string to pad.
    * @param length The padding length.
    * @param chars The string used as padding.
    * @return Returns the padded string.
    */
  def padStart(): String = js.native
  def padStart(string: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def padStart(string: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def padStart(string: js.UndefOr[scala.Nothing], length: Double, chars: String): String = js.native
  def padStart(string: String): String = js.native
  def padStart(string: String, length: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def padStart(string: String, length: Double): String = js.native
  def padStart(string: String, length: Double, chars: String): String = js.native
  
  /**
    * Converts string to an integer of the specified radix. If radix is undefined or 0, a radix of 10 is used
    * unless value is a hexadecimal, in which case a radix of 16 is used.
    *
    * Note: This method aligns with the ES5 implementation of parseInt.
    *
    * @param string The string to convert.
    * @param radix The radix to interpret value by.
    * @return Returns the converted integer.
    */
  def parseInt(string: String): Double = js.native
  def parseInt(string: String, radix: Double): Double = js.native
  
  // catch-all
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial(func: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, _] = js.native
  // arity 0
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[R](func: Function0[R]): Function0[R] = js.native
  // arity 1
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, R](func: Function1[T1, R]): Function1[T1, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, R](func: Function1[T1, R], arg1: T1): Function0[R] = js.native
  // arity 2
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, R](func: Function2[T1, T2, R]): Function2[T1, T2, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, R](func: Function2[T1, T2, R], arg1: T1): Function1[T2, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, R](func: Function2[T1, T2, R], arg1: T1, arg2: T2): Function0[R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, R](func: Function2[T1, T2, R], plc1: __, arg2: T2): Function1[T1, R] = js.native
  // arity 3
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): Function3[T1, T2, T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1): Function2[T2, T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, arg2: T2): Function1[T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, arg2: T2, arg3: T3): Function0[R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, plc2: __, arg3: T3): Function1[T2, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: __, arg2: T2): Function2[T1, T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: __, arg2: T2, arg3: T3): Function1[T1, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, R](func: Function3[T1, T2, T3, R], plc1: __, plc2: __, arg3: T3): Function2[T1, T2, R] = js.native
  // arity 4
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): Function4[T1, T2, T3, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1): Function3[T2, T3, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2): Function2[T3, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, arg3: T3): Function1[T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, arg3: T3, arg4: T4): Function0[R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, plc3: __, arg4: T4): Function1[T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, arg3: T3): Function2[T2, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, arg3: T3, arg4: T4): Function1[T2, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, plc3: __, arg4: T4): Function2[T2, T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, arg2: T2): Function3[T1, T3, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, arg2: T2, arg3: T3): Function2[T1, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, arg2: T2, arg3: T3, arg4: T4): Function1[T1, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, arg2: T2, plc3: __, arg4: T4): Function2[T1, T3, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, plc2: __, arg3: T3): Function3[T1, T2, T4, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, plc2: __, arg3: T3, arg4: T4): Function2[T1, T2, R] = js.native
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partial[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], plc1: __, plc2: __, plc3: __, arg4: T4): Function3[T1, T2, T3, R] = js.native
  
  // catch-all
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight(func: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Function1[/* repeated */ js.Any, _] = js.native
  // arity 0
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[R](func: Function0[R]): Function0[R] = js.native
  // arity 1
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, R](func: Function1[T1, R]): Function1[T1, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, R](func: Function1[T1, R], arg1: T1): Function0[R] = js.native
  // arity 2
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, R](func: Function2[T1, T2, R]): Function2[T1, T2, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg1: T1, arg2: T2): Function0[R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg1: T1, plc2: __): Function1[T2, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, R](func: Function2[T1, T2, R], arg2: T2): Function1[T1, R] = js.native
  // arity 3
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): Function3[T1, T2, T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, arg2: T2, arg3: T3): Function0[R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, arg2: T2, plc3: __): Function1[T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, plc2: __, arg3: T3): Function1[T2, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: T1, plc2: __, plc3: __): Function2[T2, T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: T2, arg3: T3): Function1[T1, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: T2, plc3: __): Function2[T1, T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg3: T3): Function2[T1, T2, R] = js.native
  // arity 4
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): Function4[T1, T2, T3, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, arg3: T3, arg4: T4): Function0[R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, arg3: T3, plc4: __): Function1[T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, plc3: __, arg4: T4): Function1[T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, arg2: T2, plc3: __, plc4: __): Function2[T3, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, arg3: T3, arg4: T4): Function1[T2, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, arg3: T3, plc4: __): Function2[T2, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, plc3: __, arg4: T4): Function2[T2, T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: T1, plc2: __, plc3: __, plc4: __): Function3[T2, T3, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: T2, arg3: T3, arg4: T4): Function1[T1, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: T2, arg3: T3, plc4: __): Function2[T1, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: T2, plc3: __, arg4: T4): Function2[T1, T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: T2, plc3: __, plc4: __): Function3[T1, T3, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: T3, arg4: T4): Function2[T1, T2, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: T3, plc4: __): Function3[T1, T2, T4, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  def partialRight[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg4: T4): Function3[T1, T2, T3, R] = js.native
  /**
    * This method is like _.partial except that partial arguments are appended to those provided
    * to the new function.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  @JSName("partialRight")
  var partialRight_Original: PartialRight = js.native
  
  /**
    * Creates a function that, when called, invokes func with any additional partial arguments
    * prepended to those provided to the new function. This method is similar to _.bind except
    * it does not alter the this binding.
    * @param func The function to partially apply arguments to.
    * @param args Arguments to be partially applied.
    * @return The new partially applied function.
    **/
  @JSName("partial")
  var partial_Original: Partial = js.native
  
  /**
    * @see _.partition
    */
  def partition[T /* <: js.Object */](
    collection: T,
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
  def partition[T](collection: js.UndefOr[scala.Nothing], callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition[T](collection: Null, callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition[T](collection: List[T], callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition[T, U /* <: T */](collection: js.UndefOr[scala.Nothing], callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  def partition[T, U /* <: T */](collection: Null, callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  /**
    * Creates an array of elements split into two groups, the first of which contains elements predicate returns truthy for,
    * while the second of which contains elements predicate returns falsey for.
    * The predicate is invoked with three arguments: (value, index|key, collection).
    *
    * @param collection The collection to iterate over.
    * @param callback The function called per iteration.
    * @return Returns the array of grouped elements.
    **/
  def partition[T, U /* <: T */](collection: List[T], callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  @JSName("partition")
  def partition_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
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
  def partition_T_Object[T /* <: js.Object */](
    collection: Null,
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
  
  /**
    * @see _.pick
    */
  def pick[T](`object`: T, props: PropertyPath*): PartialDeep[T] = js.native
  def pick[T](`object`: js.UndefOr[scala.Nothing], props: PropertyPath*): PartialDeep[T] = js.native
  def pick[T](`object`: Null, props: PropertyPath*): PartialDeep[T] = js.native
  
  /**
    * @see _.pickBy
    */
  def pickBy[T](): NumericDictionary[T] = js.native
  def pickBy[T /* <: js.Object */](`object`: T): PartialObject[T] = js.native
  def pickBy[T /* <: js.Object */](
    `object`: T,
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  def pickBy[T](`object`: js.UndefOr[scala.Nothing], predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def pickBy[T](`object`: Null, predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def pickBy[T](`object`: Dictionary[T]): Dictionary[T] = js.native
  def pickBy[T](`object`: Dictionary[T], predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  def pickBy[T](`object`: NumericDictionary[T]): NumericDictionary[T] = js.native
  def pickBy[T](`object`: NumericDictionary[T], predicate: ValueKeyIteratee[T]): NumericDictionary[T] = js.native
  def pickBy[T, S /* <: T */](`object`: js.UndefOr[scala.Nothing], predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
  def pickBy[T, S /* <: T */](`object`: Null, predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
  /**
    * Creates an object composed of the `object` properties `predicate` returns
    * truthy for. The predicate is invoked with two arguments: (value, key).
    *
    * @category Object
    * @param object The source object.
    * @param [predicate=_.identity] The function invoked per property.
    * @returns Returns the new object.
    * @example
    *
    * var object = { 'a': 1, 'b': '2', 'c': 3 };
    *
    * _.pickBy(object, _.isNumber);
    * // => { 'a': 1, 'c': 3 }
    */
  def pickBy[T, S /* <: T */](`object`: Dictionary[T], predicate: ValueKeyIterateeTypeGuard[T, S]): Dictionary[S] = js.native
  /**
    * @see _.pickBy
    */
  def pickBy[T, S /* <: T */](`object`: NumericDictionary[T], predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
  @JSName("pickBy")
  def pickBy_TS_T_NumericDictionary[T, S /* <: T */](`object`: js.UndefOr[scala.Nothing], predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
  @JSName("pickBy")
  def pickBy_TS_T_NumericDictionary[T, S /* <: T */](`object`: Null, predicate: ValueKeyIterateeTypeGuard[T, S]): NumericDictionary[S] = js.native
  /**
    * @see _.pickBy
    */
  @JSName("pickBy")
  def pickBy_T_Dictionary[T](): Dictionary[T] = js.native
  @JSName("pickBy")
  def pickBy_T_Dictionary[T](`object`: js.UndefOr[scala.Nothing], predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  @JSName("pickBy")
  def pickBy_T_Dictionary[T](`object`: Null, predicate: ValueKeyIteratee[T]): Dictionary[T] = js.native
  /**
    * @see _.pickBy
    */
  @JSName("pickBy")
  def pickBy_T_Object_PartialObject[T /* <: js.Object */](): PartialObject[T] = js.native
  @JSName("pickBy")
  def pickBy_T_Object_PartialObject[T /* <: js.Object */](
    `object`: js.UndefOr[scala.Nothing],
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  @JSName("pickBy")
  def pickBy_T_Object_PartialObject[T /* <: js.Object */](
    `object`: Null,
    predicate: ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): PartialObject[T] = js.native
  
  /**
    * Creates an object composed of the picked `object` properties.
    *
    * @category Object
    * @param object The source object.
    * @param [props] The property names to pick, specified
    *  individually or in arrays.
    * @returns Returns the new object.
    * @example
    *
    * var object = { 'a': 1, 'b': '2', 'c': 3 };
    *
    * _.pick(object, ['a', 'c']);
    * // => { 'a': 1, 'c': 3 }
    */
  @JSName("pick")
  def pick_T_ObjectU_String_Pick[T /* <: js.Object */, U /* <: /* keyof T */ String */](`object`: T, props: Many[U]*): Pick[T, U] = js.native
  
  /**
    * Creates a function that returns the property value at path on a given object.
    *
    * @param path The path of the property to get.
    * @return Returns the new function.
    */
  def property[TObj, TResult](path: PropertyPath): js.Function1[/* obj */ TObj, TResult] = js.native
  
  /**
    * The opposite of _.property; this method creates a function that returns the property value at a given path
    * on object.
    *
    * @param object The object to query.
    * @return Returns the new function.
    */
  def propertyOf[T /* <: js.Object */](`object`: T): js.Function1[/* path */ PropertyPath, _] = js.native
  
  /**
    * Removes all provided values from array using SameValueZero for equality comparisons.
    *
    * Note: Unlike _.without, this method mutates array.
    *
    * @param array The array to modify.
    * @param values The values to remove.
    * @return Returns array.
    */
  def pull[T](array: js.Array[T], values: T*): js.Array[T] = js.native
  /**
    * @see _.pull
    */
  def pull[T](array: List[T], values: T*): List[T] = js.native
  
  /**
    * This method is like `_.pull` except that it accepts an array of values to remove.
    *
    * **Note:** Unlike `_.difference`, this method mutates `array`.
    *
    * @category Array
    * @param array The array to modify.
    * @param values The values to remove.
    * @returns Returns `array`.
    * @example
    *
    * var array = [1, 2, 3, 1, 2, 3];
    *
    * _.pull(array, [2, 3]);
    * console.log(array);
    * // => [1, 1]
    */
  def pullAll[T](array: js.Array[T]): js.Array[T] = js.native
  def pullAll[T](array: js.Array[T], values: List[T]): js.Array[T] = js.native
  /**
    * @see _.pullAll
    */
  def pullAll[T](array: List[T]): List[T] = js.native
  def pullAll[T](array: List[T], values: List[T]): List[T] = js.native
  
  /**
    * This method is like `_.pullAll` except that it accepts `iteratee` which is
    * invoked for each element of `array` and `values` to to generate the criterion
    * by which uniqueness is computed. The iteratee is invoked with one argument: (value).
    *
    * **Note:** Unlike `_.differenceBy`, this method mutates `array`.
    *
    * @category Array
    * @param array The array to modify.
    * @param values The values to remove.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns `array`.
    * @example
    *
    * var array = [{ 'x': 1 }, { 'x': 2 }, { 'x': 3 }, { 'x': 1 }];
    *
    * _.pullAllBy(array, [{ 'x': 1 }, { 'x': 3 }], 'x');
    * console.log(array);
    * // => [{ 'x': 2 }]
    */
  def pullAllBy[T](array: js.Array[T]): js.Array[T] = js.native
  def pullAllBy[T](array: js.Array[T], values: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def pullAllBy[T](array: js.Array[T], values: List[T]): js.Array[T] = js.native
  def pullAllBy[T](array: js.Array[T], values: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  /**
    * @see _.pullAllBy
    */
  def pullAllBy[T](array: List[T]): List[T] = js.native
  def pullAllBy[T](array: List[T], values: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): List[T] = js.native
  def pullAllBy[T](array: List[T], values: List[T]): List[T] = js.native
  def pullAllBy[T](array: List[T], values: List[T], iteratee: ValueIteratee[T]): List[T] = js.native
  /**
    * @see _.pullAllBy
    */
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](array: js.Array[T1], values: List[T2], iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  /**
    * @see _.pullAllBy
    */
  @JSName("pullAllBy")
  def pullAllBy_T1T2[T1, T2](array: List[T1], values: List[T2], iteratee: ValueIteratee[T1 | T2]): List[T1] = js.native
  
  /**
    * This method is like `_.pullAll` except that it accepts `comparator` which is
    * invoked to compare elements of array to values. The comparator is invoked with
    * two arguments: (arrVal, othVal).
    *
    * **Note:** Unlike `_.differenceWith`, this method mutates `array`.
    *
    * @category Array
    * @param array The array to modify.
    * @param values The values to remove.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns `array`.
    * @example
    *
    * var array = [{ 'x': 1, 'y': 2 }, { 'x': 3, 'y': 4 }, { 'x': 5, 'y': 6 }];
    *
    * _.pullAllWith(array, [{ 'x': 3, 'y': 4 }], _.isEqual);
    * console.log(array);
    * // => [{ 'x': 1, 'y': 2 }, { 'x': 5, 'y': 6 }]
    */
  def pullAllWith[T](array: js.Array[T]): js.Array[T] = js.native
  def pullAllWith[T](array: js.Array[T], values: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def pullAllWith[T](array: js.Array[T], values: List[T]): js.Array[T] = js.native
  def pullAllWith[T](array: js.Array[T], values: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  /**
    * @see _.pullAllWith
    */
  def pullAllWith[T](array: List[T]): List[T] = js.native
  def pullAllWith[T](array: List[T], values: js.UndefOr[scala.Nothing], comparator: Comparator[T]): List[T] = js.native
  def pullAllWith[T](array: List[T], values: List[T]): List[T] = js.native
  def pullAllWith[T](array: List[T], values: List[T], comparator: Comparator[T]): List[T] = js.native
  /**
    * @see _.pullAllWith
    */
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](array: js.Array[T1], values: List[T2], comparator: Comparator2[T1, T2]): js.Array[T1] = js.native
  /**
    * @see _.pullAllWith
    */
  @JSName("pullAllWith")
  def pullAllWith_T1T2[T1, T2](array: List[T1], values: List[T2], comparator: Comparator2[T1, T2]): List[T1] = js.native
  
  /**
    * Removes elements from array corresponding to the given indexes and returns an array of the removed elements.
    * Indexes may be specified as an array of indexes or as individual arguments.
    *
    * Note: Unlike _.at, this method mutates array.
    *
    * @param array The array to modify.
    * @param indexes The indexes of elements to remove, specified as individual indexes or arrays of indexes.
    * @return Returns the new array of removed elements.
    */
  def pullAt[T](array: js.Array[T], indexes: Many[Double]*): js.Array[T] = js.native
  /**
    * @see _.pullAt
    */
  def pullAt[T](array: List[T], indexes: Many[Double]*): List[T] = js.native
  
  /**
    * Produces a random number between min and max (inclusive). If only one argument is provided a number between
    * 0 and the given number is returned. If floating is true, or either min or max are floats, a floating-point
    * number is returned instead of an integer.
    *
    * @param min The minimum possible value.
    * @param max The maximum possible value.
    * @param floating Specify returning a floating-point number.
    * @return Returns the random number.
    */
  def random(): Double = js.native
  def random(floating: Boolean): Double = js.native
  /**
    * @see _.random
    */
  def random(max: Double): Double = js.native
  def random(max: Double, floating: Boolean): Double = js.native
  /**
    * Produces a random number between min and max (inclusive). If only one argument is provided a number between
    * 0 and the given number is returned. If floating is true, or either min or max are floats, a floating-point
    * number is returned instead of an integer.
    *
    * @param min The minimum possible value.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns the random number.
    */
  def random(min: Double, index: String, guard: js.Object): Double = js.native
  def random(min: Double, index: Double, guard: js.Object): Double = js.native
  /**
    * @see _.random
    */
  def random(min: Double, max: Double): Double = js.native
  def random(min: Double, max: Double, floating: Boolean): Double = js.native
  
  /**
    * Creates an array of numbers (positive and/or negative) progressing from start up to, but not including, end.
    * If end is not specified it’s set to start with start then set to 0. If end is less than start a zero-length
    * range is created unless a negative step is specified.
    *
    * @param start The start of the range.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns a new range array.
    */
  def range(end: Double, index: String, guard: js.Object): js.Array[Double] = js.native
  def range(end: Double, index: Double, guard: js.Object): js.Array[Double] = js.native
  /**
    * Creates an array of numbers (positive and/or negative) progressing from start up to, but not including, end.
    * If end is not specified it’s set to start with start then set to 0. If end is less than start a zero-length
    * range is created unless a negative step is specified.
    *
    * @param start The start of the range.
    * @param end The end of the range.
    * @param step The value to increment or decrement by.
    * @return Returns a new range array.
    */
  def range(start: Double): js.Array[Double] = js.native
  def range(start: Double, end: js.UndefOr[scala.Nothing], step: Double): js.Array[Double] = js.native
  def range(start: Double, end: Double): js.Array[Double] = js.native
  def range(start: Double, end: Double, step: Double): js.Array[Double] = js.native
  
  /**
    * This method is like _.range except that it populates values in
    * descending order.
    *
    * @param start The start of the range.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns a new range array.
    */
  def rangeRight(end: Double, index: String, guard: js.Object): js.Array[Double] = js.native
  def rangeRight(end: Double, index: Double, guard: js.Object): js.Array[Double] = js.native
  /**
    * This method is like `_.range` except that it populates values in
    * descending order.
    *
    * @category Util
    * @param start The start of the range.
    * @param end The end of the range.
    * @param step The value to increment or decrement by.
    * @returns Returns the new array of numbers.
    * @example
    *
    * _.rangeRight(4);
    * // => [3, 2, 1, 0]
    *
    * _.rangeRight(-4);
    * // => [-3, -2, -1, 0]
    *
    * _.rangeRight(1, 5);
    * // => [4, 3, 2, 1]
    *
    * _.rangeRight(0, 20, 5);
    * // => [15, 10, 5, 0]
    *
    * _.rangeRight(0, -4, -1);
    * // => [-3, -2, -1, 0]
    *
    * _.rangeRight(1, 4, 0);
    * // => [1, 1, 1]
    *
    * _.rangeRight(0);
    * // => []
    */
  def rangeRight(start: Double): js.Array[Double] = js.native
  def rangeRight(start: Double, end: js.UndefOr[scala.Nothing], step: Double): js.Array[Double] = js.native
  def rangeRight(start: Double, end: Double): js.Array[Double] = js.native
  def rangeRight(start: Double, end: Double, step: Double): js.Array[Double] = js.native
  
  /**
    * Creates a function that invokes func with arguments arranged according to the specified indexes where the
    * argument value at the first index is provided as the first argument, the argument value at the second index
    * is provided as the second argument, and so on.
    * @param func The function to rearrange arguments for.
    * @param indexes The arranged argument indexes, specified as individual indexes or arrays of indexes.
    * @return Returns the new function.
    */
  def rearg(func: js.Function1[/* repeated */ js.Any, _], indexes: Many[Double]*): js.Function1[/* repeated */ js.Any, _] = js.native
  
  /**
    * @see _.reduce
    **/
  def reduce[T /* <: js.Object */](
    collection: T,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reduce[T](collection: js.UndefOr[scala.Nothing], callback: MemoListIterator[T, T, js.Array[T] | List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T](collection: js.Array[T], callback: MemoListIterator[T, T, js.Array[T]]): js.UndefOr[T] = js.native
  def reduce[T](collection: Null, callback: MemoListIterator[T, T, js.Array[T] | List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T](collection: List[T], callback: MemoListIterator[T, T, List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T /* <: js.Object */, TResult](
    collection: T,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  def reduce[T, TResult](
    collection: js.UndefOr[scala.Nothing],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * Reduces a collection to a value which is the accumulated result of running each
    * element in the collection through the callback, where each successive callback execution
    * consumes the return value of the previous execution. If accumulator is not provided the
    * first element of the collection will be used as the initial accumulator value. The callback
    * is invoked with four arguments: (accumulator, value, index|key, collection).
    * @param collection The collection to iterate over.
    * @param callback The function called per iteration.
    * @param accumulator Initial value of the accumulator.
    * @return Returns the accumulated value.
    **/
  def reduce[T, TResult](collection: js.Array[T], callback: MemoListIterator[T, TResult, js.Array[T]], accumulator: TResult): TResult = js.native
  def reduce[T, TResult](
    collection: Null,
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduce
    **/
  def reduce[T, TResult](collection: List[T], callback: MemoListIterator[T, TResult, List[T]], accumulator: TResult): TResult = js.native
  
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T /* <: js.Object */](
    collection: T,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reduceRight[T](collection: js.UndefOr[scala.Nothing], callback: MemoListIterator[T, T, js.Array[T] | List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T](collection: js.Array[T], callback: MemoListIterator[T, T, js.Array[T]]): js.UndefOr[T] = js.native
  def reduceRight[T](collection: Null, callback: MemoListIterator[T, T, js.Array[T] | List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T](collection: List[T], callback: MemoListIterator[T, T, List[T]]): js.UndefOr[T] = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T /* <: js.Object */, TResult](
    collection: T,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  def reduceRight[T, TResult](
    collection: js.UndefOr[scala.Nothing],
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * This method is like _.reduce except that it iterates over elements of a collection from
    * right to left.
    * @param collection The collection to iterate over.
    * @param callback The function called per iteration.
    * @param accumulator Initial value of the accumulator.
    * @return The accumulated value.
    **/
  def reduceRight[T, TResult](collection: js.Array[T], callback: MemoListIterator[T, TResult, js.Array[T]], accumulator: TResult): TResult = js.native
  def reduceRight[T, TResult](
    collection: Null,
    callback: MemoListIterator[T, TResult, js.Array[T] | List[T]],
    accumulator: TResult
  ): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  def reduceRight[T, TResult](collection: List[T], callback: MemoListIterator[T, TResult, List[T]], accumulator: TResult): TResult = js.native
  @JSName("reduceRight")
  def reduceRight_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("reduceRight")
  def reduceRight_T_Object[T /* <: js.Object */](
    collection: Null,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult[T /* <: js.Object */, TResult](
    collection: js.UndefOr[scala.Nothing],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  @JSName("reduceRight")
  def reduceRight_T_ObjectTResult[T /* <: js.Object */, TResult](
    collection: Null,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  
  @JSName("reduce")
  def reduce_T_Object[T /* <: js.Object */](
    collection: js.UndefOr[scala.Nothing],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("reduce")
  def reduce_T_Object[T /* <: js.Object */](
    collection: Null,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      T
    ]
  ): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  @JSName("reduce")
  def reduce_T_ObjectTResult[T /* <: js.Object */, TResult](
    collection: js.UndefOr[scala.Nothing],
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  @JSName("reduce")
  def reduce_T_ObjectTResult[T /* <: js.Object */, TResult](
    collection: Null,
    callback: MemoObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult, 
      T
    ],
    accumulator: TResult
  ): TResult = js.native
  
  /**
    * The opposite of _.filter; this method returns the elements of collection that predicate does not return
    * truthy for.
    *
    * @param collection The collection to iterate over.
    * @param predicate The function invoked per iteration.
    * @return Returns the new filtered array.
    */
  def reject(): js.Array[String] = js.native
  def reject(collection: js.UndefOr[scala.Nothing], predicate: StringIterator[Boolean]): js.Array[String] = js.native
  def reject(collection: String): js.Array[String] = js.native
  def reject(collection: String, predicate: StringIterator[Boolean]): js.Array[String] = js.native
  def reject(collection: Null, predicate: StringIterator[Boolean]): js.Array[String] = js.native
  def reject[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject[T /* <: js.Object */](collection: T, predicate: ObjectIterateeCustom[T, Boolean]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIterateeCustom[T, Boolean]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject[T /* <: js.Object */](collection: Null, predicate: ObjectIterateeCustom[T, Boolean]): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def reject[T](collection: List[T]): js.Array[T] = js.native
  def reject[T](collection: List[T], predicate: ListIterateeCustom[T, Boolean]): js.Array[T] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T[T](): js.Array[T] = js.native
  @JSName("reject")
  def reject_T[T](collection: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): js.Array[T] = js.native
  @JSName("reject")
  def reject_T[T](collection: Null, predicate: ListIterateeCustom[T, Boolean]): js.Array[T] = js.native
  /**
    * @see _.reject
    */
  @JSName("reject")
  def reject_T_Object[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * Removes all elements from array that predicate returns truthy for and returns an array of the removed
    * elements. The predicate is invoked with three arguments: (value, index, array).
    *
    * Note: Unlike _.filter, this method mutates array.
    *
    * @param array The array to modify.
    * @param predicate The function invoked per iteration.
    * @return Returns the new array of removed elements.
    */
  def remove[T](array: List[T]): js.Array[T] = js.native
  def remove[T](array: List[T], predicate: ListIteratee[T]): js.Array[T] = js.native
  
  /**
    * Repeats the given string n times.
    *
    * @param string The string to repeat.
    * @param n The number of times to repeat the string.
    * @return Returns the repeated string.
    */
  def repeat(): String = js.native
  def repeat(string: js.UndefOr[scala.Nothing], n: Double): String = js.native
  def repeat(string: String): String = js.native
  def repeat(string: String, n: Double): String = js.native
  
  def replace(pattern: String, replacement: String): String = js.native
  def replace(pattern: String, replacement: ReplaceFunction): String = js.native
  def replace(pattern: js.RegExp, replacement: String): String = js.native
  /**
    * @see _.replace
    */
  def replace(pattern: js.RegExp, replacement: ReplaceFunction): String = js.native
  def replace(string: String, pattern: String, replacement: String): String = js.native
  def replace(string: String, pattern: String, replacement: ReplaceFunction): String = js.native
  def replace(string: String, pattern: js.RegExp, replacement: String): String = js.native
  /**
    * Replaces matches for pattern in string with replacement.
    *
    * Note: This method is based on String#replace.
    *
    * @return Returns the modified string.
    */
  def replace(string: String, pattern: js.RegExp, replacement: ReplaceFunction): String = js.native
  
  /**
    * Creates a function that invokes func with the this binding of the created function and arguments from start
    * and beyond provided as an array.
    *
    * Note: This method is based on the rest parameter.
    *
    * @param func The function to apply a rest parameter to.
    * @param start The start position of the rest parameter.
    * @return Returns the new function.
    */
  def rest(func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def rest(func: js.Function1[/* repeated */ js.Any, _], start: Double): js.Function1[/* repeated */ js.Any, _] = js.native
  
  /**
    * This method is like _.get except that if the resolved value is a function it’s invoked with the this binding
    * of its parent object and its result is returned.
    *
    * @param object The object to query.
    * @param path The path of the property to resolve.
    * @param defaultValue The value returned if the resolved value is undefined.
    * @return Returns the resolved value.
    */
  def result[TResult](`object`: js.Any, path: PropertyPath): TResult = js.native
  def result[TResult](`object`: js.Any, path: PropertyPath, defaultValue: TResult): TResult = js.native
  def result[TResult](`object`: js.Any, path: PropertyPath, defaultValue: js.Function1[/* repeated */ js.Any, TResult]): TResult = js.native
  
  /**
    * Reverses `array` so that the first element becomes the last, the second
    * element becomes the second to last, and so on.
    *
    * **Note:** This method mutates `array` and is based on
    * [`Array#reverse`](https://mdn.io/Array/reverse).
    *
    * @category Array
    * @returns Returns `array`.
    * @example
    *
    * var array = [1, 2, 3];
    *
    * _.reverse(array);
    * // => [3, 2, 1]
    *
    * console.log(array);
    * // => [3, 2, 1]
    */
  def reverse[TList /* <: List[_] */](array: TList): TList = js.native
  
  /**
    * Calculates n rounded to precision.
    *
    * @param n The number to round.
    * @param precision The precision to round to.
    * @return Returns the rounded number.
    */
  def round(n: Double): Double = js.native
  def round(n: Double, precision: Double): Double = js.native
  
  /**
    * Create a new pristine lodash function using the given context object.
    *
    * @param context The context object.
    * @return Returns a new lodash function.
    */
  def runInContext(): LoDashStatic = js.native
  def runInContext(context: js.Object): LoDashStatic = js.native
  
  /**
    * Gets a random element from collection.
    *
    * @param collection The collection to sample.
    * @return Returns the random element.
    */
  def sample[T](): js.UndefOr[T] = js.native
  def sample[T /* <: js.Object */](collection: T): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sample[T](collection: Dictionary[T]): js.UndefOr[T] = js.native
  def sample[T](collection: List[T]): js.UndefOr[T] = js.native
  def sample[T](collection: NumericDictionary[T]): js.UndefOr[T] = js.native
  
  /**
    * @see _.sampleSize
    */
  def sampleSize[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize[T /* <: js.Object */](collection: T, n: Double): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], n: Double): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize[T /* <: js.Object */](collection: Null, n: Double): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sampleSize[T](collection: Dictionary[T]): js.Array[T] = js.native
  def sampleSize[T](collection: Dictionary[T], n: Double): js.Array[T] = js.native
  def sampleSize[T](collection: List[T]): js.Array[T] = js.native
  def sampleSize[T](collection: List[T], n: Double): js.Array[T] = js.native
  def sampleSize[T](collection: NumericDictionary[T]): js.Array[T] = js.native
  def sampleSize[T](collection: NumericDictionary[T], n: Double): js.Array[T] = js.native
  /**
    * Gets n random elements at unique keys from collection up to the size of collection.
    *
    * @param collection The collection to sample.
    * @param n The number of elements to sample.
    * @return Returns the random elements.
    */
  @JSName("sampleSize")
  def sampleSize_T[T](): js.Array[T] = js.native
  @JSName("sampleSize")
  def sampleSize_T[T](collection: js.UndefOr[scala.Nothing], n: Double): js.Array[T] = js.native
  @JSName("sampleSize")
  def sampleSize_T[T](collection: Null, n: Double): js.Array[T] = js.native
  
  /**
    * @see _.sample
    */
  @JSName("sample")
  def sample_T_Object[T /* <: js.Object */](): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  
  /**
    * Sets the value at path of object. If a portion of path doesn’t exist it’s created. Arrays are created for
    * missing index properties while objects are created for all other missing properties. Use _.setWith to
    * customize path creation.
    *
    * @param object The object to modify.
    * @param path The path of the property to set.
    * @param value The value to set.
    * @return Returns object.
    */
  def set[T /* <: js.Object */](`object`: T, path: PropertyPath, value: js.Any): T = js.native
  /**
    * @see _.set
    */
  def set[TResult](`object`: js.Object, path: PropertyPath, value: js.Any): TResult = js.native
  
  /**
    * This method is like _.set except that it accepts customizer which is invoked to produce the objects of
    * path. If customizer returns undefined path creation is handled by the method instead. The customizer is
    * invoked with three arguments: (nsValue, key, nsObject).
    *
    * @param object The object to modify.
    * @param path The path of the property to set.
    * @param value The value to set.
    * @param customizer The function to customize assigned values.
    * @return Returns object.
    */
  def setWith[T /* <: js.Object */](`object`: T, path: PropertyPath, value: js.Any): T = js.native
  def setWith[T /* <: js.Object */](`object`: T, path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[T]): T = js.native
  @JSName("setWith")
  def setWith_T_ObjectTResult_TResult[T /* <: js.Object */, TResult](`object`: T, path: PropertyPath, value: js.Any): TResult = js.native
  @JSName("setWith")
  def setWith_T_ObjectTResult_TResult[T /* <: js.Object */, TResult](`object`: T, path: PropertyPath, value: js.Any, customizer: SetWithCustomizer[T]): TResult = js.native
  
  /**
    * @see _.shuffle
    */
  def shuffle[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def shuffle[T /* <: js.Object */](collection: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def shuffle[T](collection: List[T]): js.Array[T] = js.native
  /**
    * Creates an array of shuffled values, using a version of the Fisher-Yates shuffle.
    *
    * @param collection The collection to shuffle.
    * @return Returns the new shuffled array.
    */
  @JSName("shuffle")
  def shuffle_T[T](): js.Array[T] = js.native
  
  /**
    * Gets the size of collection by returning its length for array-like values or the number of own enumerable
    * properties for objects.
    *
    * @param collection The collection to inspect.
    * @return Returns the size of collection.
    */
  def size(): Double = js.native
  def size(collection: String): Double = js.native
  def size(collection: js.Object): Double = js.native
  
  /**
    * Creates a slice of array from start up to, but not including, end.
    *
    * @param array The array to slice.
    * @param start The start position.
    * @param end The end position.
    * @return Returns the slice of array.
    */
  def slice[T](): js.Array[T] = js.native
  def slice[T](array: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): js.Array[T] = js.native
  def slice[T](array: js.UndefOr[scala.Nothing], start: Double): js.Array[T] = js.native
  def slice[T](array: js.UndefOr[scala.Nothing], start: Double, end: Double): js.Array[T] = js.native
  def slice[T](array: Null, start: js.UndefOr[scala.Nothing], end: Double): js.Array[T] = js.native
  def slice[T](array: Null, start: Double): js.Array[T] = js.native
  def slice[T](array: Null, start: Double, end: Double): js.Array[T] = js.native
  def slice[T](array: List[T]): js.Array[T] = js.native
  def slice[T](array: List[T], start: js.UndefOr[scala.Nothing], end: Double): js.Array[T] = js.native
  def slice[T](array: List[T], start: Double): js.Array[T] = js.native
  def slice[T](array: List[T], start: Double, end: Double): js.Array[T] = js.native
  
  /**
    * Converts string to snake case.
    *
    * @param string The string to convert.
    * @return Returns the snake cased string.
    */
  def snakeCase(): String = js.native
  def snakeCase(string: String): String = js.native
  
  /**
    * Checks if predicate returns truthy for any element of collection. Iteration is stopped once predicate
    * returns truthy. The predicate is invoked with three arguments: (value, index|key, collection).
    *
    * @param collection The collection to iterate over.
    * @param predicate The function invoked per iteration.
    * @return Returns true if any element passes the predicate check, else false.
    */
  def some[T](): Boolean = js.native
  def some[T /* <: js.Object */](collection: T): Boolean = js.native
  def some[T /* <: js.Object */](collection: T, predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  def some[T](collection: js.UndefOr[scala.Nothing], predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  def some[T](collection: Null, predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  def some[T](collection: List[T]): Boolean = js.native
  def some[T](collection: List[T], predicate: ListIterateeCustom[T, Boolean]): Boolean = js.native
  /**
    * @see _.some
    */
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](): Boolean = js.native
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  @JSName("some")
  def some_T_Object[T /* <: js.Object */](collection: Null, predicate: ObjectIterateeCustom[T, Boolean]): Boolean = js.native
  
  /**
    * @see _.sortBy
    */
  def sortBy[T /* <: js.Object */](collection: T, iteratees: Many[ObjectIteratee[T]]*): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sortBy[T /* <: js.Object */](collection: js.UndefOr[scala.Nothing], iteratees: Many[ObjectIteratee[T]]*): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def sortBy[T /* <: js.Object */](collection: Null, iteratees: Many[ObjectIteratee[T]]*): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  /**
    * Creates an array of elements, sorted in ascending order by the results of
    * running each element in a collection through each iteratee. This method
    * performs a stable sort, that is, it preserves the original sort order of
    * equal elements. The iteratees are invoked with one argument: (value).
    *
    * @category Collection
    * @param collection The collection to iterate over.
    * @param [iteratees=[_.identity]]
    *  The iteratees to sort by, specified individually or in arrays.
    * @returns Returns the new sorted array.
    * @example
    *
    * var users = [
    *   { 'user': 'fred',   'age': 48 },
    *   { 'user': 'barney', 'age': 36 },
    *   { 'user': 'fred',   'age': 42 },
    *   { 'user': 'barney', 'age': 34 }
    * ];
    *
    * _.sortBy(users, function(o) { return o.user; });
    * // => objects for [['barney', 36], ['barney', 34], ['fred', 48], ['fred', 42]]
    *
    * _.sortBy(users, ['user', 'age']);
    * // => objects for [['barney', 34], ['barney', 36], ['fred', 42], ['fred', 48]]
    *
    * _.sortBy(users, 'user', function(o) {
    *   return Math.floor(o.age / 10);
    * });
    * // => objects for [['barney', 36], ['barney', 34], ['fred', 48], ['fred', 42]]
    */
  def sortBy[T](collection: List[T], iteratees: Many[ListIteratee[T]]*): js.Array[T] = js.native
  @JSName("sortBy")
  def sortBy_T[T](collection: js.UndefOr[scala.Nothing], iteratees: Many[ListIteratee[T]]*): js.Array[T] = js.native
  @JSName("sortBy")
  def sortBy_T[T](collection: Null, iteratees: Many[ListIteratee[T]]*): js.Array[T] = js.native
  
  def sortedIndex[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def sortedIndex[T](array: Null, value: T): Double = js.native
  /**
    * Uses a binary search to determine the lowest index at which `value` should
    * be inserted into `array` in order to maintain its sort order.
    *
    * @category Array
    * @param array The sorted array to inspect.
    * @param value The value to evaluate.
    * @returns Returns the index at which `value` should be inserted into `array`.
    * @example
    *
    * _.sortedIndex([30, 50], 40);
    * // => 1
    *
    * _.sortedIndex([4, 5], 4);
    * // => 0
    */
  def sortedIndex[T](array: List[T], value: T): Double = js.native
  
  def sortedIndexBy[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def sortedIndexBy[T](array: js.UndefOr[scala.Nothing], value: T, iteratee: ValueIteratee[T]): Double = js.native
  def sortedIndexBy[T](array: Null, value: T): Double = js.native
  def sortedIndexBy[T](array: Null, value: T, iteratee: ValueIteratee[T]): Double = js.native
  /**
    * This method is like `_.sortedIndex` except that it accepts `iteratee`
    * which is invoked for `value` and each element of `array` to compute their
    * sort ranking. The iteratee is invoked with one argument: (value).
    *
    * @category Array
    * @param array The sorted array to inspect.
    * @param value The value to evaluate.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns the index at which `value` should be inserted into `array`.
    * @example
    *
    * var dict = { 'thirty': 30, 'forty': 40, 'fifty': 50 };
    *
    * _.sortedIndexBy(['thirty', 'fifty'], 'forty', _.propertyOf(dict));
    * // => 1
    *
    * // using the `_.property` iteratee shorthand
    * _.sortedIndexBy([{ 'x': 4 }, { 'x': 5 }], { 'x': 4 }, 'x');
    * // => 0
    */
  def sortedIndexBy[T](array: List[T], value: T): Double = js.native
  def sortedIndexBy[T](array: List[T], value: T, iteratee: ValueIteratee[T]): Double = js.native
  
  def sortedIndexOf[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def sortedIndexOf[T](array: Null, value: T): Double = js.native
  /**
    * This method is like `_.indexOf` except that it performs a binary
    * search on a sorted `array`.
    *
    * @category Array
    * @param array The array to search.
    * @param value The value to search for.
    * @returns Returns the index of the matched value, else `-1`.
    * @example
    *
    * _.sortedIndexOf([1, 1, 2, 2], 2);
    * // => 2
    */
  def sortedIndexOf[T](array: List[T], value: T): Double = js.native
  
  def sortedLastIndex[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def sortedLastIndex[T](array: Null, value: T): Double = js.native
  /**
    * This method is like `_.sortedIndex` except that it returns the highest
    * index at which `value` should be inserted into `array` in order to
    * maintain its sort order.
    *
    * @category Array
    * @param array The sorted array to inspect.
    * @param value The value to evaluate.
    * @returns Returns the index at which `value` should be inserted into `array`.
    * @example
    *
    * _.sortedLastIndex([4, 5], 4);
    * // => 1
    */
  def sortedLastIndex[T](array: List[T], value: T): Double = js.native
  
  def sortedLastIndexBy[T](array: js.UndefOr[scala.Nothing], value: T, iteratee: ValueIteratee[T]): Double = js.native
  def sortedLastIndexBy[T](array: Null, value: T, iteratee: ValueIteratee[T]): Double = js.native
  /**
    * This method is like `_.sortedLastIndex` except that it accepts `iteratee`
    * which is invoked for `value` and each element of `array` to compute their
    * sort ranking. The iteratee is invoked with one argument: (value).
    *
    * @category Array
    * @param array The sorted array to inspect.
    * @param value The value to evaluate.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns the index at which `value` should be inserted into `array`.
    * @example
    *
    * // using the `_.property` iteratee shorthand
    * _.sortedLastIndexBy([{ 'x': 4 }, { 'x': 5 }], { 'x': 4 }, 'x');
    * // => 1
    */
  def sortedLastIndexBy[T](array: List[T], value: T, iteratee: ValueIteratee[T]): Double = js.native
  
  def sortedLastIndexOf[T](array: js.UndefOr[scala.Nothing], value: T): Double = js.native
  def sortedLastIndexOf[T](array: Null, value: T): Double = js.native
  /**
    * This method is like `_.lastIndexOf` except that it performs a binary
    * search on a sorted `array`.
    *
    * @category Array
    * @param array The array to search.
    * @param value The value to search for.
    * @returns Returns the index of the matched value, else `-1`.
    * @example
    *
    * _.sortedLastIndexOf([1, 1, 2, 2], 2);
    * // => 3
    */
  def sortedLastIndexOf[T](array: List[T], value: T): Double = js.native
  
  /**
    * This method is like `_.uniq` except that it's designed and optimized
    * for sorted arrays.
    *
    * @category Array
    * @param array The array to inspect.
    * @returns Returns the new duplicate free array.
    * @example
    *
    * _.sortedUniq([1, 1, 2]);
    * // => [1, 2]
    */
  def sortedUniq[T](): js.Array[T] = js.native
  def sortedUniq[T](array: List[T]): js.Array[T] = js.native
  
  def sortedUniqBy[T](array: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def sortedUniqBy[T](array: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  /**
    * This method is like `_.uniqBy` except that it's designed and optimized
    * for sorted arrays.
    *
    * @category Array
    * @param array The array to inspect.
    * @param [iteratee] The iteratee invoked per element.
    * @returns Returns the new duplicate free array.
    * @example
    *
    * _.sortedUniqBy([1.1, 1.2, 2.3, 2.4], Math.floor);
    * // => [1.1, 2.2]
    */
  def sortedUniqBy[T](array: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  
  /**
    * Splits string by separator.
    *
    * Note: This method is based on String#split.
    *
    * @param string The string to split.
    * @param separator The separator pattern to split by.
    * @param limit The length to truncate results to.
    * @return Returns the new array of string segments.
    */
  def split(): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], index: String, guard: js.Object): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], index: Double, guard: js.Object): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], separator: String): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], separator: String, limit: Double): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], separator: js.RegExp): js.Array[String] = js.native
  def split(string: js.UndefOr[scala.Nothing], separator: js.RegExp, limit: Double): js.Array[String] = js.native
  def split(string: String): js.Array[String] = js.native
  /**
    * Splits string by separator.
    *
    * Note: This method is based on String#split.
    *
    * @param string The string to trim.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns the new array of string segments.
    */
  def split(string: String, index: String, guard: js.Object): js.Array[String] = js.native
  def split(string: String, index: Double, guard: js.Object): js.Array[String] = js.native
  def split(string: String, separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
  def split(string: String, separator: String): js.Array[String] = js.native
  def split(string: String, separator: String, limit: Double): js.Array[String] = js.native
  def split(string: String, separator: js.RegExp): js.Array[String] = js.native
  def split(string: String, separator: js.RegExp, limit: Double): js.Array[String] = js.native
  def split(string: Null, index: String, guard: js.Object): js.Array[String] = js.native
  def split(string: Null, index: Double, guard: js.Object): js.Array[String] = js.native
  def split(string: Null, separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
  def split(string: Null, separator: String): js.Array[String] = js.native
  def split(string: Null, separator: String, limit: Double): js.Array[String] = js.native
  def split(string: Null, separator: js.RegExp): js.Array[String] = js.native
  def split(string: Null, separator: js.RegExp, limit: Double): js.Array[String] = js.native
  
  /**
    * Creates a function that invokes func with the this binding of the created function and an array of arguments
    * much like Function#apply.
    *
    * Note: This method is based on the spread operator.
    *
    * @param func The function to spread arguments over.
    * @return Returns the new function.
    */
  def spread[TResult](func: js.Function1[/* repeated */ js.Any, TResult]): js.Function1[/* repeated */ js.Any, TResult] = js.native
  /**
    * @see _.spread
    */
  def spread[TResult](func: js.Function1[/* repeated */ js.Any, TResult], start: Double): js.Function1[/* repeated */ js.Any, TResult] = js.native
  
  /**
    * Converts string to start case.
    *
    * @param string The string to convert.
    * @return Returns the start cased string.
    */
  def startCase(): String = js.native
  def startCase(string: String): String = js.native
  
  /**
    * Checks if string starts with the given target string.
    *
    * @param string The string to search.
    * @param target The string to search for.
    * @param position The position to search from.
    * @return Returns true if string starts with target, else false.
    */
  def startsWith(): Boolean = js.native
  def startsWith(string: js.UndefOr[scala.Nothing], target: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def startsWith(string: js.UndefOr[scala.Nothing], target: String): Boolean = js.native
  def startsWith(string: js.UndefOr[scala.Nothing], target: String, position: Double): Boolean = js.native
  def startsWith(string: String): Boolean = js.native
  def startsWith(string: String, target: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
  def startsWith(string: String, target: String): Boolean = js.native
  def startsWith(string: String, target: String, position: Double): Boolean = js.native
  
  /**
    * This method returns a new empty array.
    *
    * @returns Returns the new empty array.
    */
  def stubArray(): js.Array[_] = js.native
  
  /**
    * This method returns `false`.
    *
    * @returns Returns `false`.
    */
  def stubFalse(): `false` = js.native
  
  /**
    * This method returns a new empty object.
    *
    * @returns Returns the new empty object.
    */
  def stubObject(): js.Any = js.native
  
  /**
    * This method returns an empty string.
    *
    * @returns Returns the empty string.
    */
  def stubString(): String = js.native
  
  /**
    * This method returns `true`.
    *
    * @returns Returns `true`.
    */
  def stubTrue(): `true` = js.native
  
  /**
    * Subtract two numbers.
    *
    * @category Math
    * @param minuend The first number in a subtraction.
    * @param subtrahend The second number in a subtraction.
    * @returns Returns the difference.
    * @example
    *
    * _.subtract(6, 4);
    * // => 2
    */
  def subtract(minuend: Double, subtrahend: Double): Double = js.native
  
  /**
    * Computes the sum of the values in `array`.
    *
    * @category Math
    * @param array The array to iterate over.
    * @returns Returns the sum.
    * @example
    *
    * _.sum([4, 2, 8, 6]);
    * // => 20
    */
  def sum(): Double = js.native
  def sum(collection: List[_]): Double = js.native
  
  /**
    * This method is like `_.sum` except that it accepts `iteratee` which is
    * invoked for each element in `array` to generate the value to be summed.
    * The iteratee is invoked with one argument: (value).
    *
    * @category Math
    * @param array The array to iterate over.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns the sum.
    * @example
    *
    * var objects = [{ 'n': 4 }, { 'n': 2 }, { 'n': 8 }, { 'n': 6 }];
    *
    * _.sumBy(objects, function(o) { return o.n; });
    * // => 20
    *
    * // using the `_.property` iteratee shorthand
    * _.sumBy(objects, 'n');
    * // => 20
    */
  def sumBy[T](): Double = js.native
  def sumBy[T](collection: js.UndefOr[scala.Nothing], iteratee: String): Double = js.native
  def sumBy[T](collection: js.UndefOr[scala.Nothing], iteratee: js.Function1[/* value */ T, Double]): Double = js.native
  def sumBy[T](collection: Null, iteratee: String): Double = js.native
  def sumBy[T](collection: Null, iteratee: js.Function1[/* value */ T, Double]): Double = js.native
  def sumBy[T](collection: List[T]): Double = js.native
  def sumBy[T](collection: List[T], iteratee: String): Double = js.native
  def sumBy[T](collection: List[T], iteratee: js.Function1[/* value */ T, Double]): Double = js.native
  
  /**
    * Gets all but the first element of array.
    *
    * @param array The array to query.
    * @return Returns the slice of array.
    */
  def tail[T](): js.Array[T] = js.native
  def tail[T](array: List[T]): js.Array[T] = js.native
  
  /**
    * Creates a slice of array with n elements taken from the beginning.
    *
    * @param array The array to query.
    * @param n The number of elements to take.
    * @return Returns the slice of array.
    */
  def take[T](): js.Array[T] = js.native
  def take[T](array: js.UndefOr[scala.Nothing], n: Double): js.Array[T] = js.native
  def take[T](array: Null, n: Double): js.Array[T] = js.native
  def take[T](array: List[T]): js.Array[T] = js.native
  def take[T](array: List[T], n: Double): js.Array[T] = js.native
  
  /**
    * Creates a slice of array with n elements taken from the end.
    *
    * @param array The array to query.
    * @param n The number of elements to take.
    * @return Returns the slice of array.
    */
  def takeRight[T](): js.Array[T] = js.native
  def takeRight[T](array: js.UndefOr[scala.Nothing], n: Double): js.Array[T] = js.native
  def takeRight[T](array: Null, n: Double): js.Array[T] = js.native
  def takeRight[T](array: List[T]): js.Array[T] = js.native
  def takeRight[T](array: List[T], n: Double): js.Array[T] = js.native
  
  /**
    * Creates a slice of array with elements taken from the end. Elements are taken until predicate returns
    * falsey. The predicate is invoked with three arguments: (value, index, array).
    *
    * @param array The array to query.
    * @param predicate The function invoked per iteration.
    * @return Returns the slice of array.
    */
  def takeRightWhile[T](): js.Array[T] = js.native
  def takeRightWhile[T](array: js.UndefOr[scala.Nothing], predicate: ListIteratee[T]): js.Array[T] = js.native
  def takeRightWhile[T](array: Null, predicate: ListIteratee[T]): js.Array[T] = js.native
  def takeRightWhile[T](array: List[T]): js.Array[T] = js.native
  def takeRightWhile[T](array: List[T], predicate: ListIteratee[T]): js.Array[T] = js.native
  
  /**
    * Creates a slice of array with elements taken from the beginning. Elements are taken until predicate returns
    * falsey. The predicate is invoked with three arguments: (value, index, array).
    *
    * @param array The array to query.
    * @param predicate The function invoked per iteration.
    * @return Returns the slice of array.
    */
  def takeWhile[T](): js.Array[T] = js.native
  def takeWhile[T](array: js.UndefOr[scala.Nothing], predicate: ListIteratee[T]): js.Array[T] = js.native
  def takeWhile[T](array: Null, predicate: ListIteratee[T]): js.Array[T] = js.native
  def takeWhile[T](array: List[T]): js.Array[T] = js.native
  def takeWhile[T](array: List[T], predicate: ListIteratee[T]): js.Array[T] = js.native
  
  /**
    * This method invokes interceptor and returns value. The interceptor is invoked with one
    * argument; (value). The purpose of this method is to "tap into" a method chain in order to perform operations
    * on intermediate results within the chain.
    *
    * @param value The value to provide to interceptor.
    * @param interceptor The function to invoke.
    * @return Returns value.
    **/
  def tap[T](value: T, interceptor: js.Function1[/* value */ T, Unit]): T = js.native
  
  /**
    * Creates a compiled template function that can interpolate data properties in "interpolate" delimiters,
    * HTML-escape interpolated data properties in "escape" delimiters, and execute JavaScript in "evaluate"
    * delimiters. Data properties may be accessed as free variables in the template. If a setting object is
    * provided it takes precedence over _.templateSettings values.
    *
    * Note: In the development build _.template utilizes
    * [sourceURLs](http://www.html5rocks.com/en/tutorials/developertools/sourcemaps/#toc-sourceurl) for easier
    * debugging.
    *
    * For more information on precompiling templates see
    * [lodash's custom builds documentation](https://lodash.com/custom-builds).
    *
    * For more information on Chrome extension sandboxes see
    * [Chrome's extensions documentation](https://developer.chrome.com/extensions/sandboxingEval).
    *
    * @param string The template string.
    * @param options The options object.
    * @param options.escape The HTML "escape" delimiter.
    * @param options.evaluate The "evaluate" delimiter.
    * @param options.imports An object to import into the template as free variables.
    * @param options.interpolate The "interpolate" delimiter.
    * @param options.sourceURL The sourceURL of the template's compiled source.
    * @param options.variable The data object variable name.
    * @return Returns the compiled template function.
    */
  def template(): TemplateExecutor = js.native
  def template(string: js.UndefOr[scala.Nothing], options: TemplateOptions): TemplateExecutor = js.native
  def template(string: String): TemplateExecutor = js.native
  def template(string: String, options: TemplateOptions): TemplateExecutor = js.native
  
  /**
    * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
    * (ERB). Change the following template settings to use alternative delimiters.
    **/
  var templateSettings: TemplateSettings = js.native
  
  /**
    * Creates a throttled function that only invokes func at most once per every wait milliseconds. The throttled
    * function comes with a cancel method to cancel delayed invocations and a flush method to immediately invoke
    * them. Provide an options object to indicate that func should be invoked on the leading and/or trailing edge
    * of the wait timeout. Subsequent calls to the throttled function return the result of the last func call.
    *
    * Note: If leading and trailing options are true, func is invoked on the trailing edge of the timeout only if
    * the the throttled function is invoked more than once during the wait timeout.
    *
    * @param func The function to throttle.
    * @param wait The number of milliseconds to throttle invocations to.
    * @param options The options object.
    * @param options.leading Specify invoking on the leading edge of the timeout.
    * @param options.trailing Specify invoking on the trailing edge of the timeout.
    * @return Returns the new throttled function.
    */
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T with Cancelable = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: js.UndefOr[scala.Nothing], options: ThrottleSettings): T with Cancelable = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double): T with Cancelable = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double, options: ThrottleSettings): T with Cancelable = js.native
  
  /**
    * This method is like _.tap except that it returns the result of interceptor.
    *
    * @param value The value to provide to interceptor.
    * @param interceptor The function to invoke.
    * @return Returns the result of interceptor.
    */
  def thru[T, TResult](value: T, interceptor: js.Function1[/* value */ T, TResult]): TResult = js.native
  
  /**
    * @see _.times
    */
  def times(n: Double): js.Array[Double] = js.native
  /**
    * Invokes the iteratee function n times, returning an array of the results of each invocation. The iteratee
    * is invoked with one argument; (index).
    *
    * @param n The number of times to invoke iteratee.
    * @param iteratee The function invoked per iteration.
    * @return Returns the array of results.
    */
  def times[TResult](n: Double, iteratee: js.Function1[/* num */ Double, TResult]): js.Array[TResult] = js.native
  
  /**
    * @see _.toArray
    */
  def toArray(): js.Array[_] = js.native
  /**
    * @see _.toArray
    */
  def toArray[T](value: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def toArray[T](value: Dictionary[T]): js.Array[T] = js.native
  def toArray[T](value: List[T]): js.Array[T] = js.native
  def toArray[T](value: NumericDictionary[T]): js.Array[T] = js.native
  /**
    * Converts value to an array.
    *
    * @param value The value to convert.
    * @return Returns the converted array.
    */
  @JSName("toArray")
  def toArray_T[T](): js.Array[T] = js.native
  
  /**
    * Converts `value` to a finite number.
    *
    * @since 4.12.0
    * @category Lang
    * @param value The value to convert.
    * @returns Returns the converted number.
    * @example
    *
    * _.toFinite(3.2);
    * // => 3.2
    *
    * _.toFinite(Number.MIN_VALUE);
    * // => 5e-324
    *
    * _.toFinite(Infinity);
    * // => 1.7976931348623157e+308
    *
    * _.toFinite('3.2');
    * // => 3.2
    */
  def toFinite(value: js.Any): Double = js.native
  
  /**
    * Converts `value` to an integer.
    *
    * **Note:** This function is loosely based on [`ToInteger`](http://www.ecma-international.org/ecma-262/6.0/#sec-tointeger).
    *
    * @category Lang
    * @param value The value to convert.
    * @returns Returns the converted integer.
    * @example
    *
    * _.toInteger(3);
    * // => 3
    *
    * _.toInteger(Number.MIN_VALUE);
    * // => 0
    *
    * _.toInteger(Infinity);
    * // => 1.7976931348623157e+308
    *
    * _.toInteger('3');
    * // => 3
    */
  def toInteger(value: js.Any): Double = js.native
  
  /**
    * Converts `value` to an integer suitable for use as the length of an
    * array-like object.
    *
    * **Note:** This method is based on [`ToLength`](http://ecma-international.org/ecma-262/6.0/#sec-tolength).
    *
    * @category Lang
    * @param value The value to convert.
    * @return Returns the converted integer.
    * @example
    *
    * _.toLength(3);
    * // => 3
    *
    * _.toLength(Number.MIN_VALUE);
    * // => 0
    *
    * _.toLength(Infinity);
    * // => 4294967295
    *
    * _.toLength('3');
    * // => 3
    */
  def toLength(value: js.Any): Double = js.native
  
  /**
    * Converts `string`, as a whole, to lower case.
    *
    * @param string The string to convert.
    * @return Returns the lower cased string.
    */
  def toLower(): String = js.native
  def toLower(string: String): String = js.native
  
  /**
    * Converts `value` to a number.
    *
    * @category Lang
    * @param value The value to process.
    * @returns Returns the number.
    * @example
    *
    * _.toNumber(3);
    * // => 3
    *
    * _.toNumber(Number.MIN_VALUE);
    * // => 5e-324
    *
    * _.toNumber(Infinity);
    * // => Infinity
    *
    * _.toNumber('3');
    * // => 3
    */
  def toNumber(value: js.Any): Double = js.native
  
  /**
    * @see _.toPairs
    */
  def toPairs(): js.Array[js.Tuple2[String, _]] = js.native
  def toPairs(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def toPairs[T](`object`: Dictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def toPairs[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  
  /**
    * @see _.toPairsIn
    */
  def toPairsIn(): js.Array[js.Tuple2[String, _]] = js.native
  def toPairsIn(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def toPairsIn[T](`object`: Dictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def toPairsIn[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  /**
    * Creates an array of own and inherited enumerable key-value pairs for object.
    *
    * @param object The object to query.
    * @return Returns the new array of key-value pairs.
    */
  @JSName("toPairsIn")
  def toPairsIn_T[T](): js.Array[js.Tuple2[String, T]] = js.native
  
  /**
    * Creates an array of own enumerable key-value pairs for object.
    *
    * @param object The object to query.
    * @return Returns the new array of key-value pairs.
    */
  @JSName("toPairs")
  def toPairs_T[T](): js.Array[js.Tuple2[String, T]] = js.native
  
  /**
    * Converts `value` to a property path array.
    *
    * @category Util
    * @param value The value to convert.
    * @returns Returns the new property path array.
    * @example
    *
    * _.toPath('a.b.c');
    * // => ['a', 'b', 'c']
    *
    * _.toPath('a[0].b.c');
    * // => ['a', '0', 'b', 'c']
    *
    * var path = ['a', 'b', 'c'],
    *     newPath = _.toPath(path);
    *
    * console.log(newPath);
    * // => ['a', 'b', 'c']
    *
    * console.log(path === newPath);
    * // => false
    */
  def toPath(value: js.Any): js.Array[String] = js.native
  
  /**
    * Converts value to a plain object flattening inherited enumerable properties of value to own properties
    * of the plain object.
    *
    * @param value The value to convert.
    * @return Returns the converted plain object.
    */
  def toPlainObject(): js.Any = js.native
  def toPlainObject(value: js.Any): js.Any = js.native
  
  /**
    * Converts `value` to a safe integer. A safe integer can be compared and
    * represented correctly.
    *
    * @category Lang
    * @param value The value to convert.
    * @returns Returns the converted integer.
    * @example
    *
    * _.toSafeInteger(3);
    * // => 3
    *
    * _.toSafeInteger(Number.MIN_VALUE);
    * // => 0
    *
    * _.toSafeInteger(Infinity);
    * // => 9007199254740991
    *
    * _.toSafeInteger('3');
    * // => 3
    */
  def toSafeInteger(value: js.Any): Double = js.native
  
  /**
    * Converts `value` to a string if it's not one. An empty string is returned
    * for `null` and `undefined` values. The sign of `-0` is preserved.
    *
    * @category Lang
    * @param value The value to process.
    * @returns Returns the string.
    * @example
    *
    * _.toString(null);
    * // => ''
    *
    * _.toString(-0);
    * // => '-0'
    *
    * _.toString([1, 2, 3]);
    * // => '1,2,3'
    */
  def toString(value: js.Any): String = js.native
  
  /**
    * Converts `string`, as a whole, to upper case.
    *
    * @param string The string to convert.
    * @return Returns the upper cased string.
    */
  def toUpper(): String = js.native
  def toUpper(string: String): String = js.native
  
  /**
    * @see _.transform
    */
  def transform(`object`: js.Array[_]): js.Array[_] = js.native
  /**
    * @see _.transform
    */
  def transform(`object`: js.Object): Dictionary[_] = js.native
  /**
    * An alternative to _.reduce; this method transforms object to a new accumulator object which is the result of
    * running each of its own enumerable properties through iteratee, with each invocation potentially mutating
    * the accumulator object. The iteratee is invoked with four arguments: (accumulator,
    * value, key, object). Iteratee functions may exit iteration early by explicitly returning false.
    *
    * @param object The object to iterate over.
    * @param iteratee The function invoked per iteration.
    * @param accumulator The custom accumulator value.
    * @return Returns the accumulated value.
    */
  def transform[T, TResult](`object`: js.Array[T], iteratee: MemoVoidArrayIterator[T, js.Array[TResult]]): js.Array[TResult] = js.native
  def transform[T, TResult](
    `object`: js.Array[T],
    iteratee: MemoVoidArrayIterator[T, js.Array[TResult]],
    accumulator: js.Array[TResult]
  ): js.Array[TResult] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `object`: js.Array[T],
    iteratee: MemoVoidArrayIterator[T, Dictionary[TResult]],
    accumulator: Dictionary[TResult]
  ): Dictionary[TResult] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](`object`: Dictionary[T], iteratee: MemoVoidDictionaryIterator[T, Dictionary[TResult]]): Dictionary[TResult] = js.native
  /**
    * @see _.transform
    */
  def transform[T, TResult](
    `object`: Dictionary[T],
    iteratee: MemoVoidDictionaryIterator[T, js.Array[TResult]],
    accumulator: js.Array[TResult]
  ): js.Array[TResult] = js.native
  def transform[T, TResult](
    `object`: Dictionary[T],
    iteratee: MemoVoidDictionaryIterator[T, Dictionary[TResult]],
    accumulator: Dictionary[TResult]
  ): Dictionary[TResult] = js.native
  
  /**
    * Removes leading and trailing whitespace or specified characters from string.
    *
    * @param string The string to trim.
    * @param chars The characters to trim.
    * @return Returns the trimmed string.
    */
  def trim(): String = js.native
  def trim(string: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def trim(string: String): String = js.native
  def trim(string: String, chars: String): String = js.native
  /**
    * Removes leading and trailing whitespace or specified characters from string.
    *
    * @param string The string to trim.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns the trimmed string.
    */
  def trim(string: String, index: String, guard: js.Object): String = js.native
  def trim(string: String, index: Double, guard: js.Object): String = js.native
  
  /**
    * Removes trailing whitespace or specified characters from string.
    *
    * @param string The string to trim.
    * @param chars The characters to trim.
    * @return Returns the trimmed string.
    */
  def trimEnd(): String = js.native
  def trimEnd(string: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def trimEnd(string: String): String = js.native
  def trimEnd(string: String, chars: String): String = js.native
  /**
    * Removes trailing whitespace or specified characters from string.
    *
    * @param string The string to trim.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns the trimmed string.
    */
  def trimEnd(string: String, index: String, guard: js.Object): String = js.native
  def trimEnd(string: String, index: Double, guard: js.Object): String = js.native
  
  /**
    * Removes leading whitespace or specified characters from string.
    *
    * @param string The string to trim.
    * @param chars The characters to trim.
    * @return Returns the trimmed string.
    */
  def trimStart(): String = js.native
  def trimStart(string: js.UndefOr[scala.Nothing], chars: String): String = js.native
  def trimStart(string: String): String = js.native
  def trimStart(string: String, chars: String): String = js.native
  /**
    * Removes leading whitespace or specified characters from string.
    *
    * @param string The string to trim.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns the trimmed string.
    */
  def trimStart(string: String, index: String, guard: js.Object): String = js.native
  def trimStart(string: String, index: Double, guard: js.Object): String = js.native
  
  /**
    * Truncates string if it’s longer than the given maximum string length. The last characters of the truncated
    * string are replaced with the omission string which defaults to "…".
    *
    * @param string The string to truncate.
    * @param options The options object or maximum string length.
    * @return Returns the truncated string.
    */
  def truncate(): String = js.native
  def truncate(string: js.UndefOr[scala.Nothing], options: TruncateOptions): String = js.native
  def truncate(string: String): String = js.native
  def truncate(string: String, options: TruncateOptions): String = js.native
  
  /**
    * Creates a function that accepts up to one argument, ignoring any
    * additional arguments.
    *
    * @category Function
    * @param func The function to cap arguments for.
    * @returns Returns the new function.
    * @example
    *
    * _.map(['6', '8', '10'], _.unary(parseInt));
    * // => [6, 8, 10]
    */
  def unary[T, TResult](func: js.Function2[/* arg1 */ T, /* repeated */ js.Any, TResult]): js.Function1[/* arg1 */ T, TResult] = js.native
  
  /**
    * The inverse of _.escape; this method converts the HTML entities &amp;, &lt;, &gt;, &quot;, &#39;, and &#96;
    * in string to their corresponding characters.
    *
    * Note: No other HTML entities are unescaped. To unescape additional HTML entities use a third-party library
    * like he.
    *
    * @param string The string to unescape.
    * @return Returns the unescaped string.
    */
  def unescape(): String = js.native
  def unescape(string: String): String = js.native
  
  /**
    * Creates an array of unique values, in order, from all of the provided arrays using SameValueZero for
    * equality comparisons.
    *
    * @param arrays The arrays to inspect.
    * @return Returns the new array of combined values.
    */
  def union[T](arrays: (js.UndefOr[List[T] | Null])*): js.Array[T] = js.native
  
  /**
    * This method is like `_.union` except that it accepts `iteratee` which is
    * invoked for each element of each `arrays` to generate the criterion by which
    * uniqueness is computed. The iteratee is invoked with one argument: (value).
    *
    * @param arrays The arrays to inspect.
    * @param iteratee The iteratee invoked per element.
    * @return Returns the new array of combined values.
    */
  def unionBy[T](): js.Array[T] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](
    arrays1: js.UndefOr[List[T] | Null],
    arrays2: js.UndefOr[List[T] | Null],
    arrays3: js.UndefOr[List[T] | Null],
    arrays4: js.UndefOr[List[T] | Null],
    arrays5: js.UndefOr[List[T] | Null],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](
    arrays1: js.UndefOr[List[T] | Null],
    arrays2: js.UndefOr[List[T] | Null],
    arrays3: js.UndefOr[List[T] | Null],
    arrays4: js.UndefOr[List[T] | Null],
    iteratee: js.UndefOr[ValueIteratee[T]]
  ): js.Array[T] = js.native
  /**
    * @see _.unionBy
    */
  def unionBy[T](
    arrays1: js.UndefOr[List[T] | Null],
    arrays2: js.UndefOr[List[T] | Null],
    arrays3: js.UndefOr[List[T] | Null],
    iteratee: js.UndefOr[ValueIteratee[T]]
  ): js.Array[T] = js.native
  def unionBy[T](arrays1: js.UndefOr[scala.Nothing], arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: js.UndefOr[scala.Nothing], arrays2: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: js.UndefOr[scala.Nothing], arrays2: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: Null, arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: Null, arrays2: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: Null, arrays2: List[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: Null, arrays2: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: List[T], arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: List[T], arrays2: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: List[T], arrays2: List[T]): js.Array[T] = js.native
  def unionBy[T](arrays1: List[T], arrays2: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def unionBy[T](arrays: List[T]): js.Array[T] = js.native
  def unionBy[T](arrays: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  
  /**
    * This method is like `_.union` except that it accepts `comparator` which
    * is invoked to compare elements of `arrays`. The comparator is invoked
    * with two arguments: (arrVal, othVal).
    *
    * @category Array
    * @param [arrays] The arrays to inspect.
    * @param [comparator] The comparator invoked per element.
    * @returns Returns the new array of combined values.
    * @example
    *
    * var objects = [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }];
    * var others = [{ 'x': 1, 'y': 1 }, { 'x': 1, 'y': 2 }];
    *
    * _.unionWith(objects, others, _.isEqual);
    * // => [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }, { 'x': 1, 'y': 1 }]
    */
  def unionWith[T](): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: Null, arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: Null,
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: Null, arrays2: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: Null, arrays2: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: List[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: List[T], arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: List[T], arrays2: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  /**
    * @see _.unionWith
    */
  def unionWith[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def unionWith[T](arrays: List[T], arrays2: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  def unionWith[T](arrays: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  
  /**
    * Creates a duplicate-free version of an array, using
    * [`SameValueZero`](http://ecma-international.org/ecma-262/6.0/#sec-samevaluezero)
    * for equality comparisons, in which only the first occurrence of each element
    * is kept.
    *
    * @category Array
    * @param array The array to inspect.
    * @returns Returns the new duplicate free array.
    * @example
    *
    * _.uniq([2, 1, 2]);
    * // => [2, 1]
    */
  def uniq[T](): js.Array[T] = js.native
  def uniq[T](array: List[T]): js.Array[T] = js.native
  
  def uniqBy[T](array: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def uniqBy[T](array: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  /**
    * This method is like `_.uniq` except that it accepts `iteratee` which is
    * invoked for each element in `array` to generate the criterion by which
    * uniqueness is computed. The iteratee is invoked with one argument: (value).
    *
    * @category Array
    * @param array The array to inspect.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns the new duplicate free array.
    * @example
    *
    * _.uniqBy([2.1, 1.2, 2.3], Math.floor);
    * // => [2.1, 1.2]
    *
    * // using the `_.property` iteratee shorthand
    * _.uniqBy([{ 'x': 1 }, { 'x': 2 }, { 'x': 1 }], 'x');
    * // => [{ 'x': 1 }, { 'x': 2 }]
    */
  def uniqBy[T](array: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  
  /**
    * This method is like `_.uniq` except that it accepts `comparator` which
    * is invoked to compare elements of `array`. The comparator is invoked with
    * two arguments: (arrVal, othVal).
    *
    * @category Array
    * @param array The array to inspect.
    * @param [comparator] The comparator invoked per element.
    * @returns Returns the new duplicate free array.
    * @example
    *
    * var objects = [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 },  { 'x': 1, 'y': 2 }];
    *
    * _.uniqWith(objects, _.isEqual);
    * // => [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }]
    */
  def uniqWith[T](): js.Array[T] = js.native
  def uniqWith[T](array: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def uniqWith[T](array: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def uniqWith[T](array: List[T]): js.Array[T] = js.native
  def uniqWith[T](array: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  
  /**
    * Generates a unique ID. If prefix is provided the ID is appended to it.
    *
    * @param prefix The value to prefix the ID with.
    * @return Returns the unique ID.
    */
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
  
  /**
    * Removes the property at path of object.
    *
    * Note: This method mutates object.
    *
    * @param object The object to modify.
    * @param path The path of the property to unset.
    * @return Returns true if the property is deleted, else false.
    */
  def unset(`object`: js.Any, path: PropertyPath): Boolean = js.native
  
  /**
    * This method is like _.zip except that it accepts an array of grouped elements and creates an array
    * regrouping the elements to their pre-zip configuration.
    *
    * @param array The array of grouped elements to process.
    * @return Returns the new array of regrouped elements.
    */
  def unzip[T](): js.Array[js.Array[T]] = js.native
  def unzip[T](array: js.Array[js.Array[T]]): js.Array[js.Array[T]] = js.native
  def unzip[T](array: List[List[T]]): js.Array[js.Array[T]] = js.native
  
  /**
    * @see _.unzipWith
    */
  def unzipWith[T](): js.Array[js.Array[T]] = js.native
  def unzipWith[T](array: List[List[T]]): js.Array[js.Array[T]] = js.native
  def unzipWith[T, TResult](array: js.UndefOr[scala.Nothing], iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  def unzipWith[T, TResult](array: Null, iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  /**
    * This method is like _.unzip except that it accepts an iteratee to specify how regrouped values should be
    * combined. The iteratee is invoked with four arguments: (accumulator, value, index, group).
    *
    * @param array The array of grouped elements to process.
    * @param iteratee The function to combine regrouped values.
    * @return Returns the new array of regrouped elements.
    */
  def unzipWith[T, TResult](array: List[List[T]], iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  
  /**
    * This method is like _.set except that accepts updater to produce the value to set. Use _.updateWith to
    * customize path creation. The updater is invoked with one argument: (value).
    *
    * @param object The object to modify.
    * @param path The path of the property to set.
    * @param updater The function to produce the updated value.
    * @return Returns object.
    */
  def update(`object`: js.Object, path: PropertyPath, updater: js.Function1[/* value */ js.Any, _]): js.Any = js.native
  
  /**
    * This method is like `_.update` except that it accepts `customizer` which is
    * invoked to produce the objects of `path`.  If `customizer` returns `undefined`
    * path creation is handled by the method instead. The `customizer` is invoked
    * with three arguments: (nsValue, key, nsObject).
    *
    * **Note:** This method mutates `object`.
    *
    * @since 4.6.0
    * @category Object
    * @param object The object to modify.
    * @param path The path of the property to set.
    * @param updater The function to produce the updated value.
    * @param [customizer] The function to customize assigned values.
    * @returns Returns `object`.
    * @example
    *
    * var object = {};
    *
    * _.updateWith(object, '[0][1]', _.constant('a'), Object);
    * // => { '0': { '1': 'a' } }
    */
  def updateWith[T /* <: js.Object */](`object`: T, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): T = js.native
  def updateWith[T /* <: js.Object */](
    `object`: T,
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[T]
  ): T = js.native
  /**
    * @see _.updateWith
    */
  @JSName("updateWith")
  def updateWith_T_ObjectTResult_TResult[T /* <: js.Object */, TResult](`object`: T, path: PropertyPath, updater: js.Function1[/* oldValue */ js.Any, _]): TResult = js.native
  @JSName("updateWith")
  def updateWith_T_ObjectTResult_TResult[T /* <: js.Object */, TResult](
    `object`: T,
    path: PropertyPath,
    updater: js.Function1[/* oldValue */ js.Any, _],
    customizer: SetWithCustomizer[T]
  ): TResult = js.native
  
  /**
    * Converts `string`, as space separated words, to upper case.
    *
    * @param string The string to convert.
    * @return Returns the upper cased string.
    */
  def upperCase(): String = js.native
  def upperCase(string: String): String = js.native
  
  /**
    * Converts the first character of `string` to upper case.
    *
    * @param string The string to convert.
    * @return Returns the converted string.
    */
  def upperFirst(): String = js.native
  def upperFirst(string: String): String = js.native
  
  /**
    * @see _.values
    */
  def values(`object`: js.Any): js.Array[_] = js.native
  /**
    * @see _.values
    */
  def values[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def values[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def values[T](`object`: Dictionary[T]): js.Array[T] = js.native
  def values[T](`object`: List[T]): js.Array[T] = js.native
  def values[T](`object`: NumericDictionary[T]): js.Array[T] = js.native
  
  /**
    * @see _.valuesIn
    */
  def valuesIn[T /* <: js.Object */](): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def valuesIn[T /* <: js.Object */](`object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def valuesIn[T](`object`: Dictionary[T]): js.Array[T] = js.native
  def valuesIn[T](`object`: List[T]): js.Array[T] = js.native
  def valuesIn[T](`object`: NumericDictionary[T]): js.Array[T] = js.native
  /**
    * Creates an array of the own and inherited enumerable property values of object.
    *
    * @param object The object to query.
    * @return Returns the array of property values.
    */
  @JSName("valuesIn")
  def valuesIn_T[T](): js.Array[T] = js.native
  
  /**
    * Creates an array of the own enumerable property values of object.
    *
    * @param object The object to query.
    * @return Returns an array of property values.
    */
  @JSName("values")
  def values_T[T](): js.Array[T] = js.native
  
  def without[T](array: js.UndefOr[scala.Nothing], values: T*): js.Array[T] = js.native
  def without[T](array: Null, values: T*): js.Array[T] = js.native
  /**
    * Creates an array excluding all provided values using SameValueZero for equality comparisons.
    *
    * @param array The array to filter.
    * @param values The values to exclude.
    * @return Returns the new array of filtered values.
    */
  def without[T](array: List[T], values: T*): js.Array[T] = js.native
  
  /**
    * Splits `string` into an array of its words.
    *
    * @param string The string to inspect.
    * @param pattern The pattern to match words.
    * @return Returns the words of `string`.
    */
  def words(): js.Array[String] = js.native
  def words(string: js.UndefOr[scala.Nothing], pattern: String): js.Array[String] = js.native
  def words(string: js.UndefOr[scala.Nothing], pattern: js.RegExp): js.Array[String] = js.native
  def words(string: String): js.Array[String] = js.native
  /**
    * Splits `string` into an array of its words.
    *
    * @param string The string to inspect.
    * @param index Not used in this overload.
    * @param guard Enables use as an iteratee for methods like _.map. You should not pass this parameter directly in your code.
    * @return Returns the words of `string`.
    */
  def words(string: String, index: String, guard: js.Object): js.Array[String] = js.native
  def words(string: String, index: Double, guard: js.Object): js.Array[String] = js.native
  def words(string: String, pattern: String): js.Array[String] = js.native
  def words(string: String, pattern: js.RegExp): js.Array[String] = js.native
  
  /**
    * @see _.wrap
    */
  def wrap[T, TResult](value: T, wrapper: js.Function2[/* value */ T, /* repeated */ js.Any, TResult]): js.Function1[/* repeated */ js.Any, TResult] = js.native
  /**
    * Creates a function that provides value to the wrapper function as its first argument. Any additional
    * arguments provided to the function are appended to those provided to the wrapper function. The wrapper is
    * invoked with the this binding of the created function.
    *
    * @param value The value to wrap.
    * @param wrapper The wrapper function.
    * @return Returns the new function.
    */
  @JSName("wrap")
  def wrap_TTArgsTResult[T, TArgs, TResult](value: T, wrapper: js.Function2[/* value */ T, /* repeated */ TArgs, TResult]): js.Function1[/* repeated */ TArgs, TResult] = js.native
  
  /**
    * Creates an array of unique values that is the symmetric difference of the provided arrays.
    *
    * @param arrays The arrays to inspect.
    * @return Returns the new array of values.
    */
  def xor[T](arrays: (js.UndefOr[List[T] | Null])*): js.Array[T] = js.native
  
  /**
    * This method is like `_.xor` except that it accepts `iteratee` which is
    * invoked for each element of each `arrays` to generate the criterion by which
    * uniqueness is computed. The iteratee is invoked with one argument: (value).
    *
    * @category Array
    * @param [arrays] The arrays to inspect.
    * @param [iteratee=_.identity] The iteratee invoked per element.
    * @returns Returns the new array of values.
    * @example
    *
    * _.xorBy([2.1, 1.2], [4.3, 2.4], Math.floor);
    * // => [1.2, 4.3]
    *
    * // using the `_.property` iteratee shorthand
    * _.xorBy([{ 'x': 1 }], [{ 'x': 2 }, { 'x': 1 }], 'x');
    * // => [{ 'x': 2 }]
    */
  def xorBy[T](): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: js.UndefOr[scala.Nothing], arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: js.UndefOr[scala.Nothing], arrays2: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: js.UndefOr[scala.Nothing], arrays2: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: Null, arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: Null,
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: Null,
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: Null, arrays2: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: Null, arrays2: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: List[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: List[T], arrays2: js.UndefOr[scala.Nothing], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: List[T], arrays2: Null, iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: Null,
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  /**
    * @see _.xorBy
    */
  def xorBy[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: List[T],
    iteratee: (js.UndefOr[ValueIteratee[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorBy[T](arrays: List[T], arrays2: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def xorBy[T](arrays: List[T], iteratee: ValueIteratee[T]): js.Array[T] = js.native
  
  /**
    * This method is like `_.xor` except that it accepts `comparator` which is
    * invoked to compare elements of `arrays`. The comparator is invoked with
    * two arguments: (arrVal, othVal).
    *
    * @category Array
    * @param [arrays] The arrays to inspect.
    * @param [comparator] The comparator invoked per element.
    * @returns Returns the new array of values.
    * @example
    *
    * var objects = [{ 'x': 1, 'y': 2 }, { 'x': 2, 'y': 1 }];
    * var others = [{ 'x': 1, 'y': 1 }, { 'x': 1, 'y': 2 }];
    *
    * _.xorWith(objects, others, _.isEqual);
    * // => [{ 'x': 2, 'y': 1 }, { 'x': 1, 'y': 1 }]
    */
  def xorWith[T](): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: List[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: js.UndefOr[scala.Nothing],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: js.UndefOr[scala.Nothing], arrays2: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: Null, arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: Null,
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: Null, arrays2: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: Null, arrays2: List[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: Null,
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: Null, arrays2: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: List[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: js.UndefOr[scala.Nothing],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: List[T], arrays2: js.UndefOr[scala.Nothing], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: Null,
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: List[T], arrays2: Null, comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: List[T], arrays2: List[T]): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: js.UndefOr[scala.Nothing],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: Null,
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  /**
    * @see _.xorWith
    */
  def xorWith[T](
    arrays: List[T],
    arrays2: List[T],
    arrays3: List[T],
    comparator: (js.UndefOr[Comparator[T] | List[T] | Null])*
  ): js.Array[T] = js.native
  def xorWith[T](arrays: List[T], arrays2: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  def xorWith[T](arrays: List[T], comparator: Comparator[T]): js.Array[T] = js.native
  
  /**
    * @see _.zip
    */
  def zip[T](arrays: (js.UndefOr[List[T] | Null])*): js.Array[js.Array[js.UndefOr[T]]] = js.native
  /**
    * Creates an array of grouped elements, the first of which contains the first elements of the given arrays,
    * the second of which contains the second elements of the given arrays, and so on.
    *
    * @param arrays The arrays to process.
    * @return Returns the new array of grouped elements.
    */
  def zip[T1, T2](arrays1: List[T1], arrays2: List[T2]): js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[T2]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3](arrays1: List[T1], arrays2: List[T2], arrays3: List[T3]): js.Array[js.Tuple3[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4](arrays1: List[T1], arrays2: List[T2], arrays3: List[T3], arrays4: List[T4]): js.Array[js.Tuple4[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4]]] = js.native
  /**
    * @see _.zip
    */
  def zip[T1, T2, T3, T4, T5](arrays1: List[T1], arrays2: List[T2], arrays3: List[T3], arrays4: List[T4], arrays5: List[T5]): js.Array[
    js.Tuple5[js.UndefOr[T1], js.UndefOr[T2], js.UndefOr[T3], js.UndefOr[T4], js.UndefOr[T5]]
  ] = js.native
  
  /**
    * @see _.zipObject
    */
  def zipObject(): Dictionary[js.UndefOr[scala.Nothing]] = js.native
  def zipObject(props: List[PropertyName]): Dictionary[js.UndefOr[scala.Nothing]] = js.native
  /**
    * This method is like _.fromPairs except that it accepts two arrays, one of property
    * identifiers and one of corresponding values.
    *
    * @param props The property names.
    * @param values The property values.
    * @return Returns the new object.
    */
  def zipObject[T](props: List[PropertyName], values: List[T]): Dictionary[T] = js.native
  
  /**
    * This method is like _.zipObject except that it supports property paths.
    *
    * @param paths The property names.
    * @param values The property values.
    * @return Returns the new object.
    */
  def zipObjectDeep(): js.Object = js.native
  def zipObjectDeep(paths: js.UndefOr[scala.Nothing], values: List[_]): js.Object = js.native
  def zipObjectDeep(paths: List[PropertyPath]): js.Object = js.native
  def zipObjectDeep(paths: List[PropertyPath], values: List[_]): js.Object = js.native
  
  /**
    * This method is like _.zip except that it accepts an iteratee to specify how grouped values should be
    * combined. The iteratee is invoked with four arguments: (accumulator, value, index,
    * group).
    * @param arrays The arrays to process.
    * @param iteratee The function to combine grouped values.
    * @return Returns the new array of grouped elements.
    */
  def zipWith[T, TResult](arrays: List[T], iteratee: js.Function1[/* value1 */ T, TResult]): js.Array[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T, TResult](iteratee: (js.UndefOr[(js.Function1[/* repeated */ T, TResult]) | List[T] | Null])*): js.Array[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, TResult](
    arrays1: List[T1],
    arrays2: List[T2],
    iteratee: js.Function2[/* value1 */ T1, /* value2 */ T2, TResult]
  ): js.Array[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, TResult](
    arrays1: List[T1],
    arrays2: List[T2],
    arrays3: List[T3],
    iteratee: js.Function3[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, TResult]
  ): js.Array[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, TResult](
    arrays1: List[T1],
    arrays2: List[T2],
    arrays3: List[T3],
    arrays4: List[T4],
    iteratee: js.Function4[/* value1 */ T1, /* value2 */ T2, /* value3 */ T3, /* value4 */ T4, TResult]
  ): js.Array[TResult] = js.native
  /**
    * @see _.zipWith
    */
  def zipWith[T1, T2, T3, T4, T5, TResult](
    arrays1: List[T1],
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
  ): js.Array[TResult] = js.native
}
