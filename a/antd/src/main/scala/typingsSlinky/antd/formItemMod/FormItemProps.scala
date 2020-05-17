package typingsSlinky.antd.formItemMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antd.antdBooleans.`false`
import typingsSlinky.antd.gridColMod.ColProps
import typingsSlinky.antd.interfaceMod.FormLabelAlign
import typingsSlinky.rcFieldForm.anon.Source
import typingsSlinky.rcFieldForm.fieldMod.ShouldUpdate
import typingsSlinky.rcFieldForm.interfaceMod.EventArgs
import typingsSlinky.rcFieldForm.interfaceMod.NamePath
import typingsSlinky.rcFieldForm.interfaceMod.Rule
import typingsSlinky.rcFieldForm.interfaceMod.Store
import typingsSlinky.rcFieldForm.interfaceMod.StoreValue
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent antd.antd/lib/form/FormItemLabel.FormItemLabelProps */
/* Inlined parent antd.antd/lib/form/FormItemInput.FormItemInputProps */
/* Inlined parent std.Omit<antd.antd/lib/form/FormItem.RcFieldProps, 'children'> */
@js.native
trait FormItemProps extends js.Object {
  var children: ChildrenType = js.native
  var className: js.UndefOr[String] = js.native
  var colon: js.UndefOr[Boolean] = js.native
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.native
  var extra: js.UndefOr[TagMod[Any]] = js.native
  /** Auto passed by List render props. User should not use this. */
  var fieldKey: js.UndefOr[Double] = js.native
  var getValueFromEvent: js.UndefOr[js.Function1[/* args */ EventArgs, StoreValue]] = js.native
  var hasFeedback: js.UndefOr[Boolean] = js.native
  var help: js.UndefOr[TagMod[Any]] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[TagMod[Any]] = js.native
  var labelAlign: js.UndefOr[FormLabelAlign] = js.native
  var labelCol: js.UndefOr[ColProps] = js.native
  var name: js.UndefOr[NamePath] = js.native
  var noStyle: js.UndefOr[Boolean] = js.native
  var normalize: js.UndefOr[
    js.Function3[/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store, StoreValue]
  ] = js.native
  var onReset: js.UndefOr[js.Function0[Unit]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var rules: js.UndefOr[js.Array[Rule]] = js.native
  var shouldUpdate: js.UndefOr[ShouldUpdate] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var trigger: js.UndefOr[String] = js.native
  var validateFirst: js.UndefOr[Boolean] = js.native
  var validateStatus: js.UndefOr[ValidateStatus] = js.native
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.native
  var valuePropName: js.UndefOr[String] = js.native
  var wrapperCol: js.UndefOr[ColProps] = js.native
}

object FormItemProps {
  @scala.inline
  def apply(): FormItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemProps]
  }
  @scala.inline
  implicit class FormItemPropsOps[Self <: FormItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormInstance */ /* form */ js.Any => TagMod[Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: ChildrenType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(null)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colon")(js.undefined)
        ret
    }
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
    def withExtraReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtra(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtra: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extra")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldKey")(js.undefined)
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
    def withHasFeedback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeedback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFeedback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFeedback")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlFor")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAlign(value: FormLabelAlign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelCol(value: ColProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelCol")(js.undefined)
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
    def withNoStyle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noStyle")(js.undefined)
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
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
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
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
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
    def withValidateStatus(value: ValidateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateStatus")(js.undefined)
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
    @scala.inline
    def withWrapperCol(value: ColProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperCol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperCol")(js.undefined)
        ret
    }
  }
  
}

