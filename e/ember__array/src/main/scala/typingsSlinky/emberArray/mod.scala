package typingsSlinky.emberArray

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.emberArray.enumerableMod.Enumerable
import typingsSlinky.emberArray.nativeArrayMod.NativeArray
import typingsSlinky.emberObject.computedMod.ComputedProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  // Ember.Array rather than Array because the `array-type` lint rule doesn't realize the global is shadowed
  // tslint:disable-next-line:array-type
  @JSImport("@ember/array", JSImport.Default)
  @js.native
  val default: typingsSlinky.emberObject.mixinMod.default[Array[js.Any], typingsSlinky.emberObject.mod.default] = js.native
  
  @JSImport("@ember/array", "A")
  @js.native
  def A[T](): NativeArray[T] = js.native
  @JSImport("@ember/array", "A")
  @js.native
  def A[T](arr: Array[T]): NativeArray[T] = js.native
  
  @JSImport("@ember/array", "isArray")
  @js.native
  def isArray(obj: js.Any): /* is std.ArrayLike<any> */ Boolean = js.native
  
  /**
    * This module implements Observer-friendly Array-like behavior. This mixin is picked up by the
    * Array class as well as other controllers, etc. that want to appear to be arrays.
    */
  @js.native
  trait Array[T] extends Enumerable[T] {
    
    /**
      * Returns a special object that can be used to observe individual properties
      * on the array. Just get an equivalent property on this object and it will
      * return an enumerable that maps automatically to the named key on the
      * member objects.
      */
    var `@each`: ComputedProperty[T, T] = js.native
    
    /**
      * Adds an array observer to the receiving array. The array observer object
      * normally must implement two methods:
      */
    def addArrayObserver(target: js.Object, opts: js.Object): this.type = js.native
    
    /**
      * If you are implementing an object that supports `Ember.Array`, call this
      * method just after the array content changes to notify any observers and
      * invalidate any related properties. Pass the starting index of the change
      * as well as a delta of the amounts to change.
      */
    def arrayContentDidChange(startIdx: Double, removeAmt: Double, addAmt: Double): this.type = js.native
    
    /**
      * If you are implementing an object that supports `Ember.Array`, call this
      * method just before the array content changes to notify any observers and
      * invalidate any related properties. Pass the starting index of the change
      * as well as a delta of the amounts to change.
      */
    def arrayContentWillChange(startIdx: Double, removeAmt: Double, addAmt: Double): this.type = js.native
    
    /**
      * Becomes true whenever the array currently has observers watching changes
      * on the array.
      */
    var hasArrayObservers: ComputedProperty[Boolean, Boolean] = js.native
    
    /**
      * Returns the index of the given object's first occurrence.
      * If no `startAt` argument is given, the starting location to
      * search is 0. If it's negative, will count backward from
      * the end of the array. Returns -1 if no match is found.
      */
    def indexOf(searchElement: T): Double = js.native
    def indexOf(searchElement: T, fromIndex: Double): Double = js.native
    
    /**
      * Returns the index of the given object's last occurrence.
      * If no `startAt` argument is given, the search starts from
      * the last position. If it's negative, will count backward
      * from the end of the array. Returns -1 if no match is found.
      */
    def lastIndexOf(searchElement: T): Double = js.native
    def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
    
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    var length: Double | (ComputedProperty[Double, Double]) = js.native
    
    /**
      * Returns the object at the given `index`. If the given `index` is negative
      * or is greater or equal than the array length, returns `undefined`.
      */
    def objectAt(idx: Double): js.UndefOr[T] = js.native
    
    /**
      * This returns the objects at the specified indexes, using `objectAt`.
      */
    // tslint:disable-next-line:array-type
    def objectsAt(indexes: Array[Double]): Array[T] = js.native
    
    /**
      * Removes an array observer from the object if the observer is current
      * registered. Calling this method multiple times with the same object will
      * have no effect.
      */
    def removeArrayObserver(target: js.Object, opts: js.Object): this.type = js.native
    
    /**
      * Returns a new array that is a slice of the receiver. This implementation
      * uses the observable array methods to retrieve the objects for the new
      * slice.
      */
    def slice(): Array[T] = js.native
    def slice(beginIndex: js.UndefOr[scala.Nothing], endIndex: Double): Array[T] = js.native
    def slice(beginIndex: Double): Array[T] = js.native
    def slice(beginIndex: Double, endIndex: Double): Array[T] = js.native
  }
  
  type _To = typingsSlinky.emberObject.mixinMod.default[Array[js.Any], typingsSlinky.emberObject.mod.default]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsSlinky.emberObject.mixinMod.default[Array[js.Any], typingsSlinky.emberObject.mod.default] = default
}
