package typingsSlinky.antd.formContextMod

import typingsSlinky.rcFieldForm.formContextMod.FormChangeInfo
import typingsSlinky.rcFieldForm.formContextMod.FormFinishInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-field-form.rc-field-form/lib/FormContext.FormProviderProps, 'validateMessages'> */
@js.native
trait FormProviderProps extends js.Object {
  var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.native
  var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.native
}

object FormProviderProps {
  @scala.inline
  def apply(): FormProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProviderProps]
  }
  @scala.inline
  implicit class FormProviderPropsOps[Self <: FormProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFormChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormFinish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFormFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFormFinish")(js.undefined)
        ret
    }
  }
  
}

