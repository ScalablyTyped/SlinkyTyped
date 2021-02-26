package typingsSlinky.bluebirdLst

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.bluebirdLst.anon.Cancellation
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Error
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.Map
import typingsSlinky.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bluebird-lst", JSImport.Namespace)
  @js.native
  class ^[R] protected () extends Bluebird[R] {
    /**
      * Create a new promise. The passed in function will receive functions `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      * If promise cancellation is enabled, passed in function will receive one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[/* thenableOrResult */ js.UndefOr[R | js.Thenable[R]], Unit], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
  }
  @JSImport("bluebird-lst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A collection of errors. `AggregateError` is an array-like object, with numeric indices and a `.length` property.
    *  It supports all generic array methods such as `.forEach` directly.
    *
    * `AggregateError`s are caught in `.error` handlers, even if the contained errors are not operational.
    *
    * `Promise.some` and `Promise.any` use `AggregateError` as rejection reason when they fail.
    */
  @JSImport("bluebird-lst", "AggregateError")
  @js.native
  class AggregateError ()
    extends ArrayLike[js.Error]
       with Error {
    
    def every(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
    def every(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def filter(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
    def filter(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): AggregateError = js.native
    
    def forEach(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Unit]): js.UndefOr[scala.Nothing] = js.native
    def forEach(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Unit],
      thisArg: js.Any
    ): js.UndefOr[scala.Nothing] = js.native
    
    def indexOf(searchElement: js.Error): Double = js.native
    def indexOf(searchElement: js.Error, fromIndex: Double): Double = js.native
    
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    def lastIndexOf(searchElement: js.Error): Double = js.native
    def lastIndexOf(searchElement: js.Error, fromIndex: Double): Double = js.native
    
    def map(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
    def map(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): AggregateError = js.native
    
    def pop(): js.Error = js.native
    
    def push(errors: js.Error*): Double = js.native
    
    def reduce(
      callback: js.Function4[
          /* accumulator */ js.Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ]
    ): js.Any = js.native
    def reduce(
      callback: js.Function4[
          /* accumulator */ js.Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ js.Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ]
    ): js.Any = js.native
    def reduceRight(
      callback: js.Function4[
          /* previousValue */ js.Any, 
          /* element */ js.Error, 
          /* index */ Double, 
          /* array */ this.type, 
          _
        ],
      initialValue: js.Any
    ): js.Any = js.native
    
    def reverse(): AggregateError = js.native
    
    def shift(): js.Error = js.native
    
    def slice(): AggregateError = js.native
    def slice(begin: js.UndefOr[scala.Nothing], end: Double): AggregateError = js.native
    def slice(begin: Double): AggregateError = js.native
    def slice(begin: Double, end: Double): AggregateError = js.native
    
    def some(callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
    def some(
      callback: js.Function3[/* element */ js.Error, /* index */ Double, /* array */ this.type, Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def sort(): AggregateError = js.native
    def sort(compareFunction: js.Function2[/* errLeft */ js.Error, /* errRight */ js.Error, Double]): AggregateError = js.native
    
    def unshift(errors: js.Error*): Double = js.native
  }
  
  /**
    * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
    */
  @JSImport("bluebird-lst", "CancellationError")
  @js.native
  class CancellationError () extends Error
  
  /**
    * returned by `Bluebird.disposer()`.
    */
  @JSImport("bluebird-lst", "Disposer")
  @js.native
  class Disposer[R] () extends StObject
  
  /**
    * Represents an error is an explicit promise rejection as opposed to a thrown error.
    *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
    *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
    *  the `.cause` property.
    *
    * `OperationalError`s are caught in `.error` handlers.
    */
  @JSImport("bluebird-lst", "OperationalError")
  @js.native
  class OperationalError () extends Error
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bluebird-lst", "Promise")
  @js.native
  class Promise[R] protected () extends Bluebird[R] {
    /**
      * Create a new promise. The passed in function will receive functions `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
      * If promise cancellation is enabled, passed in function will receive one more function argument `onCancel` that allows to register an optional cancellation callback.
      */
    def this(callback: js.Function3[
            /* resolve */ js.Function1[
              /* thenableOrResult */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ _])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
            /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
            Unit
          ]) = this()
  }
  /**
    * Create a new promise. The passed in function will receive functions `resolve` and `reject` as its arguments which can be called to seal the fate of the created promise.
    * If promise cancellation is enabled, passed in function will receive one more function argument `onCancel` that allows to register an optional cancellation callback.
    */
  /* static member */
  @JSImport("bluebird-lst", "Promise")
  @js.native
  def Promise: Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[
          (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
        ], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  @scala.inline
  def Promise_=(
    x: Instantiable1[
      /* callback */ js.Function3[
        /* resolve */ js.Function1[
          /* thenableOrResult */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
        /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
        Unit
      ], 
      Bluebird[js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Promise")(x.asInstanceOf[js.Any])
  
  /**
    * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
    */
  @JSImport("bluebird-lst", "TimeoutError")
  @js.native
  class TimeoutError () extends Error
  
  @JSImport("bluebird-lst", "all")
  @js.native
  def all[R](values: js.Array[js.Thenable[R] | R]): Bluebird[js.Array[R]] = js.native
  // array with values
  /* static member */
  @JSImport("bluebird-lst", "all")
  @js.native
  def all[R](values: js.Thenable[js.Array[js.Thenable[R] | R]]): Bluebird[js.Array[R]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "all")
  @js.native
  def all[T1, T2](values: js.Tuple2[js.Thenable[T1] | T1, js.Thenable[T2] | T2]): Bluebird[js.Tuple2[T1, T2]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "all")
  @js.native
  def all[T1, T2, T3](values: js.Tuple3[js.Thenable[T1] | T1, js.Thenable[T2] | T2, js.Thenable[T3] | T3]): Bluebird[js.Tuple3[T1, T2, T3]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "all")
  @js.native
  def all[T1, T2, T3, T4](
    values: js.Tuple4[js.Thenable[T1] | T1, js.Thenable[T2] | T2, js.Thenable[T3] | T3, js.Thenable[T4] | T4]
  ): Bluebird[js.Tuple4[T1, T2, T3, T4]] = js.native
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is fulfilled when all the items in the array are fulfilled. The promise's fulfillment value is an array with fulfillment values at respective positions to the original array. If any promise in the array rejects, the returned promise is rejected with the rejection reason.
    */
  // TODO enable more overloads
  // array with promises of different types
  /* static member */
  @JSImport("bluebird-lst", "all")
  @js.native
  def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      js.Thenable[T1] | T1, 
      js.Thenable[T2] | T2, 
      js.Thenable[T3] | T3, 
      js.Thenable[T4] | T4, 
      js.Thenable[T5] | T5
    ]
  ): Bluebird[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "all")
  @js.native
  def all_T1[T1](values: js.Array[js.Thenable[T1] | T1]): Bluebird[js.Array[T1]] = js.native
  
  @JSImport("bluebird-lst", "any")
  @js.native
  def any[R](values: js.Array[js.Thenable[R] | R]): Bluebird[R] = js.native
  // tslint:disable-line:unified-signatures
  /**
    * Like `Promise.some()`, with 1 as `count`. However, if the promise fulfills, the fulfillment value is not an array of 1 but the value directly.
    */
  /* static member */
  @JSImport("bluebird-lst", "any")
  @js.native
  def any[R](values: js.Thenable[js.Array[js.Thenable[R] | R]]): Bluebird[R] = js.native
  
  /* static member */
  @JSImport("bluebird-lst", "attempt")
  @js.native
  def attempt[R](fn: js.Function0[R | js.Thenable[R]]): Bluebird[R] = js.native
  
  /**
    * Sugar for `Promise.resolve(undefined).bind(thisArg);`. See `.bind()`.
    */
  /* static member */
  @JSImport("bluebird-lst", "bind")
  @js.native
  def bind(thisArg: js.Any): Bluebird[Unit] = js.native
  
  /**
    * Cast the given `value` to a trusted promise. If `value` is already a trusted `Promise`, it is returned as is. If `value` is not a thenable, a fulfilled is: Promise returned with `value` as its fulfillment value. If `value` is a thenable (Promise-like object, like those returned by jQuery's `$.ajax`), returns a trusted that: Promise assimilates the state of the thenable.
    */
  /* static member */
  @JSImport("bluebird-lst", "cast")
  @js.native
  def cast[R](value: R): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "cast")
  @js.native
  def cast[R](value: js.Thenable[R]): Bluebird[R] = js.native
  
  /**
    * Configure long stack traces, warnings, monitoring and cancellation.
    * Note that even though false is the default here, a development environment might be detected which automatically
    *  enables long stack traces and warnings.
    */
  /* static member */
  @JSImport("bluebird-lst", "config")
  @js.native
  def config(options: Cancellation): Unit = js.native
  
  /**
    * Returns a function that can use `yield` to run asynchronous code synchronously. This feature requires the support of generators which are drafted in the next version of the language. Node version greater than `0.11.2` is required and needs to be executed with the `--harmony-generators` (or `--harmony`) command-line switch.
    */
  // TODO: After https://github.com/Microsoft/TypeScript/issues/2983 is implemented, we can use
  // the return type propagation of generators to automatically infer the return type T.
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T](generatorFunction: js.Function0[IterableIterator[_]]): js.Function0[Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T](generatorFunction: js.Function0[IterableIterator[_]], options: CoroutineOptions): js.Function0[Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[_]]): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1](generatorFunction: js.Function1[/* a1 */ A1, IterableIterator[_]], options: CoroutineOptions): js.Function1[/* a1 */ A1, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2](generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]]): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2](
    generatorFunction: js.Function2[/* a1 */ A1, /* a2 */ A2, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function2[/* a1 */ A1, /* a2 */ A2, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3](generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]]): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3](
    generatorFunction: js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function3[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]]
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4](
    generatorFunction: js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function4[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]]
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5](
    generatorFunction: js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, IterableIterator[_]],
    options: CoroutineOptions
  ): js.Function5[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ]
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6](
    generatorFunction: js.Function6[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function6[/* a1 */ A1, /* a2 */ A2, /* a3 */ A3, /* a4 */ A4, /* a5 */ A5, /* a6 */ A6, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
    ]
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7](
    generatorFunction: js.Function7[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function7[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    Bluebird[T]
  ] = js.native
  /* static member */
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
    ]
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ] = js.native
  @JSImport("bluebird-lst", "coroutine")
  @js.native
  def coroutine[T, A1, A2, A3, A4, A5, A6, A7, A8](
    generatorFunction: js.Function8[
      /* a1 */ A1, 
      /* a2 */ A2, 
      /* a3 */ A3, 
      /* a4 */ A4, 
      /* a5 */ A5, 
      /* a6 */ A6, 
      /* a7 */ A7, 
      /* a8 */ A8, 
      IterableIterator[_]
    ],
    options: CoroutineOptions
  ): js.Function8[
    /* a1 */ A1, 
    /* a2 */ A2, 
    /* a3 */ A3, 
    /* a4 */ A4, 
    /* a5 */ A5, 
    /* a6 */ A6, 
    /* a7 */ A7, 
    /* a8 */ A8, 
    Bluebird[T]
  ] = js.native
  
  /**
    * Create a promise with undecided fate and return a `PromiseResolver` to control it. See resolution?: Promise(#promise-resolution).
    */
  /* static member */
  @JSImport("bluebird-lst", "defer")
  @js.native
  def defer[R](): Resolver[R] = js.native
  
  /* static member */
  @JSImport("bluebird-lst", "delay")
  @js.native
  def delay(ms: Double): Bluebird[Unit] = js.native
  /**
    * Returns a promise that will be resolved with value (or undefined) after given ms milliseconds.
    * If value is a promise, the delay will start counting down when it is fulfilled and the returned
    *  promise will be fulfilled with the fulfillment value of the value promise.
    */
  /* static member */
  @JSImport("bluebird-lst", "delay")
  @js.native
  def delay[R](ms: Double, value: R): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "delay")
  @js.native
  def delay[R](ms: Double, value: js.Thenable[R]): Bluebird[R] = js.native
  
  @JSImport("bluebird-lst", "each")
  @js.native
  def each[R, U](
    values: js.Array[js.Thenable[R] | R],
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[R]] = js.native
  /**
    * Iterate over an array, or a promise of an array, which contains promises (or a mix of promises and values) with the given iterator function with the signature (item, index, value) where item is the resolved value of a respective promise in the input array. Iteration happens serially. If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * Resolves to the original array unmodified, this method is meant to be used for side effects. If the iterator function returns a promise or a thenable, the result for the promise is awaited for before continuing with next iteration.
    */
  /* static member */
  @JSImport("bluebird-lst", "each")
  @js.native
  def each[R, U](
    values: js.Thenable[js.Array[js.Thenable[R] | R]],
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[R]] = js.native
  
  @JSImport("bluebird-lst", "filter")
  @js.native
  def filter[R](
    values: js.Array[js.Thenable[R] | R],
    filterer: js.Function3[
      /* item */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Boolean | js.Thenable[Boolean]
    ]
  ): Bluebird[js.Array[R]] = js.native
  @JSImport("bluebird-lst", "filter")
  @js.native
  def filter[R](
    values: js.Array[js.Thenable[R] | R],
    filterer: js.Function3[
      /* item */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Boolean | js.Thenable[Boolean]
    ],
    option: ConcurrencyOption
  ): Bluebird[js.Array[R]] = js.native
  /**
    * Filter an array, or a promise of an array, which contains a promises (or a mix of promises and values) with the given `filterer` function with the signature `(item, index, arrayLength)` where `item` is the resolved value of a respective promise in the input array. If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * The return values from the filtered functions are coerced to booleans, with the exception of promises and thenables which are awaited for their eventual result.
    *
    * *The original array is not modified.
    */
  /* static member */
  @JSImport("bluebird-lst", "filter")
  @js.native
  def filter[R](
    values: js.Thenable[js.Array[js.Thenable[R] | R]],
    filterer: js.Function3[
      /* item */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Boolean | js.Thenable[Boolean]
    ]
  ): Bluebird[js.Array[R]] = js.native
  @JSImport("bluebird-lst", "filter")
  @js.native
  def filter[R](
    values: js.Thenable[js.Array[js.Thenable[R] | R]],
    filterer: js.Function3[
      /* item */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      Boolean | js.Thenable[Boolean]
    ],
    option: ConcurrencyOption
  ): Bluebird[js.Array[R]] = js.native
  
  /* static member */
  @JSImport("bluebird-lst", "fromCallback")
  @js.native
  def fromCallback(
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Bluebird[_] = js.native
  @JSImport("bluebird-lst", "fromCallback")
  @js.native
  def fromCallback(
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[_] = js.native
  /* static member */
  @JSImport("bluebird-lst", "fromCallback")
  @js.native
  def fromCallback_T[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): Bluebird[T] = js.native
  @JSImport("bluebird-lst", "fromCallback")
  @js.native
  def fromCallback_T[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[T] = js.native
  
  /**
    * Returns a promise that is resolved by a node style callback function.
    */
  /* static member */
  @JSImport("bluebird-lst", "fromNode")
  @js.native
  def fromNode(
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): Bluebird[_] = js.native
  @JSImport("bluebird-lst", "fromNode")
  @js.native
  def fromNode(
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[_] = js.native
  /* static member */
  @JSImport("bluebird-lst", "fromNode")
  @js.native
  def fromNode_T[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): Bluebird[T] = js.native
  @JSImport("bluebird-lst", "fromNode")
  @js.native
  def fromNode_T[T](
    resolver: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: FromNodeOptions
  ): Bluebird[T] = js.native
  
  /**
    * Returns a new independent copy of the Bluebird library.
    *
    * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
    */
  @JSImport("bluebird-lst", "getNewLibraryCopy")
  @js.native
  def getNewLibraryCopy(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[
          (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
        ], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * See if `value` is a trusted Promise.
    */
  /* static member */
  @JSImport("bluebird-lst", "is")
  @js.native
  def is(value: js.Any): Boolean = js.native
  
  // variadic array
  /** @deprecated use .all instead */
  /* static member */
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R](values: (R | js.Thenable[R])*): Bluebird[js.Array[R]] = js.native
  /**
    * Promise.join(
    *   Promise<any>|any values...,
    *   function handler
    * ) -> Promise
    * For coordinating multiple concurrent discrete promises.
    *
    * Note: In 1.x and 0.x Promise.join used to be a Promise.all that took the values in as arguments instead in an array. This behavior has been deprecated but is still supported partially - when the last argument is an immediate function value the new semantics will apply
    */
  /* static member */
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1](arg1: A1, handler: js.Function1[/* arg1 */ A1, R | js.Thenable[R]]): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1](arg1: js.Thenable[A1], handler: js.Function1[/* arg1 */ A1, R | js.Thenable[R]]): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2](arg1: A1, arg2: A2, handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, R | js.Thenable[R]]): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2](
    arg1: A1,
    arg2: js.Thenable[A2],
    handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2](
    arg1: js.Thenable[A1],
    arg2: A2,
    handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    handler: js.Function2[/* arg1 */ A1, /* arg2 */ A2, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    handler: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: A4,
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    handler: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]
  ): Bluebird[R] = js.native
  /* static member */
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: A1,
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: A2,
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: A3,
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: A4,
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: A5,
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "join")
  @js.native
  def join[R, A1, A2, A3, A4, A5](
    arg1: js.Thenable[A1],
    arg2: js.Thenable[A2],
    arg3: js.Thenable[A3],
    arg4: js.Thenable[A4],
    arg5: js.Thenable[A5],
    handler: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): Bluebird[R] = js.native
  
  /**
    * Call this right after the library is loaded to enabled long stack traces. Long stack traces cannot be disabled after being enabled, and cannot be enabled after promises have already been created. Long stack traces imply a substantial performance penalty, around 4-5x for throughput and 0.5x for latency.
    */
  /* static member */
  @JSImport("bluebird-lst", "longStackTraces")
  @js.native
  def longStackTraces(): Unit = js.native
  
  @JSImport("bluebird-lst", "map")
  @js.native
  def map[R, U](
    values: js.Array[js.Thenable[R] | R],
    mapper: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  @JSImport("bluebird-lst", "map")
  @js.native
  def map[R, U](
    values: js.Array[js.Thenable[R] | R],
    mapper: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  @JSImport("bluebird-lst", "map")
  @js.native
  def map[R, U](
    values: js.Iterable[js.Thenable[R] | R],
    mapper: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  @JSImport("bluebird-lst", "map")
  @js.native
  def map[R, U](
    values: js.Iterable[js.Thenable[R] | R],
    mapper: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  /**
    * Map an array, or a promise of an array, which contains a promises (or a mix of promises and values) with the given `mapper` function with the signature `(item, index, arrayLength)` where `item` is the resolved value of a respective promise in the input array. If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * If the `mapper` function returns promises or thenables, the returned promise will wait for all the mapped results to be resolved as well.
    *
    * *The original array is not modified.*
    */
  /* static member */
  @JSImport("bluebird-lst", "map")
  @js.native
  def map[R, U](
    values: js.Thenable[(js.Array[js.Thenable[R] | R]) | (js.Iterable[js.Thenable[R] | R])],
    mapper: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  @JSImport("bluebird-lst", "map")
  @js.native
  def map[R, U](
    values: js.Thenable[(js.Array[js.Thenable[R] | R]) | (js.Iterable[js.Thenable[R] | R])],
    mapper: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]],
    options: ConcurrencyOption
  ): Bluebird[js.Array[U]] = js.native
  
  @JSImport("bluebird-lst", "mapSeries")
  @js.native
  def mapSeries[R, U](
    values: js.Array[js.Thenable[R] | R],
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  @JSImport("bluebird-lst", "mapSeries")
  @js.native
  def mapSeries[R, U](
    values: js.Iterable[js.Thenable[R] | R],
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  /**
    * Given an Iterable(arrays are Iterable), or a promise of an Iterable, which produces promises (or a mix of promises and values), iterate over all the values in the Iterable into an array and iterate over the array serially, in-order.
    *
    * Returns a promise for an array that contains the values returned by the iterator function in their respective positions. The iterator won't be called for an item until its previous item, and the promise returned by the iterator for that item are fulfilled. This results in a mapSeries kind of utility but it can also be used simply as a side effect iterator similar to Array#forEach.
    *
    * If any promise in the input array is rejected or any promise returned by the iterator function is rejected, the result will be rejected as well.
    */
  /* static member */
  @JSImport("bluebird-lst", "mapSeries")
  @js.native
  def mapSeries[R, U](
    values: js.Thenable[(js.Array[js.Thenable[R] | R]) | (js.Iterable[js.Thenable[R] | R])],
    iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
  ): Bluebird[js.Array[U]] = js.native
  
  /* static member */
  @JSImport("bluebird-lst", "method")
  @js.native
  def method[R](fn: js.Function1[/* repeated */ js.Any, R | js.Thenable[R]]): js.Function1[/* repeated */ js.Any, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "method")
  @js.native
  def method[R, A1, A2](fn: js.Function2[/* arg1 */ A1, /* arg2 */ A2, R | js.Thenable[R]]): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "method")
  @js.native
  def method[R, A1, A2, A3](fn: js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, R | js.Thenable[R]]): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "method")
  @js.native
  def method[R, A1, A2, A3, A4](fn: js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, R | js.Thenable[R]]): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[R]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "method")
  @js.native
  def method[R, A1, A2, A3, A4, A5](
    fn: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      R | js.Thenable[R]
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[R]] = js.native
  /**
    * Returns a new function that wraps the given function `fn`. The new function will always return a promise that is fulfilled with the original functions return values or rejected with thrown exceptions from the original function.
    * This method is convenient when a function can sometimes return synchronously or throw synchronously.
    */
  /* static member */
  @JSImport("bluebird-lst", "method")
  @js.native
  def method_RA1[R, A1](fn: js.Function1[/* arg1 */ A1, R | js.Thenable[R]]): js.Function1[/* arg1 */ A1, Bluebird[R]] = js.native
  
  /**
    * This is relevant to browser environments with no module loader.
    *
    * Release control of the Promise namespace to whatever it was before this library was loaded. Returns a reference to the library namespace so you can attach it to something else.
    */
  @JSImport("bluebird-lst", "noConflict")
  @js.native
  def noConflict(): Instantiable1[
    /* callback */ js.Function3[
      /* resolve */ js.Function1[
        /* thenableOrResult */ js.UndefOr[
          (/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam R */ js.Any])
        ], 
        Unit
      ], 
      /* reject */ js.Function1[/* error */ js.UndefOr[js.Any], Unit], 
      /* onCancel */ js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]], 
      Unit
    ], 
    Bluebird[js.Object]
  ] = js.native
  
  /**
    * Add handler as the handler to call when there is a possibly unhandled rejection.
    * The default handler logs the error stack to stderr or console.error in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    *
    * Note: this hook is specific to the bluebird instance its called on, application developers should use global rejection events.
    */
  /* static member */
  @JSImport("bluebird-lst", "onPossiblyUnhandledRejection")
  @js.native
  def onPossiblyUnhandledRejection(): Unit = js.native
  /**
    * Add `handler` as the handler to call when there is a possibly unhandled rejection. The default handler logs the error stack to stderr or `console.error` in browsers.
    *
    * Passing no value or a non-function will have the effect of removing any kind of handling for possibly unhandled rejections.
    */
  /* static member */
  @JSImport("bluebird-lst", "onPossiblyUnhandledRejection")
  @js.native
  def onPossiblyUnhandledRejection(handler: js.Function1[/* reason */ js.Any, _]): Unit = js.native
  @JSImport("bluebird-lst", "onPossiblyUnhandledRejection")
  @js.native
  def onPossiblyUnhandledRejection(handler: js.Function2[/* error */ js.Error, /* promise */ Bluebird[_], Unit]): Unit = js.native
  
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Bluebird[_]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify(nodeFunction: js.Function1[/* repeated */ js.Any, Unit], options: PromisifyOptions): js.Function1[/* repeated */ js.Any, Bluebird[_]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1](
    func: js.Function2[
      /* arg1 */ A1, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function1[/* arg1 */ A1, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2](
    func: js.Function3[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function2[/* arg1 */ A1, /* arg2 */ A2, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2, A3](
    func: js.Function4[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function3[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4](
    func: js.Function5[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function4[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, Bluebird[T]] = js.native
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify[T, A1, A2, A3, A4, A5](
    func: js.Function6[
      /* arg1 */ A1, 
      /* arg2 */ A2, 
      /* arg3 */ A3, 
      /* arg4 */ A4, 
      /* arg5 */ A5, 
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function5[/* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* arg4 */ A4, /* arg5 */ A5, Bluebird[T]] = js.native
  
  /**
    * Promisifies the entire object by going through the object's properties and creating an async equivalent of each function on the object and its prototype chain. The promisified method name will be the original method name postfixed with `Async`. Returns the input object.
    *
    * Note that the original methods on the object are not overwritten but new methods are created with the `Async`-postfix. For example, if you `promisifyAll()` the node.js `fs` object use `fs.statAsync()` to call the promisified `stat` method.
    */
  // TODO how to model promisifyAll?
  /* static member */
  @JSImport("bluebird-lst", "promisifyAll")
  @js.native
  def promisifyAll(target: js.Object): js.Object = js.native
  @JSImport("bluebird-lst", "promisifyAll")
  @js.native
  def promisifyAll(target: js.Object, options: PromisifyAllOptions): js.Object = js.native
  
  /**
    * Returns a function that will wrap the given `nodeFunction`. Instead of taking a callback, the returned function will return a promise whose fate is decided by the callback behavior of the given node function. The node function should conform to node.js convention of accepting a callback as last argument and calling that callback with error as the first argument and success value on the second argument.
    *
    * If the `nodeFunction` calls its callback with multiple success values, the fulfillment value will be an array of them.
    *
    * If you pass a `receiver`, the `nodeFunction` will be called as a method on the `receiver`.
    */
  /* static member */
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify_T_Function0[T](
    func: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ]
  ): js.Function0[Bluebird[T]] = js.native
  @JSImport("bluebird-lst", "promisify")
  @js.native
  def promisify_T_Function0[T](
    func: js.Function1[
      /* callback */ js.Function2[/* err */ js.Any, /* result */ js.UndefOr[T], Unit], 
      Unit
    ],
    options: PromisifyOptions
  ): js.Function0[Bluebird[T]] = js.native
  
  // trusted promise for object
  /* static member */
  @JSImport("bluebird-lst", "props")
  @js.native
  def props[T](`object`: js.Thenable[ResolvableProps[T]]): Bluebird[T] = js.native
  // tslint:disable-line:unified-signatures
  // object
  /* static member */
  @JSImport("bluebird-lst", "props")
  @js.native
  def props[T](`object`: ResolvableProps[T]): Bluebird[T] = js.native
  // tslint:disable-line:unified-signatures
  // map
  /* static member */
  @JSImport("bluebird-lst", "props")
  @js.native
  def props[K, V](map: Map[K, js.Thenable[V] | V]): Bluebird[Map[K, V]] = js.native
  /**
    * Like ``Promise.all`` but for object properties instead of array items. Returns a promise that is fulfilled when all the properties of the object are fulfilled. The promise's fulfillment value is an object with fulfillment values at respective keys to the original object. If any promise in the object rejects, the returned promise is rejected with the rejection reason.
    *
    * If `object` is a trusted `Promise`, then it will be treated as a promise for object rather than for its properties. All other objects are treated for their properties as is returned by `Object.keys` - the object's own enumerable properties.
    *
    * *The original object is not modified.*
    */
  // trusted promise for map
  /* static member */
  @JSImport("bluebird-lst", "props")
  @js.native
  def props_KV[K, V](map: js.Thenable[Map[K, js.Thenable[V] | V]]): Bluebird[Map[K, V]] = js.native
  
  @JSImport("bluebird-lst", "race")
  @js.native
  def race[R](values: js.Array[js.Thenable[R] | R]): Bluebird[R] = js.native
  /**
    * Given an array, or a promise of an array, which contains promises (or a mix of promises and values) return a promise that is fulfilled or rejected as soon as a promise in the array is fulfilled or rejected with the respective rejection reason or fulfillment value.
    *
    * **Note** If you pass empty array or a sparse array with no values, or a promise/thenable for such, it will be forever pending.
    */
  /* static member */
  @JSImport("bluebird-lst", "race")
  @js.native
  def race[R](values: js.Thenable[js.Array[js.Thenable[R] | R]]): Bluebird[R] = js.native
  
  @JSImport("bluebird-lst", "reduce")
  @js.native
  def reduce[R, U](
    values: js.Array[js.Thenable[R] | R],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ]
  ): Bluebird[U] = js.native
  @JSImport("bluebird-lst", "reduce")
  @js.native
  def reduce[R, U](
    values: js.Array[js.Thenable[R] | R],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ],
    initialValue: U
  ): Bluebird[U] = js.native
  /**
    * Reduce an array, or a promise of an array, which contains a promises (or a mix of promises and values) with the given `reducer` function with the signature `(total, current, index, arrayLength)` where `item` is the resolved value of a respective promise in the input array. If any promise in the input array is rejected the returned promise is rejected as well.
    *
    * If the reducer function returns a promise or a thenable, the result for the promise is awaited for before continuing with next iteration.
    *
    * *The original array is not modified. If no `intialValue` is given and the array doesn't contain at least 2 items, the callback will not be called and `undefined` is returned. If `initialValue` is given and the array doesn't have at least 1 item, `initialValue` is returned.*
    */
  /* static member */
  @JSImport("bluebird-lst", "reduce")
  @js.native
  def reduce[R, U](
    values: js.Thenable[js.Array[js.Thenable[R] | R]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ]
  ): Bluebird[U] = js.native
  @JSImport("bluebird-lst", "reduce")
  @js.native
  def reduce[R, U](
    values: js.Thenable[js.Array[js.Thenable[R] | R]],
    reducer: js.Function4[
      /* total */ U, 
      /* current */ R, 
      /* index */ Double, 
      /* arrayLength */ Double, 
      U | js.Thenable[U]
    ],
    initialValue: U
  ): Bluebird[U] = js.native
  
  /**
    * Create a promise that is rejected with the given `reason`.
    */
  /* static member */
  @JSImport("bluebird-lst", "reject")
  @js.native
  def reject(reason: js.Any): Bluebird[_] = js.native
  /* static member */
  @JSImport("bluebird-lst", "reject")
  @js.native
  def reject_R[R](reason: js.Any): Bluebird[R] = js.native
  
  /**
    * Create a promise that is resolved with the given `value`. If `value` is a thenable or promise, the returned promise will assume its state.
    */
  /* static member */
  @JSImport("bluebird-lst", "resolve")
  @js.native
  def resolve(): Bluebird[Unit] = js.native
  /* static member */
  @JSImport("bluebird-lst", "resolve")
  @js.native
  def resolve[R](value: R): Bluebird[R] = js.native
  @JSImport("bluebird-lst", "resolve")
  @js.native
  def resolve[R](value: js.Thenable[R]): Bluebird[R] = js.native
  
  /**
    * Changes how bluebird schedules calls a-synchronously.
    *
    * @param scheduler Should be a function that asynchronously schedules
    *                  the calling of the passed in function
    */
  @JSImport("bluebird-lst", "setScheduler")
  @js.native
  def setScheduler(scheduler: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit]): Unit = js.native
  
  @JSImport("bluebird-lst", "some")
  @js.native
  def some[R](values: js.Array[js.Thenable[R] | R], count: Double): Bluebird[js.Array[R]] = js.native
  /**
    * Initiate a competetive race between multiple promises or values (values will become immediately fulfilled promises). When `count` amount of promises have been fulfilled, the returned promise is fulfilled with an array that contains the fulfillment values of the winners in order of resolution.
    *
    * If too many promises are rejected so that the promise can never become fulfilled, it will be immediately rejected with an array of rejection reasons in the order they were thrown in.
    *
    * *The original array is not modified.*
    */
  /* static member */
  @JSImport("bluebird-lst", "some")
  @js.native
  def some[R](values: js.Thenable[js.Array[js.Thenable[R] | R]], count: Double): Bluebird[js.Array[R]] = js.native
  
  /**
    * In conjunction with `.disposer`, using will make sure that no matter what, the specified disposer
    *  will be called when the promise returned by the callback passed to using has settled. The disposer is
    *  necessary because there is no standard interface in node for disposing resources.
    */
  /* static member */
  @JSImport("bluebird-lst", "using")
  @js.native
  def using[R, T](disposer: Disposer[R], executor: js.Function1[/* transaction */ R, js.Thenable[T]]): Bluebird[T] = js.native
  /* static member */
  @JSImport("bluebird-lst", "using")
  @js.native
  def using[R1, R2, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    executor: js.Function2[/* transaction1 */ R1, /* transaction2 */ R2, js.Thenable[T]]
  ): Bluebird[T] = js.native
  /* static member */
  @JSImport("bluebird-lst", "using")
  @js.native
  def using[R1, R2, R3, T](
    disposer: Disposer[R1],
    disposer2: Disposer[R2],
    disposer3: Disposer[R3],
    executor: js.Function3[/* transaction1 */ R1, /* transaction2 */ R2, /* transaction3 */ R3, js.Thenable[T]]
  ): Bluebird[T] = js.native
  
  /**
    * The version number of the library
    */
  /* static member */
  @JSImport("bluebird-lst", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Bluebird[R]
    extends PromiseLike[R]
       with Inspection[R] {
    
    /**
      * Same as calling `Promise.all(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def all[U](): Bluebird[js.Array[U]] = js.native
    
    /**
      * Same as calling `Promise.any(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def any[U](): Bluebird[U] = js.native
    
    def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
    def asCallback(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
    def asCallback(sink: js.Any*): this.type = js.native
    
    /**
      * Create a promise that follows this promise, but is bound to the given `thisArg` value. A bound promise will call its handlers with the bound value set to `this`. Additionally promises derived from a bound promise will also be bound promises with the same `thisArg` binding as the original promise.
      */
    def bind(thisArg: js.Any): Bluebird[R] = js.native
    
    /**
      * This is a convenience method for doing:
      *
      * <code>
      * promise.then(function(obj){
      *     return obj[propertyName].call(obj, arg...);
      * });
      * </code>
      */
    def call(propertyName: String, args: js.Any*): Bluebird[_] = js.native
    
    /**
      * Cancel this `promise`. Will not do anything if this promise is already settled or if the cancellation feature has not been enabled
      */
    def cancel(): Unit = js.native
    
    /**
      * This is a catch-all exception handler, shortcut for calling `.then(null, handler)` on this promise. Any exception happening in a `.then`-chain will propagate to nearest `.catch` handler.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      */
    def `catch`(): Bluebird[R] = js.native
    def `catch`(onReject: js.Function1[/* error */ js.Any, R | (js.Thenable[R | Unit]) | Unit]): Bluebird[R] = js.native
    def `catch`[E1](
      filter1: E1 with js.Object,
      onReject: js.Function1[/* error */ E1, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1](
      filter1: js.Function1[/* error */ E1, Boolean],
      onReject: js.Function1[/* error */ E1, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      onReject: js.Function1[/* error */ E1, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def `catch`[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    /**
      * This extends `.catch` to work more like catch-clauses in languages like Java or C#. Instead of manually checking `instanceof` or `.name === "SomeError"`, you may specify a number of error constructors which are eligible for this catch handler. The catch handler that is first met that has eligible constructors specified, is the one that will be called.
      *
      * This method also supports predicate-based filters. If you pass a predicate function instead of an error constructor, the predicate will receive the error as an argument. The return result of the predicate will be used determine whether the error handler should be called.
      *
      * Alias `.caught();` for compatibility with earlier ECMAScript version.
      *
      * TODO: disallow non-objects
      */
    def `catch`[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    
    /**
      * Convenience method for:
      *
      * <code>
      * .catch(function() {
      *    return value;
      * });
      * </code>
      *
      * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.catchReturn()`
      * TODO: disallow non-objects
      */
    def catchReturn[U](value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */](filter1: js.Function1[/* error */ js.Any, Boolean], value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */](filter1: js.Object, value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */](filter1: Instantiable1[/* args (repeated) */ js.Any, E1], value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Function1[/* error */ js.Any, Boolean], filter2: js.Object, value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Object, filter2: js.Function1[/* error */ js.Any, Boolean], value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Object, filter2: js.Object, value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Object, filter2: Instantiable1[/* args (repeated) */ js.Any, E2], value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: Instantiable1[/* args (repeated) */ js.Any, E1], filter2: js.Object, value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](filter1: js.Object, filter2: js.Object, filter3: js.Object, value: U): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      value: U
    ): Bluebird[U] = js.native
    def catchReturn[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter5: (Instantiable1[/* args (repeated) */ js.Any, E5]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      value: U
    ): Bluebird[U] = js.native
    
    /**
      * Convenience method for:
      *
      * <code>
      * .catch(function() {
      *    throw reason;
      * });
      * </code>
      * Same limitations apply as with `.catchReturn()`.
      * TODO: disallow non-objects
      */
    def catchThrow(reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */](filter1: js.Function1[/* error */ js.Any, Boolean], reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */](filter1: js.Object, reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */](filter1: Instantiable1[/* args (repeated) */ js.Any, E1], reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Function1[/* error */ js.Any, Boolean], filter2: js.Object, reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Object, filter2: js.Function1[/* error */ js.Any, Boolean], reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Object, filter2: js.Object, reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: js.Object, filter2: Instantiable1[/* args (repeated) */ js.Any, E2], reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](filter1: Instantiable1[/* args (repeated) */ js.Any, E1], filter2: js.Object, reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](filter1: js.Object, filter2: js.Object, filter3: js.Object, reason: js.Error): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    def catchThrow[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter5: (Instantiable1[/* args (repeated) */ js.Any, E5]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      reason: js.Error
    ): Bluebird[R] = js.native
    
    @JSName("catch")
    def catch_U[U](): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_U[U](onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1[U, E1](filter1: E1 with js.Object, onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1[U, E1](
      filter1: js.Function1[/* error */ E1, Boolean],
      onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2[U, E1, E2](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2[U, E1, E2](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2[U, E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2[U, E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1_Error[U, E1 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1_ErrorE2_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1_ErrorE2_ErrorE3_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1_ErrorE2_ErrorE3_ErrorE4_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("catch")
    def catch_UE1_ErrorE2_ErrorE3_ErrorE4_ErrorE5_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | (js.Thenable[U | Unit]) | Unit]
    ): Bluebird[U | R] = js.native
    
    def caught(): Bluebird[R] = js.native
    def caught(onReject: js.Function1[/* error */ js.Any, R | (js.Thenable[R | Unit]) | Unit]): Bluebird[R] = js.native
    def caught[E1](
      filter1: E1 with js.Object,
      onReject: js.Function1[/* error */ E1, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1](
      filter1: js.Function1[/* error */ E1, Boolean],
      onReject: js.Function1[/* error */ E1, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      onReject: js.Function1[/* error */ E1, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    def caught[E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, R | (js.Thenable[R | Unit]) | Unit]
    ): Bluebird[R] = js.native
    @JSName("caught")
    def caught_U[U](): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_U[U](onReject: js.Function1[/* error */ js.Any, U | js.Thenable[U]]): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1[U, E1](filter1: E1 with js.Object, onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1[U, E1](
      filter1: js.Function1[/* error */ E1, Boolean],
      onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2[U, E1, E2](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2[U, E1, E2](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2[U, E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2[U, E1, E2](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3[U, E1, E2, E3](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4[U, E1, E2, E3, E4](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: E1 with js.Object,
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: E2 with js.Object,
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: E3 with js.Object,
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: E4 with js.Object,
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: E5 with js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1E2E3E4E5[U, E1, E2, E3, E4, E5](
      filter1: js.Function1[/* error */ E1, Boolean],
      filter2: js.Function1[/* error */ E2, Boolean],
      filter3: js.Function1[/* error */ E3, Boolean],
      filter4: js.Function1[/* error */ E4, Boolean],
      filter5: js.Function1[/* error */ E5, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1_Error[U, E1 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1_ErrorE2_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1_ErrorE2_ErrorE3_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1_ErrorE2_ErrorE3_ErrorE4_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    @JSName("caught")
    def caught_UE1_ErrorE2_ErrorE3_ErrorE4_ErrorE5_Error[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      filter4: Instantiable1[/* args (repeated) */ js.Any, E4],
      filter5: Instantiable1[/* args (repeated) */ js.Any, E5],
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[U | R] = js.native
    
    /**
      * Same as calling `Promise.delay(ms, this)`.
      */
    def delay(ms: Double): Bluebird[R] = js.native
    
    /**
      * A meta method used to specify the disposer method that cleans up a resource when using `Promise.using`.
      *
      * Returns a Disposer object which encapsulates both the resource as well as the method to clean it up.
      *  The user can pass this object to `Promise.using` to get access to the resource when it becomes available,
      *  as well as to ensure its automatically cleaned up.
      *
      * The second argument passed to a disposer is the result promise of the using block, which you can
      *  inspect synchronously.
      */
    def disposer(disposeFn: js.Function2[/* arg */ R, /* promise */ Bluebird[R], Unit | js.Thenable[Unit]]): Disposer[R] = js.native
    
    /**
      * Like `.then()`, but any unhandled rejection that ends up here will be thrown as an error.
      */
    def done[U](): Unit = js.native
    def done[U](
      onFulfilled: js.UndefOr[scala.Nothing],
      onRejected: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
    ): Unit = js.native
    def done[U](onFulfilled: js.Function1[/* value */ R, U | js.Thenable[U]]): Unit = js.native
    def done[U](
      onFulfilled: js.Function1[/* value */ R, U | js.Thenable[U]],
      onRejected: js.Function1[/* error */ js.Any, U | js.Thenable[U]]
    ): Unit = js.native
    
    /**
      * Same as calling ``Bluebird.each(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def each[R, U](
      iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
    ): Bluebird[js.Array[R]] = js.native
    
    /**
      * Like `.catch` but instead of catching all types of exceptions, it only catches those that don't originate from thrown errors but rather from explicit rejections.
      */
    def error[U](onReject: js.Function1[/* reason */ js.Any, U | js.Thenable[U]]): Bluebird[U] = js.native
    
    /**
      * Same as calling ``Promise.filter(thisPromise, filterer)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def filter[U](
      filterer: js.Function3[
          /* item */ U, 
          /* index */ Double, 
          /* arrayLength */ Double, 
          Boolean | js.Thenable[Boolean]
        ]
    ): Bluebird[js.Array[U]] = js.native
    def filter[U](
      filterer: js.Function3[
          /* item */ U, 
          /* index */ Double, 
          /* arrayLength */ Double, 
          Boolean | js.Thenable[Boolean]
        ],
      options: ConcurrencyOption
    ): Bluebird[js.Array[U]] = js.native
    
    /**
      * Pass a handler that will be called regardless of this promise's fate. Returns a new promise chained from this promise. There are special semantics for `.finally()` in that the final value cannot be modified from the handler.
      *
      * Alias `.lastly();` for compatibility with earlier ECMAScript version.
      */
    def `finally`[U](handler: js.Function0[U | js.Thenable[U]]): Bluebird[R] = js.native
    
    /**
      * This is a convenience method for doing:
      *
      * <code>
      * promise.then(function(obj){
      *     return obj[propertyName];
      * });
      * </code>
      */
    // TODO: Use "type property type" once it's there
    // @see https://github.com/Microsoft/TypeScript/issues/1295
    def get[U](key: String): Bluebird[U] = js.native
    def get[U](key: Double): Bluebird[U] = js.native
    
    /**
      * See if this `promise` is resolved -> either fulfilled or rejected.
      */
    def isResolved(): Boolean = js.native
    
    def lastly[U](handler: js.Function0[U | js.Thenable[U]]): Bluebird[R] = js.native
    
    /**
      * Same as calling `Bluebird.map(thisPromise, mapper)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def map[Q, U](
      mapper: js.Function3[/* item */ Q, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
    ): Bluebird[js.Array[U]] = js.native
    def map[Q, U](
      mapper: js.Function3[/* item */ Q, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]],
      options: ConcurrencyOption
    ): Bluebird[js.Array[U]] = js.native
    
    /**
      * Same as calling ``Bluebird.mapSeries(thisPromise, iterator)``. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    def mapSeries[R, U](
      iterator: js.Function3[/* item */ R, /* index */ Double, /* arrayLength */ Double, U | js.Thenable[U]]
    ): Bluebird[js.Array[U]] = js.native
    
    /**
      * Register a node-style callback on this promise. When this promise is is either fulfilled or rejected, the node callback will be called back with the node.js convention where error reason is the first argument and success value is the second argument. The error argument will be `null` in case of success.
      * If the `callback` argument is not a function, this method does not do anything.
      */
    def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit]): this.type = js.native
    def nodeify(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[R], Unit], options: SpreadOption): this.type = js.native
    def nodeify(sink: js.Any*): this.type = js.native
    
    def props[T](): Bluebird[T] = js.native
    /**
      * Same as calling `Promise.props(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    @JSName("props")
    def props_KV[K, V](): Bluebird[Map[K, V]] = js.native
    
    /**
      * Same as calling `Promise.race(thisPromise, count)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def race[U](): Bluebird[U] = js.native
    
    /**
      * Same as calling `Promise.reduce(thisPromise, Function reducer, initialValue)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def reduce[Q, U](
      reducer: js.Function4[
          /* memo */ U, 
          /* item */ Q, 
          /* index */ Double, 
          /* arrayLength */ Double, 
          U | js.Thenable[U]
        ]
    ): Bluebird[U] = js.native
    def reduce[Q, U](
      reducer: js.Function4[
          /* memo */ U, 
          /* item */ Q, 
          /* index */ Double, 
          /* arrayLength */ Double, 
          U | js.Thenable[U]
        ],
      initialValue: U
    ): Bluebird[U] = js.native
    
    /**
      * Synchronously inspect the state of this `promise`. The `PromiseInspection` will represent the state of
      * the promise as snapshotted at the time of calling `.reflect()`.
      */
    def reflect(): Bluebird[Inspection[R]] = js.native
    
    /**
      * Convenience method for:
      *
      * <code>
      * .then(function() {
      *    return value;
      * });
      * </code>
      *
      * in the case where `value` doesn't change its value. That means `value` is bound at the time of calling `.return()`
      *
      * Alias `.thenReturn();` for compatibility with earlier ECMAScript version.
      */
    def `return`(): Bluebird[Unit] = js.native
    def `return`[U](value: U): Bluebird[U] = js.native
    
    /**
      * Same as calling `Promise.some(thisPromise)`. With the exception that if this promise is bound to a value, the returned promise is bound to that value too.
      */
    // TODO type inference from array-resolving promise?
    def some[U](count: Double): Bluebird[js.Array[U]] = js.native
    
    def spread[U](fulfilledHandler: js.Function1[/* repeated */ js.Any, U | js.Thenable[U]]): Bluebird[U] = js.native
    /**
      * Like calling `.then`, but the fulfillment value or rejection reason is assumed to be an array, which is flattened to the formal parameters of the handlers.
      */
    @JSName("spread")
    def spread_UW[U, W](fulfilledHandler: js.Function1[/* repeated */ W, U | js.Thenable[U]]): Bluebird[U] = js.native
    
    /**
      * Basically sugar for doing: somePromise.catch(function(){});
      *
      * Which is needed in case error handlers are attached asynchronously to the promise later, which would otherwise result in premature unhandled rejection reporting.
      */
    def suppressUnhandledRejections(): Unit = js.native
    
    /**
      * Like `.finally()`, but not called for rejections.
      */
    def tap[U](onFulFill: js.Function1[/* value */ R, js.Thenable[U] | U]): Bluebird[R] = js.native
    
    /**
      * Like `.catch()` but rethrows the error
      * TODO: disallow non-objects
      */
    def tapCatch[U](onReject: js.Function1[/* error */ js.UndefOr[js.Any], U | js.Thenable[U]]): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */](filter1: js.Object, onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      onReject: js.Function1[/* error */ E1, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      onReject: js.Function1[/* error */ E1 | E2, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Function1[/* error */ js.Any, Boolean],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: js.Object,
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Function1[/* error */ js.Any, Boolean],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: js.Object,
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Function1[/* error */ js.Any, Boolean],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */](
      filter1: Instantiable1[/* args (repeated) */ js.Any, E1],
      filter2: Instantiable1[/* args (repeated) */ js.Any, E2],
      filter3: Instantiable1[/* args (repeated) */ js.Any, E3],
      onReject: js.Function1[/* error */ E1 | E2 | E3, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */](
      filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    def tapCatch[U, E1 /* <: js.Error */, E2 /* <: js.Error */, E3 /* <: js.Error */, E4 /* <: js.Error */, E5 /* <: js.Error */](
      filter1: (Instantiable1[/* args (repeated) */ js.Any, E1]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter2: (Instantiable1[/* args (repeated) */ js.Any, E2]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter3: (Instantiable1[/* args (repeated) */ js.Any, E3]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter4: (Instantiable1[/* args (repeated) */ js.Any, E4]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      filter5: (Instantiable1[/* args (repeated) */ js.Any, E5]) | (js.Function1[/* error */ js.Any, Boolean]) | js.Object,
      onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, U | js.Thenable[U]]
    ): Bluebird[R] = js.native
    
    def thenReturn(): Bluebird[Unit] = js.native
    def thenReturn[U](value: U): Bluebird[U] = js.native
    
    def thenThrow(reason: js.Error): Bluebird[R] = js.native
    
    // For simpler signature help.
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](onfulfilled: js.Function1[/* value */ R, TResult1 | js.Thenable[TResult1]]): Bluebird[TResult1 | TResult2] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ R, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): Bluebird[TResult1 | TResult2] = js.native
    
    /**
      * Convenience method for:
      *
      * <code>
      * .then(function() {
      *    throw reason;
      * });
      * </code>
      * Same limitations apply as with `.return()`.
      *
      * Alias `.thenThrow();` for compatibility with earlier ECMAScript version.
      */
    def `throw`(reason: js.Error): Bluebird[R] = js.native
    
    /**
      * Returns a promise that will be fulfilled with this promise's fulfillment value or rejection reason.
      *  However, if this promise is not fulfilled or rejected within ms milliseconds, the returned promise
      *  is rejected with a TimeoutError or the error as the reason.
      *
      * You may specify a custom error message with the `message` parameter.
      */
    def timeout(ms: Double): Bluebird[R] = js.native
    def timeout(ms: Double, message: String): Bluebird[R] = js.native
    def timeout(ms: Double, message: js.Error): Bluebird[R] = js.native
    
    /**
      * This is implicitly called by `JSON.stringify` when serializing the object. Returns a serialized representation of the `Promise`.
      */
    def toJSON(): js.Object = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Any = js.native
  }
  
  @js.native
  trait ConcurrencyOption extends StObject {
    
    var concurrency: Double = js.native
  }
  object ConcurrencyOption {
    
    @scala.inline
    def apply(concurrency: Double): ConcurrencyOption = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcurrencyOption]
    }
    
    @scala.inline
    implicit class ConcurrencyOptionMutableBuilder[Self <: ConcurrencyOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CoroutineOptions extends StObject {
    
    def yieldHandler(value: js.Any): js.Any = js.native
  }
  object CoroutineOptions {
    
    @scala.inline
    def apply(yieldHandler: js.Any => js.Any): CoroutineOptions = {
      val __obj = js.Dynamic.literal(yieldHandler = js.Any.fromFunction1(yieldHandler))
      __obj.asInstanceOf[CoroutineOptions]
    }
    
    @scala.inline
    implicit class CoroutineOptionsMutableBuilder[Self <: CoroutineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setYieldHandler(value: js.Any => js.Any): Self = StObject.set(x, "yieldHandler", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FromNodeOptions extends StObject {
    
    var multiArgs: js.UndefOr[Boolean] = js.native
  }
  object FromNodeOptions {
    
    @scala.inline
    def apply(): FromNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromNodeOptions]
    }
    
    @scala.inline
    implicit class FromNodeOptionsMutableBuilder[Self <: FromNodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
    }
  }
  
  @js.native
  trait Inspection[R] extends StObject {
    
    /**
      * See if the underlying promise was cancelled at the creation time of this inspection object.
      */
    def isCancelled(): Boolean = js.native
    
    /**
      * See if the underlying promise was fulfilled at the creation time of this inspection object.
      */
    def isFulfilled(): Boolean = js.native
    
    /**
      * See if the underlying promise was defer at the creation time of this inspection object.
      */
    def isPending(): Boolean = js.native
    
    /**
      * See if the underlying promise was rejected at the creation time of this inspection object.
      */
    def isRejected(): Boolean = js.native
    
    /**
      * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    def reason(): js.Any = js.native
    
    /**
      * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
      *
      * throws `TypeError`
      */
    def value(): R = js.native
  }
  object Inspection {
    
    @scala.inline
    def apply[R](
      isCancelled: () => Boolean,
      isFulfilled: () => Boolean,
      isPending: () => Boolean,
      isRejected: () => Boolean,
      reason: () => js.Any,
      value: () => R
    ): Inspection[R] = {
      val __obj = js.Dynamic.literal(isCancelled = js.Any.fromFunction0(isCancelled), isFulfilled = js.Any.fromFunction0(isFulfilled), isPending = js.Any.fromFunction0(isPending), isRejected = js.Any.fromFunction0(isRejected), reason = js.Any.fromFunction0(reason), value = js.Any.fromFunction0(value))
      __obj.asInstanceOf[Inspection[R]]
    }
    
    @scala.inline
    implicit class InspectionMutableBuilder[Self <: Inspection[_], R] (val x: Self with Inspection[R]) extends AnyVal {
      
      @scala.inline
      def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFulfilled(value: () => Boolean): Self = StObject.set(x, "isFulfilled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPending(value: () => Boolean): Self = StObject.set(x, "isPending", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsRejected(value: () => Boolean): Self = StObject.set(x, "isRejected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReason(value: () => js.Any): Self = StObject.set(x, "reason", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: () => R): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PromisifyAllOptions extends PromisifyOptions {
    
    var filter: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* func */ js.Function1[/* repeated */ js.Any, _], 
          /* target */ js.UndefOr[js.Any], 
          /* passesDefaultFilter */ js.UndefOr[Boolean], 
          Boolean
        ]
      ] = js.native
    
    // The promisifier gets a reference to the original method and should return a function which returns a promise
    var promisifier: js.UndefOr[
        js.Function2[
          /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
          /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
          js.Function0[js.Thenable[_]]
        ]
      ] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object PromisifyAllOptions {
    
    @scala.inline
    def apply(): PromisifyAllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyAllOptions]
    }
    
    @scala.inline
    implicit class PromisifyAllOptionsMutableBuilder[Self <: PromisifyAllOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(
        value: (/* name */ String, /* func */ js.Function1[/* repeated */ js.Any, _], /* target */ js.UndefOr[js.Any], /* passesDefaultFilter */ js.UndefOr[Boolean]) => Boolean
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setPromisifier(
        value: (/* originalMethod */ js.Function1[/* repeated */ js.Any, _], /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]]) => js.Function0[js.Thenable[_]]
      ): Self = StObject.set(x, "promisifier", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPromisifierUndefined: Self = StObject.set(x, "promisifier", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait PromisifyOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var multiArgs: js.UndefOr[Boolean] = js.native
  }
  object PromisifyOptions {
    
    @scala.inline
    def apply(): PromisifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromisifyOptions]
    }
    
    @scala.inline
    implicit class PromisifyOptionsMutableBuilder[Self <: PromisifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setMultiArgs(value: Boolean): Self = StObject.set(x, "multiArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiArgsUndefined: Self = StObject.set(x, "multiArgs", js.undefined)
    }
  }
  
  type ResolvableProps[T] = js.Object with typingsSlinky.bluebirdLst.bluebirdLstStrings.ResolvableProps with TopLevel[js.Any]
  
  @js.native
  trait Resolver[R] extends StObject {
    
    /**
      * Gives you a callback representation of the `PromiseResolver`. Note that this is not a method but a property. The callback accepts error object in first argument and success values on the 2nd parameter and the rest, I.E. node js conventions.
      *
      * If the the callback is called with multiple success values, the resolver fullfills its promise with an array of the values.
      */
    // TODO specify resolver callback
    def callback(err: js.Any, value: R, values: R*): Unit = js.native
    
    /**
      * Returns a reference to the controlled promise that can be passed to clients.
      */
    var promise: Bluebird[R] = js.native
    
    /**
      * Reject the underlying promise with `reason` as the rejection reason.
      */
    def reject(reason: js.Any): Unit = js.native
    
    def resolve(): Unit = js.native
    /**
      * Resolve the underlying promise with `value` as the resolution value. If `value` is a thenable or a promise, the underlying promise will assume its state.
      */
    def resolve(value: R): Unit = js.native
  }
  
  @js.native
  trait SpreadOption extends StObject {
    
    var spread: Boolean = js.native
  }
  object SpreadOption {
    
    @scala.inline
    def apply(spread: Boolean): SpreadOption = {
      val __obj = js.Dynamic.literal(spread = spread.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpreadOption]
    }
    
    @scala.inline
    implicit class SpreadOptionMutableBuilder[Self <: SpreadOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpread(value: Boolean): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    }
  }
  
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
  
  /**
    * Start the chain of promises with `Promise.try`. Any synchronous exceptions will be turned into rejections on the returned promise.
    *
    * Note about second argument: if it's specifically a true array, its values become respective arguments for the function call. Otherwise it is passed as is as the first argument for the function call.
    *
    * Alias for `attempt();` for compatibility with earlier ECMAScript version.
    */
  /* static member */
  @JSImport("bluebird-lst", "try")
  @js.native
  def `try`[R](fn: js.Function0[R | js.Thenable[R]]): Bluebird[R] = js.native
}
