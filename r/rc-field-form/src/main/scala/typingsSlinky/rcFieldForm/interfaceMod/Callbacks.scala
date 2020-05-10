package typingsSlinky.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbacks extends js.Object {
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.native
  var onFinish: js.UndefOr[js.Function1[/* values */ Store, Unit]] = js.native
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity, Unit]] = js.native
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Store, /* values */ Store, Unit]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFieldsChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldsChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinish(value: /* values */ Store => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFinishFailed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishFailed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValuesChange(value: (/* changedValues */ Store, /* values */ Store) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnValuesChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValuesChange")(js.undefined)
        ret
    }
  }
  
}

