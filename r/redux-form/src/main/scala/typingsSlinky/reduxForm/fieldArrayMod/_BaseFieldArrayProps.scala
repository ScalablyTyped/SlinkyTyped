package typingsSlinky.reduxForm.fieldArrayMod

import slinky.core.ReactComponentClass
import typingsSlinky.reduxForm.fieldMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _BaseFieldArrayProps[P, FieldValue] extends js.Object {
  var component: ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P] = js.native
  var name: String = js.native
  var rerenderOnEveryChange: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.native
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.native
  var withRef: js.UndefOr[Boolean] = js.native
}

object _BaseFieldArrayProps {
  @scala.inline
  def apply[P, FieldValue](component: ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P], name: String): _BaseFieldArrayProps[P, FieldValue] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[_BaseFieldArrayProps[P, FieldValue]]
  }
  @scala.inline
  implicit class _BaseFieldArrayPropsOps[Self[p, fieldvalue] <: _BaseFieldArrayProps[p, fieldvalue], P, FieldValue] (val x: Self[P, FieldValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, FieldValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, FieldValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, FieldValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, FieldValue]) with Other]
    @scala.inline
    def withComponent(value: ReactComponentClass[WrappedFieldArrayProps[FieldValue] with P]): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRerenderOnEveryChange(value: Boolean): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderOnEveryChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRerenderOnEveryChange: Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rerenderOnEveryChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withValidate(value: Validator | js.Array[Validator]): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnFunction4(
      value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
    ): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withWarn(value: Validator | js.Array[Validator]): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarn: Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warn")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRef(value: Boolean): Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRef: Self[P, FieldValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(js.undefined)
        ret
    }
  }
  
}

