package typingsSlinky.antDesignCompatible.formFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldDecoratorOptions extends js.Object {
  /** 是否和其他控件互斥，特别用于 Radio 单选控件 */
  var exclusive: js.UndefOr[Boolean] = js.native
  /** 可以把 onChange 的参数转化为控件的值，例如 DatePicker 可设为：(date, dateString) => dateString */
  var getValueFromEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  /** Get the component props according to field value. */
  var getValueProps: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  /** 子节点的初始值，类型、可选值均由子节点决定 */
  var initialValue: js.UndefOr[js.Any] = js.native
  /** Normalize value to form component */
  var normalize: js.UndefOr[
    js.Function3[/* value */ js.Any, /* prevValue */ js.Any, /* allValues */ js.Any, _]
  ] = js.native
  /** 是否一直保留子节点的信息 */
  var preserve: js.UndefOr[Boolean] = js.native
  /** 校验规则，参见 [async-validator](https://github.com/yiminghe/async-validator) */
  var rules: js.UndefOr[js.Array[ValidationRule]] = js.native
  /** 收集子节点的值的时机 */
  var trigger: js.UndefOr[String] = js.native
  /** Whether stop validate on first rule of error for this field.  */
  var validateFirst: js.UndefOr[Boolean] = js.native
  /** 校验子节点值的时机 */
  var validateTrigger: js.UndefOr[String | js.Array[String]] = js.native
  /** 子节点的值的属性，如 Checkbox 的是 'checked' */
  var valuePropName: js.UndefOr[String] = js.native
}

object GetFieldDecoratorOptions {
  @scala.inline
  def apply(): GetFieldDecoratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldDecoratorOptions]
  }
  @scala.inline
  implicit class GetFieldDecoratorOptionsOps[Self <: GetFieldDecoratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValueFromEvent(value: /* repeated */ js.Any => _): Self = {
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
    def withGetValueProps(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetValueProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValueProps")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: (/* value */ js.Any, /* prevValue */ js.Any, /* allValues */ js.Any) => _): Self = {
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
    def withPreserve(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserve")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[ValidationRule]): Self = {
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
    def withValidateTrigger(value: String | js.Array[String]): Self = {
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

