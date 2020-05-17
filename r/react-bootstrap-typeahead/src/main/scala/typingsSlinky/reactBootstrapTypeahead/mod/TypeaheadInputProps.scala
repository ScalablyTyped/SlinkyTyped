package typingsSlinky.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadInputPropKeys> */
@js.native
trait TypeaheadInputProps[T /* <: TypeaheadModel */] extends js.Object {
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inputProps: js.UndefOr[InputProps] = js.native
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.native
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var renderToken: js.UndefOr[
    js.Function3[
      /* selectedItem */ T, 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      TagMod[Any]
    ]
  ] = js.native
  var selected: js.UndefOr[js.Array[T]] = js.native
}

object TypeaheadInputProps {
  @scala.inline
  def apply[T](): TypeaheadInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadInputProps[T]]
  }
  @scala.inline
  implicit class TypeaheadInputPropsOps[Self[t] <: TypeaheadInputProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBsSize(value: TypeaheadBsSizes): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInputProps(value: InputProps): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputProps: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputProps")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelKeyFunction1(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelKey(value: TypeaheadLabelKey[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* selected */ js.Array[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* e */ Event => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToken(
      value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToken")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderToken: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToken")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
  }
  
}

