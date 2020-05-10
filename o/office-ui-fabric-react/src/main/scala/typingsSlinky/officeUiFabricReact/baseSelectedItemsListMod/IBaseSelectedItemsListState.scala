package typingsSlinky.officeUiFabricReact.baseSelectedItemsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseSelectedItemsListState[T] extends js.Object {
  var items: js.Array[T] = js.native
}

object IBaseSelectedItemsListState {
  @scala.inline
  def apply[T](items: js.Array[T]): IBaseSelectedItemsListState[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseSelectedItemsListState[T]]
  }
  @scala.inline
  implicit class IBaseSelectedItemsListStateOps[Self[t] <: IBaseSelectedItemsListState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

