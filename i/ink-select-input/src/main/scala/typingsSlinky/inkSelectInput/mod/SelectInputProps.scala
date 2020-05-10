package typingsSlinky.inkSelectInput.mod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectInputProps[T /* <: ItemOfSelectInput */] extends js.Object {
  var focus: js.UndefOr[Boolean] = js.native
  var indicatorComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var initialIndex: js.UndefOr[Double] = js.native
  var itemComponent: js.UndefOr[ReactComponentClass[js.Object]] = js.native
  var items: js.UndefOr[js.Array[T]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
}

object SelectInputProps {
  @scala.inline
  def apply[T](): SelectInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectInputProps[T]]
  }
  @scala.inline
  implicit class SelectInputPropsOps[Self[t] <: SelectInputProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withFocus(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorComponent(value: ReactComponentClass[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withItemComponent(value: ReactComponentClass[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemComponent")(js.undefined)
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
    @scala.inline
    def withLimit(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* item */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
  }
  
}

