package typingsSlinky.reduxForm.fieldMod

import slinky.core.ReactComponentClass
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.reduxForm.reduxFormStrings.input
import typingsSlinky.reduxForm.reduxFormStrings.select
import typingsSlinky.reduxForm.reduxFormStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<redux-form.redux-form/lib/Field.CommonFieldProps> */
@js.native
trait BaseFieldProps[P] extends js.Object {
  var component: js.UndefOr[(ReactComponentClass[WrappedFieldProps with P]) | input | select | textarea] = js.native
  var format: js.UndefOr[Formatter | Null] = js.native
  var forwardRef: js.UndefOr[Boolean] = js.native
  var immutableProps: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  var normalize: js.UndefOr[Normalizer] = js.native
  var onBlur: js.UndefOr[EventWithDataHandler[SyntheticFocusEvent[_]]] = js.native
  var onChange: js.UndefOr[EventWithDataHandler[ChangeEvent[_]]] = js.native
  var onDragStart: js.UndefOr[EventHandler[DragEvent[_]]] = js.native
  var onDrop: js.UndefOr[EventHandler[DragEvent[_]]] = js.native
  var onFocus: js.UndefOr[EventHandler[SyntheticFocusEvent[_]]] = js.native
  var parse: js.UndefOr[Parser] = js.native
  var props: js.UndefOr[P] = js.native
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.native
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.native
}

object BaseFieldProps {
  @scala.inline
  def apply[P](name: String): BaseFieldProps[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldProps[P]]
  }
  @scala.inline
  implicit class BaseFieldPropsOps[Self[p] <: BaseFieldProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withName(value: String): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[WrappedFieldProps with P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[WrappedFieldProps with P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: (ReactComponentClass[WrappedFieldProps with P]) | input | select | textarea): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: (/* value */ js.Any, /* name */ String) => js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormat: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatNull: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(null)
        ret
    }
    @scala.inline
    def withForwardRef(value: Boolean): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardRef: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutableProps(value: js.Array[String]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutableProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutableProps")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(
      value: (/* value */ js.Any, /* previousValue */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], /* previousAllValues */ js.UndefOr[js.Any]) => js.Any
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(
      value: (/* event */ js.UndefOr[SyntheticFocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: (SyntheticFocusEvent[_], /* name */ js.UndefOr[String]) => Unit): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: (/* value */ js.Any, /* name */ String) => js.Any): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParse: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: P): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withValidate(value: Validator | js.Array[Validator]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withWarn(value: Validator | js.Array[Validator]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarn: Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
  }
  
}

