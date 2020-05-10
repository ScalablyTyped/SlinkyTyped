package typingsSlinky.officeUiFabricReact.baseSelectedItemsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseSelectedItemsList[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.native
  def addItems(items: js.Array[T]): Unit = js.native
}

object IBaseSelectedItemsList {
  @scala.inline
  def apply[T](addItems: js.Array[T] => Unit): IBaseSelectedItemsList[T] = {
    val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1(addItems))
    __obj.asInstanceOf[IBaseSelectedItemsList[T]]
  }
  @scala.inline
  implicit class IBaseSelectedItemsListOps[Self[t] <: IBaseSelectedItemsList[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAddItems(value: js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
  }
  
}

