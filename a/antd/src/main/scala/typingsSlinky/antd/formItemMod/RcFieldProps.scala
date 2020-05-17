package typingsSlinky.antd.formItemMod

import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.fieldMod.ShouldUpdate
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-field-form.rc-field-form/lib/Field.FieldProps, 'children'> */
@js.native
trait RcFieldProps extends js.Object {
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.native
  var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
  var name: js.UndefOr[NamePath] = js.native
  var normalize: js.UndefOr[
    js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
  ] = js.native
  var onReset: js.UndefOr[js.Function0[Unit]] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  var shouldUpdate: js.UndefOr[ShouldUpdate] = js.native
  var trigger: js.UndefOr[String] = js.native
  var validateFirst: js.UndefOr[Boolean] = js.native
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
  var valuePropName: js.UndefOr[String] = js.native
}

object RcFieldProps {
  @scala.inline
  def apply(): RcFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RcFieldProps]
  }
  @scala.inline
  implicit class RcFieldPropsOps[Self <: RcFieldProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDependencies(value: js.Array[NamePath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDependencies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueFromEvent(value: /* args */ EventArgs => StoreValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueFromEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValueFromEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueFromEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: NamePath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[Rule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUpdateFunction3(value: (/* prevValues */ Store, /* nextValues */ Store, /* info */ Source) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShouldUpdate(value: ShouldUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withTrigger(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateTrigger(value: String | js.Array[String] | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateTrigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateTrigger")(js.undefined)
        ret
    }
    @scala.inline
    def withValuePropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePropName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuePropName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuePropName")(js.undefined)
        ret
    }
  }
  
}

