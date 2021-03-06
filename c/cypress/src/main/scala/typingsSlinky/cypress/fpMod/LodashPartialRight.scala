package typingsSlinky.cypress.fpMod

import typingsSlinky.cypress.lodashMod.Function0
import typingsSlinky.cypress.lodashMod.Function1
import typingsSlinky.cypress.lodashMod.Function2
import typingsSlinky.cypress.lodashMod.Function3
import typingsSlinky.cypress.lodashMod.Function4
import typingsSlinky.cypress.lodashMod.LoDashImplicitWrapper
import typingsSlinky.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartialRight extends js.Object {
  @JSName("placeholder")
  var placeholder_Original: __ = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, _]): LodashPartialRight27x1 = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, _], args: js.Array[_]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply(func: __, args: js.Array[_]): LodashPartialRight27x2 = js.native
  def apply[T1](func: __, arg1: js.Tuple2[T1, __]): LodashPartialRight2x2[T1] = js.native
  def apply[T1](func: __, arg1: js.Tuple3[T1, __, __]): LodashPartialRight5x2[T1] = js.native
  def apply[T1](func: __, arg1: js.Tuple4[T1, __, __, __]): LodashPartialRight12x2[T1] = js.native
  def apply[T1, T2, R](func: Function2[T1, T2, R]): LodashPartialRight2x1[T1, T2, R] = js.native
  def apply[T1, T2, R](func: Function2[T1, T2, R], arg1: js.Tuple2[T1, T2]): Function0[R] = js.native
  def apply[T1, T2, R](func: Function2[T1, T2, R], arg2: js.Array[T2]): Function1[T1, R] = js.native
  def apply[T1, T2, T3, R](func: Function3[T1, T2, T3, R]): LodashPartialRight5x1[T1, T2, T3, R] = js.native
  def apply[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg1: js.Tuple3[T1, T2, T3]): Function0[R] = js.native
  def apply[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg2: js.Tuple2[T2, __]): Function2[T1, T3, R] = js.native
  def apply[T1, T2, T3, R](func: Function3[T1, T2, T3, R], arg3: js.Array[T3]): Function2[T1, T2, R] = js.native
  def apply[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R]): LodashPartialRight12x1[T1, T2, T3, T4, R] = js.native
  def apply[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg1: js.Tuple4[T1, __, __, __]): Function3[T2, T3, T4, R] = js.native
  def apply[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg2: js.Tuple3[T2, __, __]): Function3[T1, T3, T4, R] = js.native
  def apply[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg3: js.Tuple2[T3, __]): Function3[T1, T2, T4, R] = js.native
  def apply[T1, T2, T3, T4, R](func: Function4[T1, T2, T3, T4, R], arg4: js.Array[T4]): Function3[T1, T2, T3, R] = js.native
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
  def placeholder[T](value: T): LoDashImplicitWrapper[T] = js.native
}

