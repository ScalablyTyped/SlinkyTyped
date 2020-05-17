package typingsSlinky.formol.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormolProps[V] extends js.Object {
  var allowUnmodifiedSubmit: js.UndefOr[js.Any] = js.native
  var cancelText: js.UndefOr[js.Any] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[js.Any] = js.native
  var extra: js.UndefOr[TagMod[Any]] = js.native
  var i18n: js.UndefOr[js.Any] = js.native
  var item: js.UndefOr[V] = js.native
  var noCancel: js.UndefOr[js.Any] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var submitText: js.UndefOr[js.Any] = js.native
  var types: js.UndefOr[js.Array[String]] = js.native
  var validator: js.UndefOr[
    js.Function1[
      /* v */ V, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? string | null}
    */ typingsSlinky.formol.formolStrings.FormolProps with TopLevel[js.Any]
    ]
  ] = js.native
}

object FormolProps {
  @scala.inline
  def apply[V](): FormolProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormolProps[V]]
  }
  @scala.inline
  implicit class FormolPropsOps[Self[v] <: FormolProps[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withAllowUnmodifiedSubmit(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnmodifiedSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowUnmodifiedSubmit: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowUnmodifiedSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelText(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelText: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelText")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraReactElement(value: ReactElement): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: TagMod[Any]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withItem(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItem: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.undefined)
        ret
    }
    @scala.inline
    def withNoCancel(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoCancel: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: /* e */ Event => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitText(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitText: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitText")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[String]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(
      value: /* v */ V => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]:? string | null}
      */ typingsSlinky.formol.formolStrings.FormolProps with TopLevel[js.Any]
    ): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidator: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
  }
  
}

