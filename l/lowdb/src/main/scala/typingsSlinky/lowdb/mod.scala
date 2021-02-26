package typingsSlinky.lowdb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.lodash.mod.Collection
import typingsSlinky.lodash.mod.Function
import typingsSlinky.lodash.mod.List
import typingsSlinky.lodash.mod.LoDashStatic
import typingsSlinky.lodash.mod.Object
import typingsSlinky.lodash.mod.ObjectChain
import typingsSlinky.lodash.mod.Primitive
import typingsSlinky.lowdb.lowdbStrings.`@@reference`
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lowdb", JSImport.Namespace)
  @js.native
  val ^ : typingsSlinky.lowdb.mod.lowdb = js.native
  
  @js.native
  trait AdapterAsync[SchemaT] extends BaseAdapter[SchemaT] {
    
    def write(state: js.Object): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait AdapterOptions[SchemaT] extends StObject {
    
    var defaultValue: js.UndefOr[SchemaT] = js.native
    
    var deserialize: js.UndefOr[js.Function1[/* serializedData */ String, SchemaT]] = js.native
    
    var serialize: js.UndefOr[js.Function1[/* data */ SchemaT, String]] = js.native
  }
  object AdapterOptions {
    
    @scala.inline
    def apply[SchemaT](): AdapterOptions[SchemaT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdapterOptions[SchemaT]]
    }
    
    @scala.inline
    implicit class AdapterOptionsMutableBuilder[Self <: AdapterOptions[_], SchemaT] (val x: Self with AdapterOptions[SchemaT]) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: SchemaT): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDeserialize(value: /* serializedData */ String => SchemaT): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      @scala.inline
      def setSerialize(value: /* data */ SchemaT => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
  
  @js.native
  trait AdapterSync[SchemaT] extends BaseAdapter[SchemaT] {
    
    def write(state: js.Object): Unit = js.native
  }
  
  @js.native
  trait BaseAdapter[SchemaT]
    extends AdapterOptions[SchemaT]
       with Instantiable1[/* source */ String, BaseAdapter[js.Object]]
       with Instantiable2[/* source */ String, /* options */ AdapterOptions[js.Object], BaseAdapter[js.Object]] {
    
    val `@@reference`: SchemaT = js.native
    
    var source: String = js.native
  }
  
  @js.native
  trait FpReturnAsync[PathT] extends FpReturnBase[PathT] {
    
    /**
      * @description Writes the change to the database, based on the callback's return value.
      * @example
      * ```js
      *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
      * ```
      */
    def write[R1 /* <: PathT */](f1: js.Function1[/* a1 */ PathT, R1]): js.Promise[R1] = js.native
  }
  
  @js.native
  trait FpReturnBase[PathT] extends StObject {
    
    def apply(funcs: js.Array[js.Function1[/* a */ _, _]]): js.Any = js.native
    /**
      * Execute a series of functions on the data at a given path.
      * Result of previous function is the input of the next one.
      * Returns the result of the last function.
      */
    def apply[R1](f1: js.Function1[/* a1 */ PathT, R1]): R1 = js.native
    // <R1>(f1: [(a1: PathT) => R1]): R1;
    def apply[R1, R2](f1: js.Tuple2[js.Function1[/* a1 */ PathT, R1], js.Function1[/* a */ R1, R2]]): R2 = js.native
    def apply[R1, R2, R3](
      f1: js.Tuple3[
          js.Function1[/* a1 */ PathT, R1], 
          js.Function1[/* a */ R1, R2], 
          js.Function1[/* a */ R2, R3]
        ]
    ): R3 = js.native
    def apply[R1, R2, R3, R4](
      f1: js.Tuple4[
          js.Function1[/* a1 */ PathT, R1], 
          js.Function1[/* a */ R1, R2], 
          js.Function1[/* a */ R2, R3], 
          js.Function1[/* a */ R3, R4]
        ]
    ): R4 = js.native
    def apply[R1, R2, R3, R4, R5](
      f1: js.Tuple5[
          js.Function1[/* a1 */ PathT, R1], 
          js.Function1[/* a */ R1, R2], 
          js.Function1[/* a */ R2, R3], 
          js.Function1[/* a */ R3, R4], 
          js.Function1[/* a */ R4, R5]
        ]
    ): R5 = js.native
    def apply[R1, R2, R3, R4, R5, R6](
      f1: js.Tuple6[
          js.Function1[/* a1 */ PathT, R1], 
          js.Function1[/* a */ R1, R2], 
          js.Function1[/* a */ R2, R3], 
          js.Function1[/* a */ R3, R4], 
          js.Function1[/* a */ R4, R5], 
          js.Function1[/* a */ R5, R6]
        ]
    ): R6 = js.native
    def apply[R1, R2, R3, R4, R5, R6, R7](
      f1: js.Tuple7[
          js.Function1[/* a1 */ PathT, R1], 
          js.Function1[/* a */ R1, R2], 
          js.Function1[/* a */ R2, R3], 
          js.Function1[/* a */ R3, R4], 
          js.Function1[/* a */ R4, R5], 
          js.Function1[/* a */ R5, R6], 
          js.Function1[/* a */ R6, R7]
        ]
    ): R7 = js.native
  }
  
  @js.native
  trait FpReturnSync[PathT] extends FpReturnBase[PathT] {
    
    /**
      * @description Writes the change to the database, based on the callback's return value.
      * @example
      * ```js
      *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
      * ```
      */
    def write[R1 /* <: PathT */](f1: js.Function1[/* a1 */ PathT, R1]): R1 = js.native
  }
  
  @js.native
  trait LowdbAsync[SchemaT]
    extends ObjectChain[SchemaT]
       with LowdbBase[SchemaT] {
    
    @JSName("_")
    def _underscore(): typingsSlinky.lodash.mod.String = js.native
    @JSName("_")
    def _underscore(value: String): typingsSlinky.lodash.mod.String = js.native
    @JSName("_")
    def _underscore[T /* <: js.Object */](value: T): Object[T] = js.native
    @JSName("_")
    def _underscore[T](value: List[T]): Collection[T] = js.native
    @JSName("_")
    var _underscore_Original: LoDashStatic = js.native
    @JSName("_")
    def _underscore_T_Collection[T](): Collection[T] = js.native
    @JSName("_")
    def _underscore_T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
    @JSName("_")
    def _underscore_T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
    @JSName("_")
    def _underscore_T_Primitive[T](value: T): Primitive[T] = js.native
    @JSName("_")
    def `_underscore_T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
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
    @JSName("_")
    def _underscore_TrapAny_TrapAny_Intersection[TrapAny /* <: typingsSlinky.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with typingsSlinky.lodash.mod.String = js.native
    
    def read(): js.Promise[this.type] = js.native
    
    /**
      * @description Be careful: This function overwrites the whole database.
      */
    def write[T](): T with js.Promise[T] = js.native
    def write[T](returnValue: T): T with js.Promise[T] = js.native
  }
  
  @js.native
  trait LowdbBase[SchemaT] extends StObject {
    
    def getState(): SchemaT = js.native
    
    def setState(state: SchemaT): this.type = js.native
  }
  object LowdbBase {
    
    @scala.inline
    def apply[SchemaT](getState: () => SchemaT, setState: SchemaT => LowdbBase[SchemaT]): LowdbBase[SchemaT] = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
      __obj.asInstanceOf[LowdbBase[SchemaT]]
    }
    
    @scala.inline
    implicit class LowdbBaseMutableBuilder[Self <: LowdbBase[_], SchemaT] (val x: Self with LowdbBase[SchemaT]) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => SchemaT): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: SchemaT => LowdbBase[SchemaT]): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LowdbFpAsync[SchemaT] extends LowdbBase[SchemaT] {
    
    /**
      * @description Returns a function that allows you to access/modify the database at a given path.
      * @example
      * ```js
      *  const posts = db('posts')
      *  const firstPost = posts(all => all[0])
      *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
      * ```
      */
    def apply[TKey /* <: /* keyof SchemaT */ String */](path: TKey): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */](
      path: TKey,
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
    ): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[T](path: String): FpReturnAsync[T] = js.native
    def apply[T](path: String, defaultValue: T): FpReturnAsync[T] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */](path: js.Array[TKey]): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[T](path: js.Array[String], defaultValue: T): FpReturnAsync[T] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */](
      path: js.Array[TKey],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
    ): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */](path: js.Tuple2[TKey, TSubKey]): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */](
      path: js.Tuple2[TKey, TSubKey],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
    ): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */](path: js.Tuple3[TKey, TSubKey, TSubKey2]): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */](
      path: js.Tuple3[TKey, TSubKey, TSubKey2],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
    ): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */](path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3]): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */](
      path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
    ): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */, TSubKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any */](path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4]): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */, TSubKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any */](
      path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
    ): FpReturnAsync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
      ] = js.native
    
    /**
      * @description Be careful: This function overwrites the whole database.
      */
    def write[T](): js.Promise[T] = js.native
    def write[T](returnValue: T): js.Promise[T] = js.native
  }
  
  @js.native
  trait LowdbFpSync[SchemaT] extends LowdbBase[SchemaT] {
    
    /**
      * @description Returns a function that allows you to access/modify the database at a given path.
      * @example
      * ```js
      *  const posts = db('posts')
      *  const firstPost = posts(all => all[0])
      *  posts.write((allPosts) => [...allPosts, {title: 'Yup!'}])
      * ```
      */
    def apply[TKey /* <: /* keyof SchemaT */ String */](path: TKey): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */](
      path: TKey,
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
    ): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[T](path: String): FpReturnSync[T] = js.native
    def apply[T](path: String, defaultValue: T): FpReturnSync[T] = js.native
    def apply[T](path: js.Array[String]): FpReturnSync[T] = js.native
    def apply[T](path: js.Array[String], defaultValue: T): FpReturnSync[T] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */](
      path: js.Array[TKey],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
    ): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */](path: js.Tuple2[TKey, TSubKey]): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */](
      path: js.Tuple2[TKey, TSubKey],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
    ): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */](path: js.Tuple3[TKey, TSubKey, TSubKey2]): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */](
      path: js.Tuple3[TKey, TSubKey, TSubKey2],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
    ): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */](path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3]): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */](
      path: js.Tuple4[TKey, TSubKey, TSubKey2, TSubKey3],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
    ): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */, TSubKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any */](path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4]): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
      ] = js.native
    def apply[TKey /* <: /* keyof SchemaT */ String */, TSubKey /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey] */ js.Any */, TSubKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey] */ js.Any */, TSubKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2] */ js.Any */, TSubKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof SchemaT[TKey][TSubKey][TSubKey2][TSubKey3] */ js.Any */](
      path: js.Tuple5[TKey, TSubKey, TSubKey2, TSubKey3, TSubKey4],
      defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
    ): FpReturnSync[
        /* import warning: importer.ImportType#apply Failed type conversion: SchemaT[TKey][TSubKey][TSubKey2][TSubKey3][TSubKey4] */ js.Any
      ] = js.native
    
    /**
      * @description Be careful: This function overwrites the whole database.
      */
    def write[T](): T = js.native
    def write[T](returnValue: T): T = js.native
  }
  
  @js.native
  trait LowdbSync[SchemaT]
    extends ObjectChain[SchemaT]
       with LowdbBase[SchemaT] {
    
    @JSName("_")
    def _underscore(): typingsSlinky.lodash.mod.String = js.native
    @JSName("_")
    def _underscore(value: String): typingsSlinky.lodash.mod.String = js.native
    @JSName("_")
    def _underscore[T /* <: js.Object */](value: T): Object[T] = js.native
    @JSName("_")
    def _underscore[T](value: List[T]): Collection[T] = js.native
    @JSName("_")
    var _underscore_Original: LoDashStatic = js.native
    @JSName("_")
    def _underscore_T_Collection[T](): Collection[T] = js.native
    @JSName("_")
    def _underscore_T_Function1AnyWildcard_Function[T /* <: js.Function1[/* args */ js.Any, _] */](value: T): Function[T] = js.native
    @JSName("_")
    def _underscore_T_Object_Object[T /* <: js.Object */](): Object[T] = js.native
    @JSName("_")
    def _underscore_T_Primitive[T](value: T): Primitive[T] = js.native
    @JSName("_")
    def `_underscore_T_UnionNull<undefined>_Primitive`[T /* <: js.UndefOr[Null] */](value: T): Primitive[T] = js.native
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
    @JSName("_")
    def _underscore_TrapAny_TrapAny_Intersection[TrapAny /* <: typingsSlinky.lodash.anon.TrapAny */](value: TrapAny): Collection[_] with Function[_] with Object[_] with Primitive[_] with typingsSlinky.lodash.mod.String = js.native
    
    def read(): this.type = js.native
    
    /**
      * @description Be careful: This function overwrites the whole database.
      */
    def write[T](): T with js.Promise[T] = js.native
    def write[T](returnValue: T): T with js.Promise[T] = js.native
  }
  
  type ReferenceProperty = `@@reference`
  
  type _To = typingsSlinky.lowdb.mod.lowdb
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typingsSlinky.lowdb.mod.lowdb = ^
  
  /* augmented module */
  object lodashAugmentingMod {
    
    @js.native
    trait CollectionChain[T] extends StObject {
      
      def write(): ArrayLike[T] with js.Promise[ArrayLike[T]] = js.native
    }
    object CollectionChain {
      
      @scala.inline
      def apply[T](write: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): CollectionChain[T] = {
        val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
        __obj.asInstanceOf[CollectionChain[T]]
      }
      
      @scala.inline
      implicit class CollectionChainMutableBuilder[Self <: CollectionChain[_], T] (val x: Self with CollectionChain[T]) extends AnyVal {
        
        @scala.inline
        def setWrite(value: () => ArrayLike[T] with js.Promise[ArrayLike[T]]): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FunctionChain[T] extends StObject {
      
      def write(): T with js.Promise[T] = js.native
    }
    object FunctionChain {
      
      @scala.inline
      def apply[T](write: () => T with js.Promise[T]): FunctionChain[T] = {
        val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
        __obj.asInstanceOf[FunctionChain[T]]
      }
      
      @scala.inline
      implicit class FunctionChainMutableBuilder[Self <: FunctionChain[_], T] (val x: Self with FunctionChain[T]) extends AnyVal {
        
        @scala.inline
        def setWrite(value: () => T with js.Promise[T]): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait ObjectChain[T] extends StObject {
      
      /**
        * @description Be careful: This function overwrites the whole database.
        */
      def write(): T with js.Promise[T] = js.native
    }
    object ObjectChain {
      
      @scala.inline
      def apply[T](write: () => T with js.Promise[T]): typingsSlinky.lowdb.mod.lodashAugmentingMod.ObjectChain[T] = {
        val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
        __obj.asInstanceOf[typingsSlinky.lowdb.mod.lodashAugmentingMod.ObjectChain[T]]
      }
      
      @scala.inline
      implicit class ObjectChainMutableBuilder[Self <: typingsSlinky.lowdb.mod.lodashAugmentingMod.ObjectChain[_], T] (val x: Self with typingsSlinky.lowdb.mod.lodashAugmentingMod.ObjectChain[T]) extends AnyVal {
        
        @scala.inline
        def setWrite(value: () => T with js.Promise[T]): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait PrimitiveChain[T] extends StObject {
      
      def write(): T with js.Promise[T] = js.native
    }
    object PrimitiveChain {
      
      @scala.inline
      def apply[T](write: () => T with js.Promise[T]): PrimitiveChain[T] = {
        val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
        __obj.asInstanceOf[PrimitiveChain[T]]
      }
      
      @scala.inline
      implicit class PrimitiveChainMutableBuilder[Self <: PrimitiveChain[_], T] (val x: Self with PrimitiveChain[T]) extends AnyVal {
        
        @scala.inline
        def setWrite(value: () => T with js.Promise[T]): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait StringChain extends StObject {
      
      def write(): String with js.Promise[String] = js.native
    }
    object StringChain {
      
      @scala.inline
      def apply(write: () => String with js.Promise[String]): StringChain = {
        val __obj = js.Dynamic.literal(write = js.Any.fromFunction0(write))
        __obj.asInstanceOf[StringChain]
      }
      
      @scala.inline
      implicit class StringChainMutableBuilder[Self <: StringChain] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWrite(value: () => String with js.Promise[String]): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      }
    }
  }
  
  @js.native
  trait lowdb extends StObject {
    
    def apply[AdapterT /* <: AdapterAsync[_] */](adapter: AdapterT): js.Promise[
        LowdbAsync[
          /* import warning: importer.ImportType#apply Failed type conversion: AdapterT[lowdb.lowdb.ReferenceProperty] */ js.Any
        ]
      ] = js.native
  }
  
  @js.native
  trait lowdbFp extends StObject {
    
    def apply[AdapterT /* <: AdapterSync[_] */](adapter: AdapterT): LowdbFpSync[
        /* import warning: importer.ImportType#apply Failed type conversion: AdapterT[lowdb.lowdb.ReferenceProperty] */ js.Any
      ] = js.native
  }
}
