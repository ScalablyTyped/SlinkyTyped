package typingsSlinky.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Array")
@js.native
class Array ()
  extends typingsSlinky.extjs.Ext.Array
/* static members */
object Array {
  
  /** [Method] Filter through an array and remove empty item as defined in Ext isEmpty See filter
    * @param array Array
    * @returns Array results
    */
  @JSGlobal("Ext.Array.clean")
  @js.native
  def clean(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.clean")
  @js.native
  def clean(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  
  @JSGlobal("Ext.Array.clone")
  @js.native
  def clone(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Checks whether or not the given array contains the specified item
    * @param array Array The array to check
    * @param item Object The item to look for
    * @returns Boolean True if the array contains the item, false otherwise
    */
  @JSGlobal("Ext.Array.contains")
  @js.native
  def contains(): Boolean = js.native
  @JSGlobal("Ext.Array.contains")
  @js.native
  def contains(array: js.UndefOr[scala.Nothing], item: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.contains")
  @js.native
  def contains(array: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.Array.contains")
  @js.native
  def contains(array: typingsSlinky.extjs.Ext.Array, item: js.Any): Boolean = js.native
  
  /** [Method] Perform a set difference A B by subtracting all items in array B from array A
    * @param arrayA Array
    * @param arrayB Array
    * @returns Array difference
    */
  @JSGlobal("Ext.Array.difference")
  @js.native
  def difference(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.difference")
  @js.native
  def difference(arrayA: js.UndefOr[scala.Nothing], arrayB: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.difference")
  @js.native
  def difference(arrayA: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.difference")
  @js.native
  def difference(arrayA: typingsSlinky.extjs.Ext.Array, arrayB: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Iterates an array or an iterable value and invoke the given callback function for each item
    * @param iterable Array/NodeList/Object The value to be iterated. If this argument is not iterable, the callback function is called once.
    * @param fn Function The callback function. If it returns false, the iteration stops and this method returns the current index.
    * @param scope Object The scope (this reference) in which the specified function is executed.
    * @param reverse Boolean Reverse the iteration order (loop from the end to the beginning) Defaults false
    * @returns Boolean See description for the fn parameter.
    */
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(
    iterable: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(
    iterable: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    reverse: Boolean
  ): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(
    iterable: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(
    iterable: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    reverse: Boolean
  ): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, reverse: Boolean): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any, fn: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], reverse: Boolean): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.each")
  @js.native
  def each(iterable: js.Any, fn: js.Any, scope: js.Any, reverse: Boolean): Boolean = js.native
  
  /** [Method] Shallow compares the contents of 2 arrays using strict equality
    * @param array1 Array
    * @param array2 Array
    * @returns Boolean true if the arrays are equal.
    */
  @JSGlobal("Ext.Array.equals")
  @js.native
  def equals(): Boolean = js.native
  @JSGlobal("Ext.Array.equals")
  @js.native
  def equals(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.Array.equals")
  @js.native
  def equals(array1: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.Array.equals")
  @js.native
  def equals(array1: typingsSlinky.extjs.Ext.Array, array2: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  
  /** [Method] Removes items from an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index.
    * @returns Array The array passed.
    */
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: js.UndefOr[scala.Nothing], index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: js.UndefOr[scala.Nothing], index: Double, removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: typingsSlinky.extjs.Ext.Array, index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: typingsSlinky.extjs.Ext.Array, index: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.erase")
  @js.native
  def erase(array: typingsSlinky.extjs.Ext.Array, index: Double, removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Executes the specified function for each array element until the function returns a falsy value
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Boolean True if no false value is returned by the callback function.
    */
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: js.UndefOr[scala.Nothing], fn: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: typingsSlinky.extjs.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: typingsSlinky.extjs.Ext.Array, fn: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.every")
  @js.native
  def every(array: typingsSlinky.extjs.Ext.Array, fn: js.Any, scope: js.Any): Boolean = js.native
  
  /** [Method] Creates a new array with all of the elements of this array for which the provided filtering function returns true
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Array results
    */
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: js.UndefOr[scala.Nothing], fn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: typingsSlinky.extjs.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: typingsSlinky.extjs.Ext.Array, fn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.filter")
  @js.native
  def filter(array: typingsSlinky.extjs.Ext.Array, fn: js.Any, scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns the first item in the array which elicits a true return value from the passed selection function
    * @param array Array The array to search
    * @param fn Function The selection function to execute for each item.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the array
    * @returns Object The first item in the array which returned true from the selection function, or null if none was found.
    */
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: js.UndefOr[scala.Nothing], fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: typingsSlinky.extjs.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: typingsSlinky.extjs.Ext.Array, fn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.findBy")
  @js.native
  def findBy(array: typingsSlinky.extjs.Ext.Array, fn: js.Any, scope: js.Any): js.Any = js.native
  
  /** [Method] Recursively flattens into 1 d Array
    * @param array Array The array to flatten
    * @returns Array The 1-d array.
    */
  @JSGlobal("Ext.Array.flatten")
  @js.native
  def flatten(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.flatten")
  @js.native
  def flatten(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Iterates an array and invoke the given callback function for each item
    * @param array Array The array to iterate
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) in which the specified function is executed.
    */
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: typingsSlinky.extjs.Ext.Array): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: typingsSlinky.extjs.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: typingsSlinky.extjs.Ext.Array, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Array.forEach")
  @js.native
  def forEach(array: typingsSlinky.extjs.Ext.Array, fn: js.Any, scope: js.Any): Unit = js.native
  
  /** [Method] Converts a value to an array if it s not already an array returns An empty array if given value is undefined or n
    * @param value Object The value to convert to an array if it's not already is an array
    * @param newReference Boolean True to clone the given array and return a new reference if necessary, defaults to false
    * @returns Array array
    */
  @JSGlobal("Ext.Array.from")
  @js.native
  def from(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.from")
  @js.native
  def from(value: js.UndefOr[scala.Nothing], newReference: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.from")
  @js.native
  def from(value: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.from")
  @js.native
  def from(value: js.Any, newReference: Boolean): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Push an item into the array only if the array doesn t contain it yet
    * @param array Array The array
    * @param item Object The item to include
    */
  @JSGlobal("Ext.Array.include")
  @js.native
  def include(): Unit = js.native
  @JSGlobal("Ext.Array.include")
  @js.native
  def include(array: js.UndefOr[scala.Nothing], item: js.Any): Unit = js.native
  @JSGlobal("Ext.Array.include")
  @js.native
  def include(array: typingsSlinky.extjs.Ext.Array): Unit = js.native
  @JSGlobal("Ext.Array.include")
  @js.native
  def include(array: typingsSlinky.extjs.Ext.Array, item: js.Any): Unit = js.native
  
  /** [Method] Get the index of the provided item in the given array a supplement for the missing arrayPrototype indexOf in Interne
    * @param array Array The array to check
    * @param item Object The item to look for
    * @param from Number The index at which to begin the search
    * @returns Number The index of item in the array (or -1 if it is not found)
    */
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: js.UndefOr[scala.Nothing], item: js.UndefOr[scala.Nothing], from: Double): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: js.UndefOr[scala.Nothing], item: js.Any): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: js.UndefOr[scala.Nothing], item: js.Any, from: Double): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: typingsSlinky.extjs.Ext.Array): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: typingsSlinky.extjs.Ext.Array, item: js.UndefOr[scala.Nothing], from: Double): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: typingsSlinky.extjs.Ext.Array, item: js.Any): Double = js.native
  @JSGlobal("Ext.Array.indexOf")
  @js.native
  def indexOf(array: typingsSlinky.extjs.Ext.Array, item: js.Any, from: Double): Double = js.native
  
  /** [Method] Inserts items in to an array
    * @param array Array The Array in which to insert.
    * @param index Number The index in the array at which to operate.
    * @param items Array The array of items to insert at index.
    * @returns Array The array passed.
    */
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(
    array: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    items: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(array: js.UndefOr[scala.Nothing], index: Double, items: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(
    array: typingsSlinky.extjs.Ext.Array,
    index: js.UndefOr[scala.Nothing],
    items: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(array: typingsSlinky.extjs.Ext.Array, index: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.insert")
  @js.native
  def insert(array: typingsSlinky.extjs.Ext.Array, index: Double, items: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Merge multiple arrays into one with unique items that exist in all of the arrays
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array intersect
    */
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(
    array1: js.UndefOr[scala.Nothing],
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(
    array1: js.UndefOr[scala.Nothing],
    array2: typingsSlinky.extjs.Ext.Array,
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(array1: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(
    array1: typingsSlinky.extjs.Ext.Array,
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(array1: typingsSlinky.extjs.Ext.Array, array2: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.intersect")
  @js.native
  def intersect(
    array1: typingsSlinky.extjs.Ext.Array,
    array2: typingsSlinky.extjs.Ext.Array,
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Creates a new array with the results of calling a provided function on every element in this array
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Array results
    */
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: js.UndefOr[scala.Nothing], fn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: typingsSlinky.extjs.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: typingsSlinky.extjs.Ext.Array, fn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.map")
  @js.native
  def map(array: typingsSlinky.extjs.Ext.Array, fn: js.Any, scope: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns the maximum value in the Array
    * @param array Array/NodeList The Array from which to select the maximum value.
    * @param comparisonFn Function a function to perform the comparision which determines maximization. If omitted the ">" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object maxValue The maximum value
    */
  @JSGlobal("Ext.Array.max")
  @js.native
  def max(): js.Any = js.native
  @JSGlobal("Ext.Array.max")
  @js.native
  def max(array: js.UndefOr[scala.Nothing], comparisonFn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.max")
  @js.native
  def max(array: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.max")
  @js.native
  def max(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  
  /** [Method] Calculates the mean of all items in the array
    * @param array Array The Array to calculate the mean value of.
    * @returns Number The mean.
    */
  @JSGlobal("Ext.Array.mean")
  @js.native
  def mean(): Double = js.native
  @JSGlobal("Ext.Array.mean")
  @js.native
  def mean(array: typingsSlinky.extjs.Ext.Array): Double = js.native
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(
    array1: js.UndefOr[scala.Nothing],
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(
    array1: js.UndefOr[scala.Nothing],
    array2: typingsSlinky.extjs.Ext.Array,
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(array1: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(
    array1: typingsSlinky.extjs.Ext.Array,
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(array1: typingsSlinky.extjs.Ext.Array, array2: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.merge")
  @js.native
  def merge(
    array1: typingsSlinky.extjs.Ext.Array,
    array2: typingsSlinky.extjs.Ext.Array,
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns the minimum value in the Array
    * @param array Array/NodeList The Array from which to select the minimum value.
    * @param comparisonFn Function a function to perform the comparision which determines minimization. If omitted the "&lt;" operator will be used. Note: gt = 1; eq = 0; lt = -1
    * @returns Object minValue The minimum value
    */
  @JSGlobal("Ext.Array.min")
  @js.native
  def min(): js.Any = js.native
  @JSGlobal("Ext.Array.min")
  @js.native
  def min(array: js.UndefOr[scala.Nothing], comparisonFn: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.min")
  @js.native
  def min(array: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.min")
  @js.native
  def min(array: js.Any, comparisonFn: js.Any): js.Any = js.native
  
  /** [Method] Plucks the value of a property from each item in the Array
    * @param array Array/NodeList The Array of items to pluck the value from.
    * @param propertyName String The property name to pluck from each element.
    * @returns Array The value from each item in the Array.
    */
  @JSGlobal("Ext.Array.pluck")
  @js.native
  def pluck(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.pluck")
  @js.native
  def pluck(array: js.UndefOr[scala.Nothing], propertyName: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.pluck")
  @js.native
  def pluck(array: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.pluck")
  @js.native
  def pluck(array: js.Any, propertyName: java.lang.String): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Pushes new items onto the end of an Array
    * @param target Array The Array onto which to push new items
    * @param elements Object... The elements to add to the array. Each parameter may be an Array, in which case all the elements of that Array will be pushed into the end of the destination Array.
    * @returns Array An array containing all the new items push onto the end.
    */
  @JSGlobal("Ext.Array.push")
  @js.native
  def push(target: typingsSlinky.extjs.Ext.Array, elements: js.Any*): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Removes the specified item from the array if it exists
    * @param array Array The array
    * @param item Object The item to remove
    * @returns Array The passed array itself
    */
  @JSGlobal("Ext.Array.remove")
  @js.native
  def remove(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.remove")
  @js.native
  def remove(array: js.UndefOr[scala.Nothing], item: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.remove")
  @js.native
  def remove(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.remove")
  @js.native
  def remove(array: typingsSlinky.extjs.Ext.Array, item: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param insert Array An array of items to insert at index.
    * @returns Array The array passed.
    */
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: js.UndefOr[scala.Nothing], index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: js.UndefOr[scala.Nothing],
    removeCount: Double,
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: js.UndefOr[scala.Nothing], index: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: Double,
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: js.UndefOr[scala.Nothing], index: Double, removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: js.UndefOr[scala.Nothing],
    index: Double,
    removeCount: Double,
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: typingsSlinky.extjs.Ext.Array,
    index: js.UndefOr[scala.Nothing],
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: typingsSlinky.extjs.Ext.Array, index: js.UndefOr[scala.Nothing], removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: typingsSlinky.extjs.Ext.Array,
    index: js.UndefOr[scala.Nothing],
    removeCount: Double,
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: typingsSlinky.extjs.Ext.Array, index: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: typingsSlinky.extjs.Ext.Array,
    index: Double,
    removeCount: js.UndefOr[scala.Nothing],
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(array: typingsSlinky.extjs.Ext.Array, index: Double, removeCount: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.replace")
  @js.native
  def replace(
    array: typingsSlinky.extjs.Ext.Array,
    index: Double,
    removeCount: Double,
    insert: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns a shallow copy of a part of an array
    * @param array Array The array (or arguments object).
    * @param begin Number The index at which to begin. Negative values are offsets from the end of the array.
    * @param end Number The index at which to end. The copied items do not include end. Negative values are offsets from the end of the array. If end is omitted, all items up to the end of the array are copied.
    * @returns Array The copied piece of the array.
    */
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: js.UndefOr[scala.Nothing], begin: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: js.UndefOr[scala.Nothing], begin: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: js.UndefOr[scala.Nothing], begin: Double, end: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: typingsSlinky.extjs.Ext.Array, begin: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: typingsSlinky.extjs.Ext.Array, begin: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.slice")
  @js.native
  def slice(array: typingsSlinky.extjs.Ext.Array, begin: Double, end: Double): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Executes the specified function for each array element until the function returns a truthy value
    * @param array Array
    * @param fn Function Callback function for each item
    * @param scope Object Callback function scope
    * @returns Boolean True if the callback function returns a truthy value.
    */
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: js.UndefOr[scala.Nothing], fn: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: typingsSlinky.extjs.Ext.Array): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: typingsSlinky.extjs.Ext.Array, fn: js.UndefOr[scala.Nothing], scope: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: typingsSlinky.extjs.Ext.Array, fn: js.Any): Boolean = js.native
  @JSGlobal("Ext.Array.some")
  @js.native
  def some(array: typingsSlinky.extjs.Ext.Array, fn: js.Any, scope: js.Any): Boolean = js.native
  
  /** [Method] Sorts the elements of an Array
    * @param array Array The array to sort.
    * @param sortFn Function The comparison function.
    * @returns Array The sorted array.
    */
  @JSGlobal("Ext.Array.sort")
  @js.native
  def sort(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.sort")
  @js.native
  def sort(array: js.UndefOr[scala.Nothing], sortFn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.sort")
  @js.native
  def sort(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.sort")
  @js.native
  def sort(array: typingsSlinky.extjs.Ext.Array, sortFn: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Replaces items in an array
    * @param array Array The Array on which to replace.
    * @param index Number The index in the array at which to operate.
    * @param removeCount Number The number of items to remove at index (can be 0).
    * @param elements Object... The elements to add to the array. If you don't specify any elements, splice simply removes elements from the array.
    * @returns Array An array containing the removed items.
    */
  @JSGlobal("Ext.Array.splice")
  @js.native
  def splice(array: typingsSlinky.extjs.Ext.Array, index: Double, removeCount: Double, elements: js.Any*): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Calculates the sum of all items in the given array
    * @param array Array The Array to calculate the sum value of.
    * @returns Number The sum.
    */
  @JSGlobal("Ext.Array.sum")
  @js.native
  def sum(): Double = js.native
  @JSGlobal("Ext.Array.sum")
  @js.native
  def sum(array: typingsSlinky.extjs.Ext.Array): Double = js.native
  
  /** [Method] Converts any iterable numeric indices and a length property into a true array
    * @param iterable Object the iterable object to be turned into a true Array.
    * @param start Number a zero-based index that specifies the start of extraction. Defaults to 0
    * @param end Number a 1-based index that specifies the end of extraction. Defaults to the last index of the iterable value
    * @returns Array array
    */
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.UndefOr[scala.Nothing], start: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.UndefOr[scala.Nothing], start: Double, end: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.Any): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.Any, start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.Any, start: Double): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.toArray")
  @js.native
  def toArray(iterable: js.Any, start: Double, end: Double): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Creates a map object keyed by the elements of the given array
    * @param array Array The Array to create the map from.
    * @param getKey String/Function Name of the object property to use as a key or a function to extract the key.
    * @param scope Object Value of this inside callback.
    * @returns Object The resulting map.
    */
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: js.UndefOr[scala.Nothing], getKey: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: js.UndefOr[scala.Nothing], getKey: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: js.UndefOr[scala.Nothing], getKey: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: typingsSlinky.extjs.Ext.Array, getKey: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: typingsSlinky.extjs.Ext.Array, getKey: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toMap")
  @js.native
  def toMap(array: typingsSlinky.extjs.Ext.Array, getKey: js.Any, scope: js.Any): js.Any = js.native
  
  /** [Method] Creates a map object keyed by a property of elements of the given array
    * @param array Array The Array to create the map from.
    * @param getKey String/Function Name of the object property to use as a key or a function to extract the key.
    * @param scope Object Value of this inside callback.
    * @returns Object The resulting map.
    */
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: js.UndefOr[scala.Nothing], getKey: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: js.UndefOr[scala.Nothing], getKey: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: js.UndefOr[scala.Nothing], getKey: js.Any, scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: typingsSlinky.extjs.Ext.Array): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: typingsSlinky.extjs.Ext.Array, getKey: js.UndefOr[scala.Nothing], scope: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: typingsSlinky.extjs.Ext.Array, getKey: js.Any): js.Any = js.native
  @JSGlobal("Ext.Array.toValueMap")
  @js.native
  def toValueMap(array: typingsSlinky.extjs.Ext.Array, getKey: js.Any, scope: js.Any): js.Any = js.native
  
  /** [Method] Merge multiple arrays into one with unique items
    * @param array1 Array
    * @param array2 Array
    * @param etc Array
    * @returns Array merged
    */
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(
    array1: js.UndefOr[scala.Nothing],
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(array1: js.UndefOr[scala.Nothing], array2: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(
    array1: js.UndefOr[scala.Nothing],
    array2: typingsSlinky.extjs.Ext.Array,
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(array1: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(
    array1: typingsSlinky.extjs.Ext.Array,
    array2: js.UndefOr[scala.Nothing],
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(array1: typingsSlinky.extjs.Ext.Array, array2: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.union")
  @js.native
  def union(
    array1: typingsSlinky.extjs.Ext.Array,
    array2: typingsSlinky.extjs.Ext.Array,
    etc: typingsSlinky.extjs.Ext.Array
  ): typingsSlinky.extjs.Ext.Array = js.native
  
  /** [Method] Returns a new array with unique items
    * @param array Array
    * @returns Array results
    */
  @JSGlobal("Ext.Array.unique")
  @js.native
  def unique(): typingsSlinky.extjs.Ext.Array = js.native
  @JSGlobal("Ext.Array.unique")
  @js.native
  def unique(array: typingsSlinky.extjs.Ext.Array): typingsSlinky.extjs.Ext.Array = js.native
}
