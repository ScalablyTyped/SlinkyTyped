package typingsSlinky.blueprintjsSelect.queryListMod

import typingsSlinky.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryListState[T] extends js.Object {
  /** The currently focused item (for keyboard interactions). */
  var activeItem: T | ICreateNewItem | Null = js.native
  /**
    * The item returned from `createNewItemFromQuery(this.state.query)`, cached
    * to avoid continuous reinstantions within `isCreateItemRendered`, where
    * this element will be used to hide the "Create Item" option if its value
    * matches the current `query`.
    */
  var createNewItem: js.UndefOr[T] = js.native
  /** The original `items` array filtered by `itemListPredicate` or `itemPredicate`. */
  var filteredItems: js.Array[T] = js.native
  /** The current query string. */
  var query: String = js.native
}

object IQueryListState {
  @scala.inline
  def apply[T](filteredItems: js.Array[T], query: String): IQueryListState[T] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryListState[T]]
  }
  @scala.inline
  implicit class IQueryListStateOps[Self[t] <: IQueryListState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFilteredItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveItem(value: T | ICreateNewItem): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveItemNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeItem")(null)
        ret
    }
    @scala.inline
    def withCreateNewItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateNewItem: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewItem")(js.undefined)
        ret
    }
  }
  
}

