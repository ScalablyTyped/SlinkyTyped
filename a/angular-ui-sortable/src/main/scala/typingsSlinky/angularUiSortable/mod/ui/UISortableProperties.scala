package typingsSlinky.angularUiSortable.mod.ui

import typingsSlinky.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISortableProperties[T] extends js.Object {
  /**
    * Holds the index of the drop target that the dragged item was dropped.
    */
  var dropindex: Double = js.native
  /**
    * Holds the ui-sortable element that the dragged item was dropped on.
    */
  var droptarget: Double = js.native
  /**
    * Holds the array that is specified by the `ng-model` attribute of the [`droptarget`](#droptarget) ui-sortable element.
    */
  var droptargetModel: js.Array[T] = js.native
  /**
    * Holds the original index of the item dragged.
    */
  var index: Double = js.native
  /**
    * Holds the JavaScript object that is used as the model of the dragged item, as specified by the ng-repeat of the [`source`](#source) ui-sortable element and the item's [`index`](#index).
    */
  var model: T = js.native
  /**
    * Holds the model of the dragged item only when a sorting happens between two connected ui-sortable elements.
    * In other words: `'moved' in ui.item.sortable` will return false only when a sorting is withing the same ui-sortable element ([`source`](#source) equals to the [`droptarget`](#droptarget)).
    */
  var moved: js.UndefOr[T] = js.native
  /**
    * When sorting between two connected sortables, it will be set to true inside the `update` callback of the [`droptarget`](#droptarget).
    */
  var received: Boolean = js.native
  /**
    * Holds the ui-sortable element that the dragged item originated from.
    */
  var source: IAugmentedJQuery = js.native
  /**
    * Holds the array that is specified by the `ng-model` of the [`source`](#source) ui-sortable element.
    */
  var sourceModel: js.Array[T] = js.native
  /**
    * Can be called inside the `update` callback, in order to prevent/revert a sorting.
    * Should be used instead of the [jquery-ui-sortable cancel()](http://api.jqueryui.com/sortable/#method-cancel) method.
    */
  def cancel(): Unit = js.native
  /**
    * Returns whether the current sorting is marked as canceled, by an earlier call to [`ui.item.sortable.cancel()`](#cancel).
    */
  def isCanceled(): Boolean = js.native
  /**
    * Returns whether the [`helper`](http://api.jqueryui.com/sortable/#option-helper) element used for the current sorting, is one of the original ui-sortable list elements.
    */
  def isCustomHelperUsed(): Boolean = js.native
}

object UISortableProperties {
  @scala.inline
  def apply[T](
    cancel: () => Unit,
    dropindex: Double,
    droptarget: Double,
    droptargetModel: js.Array[T],
    index: Double,
    isCanceled: () => Boolean,
    isCustomHelperUsed: () => Boolean,
    model: T,
    received: Boolean,
    source: IAugmentedJQuery,
    sourceModel: js.Array[T]
  ): UISortableProperties[T] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dropindex = dropindex.asInstanceOf[js.Any], droptarget = droptarget.asInstanceOf[js.Any], droptargetModel = droptargetModel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isCanceled = js.Any.fromFunction0(isCanceled), isCustomHelperUsed = js.Any.fromFunction0(isCustomHelperUsed), model = model.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceModel = sourceModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UISortableProperties[T]]
  }
  @scala.inline
  implicit class UISortablePropertiesOps[Self[t] <: UISortableProperties[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDropindex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDroptarget(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droptarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDroptargetModel(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("droptargetModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCanceled(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanceled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCustomHelperUsed(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCustomHelperUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withModel(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceived(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: IAugmentedJQuery): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceModel(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoved(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moved")(js.undefined)
        ret
    }
  }
  
}

