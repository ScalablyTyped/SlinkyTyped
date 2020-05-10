package typingsSlinky.aureliaBinding.mod

import typingsSlinky.aureliaBinding.aureliaBindingStrings.add
import typingsSlinky.aureliaBinding.aureliaBindingStrings.clear
import typingsSlinky.aureliaBinding.aureliaBindingStrings.delete
import typingsSlinky.aureliaBinding.aureliaBindingStrings.update
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollectionObserverSplice[T, K] extends js.Object {
  /* ArrayObserverSplice */
  /**
    * Number of items added to the collection.
    */
  var addedCount: Double = js.native
  /**
    * The position at which the items were added.
    */
  var index: Double = js.native
  /**
    * The key of the Map item that was changed.
    */
  var key: K = js.native
  /* End ArrayObserverSplice */
  /**
    * The observed Set or Map after the change.
    */
  var `object`: Set[T] | (Map[K, T]) = js.native
  /**
    * The value of the Map item prior to the change.
    */
  var oldValue: T = js.native
  /**
    * A collection of items that were removed from the collection.
    */
  var removed: js.Array[T] = js.native
  /**
    * The type of change that has taken place. Valid options are "add", "delete", "update", and  "clear".
    * 
    * *Note:* "update" is invalid for Set.
    * 
    * *Note:* "clear" is only valid for Map and Set.
    */
  var `type`: add | delete | update | clear = js.native
  /**
    * The Set value that was either added or removed.
    */
  var value: T = js.native
}

object ICollectionObserverSplice {
  @scala.inline
  def apply[T, K](
    addedCount: Double,
    index: Double,
    key: K,
    `object`: Set[T] | (Map[K, T]),
    oldValue: T,
    removed: js.Array[T],
    `type`: add | delete | update | clear,
    value: T
  ): ICollectionObserverSplice[T, K] = {
    val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollectionObserverSplice[T, K]]
  }
  @scala.inline
  implicit class ICollectionObserverSpliceOps[Self[t, k] <: ICollectionObserverSplice[t, k], T, K] (val x: Self[T, K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, K]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, K]) with Other]
    @scala.inline
    def withAddedCount(value: Double): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: K): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: Set[T] | (Map[K, T])): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: T): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoved(value: js.Array[T]): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: add | delete | update | clear): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T, K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

