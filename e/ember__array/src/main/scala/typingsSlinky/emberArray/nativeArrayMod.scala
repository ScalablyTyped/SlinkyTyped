package typingsSlinky.emberArray

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.emberArray.mutableMod.MutableArray
import typingsSlinky.emberObject.copyableMod.Copyable
import typingsSlinky.emberObject.observableMod.Observable
import typingsSlinky.std.FlatArray
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.anon.CopyWithin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/array/-private/native-array", JSImport.Namespace)
@js.native
object nativeArrayMod extends js.Object {
  
  val default: typingsSlinky.emberObject.mixinMod.default[NativeArray[js.Any], typingsSlinky.emberObject.mod.default] = js.native
  
  /**
    * The NativeArray mixin contains the properties needed to make the native
    * Array support Ember.MutableArray and all of its dependent APIs. Unless you
    * have `EmberENV.EXTEND_PROTOTYPES` or `EmberENV.EXTEND_PROTOTYPES.Array` set to
    * false, this will be applied automatically. Otherwise you can apply the mixin
    * at anytime by calling `Ember.NativeArray.apply(Array.prototype)`.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.std.Array because var conflicts: length. Inlined concat, copyWithin, copyWithin, entries, every_S_T, every_S_T, fill, fill, fill, fill, filter_S_T, filter_S_T, findIndex, findIndex, flat, flat, flatMap, flatMap, iterator, join, join, keys, pop, push, reduceRight, reduceRight, reduceRight_U_U, reduce_U_U, reverse, shift, some, some, sort, sort, splice, splice, splice, unscopables, unshift, values */ @js.native
  trait NativeArray[T]
    extends MutableArray[T]
       with Observable
       with Copyable
       with /* n */ NumberDictionary[T] {
    
    /**
      * Combines two or more arrays.
      * @param items Additional items to add to the end of array1.
      */
    def concat(items: (js.Array[T] | T)*): js.Array[T] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    def entries(): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    /**
      * Returns the this object after filling the section identified by start and end with value
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    def fill(value: T): this.type = js.native
    def fill(value: T, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
    def fill(value: T, start: Double): this.type = js.native
    def fill(value: T, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    def findIndex(predicate: js.Function3[T, /* index */ Double, /* obj */ js.Array[T], _]): Double = js.native
    def findIndex(predicate: js.Function3[T, /* index */ Double, /* obj */ js.Array[T], _], thisArg: js.Any): Double = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    def flatMap[U, This](
      callback: js.ThisFunction3[/* this */ This, T, /* index */ Double, /* array */ js.Array[T], U | js.Array[U]]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[/* this */ This, T, /* index */ Double, /* array */ js.Array[T], U | js.Array[U]],
      thisArg: This
    ): js.Array[U] = js.native
    
    /** Iterator */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[T]] = js.native
    
    /**
      * Adds all the elements of an array separated by the specified separator string.
      * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
      */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    @JSName("length")
    var length_NativeArray: Double = js.native
    
    /**
      * Removes the last element from an array and returns it.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Appends new elements to an array, and returns the new length of the array.
      * @param items New elements of the Array.
      */
    def push(items: T*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    def reduceRight(callbackfn: js.Function4[T, T, /* currentIndex */ Double, /* array */ js.Array[T], T]): T = js.native
    def reduceRight(
      callbackfn: js.Function4[T, T, /* currentIndex */ Double, /* array */ js.Array[T], T],
      initialValue: T
    ): T = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    @JSName("reduceRight")
    def reduceRight_U_U[U](
      callbackfn: js.Function4[/* previousValue */ U, T, /* currentIndex */ Double, /* array */ js.Array[T], U],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an Array.
      */
    def reverse(): js.Array[T] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      */
    def shift(): js.UndefOr[T] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    def some(predicate: js.Function3[T, /* index */ Double, /* array */ js.Array[T], _]): Boolean = js.native
    def some(predicate: js.Function3[T, /* index */ Double, /* array */ js.Array[T], _], thisArg: js.Any): Boolean = js.native
    
    /**
      * Sorts an array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if first argument is less than second argument, zero if they're equal and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[T, T, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      */
    def splice(start: Double): js.Array[T] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[T] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      */
    def splice(start: Double, deleteCount: Double, items: T*): js.Array[T] = js.native
    
    /**
      * Returns an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    @JSName(js.Symbol.unscopables)
    var unscopables: js.Function0[CopyWithin] = js.native
    
    /**
      * Inserts new elements at the start of an array.
      * @param items  Elements to insert at the start of the Array.
      */
    def unshift(items: T*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    def values(): IterableIterator[T] = js.native
  }
  
  // Get an alias to the global Array type to use in inner scope below.
  type GlobalArray[T] = js.Array[T]
}
