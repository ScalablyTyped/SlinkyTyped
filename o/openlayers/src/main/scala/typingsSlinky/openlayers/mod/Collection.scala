package typingsSlinky.openlayers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "Collection")
@js.native
/**
  * @classdesc
  * An expanded version of standard JS Array, adding convenience methods for
  * manipulation. Add and remove changes to the Collection trigger a Collection
  * event. Note that this does not cover changes to the objects _within_ the
  * Collection; they trigger events on the appropriate object, not on the
  * Collection as a whole.
  *
  * @fires ol.Collection.Event
  * @param opt_array Array.
  * @template T
  * @api stable
  */
class Collection[T] () extends Object {
  def this(opt_array: js.Array[T]) = this()
  
  /**
    * Remove all elements from the collection.
    * @api stable
    */
  def clear(): Unit = js.native
  
  /**
    * Add elements to the collection.  This pushes each item in the provided array
    * to the end of the collection.
    * @param arr Array.
    * @return This collection.
    * @api stable
    */
  def extend(arr: js.Array[T]): Collection[T] = js.native
  
  /**
    * Iterate over each element, calling the provided callback.
    * @param f The function to call
    *     for every element. This function takes 3 arguments (the element, the
    *     index and the array). The return value is ignored.
    * @param opt_this The object to use as `this` in `f`.
    * @template S
    * @api stable
    */
  def forEach(f: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], _]): Unit = js.native
  def forEach(f: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], _], opt_this: js.Any): Unit = js.native
  
  /**
    * Get a reference to the underlying Array object. Warning: if the array
    * is mutated, no events will be dispatched by the collection, and the
    * collection's "length" property won't be in sync with the actual length
    * of the array.
    * @return Array.
    * @api stable
    */
  def getArray(): js.Array[T] = js.native
  
  /**
    * Get the length of this collection.
    * @return The length of the array.
    * @observable
    * @api stable
    */
  def getLength(): Double = js.native
  
  /**
    * Insert an element at the provided index.
    * @param index Index.
    * @param elem Element.
    * @api stable
    */
  def insertAt(index: Double, elem: T): Unit = js.native
  
  /**
    * Get the element at the provided index.
    * @param index Index.
    * @return Element.
    * @api stable
    */
  def item(index: Double): T = js.native
  
  /**
    * Remove the last element of the collection and return it.
    * Return `undefined` if the collection is empty.
    * @return Element.
    * @api stable
    */
  def pop(): T = js.native
  
  /**
    * Insert the provided element at the end of the collection.
    * @param elem Element.
    * @return Length.
    * @api stable
    */
  def push(elem: T): Double = js.native
  
  /**
    * Remove the first occurrence of an element from the collection.
    * @param elem Element.
    * @return The removed element or undefined if none found.
    * @api stable
    */
  def remove(elem: T): T = js.native
  
  /**
    * Remove the element at the provided index and return it.
    * Return `undefined` if the collection does not contain this index.
    * @param index Index.
    * @return Value.
    * @api stable
    */
  def removeAt(index: Double): T = js.native
  
  /**
    * Set the element at the provided index.
    * @param index Index.
    * @param elem Element.
    * @api stable
    */
  def setAt(index: Double, elem: T): Unit = js.native
}
object Collection {
  
  /**
    * @classdesc
    * Events emitted by {@link ol.Collection} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param opt_element Element.
    */
  @JSImport("openlayers", "Collection.Event")
  @js.native
  class Event protected ()
    extends typingsSlinky.openlayers.mod.events.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.Collection} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_element Element.
      */
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_element: js.Any) = this()
    
    /**
      * The element that is added to or removed from the collection.
      * @api stable
      */
    var element: js.Any = js.native
  }
  
  type EventType = String
}
