package typingsSlinky.ow

import typingsSlinky.node.Buffer
import typingsSlinky.ow.basePredicateMod.BasePredicate
import typingsSlinky.ow.predicateMod.Predicate
import typingsSlinky.ow.predicateMod.PredicateOptions
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.SharedArrayBuffer
import typingsSlinky.typeFest.basicMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ow/dist/source/predicates", JSImport.Namespace)
@js.native
object predicatesMod extends js.Object {
  
  def default[T](`object`: T): T with Predicates = js.native
  def default[T](`object`: T, options: PredicateOptions): T with Predicates = js.native
  
  @js.native
  class AnyPredicate[T] protected ()
    extends typingsSlinky.ow.anyMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[_]]) = this()
    def this(predicates: js.Array[BasePredicate[_]], options: PredicateOptions) = this()
  }
  
  @js.native
  class ArrayBufferPredicate[T /* <: ArrayBufferLike */] ()
    extends typingsSlinky.ow.arrayBufferMod.ArrayBufferPredicate[T]
  
  @js.native
  /**
    @hidden
    */
  class ArrayPredicate[T] ()
    extends typingsSlinky.ow.arrayMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class BooleanPredicate ()
    extends typingsSlinky.ow.booleanMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class DataViewPredicate ()
    extends typingsSlinky.ow.dataViewMod.DataViewPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class DatePredicate ()
    extends typingsSlinky.ow.dateMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ErrorPredicate ()
    extends typingsSlinky.ow.errorMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class MapPredicate[T1, T2] ()
    extends typingsSlinky.ow.mapMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class NumberPredicate ()
    extends typingsSlinky.ow.numberMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ObjectPredicate ()
    extends typingsSlinky.ow.objectMod.ObjectPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  trait Predicates extends js.Object {
    
    def any(predicate: BasePredicate[_]*): typingsSlinky.ow.anyMod.AnyPredicate[_] = js.native
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1](p1: BasePredicate[T1]): typingsSlinky.ow.anyMod.AnyPredicate[T1] = js.native
    def any[T1, T2](p1: BasePredicate[T1], p2: BasePredicate[T2]): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2] = js.native
    def any[T1, T2, T3](p1: BasePredicate[T1], p2: BasePredicate[T2], p3: BasePredicate[T3]): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3] = js.native
    def any[T1, T2, T3, T4](p1: BasePredicate[T1], p2: BasePredicate[T2], p3: BasePredicate[T3], p4: BasePredicate[T4]): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4] = js.native
    def any[T1, T2, T3, T4, T5](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5]
    ): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5] = js.native
    def any[T1, T2, T3, T4, T5, T6](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6]
    ): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7]
    ): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7, T8](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8]
    ): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8],
      p9: BasePredicate[T9]
    ): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8],
      p9: BasePredicate[T9],
      p10: BasePredicate[T10]
    ): typingsSlinky.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
    
    /**
      Test the value to be an array.
      */
    val array: typingsSlinky.ow.arrayMod.ArrayPredicate[_] = js.native
    
    /**
      Test the value to be a ArrayBuffer.
      */
    val arrayBuffer: typingsSlinky.ow.arrayBufferMod.ArrayBufferPredicate[js.typedarray.ArrayBuffer] = js.native
    
    /**
      Test the value to be a boolean.
      */
    val boolean: typingsSlinky.ow.booleanMod.BooleanPredicate = js.native
    
    /**
      Test the value to be a Buffer.
      */
    val buffer: Predicate[Buffer] = js.native
    
    /**
      Test the value to be a DataView.
      */
    val dataView: typingsSlinky.ow.dataViewMod.DataViewPredicate = js.native
    
    /**
      Test the value to be a Date.
      */
    val date: typingsSlinky.ow.dateMod.DatePredicate = js.native
    
    /**
      Test the value to be an Error.
      */
    val error: typingsSlinky.ow.errorMod.ErrorPredicate = js.native
    
    /**
      Test the value to be a Float32Array.
      */
    val float32Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float32Array] = js.native
    
    /**
      Test the value to be a Float64Array.
      */
    val float64Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Float64Array] = js.native
    
    /**
      Test the value to be a Function.
      */
    val function: Predicate[js.Function] = js.native
    
    /**
      Test the value to be a Int16Array.
      */
    val int16Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int16Array] = js.native
    
    /**
      Test the value to be a Int32Array.
      */
    val int32Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int32Array] = js.native
    
    /**
      Test the value to be a Int8Array.
      */
    val int8Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Int8Array] = js.native
    
    /**
      Test the value to be Iterable.
      */
    val iterable: Predicate[js.Iterable[_]] = js.native
    
    /**
      Test the value to be a Map.
      */
    val map: typingsSlinky.ow.mapMod.MapPredicate[_, _] = js.native
    
    /**
      Test the value to be not a number.
      */
    val nan: Predicate[Double] = js.native
    
    /**
      Test the value to be null.
      */
    val `null`: Predicate[Null] = js.native
    
    /**
      Test the value to be null or undefined.
      */
    val nullOrUndefined: Predicate[js.UndefOr[Null]] = js.native
    
    /**
      Test the value to be a number.
      */
    val number: typingsSlinky.ow.numberMod.NumberPredicate = js.native
    
    /**
      Test the value to be an object.
      */
    val `object`: typingsSlinky.ow.objectMod.ObjectPredicate = js.native
    
    /**
      Test the value to be a Promise.
      */
    val promise: Predicate[js.Promise[_]] = js.native
    
    /**
      Test the value to be a RegExp.
      */
    val regExp: Predicate[js.RegExp] = js.native
    
    /**
      Test the value to be a Set.
      */
    val set: typingsSlinky.ow.setMod.SetPredicate[_] = js.native
    
    /**
      Test the value to be a SharedArrayBuffer.
      */
    val sharedArrayBuffer: typingsSlinky.ow.arrayBufferMod.ArrayBufferPredicate[SharedArrayBuffer] = js.native
    
    /**
      Test the value to be a string.
      */
    val string: typingsSlinky.ow.stringMod.StringPredicate = js.native
    
    /**
      Test the value to be a Symbol.
      */
    val symbol: Predicate[js.Symbol] = js.native
    
    /**
      Test the value to be a typed array.
      */
    val typedArray: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[TypedArray] = js.native
    
    /**
      Test the value to be a Uint16Array.
      */
    val uint16Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint16Array] = js.native
    
    /**
      Test the value to be a Uint32Array.
      */
    val uint32Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint32Array] = js.native
    
    /**
      Test the value to be a Uint8Array.
      */
    val uint8Array: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8Array] = js.native
    
    /**
      Test the value to be a Uint8ClampedArray.
      */
    val uint8ClampedArray: typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[js.typedarray.Uint8ClampedArray] = js.native
    
    /**
      Test the value to be undefined.
      */
    val undefined: Predicate[js.UndefOr[scala.Nothing]] = js.native
    
    /**
      Test the value to be a WeakMap.
      */
    val weakMap: typingsSlinky.ow.weakMapMod.WeakMapPredicate[js.Object] = js.native
    
    /**
      Test the value to be a WeakSet.
      */
    val weakSet: typingsSlinky.ow.weakSetMod.WeakSetPredicate[js.Object] = js.native
  }
  
  @js.native
  /**
    @hidden
    */
  class SetPredicate[T] ()
    extends typingsSlinky.ow.setMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class StringPredicate ()
    extends typingsSlinky.ow.stringMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  class TypedArrayPredicate[T /* <: TypedArray */] ()
    extends typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[T]
  
  @js.native
  /**
    @hidden
    */
  class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typingsSlinky.ow.weakMapMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class WeakSetPredicate[T /* <: js.Object */] ()
    extends typingsSlinky.ow.weakSetMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
}
