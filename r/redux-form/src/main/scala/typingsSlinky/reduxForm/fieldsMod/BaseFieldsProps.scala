package typingsSlinky.reduxForm.fieldsMod

import slinky.core.ReactComponentClass
import typingsSlinky.reduxForm.fieldMod.Formatter
import typingsSlinky.reduxForm.fieldMod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseFieldsProps[P] extends js.Object {
  var component: js.UndefOr[ReactComponentClass[_]] = js.native
  var format: js.UndefOr[Formatter | Null] = js.native
  var forwardRef: js.UndefOr[Boolean] = js.native
  var names: js.Array[String] = js.native
  var parse: js.UndefOr[Parser] = js.native
  var props: js.UndefOr[P] = js.native
  var validate: js.UndefOr[FieldsWarnerOrValidator] = js.native
  var warn: js.UndefOr[FieldsWarnerOrValidator] = js.native
}

object BaseFieldsProps {
  @scala.inline
  def apply[P](names: js.Array[String]): BaseFieldsProps[P] = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldsProps[P]]
  }
  @scala.inline
  implicit class BaseFieldsPropsOps[Self[p] <: BaseFieldsProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withNames(value: js.Array[String]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[_]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[_]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[_]): Self[P] = {
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
    def withValidate(value: FieldsWarnerOrValidator): Self[P] = {
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
    def withWarn(value: FieldsWarnerOrValidator): Self[P] = {
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

