package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/iteration
  */
@js.native
trait CollectionIteration[TOut, TIn]
  extends /**
  * Get an element at a particular index in the collection.
  *
  * @param index The index of the element to get.
  */
/* index */ NumberDictionary[TOut] {
  
  /**
    * Iterate over the elements in the collection using an implementation like the native array function namesake.
    *
    * This function behaves like Array.prototype.forEach() with minor changes for convenience:
    * You can exit the iteration early by returning false in the iterating function.
    * The Array.prototype.forEach() implementation does not support this, but it is included anyway on account of its utility.
    *
    * @param each The function executed each iteration.
    * ele - The current element.
    * i - The index of the current element.
    * eles - The collection of elements being iterated.
    * @param thisArg [optional] The value for this within the iterating function.
    */
  def each(each: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ this.type, Unit | Boolean]): this.type = js.native
  def each(
    each: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ this.type, Unit | Boolean],
    thisArg: js.Any
  ): this.type = js.native
  
  /**
    * Get whether the collection is empty, meaning it has no elements.
    */
  def empty(): Boolean = js.native
  
  /**
    * Get an element at a particular index in the collection.
    *
    * You may use eles[i] in place of eles.eq(i) as a more performant alternative.
    *
    * @param index The index of the element to get.
    */
  def eq(index: Double): TOut = js.native
  
  /**
    * Get the first element in the collection.
    */
  def first(): TOut = js.native
  
  def forEach(each: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ this.type, Unit | Boolean]): this.type = js.native
  def forEach(
    each: js.Function3[/* ele */ TIn, /* i */ Double, /* eles */ this.type, Unit | Boolean],
    thisArg: js.Any
  ): this.type = js.native
  
  /**
    * Get the last element in the collection.
    */
  def last(): TOut = js.native
  
  /**
    * Get the number of elements in the collection.
    */
  var length: Double = js.native
  
  /**
    * Get whether the collection is nonempty, meaning it has elements.
    */
  def nonempty(): Boolean = js.native
  
  /**
    * Get the number of elements in the collection.
    */
  def size(): Double = js.native
  
  /**
    * Get a subset of the elements in the collection based on specified indices.
    *
    * @param start [optional] An integer that specifies where to start the selection.
    *              The first element has an index of 0.
    *              Use negative numbers to select from the end of an array.
    * @param end [optional] An integer that specifies where to end the selection.
    *            If omitted, all elements from the start position and to the end of the array will be selected.
    *            Use negative numbers to select from the end of an array.
    */
  def slice(): this.type = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
  def slice(start: Double): this.type = js.native
  def slice(start: Double, end: Double): this.type = js.native
  
  /**
    * Get the collection as an array, maintaining the order of the elements.
    */
  def toArray(): js.Array[TOut] = js.native
}
