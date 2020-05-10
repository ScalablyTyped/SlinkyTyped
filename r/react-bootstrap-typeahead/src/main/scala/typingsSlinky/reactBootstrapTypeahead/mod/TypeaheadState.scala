package typingsSlinky.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeaheadState[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: Double | Null = js.native
  var activeItem: T | Null = js.native
  var initialItem: T | Null = js.native
  var isFocused: Boolean = js.native
  var selected: js.Array[T] = js.native
  var showMenu: Boolean = js.native
  var shownResults: Double = js.native
  var text: String = js.native
}

object TypeaheadState {
  @scala.inline
  def apply[T](isFocused: Boolean, selected: js.Array[T], showMenu: Boolean, shownResults: Double, text: String): TypeaheadState[T] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], shownResults = shownResults.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadState[T]]
  }
  @scala.inline
  implicit class TypeaheadStateOps[Self[t] <: TypeaheadState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsFocused(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowMenu(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShownResults(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shownResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveIndexNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(null)
        ret
    }
    @scala.inline
    def withActiveItem(value: T): Self[T] = {
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
    def withInitialItem(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialItemNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialItem")(null)
        ret
    }
  }
  
}

