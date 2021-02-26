package typingsSlinky.ol

import typingsSlinky.ol.collectionEventTypeMod.CollectionEventType
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.add
import typingsSlinky.ol.olStrings.changeColonlength
import typingsSlinky.ol.olStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @JSImport("ol/Collection", JSImport.Default)
  @js.native
  class default[T] () extends Collection[T] {
    def this(opt_array: js.Array[T]) = this()
    def this(opt_array: js.UndefOr[scala.Nothing], opt_options: Options) = this()
    def this(opt_array: js.Array[T], opt_options: Options) = this()
  }
  
  @JSImport("ol/Collection", "CollectionEvent")
  @js.native
  class CollectionEvent[T] protected ()
    extends typingsSlinky.ol.eventMod.default {
    def this(`type`: CollectionEventType) = this()
    def this(`type`: CollectionEventType, opt_element: T) = this()
    def this(`type`: CollectionEventType, opt_element: T, opt_index: Double) = this()
    def this(`type`: CollectionEventType, opt_element: js.UndefOr[scala.Nothing], opt_index: Double) = this()
    
    /**
      * The element that is added to or removed from the collection.
      */
    var element: T = js.native
    
    /**
      * The index of the added or removed element.
      */
    var index: Double = js.native
  }
  
  @js.native
  trait Collection[T]
    extends typingsSlinky.ol.objectMod.default {
    
    /**
      * Remove all elements from the collection.
      */
    def clear(): Unit = js.native
    
    /**
      * Add elements to the collection.  This pushes each item in the provided array
      * to the end of the collection.
      */
    def extend(arr: js.Array[T]): Collection[T] = js.native
    
    /**
      * Iterate over each element, calling the provided callback.
      */
    def forEach(f: js.Function3[/* p0 */ T, /* p1 */ Double, /* p2 */ js.Array[T], _]): Unit = js.native
    
    /**
      * Get a reference to the underlying Array object. Warning: if the array
      * is mutated, no events will be dispatched by the collection, and the
      * collection's "length" property won't be in sync with the actual length
      * of the array.
      */
    def getArray(): js.Array[T] = js.native
    
    /**
      * Get the length of this collection.
      */
    def getLength(): Double = js.native
    
    /**
      * Insert an element at the provided index.
      */
    def insertAt(index: Double, elem: T): Unit = js.native
    
    /**
      * Get the element at the provided index.
      */
    def item(index: Double): T = js.native
    
    @JSName("on")
    def on_add(`type`: add, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
    @JSName("on")
    def on_changelength(`type`: changeColonlength, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_remove(`type`: remove, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_add(`type`: add, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
    @JSName("once")
    def once_changelength(`type`: changeColonlength, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_remove(`type`: remove, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
    
    /**
      * Remove the last element of the collection and return it.
      * Return undefined if the collection is empty.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * Insert the provided element at the end of the collection.
      */
    def push(elem: T): Double = js.native
    
    /**
      * Remove the first occurrence of an element from the collection.
      */
    def remove(elem: T): js.UndefOr[T] = js.native
    
    /**
      * Remove the element at the provided index and return it.
      * Return undefined if the collection does not contain this index.
      */
    def removeAt(index: Double): js.UndefOr[T] = js.native
    
    /**
      * Set the element at the provided index.
      */
    def setAt(index: Double, elem: T): Unit = js.native
    
    @JSName("un")
    def un_add(`type`: add, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): Unit = js.native
    @JSName("un")
    def un_changelength(`type`: changeColonlength, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_remove(`type`: remove, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var unique: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
}
