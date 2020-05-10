package typingsSlinky.officeUiFabricReact.baseExtendedPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseExtendedPickerState[T] extends js.Object {
  var queryString: String | Null = js.native
  var selectedItems: js.Array[T] | Null = js.native
  var suggestionItems: js.Array[T] | Null = js.native
}

object IBaseExtendedPickerState {
  @scala.inline
  def apply[T](): IBaseExtendedPickerState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseExtendedPickerState[T]]
  }
  @scala.inline
  implicit class IBaseExtendedPickerStateOps[Self[t] <: IBaseExtendedPickerState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withQueryString(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryStringNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryString")(null)
        ret
    }
    @scala.inline
    def withSelectedItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedItemsNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(null)
        ret
    }
    @scala.inline
    def withSuggestionItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionItemsNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionItems")(null)
        ret
    }
  }
  
}

