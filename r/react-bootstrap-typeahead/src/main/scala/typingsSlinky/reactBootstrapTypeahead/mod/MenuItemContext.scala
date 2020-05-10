package typingsSlinky.reactBootstrapTypeahead.mod

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.MenuItemContextKeys> */
@js.native
trait MenuItemContext[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.native
  var isOnlyResult: js.UndefOr[Boolean] = js.native
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.native
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event_, Unit]] = js.native
}

object MenuItemContext {
  @scala.inline
  def apply[T](): MenuItemContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemContext[T]]
  }
  @scala.inline
  implicit class MenuItemContextOps[Self[t] <: MenuItemContext[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withActiveIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOnlyResult(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnlyResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOnlyResult: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOnlyResult")(js.undefined)
        ret
    }
    @scala.inline
    def withOnActiveItemChange(value: /* options */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnActiveItemChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onActiveItemChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInitialItemChange(value: /* option */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialItemChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInitialItemChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInitialItemChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuItemClick(value: (/* option */ T, /* e */ Event_) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuItemClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMenuItemClick: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuItemClick")(js.undefined)
        ret
    }
  }
  
}

