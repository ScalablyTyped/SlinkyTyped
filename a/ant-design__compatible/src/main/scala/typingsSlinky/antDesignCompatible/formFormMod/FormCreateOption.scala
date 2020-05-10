package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormCreateOption[T] extends js.Object {
  var mapPropsToFields: js.UndefOr[js.Function1[/* props */ T, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var onFieldsChange: js.UndefOr[js.Function3[/* props */ T, /* fields */ js.Any, /* allFields */ js.Any, Unit]] = js.native
  var onValuesChange: js.UndefOr[
    js.Function3[/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any, Unit]
  ] = js.native
  var validateMessages: js.UndefOr[FormCreateOptionMessages] = js.native
  var withRef: js.UndefOr[Boolean] = js.native
}

object FormCreateOption {
  @scala.inline
  def apply[T](): FormCreateOption[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormCreateOption[T]]
  }
  @scala.inline
  implicit class FormCreateOptionOps[Self[t] <: FormCreateOption[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMapPropsToFields(value: /* props */ T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapPropsToFields: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToFields")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldsChange(value: (/* props */ T, /* fields */ js.Any, /* allFields */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnFieldsChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesChange(value: (/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any) => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnValuesChange: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateMessages(value: FormCreateOptionMessages): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateMessages: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateMessages")(js.undefined)
        ret
    }
    @scala.inline
    def withWithRef(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withRef")(js.undefined)
        ret
    }
  }
  
}

