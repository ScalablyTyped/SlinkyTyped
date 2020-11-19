package typingsSlinky.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents an list of ordered entries which dispatches events when the list is modified.
  * @event add {H.util.OList.Event} - Fired when an entry was added to the list.
  * @event remove {H.util.OList.Event} - Fired when an entry was removed from the list.
  * @event set {H.util.OList.Event} - Fired when an entry was set in the list.
  * @event move {H.util.OList.Event} - Fired when an entry was moved within the list.
  */
@js.native
trait OList_ extends EventTarget {
  
  /**
    * This method inserts an entry to the list. Optionally it can place new entry at provided index.
    * @param entry {?} - The entry to insert
    * @param opt_idx {number=} - The index where the new entry should be inserted; if omitted or greater then the current size of the list, the entry is added at the end of the list;
    * a negative index is treated as being relative from the end of the list
    */
  def add(entry: js.Any): Unit = js.native
  def add(entry: js.Any, opt_idx: Double): Unit = js.native
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * This method returns all list's entries as an array.
    * @returns {Array<*>} - The list as an array
    */
  def asArray(): js.Array[_] = js.native
  
  /**
    * This method removes all entries from the list.
    */
  def flush(): Unit = js.native
  
  /**
    * To get the entry at the specified index.
    * @param idx {number} - The index of the entry to get a negative index is treated as being relative from the end of the list
    * @returns {?} - The element at the given index
    */
  def get(idx: Double): js.Any = js.native
  
  /**
    * This method returns the length of the list.
    * @returns {number}
    */
  def getLength(): Double = js.native
  
  /**
    * This method retrieves the index of the first object in this list that is identical with the object supplied by the caller.
    * @param entry {?} - The entry for which to return the index.
    * @returns {number} - The index of the first matching entry in this list or -1 if the entry provided by the caller is not found in the list
    */
  def indexOf(entry: js.Any): Double = js.native
  
  /**
    * This method removes the the first entry which is identical with the given entry.
    * @param entry {?} - The entry to remove
    * @returns {boolean} - signals if the entry could be found in the list and is removed
    */
  def remove(entry: js.Any): Boolean = js.native
  
  /**
    * This method removes an entry by a given index from the list.
    * @param idx {number} - The index of the entry which should be removed; a negative index is treated as being relative from the end of the list
    * @returns {?} - The removed entry
    */
  def removeAt(idx: Double): js.Any = js.native
  
  /**
    * This method replaces an entry at the given index with the given entry.
    * @param idx {number} - The index of the entry which should be replaced; a negative index is treated as being relative from the end of the list
    * @param entry {?} - The entry which replaces the existing one
    * @returns {?} - The replaced entry
    */
  def set(idx: Double, entry: js.Any): js.Any = js.native
}
