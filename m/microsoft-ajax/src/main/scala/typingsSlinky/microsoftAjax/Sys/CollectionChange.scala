package typingsSlinky.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a change in a collection.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393798(v=vs.100).aspx}
  */
@js.native
trait CollectionChange extends js.Object {
  //#endregion
  //#region Fields
  /**
    * Gets a NotifyCollectionChangedAction object that contains the change action enumeration value.
    * @return A NotifyCollectionChangedAction object.
    */
  var action: NotifyCollectionChangedAction = js.native
  /**
    * @return An array of items that were added.
    */
  var newItems: js.Array[_] = js.native
  /**
    * The index where new items have been inserted.
    * @return An integer that represents the index where new items have been inserted.
    */
  var newStartingIndex: Double = js.native
  /**
    * The items that were removed when the NotifyCollectionChangedAction object is set to remove.
    * @return An array containing the items that were removed.
    */
  var oldItems: js.Array[_] = js.native
  /**
    * Gets the index where old items have been removed.
    * @return An integer that represents the index where old items have been removed.
    */
  var oldStartingIndex: Double = js.native
}

object CollectionChange {
  @scala.inline
  def apply(
    action: NotifyCollectionChangedAction,
    newItems: js.Array[_],
    newStartingIndex: Double,
    oldItems: js.Array[_],
    oldStartingIndex: Double
  ): CollectionChange = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newItems = newItems.asInstanceOf[js.Any], newStartingIndex = newStartingIndex.asInstanceOf[js.Any], oldItems = oldItems.asInstanceOf[js.Any], oldStartingIndex = oldStartingIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
  @scala.inline
  implicit class CollectionChangeOps[Self <: CollectionChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: NotifyCollectionChangedAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewStartingIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newStartingIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldStartingIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldStartingIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

